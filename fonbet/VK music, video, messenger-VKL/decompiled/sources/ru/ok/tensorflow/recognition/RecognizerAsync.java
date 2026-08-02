package ru.ok.tensorflow.recognition;

import android.graphics.Matrix;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.opencv.core.Mat;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.classification.Classifier;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.recognition.RecognizerAsync;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.util.ImageUtils;

/* loaded from: classes9.dex */
public class RecognizerAsync implements Closeable, FrameConsumer {
    private Classifier classifier;
    private final Detector detector;
    private Matrix inverseTransform;
    private volatile Mat lastFrameMat;
    private final Smoother smoother;
    private final ExecutorService executor = Executors.newScheduledThreadPool(2);
    private volatile boolean isReady = true;
    private List<Recognition> recognitions = new ArrayList();
    private volatile List<Detection> detections = new ArrayList();

    public class Result {
        public final List<Detection> detections;
        public final Mat lastFrameMat;
        public final List<Recognition> recognitions;

        public Result(List<Recognition> list, List<Detection> list2, Mat mat) {
            this.recognitions = list;
            this.detections = list2;
            this.lastFrameMat = mat;
        }
    }

    public RecognizerAsync(Detector detector, Classifier classifier, Smoother smoother) {
        this.detector = detector;
        this.classifier = classifier;
        this.smoother = smoother;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateRecognition$0(FrameHolder frameHolder, boolean z, boolean z2, FrameHolder frameHolder2) {
        this.lastFrameMat = ImageUtils.bitmapToMat(frameHolder.getCPUFrame());
        if (z) {
            this.detections = this.detector.detectGPU(frameHolder, Boolean.TRUE);
        } else {
            this.detections = this.detector.detectCPU(frameHolder);
        }
        ArrayList arrayList = new ArrayList(this.detections.size());
        for (int i = 0; i < this.detections.size(); i++) {
            Detection detection = this.detections.get(i);
            arrayList.add(detection.updateAngleDegrees(detection.getRotationDegrees(6, false)));
        }
        List<Detection> smooth = this.smoother.smooth(transformDetections(arrayList, this.inverseTransform));
        if (z2) {
            this.recognitions = this.classifier.classifyGPU(frameHolder2, smooth, Boolean.TRUE);
        } else {
            this.recognitions = this.classifier.classifyCPU(frameHolder2, smooth);
        }
        this.isReady = true;
    }

    private List<Detection> transformDetections(List<Detection> list, Matrix matrix) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Detection> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().transform(matrix));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.executor.shutdown();
        try {
            this.executor.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
        }
    }

    public Result fetchResult() {
        if (!this.isReady) {
            throw new RuntimeException("Result is not ready");
        }
        this.isReady = false;
        return new Result(this.recognitions, this.detections, this.lastFrameMat);
    }

    public void initiateRecognition(final FrameHolder frameHolder, final FrameHolder frameHolder2) {
        this.isReady = false;
        if (frameHolder == null || frameHolder2 == null) {
            this.isReady = true;
            return;
        }
        final boolean z = this.detector.wantRunWithGPUPass() && frameHolder2.hasGPU();
        final boolean z2 = this.classifier.wantRunWithGPUPass() && frameHolder.hasGPU();
        if (z || z2) {
            if (z) {
                this.detector.copyInput(frameHolder2);
            }
            if (z2) {
                this.classifier.copyInput(frameHolder);
            }
            GlUtil.syncGL();
        }
        this.executor.execute(new Runnable() { // from class: xsna.aaf0
            @Override // java.lang.Runnable
            public final void run() {
                RecognizerAsync.this.lambda$initiateRecognition$0(frameHolder2, z, z2, frameHolder);
            }
        });
    }

    public boolean isReady() {
        return this.isReady;
    }

    public void setFilterAngle(boolean z) {
        this.smoother.setFilterAngle(z);
    }

    public void setInverseTransform(Matrix matrix) {
        this.inverseTransform = matrix;
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        this.detector.startInitGPU(glThreadWithSharedContext);
        this.classifier.startInitGPU(glThreadWithSharedContext);
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        int i = tFFrameType == TFFrameType.SMALL ? this.detector.wantRunWithGPUPass() ? 2 : 1 : 0;
        if (tFFrameType == TFFrameType.BIG) {
            return i | (this.classifier.wantRunWithGPUPass() ? 2 : 1);
        }
        return i;
    }
}

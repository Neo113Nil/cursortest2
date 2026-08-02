package ru.ok.face.pipeline_frugal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.vk.movika.sdk.base.ui.p0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.morphing.IFaceMorphingProcessor;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.ArraySmoother;
import ru.ok.tensorflow.smoothing.SmootherSimple;
import ru.ok.tensorflow.ssd.Util;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Functional;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Producer;
import ru.ok.wrapper.AsyncWrapper;
import xsna.et;
import xsna.phq;
import xsna.qa;
import xsna.qhq;
import xsna.rhq;
import xsna.thq;
import xsna.to;

/* loaded from: classes9.dex */
public class FaceMorphingPipeline implements Closeable, FrameConsumer {
    private ArraySmoother angleSmoother;
    protected SimpleGLProgram copyProgram;
    private final float cropSizeMult;
    private final int detectionRotationEndIdx;
    private final int detectionRotationStartIdx;
    private final Detector detector;
    private final AsyncWrapper<List<Detection>> detectorAsync;
    private Matrix inverseTransform;
    private final IFaceMorphingProcessor landmarkNet;
    private final float landmarkNetPresenceThreshold;
    private final int landmarkRotationEndIdx;
    private final float landmarkRotationOffset;
    private final int landmarkRotationStartIdx;
    private List<Detection> lastDetections = new ArrayList();
    private List<Detection> lastDetectionsPure = new ArrayList();
    private int maxDetections;
    private FrameBuffer prevBigBuffer;
    private Bitmap scaledBitmap;
    private Canvas scaledBitmapCanvas;
    private final float similarityThreshold;
    private final SmootherSimple smoother;
    private Matrix transform;

    public FaceMorphingPipeline(Detector detector, int i, int i2, IFaceMorphingProcessor iFaceMorphingProcessor, float f, float f2, SmootherSimple smootherSimple, ArraySmoother arraySmoother, int i3, int i4, int i5, int i6, float f3, float f4) {
        this.detector = detector;
        this.detectorAsync = new AsyncWrapper<>(i2, new ArrayList());
        this.landmarkNet = iFaceMorphingProcessor;
        this.similarityThreshold = f2;
        this.smoother = smootherSimple;
        this.angleSmoother = arraySmoother;
        this.detectionRotationStartIdx = i3;
        this.detectionRotationEndIdx = i4;
        this.landmarkRotationStartIdx = i5;
        this.landmarkRotationEndIdx = i6;
        this.landmarkRotationOffset = f3;
        this.landmarkNetPresenceThreshold = f;
        this.maxDetections = i;
        this.cropSizeMult = f4;
        this.scaledBitmap = Bitmap.createBitmap(detector.getInputWidth(), detector.getInputHeight(), Bitmap.Config.ARGB_8888);
        this.scaledBitmapCanvas = new Canvas(this.scaledBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$process$0(Detection detection) {
        Detection makeSquare = detection.makeSquare(false);
        Matrix matrix = this.inverseTransform;
        if (matrix != null) {
            makeSquare = makeSquare.transform(matrix);
        }
        return makeSquare.updateAngleDegrees(makeSquare.getRotationDegrees(this.detectionRotationStartIdx, this.detectionRotationEndIdx, 90.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$process$1(boolean z, FrameHolder frameHolder) {
        return Functional.map(z ? this.detector.detectGPU(frameHolder, Boolean.TRUE) : this.detector.detectCPU(frameHolder), new p0(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FaceMorphingFigure lambda$process$10(Detection detection, FaceMorphingFigure faceMorphingFigure) {
        return faceMorphingFigure.updateDetection(detection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$process$2(Detection detection, Detection detection2) {
        return (int) (-Math.signum(detection.score - detection2.score));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$process$4(Detection detection, Detection detection2) {
        return (int) Math.signum(detection.id - detection2.id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FaceMorphingFigure lambda$process$5(FrameHolder frameHolder, boolean z, Detection detection) {
        return this.landmarkNet.run(frameHolder, detection, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$process$7(FaceMorphingFigure faceMorphingFigure) {
        return Boolean.valueOf(faceMorphingFigure.score > this.landmarkNetPresenceThreshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Detection lambda$process$8(boolean z, FaceMorphingFigure faceMorphingFigure) {
        return Detection.fromLandmarks(faceMorphingFigure.mesh, this.cropSizeMult, z);
    }

    private void setTransform(Matrix matrix) {
        this.transform = matrix;
        Matrix matrix2 = new Matrix();
        this.inverseTransform = matrix2;
        this.transform.invert(matrix2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.detector.close();
        this.landmarkNet.close();
        SimpleGLProgram simpleGLProgram = this.copyProgram;
        if (simpleGLProgram != null) {
            simpleGLProgram.release();
        }
        FrameBuffer frameBuffer = this.prevBigBuffer;
        if (frameBuffer != null) {
            frameBuffer.release();
        }
    }

    public boolean isGpued() {
        return this.landmarkNet.isGPUInited();
    }

    public List<FaceMorphingFigure> process(FrameHolder frameHolder) {
        this.scaledBitmapCanvas.drawBitmap(frameHolder.getCPUFrame(), this.transform, null);
        return process(frameHolder, new FrameHolder(this.scaledBitmap), false);
    }

    public List<Detection> removeSimilarDetectionFor2Faces(List<Detection> list) {
        if (Util.embeddingSimilarity(list.get(0), list.get(1)) > this.similarityThreshold / 1.5d) {
            list.remove(1);
        }
        return list;
    }

    public void setInputSize(int i, int i2) {
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.detector.getInputWidth(), this.detector.getInputHeight(), false, true, true));
    }

    public void setMaxDetections(int i) {
        this.maxDetections = i;
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        this.detector.startInitGPU(glThreadWithSharedContext);
        this.landmarkNet.startInitGPU(glThreadWithSharedContext);
        this.copyProgram = new SimpleGLProgram();
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        return this.detector.useFrame(tFFrameType) | this.landmarkNet.useFrame(tFFrameType);
    }

    public List<FaceMorphingFigure> process(FrameHolder frameHolder, final FrameHolder frameHolder2, final boolean z) {
        if (!frameHolder.hasGPU()) {
            return new ArrayList();
        }
        if (frameHolder2 != null) {
            if (this.detectorAsync.isReady()) {
                final boolean z2 = this.detector.wantRunWithGPUPass() && frameHolder2.hasGPU();
                if (z2) {
                    this.detector.copyInput(frameHolder2);
                    GlUtil.syncGL();
                }
                this.detectorAsync.submitTask(new Producer() { // from class: xsna.ohq
                    @Override // ru.ok.tensorflow.util.Producer
                    public final Object apply() {
                        List lambda$process$1;
                        lambda$process$1 = FaceMorphingPipeline.this.lambda$process$1(z2, frameHolder2);
                        return lambda$process$1;
                    }
                });
            }
            List<Detection> fetchResult = this.detectorAsync.fetchResult();
            this.lastDetections.clear();
            List<Detection> removeSimilar = Util.removeSimilar(fetchResult, this.lastDetections, this.similarityThreshold);
            Collections.sort(removeSimilar, new phq(0));
            this.lastDetections.addAll(removeSimilar);
            List<Detection> list = this.lastDetections;
            List<Detection> subList = list.subList(0, Math.min(list.size(), this.maxDetections));
            this.lastDetections = subList;
            if (this.maxDetections == 2 && subList.size() == 2) {
                this.lastDetections = removeSimilarDetectionFor2Faces(this.lastDetections);
            }
        }
        if (this.prevBigBuffer == null) {
            this.prevBigBuffer = new FrameBuffer(frameHolder.getWidth(), frameHolder.getHeight());
            this.copyProgram.setTextureId(frameHolder.getGPUFrame());
            this.prevBigBuffer.render(this.copyProgram, new qhq());
            return new ArrayList();
        }
        List<Detection> nms = Util.nms(this.lastDetections, this.similarityThreshold, false);
        this.lastDetections = nms;
        Collections.sort(nms, new rhq(0));
        final FrameHolder frameHolder3 = new FrameHolder(this.prevBigBuffer.getTextureId(), this.prevBigBuffer.getWidth(), this.prevBigBuffer.getHeight());
        List map = Functional.map(this.lastDetections, new Function() { // from class: xsna.shq
            @Override // ru.ok.tensorflow.util.Function
            public final Object apply(Object obj) {
                FaceMorphingFigure lambda$process$5;
                lambda$process$5 = FaceMorphingPipeline.this.lambda$process$5(frameHolder3, z, (Detection) obj);
                return lambda$process$5;
            }
        });
        this.copyProgram.setTextureId(frameHolder.getGPUFrame());
        this.prevBigBuffer.render(this.copyProgram, new thq(0));
        List<FaceMorphingFigure> filter = Functional.filter(map, new qa(this, 20));
        List map2 = Functional.map(filter, new Function() { // from class: xsna.uhq
            @Override // ru.ok.tensorflow.util.Function
            public final Object apply(Object obj) {
                Detection lambda$process$8;
                lambda$process$8 = FaceMorphingPipeline.this.lambda$process$8(z, (FaceMorphingFigure) obj);
                return lambda$process$8;
            }
        });
        this.lastDetectionsPure.clear();
        this.lastDetectionsPure.addAll(map2);
        List<Detection> map3 = Functional.map(filter, new et(16));
        if (this.lastDetections.size() == filter.size()) {
            filter = Functional.map2(this.lastDetections, filter, new to(14));
        }
        this.lastDetections = map3;
        return filter;
    }
}

package ru.ok.face.pipeline;

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
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.mesh.FaceMeshRegressor;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.ImageUtils;

/* loaded from: classes9.dex */
public class FaceDetectorAsync implements Closeable {
    private final Detector detector;
    private List<FaceFigure> faceFigures;
    private FaceMeshRegressor faceMeshRegressor;
    private volatile Mat scaledMat;
    private final ExecutorService executor = Executors.newScheduledThreadPool(0);
    private volatile boolean isReady = true;
    private volatile List<Detection> detections = new ArrayList();

    public class FaceDetectionResult {
        public final List<Detection> detections;
        public final List<FaceFigure> faceFigures;
        public final Mat scaledMat;

        public FaceDetectionResult(List<Detection> list, List<FaceFigure> list2, Mat mat) {
            this.detections = list;
            this.faceFigures = list2;
            this.scaledMat = mat;
        }
    }

    public FaceDetectorAsync(Detector detector, FaceMeshRegressor faceMeshRegressor) {
        this.detector = detector;
        this.faceMeshRegressor = faceMeshRegressor;
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

    public FaceDetectionResult fetchResult() {
        if (!this.isReady) {
            throw new RuntimeException("PipelineResult is not ready");
        }
        this.isReady = false;
        return new FaceDetectionResult(this.detections, this.faceFigures, this.scaledMat);
    }

    public void initiate(FrameHolder frameHolder, FrameHolder frameHolder2, Matrix matrix) {
        this.isReady = false;
        this.scaledMat = ImageUtils.bitmapToMat(frameHolder2.getCPUFrame());
        this.detections = this.detector.detectCPU(frameHolder2);
        List<Detection> transformDetections = transformDetections(this.detections, matrix);
        FaceMeshRegressor faceMeshRegressor = this.faceMeshRegressor;
        if (faceMeshRegressor != null) {
            this.faceFigures = faceMeshRegressor.run(frameHolder, transformDetections, false);
        } else {
            this.faceFigures = new ArrayList();
            Iterator<Detection> it = this.detections.iterator();
            while (it.hasNext()) {
                this.faceFigures.add(new FaceFigure(it.next(), new float[0], -1.0f, new float[0], false));
            }
        }
        this.isReady = true;
    }

    public boolean isReady() {
        return this.isReady;
    }
}

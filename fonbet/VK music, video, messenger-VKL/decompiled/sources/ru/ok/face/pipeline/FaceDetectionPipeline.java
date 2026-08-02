package ru.ok.face.pipeline;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.opencv.core.Mat;
import ru.ok.face.entity.FaceFigure;
import ru.ok.face.mesh.FaceMeshRegressor;
import ru.ok.face.pipeline.FaceDetectorAsync;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Logger;

/* loaded from: classes9.dex */
public class FaceDetectionPipeline implements Closeable {
    private final Detector detector;
    private final FaceDetectorAsync detectorAsync;
    private List<FaceFigure> faceFigures = Collections.EMPTY_LIST;
    private final FaceMeshRegressor faceMeshRegressor;
    private Matrix inverseTransform;
    private final Logger logger;
    private Bitmap scaledBitmap;
    private Canvas scaledBitmapCanvas;
    private final Smoother smoother;
    protected final TrackerWrapper tracker;
    private Matrix transform;

    public FaceDetectionPipeline(Detector detector, FaceMeshRegressor faceMeshRegressor, TrackerWrapper trackerWrapper, Smoother smoother, @NonNull Logger logger) {
        this.logger = logger;
        this.detector = detector;
        this.tracker = trackerWrapper;
        this.smoother = smoother;
        this.faceMeshRegressor = faceMeshRegressor;
        this.detectorAsync = new FaceDetectorAsync(detector, faceMeshRegressor);
        this.scaledBitmap = Bitmap.createBitmap(detector.getInputWidth(), detector.getInputHeight(), Bitmap.Config.ARGB_8888);
        this.scaledBitmapCanvas = new Canvas(this.scaledBitmap);
    }

    private void setTransform(Matrix matrix) {
        this.transform = matrix;
        Matrix matrix2 = new Matrix();
        this.inverseTransform = matrix2;
        this.transform.invert(matrix2);
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
        this.detectorAsync.close();
        this.detector.close();
        this.faceMeshRegressor.close();
    }

    public List<FaceFigure> process(FrameHolder frameHolder) {
        this.scaledBitmapCanvas.drawBitmap(frameHolder.getCPUFrame(), this.transform, null);
        return process(frameHolder, new FrameHolder(this.scaledBitmap));
    }

    public void setInputSize(int i, int i2) {
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.detector.getInputWidth(), this.detector.getInputHeight(), false, true, true));
    }

    public List<FaceFigure> process(FrameHolder frameHolder, FrameHolder frameHolder2) {
        if (this.detectorAsync.isReady()) {
            FaceDetectorAsync.FaceDetectionResult fetchResult = this.detectorAsync.fetchResult();
            this.detectorAsync.initiate(frameHolder, frameHolder2, this.inverseTransform);
            TrackerWrapper trackerWrapper = this.tracker;
            Mat mat = fetchResult.scaledMat;
            if (mat == null) {
                mat = ImageUtils.bitmapToMat(frameHolder2.getCPUFrame());
            }
            trackerWrapper.intialize(mat, fetchResult.detections);
            this.faceFigures = fetchResult.faceFigures;
        }
        List<Detection> smooth = this.smoother.smooth(transformDetections(this.tracker.trackDetections(frameHolder2.getCPUFrame()), this.inverseTransform));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < smooth.size(); i++) {
            arrayList.add(this.faceFigures.get(i).updateDetection(smooth.get(i)));
        }
        return arrayList;
    }
}

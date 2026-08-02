package ru.ok.tensorflow.tracking;

import android.graphics.Bitmap;
import android.util.Pair;
import org.opencv.core.Mat;
import org.opencv.tracking.Tracker;
import org.opencv.tracking.TrackerMedianFlow;
import ru.ok.native_loader_bridge.NativeLibLoaderBridge;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.execution.SingleExecutor;
import ru.ok.tensorflow.util.ImageUtils;
import xsna.yhf0;

/* loaded from: classes9.dex */
public class TrackerSingle implements SingleExecutor<Mat, Detection> {
    private float boxScaleFactor;
    private Detection detection;
    private float maxPositionChange;
    private float maxScaleChange;
    private Mat frameMat = new Mat();
    private Tracker tracker = TrackerMedianFlow.c();

    static {
        NativeLibLoaderBridge.loadLibrary("opencv_java4");
    }

    public TrackerSingle(float f, float f2, float f3, Mat mat, Detection detection) {
        this.boxScaleFactor = f;
        this.maxScaleChange = f2;
        this.maxPositionChange = f3;
        this.detection = detection;
        yhf0 yhf0Var = new yhf0(detection.getX1(), detection.getY1(), detection.getX2() - detection.getX1(), detection.getY2() - detection.getY1());
        scaleRect(yhf0Var, f);
        this.tracker.a(mat, yhf0Var);
    }

    private boolean adjustTrackedRectPosition(yhf0 yhf0Var, Detection detection, float f) {
        float x1 = (detection.getX1() + detection.getX2()) / 2.0f;
        float y1 = (detection.getY1() + detection.getY2()) / 2.0f;
        double d = x1;
        double d2 = ((yhf0Var.c / 2.0d) + yhf0Var.a) - d;
        double d3 = y1;
        double d4 = ((yhf0Var.d / 2.0d) + yhf0Var.b) - d3;
        if (Math.sqrt((d4 * d4) + (d2 * d2)) / (detection.getX2() - detection.getX1()) <= f) {
            return true;
        }
        yhf0Var.a = d - (yhf0Var.c / 2.0d);
        yhf0Var.b = d3 - (yhf0Var.d / 2.0d);
        return false;
    }

    private boolean adjustTrackedRectScale(yhf0 yhf0Var, Detection detection, float f) {
        float x2 = ((float) yhf0Var.c) / (detection.getX2() - detection.getX1());
        float f2 = 1.0f / x2;
        if (f2 >= f || f >= x2) {
            return true;
        }
        scaleRect(yhf0Var, f2);
        return false;
    }

    private void scaleRect(yhf0 yhf0Var, float f) {
        double d = yhf0Var.a;
        double d2 = yhf0Var.c;
        double d3 = (d2 / 2.0d) + d;
        double d4 = yhf0Var.b;
        double d5 = yhf0Var.d;
        double d6 = (d5 / 2.0d) + d4;
        double d7 = f;
        double d8 = d2 * d7;
        double d9 = d5 * d7;
        yhf0Var.a = d3 - (d8 / 2.0d);
        yhf0Var.b = d6 - (d9 / 2.0d);
        yhf0Var.c = d8;
        yhf0Var.d = d9;
    }

    public Pair<Boolean, Detection> execute(Bitmap bitmap) {
        Mat bitmapToMat = ImageUtils.bitmapToMat(bitmap, this.frameMat);
        this.frameMat = bitmapToMat;
        return execute(bitmapToMat);
    }

    @Override // ru.ok.tensorflow.execution.SingleExecutor
    public Pair<Boolean, Detection> execute(Mat mat) {
        yhf0 yhf0Var = new yhf0();
        boolean b = this.tracker.b(mat, yhf0Var);
        scaleRect(yhf0Var, 1.0f / this.boxScaleFactor);
        adjustTrackedRectScale(yhf0Var, this.detection, this.maxScaleChange);
        adjustTrackedRectPosition(yhf0Var, this.detection, this.maxPositionChange);
        return new Pair<>(Boolean.valueOf(b), this.detection.updatePosition(yhf0Var));
    }
}

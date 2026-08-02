package ru.ok.tensorflow.util;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.g4h0;

/* loaded from: classes9.dex */
public class MatUtils {
    public static Mat eulerAngles2rotationMat(float[] fArr) {
        Mat mat = new Mat(3, 3, 6);
        mat.q(0, 0, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.cos(fArr[0]), -Math.sin(fArr[0]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.sin(fArr[0]), Math.cos(fArr[0]));
        Mat mat2 = new Mat(3, 3, 6);
        mat2.q(0, 0, Math.cos(fArr[1]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.sin(fArr[1]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, -Math.sin(fArr[1]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.cos(fArr[1]));
        Mat mat3 = new Mat(3, 3, 6);
        mat3.q(0, 0, Math.cos(fArr[2]), -Math.sin(fArr[2]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.sin(fArr[2]), Math.cos(fArr[2]), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        return multiplyMatrices(mat3, multiplyMatrices(mat2, mat));
    }

    public static Pair<Mat, Mat> homography2projection(Mat mat) {
        Mat clone = mat.clone();
        double d = -Math.sqrt(Core.g(clone.c(1)) * Core.g(clone.c(0)));
        g4h0 g4h0Var = new g4h0();
        g4h0Var.a = new double[]{d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE};
        Core.b(clone, g4h0Var, clone);
        Mat c = clone.c(0);
        Mat c2 = clone.c(1);
        Mat g = c.g(c2);
        Mat c3 = clone.c(2);
        Mat mat2 = new Mat();
        Core.e(Arrays.asList(c, c2, g), mat2);
        return new Pair<>(makeOrthogonal(mat2), c3);
    }

    public static Mat makeOrthogonal(Mat mat) {
        Mat mat2 = new Mat();
        Mat mat3 = new Mat();
        Mat mat4 = new Mat();
        Core.a(mat, mat2, mat3, mat4);
        return multiplyMatrices(mat3, mat4);
    }

    public static float matGet(Mat mat, int i, int i2) {
        return (float) mat.n(i, i2)[0];
    }

    public static Mat multiplyMatrices(Mat mat, Mat mat2) {
        Mat mat3 = new Mat();
        Core.d(mat, mat2, new Mat(), mat3);
        return mat3;
    }

    public static float[] rotationMat2eulerAngles(Mat mat) {
        double sqrt = (float) Math.sqrt((matGet(mat, 1, 0) * matGet(mat, 1, 0)) + (matGet(mat, 0, 0) * matGet(mat, 0, 0)));
        return sqrt < 1.0E-6d ? new float[]{(float) Math.atan2(-matGet(mat, 1, 2), matGet(mat, 1, 1)), (float) Math.atan2(-matGet(mat, 2, 0), sqrt), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{(float) Math.atan2(matGet(mat, 2, 1), matGet(mat, 2, 2)), (float) Math.atan2(-matGet(mat, 2, 0), sqrt), (float) Math.atan2(matGet(mat, 1, 0), matGet(mat, 0, 0))};
    }
}

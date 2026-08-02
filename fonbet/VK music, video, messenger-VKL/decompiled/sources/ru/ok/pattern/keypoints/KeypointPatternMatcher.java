package ru.ok.pattern.keypoints;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.opencv.android.Utils;
import org.opencv.calib3d.Calib3d;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FastFeatureDetector;
import org.opencv.features2d.Feature2D;
import org.opencv.imgproc.Imgproc;
import org.opencv.xfeatures2d.FREAK;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Functional;
import ru.ok.tensorflow.util.ImageUtils;
import xsna.hlb0;
import xsna.lp0;
import xsna.pk10;
import xsna.rk10;
import xsna.rx0;
import xsna.sk10;
import xsna.xdy;
import xsna.xhy;
import xsna.yrk;

/* loaded from: classes9.dex */
public class KeypointPatternMatcher implements Closeable {
    private int cropHeight;
    private int cropWidth;
    private Mat img1;
    private final Pair<rk10, Mat> kPairPattern_mirrored;
    private final Pair<rk10, Mat> kPairPattern_normal;
    private boolean recognizeMirrored;
    private float KNN_FILTERING_MAX_RATIO = 0.85f;
    private float MATCH_MAX_DISTANCE = 70.0f;
    private int KEYPOINT_MIN_MATCHES = 15;
    private double RANSOC_REPROJ_THRESHOLD = 5.0d;
    private int PATTERN_GRID_SIZE = 20;
    private int PATTERN_MAX_KEYPOINTS_PER_CELL = 10;
    private int PATTERN_MAX_KEYPOINTS = 300;
    private int CROP_GRID_SIZE = 20;
    private int CROP_MAX_KEYPOINTS_PER_CELL = 2;
    private int CROP_MAX_KEYPOINTS = 400;
    private final Feature2D detector = FastFeatureDetector.c();
    private final Feature2D descriptor = FREAK.c();
    private final DescriptorMatcher matcher = DescriptorMatcher.a();

    public KeypointPatternMatcher(Bitmap bitmap, int i, int i2, float f, boolean z) {
        this.cropWidth = i;
        this.cropHeight = i2;
        this.recognizeMirrored = z;
        Mat mat = new Mat();
        this.img1 = mat;
        Utils.a(bitmap, mat, false);
        Mat resizeToMaxSide = ImageUtils.resizeToMaxSide(this.img1, (int) (i2 * f));
        this.img1 = resizeToMaxSide;
        Imgproc.a(resizeToMaxSide, resizeToMaxSide);
        Mat mat2 = this.img1;
        mat2.e(mat2);
        this.kPairPattern_normal = computeKeypointsPattern(this.img1);
        Mat mat3 = this.img1;
        Core.c(mat3, mat3);
        this.kPairPattern_mirrored = computeKeypointsPattern(this.img1);
    }

    private Pair<rk10, Mat> computeKeypoints(Bitmap bitmap, int i, int i2, int i3) {
        Mat mat = new Mat();
        Utils.a(bitmap, mat, false);
        Imgproc.a(mat, mat);
        return computeKeypoints(mat, i, i2, i3);
    }

    private Pair<rk10, Mat> computeKeypointsCrop(Bitmap bitmap) {
        return computeKeypoints(bitmap, this.CROP_GRID_SIZE, this.CROP_MAX_KEYPOINTS_PER_CELL, this.CROP_MAX_KEYPOINTS);
    }

    private Pair<rk10, Mat> computeKeypointsPattern(Mat mat) {
        return computeKeypoints(mat, this.PATTERN_GRID_SIZE, this.PATTERN_MAX_KEYPOINTS_PER_CELL, this.PATTERN_MAX_KEYPOINTS);
    }

    private void detectKeypoints(Mat mat, rk10 rk10Var) {
        this.detector.b(mat, rk10Var);
    }

    private Matrix findHomography(rk10 rk10Var, rk10 rk10Var2, Mat mat, List<yrk> list) {
        List<xdy> A = rk10Var.A();
        List<xdy> A2 = rk10Var2.A();
        List map = Functional.map(list, new lp0(A, 24));
        List<hlb0> map2 = Functional.map(list, new rx0(A2, 29));
        List<hlb0> map3 = Functional.map(map, new xhy(this, mat));
        sk10 sk10Var = new sk10();
        sk10Var.A(map3);
        sk10 sk10Var2 = new sk10();
        sk10Var2.A(map2);
        Mat b = Calib3d.b(sk10Var, sk10Var2, this.RANSOC_REPROJ_THRESHOLD);
        if (b.h()) {
            return null;
        }
        Matrix mat2Matrix = ImageUtils.mat2Matrix(b);
        mat2Matrix.preTranslate((-mat.z()) / 2.0f, (-mat.o()) / 2.0f);
        if (mat2Matrix.invert(new Matrix())) {
            return mat2Matrix;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hlb0 lambda$findHomography$0(List list, yrk yrkVar) {
        return ((xdy) list.get(yrkVar.a)).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ hlb0 lambda$findHomography$1(List list, yrk yrkVar) {
        return ((xdy) list.get(yrkVar.b)).a;
    }

    private Pair<Matrix, Integer> matchKeypoints(Pair<rk10, Mat> pair, Mat mat, Pair<rk10, Mat> pair2) {
        rk10 rk10Var = (rk10) pair.first;
        Mat mat2 = (Mat) pair.second;
        rk10 rk10Var2 = (rk10) pair2.first;
        Mat mat3 = (Mat) pair2.second;
        if (rk10Var2.v() < this.KEYPOINT_MIN_MATCHES) {
            return new Pair<>(null, 0);
        }
        ArrayList arrayList = new ArrayList();
        this.matcher.b(mat2, mat3, arrayList);
        if (arrayList.size() < this.KEYPOINT_MIN_MATCHES) {
            return new Pair<>(null, 0);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pk10 pk10Var = (pk10) it.next();
            int x = (int) pk10Var.x();
            yrk[] yrkVarArr = new yrk[x];
            if (x != 0) {
                float[] fArr = new float[x * 4];
                pk10Var.l(fArr);
                for (int i = 0; i < x; i++) {
                    int i2 = i * 4;
                    int i3 = (int) fArr[i2];
                    int i4 = (int) fArr[i2 + 1];
                    int i5 = (int) fArr[i2 + 2];
                    float f = fArr[i2 + 3];
                    yrk yrkVar = new yrk();
                    yrkVar.a = i3;
                    yrkVar.b = i4;
                    yrkVar.c = i5;
                    yrkVar.d = f;
                    yrkVarArr[i] = yrkVar;
                }
            }
            List asList = Arrays.asList(yrkVarArr);
            if (asList.size() > 1 && ((yrk) asList.get(0)).d <= this.MATCH_MAX_DISTANCE && ((yrk) asList.get(0)).d < ((yrk) asList.get(1)).d * this.KNN_FILTERING_MAX_RATIO) {
                arrayList2.add((yrk) asList.get(0));
            }
        }
        return arrayList2.size() < this.KEYPOINT_MIN_MATCHES ? new Pair<>(null, Integer.valueOf(arrayList2.size())) : new Pair<>(findHomography(rk10Var, rk10Var2, mat, arrayList2), Integer.valueOf(arrayList2.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: normalizePoint, reason: merged with bridge method [inline-methods] */
    public hlb0 lambda$findHomography$2(hlb0 hlb0Var, Mat mat) {
        return new hlb0(hlb0Var.a - (mat.z() / 2.0d), hlb0Var.b - (mat.o() / 2.0d));
    }

    private void reduceKeypoints(rk10 rk10Var, Mat mat, int i, int i2, int i3) {
        new GridReducer(i, i).reduce(rk10Var, mat.z(), mat.o(), i2, i3);
    }

    public PatternMatchRaw run(Bitmap bitmap, Detection detection, boolean z) {
        Pair<rk10, Mat> pair;
        Detection detection2;
        Matrix transformation = detection.getTransformation(this.cropWidth, this.cropHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, true);
        Pair<rk10, Mat> computeKeypointsCrop = computeKeypointsCrop(detection.extractCrop(bitmap, this.cropWidth, this.cropHeight, transformation));
        Pair<Matrix, Integer> matchKeypoints = matchKeypoints(this.kPairPattern_normal, this.img1, computeKeypointsCrop);
        if (this.recognizeMirrored) {
            Pair<Matrix, Integer> matchKeypoints2 = matchKeypoints(this.kPairPattern_mirrored, this.img1, computeKeypointsCrop);
            if (((Integer) matchKeypoints.second).intValue() >= ((Integer) matchKeypoints2.second).intValue()) {
                pair = this.kPairPattern_normal;
            } else {
                matchKeypoints = matchKeypoints2;
                pair = this.kPairPattern_mirrored;
            }
        } else {
            pair = this.kPairPattern_normal;
        }
        Matrix matrix = (Matrix) matchKeypoints.first;
        int intValue = ((Integer) matchKeypoints.second).intValue();
        if (matrix != null) {
            Matrix matrix2 = new Matrix();
            matrix.invert(matrix2);
            transformation.postConcat(matrix2);
            Pair<Matrix, Integer> matchKeypoints3 = matchKeypoints(pair, this.img1, computeKeypointsCrop(detection.extractCrop(bitmap, this.img1.z(), this.img1.o(), transformation)));
            matrix = (Matrix) matchKeypoints3.first;
            intValue = ((Integer) matchKeypoints3.second).intValue();
        }
        if (matrix != null) {
            Matrix matrix3 = new Matrix();
            transformation.invert(matrix3);
            matrix.postConcat(matrix3);
            matrix.preTranslate(this.img1.z() / 2.0f, this.img1.o() / 2.0f);
            matrix.preScale(this.img1.z() / 2.0f, this.img1.z() / 2.0f);
            float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
            matrix.mapPoints(fArr);
            detection2 = Detection.fromAlignmentPoints(new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]));
        } else {
            detection2 = null;
        }
        return new PatternMatchRaw(detection, detection2, matrix, intValue);
    }

    private Pair<rk10, Mat> computeKeypoints(Mat mat, int i, int i2, int i3) {
        Mat mat2 = new Mat();
        rk10 rk10Var = new rk10();
        detectKeypoints(mat, rk10Var);
        reduceKeypoints(rk10Var, mat, i, i2, i3);
        this.descriptor.a(mat, rk10Var, mat2);
        return new Pair<>(rk10Var, mat2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}

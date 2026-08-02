package ru.ok.tensorflow.entity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.UUID;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLProgram;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.util.Trigonometry;
import xsna.f5m;
import xsna.yhf0;

/* loaded from: classes9.dex */
public class Detection {
    public static final int IDX_INDEX_FINGER = 5;
    public static final int IDX_INDEX_FINGER_ENDPOINT = 11;
    public static final int IDX_MIDDLE_FINGER = 6;
    public static final int IDX_PALM_BASE = 4;
    public static final int IDX_RING_FINGER = 7;
    public final Float angleDegrees;
    public final String detectionClass;
    public final long id;
    public final boolean is3DLocation;
    public final float[] location;
    public final float score;
    public float speed;

    public Detection(float f, float[] fArr, long j, Float f2, String str, boolean z) {
        this(f, fArr, j, f2, str, z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static Detection createWithRandomId(float f, float[] fArr, String str, boolean z) {
        return new Detection(f, fArr, UUID.randomUUID().getMostSignificantBits(), Float.valueOf(90.0f), str, z);
    }

    public static Detection fromAlignmentPoints(PointF pointF, PointF pointF2) {
        float l2 = Trigonometry.l2(pointF, pointF2);
        float f = pointF.x;
        float f2 = f - l2;
        float f3 = pointF.y;
        float f4 = f3 - l2;
        float f5 = f + l2;
        float f6 = f3 + l2;
        return createWithRandomId(-1.0f, new float[]{f2, f4, f5, f6, f5, f4, f2, f6}, null, false).updateAngleDegrees(360.0f - Trigonometry.getRotationDegrees(pointF2.x - pointF.x, pointF2.y - pointF.y));
    }

    public static Detection fromLandmarks(float[] fArr, float f, boolean z) {
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.NEGATIVE_INFINITY;
        int i = 0;
        float f5 = Float.POSITIVE_INFINITY;
        while (true) {
            int i2 = 2;
            if (i >= fArr.length) {
                break;
            }
            float f6 = fArr[i];
            float f7 = fArr[i + 1];
            if (f6 < f2) {
                f2 = f6;
            }
            if (f6 > f3) {
                f3 = f6;
            }
            if (f7 < f5) {
                f5 = f7;
            }
            if (f7 > f4) {
                f4 = f7;
            }
            if (z) {
                i2 = 3;
            }
            i += i2;
        }
        float f8 = f3 - f2;
        float f9 = f4 - f5;
        float f10 = (f8 / 2.0f) + f2;
        float f11 = (f9 / 2.0f) + f5;
        float max = (Math.max(f8, f9) / 2.0f) * f;
        float f12 = f10 - max;
        float f13 = f10 + max;
        float f14 = f11 - max;
        float f15 = f11 + max;
        float[] fArr2 = {f12, f14, f13, f15, f13, f14, f12, f15};
        float[] fArr3 = {f12, f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13, f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        if (z) {
            fArr2 = fArr3;
        }
        return createWithRandomId(-1.0f, fArr2, null, z);
    }

    public Detection addLocations(float[] fArr) {
        float[] fArr2 = this.location;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length + fArr.length);
        System.arraycopy(fArr, 0, copyOf, this.location.length, fArr.length);
        return new Detection(this.score, copyOf, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection copy() {
        return new Detection(this.score, (float[]) this.location.clone(), this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Bitmap extractCrop(Bitmap bitmap, int i, int i2, float f, float f2, boolean z) {
        return extractCrop(bitmap, i, i2, getTransformation(i, i2, f, f2, z));
    }

    public void extractCropGPU(FrameHolder frameHolder, int i, int i2, float f, float f2, boolean z, FrameBuffer frameBuffer, @Nullable GLProgram gLProgram) {
        extractCropGPU(frameHolder, i, i2, getTransformation(i, i2, f, f2, z), frameBuffer, gLProgram);
    }

    public float[] extractKeypoints(int i) {
        return Arrays.copyOfRange(this.location, getDimensions() * i, this.location.length);
    }

    public void fillRect(@NonNull RectF rectF) {
        rectF.set(getX1(), getY1(), getX2(), getY2());
    }

    public float getArea() {
        return getHeight() * getWidth();
    }

    public float[] getCenter() {
        return new float[]{(getX2() + getX1()) / 2.0f, (getY2() + getY1()) / 2.0f};
    }

    public PointF getCenterPoint() {
        return new PointF((getX2() + getX1()) / 2.0f, (getY2() + getY1()) / 2.0f);
    }

    public int getDimensions() {
        return this.is3DLocation ? 3 : 2;
    }

    public float getHeight() {
        return Math.abs(getY2() - getY1());
    }

    public PointF getKeypoint(int i) {
        return new PointF(this.location[getDimensions() * i], this.location[(getDimensions() * i) + 1]);
    }

    public float getKeypointForDimention(int i, int i2) {
        return this.location[(getDimensions() * i) + i2];
    }

    public int getNumKeypoints() {
        return this.location.length / getDimensions();
    }

    public RectF getRect() {
        return new RectF(getX1(), getY1(), getX2(), getY2());
    }

    public float getRotationDegrees(int i, int i2, float f) {
        PointF keypoint = getKeypoint(i);
        PointF keypoint2 = getKeypoint(i2);
        return Trigonometry.make0to360(Trigonometry.getRotationDegrees(keypoint2.x - keypoint.x, -(keypoint2.y - keypoint.y)) + f);
    }

    public float getSize() {
        return getWidth();
    }

    public Matrix getTransformation(int i, int i2, float f, float f2, boolean z) {
        Matrix matrix = new Matrix();
        float f3 = i;
        float f4 = i2;
        matrix.setPolyToPoly(new float[]{getX1(), getY1(), getX2(), getY2(), getX3(), getY3(), getX4(), getY4()}, 0, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f4, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4}, 0, 4);
        if (z) {
            Float f5 = this.angleDegrees;
            if (f5 == null) {
                throw new IllegalStateException("angleDegrees is NULL");
            }
            matrix.postRotate(f5.floatValue() - 90.0f, f3 / 2.0f, f4 / 2.0f);
        }
        matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 * f);
        matrix.postScale(f2, f2, f3 / 2.0f, f4 / 2.0f);
        return matrix;
    }

    public float getWidth() {
        return Math.abs(getX2() - getX1());
    }

    public float getX1() {
        float[] fArr = this.location;
        getDimensions();
        return fArr[0];
    }

    public float getX2() {
        return this.location[getDimensions()];
    }

    public float getX3() {
        return this.location[getDimensions() * 2];
    }

    public float getX4() {
        return this.location[getDimensions() * 3];
    }

    public float getY1() {
        float[] fArr = this.location;
        getDimensions();
        return fArr[1];
    }

    public float getY2() {
        return this.location[getDimensions() + 1];
    }

    public float getY3() {
        return this.location[(getDimensions() * 2) + 1];
    }

    public float getY4() {
        return this.location[(getDimensions() * 3) + 1];
    }

    public Detection makeSquare(boolean z) {
        PointF centerPoint = getCenterPoint();
        float max = (z ? Math.max(getHeight(), getWidth()) : Math.min(getHeight(), getWidth())) / 2.0f;
        float f = centerPoint.x;
        float f2 = centerPoint.y;
        return updatePosition(f - max, f2 - max, f + max, f2 + max);
    }

    public Detection removeKeypoints(int i) {
        return new Detection(this.score, Arrays.copyOf(this.location, getDimensions() * i), this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection transform(Matrix matrix) {
        float[] fArr = (float[]) this.location.clone();
        matrix.mapPoints(fArr);
        return new Detection(this.score, fArr, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection transformBox(Matrix matrix) {
        float[] copyOfRange = Arrays.copyOfRange(this.location, 0, 8);
        matrix.mapPoints(copyOfRange);
        float[] fArr = (float[]) this.location.clone();
        System.arraycopy(copyOfRange, 0, fArr, 0, copyOfRange.length);
        return new Detection(this.score, fArr, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updateAngleDegrees(float f) {
        return new Detection(this.score, this.location, this.id, Float.valueOf(f), this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updateId(long j) {
        return new Detection(this.score, this.location, j, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updateLocation(float[] fArr) {
        return new Detection(this.score, fArr, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updatePoint(int i, PointF pointF) {
        float[] fArr = (float[]) this.location.clone();
        fArr[getDimensions() * i] = pointF.x;
        fArr[(getDimensions() * i) + 1] = pointF.y;
        return new Detection(this.score, fArr, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updatePosition(float f, float f2, float f3, float f4, PointF[] pointFArr, int i, float f5) {
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(new float[]{getX1(), getY1(), getX2(), getY2(), getX3(), getY3(), getX4(), getY4()}, 0, new float[]{f, f2, f3, f4, f3, f2, f, f4}, 0, 4);
        float[] fArr = (float[]) this.location.clone();
        matrix.mapPoints(fArr);
        for (int i2 = 0; i2 < pointFArr.length; i2++) {
            PointF pointF = pointFArr[i2];
            int i3 = i + i2;
            fArr[getDimensions() * i3] = pointF.x;
            fArr[(getDimensions() * i3) + 1] = pointF.y;
        }
        return new Detection(this.score, fArr, this.id, Float.valueOf(f5), this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updateScore(float f) {
        return new Detection(f, this.location, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }

    public Detection updateSpeed(float f) {
        return new Detection(this.score, this.location, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, f);
    }

    public Detection(float f, float[] fArr, long j, Float f2, String str, boolean z, float f3) {
        this.score = f;
        this.location = fArr;
        this.id = j;
        this.angleDegrees = f2;
        this.detectionClass = str;
        this.is3DLocation = z;
        this.speed = f3;
    }

    public Bitmap extractCrop(Bitmap bitmap, int i, int i2, Matrix matrix) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, matrix, null);
        }
        return createBitmap;
    }

    public void extractCropGPU(FrameHolder frameHolder, int i, int i2, Matrix matrix, FrameBuffer frameBuffer, @Nullable GLProgram gLProgram) {
        GLProgram simpleGLProgram = gLProgram == null ? new SimpleGLProgram() : gLProgram;
        simpleGLProgram.setTextureId(frameHolder.getGPUFrame());
        float f = i;
        float width = frameHolder.getWidth() / f;
        float f2 = i2;
        float height = frameHolder.getHeight() / f2;
        Matrix matrix2 = new Matrix(matrix);
        float f3 = i / 2;
        float f4 = i2 / 2;
        matrix2.preTranslate(f3, f4);
        matrix2.preScale(f3, f4);
        matrix2.preTranslate(width - 1.0f, height - 1.0f);
        matrix2.preScale(width, height);
        matrix2.postTranslate((-i) / 2, (-i2) / 2);
        matrix2.postScale(2.0f / f, 2.0f / f2);
        simpleGLProgram.setMVPMat(GlUtil.getOpenGLMatrix(matrix2));
        frameBuffer.render(simpleGLProgram, new f5m(0));
        if (gLProgram == null) {
            simpleGLProgram.release();
        }
    }

    public float getRotationDegrees(int i, boolean z) {
        return getRotationDegrees(i, this.location, z);
    }

    public static float getRotationDegrees(int i, float[] fArr, boolean z) {
        int i2 = z ? 3 : 2;
        int i3 = i * i2;
        int i4 = i2 * 4;
        return Trigonometry.getRotationDegrees(fArr[i3] - fArr[i4], -(fArr[i3 + 1] - fArr[i4 + 1]));
    }

    public Detection updatePosition(float f, float f2, float f3, float f4, PointF[] pointFArr, float[] fArr, int i, float f5) {
        Detection updatePosition = updatePosition(f, f2, f3, f4, pointFArr, i, f5);
        for (int i2 = 0; i2 < fArr.length; i2++) {
            updatePosition.location[(getDimensions() * (i + i2)) + 2] = fArr[i2];
        }
        return updatePosition;
    }

    public Detection updatePosition(yhf0 yhf0Var) {
        double d = yhf0Var.a;
        double d2 = yhf0Var.b;
        return updatePosition((float) d, (float) d2, (float) (d + yhf0Var.c), (float) (d2 + yhf0Var.d));
    }

    public Detection updatePosition(float f, float f2, float f3, float f4) {
        float[] fArr = (float[]) this.location.clone();
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(new float[]{getX1(), getY1(), getX2(), getY2(), getX3(), getY3(), getX4(), getY4()}, 0, new float[]{f, f2, f3, f4, f3, f2, f, f4}, 0, 4);
        matrix.mapPoints(fArr);
        return new Detection(this.score, fArr, this.id, this.angleDegrees, this.detectionClass, this.is3DLocation, this.speed);
    }
}

package ru.ok.call_effects.internal.tensorflow;

import android.opengl.Matrix;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: RendererMatrices.kt */
/* loaded from: classes9.dex */
public final class RendererMatrices {
    private int cameraH;
    private int cameraW;
    private boolean isFront;
    private int previewH;
    private int previewW;
    private float segmScaleX;
    private float segmScaleY;
    private int tensFrameHeight;
    private int tensFrameWidth;
    private final int TENS_WIDTH_S = 96;
    private final int TENS_HEIGHT_S = 160;
    private final int TENS_WIDTH_M = 128;
    private final int TENS_HEIGHT_M = 224;
    private final int TENS_WIDTH = Tensorflow.FRAME_WIDTH;
    private final int TENS_HEIGHT = Tensorflow.FRAME_HEIGHT;
    private final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    private float[] tensSmallMvpMatrix = new float[16];
    private float[] tensSmallMvpMatrixSolo = new float[16];
    private float[] tensNormalMvpMatrix = new float[16];
    private float[] tensNormalMvpMatrixSolo = new float[16];
    private float[] tensDefaultMxpMatrix = new float[16];
    private float[] identityMatrix = new float[16];

    private final Pair<Float, Float> transform(float f, float f2) {
        Float valueOf = Float.valueOf(1.0f);
        float f3 = 1;
        float f4 = (f / f2) - f3;
        return Math.abs(f4) <= this.MAX_ASPECT_RATIO_DEFORMATION_FRACTION ? new Pair<>(valueOf, valueOf) : f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new Pair<>(Float.valueOf(f4 + f3), valueOf) : new Pair<>(valueOf, Float.valueOf((f3 / f) * f2));
    }

    public final int getCameraH() {
        return this.cameraH;
    }

    public final int getCameraW() {
        return this.cameraW;
    }

    public final float[] getIdentityMatrix() {
        return this.identityMatrix;
    }

    public final int getPreviewH() {
        return this.previewH;
    }

    public final int getPreviewW() {
        return this.previewW;
    }

    public final float getSegmScaleX() {
        return this.segmScaleX;
    }

    public final float getSegmScaleY() {
        return this.segmScaleY;
    }

    public final int getTENS_HEIGHT() {
        return this.TENS_HEIGHT;
    }

    public final int getTENS_HEIGHT_M() {
        return this.TENS_HEIGHT_M;
    }

    public final int getTENS_HEIGHT_S() {
        return this.TENS_HEIGHT_S;
    }

    public final int getTENS_WIDTH() {
        return this.TENS_WIDTH;
    }

    public final int getTENS_WIDTH_M() {
        return this.TENS_WIDTH_M;
    }

    public final int getTENS_WIDTH_S() {
        return this.TENS_WIDTH_S;
    }

    public final float[] getTensDefaultMxpMatrix() {
        return this.tensDefaultMxpMatrix;
    }

    public final int getTensFrameHeight() {
        return this.tensFrameHeight;
    }

    public final int getTensFrameWidth() {
        return this.tensFrameWidth;
    }

    public final float[] getTensNormalMvpMatrix() {
        return this.tensNormalMvpMatrix;
    }

    public final float[] getTensNormalMvpMatrixSolo() {
        return this.tensNormalMvpMatrixSolo;
    }

    public final float[] getTensSmallMvpMatrix() {
        return this.tensSmallMvpMatrix;
    }

    public final float[] getTensSmallMvpMatrixSolo() {
        return this.tensSmallMvpMatrixSolo;
    }

    public final boolean isFront() {
        return this.isFront;
    }

    public final void setCameraH(int i) {
        this.cameraH = i;
    }

    public final void setCameraW(int i) {
        this.cameraW = i;
    }

    public final void setFront(boolean z) {
        this.isFront = z;
    }

    public final void setIdentityMatrix(float[] fArr) {
        this.identityMatrix = fArr;
    }

    public final void setPreviewH(int i) {
        this.previewH = i;
    }

    public final void setPreviewW(int i) {
        this.previewW = i;
    }

    public final void setSegmScaleX(float f) {
        this.segmScaleX = f;
    }

    public final void setSegmScaleY(float f) {
        this.segmScaleY = f;
    }

    public final void setTensDefaultMxpMatrix(float[] fArr) {
        this.tensDefaultMxpMatrix = fArr;
    }

    public final void setTensFrameHeight(int i) {
        this.tensFrameHeight = i;
    }

    public final void setTensFrameWidth(int i) {
        this.tensFrameWidth = i;
    }

    public final void setTensNormalMvpMatrix(float[] fArr) {
        this.tensNormalMvpMatrix = fArr;
    }

    public final void setTensNormalMvpMatrixSolo(float[] fArr) {
        this.tensNormalMvpMatrixSolo = fArr;
    }

    public final void setTensSmallMvpMatrix(float[] fArr) {
        this.tensSmallMvpMatrix = fArr;
    }

    public final void setTensSmallMvpMatrixSolo(float[] fArr) {
        this.tensSmallMvpMatrixSolo = fArr;
    }

    public final void updateMatrices(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (this.previewW == i && this.previewH == i2 && this.cameraW == i3 && this.cameraH == i4 && this.isFront == z) {
            return;
        }
        Matrix.setIdentityM(this.tensSmallMvpMatrix, 0);
        Matrix.setIdentityM(this.tensNormalMvpMatrix, 0);
        Matrix.setIdentityM(this.tensDefaultMxpMatrix, 0);
        Matrix.setIdentityM(this.identityMatrix, 0);
        if (z) {
            Matrix.scaleM(this.tensDefaultMxpMatrix, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.scaleM(this.tensDefaultMxpMatrix, 0, 1.0f, -1.0f, 1.0f);
        this.tensSmallMvpMatrixSolo = (float[]) this.tensDefaultMxpMatrix.clone();
        this.tensNormalMvpMatrixSolo = (float[]) this.tensDefaultMxpMatrix.clone();
        float f = i3 / i4;
        Pair<Float, Float> transform = transform(f, this.TENS_WIDTH / this.TENS_HEIGHT);
        this.tensFrameWidth = (int) (((Number) transform.first).floatValue() * this.TENS_WIDTH);
        this.tensFrameHeight = (int) (((Number) transform.second).floatValue() * this.TENS_HEIGHT);
        Pair<Float, Float> transform2 = transform(f, this.TENS_WIDTH_S / this.TENS_HEIGHT_S);
        float f2 = 1;
        Matrix.scaleM(this.tensSmallMvpMatrix, 0, f2 / ((Number) transform2.second).floatValue(), f2 / ((Number) transform2.first).floatValue(), 1.0f);
        Matrix.scaleM(this.tensSmallMvpMatrixSolo, 0, f2 / ((Number) transform2.second).floatValue(), f2 / ((Number) transform2.first).floatValue(), 1.0f);
        if (!z2) {
            this.segmScaleX = ((Number) transform2.second).floatValue();
            this.segmScaleY = ((Number) transform2.first).floatValue();
        }
        Pair<Float, Float> transform3 = transform(f, this.TENS_WIDTH_M / this.TENS_HEIGHT_M);
        Matrix.scaleM(this.tensNormalMvpMatrix, 0, f2 / ((Number) transform3.second).floatValue(), f2 / ((Number) transform3.first).floatValue(), 1.0f);
        Matrix.scaleM(this.tensNormalMvpMatrixSolo, 0, f2 / ((Number) transform3.second).floatValue(), f2 / ((Number) transform3.first).floatValue(), 1.0f);
        if (z2) {
            this.segmScaleX = ((Number) transform3.second).floatValue();
            this.segmScaleY = ((Number) transform3.first).floatValue();
        }
        this.previewW = i;
        this.previewH = i2;
        this.cameraW = i3;
        this.cameraH = i4;
        this.isFront = z;
    }
}

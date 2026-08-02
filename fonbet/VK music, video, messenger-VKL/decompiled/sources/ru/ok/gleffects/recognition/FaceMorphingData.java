package ru.ok.gleffects.recognition;

import android.graphics.RectF;

/* loaded from: classes9.dex */
public class FaceMorphingData {
    private final int cropHeight;
    private final float cropRotation;
    private final int cropWidth;
    private final ImageBuffer imageData;
    private final ImageBuffer maskData;
    private final RectF position;
    private final ImageBuffer warpingData;

    public static class ImageBuffer {
        public final int[] byteBuffer;
        public final float[] floatBuffer;
        public final int textureId;

        public ImageBuffer(int[] iArr) {
            this(iArr, null, 0);
        }

        public ImageBuffer(float[] fArr) {
            this(null, fArr, 0);
        }

        public ImageBuffer(int i) {
            this(null, null, i);
        }

        private ImageBuffer(int[] iArr, float[] fArr, int i) {
            this.byteBuffer = iArr;
            this.floatBuffer = fArr;
            this.textureId = i;
        }
    }

    public FaceMorphingData(RectF rectF, ImageBuffer imageBuffer, ImageBuffer imageBuffer2, ImageBuffer imageBuffer3, float f, int i, int i2) {
        this.position = rectF;
        this.imageData = imageBuffer;
        this.maskData = imageBuffer2;
        this.warpingData = imageBuffer3;
        this.cropRotation = f;
        this.cropWidth = i;
        this.cropHeight = i2;
    }

    public int getCropHeight() {
        return this.cropHeight;
    }

    public float getCropRotation() {
        return this.cropRotation;
    }

    public int getCropWidth() {
        return this.cropWidth;
    }

    public ImageBuffer getImgData() {
        return this.imageData;
    }

    public ImageBuffer getMaskData() {
        return this.maskData;
    }

    public RectF getPosition() {
        return this.position;
    }

    public ImageBuffer getWarpData() {
        return this.warpingData;
    }
}

package ru.ok.gleffects.recognition;

import android.graphics.RectF;

/* loaded from: classes9.dex */
public class FaceData {
    private final float[] faceRotationMatrix;
    private final float[] keyPointLocations;
    private final RectF position;

    public FaceData(RectF rectF, float[] fArr, float[] fArr2) {
        this.position = rectF;
        this.keyPointLocations = fArr;
        this.faceRotationMatrix = fArr2;
    }

    public float[] getFaceRotationMatrix() {
        return this.faceRotationMatrix;
    }

    public float[] getKeyPointLocations() {
        return this.keyPointLocations;
    }

    public RectF getPosition() {
        return this.position;
    }
}

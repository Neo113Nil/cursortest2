package ru.ok.gleffects.recognition;

import android.graphics.RectF;

/* loaded from: classes9.dex */
public class CatData {
    private final float[] angles;
    private final float[] keyPointLocations;
    private final RectF position;

    public CatData(RectF rectF, float[] fArr, float[] fArr2) {
        this.position = rectF;
        this.keyPointLocations = fArr;
        this.angles = fArr2;
    }

    public float[] getAngles() {
        return this.angles;
    }

    public float[] getKeyPointLocations() {
        return this.keyPointLocations;
    }

    public RectF getPosition() {
        return this.position;
    }
}

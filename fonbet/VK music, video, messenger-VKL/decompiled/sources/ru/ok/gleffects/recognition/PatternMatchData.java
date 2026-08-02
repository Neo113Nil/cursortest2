package ru.ok.gleffects.recognition;

/* loaded from: classes9.dex */
public class PatternMatchData {
    private final float pitchAngle;
    private final float positionX;
    private final float positionY;
    private final float rollAngle;
    private final float scale;
    private final float yawAngle;

    public PatternMatchData(float f, float f2, float f3, float f4, float f5, float f6) {
        this.positionX = f;
        this.positionY = f2;
        this.scale = f3;
        this.pitchAngle = f4;
        this.yawAngle = f5;
        this.rollAngle = f6;
    }

    public float getPitchAngle() {
        return this.pitchAngle;
    }

    public float getPositionX() {
        return this.positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }

    public float getRollAngle() {
        return this.rollAngle;
    }

    public float getScale() {
        return this.scale;
    }

    public float getYawAngle() {
        return this.yawAngle;
    }
}

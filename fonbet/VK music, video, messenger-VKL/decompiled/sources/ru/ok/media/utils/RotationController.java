package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class RotationController {
    private int encoderRotation;

    public int getDisplayRotation(int i, boolean z, boolean z2) {
        if (z2) {
            return 0;
        }
        return (i + 3600) % 360;
    }

    public int getEncodedRotation(int i, boolean z, boolean z2) {
        if (z2) {
            return 0;
        }
        int i2 = i - this.encoderRotation;
        if (z) {
            i2 = 180 - i2;
        }
        return (i2 + 3600) % 360;
    }

    public int getUserRotation(int i, boolean z, boolean z2) {
        if (z2) {
            return 0;
        }
        return (i + 3600) % 360;
    }

    public void setEncoderRotation(int i) {
        this.encoderRotation = i;
    }
}

package ru.ok.android.webrtc.stat.camera;

import xsna.de;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class CameraStat {
    public final float a;
    public final int b;
    public final int c;

    public CameraStat(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public static /* synthetic */ CameraStat copy$default(CameraStat cameraStat, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = cameraStat.a;
        }
        if ((i3 & 2) != 0) {
            i = cameraStat.b;
        }
        if ((i3 & 4) != 0) {
            i2 = cameraStat.c;
        }
        return cameraStat.copy(f, i, i2);
    }

    public final float component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final CameraStat copy(float f, int i, int i2) {
        return new CameraStat(f, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraStat)) {
            return false;
        }
        CameraStat cameraStat = (CameraStat) obj;
        return Float.compare(this.a, cameraStat.a) == 0 && this.b == cameraStat.b && this.c == cameraStat.c;
    }

    public final float getFps() {
        return this.a;
    }

    public final int getFrameHeight() {
        return this.c;
    }

    public final int getFrameWidth() {
        return this.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + de.v(this.b, Float.hashCode(this.a) * 31);
    }

    public String toString() {
        float f = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("CameraStat(fps=");
        sb.append(f);
        sb.append(", frameWidth=");
        sb.append(i);
        sb.append(", frameHeight=");
        return h5s.c(i2, ")", sb);
    }
}

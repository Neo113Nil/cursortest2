package io.appmetrica.analytics.coreapi.internal.model;

import xsna.shy;
import xsna.xq;

/* loaded from: classes8.dex */
public final class ScreenInfo {
    private final int a;
    private final int b;
    private final int c;
    private final float d;

    public ScreenInfo(int i, int i2, int i3, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i, int i2, int i3, float f, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = screenInfo.a;
        }
        if ((i4 & 2) != 0) {
            i2 = screenInfo.b;
        }
        if ((i4 & 4) != 0) {
            i3 = screenInfo.c;
        }
        if ((i4 & 8) != 0) {
            f = screenInfo.d;
        }
        return screenInfo.copy(i, i2, i3, f);
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    public final ScreenInfo copy(int i, int i2, int i3, float f) {
        return new ScreenInfo(i, i2, i3, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.a == screenInfo.a && this.b == screenInfo.b && this.c == screenInfo.c && Float.valueOf(this.d).equals(Float.valueOf(screenInfo.d));
    }

    public final int getDpi() {
        return this.c;
    }

    public final int getHeight() {
        return this.b;
    }

    public final float getScaleFactor() {
        return this.d;
    }

    public final int getWidth() {
        return this.a;
    }

    public int hashCode() {
        return Float.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScreenInfo(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", dpi=");
        sb.append(this.c);
        sb.append(", scaleFactor=");
        return xq.c(')', this.d, sb);
    }
}

package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: Alignment.kt */
/* loaded from: classes11.dex */
public final class sy6 implements dt1 {
    public final float b;
    public final float c;

    public sy6(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // xsna.dt1
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1;
        float f2 = (this.b + f) * (((int) (j3 >> 32)) / 2.0f);
        float f3 = (f + this.c) * (((int) (j3 & 4294967295L)) / 2.0f);
        return (Math.round(f3) & 4294967295L) | (Math.round(f2) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy6)) {
            return false;
        }
        sy6 sy6Var = (sy6) obj;
        return Float.compare(this.b, sy6Var.b) == 0 && Float.compare(this.c, sy6Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb.append(this.b);
        sb.append(", verticalBias=");
        return xq.c(')', this.c, sb);
    }
}

package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.dt1;

/* compiled from: Alignment.kt */
/* loaded from: classes11.dex */
public final class ty6 implements dt1 {
    public final float b;
    public final float c;

    /* compiled from: Alignment.kt */
    public static final class a implements dt1.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // xsna.dt1.b
        public final int a(int i, int i2, LayoutDirection layoutDirection) {
            float f = (i2 - i) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f2 = this.a;
            if (layoutDirection != layoutDirection2) {
                f2 *= -1;
            }
            return Math.round((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Horizontal(bias="));
        }
    }

    /* compiled from: Alignment.kt */
    public static final class b implements dt1.c {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // xsna.dt1.c
        public final int a(int i, int i2) {
            return Math.round((1 + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Vertical(bias="));
        }
    }

    public ty6(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // xsna.dt1
    public final long a(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.b;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1;
        }
        float f4 = 1;
        float f5 = (f3 + f4) * f;
        float f6 = (f4 + this.c) * f2;
        return (Math.round(f6) & 4294967295L) | (Math.round(f5) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty6)) {
            return false;
        }
        ty6 ty6Var = (ty6) obj;
        return Float.compare(this.b, ty6Var.b) == 0 && Float.compare(this.c, ty6Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.b);
        sb.append(", verticalBias=");
        return xq.c(')', this.c, sb);
    }
}

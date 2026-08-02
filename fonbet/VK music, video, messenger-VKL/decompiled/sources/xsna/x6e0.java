package xsna;

import java.util.Arrays;

/* compiled from: Properties.kt */
/* loaded from: classes3.dex */
public final class x6e0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float[] o;
    public final float[] p;
    public final int q;
    public final int r;

    public x6e0(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, int i4, int i5, int i6, float f7, float f8, float[] fArr, float[] fArr2, int i7, int i8) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = f7;
        this.n = f8;
        this.o = fArr;
        this.p = fArr2;
        this.q = i7;
        this.r = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x6e0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x6e0 x6e0Var = (x6e0) obj;
        return this.a == x6e0Var.a && this.b == x6e0Var.b && this.c == x6e0Var.c && this.d == x6e0Var.d && this.e == x6e0Var.e && this.f == x6e0Var.f && this.g == x6e0Var.g && this.h == x6e0Var.h && this.i == x6e0Var.i && this.j == x6e0Var.j && this.k == x6e0Var.k && this.l == x6e0Var.l && this.m == x6e0Var.m && this.n == x6e0Var.n && Arrays.equals(this.o, x6e0Var.o) && Arrays.equals(this.p, x6e0Var.p) && this.q == x6e0Var.q && this.r == x6e0Var.r;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.p) + ((Arrays.hashCode(this.o) + io.reactivex.rxjava3.subjects.b.a(this.n, io.reactivex.rxjava3.subjects.b.a(this.m, (((((((((((io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31, 31), 31)) * 31)) * 31) + this.q) * 31) + this.r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties(fromAlpha=");
        sb.append(this.a);
        sb.append(", toAlpha=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        sb.append(this.f);
        sb.append(", fromClipX=");
        sb.append(this.g);
        sb.append(", toClipX=");
        sb.append(this.h);
        sb.append(", fromClipTop=");
        sb.append(this.i);
        sb.append(", toClipTop=");
        sb.append(this.j);
        sb.append(", fromClipBottom=");
        sb.append(this.k);
        sb.append(", toClipBottom=");
        sb.append(this.l);
        sb.append(", fromScale=");
        sb.append(this.m);
        sb.append(", toScale=");
        sb.append(this.n);
        sb.append(", fromCorners=");
        sb.append(Arrays.toString(this.o));
        sb.append(", toCorners=");
        sb.append(Arrays.toString(this.p));
        sb.append(", previewWidth=");
        sb.append(this.q);
        sb.append(", previewHeight=");
        return vu5.b(sb, this.r, ')');
    }

    public /* synthetic */ x6e0(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3, float f7, float[] fArr, int i4, int i5, int i6) {
        this(f, f2, f3, f4, f5, f6, (i6 & 64) != 0 ? 0 : i, 0, (i6 & 256) != 0 ? 0 : i2, 0, (i6 & 1024) != 0 ? 0 : i3, 0, f7, 1.0f, (i6 & 16384) != 0 ? new float[8] : fArr, new float[8], i4, i5);
    }
}

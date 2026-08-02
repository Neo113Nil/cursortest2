package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fl51 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;

    public fl51(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = i21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl51)) {
            return false;
        }
        fl51 fl51Var = (fl51) obj;
        return this.a == fl51Var.a && this.b == fl51Var.b && this.c == fl51Var.c && this.d == fl51Var.d && this.e == fl51Var.e && this.f == fl51Var.f && this.g == fl51Var.g && this.h == fl51Var.h && this.i == fl51Var.i && this.j == fl51Var.j && this.k == fl51Var.k && this.l == fl51Var.l && this.m == fl51Var.m && this.n == fl51Var.n && this.o == fl51Var.o && this.p == fl51Var.p && this.q == fl51Var.q && this.r == fl51Var.r && this.s == fl51Var.s && this.t == fl51Var.t && this.u == fl51Var.u;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + oyr.b(this.t, oyr.b(this.s, oyr.b(this.r, oyr.b(this.q, oyr.b(this.p, oyr.b(this.o, oyr.b(this.n, oyr.b(this.m, oyr.b(this.l, oyr.b(this.k, oyr.b(this.j, oyr.b(this.i, oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "YandexColorsData(bgMain=", ", bgMinor=", ", bgInvert=");
        vfc.u(this.c, this.d, ", bgFloating=", ", controlMain=", s);
        vfc.u(this.e, this.f, ", controlMinor=", ", textMain=", s);
        vfc.u(this.g, this.h, ", textMinor=", ", textInvert=", s);
        vfc.u(this.i, this.j, ", textOnControlMain=", ", textOnControlMinor=", s);
        vfc.u(this.k, this.l, ", iconMain=", ", iconMinor=", s);
        vfc.u(this.m, this.n, ", line=", ", pin=", s);
        vfc.u(this.o, this.p, ", pressed=", ", fogDark=", s);
        vfc.u(this.q, this.r, ", everBack=", ", everFront=", s);
        vfc.u(this.s, this.t, ", cardDivider=", ", error=", s);
        return oyr.m(this.u, Extension.C_BRAKE, s);
    }
}

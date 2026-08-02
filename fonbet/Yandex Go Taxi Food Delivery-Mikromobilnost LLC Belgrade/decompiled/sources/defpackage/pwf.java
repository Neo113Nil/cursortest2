package defpackage;

import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.model.data.AdditionalSettings;

/* loaded from: classes2.dex */
public final class pwf implements wy4 {
    public final xvf0 A;
    public final xvf0 B;
    public final xvf0 C;
    public final xvf0 D;
    public final xvf0 E;
    public final xvf0 F;
    public final xvf0 G;
    public final xvf0 H;
    public final xvf0 I;
    public final xvf0 J;
    public final xvf0 K;
    public final xvf0 L;
    public final xvf0 M;
    public final pwf a = this;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final xvf0 w;
    public final xvf0 x;
    public final xvf0 y;
    public final xvf0 z;

    public pwf(w3i w3iVar) {
        int i = 3;
        i5m.b(new a55(w3iVar, i));
        int i2 = 6;
        this.b = i5m.b(new a55(w3iVar, i2));
        int i3 = 4;
        this.c = i5m.b(new a55(w3iVar, i3));
        int i4 = 0;
        this.d = i5m.b(new b55(i4, w3iVar));
        int i5 = 1;
        this.e = i5m.b(new b55(i5, w3iVar));
        int i6 = 2;
        xvf0 b = i5m.b(new b55(i6, w3iVar));
        this.f = b;
        xvf0 b2 = i5m.b(new c55(w3iVar, this.d, this.b, this.e, b, 2));
        this.g = b2;
        xvf0 b3 = i5m.b(new s90(w3iVar, b2, this.d, this.e, 15));
        this.h = b3;
        int i7 = 10;
        this.i = i5m.b(new tl3(w3iVar, b3, i7));
        xvf0 b4 = i5m.b(new tl3(w3iVar, this.g, 15));
        this.j = b4;
        int i8 = 9;
        xvf0 b5 = i5m.b(new c55(w3iVar, this.b, this.c, this.i, b4, new b55(i8, w3iVar)));
        this.k = b5;
        i5m.b(new d55(w3iVar, b5, this.i, i5));
        this.l = i5m.b(new a55(w3iVar, i5));
        int i9 = 8;
        this.m = i5m.b(new a55(w3iVar, i9));
        this.n = i5m.b(new a55(w3iVar, i4));
        xvf0 b6 = i5m.b(new c55(w3iVar, this.b, this.c, this.i, this.j, 0));
        this.o = b6;
        i5m.b(new tl3(w3iVar, i5m.b(new d55(w3iVar, b6, this.i, i4)), 12));
        this.p = i5m.b(new a55(w3iVar, i7));
        this.q = i5m.b(new a55(w3iVar, i8));
        int i10 = 7;
        this.r = i5m.b(new a55(w3iVar, i10));
        this.s = i5m.b(qx90.a);
        xvf0 b7 = i5m.b(new tl3(w3iVar, this.h, i8));
        this.t = b7;
        this.u = i5m.b(new s90(w3iVar, this.i, b7, this.j, 14));
        xvf0 b8 = i5m.b(new tl3(this.i, 22));
        this.v = b8;
        this.w = i5m.b(new ht0(w3iVar, this.q, this.m, this.r, this.s, this.u, b8, 7));
        int i11 = 5;
        this.x = i5m.b(new a55(w3iVar, i11));
        this.y = i5m.b(cga0.a);
        i5m.b(new tl3(w3iVar, this.h, i9));
        this.z = i5m.b(new tl3(w3iVar, this.g, 13));
        this.A = i5m.b(new b55(i3, w3iVar));
        xvf0 b9 = i5m.b(new a55(w3iVar, i6));
        this.B = b9;
        this.C = i5m.b(new tl3(w3iVar, b9, 17));
        i5m.b(new b55(i9, w3iVar));
        this.D = i5m.b(new b55(i10, w3iVar));
        this.E = i5m.b(new b55(i, w3iVar));
        i5m.b(new b55(i11, w3iVar));
        xvf0 b10 = i5m.b(new b55(i2, w3iVar));
        this.F = b10;
        this.G = i5m.b(new tl3(w3iVar, b10, 16));
        this.H = i5m.b(u511.a);
        this.I = i5m.b(r211.a);
        this.J = i5m.b(k511.a);
        this.K = i5m.b(wb11.a);
        this.L = i5m.b(new tl3(w3iVar, this.w, 14));
        this.M = i5m.b(new tl3(w3iVar, this.A, 11));
    }

    public final AdditionalSettings a() {
        return (AdditionalSettings) this.l.get();
    }

    public final String b() {
        return (String) this.x.get();
    }

    public final rwo c() {
        return (rwo) this.i.get();
    }

    public final pcy d() {
        return (pcy) this.b.get();
    }

    public final Payer e() {
        return (Payer) this.m.get();
    }

    public final vv90 f() {
        return (vv90) this.w.get();
    }

    public final px90 g() {
        return (px90) this.s.get();
    }
}

package xsna;

import kotlin.Lazy;

/* compiled from: CommonCameraBridge.kt */
/* loaded from: classes7.dex */
public final class dig implements yf9 {
    public final b25 a;
    public final Lazy<o0r0> b;
    public final Lazy<pkd> c;
    public final Lazy<wvw> d;
    public final Lazy<krl0> e;
    public final Lazy<qdz> f;
    public final Lazy<t20> g;
    public final Lazy<sw50> h;
    public final zlg i;
    public final jvi j = new jvi();
    public final y000 k = new y000();
    public final o96 l = new o96();
    public final fig m = new fig();
    public final eig n = new eig();

    /* JADX WARN: Multi-variable type inference failed */
    public dig(b25 b25Var, Lazy<? extends o0r0> lazy, Lazy<? extends pkd> lazy2, Lazy<? extends wvw> lazy3, Lazy<? extends krl0> lazy4, Lazy<? extends qdz> lazy5, Lazy<? extends t20> lazy6, Lazy<? extends sw50> lazy7) {
        this.a = b25Var;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        this.g = lazy6;
        this.h = lazy7;
        this.i = new zlg(b25Var);
    }

    @Override // xsna.yf9
    public final o96 A() {
        return this.l;
    }

    @Override // xsna.yf9
    public final o0r0 F() {
        return this.b.getValue();
    }

    @Override // xsna.yf9
    public final t20 a() {
        return this.g.getValue();
    }

    @Override // xsna.yf9
    public final krl0 a0() {
        return this.e.getValue();
    }

    @Override // xsna.yf9
    public final jvi b() {
        return this.j;
    }

    @Override // xsna.yf9
    public final fig c() {
        return this.m;
    }

    @Override // xsna.yf9
    public final hne0 d() {
        return this.i;
    }

    @Override // xsna.yf9
    public final y000 e() {
        return this.k;
    }

    @Override // xsna.yf9
    public final eig f() {
        return this.n;
    }

    @Override // xsna.yf9
    public final qdz p() {
        return this.f.getValue();
    }

    @Override // xsna.yf9
    public final b25 s() {
        return this.a;
    }

    @Override // xsna.yf9
    public final wvw t() {
        return this.d.getValue();
    }

    @Override // xsna.yf9
    public final sw50 w0() {
        return this.h.getValue();
    }

    @Override // xsna.yf9
    public final pkd x() {
        return this.c.getValue();
    }
}

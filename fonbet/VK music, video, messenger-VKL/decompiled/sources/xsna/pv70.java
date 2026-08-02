package xsna;

/* compiled from: Applier.kt */
/* loaded from: classes11.dex */
public final class pv70<N> implements fd3<N> {
    public final fd3<N> a;
    public final int b;
    public int c;

    public pv70(fd3<N> fd3Var, int i) {
        this.a = fd3Var;
        this.b = i;
    }

    @Override // xsna.fd3
    public final N a() {
        return this.a.a();
    }

    @Override // xsna.fd3
    public final void b(Object obj, wzs wzsVar) {
        this.a.b(obj, wzsVar);
    }

    @Override // xsna.fd3
    public final void d() {
        this.a.d();
    }

    @Override // xsna.fd3
    public final void e(int i, N n) {
        this.a.e(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // xsna.fd3
    public final void f(N n) {
        this.c++;
        this.a.f(n);
    }

    @Override // xsna.fd3
    public final void g(int i, int i2) {
        this.a.g(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // xsna.fd3
    public final void h(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.h(i + i4, i2 + i4, i3);
    }

    @Override // xsna.fd3
    public final void i(int i, N n) {
        this.a.i(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // xsna.fd3
    public final void j() {
        if (this.c <= 0) {
            androidx.compose.runtime.b.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.j();
    }
}

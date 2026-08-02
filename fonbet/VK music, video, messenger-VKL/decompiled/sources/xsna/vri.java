package xsna;

/* compiled from: Composers.kt */
/* loaded from: classes8.dex */
public final class vri extends rri {
    public final j8y d;
    public int e;

    public vri(lhx lhxVar, j8y j8yVar) {
        super(lhxVar);
        this.d = j8yVar;
    }

    @Override // xsna.rri
    public final void a() {
        this.b = true;
        this.e++;
    }

    @Override // xsna.rri
    public final void c() {
        this.b = false;
        i("\n");
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            i(this.d.a.g);
        }
    }

    @Override // xsna.rri
    public final void d() {
        if (this.b) {
            this.b = false;
        } else {
            c();
        }
    }

    @Override // xsna.rri
    public final void l() {
        f(' ');
    }

    @Override // xsna.rri
    public final void m() {
        this.e--;
    }
}

package xsna;

/* compiled from: CoroutineTaskExecution.kt */
/* loaded from: classes3.dex */
public final class wvj extends bwj {
    public final long a;
    public final boolean b;

    public wvj(long j, yok0 yok0Var) {
        this.a = j;
        this.b = yok0Var.isActive();
    }

    @Override // xsna.jn50
    public final long b() {
        return this.a;
    }

    @Override // xsna.jn50
    public final boolean c() {
        return false;
    }

    @Override // xsna.bwj, xsna.jn50
    public final boolean d() {
        return this.b;
    }

    @Override // xsna.bwj
    public final eyx e() {
        return iyx.a();
    }

    @Override // xsna.bwj, xsna.jn50
    public final void a() {
    }
}

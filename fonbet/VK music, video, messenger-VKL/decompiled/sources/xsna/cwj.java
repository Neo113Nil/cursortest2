package xsna;

/* compiled from: CoroutineTaskExecution.kt */
/* loaded from: classes3.dex */
public final class cwj extends bwj {
    public final long a;
    public final eyx b;

    public cwj(long j, eyx eyxVar) {
        this.a = j;
        this.b = eyxVar;
    }

    @Override // xsna.bwj, xsna.jn50
    public final void a() {
        this.b.b(null);
    }

    @Override // xsna.jn50
    public final long b() {
        return this.a;
    }

    @Override // xsna.bwj, xsna.jn50
    public final boolean d() {
        return this.b.isActive();
    }

    @Override // xsna.bwj
    public final eyx e() {
        return this.b;
    }
}

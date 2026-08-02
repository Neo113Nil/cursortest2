package xsna;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes12.dex */
public final class dpk0 implements cq10 {
    public final dvf b;
    public boolean c;
    public long d;
    public long e;
    public jwa0 f = jwa0.d;

    public dpk0(dvf dvfVar) {
        this.b = dvfVar;
    }

    public final void a(long j) {
        this.d = j;
        if (this.c) {
            this.e = this.b.elapsedRealtime();
        }
    }

    @Override // xsna.cq10
    public final void b(jwa0 jwa0Var) {
        if (this.c) {
            a(getPositionUs());
        }
        this.f = jwa0Var;
    }

    @Override // xsna.cq10
    public final jwa0 getPlaybackParameters() {
        return this.f;
    }

    @Override // xsna.cq10
    public final long getPositionUs() {
        long j = this.d;
        if (!this.c) {
            return j;
        }
        long elapsedRealtime = this.b.elapsedRealtime() - this.e;
        return (this.f.a == 1.0f ? y2r0.S(elapsedRealtime) : elapsedRealtime * r4.c) + j;
    }
}

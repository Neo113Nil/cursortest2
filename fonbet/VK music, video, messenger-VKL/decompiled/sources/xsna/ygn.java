package xsna;

/* compiled from: Job.kt */
/* loaded from: classes8.dex */
public final class ygn extends jyx {
    public final ogn f;

    public ygn(ogn ognVar) {
        this.f = ognVar;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return false;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        this.f.dispose();
    }
}

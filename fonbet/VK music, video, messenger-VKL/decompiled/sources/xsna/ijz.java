package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes16.dex */
public final class ijz implements kgn {
    public final /* synthetic */ kjz a;

    public ijz(kjz kjzVar) {
        this.a = kjzVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        gzs<? extends s3q0> h = this.a.b.h();
        if (h != null) {
            h.invoke();
        }
    }
}

package xsna;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class kj01 extends jj01 {
    public boolean f;

    public kj01(qj01 qj01Var) {
        super(qj01Var);
        this.e.r++;
    }

    public final void l() {
        if (!this.f) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.e.s++;
        this.f = true;
    }

    public abstract void n();
}

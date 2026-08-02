package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class fa01 extends l801 {
    public boolean e;

    public fa01(mb01 mb01Var) {
        super(mb01Var);
        ((mb01) this.b).F++;
    }

    public final void l() {
        if (!this.e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (n()) {
            return;
        }
        ((mb01) this.b).a();
        this.e = true;
    }

    public abstract boolean n();
}

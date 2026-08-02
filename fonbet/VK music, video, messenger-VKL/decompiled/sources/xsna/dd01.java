package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public abstract class dd01 extends q1t {
    public boolean e;

    public dd01(mb01 mb01Var) {
        super(mb01Var);
        ((mb01) this.b).F++;
    }

    public abstract boolean l();

    public final void m() {
        if (!this.e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n() {
        if (this.e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (l()) {
            return;
        }
        ((mb01) this.b).a();
        this.e = true;
    }
}

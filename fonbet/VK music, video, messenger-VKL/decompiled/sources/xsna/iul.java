package xsna;

/* compiled from: SoftwareKeyboardController.kt */
/* loaded from: classes11.dex */
public final class iul implements nek0 {
    public final mio0 a;

    public iul(mio0 mio0Var) {
        this.a = mio0Var;
    }

    @Override // xsna.nek0
    public final void hide() {
        this.a.a.d();
    }

    @Override // xsna.nek0
    public final void show() {
        mio0 mio0Var = this.a;
        if (mio0Var.b.get() != null) {
            mio0Var.a.h();
        }
    }
}

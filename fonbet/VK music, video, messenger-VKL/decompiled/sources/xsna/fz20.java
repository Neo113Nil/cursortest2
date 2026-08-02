package xsna;

/* compiled from: ModalDialogCallbackDefaultFactory.kt */
/* loaded from: classes3.dex */
public final class fz20 implements fcn {
    public final /* synthetic */ gzs<s3q0> b;

    public fz20(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        this.b.invoke();
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}

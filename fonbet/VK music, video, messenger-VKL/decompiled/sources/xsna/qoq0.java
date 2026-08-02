package xsna;

/* compiled from: UserProfileDialogs.kt */
/* loaded from: classes5.dex */
public final class qoq0 implements fcn {
    public final /* synthetic */ gzs<dw20> b;

    /* JADX WARN: Multi-variable type inference failed */
    public qoq0(gzs<? extends dw20> gzsVar) {
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
        dw20 invoke = this.b.invoke();
        if (invoke != null) {
            invoke.hide();
        }
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

package xsna;

/* compiled from: Deps.kt */
/* loaded from: classes15.dex */
public abstract class ajg implements w0m {
    public final bpn0 a = new bpn0(new pd4(6));

    @Override // xsna.w0m
    public final void onDestroy() {
        bpn0 bpn0Var = this.a;
        if (bpn0Var.isInitialized()) {
            ((io.reactivex.rxjava3.disposables.b) bpn0Var.getValue()).dispose();
        }
    }
}

package xsna;

/* compiled from: rememberLottieComposition.kt */
/* loaded from: classes12.dex */
public final class ztf0<T> implements r800 {
    public final /* synthetic */ lq9 a;

    public ztf0(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // xsna.r800
    public final void onResult(T t) {
        lq9 lq9Var = this.a;
        if (lq9Var.t()) {
            return;
        }
        lq9Var.resumeWith(t);
    }
}

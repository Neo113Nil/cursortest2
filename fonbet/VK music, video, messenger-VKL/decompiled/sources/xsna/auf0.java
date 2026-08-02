package xsna;

import kotlin.Result;

/* compiled from: rememberLottieComposition.kt */
/* loaded from: classes12.dex */
public final class auf0<T> implements r800 {
    public final /* synthetic */ lq9 a;

    public auf0(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // xsna.r800
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        lq9 lq9Var = this.a;
        if (lq9Var.t()) {
            return;
        }
        lq9Var.resumeWith(new Result.Failure(th));
    }
}

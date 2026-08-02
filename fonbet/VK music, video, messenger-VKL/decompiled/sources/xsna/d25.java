package xsna;

import xsna.b25;

/* compiled from: AuthBridge.kt */
/* loaded from: classes.dex */
public final class d25 implements b25.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> b;

    public d25(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.b = rVar;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        this.b.onNext(Boolean.valueOf(tbu0Var.b()));
    }
}

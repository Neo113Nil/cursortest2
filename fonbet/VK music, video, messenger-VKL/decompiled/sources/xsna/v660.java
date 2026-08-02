package xsna;

import xsna.b25;

/* compiled from: NewContactsNotifyInitializer.kt */
/* loaded from: classes.dex */
public final class v660 implements b25.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> b;

    public v660(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.b = rVar;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        io.reactivex.rxjava3.core.r<Boolean> rVar = this.b;
        if (rVar.h()) {
            return;
        }
        rVar.onNext(Boolean.valueOf(tbu0Var.b()));
    }
}

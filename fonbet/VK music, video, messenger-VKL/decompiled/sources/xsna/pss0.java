package xsna;

import xsna.b25;

/* compiled from: VideoLiveFragment.kt */
/* loaded from: classes3.dex */
public final class pss0 implements b25.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> b;

    public pss0(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.b = rVar;
    }

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        this.b.onNext(Boolean.valueOf(tbu0Var.b()));
    }
}

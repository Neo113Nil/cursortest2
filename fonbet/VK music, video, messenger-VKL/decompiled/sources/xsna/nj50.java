package xsna;

import xsna.a7f0;
import xsna.kj50;
import xsna.wk50;
import xsna.xl50;

/* compiled from: MviActionDelegateScope.kt */
/* loaded from: classes3.dex */
public abstract class nj50<A extends kj50, P extends xl50> implements a7f0 {
    @Override // xsna.a7f0
    public final <T> io.reactivex.rxjava3.disposables.c I(io.reactivex.rxjava3.core.q<T> qVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2, gzs<s3q0> gzsVar) {
        return a7f0.a.b(this, qVar, wVar, izsVar, izsVar2, gzsVar);
    }

    public abstract void a(A... aArr);

    public abstract void b(P p);

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.disposables.c l(io.reactivex.rxjava3.disposables.c cVar) {
        ((wk50.a) this).b.b(cVar);
        return cVar;
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.disposables.c s(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.core.w wVar, izs<? super Throwable, s3q0> izsVar, gzs<s3q0> gzsVar) {
        return a7f0.a.a(this, aVar, wVar, izsVar, gzsVar);
    }

    @Override // xsna.a7f0
    public final <T> io.reactivex.rxjava3.disposables.c w(io.reactivex.rxjava3.core.x<T> xVar, io.reactivex.rxjava3.core.w wVar, izs<? super T, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        return a7f0.a.c(this, xVar, wVar, izsVar, izsVar2);
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.core.w y() {
        return io.reactivex.rxjava3.schedulers.a.b();
    }

    @Override // xsna.a7f0
    public final io.reactivex.rxjava3.core.w z() {
        return yiz.f(com.vk.mvi.core.internal.executors.a.a);
    }
}

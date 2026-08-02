package xsna;

import xsna.i5e0;

/* compiled from: PromoLinkLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class o5e0 implements m5e0 {
    public final a1w a;
    public final io.reactivex.rxjava3.subjects.d<i5e0> b = io.reactivex.rxjava3.subjects.d.N0();
    public io.reactivex.rxjava3.disposables.c c;

    public o5e0(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.m5e0
    public final io.reactivex.rxjava3.core.q<i5e0> a() {
        this.c = new io.reactivex.rxjava3.internal.operators.single.d0(this.a.C(this, new fvm()), new n5e0(0), null).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new zk30(new fuc0(this, 4), 17), io.reactivex.rxjava3.internal.functions.a.e);
        qbp qbpVar = new qbp(this, 1);
        io.reactivex.rxjava3.subjects.d<i5e0> dVar = this.b;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(dVar, io.reactivex.rxjava3.internal.functions.a.d, qbpVar);
    }

    @Override // xsna.m5e0
    public final void b(String str) {
        this.a.C(this, new hvm(str)).q(io.reactivex.rxjava3.schedulers.a.b()).subscribe();
        this.b.onNext(i5e0.b.a);
    }
}

package xsna;

import com.vk.log.L;

/* compiled from: AudioReactionsInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class du4 implements bu4 {
    public final ju4 a;
    public final crx0 b;

    public du4(ju4 ju4Var, crx0 crx0Var) {
        this.a = ju4Var;
        this.b = crx0Var;
    }

    @Override // xsna.bu4
    public final io.reactivex.rxjava3.internal.operators.single.y K() {
        ju4 ju4Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.maybe.d0(ju4Var.c(), new io.reactivex.rxjava3.internal.operators.maybe.e(ju4Var.c(), L())).s().l(new e8(new com.vk.movika.sdk.base.observable.c(this, 7), 3));
    }

    @Override // xsna.bu4
    public final io.reactivex.rxjava3.internal.operators.completable.v L() {
        ju4 ju4Var = this.a;
        io.reactivex.rxjava3.internal.operators.completable.e b = ((xt4) ju4Var.b).b();
        ((ix4) ju4Var.a).getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.single.s(b.e(rsg0.w0(yfb.x(new tfx("audio.getReactionsConfig", new qr(5), new io.reactivex.rxjava3.processors.b(4)))).l(new wq(4, new qb(6)))), new nz(new mz(ju4Var, 6), 4)).i(new xf1(new cu4(L.a, 0), 2)), io.reactivex.rxjava3.internal.functions.a.g);
    }
}

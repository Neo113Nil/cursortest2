package xsna;

import com.vk.log.L;

/* compiled from: AudioRestrictionInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class qw4 implements mw4 {
    public final sw4 a;
    public final rw4 b;

    public qw4(sw4 sw4Var, rw4 rw4Var) {
        this.a = sw4Var;
        this.b = rw4Var;
    }

    @Override // xsna.mw4
    public final io.reactivex.rxjava3.internal.operators.maybe.e0 a(int i, String str, String str2) {
        sw4 sw4Var = this.a;
        io.reactivex.rxjava3.internal.operators.maybe.u uVar = new io.reactivex.rxjava3.internal.operators.maybe.u(sw4Var.b(i), new fq1(new s8(this.b, 2), 1));
        com.vk.core.utils.newtork.b.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.maybe.e0(uVar, com.vk.core.utils.newtork.b.d() ? new io.reactivex.rxjava3.internal.operators.single.e0(sw4Var.a(Integer.valueOf(i), str, str2).l(new kb(new nw4(this, i, 0), 5)), new l8(new lb(this, 7), 4)) : d());
    }

    @Override // xsna.mw4
    public final io.reactivex.rxjava3.internal.operators.completable.v b() {
        sw4 sw4Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.single.s(sw4Var.e(), new nb(new pw4(sw4Var, 0), 1)).i(new defpackage.d(new q60(L.a, 1), 5)), io.reactivex.rxjava3.internal.functions.a.g);
    }

    @Override // xsna.mw4
    public final io.reactivex.rxjava3.internal.operators.single.e0 c(int i) {
        sw4 sw4Var = this.a;
        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.d0(sw4Var.b(i), new io.reactivex.rxjava3.internal.operators.maybe.e(sw4Var.b(i), b())), new pb(new ow4(this.b, 0), 2)).s(), new h8(new com.vk.movika.sdk.base.observable.p(this, 10), 4));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y d() {
        return this.a.c().l(new ju1(new r8(this.b, 2), 2));
    }
}

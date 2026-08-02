package xsna;

import android.content.Context;
import xsna.rye;

/* compiled from: RxExt.kt */
/* loaded from: classes17.dex */
public final class cug0 {
    public static final io.reactivex.rxjava3.internal.operators.observable.c0 a(io.reactivex.rxjava3.internal.operators.observable.m1 m1Var, Context context, final gtl gtlVar, io.reactivex.rxjava3.subjects.f fVar, gzs gzsVar) {
        final rye.b bVar = new rye.b(context, gzsVar);
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(m1Var, new amt(new ufg0(1, bVar, gtlVar), 28), io.reactivex.rxjava3.internal.functions.a.c).C(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ntg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                long j = gtlVar.b;
                rye.b bVar2 = rye.b.this;
                bVar2.b(j, new u210(bVar2, 24), true);
            }
        }).F(new le50(new mm1(29, bVar, gtlVar), 12)), io.reactivex.rxjava3.internal.functions.a.d, new qtg0(0, fVar != null ? fVar.subscribe(new be50(new zb60(bVar, 19), 11)) : null, bVar));
    }

    public static final io.reactivex.rxjava3.internal.operators.single.k b(io.reactivex.rxjava3.core.x xVar, Context context, gtl gtlVar, io.reactivex.rxjava3.core.q qVar, gzs gzsVar, o7j o7jVar) {
        if (o7jVar != null) {
            oa4 oa4Var = new oa4(qVar != null ? qVar.subscribe(new cx00(new uh40(o7jVar, 22), 20)) : null, 4);
            xVar.getClass();
            return new io.reactivex.rxjava3.internal.operators.single.k(xVar, oa4Var);
        }
        rye.b bVar = new rye.b(context, gzsVar);
        io.reactivex.rxjava3.disposables.c subscribe = qVar != null ? qVar.subscribe(new n1r(new yhu(bVar, 26), 19)) : null;
        gl30 gl30Var = new gl30(new ut6(28, bVar, gtlVar), 21);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, gl30Var), new y730(new np5(21, bVar, gtlVar), 11)).h(new ux00(new rm0(26, bVar, gtlVar), 16)), new rhe(1, subscribe, bVar));
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.operators.single.k c(io.reactivex.rxjava3.core.x xVar, Context context, gtl gtlVar, io.reactivex.rxjava3.core.q qVar, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            gtlVar = new gtl(7);
        }
        return b(xVar, context, gtlVar, qVar, gzsVar, null);
    }
}

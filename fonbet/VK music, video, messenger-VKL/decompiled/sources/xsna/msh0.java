package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lsh0;

/* compiled from: SearchFeatureUiSideEffectDelegate.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class msh0 extends FunctionReferenceImpl implements izs<lsh0.b, io.reactivex.rxjava3.core.k<ish0>> {
    @Override // xsna.izs
    public final io.reactivex.rxjava3.core.k<ish0> invoke(lsh0.b bVar) {
        io.reactivex.rxjava3.core.k e0Var;
        lsh0.b bVar2 = bVar;
        io.reactivex.rxjava3.subjects.f fVar = ((lsh0) this.receiver).c;
        lsh0.a aVar = bVar2.c;
        if (aVar != null) {
            fVar.onNext(aVar);
        }
        long j = bVar2.a;
        io.reactivex.rxjava3.core.a r = zno.e(j) <= 0 ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.r(zno.e(j), TimeUnit.MILLISECONDS);
        io.reactivex.rxjava3.internal.operators.maybe.t i = io.reactivex.rxjava3.core.k.i(bVar2.b);
        r.getClass();
        io.reactivex.rxjava3.internal.operators.maybe.e eVar = new io.reactivex.rxjava3.internal.operators.maybe.e(i, r);
        if (aVar == null) {
            e0Var = io.reactivex.rxjava3.internal.operators.maybe.w.b;
        } else {
            wx40 wx40Var = new wx40(aVar, 6);
            fVar.getClass();
            e0Var = new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, wx40Var));
        }
        return new io.reactivex.rxjava3.internal.operators.maybe.f0(eVar, e0Var);
    }
}

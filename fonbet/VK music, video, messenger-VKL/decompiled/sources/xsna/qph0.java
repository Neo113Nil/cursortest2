package xsna;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pph0;

/* compiled from: SearchDatabaseQueryDelegate.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class qph0 extends FunctionReferenceImpl implements izs<pph0.a, io.reactivex.rxjava3.core.k<? extends nph0<Object>>> {
    @Override // xsna.izs
    public final io.reactivex.rxjava3.core.k<? extends nph0<Object>> invoke(pph0.a aVar) {
        final pph0.a aVar2 = aVar;
        final pph0 pph0Var = (pph0) this.receiver;
        pph0Var.getClass();
        io.reactivex.rxjava3.core.x cVar = new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.oph0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                tph0<Item> tph0Var = pph0.this.a;
                pph0.a aVar3 = aVar2;
                return tph0Var.a(aVar3.b, aVar3.a);
            }
        });
        long j = aVar2.c;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar = cVar.g(j);
        }
        io.reactivex.rxjava3.core.k<R> v = cVar.l(new i4f0(new az2(29, pph0Var, aVar2), 3)).v();
        io.reactivex.rxjava3.processors.c<s3q0> cVar2 = pph0Var.c;
        Objects.requireNonNull(cVar2, "other is null");
        return new io.reactivex.rxjava3.internal.operators.maybe.a0(new io.reactivex.rxjava3.internal.operators.maybe.g0(v, cVar2), new cxd0(new w110(aVar2, 24), 4));
    }
}

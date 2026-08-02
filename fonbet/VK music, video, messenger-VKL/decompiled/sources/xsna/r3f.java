package xsna;

import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.h3f;
import xsna.u3f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r3f implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ u3f b;
    public final /* synthetic */ t3f c;

    public /* synthetic */ r3f(u3f u3fVar, t3f t3fVar) {
        this.b = u3fVar;
        this.c = t3fVar;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        u3f u3fVar = this.b;
        boolean z = u3fVar instanceof u3f.b;
        t3f t3fVar = this.c;
        if (z) {
            return t3fVar.a((u3f.b) u3fVar);
        }
        if (!(u3fVar instanceof u3f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        final u3f.a aVar = (u3f.a) u3fVar;
        final h3f h3fVar = t3fVar.a;
        io.reactivex.rxjava3.internal.operators.maybe.d dVar = new io.reactivex.rxjava3.internal.operators.maybe.d(new io.reactivex.rxjava3.functions.n() { // from class: xsna.f3f
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                Object obj;
                h3f h3fVar2 = h3f.this;
                u3f u3fVar2 = aVar;
                synchronized (h3fVar2) {
                    h3f.a aVar2 = h3fVar2.a;
                    if (aVar2 == null) {
                        return io.reactivex.rxjava3.internal.operators.maybe.i.b;
                    }
                    if (aVar2.a.d() == u3fVar2.d() && ((aVar2.a.getCount() != aVar2.b.size() || aVar2.a.getCount() >= u3fVar2.getCount()) && epx.f(aVar2.c, o25.a().c()))) {
                        obj = io.reactivex.rxjava3.core.k.i(aVar2.b);
                        return obj;
                    }
                    obj = io.reactivex.rxjava3.internal.operators.maybe.i.b;
                    return obj;
                }
            }
        });
        nf1 nf1Var = new nf1(new l22(8, aVar, t3fVar), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.maybe.b0 b0Var = new io.reactivex.rxjava3.internal.operators.maybe.b0(dVar, lVar, nf1Var, lVar, kVar, kVar);
        u3f u3fVar2 = aVar.c;
        return new io.reactivex.rxjava3.internal.operators.maybe.e0(b0Var, u3fVar2 != null ? new io.reactivex.rxjava3.internal.operators.single.c(new r3f(u3fVar2, t3fVar)) : sn.b("Missed cache."));
    }
}

package xsna;

import kotlin.Pair;
import xsna.drz;
import xsna.hg1;
import xsna.lgg;
import xsna.x1s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class weg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ weg(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xeg xegVar = (xeg) this.d;
                xegVar.n = false;
                io.reactivex.rxjava3.subjects.d<rag> dVar = xegVar.k;
                io.reactivex.rxjava3.subjects.f<lgg> fVar = xegVar.m;
                fVar.onNext(lgg.a.a);
                fVar.onNext(lgg.g.a);
                if (this.c || dVar.P0() == null) {
                    dVar.onNext(dVar.P0() != null ? new rag(null, dVar.P0().b, null) : null);
                }
                return s3q0.a;
            case 1:
                i2s i2sVar = (i2s) this.d;
                drz.a aVar = (drz.a) obj;
                if (!this.c) {
                    return io.reactivex.rxjava3.core.q.T(new Pair(aVar, x1s.b.a));
                }
                io.reactivex.rxjava3.subjects.d<x1s> dVar2 = i2sVar.i.c;
                hg1.m1 m1Var = new hg1.m1();
                dVar2.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.i0(dVar2, m1Var).U(new hg1.l1()).U(new tt0(new f2s(aVar, 0), 20));
            default:
                we40 we40Var = (we40) this.d;
                we40Var.b6(null);
                if (!this.c) {
                    we40Var.a6(null);
                }
                bwt0.p0(we40Var.w, false);
                return s3q0.a;
        }
    }

    public /* synthetic */ weg(boolean z, i2s i2sVar) {
        this.b = 1;
        this.c = z;
        this.d = i2sVar;
    }
}

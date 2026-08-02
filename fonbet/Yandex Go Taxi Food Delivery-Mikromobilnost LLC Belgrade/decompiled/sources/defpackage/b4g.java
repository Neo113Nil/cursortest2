package defpackage;

import com.yandex.go.payments.data.p;
import com.yandex.go.payments.summary.domain.f;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.masstransit.datasource.routing.a;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class b4g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ b4g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                ysg ysgVar = (ysg) ((c0g) i6rVar).z.I2.get();
                q5z.h(ysgVar);
                return ysgVar;
            case 1:
                return ((c0g) i6rVar).J5();
            case 2:
                return (k870) ((c0g) i6rVar).Cw.get();
            case 3:
                return ((c0g) i6rVar).N5();
            case 4:
                return (v7j0) ((c0g) i6rVar).L0.get();
            case 5:
                atd0 V5 = ((c0g) i6rVar).V5();
                q5z.h(V5);
                return V5;
            case 6:
                dqe0 dqe0Var = (dqe0) ((c0g) i6rVar).z.s2.get();
                q5z.h(dqe0Var);
                return dqe0Var;
            case 7:
                b W5 = ((c0g) i6rVar).W5();
                q5z.h(W5);
                return W5;
            case 8:
                c cVar = (c) ((c0g) i6rVar).z.q8.get();
                q5z.h(cVar);
                return cVar;
            case 9:
                return (kpi0) ((c0g) i6rVar).z.Xj.get();
            case 10:
                zuj0 c = ((c0g) i6rVar).c();
                q5z.h(c);
                return c;
            case 11:
                return new a3l0((rqo) ((c0g) i6rVar).z.C.get());
            case 12:
                c0g c0gVar = (c0g) i6rVar;
                zzf zzfVar = c0gVar.z;
                return new yxf0(new a((zuj0) zzfVar.W.get(), zzfVar.j1()), (zuj0) c0gVar.z.W.get());
            case 13:
                oep0 a6 = ((c0g) i6rVar).a6();
                q5z.h(a6);
                return a6;
            case 14:
                return (p) ((c0g) i6rVar).z.rj.get();
            case 15:
                return (f) ((c0g) i6rVar).dD.get();
            case 16:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar2 = d0gVar.b;
                return new bpw0(c0gVar2, (cba0) d0gVar.a.vj.get(), (w030) c0gVar2.o0.get());
            case 17:
                p2y0 p2y0Var = (p2y0) ((c0g) i6rVar).z.J2.get();
                q5z.h(p2y0Var);
                return p2y0Var;
            case 18:
                e5y0 e5y0Var = (e5y0) ((c0g) i6rVar).v8.get();
                q5z.h(e5y0Var);
                return e5y0Var;
            case 19:
                return (b811) ((c0g) i6rVar).Ux.get();
            case 20:
                po21 C6 = ((c0g) i6rVar).C6();
                q5z.h(C6);
                return C6;
            case 21:
                i r1 = ((c0g) i6rVar).r1();
                q5z.h(r1);
                return r1;
            case 22:
                kr0 kr0Var = (kr0) ((c0g) i6rVar).Ec.get();
                q5z.h(kr0Var);
                return kr0Var;
            case 23:
                return ((c0g) i6rVar).u1();
            case 24:
                w3b0 v1 = ((c0g) i6rVar).v1();
                q5z.h(v1);
                return v1;
            case 25:
                return ((c0g) i6rVar).w1();
            case 26:
                tt2 k = ((c0g) i6rVar).k();
                q5z.h(k);
                return k;
            case 27:
                return ((c0g) i6rVar).z.c();
            case 28:
                lx4 y1 = ((c0g) i6rVar).y1();
                q5z.h(y1);
                return y1;
            default:
                e56 e56Var = (e56) ((c0g) i6rVar).z.Dm.get();
                q5z.h(e56Var);
                return e56Var;
        }
    }
}

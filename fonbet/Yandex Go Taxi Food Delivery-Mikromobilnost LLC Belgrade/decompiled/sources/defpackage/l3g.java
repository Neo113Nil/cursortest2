package defpackage;

import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.multimodal_route.interactors.h;
import com.yandex.go.payments.summary.domain.f;
import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.masstransit.datasource.routing.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class l3g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ l3g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                zzf zzfVar = ((c0g) i6rVar).z;
                return new b((tt2) zzfVar.n.get(), (f410) zzfVar.wo.get(), zzfVar.u());
            case 1:
                lz30 lz30Var = (lz30) ((c0g) i6rVar).Li.get();
                q5z.h(lz30Var);
                return lz30Var;
            case 2:
                return (ku40) ((c0g) i6rVar).Wx.get();
            case 3:
                return ((c0g) i6rVar).z.a1();
            case 4:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar = d0gVar.b;
                return new d((e) c0gVar.J9.get(), c0gVar.F5(), d0gVar.a.o());
            case 5:
                return new h((atd0) ((c0g) i6rVar).A.a.b.Ac.get());
            case 6:
                a A0 = ((c0g) i6rVar).A0();
                q5z.h(A0);
                return A0;
            case 7:
                ((c0g) i6rVar).getClass();
                return new n6a0();
            case 8:
                dne0 dne0Var = (dne0) ((c0g) i6rVar).z.d.get();
                q5z.h(dne0Var);
                return dne0Var;
            case 9:
                dqe0 dqe0Var = (dqe0) ((c0g) i6rVar).z.s2.get();
                q5z.h(dqe0Var);
                return dqe0Var;
            case 10:
                com.yandex.go.route.interactor.b W5 = ((c0g) i6rVar).W5();
                q5z.h(W5);
                return W5;
            case 11:
                uze0 uze0Var = (uze0) ((c0g) i6rVar).z.B2.get();
                q5z.h(uze0Var);
                return uze0Var;
            case 12:
                c cVar = (c) ((c0g) i6rVar).z.q8.get();
                q5z.h(cVar);
                return cVar;
            case 13:
                return (kpi0) ((c0g) i6rVar).z.Xj.get();
            case 14:
                zuj0 c = ((c0g) i6rVar).c();
                q5z.h(c);
                return c;
            case 15:
                return ((c0g) i6rVar).Z5();
            case 16:
                qbl0 qbl0Var = (qbl0) ((c0g) i6rVar).z.C2.get();
                q5z.h(qbl0Var);
                return qbl0Var;
            case 17:
                wiq0 c6 = ((c0g) i6rVar).c6();
                q5z.h(c6);
                return c6;
            case 18:
                return ((c0g) i6rVar).z.u();
            case 19:
                return ((c0g) i6rVar).x0();
            case 20:
                return ((c0g) i6rVar).d6();
            case 21:
                return ((c0g) i6rVar).h6();
            case 22:
                return (f) ((c0g) i6rVar).dD.get();
            case 23:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                c0g c0gVar2 = d0gVar2.b;
                return new bpw0(c0gVar2, (cba0) d0gVar2.a.vj.get(), (w030) c0gVar2.o0.get());
            case 24:
                k7x0 s6 = ((c0g) i6rVar).s6();
                q5z.h(s6);
                return s6;
            case 25:
                return ((c0g) i6rVar).z.A1();
            case 26:
                e5y0 e5y0Var = (e5y0) ((c0g) i6rVar).v8.get();
                q5z.h(e5y0Var);
                return e5y0Var;
            case 27:
                pwy0 w6 = ((c0g) i6rVar).w6();
                q5z.h(w6);
                return w6;
            case 28:
                return ((c0g) i6rVar).y6();
            default:
                po21 C6 = ((c0g) i6rVar).C6();
                q5z.h(C6);
                return C6;
        }
    }
}

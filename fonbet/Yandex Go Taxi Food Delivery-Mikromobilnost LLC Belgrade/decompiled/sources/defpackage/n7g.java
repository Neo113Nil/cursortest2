package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import com.yandex.go.scooters.payments.navigation.a;
import com.yandex.go.scooters.promotions.data.ScootersPromotionsApi;
import ru.yandex.taxi.layers.presentation.walkroute.simple.b;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.utils.timers.h;

/* loaded from: classes13.dex */
public final class n7g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ n7g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                return new a((fva0) d0gVar.a.F1.get(), (ngo0) d0gVar.b.p6.get());
            case 1:
                c0g c0gVar = ((c0g) i6rVar).A.a.b;
                return new fko0(i5m.a(c0gVar.V5), i5m.a(c0gVar.be));
            case 2:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                c0g c0gVar2 = d0gVar2.b;
                return new fcj0(i5m.a(c0gVar2.b9), i5m.a(c0gVar2.kb), i5m.a(d0gVar2.a.s2), c0gVar2.T9, (oep0) c0gVar2.T.get());
            case 3:
                on2 on2Var = (on2) ((c0g) i6rVar).z.w0.get();
                on2Var.getClass();
                ScootersPromotionsApi scootersPromotionsApi = (ScootersPromotionsApi) on2Var.a(GoApiName.TaxiV4, ScootersPromotionsApi.class);
                q5z.i(scootersPromotionsApi);
                return scootersPromotionsApi;
            case 4:
                jpo0 jpo0Var = (jpo0) ((c0g) i6rVar).A.a.k4.get();
                q5z.h(jpo0Var);
                return jpo0Var;
            case 5:
                zzf zzfVar = ((c0g) i6rVar).A.a.a;
                return new ru.yandex.taxi.scootersroute.a((yo5) zzfVar.Nq.get(), (el00) zzfVar.Dc.get());
            case 6:
                svo0 svo0Var = (svo0) ((c0g) i6rVar).z.Oi.get();
                q5z.h(svo0Var);
                return svo0Var;
            case 7:
                d0g d0gVar3 = ((c0g) i6rVar).A.a;
                return new s2p0(d0gVar3.b.Wd, d0gVar3.j4, 0);
            case 8:
                d0g d0gVar4 = ((c0g) i6rVar).A.a;
                c0g c0gVar3 = d0gVar4.b;
                Context context = (Context) c0gVar3.U.get();
                zzf zzfVar2 = d0gVar4.a;
                zuj0 zuj0Var = (zuj0) zzfVar2.W.get();
                ah00 ah00Var = (ah00) c0gVar3.Vb.get();
                return new h4p0(new fcj0(context, zuj0Var, ah00Var, new r400((ru.yandex.taxi.walkroute.a) c0gVar3.Ce.get(), new ru.yandex.taxi.scootersroute.a((yo5) zzfVar2.Nq.get(), (el00) zzfVar2.Dc.get())), c0gVar3.Ae));
            case 9:
                h hVar = (h) ((c0g) i6rVar).z.Kg.get();
                q5z.h(hVar);
                return hVar;
            case 10:
                return ((c0g) i6rVar).P2();
            case 11:
                return ((c0g) i6rVar).J1();
            case 12:
                oep0 n = ((c0g) i6rVar).n();
                q5z.h(n);
                return n;
            case 13:
                SensorManager sensorManager = (SensorManager) ((c0g) i6rVar).z.lm.get();
                q5z.h(sensorManager);
                return sensorManager;
            case 14:
                return ((c0g) i6rVar).z.u();
            case 15:
                return new qvq0(((c0g) i6rVar).A.a.b);
            case 16:
                hpr0 hpr0Var = (hpr0) ((c0g) i6rVar).Tb.get();
                q5z.h(hpr0Var);
                return hpr0Var;
            case 17:
                wrr0 wrr0Var = (wrr0) ((c0g) i6rVar).A.a.C4.get();
                q5z.h(wrr0Var);
                return wrr0Var;
            case 18:
                yrr0 yrr0Var = (yrr0) ((c0g) i6rVar).A.a.s4.get();
                q5z.h(yrr0Var);
                return yrr0Var;
            case 19:
                return ((c0g) i6rVar).e6();
            case 20:
                t4s0 t4s0Var = (t4s0) ((c0g) i6rVar).jd.get();
                q5z.h(t4s0Var);
                return t4s0Var;
            case 21:
                b bVar = (b) ((c0g) i6rVar).Ee.get();
                q5z.h(bVar);
                return bVar;
            case 22:
                ehs0 ehs0Var = (ehs0) ((c0g) i6rVar).z.te.get();
                q5z.h(ehs0Var);
                return ehs0Var;
            case 23:
                ru.yandex.taxi.statebar.a aVar = (ru.yandex.taxi.statebar.a) ((c0g) i6rVar).A.a.g.get();
                q5z.h(aVar);
                return aVar;
            case 24:
                k7x0 Z2 = ((c0g) i6rVar).Z2();
                q5z.h(Z2);
                return Z2;
            case 25:
                pwy0 c3 = ((c0g) i6rVar).c3();
                q5z.h(c3);
                return c3;
            case 26:
                ip11 u = ((c0g) i6rVar).u();
                q5z.h(u);
                return u;
            case 27:
                lg21 d3 = ((c0g) i6rVar).d3();
                q5z.h(d3);
                return d3;
            case 28:
                fn21 fn21Var = (fn21) ((c0g) i6rVar).z.a0.get();
                q5z.h(fn21Var);
                return fn21Var;
            default:
                po21 e3 = ((c0g) i6rVar).e3();
                q5z.h(e3);
                return e3;
        }
    }
}

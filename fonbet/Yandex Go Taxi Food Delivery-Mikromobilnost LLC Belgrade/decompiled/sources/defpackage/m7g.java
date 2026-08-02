package defpackage;

import com.yandex.go.scooters.data.ScootersPaymentApi;
import com.yandex.go.scooters.deposit.communication.a;
import com.yandex.go.scooters.ignition.data.d;
import com.yandex.go.scooters.ignition.data.e;
import com.yandex.go.scooters.ignition.data.i;
import com.yandex.go.scooters.ignition.data.j;
import com.yandex.go.scooters.passes.data.ScootersPassesApi;
import com.yandex.go.scooters.passes.data.ScootersPassesListApi;
import com.yandex.go.scooters.payments.data.c;
import com.yandex.go.scooters.payments.domain.b;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.ScootersEvolvingApi;
import ru.yandex.taxi.scooters.data.ScootersHistoryApi;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.data.p;

/* loaded from: classes13.dex */
public final class m7g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ m7g(i6r i6rVar, int i) {
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
                return new a((w030) d0gVar.b.o0.get(), (wdn0) d0gVar.z4.a, (zdn0) d0gVar.A4.a);
            case 1:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                tj60 tj60Var = (tj60) d0gVar2.b.t7.get();
                cen0 cen0Var = (cen0) d0gVar2.w4.a;
                zzf zzfVar = d0gVar2.a;
                return new com.yandex.go.scooters.deposit.notification.a(tj60Var, cen0Var, new com.yandex.go.scooters.deposit.notification.domain.a((qwo0) zzfVar.Ee.get(), (hen0) d0gVar2.p4.get(), new tdn0((rqo) zzfVar.C.get())), (fen0) d0gVar2.y4.a);
            case 2:
                hen0 hen0Var = (hen0) ((c0g) i6rVar).A.a.p4.get();
                q5z.h(hen0Var);
                return hen0Var;
            case 3:
                k kVar = (k) ((c0g) i6rVar).A.a.D4.get();
                q5z.h(kVar);
                return kVar;
            case 4:
                ign0 ign0Var = (ign0) ((c0g) i6rVar).Dz.get();
                q5z.h(ign0Var);
                return ign0Var;
            case 5:
                d0g d0gVar3 = ((c0g) i6rVar).A.a;
                return new kkn0((w030) d0gVar3.b.o0.get(), (fva0) d0gVar3.a.F1.get(), (xjn0) d0gVar3.o4.a);
            case 6:
                ScootersEvolvingApi c = d1b1.c((on2) ((c0g) i6rVar).z.w0.get());
                q5z.i(c);
                return c;
            case 7:
                oln0 oln0Var = (oln0) ((c0g) i6rVar).A.a.v4.get();
                q5z.h(oln0Var);
                return oln0Var;
            case 8:
                c0g c0gVar = ((c0g) i6rVar).A.a.b;
                return new b((ngo0) c0gVar.p6.get(), (c) c0gVar.q6.get());
            case 9:
                on2 on2Var = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var.getClass();
                ScootersHistoryApi scootersHistoryApi = (ScootersHistoryApi) on2Var.a(GoApiName.TaxiV4, ScootersHistoryApi.class);
                q5z.i(scootersHistoryApi);
                return scootersHistoryApi;
            case 10:
                com.yandex.go.scooters.ignition.data.a aVar = (com.yandex.go.scooters.ignition.data.a) ((c0g) i6rVar).z.cf.get();
                q5z.h(aVar);
                return aVar;
            case 11:
                com.yandex.go.scooters.ignition.data.b bVar = (com.yandex.go.scooters.ignition.data.b) ((c0g) i6rVar).z.Ke.get();
                q5z.h(bVar);
                return bVar;
            case 12:
                vqn0 vqn0Var = (vqn0) ((c0g) i6rVar).z.df.get();
                q5z.h(vqn0Var);
                return vqn0Var;
            case 13:
                d dVar = (d) ((c0g) i6rVar).z.bf.get();
                q5z.h(dVar);
                return dVar;
            case 14:
                zzf zzfVar2 = ((c0g) i6rVar).z;
                return new e(i5m.a(zzfVar2.Ge), zzfVar2.o1(), (xuo0) zzfVar2.He.get());
            case 15:
                ern0 ern0Var = (ern0) ((c0g) i6rVar).z.Pe.get();
                q5z.h(ern0Var);
                return ern0Var;
            case 16:
                gsn0 gsn0Var = (gsn0) ((c0g) i6rVar).z.Re.get();
                q5z.h(gsn0Var);
                return gsn0Var;
            case 17:
                i iVar = (i) ((c0g) i6rVar).z.jf.get();
                q5z.h(iVar);
                return iVar;
            case 18:
                psn0 psn0Var = (psn0) ((c0g) i6rVar).z.kf.get();
                q5z.h(psn0Var);
                return psn0Var;
            case 19:
                j jVar = (j) ((c0g) i6rVar).z.Le.get();
                q5z.h(jVar);
                return jVar;
            case 20:
                zzf zzfVar3 = ((c0g) i6rVar).z;
                return new com.yandex.go.scooters.live.domain.c(zzfVar3.a, (tt2) zzfVar3.n.get(), (com.yandex.go.analytics.b) zzfVar3.i3.get(), zzfVar3.p1());
            case 21:
                p pVar = (p) ((c0g) i6rVar).rd.get();
                q5z.h(pVar);
                return pVar;
            case 22:
                hyn0 hyn0Var = (hyn0) ((c0g) i6rVar).sd.get();
                q5z.h(hyn0Var);
                return hyn0Var;
            case 23:
                n0o0 n0o0Var = (n0o0) ((c0g) i6rVar).ud.get();
                q5z.h(n0o0Var);
                return n0o0Var;
            case 24:
                return ((c0g) i6rVar).z.q1();
            case 25:
                x4o0 x4o0Var = (x4o0) ((c0g) i6rVar).z.Ig.get();
                q5z.h(x4o0Var);
                return x4o0Var;
            case 26:
                on2 on2Var2 = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var2.getClass();
                ScootersPassesApi scootersPassesApi = (ScootersPassesApi) on2Var2.a(GoApiName.TaxiV4, ScootersPassesApi.class);
                q5z.i(scootersPassesApi);
                return scootersPassesApi;
            case 27:
                on2 on2Var3 = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var3.getClass();
                ScootersPassesListApi scootersPassesListApi = (ScootersPassesListApi) on2Var3.a(GoApiName.TaxiV4, ScootersPassesListApi.class);
                q5z.i(scootersPassesListApi);
                return scootersPassesListApi;
            case 28:
                on2 on2Var4 = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var4.getClass();
                ScootersPaymentApi scootersPaymentApi = (ScootersPaymentApi) on2Var4.a(GoApiName.TaxiV4, ScootersPaymentApi.class);
                q5z.i(scootersPaymentApi);
                return scootersPaymentApi;
            default:
                c cVar = (c) ((c0g) i6rVar).q6.get();
                q5z.h(cVar);
                return cVar;
        }
    }
}

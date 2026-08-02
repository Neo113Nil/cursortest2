package defpackage;

import com.yandex.go.analytics.b;
import com.yandex.go.taxi.order.chat.domain.a;
import com.yandex.go.taxi.order.z;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.order.k;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.orders.g;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes14.dex */
public final class dag implements xvf0 {
    public final /* synthetic */ int a;
    public final h6r b;

    public /* synthetic */ dag(h6r h6rVar, int i) {
        this.a = i;
        this.b = h6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h6r h6rVar = this.b;
        switch (i) {
            case 0:
                xdf xdfVar = (xdf) ((zzf) h6rVar).S3.get();
                q5z.h(xdfVar);
                return xdfVar;
            case 1:
                ysg ysgVar = (ysg) ((zzf) h6rVar).I2.get();
                q5z.h(ysgVar);
                return ysgVar;
            case 2:
                b r = ((zzf) h6rVar).r();
                q5z.h(r);
                return r;
            case 3:
                pit pitVar = (pit) ((zzf) h6rVar).mi.get();
                q5z.h(pitVar);
                return pitVar;
            case 4:
                pho phoVar = (pho) ((zzf) h6rVar).d0.get();
                q5z.h(phoVar);
                return phoVar;
            case 5:
                hvq hvqVar = (hvq) ((zzf) h6rVar).B7.get();
                q5z.h(hvqVar);
                return hvqVar;
            case 6:
                d1t d1tVar = (d1t) ((zzf) h6rVar).X4.get();
                q5z.h(d1tVar);
                return d1tVar;
            case 7:
                c cVar = (c) ((zzf) h6rVar).Y0.get();
                q5z.h(cVar);
                return cVar;
            case 8:
                MainUiAvailabilityMonitor mainUiAvailabilityMonitor = (MainUiAvailabilityMonitor) ((zzf) h6rVar).Y4.get();
                q5z.h(mainUiAvailabilityMonitor);
                return mainUiAvailabilityMonitor;
            case 9:
                return (k) ((zzf) h6rVar).O4.get();
            case 10:
                uw40 uw40Var = (uw40) ((zzf) h6rVar).L2.get();
                q5z.h(uw40Var);
                return uw40Var;
            case 11:
                return new xzi0((dne0) ((zzf) h6rVar).d.get());
            case 12:
                ci70 ci70Var = (ci70) ((zzf) h6rVar).Ma.get();
                q5z.h(ci70Var);
                return ci70Var;
            case 13:
                return (y180) ((zzf) h6rVar).K4.get();
            case 14:
                ysg ysgVar2 = (ysg) ((zzf) h6rVar).I2.get();
                q5z.h(ysgVar2);
                return ysgVar2;
            case 15:
                zzf zzfVar = (zzf) h6rVar;
                return new i780((n041) zzfVar.pi.get(), (a) zzfVar.o6.get());
            case 16:
                a880 a880Var = (a880) ((zzf) h6rVar).Z4.get();
                q5z.h(a880Var);
                return a880Var;
            case 17:
                z zVar = (z) ((zzf) h6rVar).Xh.get();
                q5z.h(zVar);
                return zVar;
            case 18:
                l lVar = (l) ((zzf) h6rVar).l4.get();
                q5z.h(lVar);
                return lVar;
            case 19:
                zzf zzfVar2 = (zzf) h6rVar;
                return new yx90((ysg) zzfVar2.I2.get(), (y180) zzfVar2.K4.get(), (zuj0) zzfVar2.W.get(), (l) zzfVar2.l4.get(), (com.yandex.go.taxi.order.provider.a) zzfVar2.o4.get(), (pit) zzfVar2.mi.get(), new lgb());
            case 20:
                g gVar = (g) ((zzf) h6rVar).G7.get();
                q5z.h(gVar);
                return gVar;
            case 21:
                return new ine0((fga0) ((zzf) h6rVar).Q8.get());
            case 22:
                vze0 vze0Var = (vze0) ((zzf) h6rVar).E4.get();
                q5z.h(vze0Var);
                return vze0Var;
            case 23:
                zzf zzfVar3 = (zzf) h6rVar;
                return new ozi0((tt2) zzfVar3.n.get(), (c) zzfVar3.Y0.get(), (TaxiApi) zzfVar3.eh.get(), (ysg) zzfVar3.I2.get(), new bd80((ysg) zzfVar3.I2.get(), (ru.yandex.taxi.am.k) zzfVar3.L0.get()), (ri1) zzfVar3.Tg.get());
            case 24:
                zzf zzfVar4 = (zzf) h6rVar;
                return new e0j0((pit) zzfVar4.mi.get(), (com.yandex.go.taxi.order.provider.a) zzfVar4.o4.get());
            case 25:
                return (j0l0) ((zzf) h6rVar).oi.get();
            case 26:
                return new oel0((pho) ((zzf) h6rVar).d0.get());
            case 27:
                return ((zzf) h6rVar).u();
            case 28:
                TaxiApi taxiApi = (TaxiApi) ((zzf) h6rVar).eh.get();
                q5z.h(taxiApi);
                return taxiApi;
            default:
                com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) ((zzf) h6rVar).o4.get();
                q5z.h(aVar);
                return aVar;
        }
    }
}

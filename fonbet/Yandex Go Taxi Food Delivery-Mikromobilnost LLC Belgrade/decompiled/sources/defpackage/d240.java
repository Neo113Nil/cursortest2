package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.go.navigator.address.NavigatorFullscreenDestinationSearchModalView;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.map_interactions.c;
import com.yandex.messaging.NotificationActionService;
import com.yandex.messenger.websdk.internal.NetworkManager21$receiver$1;
import java.util.Collections;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.promo.NotificationState;
import ru.yandex.taxi.masstransit.promo.a;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;
import ru.yandex.taxi.masstransit.stoproute.router.b;
import ru.yandex.taxi.masstransit.stoproute.ui.g;
import ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutApi;
import ru.yandex.taxi.masstransit.trains.checkout.j;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.search.address.view.h;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes6.dex */
public final /* synthetic */ class d240 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d240(a aVar, int i) {
        this.a = 4;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View addressSearchView;
        Object value;
        String onScrollChanged$lambda$0;
        zy11 onReceive$lambda$0;
        enp0 a;
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                e240 e240Var = (e240) obj;
                zzs zzsVar = e240Var.x;
                if (zzsVar != null) {
                    ((gh00) e240Var.y).D(cwa1.d(zzsVar), 17.0f, 200.0f, null);
                }
                return zy11.a;
            case 1:
                ru.yandex.taxi.masstransit.stoproute.ui.overlay.a aVar = (ru.yandex.taxi.masstransit.stoproute.ui.overlay.a) obj;
                gw30 gw30Var = aVar.b;
                return new fw30(aVar.c, new pi30(14), gw30Var.a, gw30Var.b);
            case 2:
                b340 b340Var = (b340) obj;
                zzs zzsVar2 = b340Var.x;
                if (zzsVar2 != null) {
                    ((gh00) b340Var.z).D(cwa1.d(zzsVar2), 17.0f, 200.0f, null);
                }
                return zy11.a;
            case 3:
                b bVar = (b) obj;
                m340 m340Var = bVar.J;
                xl10 xl10Var = bVar.Q;
                e4l0 e4l0Var = ((j340) bVar.n()).a;
                dc4 dc4Var = bVar.L;
                ah00 ah00Var = bVar.M;
                st0 st0Var = m340Var.a;
                return new g((tt2) ((xvf0) st0Var.a).get(), xl10Var, e4l0Var, dc4Var, ah00Var, (ru.yandex.taxi.masstransit.stoproute.mapper.a) ((ret) st0Var.z).get(), (p) ((epf) st0Var.A).get(), (ru.yandex.taxi.masstransit.stoproute.interactor.a) ((epf) st0Var.B).get(), (dz00) ((xvf0) st0Var.b).get(), (ffu0) ((xvf0) st0Var.c).get(), (jt30) ((i020) st0Var.C).get(), (MtPurchaseMapper) ((xvf0) st0Var.w).get(), (wr30) ((xvf0) st0Var.x).get(), (ls30) ((xvf0) st0Var.y).get(), (ih01) ((qcz0) st0Var.D).get());
            case 4:
                ((a) obj).e = NotificationState.SHOWED;
                return zy11.a;
            case 5:
                return (rwo0) ((dx9) obj).get();
            case 6:
                on2 on2Var = ((j) obj).a;
                on2Var.getClass();
                return (MtTrainCheckoutApi) on2Var.a(GoApiName.TaxiV4, MtTrainCheckoutApi.class);
            case 7:
                xv10 xv10Var = (xv10) obj;
                z711 z711Var = (z711) xv10Var.b;
                f fVar = (f) xv10Var.a;
                a811 a811Var = z711Var.a;
                return new y711(fVar, i5m.a(a811Var.a), a811Var.b);
            case 8:
                ((f600) obj).g();
                return zy11.a;
            case 9:
                ((t) obj).f(true);
                return zy11.a;
            case 10:
                e100 e100Var = (e100) obj;
                q3a0 a2 = ((f5g) ((w2a0) e100Var.c)).V().a();
                s2a0 V = ((f5g) ((w2a0) e100Var.c)).V();
                V.c = a2;
                V.a.g(a2);
                return zy11.a;
            case 11:
                return rc50.o(LayoutInflater.from(((xa50) obj).a));
            case 12:
                addressSearchView = ((NavigatorFullscreenDestinationSearchModalView) obj).getAddressSearchView();
                return addressSearchView;
            case 13:
                ((c) obj).c.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 14:
                ((com.yandex.go.navigator.f) obj).e.getClass();
                sjh sjhVar2 = uyj.a;
                return mdh.b;
            case 15:
                ((yc50) ((dd50) obj).Dg()).selectRoadEvent(null);
                return zy11.a;
            case 16:
                return rc50.o(LayoutInflater.from(((ve50) obj).a));
            case 17:
                r0 r0Var = ((yi50) obj).M.l.a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.FALSE));
                return zy11.a;
            case 18:
                ((z7c0) obj).invoke();
                return zy11.a;
            case 19:
                return new qj50((rj50) obj);
            case 20:
                tj50 tj50Var = (tj50) obj;
                dac0 dac0Var = tj50Var.D;
                s7c0 s7c0Var = tj50Var.H;
                jsj jsjVar = tj50Var.I;
                xsj xsjVar = new xsj(tj50Var, i2);
                com.yandex.go.places.impl.ui.nearby.flex.a aVar2 = new com.yandex.go.places.impl.ui.nearby.flex.a(tj50Var);
                return dac0.a(dac0Var, s7c0Var, tj50Var.S, jsjVar, Collections.singleton(tj50Var.N), xsjVar, aVar2, tj50Var.M, Collections.singleton(tj50Var.R), tj50Var.P.a().a(), null, HProv.ALG_TYPE_GR3410);
            case 21:
                onScrollChanged$lambda$0 = NestedScrollViewAdvanced.onScrollChanged$lambda$0((NestedScrollViewAdvanced) obj);
                return onScrollChanged$lambda$0;
            case 22:
                return (sci0) ((coil3.c) obj).a.e.getValue();
            case 23:
                return ((tu50) obj).a.toUpperCase(Locale.ROOT);
            case 24:
                onReceive$lambda$0 = NetworkManager21$receiver$1.onReceive$lambda$0((tw50) obj);
                return onReceive$lambda$0;
            case 25:
                uk10 uk10Var = (uk10) ((xv10) obj).a;
                e100 e100Var2 = uk10.b;
                if (e100Var2 != null) {
                    return e100Var2;
                }
                e100 e100Var3 = new e100((seu) uk10Var.a);
                uk10.b = e100Var3;
                return e100Var3;
            case 26:
                Drawable t = vng.t(dzg0.chevron_next, ((avj0) ((q660) obj).a).a);
                if (t != null) {
                    return new CustomImageSpan(t, 2, false, true, null, 20, null);
                }
                return null;
            case 27:
                ((g760) obj).T.invoke();
                return zy11.a;
            case 28:
                ((h) obj).G.a();
                return zy11.a;
            default:
                a = onp0.a((NotificationActionService) obj);
                return a;
        }
    }

    public /* synthetic */ d240(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

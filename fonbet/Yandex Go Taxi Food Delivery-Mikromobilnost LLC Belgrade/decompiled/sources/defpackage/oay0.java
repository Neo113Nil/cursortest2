package defpackage;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.TrackingFeedClientFeaturesExperiment;
import com.yandex.go.xiva.data.XivaApi;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.ui.YbScreenContainerView;
import com.yandex.go.zone.dto.ZoneInfoApi;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.dto.objects.v6;
import com.yandex.go.zone.repository.o;
import com.yandex.go.zone.repository.r;
import com.yandex.plus.log.api.LogPriority;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.cashback.sdk.t;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.web.deeplink.m;
import ru.yandex.taxi.widgets.data.repository.s;

/* loaded from: classes10.dex */
public final /* synthetic */ class oay0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oay0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ThemeChangeMode themeChangeMode;
        Object obj;
        int i = this.a;
        Map map = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pay0 pay0Var = (pay0) obj2;
                iid0 iid0Var = pay0Var.a;
                String str = (String) iid0Var.getValue(pay0Var, pay0.e[0]);
                if (str != null) {
                    ThemeChangeMode.Companion.getClass();
                    Iterator<E> it = ThemeChangeMode.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((ThemeChangeMode) obj).getId(), str)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    themeChangeMode = (ThemeChangeMode) obj;
                } else {
                    themeChangeMode = null;
                }
                if (themeChangeMode == null) {
                    iid0Var.setValue(pay0Var, pay0.e[0], null);
                }
                return bvf0.c(themeChangeMode);
            case 1:
                say0 say0Var = (say0) obj2;
                ThemeType themeType = (ThemeType) a.S(((Number) say0Var.a.getValue(say0Var, say0.c[0])).intValue(), ThemeType.a());
                if (themeType == null) {
                    themeType = ThemeType.LIGHT;
                }
                return bvf0.c(themeType);
            case 2:
                return Float.valueOf(((ol6) ((moy0) obj2)).b);
            case 3:
                return new CustomImageSpan(nnb1.b(((bry0) obj2).a), 1, false, true, null, 20, null);
            case 4:
                rqo rqoVar = ((a601) obj2).a;
                TrackingFeedClientFeaturesExperiment.Companion.getClass();
                return (TrackingFeedClientFeaturesExperiment) ((jbh) rqoVar).e(TrackingFeedClientFeaturesExperiment.i).c();
            case 5:
                return new o1r(new sb3(((s701) obj2).a.getDatabasePath(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY).toString(), "delivery_tracking_start_times.json"), new au50(24, new Moshi.Builder().build().adapter(Types.newParameterizedType(Map.class, String.class, Long.class))));
            case 6:
                z2b0 z2b0Var = ((oz01) obj2).b;
                String str2 = (String) z2b0Var.b.getValue(z2b0Var, z2b0.c[0]);
                if (!evu0.J(str2)) {
                    try {
                        wnt wntVar = z2b0Var.a;
                        auu0 auu0Var = auu0.a;
                        map = (Map) ((xnt) wntVar).c(str2, new k8u(auu0Var, new k8u(auu0Var, auu0Var, 1), 1));
                    } catch (Throwable th) {
                        jst.e.k(th, "error on parse translations");
                    }
                }
                if (map == null) {
                    map = b.f();
                }
                return oz01.b(map);
            case 7:
                Iterator it2 = ((ze11) obj2).c.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next();
                    it2.remove();
                }
                return zy11Var;
            case 8:
                yuf0 yuf0Var = (yuf0) obj2;
                yuf0Var.getClass();
                return new hcg(yuf0Var);
            case 9:
                return ((k721) obj2).a;
            case 10:
                return ((w821) obj2).a;
            case 11:
                return (m) ((wg21) obj2).a.get();
            case 12:
                return ((com.yandex.go.domain.interactor.b) obj2).d.a("UserPhotoNotificationStatePrefs");
            case 13:
                h6r h6rVar = (h6r) obj2;
                h6rVar.getClass();
                return new kcg(h6rVar);
            case 14:
                ((q2w) obj2).cancel();
                return zy11Var;
            case 15:
                OkHttpClient.a aVar = ((com.yandex.quark.webchat.auth.internal.b) obj2).d;
                aVar.i = false;
                return new OkHttpClient(aVar);
            case 16:
                return (jzs) ((t) obj2).f.a.getValue();
            case 17:
                return (v7d0) obj2;
            case 18:
                ru.yandex.taxi.widgets.data.repository.t tVar = (ru.yandex.taxi.widgets.data.repository.t) obj2;
                tpr t = e.t(new s(tVar.a.k, tVar));
                tVar.c.getClass();
                return e.F(t, uyj.a);
            case 19:
                ((ru.yandex.taxi.location.lbs.wifi.a) obj2).c.getClass();
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 20:
                pgz pgzVar = ((com.yandex.plus.pay.inapp.google.internal.operation.decorator.a) obj2).b;
                LogPriority logPriority = LogPriority.DEBUG;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "WithConnectionEstablishmentOperationDecorator", "Connection flow cancelled");
                }
                return zy11Var;
            case 21:
                l2o.a((a951) obj2);
                return zy11Var;
            case 22:
                on2 on2Var = ((com.yandex.go.xiva.data.a) obj2).a;
                on2Var.getClass();
                return (XivaApi) on2Var.a(GoApiName.TaxiV4, XivaApi.class);
            case 23:
                return ((com.yandex.go.payments_widgets.split.actions.payments.a) obj2).a;
            case 24:
                hr51 hr51Var = (hr51) obj2;
                YbScreenContainerView ybScreenContainerView = new YbScreenContainerView(hr51Var.a, null, 0, 0, 14, null);
                c.w(hr51Var.a.requireViewById(agh0.yandex_bank_screen_stub), ybScreenContainerView);
                return ybScreenContainerView;
            case 25:
                return ((jbh) ((rqo) ((u) obj2).b.get())).e(YbWalletEntryPointExperiment.i);
            case 26:
                on2 on2Var2 = ((o) obj2).a;
                on2Var2.getClass();
                return (ZoneInfoApi) on2Var2.a(GoApiName.TaxiV3, ZoneInfoApi.class);
            case 27:
                on2 on2Var3 = ((r) obj2).a;
                on2Var3.getClass();
                return (ZoneInfoApi) on2Var3.a(GoApiName.TaxiV3, ZoneInfoApi.class);
            case 28:
                v6 v6Var = ZoneTariffInfo.Companion;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ru.yandex.taxi.requirements.models.net.c cVar : ((ZoneTariffInfo) obj2).o) {
                    linkedHashMap.put(cVar.c, cVar);
                }
                return linkedHashMap;
            default:
                ((sz40) obj2).b(Boolean.FALSE);
                return zy11Var;
        }
    }
}

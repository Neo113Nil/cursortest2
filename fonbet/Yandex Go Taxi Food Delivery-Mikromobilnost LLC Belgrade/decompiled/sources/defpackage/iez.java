package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.go.loyalty.impl.selector.b;
import com.yandex.go.navigator.main_screen.o;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.ugc.entities.UGCItemExperiment;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.main.f;

/* loaded from: classes13.dex */
public final /* synthetic */ class iez implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ iez(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean updateButtonsMargins$lambda$0;
        int i = 5;
        switch (this.a) {
            case 0:
                return String.valueOf(((jzj) obj).b);
            case 1:
                hdd0 hdd0Var = (hdd0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(hdd0Var.b.name());
                sb.append(Extension.FIX_SPACE);
                sb.append(hdd0Var.c);
                sb.append(Extension.COLON_SPACE);
                sb.append(hdd0Var.d);
                Throwable th = hdd0Var.e;
                sb.append(th != null ? "\n".concat(ljo.b(th)) : null);
                return sb.toString();
            case 2:
                return ((TaxiOrder) obj).h.getB();
            case 3:
                ((b) obj).o1();
                return zy11.a;
            case 4:
                ((b) obj).n1();
                return zy11.a;
            case 5:
                c.c0(((rqe0) obj).a, null, 31);
                return zy11.a;
            case 6:
                ((lf00) obj).b().h();
                return zy11.a;
            case 7:
                ((s000) obj).a.r(new iez(i));
                return zy11.a;
            case 8:
                ((s000) obj).a.r(new iez(i));
                return zy11.a;
            case 9:
                ((s000) obj).a.r(new iez(i));
                return zy11.a;
            case 10:
                ((h200) obj).a.r(new iez(9));
                return zy11.a;
            case 11:
                ((Long) obj).getClass();
                return zy11.a;
            case 12:
                Session session = (Session) obj;
                Config config = session.getConfig();
                config.setLightEstimationMode(Config.LightEstimationMode.ENVIRONMENTAL_HDR);
                Config.DepthMode depthMode = Config.DepthMode.AUTOMATIC;
                if (!session.isDepthModeSupported(depthMode)) {
                    depthMode = Config.DepthMode.DISABLED;
                }
                config.setDepthMode(depthMode);
                config.setInstantPlacementMode(Config.InstantPlacementMode.DISABLED);
                config.setPlaneFindingMode(Config.PlaneFindingMode.HORIZONTAL);
                config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
                session.configure(config);
                return zy11.a;
            case 13:
                f fVar = (f) obj;
                ((f600) fVar.F.get()).f();
                oep0.b(fVar.I, fVar.e0);
                x770 x770Var = fVar.A.c;
                x770Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("open_reason", "menu_item");
                x770Var.a.a("SBPBinding.Tapped", hashMap, 1, new HashMap());
                return zy11.a;
            case 14:
                dm10 dm10Var = (dm10) ((f) obj).S.get();
                h3y h3yVar = dm10Var.a;
                nm10 nm10Var = dm10Var.c;
                boolean b = ((MainMenuPaymentMethodsSelectorExperiment) dm10Var.h.a.c()).getB();
                List l = ((a) dm10Var.b).l();
                if (b) {
                    nm10Var.a.b(MainMenuProcessor$MenuEntry.PAYMENT, new rm10(true, 23));
                } else if (l.size() == 1) {
                    dm10Var.e.b((m950) dm10Var.d.get(), new a5y0("open payment methods from menu", (o2y0) kotlin.collections.a.P(l), TaxiCardNavigationAction.OPEN_PAYMENT, 24));
                    ((f600) h3yVar.get()).f();
                } else if (l.size() > 1) {
                    ((pep0) dm10Var.g).f((m950) dm10Var.f.get(), nda0.a, hxx.a);
                    ((f600) h3yVar.get()).f();
                } else {
                    lv90.Companion.getClass();
                    nm10Var.a(lv90.g);
                }
                return zy11.a;
            case 15:
                h3y h3yVar2 = ((f) obj).B;
                if (((UGCItemExperiment) ((sq11) ((rq11) h3yVar2.get())).e.b()).b()) {
                    sq11 sq11Var = (sq11) ((rq11) h3yVar2.get());
                    Uri parse = Uri.parse(((UGCItemExperiment) sq11Var.e.b()).d.c);
                    String queryParameter = parse.getQueryParameter("id");
                    jj10 jj10Var = sq11Var.b;
                    jj10Var.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (queryParameter != null) {
                        hashMap2.put("id", queryParameter);
                    }
                    jj10Var.a.a("Menu.MapsUGCButtonTapped", hashMap2, 1, new HashMap());
                    ((f600) sq11Var.a.get()).f();
                    ((pep0) sq11Var.c).f((m950) sq11Var.d.get(), new ds11(parse, null), hxx.a);
                }
                return zy11.a;
            case 16:
                f fVar2 = (f) obj;
                tpj tpjVar = fVar2.E;
                n150 a = tpjVar.e.a();
                String str = a.a;
                String str2 = a.b;
                kj Ig = tpjVar.f.a.Ig();
                if (str2 == null) {
                    str2 = "";
                }
                boolean z = (str == null || str.length() == 0) ? false : true;
                if (Ig != null && !Ig.i) {
                    r2 = true;
                }
                u8w u8wVar = tpjVar.b;
                Boolean valueOf = Boolean.valueOf(r2);
                Boolean valueOf2 = Boolean.valueOf(z);
                u8wVar.getClass();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("rating", str2);
                hashMap3.put("photo_flg", valueOf);
                u8wVar.a.a("Menu.PromoCodeTapped", hashMap3, 1, g8e.v(hashMap3, "user_name_flg", valueOf2));
                u500 u500Var = fVar2.D;
                u500Var.getClass();
                u500Var.d(MainMenuProcessor$MenuEntry.PROMOCODE, null);
                return zy11.a;
            case 17:
                o.P(((ub00) obj).a);
                return zy11.a;
            case 18:
                o oVar = ((ub00) obj).a;
                oVar.B((m950) oVar.I.get(), new qf50(vf50.a, false), new vb00(oVar), new n1j0(oVar.Q()));
                return zy11.a;
            case 19:
                kr krVar = (kr) obj;
                if (krVar instanceof g1j0) {
                    g1j0 g1j0Var = (g1j0) krVar;
                    String str3 = g1j0Var.b;
                    if (str3 == null) {
                        str3 = g1j0Var.a;
                    }
                    if (jl40.l(str3, "async_data_placeholder")) {
                        r2 = true;
                    }
                }
                return Boolean.valueOf(r2);
            case 20:
                fnx0 fnx0Var = (fnx0) obj;
                return scc.g(fnx0Var.e, fnx0Var.c.Z);
            case 21:
                ((RoadEventsLayer) obj).deselectRoadEvent();
                return zy11.a;
            case 22:
                ((ye50) obj).a.W(dlm.c);
                return zy11.a;
            case 23:
                androidx.compose.ui.semantics.f.d((mnq0) obj);
                return zy11.a;
            case 24:
                updateButtonsMargins$lambda$0 = MapButtonsView.updateButtonsMargins$lambda$0((View) obj);
                return Boolean.valueOf(updateButtonsMargins$lambda$0);
            case 25:
                return new pg00((v81) obj);
            case 26:
                return new rg00((lww0) obj);
            case 27:
                return DirectionsFactory.getInstance().createCarparksLayer((MapWindow) obj);
            case 28:
                ((RoadEventsLayer) obj).deselectRoadEvent();
                return zy11.a;
            default:
                return Boolean.valueOf(((v35) ((ym00) obj)).h() == MapObjectComponentType.BUBBLE);
        }
    }
}

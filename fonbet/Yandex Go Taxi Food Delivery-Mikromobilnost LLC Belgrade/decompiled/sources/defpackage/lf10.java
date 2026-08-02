package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.lazy.b;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.w;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.d;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final /* synthetic */ class lf10 implements tls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ lf10(pav pavVar, d dVar, k7x0 k7x0Var, eyu0 eyu0Var, yp2 yp2Var, zuj0 zuj0Var, c cVar, pwy0 pwy0Var) {
        this.a = 1;
        this.c = pavVar;
        this.w = dVar;
        this.x = k7x0Var;
        this.y = eyu0Var;
        this.z = yp2Var;
        this.A = zuj0Var;
        this.b = cVar;
        this.B = pwy0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Route route;
        zy11 zy11Var;
        lm30 lm30Var;
        lm30 lm30Var2;
        String str;
        String queryParameter;
        String queryParameter2;
        String str2;
        Double i;
        MtHubLeadingItemKind mtHubLeadingItemKind;
        MtHubLeadingItemKind mtHubLeadingItemKind2;
        int i2 = this.a;
        int i3 = 4;
        zy11 zy11Var2 = zy11.a;
        String str3 = null;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.b;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        Object obj8 = this.w;
        Object obj9 = this.c;
        switch (i2) {
            case 0:
                return new mf10((c1f) obj7, (n170) obj6, (j1s0) obj3, (w3s0) obj9, (x3s0) obj2, (t4s0) obj8, (View) obj, (a) obj5, (c) obj4);
            case 1:
                dnt dntVar = (dnt) obj;
                dntVar.a = (pav) obj9;
                dntVar.b = (d) obj8;
                dntVar.c = (k7x0) obj7;
                dntVar.d = (eyu0) obj6;
                dntVar.e = (yp2) obj5;
                dntVar.f = (zuj0) obj3;
                dntVar.h = (c) obj4;
                dntVar.g = (pwy0) obj2;
                return zy11Var2;
            case 2:
                String str4 = (String) obj8;
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                String str7 = (String) obj5;
                nw70 nw70Var = (nw70) obj4;
                oy80 oy80Var = (oy80) obj3;
                String str8 = (String) obj2;
                bt5 bt5Var = ((aia0) obj9).a;
                rwo rwoVar = bt5Var.g;
                sv90 sv90Var = qv90.a;
                boolean z = bt5Var.p;
                sv90Var.getClass();
                iho c = y891.c(z ? "existing_card_payment_v2" : "existing_card_payment", vfc.i(0, "card_id", str4, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, b64.l("Оплата привязанной картой ", str4, " ", z ? "через PSP" : "через Trust")));
                md51 a = bt5Var.a(str6);
                rs5 rs5Var = new rs5(bt5Var, str5, str4, str7, str8, nw70Var, oy80Var, 0);
                ymx ymxVar = (ymx) a;
                ymxVar.getClass();
                md51 j = ymx.j(ymxVar, rs5Var, null, 5);
                ((y22) rwoVar).b(c, j);
                return j;
            case 3:
                oz40 oz40Var = (oz40) obj9;
                List list = (List) oz40Var.getValue();
                ((m6y) ((u6y) obj)).f(list.size(), null, new pcx0(list, 4), new androidx.compose.runtime.internal.a(2039820996, new oyx0(list, (tls) obj8, (yx40) obj7, (tx40) obj6, oz40Var, (tls) obj5, (b) obj4, (oz40) obj3, (wls) obj2), true));
                return zy11Var2;
            case 4:
                return new w((c1f) obj7, (n170) obj6, (j1s0) obj3, (w3s0) obj9, (x3s0) obj2, (t4s0) obj8, (View) obj, (a) obj5, (c) obj4);
            default:
                Route route2 = (Route) obj9;
                Route route3 = (Route) obj8;
                List list2 = (List) obj7;
                tpr tprVar = (tpr) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                kz6 kz6Var = (kz6) obj4;
                String str9 = (String) obj3;
                dd31 dd31Var = (dd31) obj2;
                vw20 vw20Var = (vw20) obj;
                if (route2 != null) {
                    k kVar = dd31Var.b0;
                    kVar.getClass();
                    BoundingBox a2 = route2.getGeometry().getPoints().isEmpty() ? null : ru.yandex.taxi.map_common.map.k.a(new ft20(i3, route2));
                    if (a2 != null) {
                        ((gh00) kVar.a).A(a2, null);
                        kVar.b.a(false);
                    }
                }
                ww20 ww20Var = vw20Var.a;
                m950 m950Var = (m950) ww20Var.G.get();
                Screen screen = Screen.MOBILITY_HUB_TRANSPORT_DETAILS;
                MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = jl40.l(ww20Var.F, "transport") ? MtDetailedRouteAnalyticSource.Transport : MtDetailedRouteAnalyticSource.Hub;
                if (tprVar == null) {
                    tprVar = new g92(2, null);
                }
                tpr tprVar2 = tprVar;
                if (kz6Var != null) {
                    pzu pzuVar = kz6Var.c;
                    fzu fzuVar = pzuVar instanceof fzu ? (fzu) pzuVar : null;
                    if (fzuVar == null || (str = fzuVar.a) == null) {
                        route = route2;
                        zy11Var = zy11Var2;
                        lm30Var2 = null;
                    } else {
                        Uri parse = Uri.parse(str);
                        if (jl40.l(parse.getAuthority(), "scooters") && parse.getQueryParameters("scooters_source").contains("hub") && (queryParameter = parse.getQueryParameter("end-lat")) != null && (queryParameter2 = parse.getQueryParameter("end-lon")) != null) {
                            String queryParameter3 = parse.getQueryParameter("source");
                            if (queryParameter3 == null) {
                                route = route2;
                                zy11Var = zy11Var2;
                                str2 = str;
                                str3 = null;
                            } else {
                                route = route2;
                                String queryParameter4 = parse.getQueryParameter("multimodal_offer_id");
                                zy11Var = zy11Var2;
                                str2 = str;
                                Uri.Builder appendQueryParameter = parse.buildUpon().path("qr").clearQuery().appendQueryParameter("end_lat", queryParameter).appendQueryParameter("end_lon", queryParameter2).appendQueryParameter("source", queryParameter3);
                                Iterator<T> it = parse.getQueryParameters("scooters_source").iterator();
                                while (it.hasNext()) {
                                    appendQueryParameter.appendQueryParameter("scooters_source", (String) it.next());
                                }
                                String queryParameter5 = parse.getQueryParameter("success_completion_radius_m");
                                if (queryParameter5 != null && (i = avu0.i(queryParameter5)) != null) {
                                    appendQueryParameter.appendQueryParameter("success_completion_radius_m", String.valueOf((int) i.doubleValue()));
                                }
                                if (queryParameter4 != null) {
                                    appendQueryParameter.appendQueryParameter("multimodal_offer_id", queryParameter4);
                                }
                                str3 = appendQueryParameter.build().toString();
                            }
                        } else {
                            route = route2;
                            zy11Var = zy11Var2;
                            str2 = str;
                        }
                        CharSequence charSequence = kz6Var.b;
                        HubLeadingItemKind hubLeadingItemKind = kz6Var.d;
                        int i4 = hubLeadingItemKind == null ? -1 : tw20.a[hubLeadingItemKind.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1) {
                                mtHubLeadingItemKind2 = MtHubLeadingItemKind.PAYMENT;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                mtHubLeadingItemKind2 = MtHubLeadingItemKind.TRANSPORT;
                            }
                            mtHubLeadingItemKind = mtHubLeadingItemKind2;
                        } else {
                            mtHubLeadingItemKind = null;
                        }
                        lm30Var2 = new lm30(charSequence, str2, mtHubLeadingItemKind, kz6Var.e, kz6Var.f, str3 != null ? new w6g0(str3, kz6Var.a) : null);
                    }
                    lm30Var = lm30Var2;
                } else {
                    route = route2;
                    zy11Var = zy11Var2;
                    lm30Var = null;
                }
                ww20Var.D(m950Var, new ng30(route3, list2, screen, mtDetailedRouteAnalyticSource, route, tprVar2, arrayList, lm30Var, MtDetailedRouteAnalyticType.Vertical, str9, route == null), new sw20(ww20Var, vw20Var.b, 2));
                return zy11Var;
        }
    }

    public /* synthetic */ lf10(x3s0 x3s0Var, a aVar, t4s0 t4s0Var, c1f c1fVar, c cVar, w3s0 w3s0Var, n170 n170Var, j1s0 j1s0Var) {
        this.a = 4;
        this.B = x3s0Var;
        this.z = aVar;
        this.w = t4s0Var;
        this.x = c1fVar;
        this.b = cVar;
        this.c = w3s0Var;
        this.y = n170Var;
        this.A = j1s0Var;
    }

    public /* synthetic */ lf10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.b = obj6;
        this.A = obj7;
        this.B = obj8;
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.mapkit.navigation.automotive.layer.BalloonView;
import com.yandex.mapkit.navigation.automotive.layer.RouteView;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionInputType;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.ui.recycler.a;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes10.dex */
public final /* synthetic */ class bmh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bmh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 initInputField$lambda$1;
        hki hkiVar;
        zy11 initViews$lambda$1$0;
        int i = this.a;
        int i2 = 23;
        int i3 = 25;
        boolean z = true;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((hly0) obj2).d.invoke((lly0) obj);
                return zy11Var;
            case 1:
                ((sls) obj2).invoke();
                ((tuh) obj).b.a(false);
                return zy11Var;
            case 2:
                ((jvh) obj2).a.invoke(((kvh) obj).e);
                return zy11Var;
            case 3:
                initInputField$lambda$1 = DeliveryAddressCorrectionView.initInputField$lambda$1((DeliveryAddressCorrectionView) obj2, (DeliveryAddressCorrectionInputType) obj);
                return initInputField$lambda$1;
            case 4:
                rvh rvhVar = (rvh) obj2;
                zo31 zo31Var = (zo31) rvhVar.R;
                hki hkiVar2 = (hki) obj;
                if (rvhVar.F() != -1) {
                    if (((c1x) zo31Var).c.getVisibility() == 0) {
                        rvhVar.S.a();
                        ((c1x) zo31Var).c.hide(true);
                    } else {
                        z = false;
                    }
                    rvhVar.U.a(new nq(hkiVar2, z));
                }
                return zy11Var;
            case 5:
                a aVar = (a) obj2;
                DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget = (DeliveryPointFocusHolder$FocusTarget) obj;
                if (aVar.F() != -1 && (hkiVar = aVar.e0) != null) {
                    ((mai) aVar.W.c).a(new tp(hkiVar, deliveryPointFocusHolder$FocusTarget));
                }
                return zy11Var;
            case 6:
                ((tls) obj2).invoke(((fxh) obj).c);
                return zy11Var;
            case 7:
                h650 h650Var = (h650) obj2;
                h3y h3yVar = ((com.yandex.go.logistics.cargo_flow.a) obj).H;
                if (h650Var instanceof g650) {
                    ((k9i) h3yVar.get()).a(((g650) h650Var).a);
                } else {
                    if (!(h650Var instanceof f650)) {
                        w511.b();
                        return null;
                    }
                    ((k9i) h3yVar.get()).b.a();
                }
                return zy11Var;
            case 8:
                pex0 pex0Var = (pex0) obj2;
                com.yandex.go.logistics.cargo_flow.a aVar2 = (com.yandex.go.logistics.cargo_flow.a) obj;
                if (pex0Var == null) {
                    return null;
                }
                aVar2.d0.c(SelectionOrigin.REDIRECT, pex0Var, false);
                return zy11Var;
            case 9:
                return new myh((w030) obj2, (lzh) obj);
            case 10:
                initViews$lambda$1$0 = DeliveryContactsModalView.initViews$lambda$1$0((DeliveryContactsModalView) obj2, (AnimatedListItemInputComponent) obj);
                return initViews$lambda$1$0;
            case 11:
                rai raiVar = (rai) obj;
                lr lrVar = ((zlj0) obj2).a().c;
                if (lrVar != null) {
                    raiVar.a.a(lrVar);
                }
                return zy11Var;
            case 12:
                ani aniVar = (ani) obj;
                lr lrVar2 = ((zlj0) obj2).a().c;
                if (lrVar2 != null) {
                    ((mai) aniVar.U).a(lrVar2);
                }
                return zy11Var;
            case 13:
                bui buiVar = (bui) obj2;
                w030 w030Var = buiVar.f;
                wsi wsiVar = buiVar.e;
                wsiVar.getClass();
                CoreWebViewConfig.a aVar3 = new CoreWebViewConfig.a();
                aVar3.b = (String) obj;
                aVar3.e = false;
                g gVar = wsiVar.b;
                aVar3.c = gVar.b();
                aVar3.b("Authorization", kp50.h(gVar.b()));
                String Hg = ((h) wsiVar.c).Hg();
                if (Hg == null) {
                    Hg = "";
                }
                aVar3.b("X-YaTaxi-UserId", Hg);
                aVar3.g = true;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar3.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                uiWebViewConfig.setShouldShowCloseButton(true);
                uiWebViewConfig.setCloseButtonPosition(1);
                uiWebViewConfig.setTitleHorizontalAlignment(1);
                uiWebViewConfig.setShouldUseCached(false);
                uiWebViewConfig.setModalViewMode(new UiWebViewConfig.Slideable(false, null, false, false, 14, null));
                uiWebViewConfig.setCanDrag(false);
                w030Var.s(vf41.a(wsiVar.a, uiWebViewConfig, new x8e(i2), null, null, 252), true);
                return zy11Var;
            case 14:
                tls tlsVar = (tls) obj;
                PaymentMethod$Type a = ((c) ((bui) obj2).k).g.c().a();
                tlsVar.invoke(a != null ? a.getCode() : null);
                return zy11Var;
            case 15:
                com.yandex.go.taxi.order.details.v1.elements.buttons.h hVar = (com.yandex.go.taxi.order.details.v1.elements.buttons.h) obj2;
                hVar.d.c("SafetyCenter");
                ((f) hVar.e).u0(((TaxiOrder) obj).a);
                return zy11Var;
            case 16:
                com.yandex.go.taxi.order.details.v1.elements.buttons.h hVar2 = (com.yandex.go.taxi.order.details.v1.elements.buttons.h) obj2;
                hVar2.d.c("TransportInfo");
                hVar2.k.a(Uri.parse(((OrderStatusInfo.TransportInfo) obj).a), DeeplinkSource.TOTW_COMMUNICATIONS);
                return zy11Var;
            case 17:
                return ((nhj) obj2).a.f((aiw0) obj, new nni(27), NetworkServiceRetryingStrategy.noRetry);
            case 18:
                return ((nhj) obj2).a.f((yhw0) obj, new nni(i3), NetworkServiceRetryingStrategy.noRetry);
            case 19:
                return ((nhj) obj2).a.f((yu5) obj, new nni(24), NetworkServiceRetryingStrategy.noRetry);
            case 20:
                return ((nhj) obj2).a.f((aiw0) obj, new nni(26), NetworkServiceRetryingStrategy.noRetry);
            case 21:
                return ((nhj) obj2).a.f((snz0) obj, new nni(28), NetworkServiceRetryingStrategy.noRetry);
            case 22:
                return ((nhj) obj2).a.f((m560) obj, new lhj(i4), NetworkServiceRetryingStrategy.noRetry);
            case 23:
                return ((nhj) obj2).a.f((hx11) obj, new nni(29), NetworkServiceRetryingStrategy.noRetry);
            case 24:
                return ((nhj) obj2).a.f((zhw0) obj, new nni(22), NetworkServiceRetryingStrategy.noRetry);
            case 25:
                return ((nhj) obj2).a.f((yhw0) obj, new nni(i2), NetworkServiceRetryingStrategy.noRetry);
            case 26:
                ((o3) obj2).b++;
                return (md51) ((sls) obj).invoke();
            case 27:
                ((tls) obj2).invoke(((hlj) obj).b);
                return zy11Var;
            case 28:
                RouteView routeView = (RouteView) obj;
                String a2 = ((pzs) obj2).d.a(ReferenceType.ROUTE_VIEW, routeView);
                if (!routeView.getRoute().getMetadata().getFlags().getPredicted()) {
                    List<BalloonView> balloonViews = routeView.getBalloonViews();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : balloonViews) {
                        if (((BalloonView) obj3).getBalloon().getManoeuvre() != null) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((BalloonView) it.next()).setIsEnabled(false);
                    }
                    List<BalloonView> balloonViews2 = routeView.getBalloonViews();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : balloonViews2) {
                        BalloonView balloonView = (BalloonView) obj4;
                        if (balloonView.getBalloon().getLaneSign() != null || balloonView.getBalloon().getManoeuvreWithLaneSign() != null) {
                            arrayList2.add(obj4);
                        }
                    }
                    int i5 = 0;
                    for (Object obj5 : kotlin.collections.a.x0(arrayList2, new oe7(4, new gse(i3)))) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            scc.m();
                            throw null;
                        }
                        ((BalloonView) obj5).setIsEnabled(i5 == 0);
                        i5 = i6;
                    }
                }
                return b.i(new Pair("type", "onBalloonViewsChanged"), new Pair("routeId", a2));
            default:
                return b.i(new Pair("type", "onRouteViewTap"), new Pair("routeId", ((omj) obj2).d.a(ReferenceType.ROUTE_VIEW, (RouteView) obj)));
        }
    }
}

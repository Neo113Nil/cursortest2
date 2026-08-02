package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.order.tariffs_suggest.ui.OrderWithTariffButtonView;
import com.yandex.go.taxi.order.cancel.v2.data.d;
import com.yandex.go.taxi.order.e0;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.overlay.LogMapKitRouteExperiment;
import com.yandex.go.taxi.order.recenter.c;
import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.b;
import com.yandex.go.taxi.order.superapp.orders.ui.OrdersListModalView;
import com.yandex.go.taxi.order.view.l;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.tje;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.a;
import ru.yandex.taxi.search.address.view.h;
import ru.yandex.taxi.settings.main.f;

/* loaded from: classes14.dex */
public final class i350 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i350(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        if (r0.f(r1, r10) > (r2.width() / 2.0d)) goto L50;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapWindow mapWindow;
        Map map;
        DrivingRoute drivingRoute;
        OrderScreen b;
        TaxiMapView h;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                z500 z500Var = (z500) fVar.Dg();
                if (fVar.Eg()) {
                    z500Var.Z4(zzg0.ic_gift);
                    z500Var.cb(kyh0.promocode_discounts);
                    z500Var.of(kyh0.promocode_hint);
                }
                break;
            case 1:
                ((j650) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 2:
                gh00 gh00Var = (gh00) ((ed50) this.b).b;
                TaxiMapView h2 = gh00Var.h();
                if (h2 != null) {
                    h2.forceDriveMode();
                }
                TaxiMapView h3 = gh00Var.h();
                if (h3 != null && (mapWindow = h3.getMapWindow()) != null && (map = mapWindow.getMap()) != null) {
                    map.setHdModeEnabled(true);
                    map.resetMapStyles();
                }
                break;
            case 3:
                ((af50) this.b).Kg();
                break;
            case 4:
                ((e) this.b).Q.l(((gd61) obj).a);
                break;
            case 5:
                Pair pair = (Pair) obj;
                break;
            case 6:
                RecenterType recenterType = (RecenterType) obj;
                c cVar = (c) this.b;
                k760 k760Var = (k760) cVar.Dg();
                int i = l760.a[recenterType.ordinal()];
                k760Var.setImageResId(i != 1 ? i != 2 ? f1h0.ic_all_route : f1h0.ic_all_route : f1h0.ic_location_fill_24);
                ((k760) cVar.Dg()).setNextRecenterType(recenterType);
                break;
            case 7:
                ((k760) this.b).setButtonVisibility(((Boolean) obj).booleanValue());
                break;
            case 8:
                ((h) this.b).r(new qu(9));
                break;
            case 9:
                List list = (List) obj;
                qhx0 qhx0Var = ((a) this.b).d;
                if (qhx0Var != null) {
                    qhx0Var.submitList(list, null);
                }
                break;
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    ((lk70) this.b).r(new qu(9));
                }
                break;
            case 11:
                vj70 vj70Var = ((wk70) this.b).B;
                tk70 tk70Var = (tk70) ((d) vj70Var.a).g.a.getValue();
                if (tk70Var != null) {
                    o61 o61Var = vj70Var.b;
                    String str = tk70Var.b;
                    o61Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", str);
                    o61Var.a.a("CancelModalCard.OrderStatusChanged", hashMap, 1, new HashMap());
                }
                break;
            case 12:
                com.yandex.go.taxi.order.common.f fVar2 = (com.yandex.go.taxi.order.common.f) this.b;
                if (!fVar2.C && ((com.yandex.go.taxi.order.perf.experiment.d) fVar2.t).b().g) {
                    break;
                } else {
                    break;
                }
                break;
            case 13:
                Object b2 = ((com.yandex.go.taxi.order.feedback.a) this.b).b((Pair) obj, continuation);
                if (b2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                ((fr00) ((zy70) this.b).b).a((BoundingBox) obj, true, null);
                break;
            case 15:
                ((Number) obj).intValue();
                com.yandex.go.taxi.order.map.overlay.recenter.a aVar = (com.yandex.go.taxi.order.map.overlay.recenter.a) this.b;
                if (aVar.k.b()) {
                    aVar.g.Xb(false);
                }
                break;
            case 16:
                bz70 bz70Var = (bz70) this.b;
                r0 r0Var = bz70Var.e;
                az70 az70Var = new az70(bz70Var.a.l(), bz70Var.a());
                r0Var.getClass();
                r0Var.m(null, az70Var);
                break;
            case 17:
                js00 js00Var = (js00) obj;
                com.yandex.go.taxi.order.map.overlay.c cVar2 = (com.yandex.go.taxi.order.map.overlay.c) this.b;
                cVar2.C.M0 = js00Var;
                if (cVar2.x0 != null) {
                    ((b2l0) cVar2.D.get()).c(js00Var);
                    tu70 tu70Var = cVar2.A0;
                    if (tu70Var != null) {
                        cVar2.f2(tu70Var);
                    }
                }
                break;
            case 18:
                ool0 ool0Var = (ool0) obj;
                kl00 kl00Var = (kl00) this.b;
                kl00Var.getClass();
                nol0 nol0Var = ool0Var instanceof nol0 ? (nol0) ool0Var : null;
                if (nol0Var != null && (drivingRoute = nol0Var.a) != null) {
                    LogMapKitRouteExperiment logMapKitRouteExperiment = (LogMapKitRouteExperiment) kl00Var.c.b();
                    DriveState c = kl00Var.a.c();
                    boolean contains = logMapKitRouteExperiment.b.contains(kl00Var.a.d());
                    boolean z = c == DriveState.DRIVING || c == DriveState.WAITING;
                    if (contains && z) {
                        String str2 = kl00Var.a.b().l.Z;
                        if (str2 == null) {
                            str2 = "";
                        }
                        reu reuVar = kl00Var.b;
                        String str3 = kl00Var.a.b().a;
                        String driveState = kl00Var.a.c().toString();
                        String routeId = drivingRoute.getRouteId();
                        double value = drivingRoute.getMetadata().getWeight().getTimeWithTraffic().getValue();
                        pj pjVar = (pj) reuVar.b;
                        Double valueOf = Double.valueOf(value);
                        pjVar.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("traceId", str2);
                        if (str3 != null) {
                            hashMap2.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str3);
                        }
                        if (driveState != null) {
                            hashMap2.put("orderStatus", driveState);
                        }
                        if (routeId != null) {
                            hashMap2.put("routeId", routeId);
                        }
                        hashMap2.put("timeWithTraffic", valueOf);
                        pjVar.a.a("MapKitRouteReceived", hashMap2, 1, new HashMap());
                    }
                }
                break;
            case 19:
                com.yandex.go.payments.order.domain.e eVar = (com.yandex.go.payments.order.domain.e) this.b;
                ((com.yandex.go.payments.paymentlist.data.c) eVar.G.j).e();
                if (((Set) obj).isEmpty()) {
                    eVar.r(new qu(9));
                }
                break;
            case 20:
                vpl0 vpl0Var = (vpl0) obj;
                l780 l780Var = (l780) this.b;
                l780Var.getClass();
                if (vpl0Var.a) {
                    ((k780) l780Var.Dg()).showSafetyCenterButton(vpl0Var.a());
                } else {
                    ((k780) l780Var.Dg()).hideSafetyCenterButton();
                }
                break;
            case 21:
                e0 e0Var = (e0) this.b;
                AtomicInteger atomicInteger = e0.n;
                e0Var.b();
                break;
            case 22:
                l lVar = (l) this.b;
                OrderScreen orderScreen = (OrderScreen) obj;
                if (orderScreen != null && (b = lVar.b()) != orderScreen && b != OrderScreen.LINKED_ORDER_DETAILS && lVar.f.b == null) {
                    ra80 ra80Var = new ra80(orderScreen, null, 14);
                    r0 r0Var2 = lVar.j;
                    r0Var2.getClass();
                    r0Var2.m(null, ra80Var);
                    lVar.c.c();
                }
                break;
            case 23:
                ((nb80) this.b).E4((b47) obj);
                break;
            case 24:
                ((OrderWithTariffButtonView) this.b).renderButtonsContainerShadow((Drawable) obj);
                break;
            case 25:
                float floatValue = ((Number) obj).floatValue();
                OrdersListModalView ordersListModalView = (OrdersListModalView) this.b;
                ordersListModalView.heightRatio = floatValue;
                ordersListModalView.requestLayout();
                break;
            case 26:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                r0 r0Var3 = ((com.yandex.go.taxi.order.search.overlay.ordinary.domain.d) this.b).j;
                r0Var3.getClass();
                r0Var3.m(null, bool);
                break;
            case 27:
                ((wd80) ((b) this.b).Dg()).T1(((Boolean) obj).booleanValue());
                break;
            case 28:
                final ehq0 ehq0Var = (ehq0) obj;
                final com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c cVar3 = (com.yandex.go.places.organization.card.impl.ui.card.map.overlay.c) this.b;
                LinkedHashMap linkedHashMap = cVar3.I;
                ah00 ah00Var = cVar3.F;
                linkedHashMap.put(ehq0Var.b.getId(), ehq0Var);
                int i2 = xf80.a[cVar3.z.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        cVar3.Kg(ehq0Var, (r4 & 2) == 0, new jiu(13));
                    } else if (i2 == 3) {
                        Point geometry = ehq0Var.b.getGeometry();
                        Point point = cVar3.K;
                        if (point == null) {
                            cVar3.Kg(ehq0Var, (r4 & 2) == 0, new jiu(13));
                        } else if (cVar3.L) {
                            cVar3.L = false;
                            cVar3.K = geometry;
                        } else {
                            VisibleRegion a = ((gh00) ah00Var).e.a();
                            if (ru.yandex.taxi.map.utils.a.t(new BoundingBox(a.getBottomLeft(), a.getTopRight()), geometry)) {
                                VisibleRegion a2 = ((gh00) ah00Var).e.a();
                                if (ru.yandex.taxi.map.utils.a.t(new BoundingBox(a2.getBottomLeft(), a2.getTopRight()), point)) {
                                    gh00 gh00Var2 = (gh00) ah00Var;
                                    if (gh00Var2.h() != null) {
                                        break;
                                    }
                                    cVar3.Kg(ehq0Var, (r4 & 2) == 0, new jiu(13));
                                } else {
                                    cVar3.K = geometry;
                                }
                            } else {
                                gh00 gh00Var3 = (gh00) ah00Var;
                                ScreenPoint e = gh00Var3.e.e(geometry);
                                if (e != null && (h = gh00Var3.h()) != null) {
                                    float f = (int) (100.0f * h.getResources().getDisplayMetrics().density);
                                    float f2 = -f;
                                    float width = h.width() + f;
                                    float x = e.getX();
                                    if (f2 <= x && x <= width) {
                                        float height = h.height() + f;
                                        float y = e.getY();
                                        if (f2 <= y && y <= height) {
                                            cVar3.Kg(ehq0Var, (r4 & 2) == 0, new jiu(13));
                                        }
                                    }
                                }
                                cVar3.Kg(ehq0Var, true, new tls() { // from class: com.yandex.go.places.organization.card.impl.ui.card.map.overlay.b
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        if (((Boolean) obj2).booleanValue()) {
                                            c cVar4 = c.this;
                                            tje.N(cVar4.Jg(), null, null, new OrganizationCardMapPresenter$handleSmartPinSelection$1$1(cVar4, ehq0Var, null), 3);
                                        }
                                        return zy11.a;
                                    }
                                });
                            }
                        }
                    } else if (i2 != 4) {
                        w511.b();
                        break;
                    }
                } else if (!cVar3.J) {
                    cVar3.Kg(ehq0Var, (r4 & 2) == 0, new jiu(13));
                    cVar3.J = true;
                }
                break;
            default:
                WalkingRouteUiState walkingRouteUiState = (WalkingRouteUiState) obj;
                vg80 vg80Var = (vg80) this.b;
                if (walkingRouteUiState == null) {
                    ((ru.yandex.taxi.map.c) vg80Var.b).a();
                } else {
                    ((ru.yandex.taxi.map.c) vg80Var.b).d(walkingRouteUiState);
                }
                break;
        }
        return zy11.a;
    }
}

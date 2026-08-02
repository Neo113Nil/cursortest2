package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.details.v1.domain.a;
import com.yandex.go.taxi.order.details.v1.elements.live_location.DetailsCardLiveLocationUiState;
import com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$RoutePointsState;
import com.yandex.go.taxi.order.details.v1.elements.route_point.c;
import com.yandex.go.taxi.order.models.api.objects.FreightageRideItem;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import com.yandex.go.taxi.order.models.api.response.AllowedDestinationPointChanges;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.taxi.order.state.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class jqu implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ jqu(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        if (r9.b != false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        AllowedDestinationPointChanges allowedDestinationPointChanges;
        List a;
        Collection arrayList;
        int size;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                d0l0 d0l0Var = (d0l0) pair.c();
                w wVar = eVar.z;
                o2y0 o2y0Var = eVar.x;
                wVar.getClass();
                wh70 wh70Var = new wh70(o2y0Var.b());
                LinkedHashMap linkedHashMap = wh70Var.a;
                AllowedChange allowedChange = (AllowedChange) linkedHashMap.get("destination_changes");
                List list = allowedChange != null ? allowedChange.c : null;
                EmptyList emptyList = EmptyList.a;
                if (list == null) {
                    list = emptyList;
                }
                boolean z2 = false;
                boolean z3 = linkedHashMap.get("destinations") != null;
                boolean b = wh70Var.b();
                boolean z4 = ((ChangeSourcePointExperiment) pair.f()).b;
                a aVar = eVar.F;
                w wVar2 = eVar.z;
                if (d0l0Var == null) {
                    aVar.d.f(DetailsCardRoutePointsStyleInteractor$RoutePointsState.GONE, emptyList);
                    a3y0.d(eVar.I, "updateRouteSection", null, new hqu(0), 2);
                    break;
                } else {
                    wVar2.getClass();
                    boolean z5 = d0l0Var.a().size() == 2 && (size = list.size()) == 1 && ((AllowedDestinationPointChanges) list.get(size - 1)).c;
                    if (d0l0Var.a().size() == 3) {
                        AllowedDestinationPointChanges allowedDestinationPointChanges2 = list.size() != 2 ? null : (AllowedDestinationPointChanges) list.get(0);
                        if (allowedDestinationPointChanges2 == null || !allowedDestinationPointChanges2.a) {
                            AllowedDestinationPointChanges allowedDestinationPointChanges3 = list.size() != 2 ? null : (AllowedDestinationPointChanges) list.get(0);
                            if (allowedDestinationPointChanges3 != null) {
                                break;
                            }
                        }
                        z = true;
                        boolean z6 = !z4 && b;
                        allowedDestinationPointChanges = !list.isEmpty() ? null : (AllowedDestinationPointChanges) b64.c(1, list);
                        if ((allowedDestinationPointChanges != null && allowedDestinationPointChanges.a) || (allowedDestinationPointChanges == null && z3)) {
                            z2 = true;
                        }
                        Address address = d0l0Var.a().size() == 3 ? (Address) d0l0Var.a().get(1) : null;
                        a = d0l0Var.a();
                        if (a.size() < 3) {
                            arrayList = emptyList;
                        } else {
                            arrayList = new ArrayList();
                            d6w n = y6i0.n(1, scc.f(a));
                            int i2 = n.a;
                            int i3 = n.b;
                            if (i2 <= i3) {
                                while (true) {
                                    arrayList.add(a.get(i2));
                                    if (i2 != i3) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c cVar = aVar.d;
                        aVar.c.f(d0l0Var.h(), z6);
                        aVar.e.f(d0l0Var.b(), z2);
                        if (!z5) {
                            if (!z) {
                                if (!arrayList.isEmpty()) {
                                    Iterable iterable = arrayList;
                                    ArrayList arrayList2 = new ArrayList(tcc.n(iterable, 10));
                                    Iterator it = iterable.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(q5z.L((Address) it.next()));
                                    }
                                    cVar.f(DetailsCardRoutePointsStyleInteractor$RoutePointsState.STATIC, arrayList2);
                                    break;
                                } else {
                                    cVar.f(DetailsCardRoutePointsStyleInteractor$RoutePointsState.GONE, emptyList);
                                    break;
                                }
                            } else if (address != null) {
                                cVar.f(DetailsCardRoutePointsStyleInteractor$RoutePointsState.EDIT, Collections.singletonList(q5z.L(address)));
                                break;
                            }
                        } else {
                            cVar.f(DetailsCardRoutePointsStyleInteractor$RoutePointsState.ADD, emptyList);
                            break;
                        }
                    }
                    z = false;
                    if (z4) {
                    }
                    if (!list.isEmpty()) {
                    }
                    if (allowedDestinationPointChanges != null) {
                        z2 = true;
                        if (d0l0Var.a().size() == 3) {
                        }
                        a = d0l0Var.a();
                        if (a.size() < 3) {
                        }
                        c cVar2 = aVar.d;
                        aVar.c.f(d0l0Var.h(), z6);
                        aVar.e.f(d0l0Var.b(), z2);
                        if (!z5) {
                        }
                    }
                    z2 = true;
                    if (d0l0Var.a().size() == 3) {
                    }
                    a = d0l0Var.a();
                    if (a.size() < 3) {
                    }
                    c cVar22 = aVar.d;
                    aVar.c.f(d0l0Var.h(), z6);
                    aVar.e.f(d0l0Var.b(), z2);
                    if (!z5) {
                    }
                }
                break;
            case 1:
                FreightageRideItem freightageRideItem = (FreightageRideItem) obj;
                if (freightageRideItem == null) {
                    ((gqu) eVar.Dg()).hideFreightageRideBlock();
                    break;
                } else {
                    ((gqu) eVar.Dg()).showFreightageRideBlock(freightageRideItem);
                    break;
                }
            case 2:
                ((gqu) eVar.Dg()).showTravelCompanionPoints((List) obj);
                break;
            case 3:
                p1t p1tVar = (p1t) obj;
                gqu gquVar = (gqu) eVar.Dg();
                if (!p1tVar.a) {
                    gquVar.setLiveLocationState(DetailsCardLiveLocationUiState.GONE);
                    break;
                } else if (!p1tVar.c) {
                    if (!p1tVar.b) {
                        gquVar.setLiveLocationState(DetailsCardLiveLocationUiState.INACTIVE);
                        break;
                    } else {
                        gquVar.setLiveLocationState(DetailsCardLiveLocationUiState.ACTIVE);
                        break;
                    }
                } else {
                    gquVar.setLiveLocationState(DetailsCardLiveLocationUiState.UNAVAILABLE);
                    break;
                }
            case 4:
                ((gqu) eVar.Dg()).renderSourceState((o7j) obj);
                break;
            case 5:
                ((gqu) eVar.Dg()).renderRoutePointsState((g7j) obj);
                break;
            case 6:
                ((gqu) eVar.Dg()).renderDestinationState((n5j) obj);
                break;
            case 7:
                ((gqu) eVar.Dg()).renderUserRequirementState((ws21) obj);
                break;
            case 8:
                ((gqu) eVar.Dg()).renderInfoState((t6j) obj);
                break;
            case 9:
                ((gqu) eVar.Dg()).renderPaymentState((v6j) obj);
                break;
            default:
                ((gqu) eVar.Dg()).renderRideSupportState((oqk0) obj);
                break;
        }
        return zy11Var;
    }
}

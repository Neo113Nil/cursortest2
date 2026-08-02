package defpackage;

import com.yandex.go.taxi.order.map.n;
import com.yandex.go.taxi.order.map.overlay.traffic.b;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.RoadObjectSettingsExperiment;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.TrafficLight;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.navigation.automotive.TrafficLightsController;
import defpackage.e901;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class jtk0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ jtk0(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        e901 e901Var;
        Object obj2;
        Object value2;
        e901 e901Var2;
        Object value3;
        e901 e901Var3;
        String str;
        Object value4;
        DrivingRoute a;
        Object value5;
        e901 a2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                DriveState driveState = (DriveState) pair.getFirst();
                RoadObjectSettingsExperiment roadObjectSettingsExperiment = (RoadObjectSettingsExperiment) pair.getSecond();
                etk0 etk0Var = nVar.b;
                List list = roadObjectSettingsExperiment.d;
                List list2 = roadObjectSettingsExperiment.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof RoadObjectSettingsExperiment.TrafficLight) {
                        arrayList.add(obj3);
                    }
                }
                RoadObjectSettingsExperiment.TrafficLight trafficLight = (RoadObjectSettingsExperiment.TrafficLight) a.R(arrayList);
                if (trafficLight != null) {
                    r0 r0Var = etk0Var.a;
                    do {
                        value = r0Var.getValue();
                        e901Var = (e901) value;
                    } while (!r0Var.k(value, trafficLight.e.contains(driveState) ? e901.a(e901Var, null, null, 0, trafficLight, null, 23) : e901.a(e901Var, null, null, 0, null, null, 23)));
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((RoadObjectSettingsExperiment.Bubble) obj2).c == RoadObjectSettingsExperiment.RoadObjectType.TRAFFIC_LIGHT) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    RoadObjectSettingsExperiment.Bubble bubble = (RoadObjectSettingsExperiment.Bubble) obj2;
                    if (bubble != null) {
                        int i2 = bubble.b;
                        do {
                            value2 = r0Var.getValue();
                            e901Var2 = (e901) value2;
                        } while (!r0Var.k(value2, e901.a(e901Var2, null, null, 0, null, e901.a.a(e901Var2.e, false, i2, null, 5), 15)));
                        RoadObjectSettingsExperiment.Bubble bubble2 = (RoadObjectSettingsExperiment.Bubble) a.R(list2);
                        String Y = (bubble2 == null || (str = bubble2.a) == null) ? null : d6z.Y(roadObjectSettingsExperiment, str);
                        if (Y == null) {
                            Y = "";
                        }
                        do {
                            value3 = r0Var.getValue();
                            e901Var3 = (e901) value3;
                        } while (!r0Var.k(value3, e901.a(e901Var3, null, null, 0, null, e901.a.a(e901Var3.e, false, 0.0f, Y, 3), 15)));
                    }
                }
                return zy11Var;
            case 1:
                Pair pair2 = (Pair) obj;
                RoadObjectSettingsExperiment roadObjectSettingsExperiment2 = (RoadObjectSettingsExperiment) pair2.getFirst();
                h8l0 h8l0Var = (h8l0) pair2.getSecond();
                if (roadObjectSettingsExperiment2.b) {
                    etk0 etk0Var2 = nVar.b;
                    etk0Var2.getClass();
                    ool0 ool0Var = h8l0Var.a;
                    PolylinePosition polylinePosition = h8l0Var.b;
                    DrivingRoute a3 = ool0Var.a();
                    if (a3 != null) {
                        r0 r0Var2 = etk0Var2.a;
                        do {
                            value5 = r0Var2.getValue();
                            e901 e901Var4 = (e901) value5;
                            List M = a.M(a3.getTrafficLights());
                            Polyline geometry = ool0Var.getGeometry();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = M.iterator();
                            while (it2.hasNext()) {
                                Point b = iwa1.b(geometry, ((TrafficLight) it2.next()).getPosition());
                                if (b != null) {
                                    arrayList2.add(b);
                                }
                            }
                            List list3 = e901Var4.b;
                            e901.a aVar = e901Var4.e;
                            int i3 = e901Var4.c;
                            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                            if (arrayList2.size() == list3.size()) {
                                Iterator it3 = arrayList2.iterator();
                                int i4 = 0;
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (ru.yandex.taxi.map.utils.a.d((Point) list3.get(i4), (Point) next)) {
                                        i4 = i5;
                                    }
                                }
                                ArrayList arrayList3 = (ArrayList) M;
                                if (arrayList3.size() > i3) {
                                    PolylinePosition position = ((TrafficLight) arrayList3.get(i3)).getPosition();
                                    if (polylinePosition != null && polylinePosition.getSegmentIndex() >= position.getSegmentIndex() && (polylinePosition.getSegmentIndex() != position.getSegmentIndex() || polylinePosition.getSegmentPosition() >= position.getSegmentPosition())) {
                                        int i6 = i3 + 1;
                                        a2 = e901.a(e901Var4, arrayList2.subList(i6, arrayList3.size()), null, i6, null, e901.a.a(aVar, false, 0.0f, null, 6), 10);
                                    }
                                }
                            }
                            a2 = e901.a(e901Var4, arrayList2, arrayList2, 0, null, e901.a.a(aVar, false, 0.0f, null, 6), 8);
                        } while (!r0Var2.k(value5, a2));
                    }
                    b bVar = nVar.g;
                    d901 d901Var = bVar.a;
                    if (bVar.e && (a = ool0Var.a()) != null) {
                        if (!jl40.l(bVar.d, a.getRouteId())) {
                            TrafficLightsController trafficLightsController = d901Var.b;
                            if (trafficLightsController != null) {
                                trafficLightsController.setRoute(a);
                            }
                            bVar.d = a.getRouteId();
                            bVar.f = null;
                        }
                        bVar.f = polylinePosition;
                        TrafficLightsController trafficLightsController2 = d901Var.b;
                        if (trafficLightsController2 != null) {
                            trafficLightsController2.setRoutePosition(polylinePosition);
                        }
                        r0 r0Var3 = bVar.b;
                        if (polylinePosition != null) {
                            List list4 = (List) r0Var3.getValue();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : list4) {
                                PolylinePosition polylinePosition2 = ((a901) obj4).d;
                                if (polylinePosition2 != null && (polylinePosition.getSegmentIndex() < polylinePosition2.getSegmentIndex() || (polylinePosition.getSegmentIndex() == polylinePosition2.getSegmentIndex() && polylinePosition.getSegmentPosition() < polylinePosition2.getSegmentPosition()))) {
                                    arrayList4.add(obj4);
                                }
                            }
                            if (arrayList4.size() < list4.size()) {
                                r0Var3.m(null, arrayList4);
                            }
                        }
                    }
                } else if (nVar.b.b.a.getValue() != e901.f) {
                    r0 r0Var4 = nVar.b.a;
                    do {
                        value4 = r0Var4.getValue();
                    } while (!r0Var4.k(value4, e901.f));
                }
                return zy11Var;
            default:
                Pair pair3 = (Pair) obj;
                boolean booleanValue = ((Boolean) pair3.getFirst()).booleanValue();
                RoadObjectSettingsExperiment.TrafficLight trafficLight2 = (RoadObjectSettingsExperiment.TrafficLight) pair3.getSecond();
                if (!booleanValue || trafficLight2 == null) {
                    nVar.g.b();
                } else {
                    nVar.g.a(nVar.j, trafficLight2.c);
                }
                return zy11Var;
        }
    }
}

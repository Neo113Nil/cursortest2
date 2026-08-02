package defpackage;

import com.yandex.go.taxi.order.bubble.g;
import com.yandex.go.taxi.order.bubble.interactor.a;
import com.yandex.go.taxi.order.bubble.interactor.b;
import com.yandex.mapkit.geometry.geo.XYPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes14.dex */
public final class di70 implements muw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ Object c;

    public /* synthetic */ di70(Object obj, Map map, int i) {
        this.a = i;
        this.c = obj;
        this.b = map;
    }

    @Override // defpackage.muw
    public final ro00 a() {
        switch (this.a) {
        }
        return ro00.d;
    }

    @Override // defpackage.muw
    public final List b() {
        ro00 u;
        ro00 u2;
        int i = this.a;
        Map map = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                float j = ((gh00) ((a) obj).b).j();
                Set<Map.Entry> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
                for (Map.Entry entry : entrySet) {
                    re2 re2Var = (re2) entry.getKey();
                    com.yandex.go.taxi.order.bubble.a aVar = (com.yandex.go.taxi.order.bubble.a) entry.getValue();
                    XYPoint xYPoint = aVar.A;
                    if (xYPoint == null) {
                        u = ro00.d;
                    } else {
                        ro00 ro00Var = ro00.d;
                        u = vuz.u(Participant.COMPANIONS_IN_SEARCH_COLLECTION, aVar.z, xYPoint, j, re2Var.d, 480);
                    }
                    arrayList.add(u);
                }
                return arrayList;
            default:
                float j2 = ((gh00) ((b) obj).b).j();
                Set<Map.Entry> entrySet2 = map.entrySet();
                ArrayList arrayList2 = new ArrayList(tcc.n(entrySet2, 10));
                for (Map.Entry entry2 : entrySet2) {
                    vxu0 vxu0Var = (vxu0) entry2.getKey();
                    g gVar = (g) entry2.getValue();
                    XYPoint xYPoint2 = gVar.B;
                    if (xYPoint2 == null) {
                        u2 = ro00.d;
                    } else {
                        ro00 ro00Var2 = ro00.d;
                        u2 = vuz.u(Participant.ORDER_STYLED_BUBBLES_COLLECTION, gVar.f(), xYPoint2, j2, vxu0Var.d, 480);
                    }
                    arrayList2.add(u2);
                }
                return arrayList2;
        }
    }
}

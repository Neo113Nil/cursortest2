package defpackage;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.map.overlay.c;
import com.yandex.go.taxi.order.map.overlay.c0;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import java.util.HashMap;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class k080 implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ k080(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                c0 c0Var = cVar.C;
                c0Var.getClass();
                DetailsOpenReason detailsOpenReason = DetailsOpenReason.POINT_MID;
                x980 x980Var = c0Var.B;
                o2y0 o2y0Var = c0Var.A;
                ((f) x980Var).b0(o2y0Var, detailsOpenReason);
                ft00 ft00Var = c0Var.V;
                String d = cta1.d(o2y0Var.c());
                kf00 kf00Var = ft00Var.a;
                kf00Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("mode", d);
                kf00Var.a.a("Map.AdditionalPoint.Tapped", hashMap, 1, new HashMap());
                break;
            case 1:
                cVar.C.Sg();
                break;
            default:
                kf00 kf00Var2 = cVar.C.m0;
                kf00Var2.a.a("Map.Bubble.TrafficLight.Tapped", oyr.A(kf00Var2), 1, new HashMap());
                break;
        }
        return true;
    }
}

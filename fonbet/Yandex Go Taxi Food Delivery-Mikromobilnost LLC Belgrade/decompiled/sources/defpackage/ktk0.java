package defpackage;

import com.yandex.go.taxi.order.map.o;
import com.yandex.go.taxi.order.map.overlay.d0;
import com.yandex.go.taxi.order.map.overlay.e0;
import com.yandex.go.taxi.order.map.r;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.kf00;
import defpackage.ktk0;
import defpackage.oyr;
import defpackage.tje;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ktk0 {
    public final tse a;
    public final ah00 b;
    public final o c;
    public final tt2 d;
    public final r e;
    public float j;
    public final e0 f = new e0(this);
    public final i3y g = a.a(new iik0(7, this));
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final r58 i = new r58(6, this);
    public final d0 k = new hr7() { // from class: com.yandex.go.taxi.order.map.overlay.d0
        @Override // defpackage.hr7
        public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
            float zoom = cameraPosition.getZoom();
            ktk0 ktk0Var = ktk0.this;
            com.yandex.go.taxi.order.map.r rVar = ktk0Var.e;
            gh00 gh00Var = (gh00) ktk0Var.b;
            ScreenRect c = gh00Var.a.c();
            if (c != null) {
                Iterator it = ktk0Var.h.iterator();
                while (it.hasNext()) {
                    f4c0 f4c0Var = (f4c0) it.next();
                    ScreenPoint e = gh00Var.e.e((Point) f4c0Var.h);
                    if (f4c0Var.b && e != null && ru.yandex.taxi.map.utils.a.q(e, c) && rVar.z) {
                        rVar.z = false;
                        kf00 kf00Var = rVar.y;
                        kf00Var.a.a("Map.TrafficLight.Shown", oyr.A(kf00Var), 1, new HashMap());
                    }
                }
            }
            if (ktk0Var.j == zoom) {
                return;
            }
            tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
            ktk0Var.j = zoom;
            r0 r0Var = rVar.A;
            Float valueOf = Float.valueOf(zoom);
            r0Var.getClass();
            r0Var.m(null, valueOf);
        }
    };
    public List l = EmptyList.a;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.go.taxi.order.map.overlay.d0] */
    public ktk0(tse tseVar, ah00 ah00Var, o oVar, tt2 tt2Var, r rVar) {
        this.a = tseVar;
        this.b = ah00Var;
        this.c = oVar;
        this.d = tt2Var;
        this.e = rVar;
    }
}

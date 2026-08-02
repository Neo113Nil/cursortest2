package defpackage;

import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceRouteTimingRepository$listenGuidanceRouteChanges$$inlined$safeCollectIn$1;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavRoutePassedDistanceRepository$startTracking$$inlined$safeCollectIn$1;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavRoutePassedDistanceRepository$startTracking$$inlined$safeCollectIn$2;

/* loaded from: classes8.dex */
public final class n141 {
    public final h3y a;
    public ncg b;
    public int c;
    public final ist d = jst.e.A("WALKING_NAVIGATION:FEATURE_COMPONENT_HOLDER");

    public n141(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final m141 a() {
        this.c++;
        this.d.getClass();
        ncg ncgVar = this.b;
        if (ncgVar != null) {
            return ncgVar;
        }
        h6r h6rVar = (h6r) this.a.get();
        h6rVar.getClass();
        ncg ncgVar2 = new ncg(h6rVar);
        n241 n241Var = (n241) ncgVar2.o.get();
        tje.N(n241Var.a, null, null, new WalkNavGuidanceRouteTimingRepository$listenGuidanceRouteChanges$$inlined$safeCollectIn$1(n241Var.b.e, null, n241Var), 3);
        q541 q541Var = (q541) ncgVar2.q.get();
        y141 y141Var = q541Var.b;
        tse tseVar = q541Var.a;
        tje.N(tseVar, null, null, new WalkNavRoutePassedDistanceRepository$startTracking$$inlined$safeCollectIn$1(y141Var.c, null, q541Var), 3);
        tje.N(tseVar, null, null, new WalkNavRoutePassedDistanceRepository$startTracking$$inlined$safeCollectIn$2(y141Var.e, null, q541Var), 3);
        this.b = ncgVar2;
        return ncgVar2;
    }

    public final void b() {
        ncg ncgVar;
        int i = this.c - 1;
        this.d.getClass();
        if (i < 0) {
            i = 0;
        }
        this.c = i;
        if (i != 0 || (ncgVar = this.b) == null) {
            return;
        }
        tse tseVar = (tse) ncgVar.a.get();
        if (tseVar != null) {
            bvf0.j(tseVar, null);
        }
        this.b = null;
    }
}

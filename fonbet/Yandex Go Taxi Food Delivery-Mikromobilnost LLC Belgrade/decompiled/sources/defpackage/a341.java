package defpackage;

import com.yandex.go.walking.navigation.impl.navigation_core.b;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceStateRepository$special$$inlined$safeCollectIn$1;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceStateRepository$special$$inlined$start$1;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceStateRepository$special$$inlined$start$2;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.WalkNavGuidanceStateRepository$special$$inlined$start$3;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.d;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.f;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository.h;
import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a341 {
    public final y141 a;
    public final b b;
    public final r0 c;
    public final gci0 d;

    public a341(y141 y141Var, b bVar, tse tseVar) {
        this.a = y141Var;
        this.b = bVar;
        r0 c = bvf0.c(null);
        this.c = c;
        this.d = e.d(c);
        tje.N(tseVar, null, null, new WalkNavGuidanceStateRepository$special$$inlined$safeCollectIn$1(new mth(com.yandex.go.coroutines.b.d(new d(y141Var.e, this), new WalkNavGuidanceStateRepository$special$$inlined$start$1(c(), null)), 6), null, this), 3);
    }

    public final void a() {
        this.c.l(null);
    }

    public final tpr b() {
        Guidance guidance;
        f fVar = new f(this.a.c, this);
        Navigation navigation = this.b.c;
        return com.yandex.go.coroutines.b.d(fVar, new WalkNavGuidanceStateRepository$special$$inlined$start$2((navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getLocation(), null));
    }

    public final Route c() {
        Guidance guidance;
        Navigation navigation = this.b.c;
        if (navigation == null || (guidance = navigation.getGuidance()) == null) {
            return null;
        }
        return guidance.getCurrentRoute();
    }

    public final k4u d() {
        Guidance guidance;
        Double remainingDistance;
        Navigation navigation = this.b.c;
        if (navigation == null || (guidance = navigation.getGuidance()) == null || (remainingDistance = guidance.getRemainingDistance()) == null) {
            return null;
        }
        double doubleValue = remainingDistance.doubleValue();
        Double timeToFinish = guidance.getTimeToFinish();
        if (timeToFinish != null) {
            return new k4u(timeToFinish.doubleValue(), doubleValue);
        }
        return null;
    }

    public final tpr e() {
        return com.yandex.go.coroutines.b.d(new h(e.K(this.a.e, b()), this), new WalkNavGuidanceStateRepository$special$$inlined$start$3(d(), null));
    }

    public final boolean f() {
        Guidance guidance;
        Navigation navigation = this.b.c;
        return ((navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getCurrentRoute()) != null;
    }
}

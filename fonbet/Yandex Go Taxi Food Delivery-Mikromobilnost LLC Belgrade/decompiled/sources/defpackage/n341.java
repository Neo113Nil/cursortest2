package defpackage;

import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$GuidanceTapType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;
import com.yandex.mapkit.Animation;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class n341 {
    public final b a;
    public final k b;
    public final b741 c;
    public final w041 d;

    public n341(b bVar, k kVar, b741 b741Var, w041 w041Var) {
        this.a = bVar;
        this.b = kVar;
        this.c = b741Var;
        this.d = w041Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(WalkingNavigationAnalytics$GuidanceTapType walkingNavigationAnalytics$GuidanceTapType) {
        w041 w041Var = this.d;
        String str = w041Var.a;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        if (w041Var.b != null) {
            Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                    walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                    break;
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
        }
        b741 b741Var = this.c;
        b741Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tap_type", walkingNavigationAnalytics$GuidanceTapType.getEventValue());
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        b741Var.a.a("WalkingNavigation.Guidance.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(float f, boolean z) {
        Animation.Type type = z ? Animation.Type.SMOOTH : Animation.Type.LINEAR;
        k kVar = this.b;
        gh00 gh00Var = (gh00) kVar.c;
        float j = gh00Var.j() + f;
        if (gh00Var.k().b(Float.valueOf(j))) {
            kVar.d();
            gh00Var.g.f(j, new Animation(type, 0.2f));
        }
    }
}

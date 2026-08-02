package defpackage;

import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$NavigationScreenType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class b741 {
    public final pho a;

    public b741(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(WalkingNavigationAnalytics$NavigationScreenType walkingNavigationAnalytics$NavigationScreenType, String str, WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration) {
        HashMap hashMap = new HashMap();
        hashMap.put("screen_type", walkingNavigationAnalytics$NavigationScreenType.getEventValue());
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        this.a.a("WalkingNavigation.Guidance.Shown", hashMap, 1, new HashMap());
    }
}

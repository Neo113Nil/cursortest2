package defpackage;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteScreenStatus;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteTripStatus;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class es40 {
    public final pho a;

    public es40(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(String str, String str2, MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType, MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus) {
        HashMap u = g8e.u("multimodal_id", str, "mm_name", str2);
        u.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
        u.put("tapped_status", multimodalRouteAnalytics$MultimodalRouteScreenStatus.getEventValue());
        this.a.a("MultimodalRoute.DetailsScreen.Tapped", u, 1, new HashMap());
    }

    public final void b(String str, String str2, MultimodalRouteAnalytics$MultimodalRouteTripStatus multimodalRouteAnalytics$MultimodalRouteTripStatus) {
        HashMap u = g8e.u("multimodal_id", str, "mm_name", str2);
        u.put("trip_status", multimodalRouteAnalytics$MultimodalRouteTripStatus.getEventValue());
        this.a.a("MultimodalRoute.MainRoute.Shown", u, 1, new HashMap());
    }

    public final void c(String str, String str2, MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType) {
        HashMap u = g8e.u("multimodal_id", str, "mm_name", str2);
        u.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
        this.a.a("MultimodalRoute.MainRoute.Tapped", u, 1, new HashMap());
    }

    public final void d(String str, String str2, MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType, String str3, Integer num, String str4) {
        HashMap u = g8e.u("multimodal_id", str, "mm_name", str2);
        u.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
        u.put("order_id", str3);
        if (num != null) {
            u.put("rating", num);
        }
        if (str4 != null) {
            u.put("tip_amount", str4);
        }
        this.a.a("MultimodalRoute.MainRoute.Tapped.Score.Tapped", u, 1, new HashMap());
    }

    public final void e(String str, String str2, MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType) {
        HashMap u = g8e.u("multimodal_id", str, "mm_name", str2);
        u.put("button_type", multimodalRouteAnalytics$MultimodalRouteButtonType.getEventValue());
        this.a.a("MultimodalRoute.Onboarding.Tapped", u, 1, new HashMap());
    }
}

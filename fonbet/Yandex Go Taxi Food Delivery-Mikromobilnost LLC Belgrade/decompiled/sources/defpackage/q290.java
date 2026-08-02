package defpackage;

import com.yandex.go.navigator.incidents.overview.analytics.OverviewIncidentsAnalytics$AnalyticsStatusChange;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class q290 {
    public final i650 a;

    public q290(i650 i650Var) {
        this.a = i650Var;
    }

    public final void a(OverviewIncidentsAnalytics$AnalyticsStatusChange overviewIncidentsAnalytics$AnalyticsStatusChange) {
        String type = overviewIncidentsAnalytics$AnalyticsStatusChange.getType();
        i650 i650Var = this.a;
        HashMap u = n.u(i650Var);
        if (type != null) {
            u.put("event_status", type);
        }
        i650Var.a.a("navigation.on_map_interactions.road_events.event_status.click", u, 1, new HashMap());
    }
}

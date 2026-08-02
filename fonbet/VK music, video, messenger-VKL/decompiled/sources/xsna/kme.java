package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.core.apps.BuildInfo;
import com.vk.metrics.eventtracking.Event;
import java.util.LinkedHashMap;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* compiled from: ClipsMyTrackerAnalytics.kt */
/* loaded from: classes14.dex */
public final class kme {
    public static void a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jgp.b);
        linkedHashMap.put(CallAnalyticsApiRequest.KEY_APP_VERSION, BuildInfo.a());
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g(str);
        aVar.d(linkedHashMap);
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        bVar.k(aVar.e());
    }
}

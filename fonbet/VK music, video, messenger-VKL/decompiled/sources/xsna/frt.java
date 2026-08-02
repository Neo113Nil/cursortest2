package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: GetElectionsRequestEvent.kt */
/* loaded from: classes5.dex */
public final class frt extends BaseAnalyticsEvent {
    public final String b;

    public frt(String str) {
        super("vkcm_sdk_arbiter_get_elections_request");
        this.b = str;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("host_package_name", this.b);
        return mapBuilder.h();
    }
}

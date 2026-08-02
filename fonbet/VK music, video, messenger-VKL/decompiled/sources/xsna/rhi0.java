package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: SendElectionsRequestEvent.kt */
/* loaded from: classes5.dex */
public final class rhi0 extends BaseAnalyticsEvent {
    public final String b;
    public final long c;
    public final Object d;

    public rhi0(String str, Object obj, long j) {
        super("vkcm_sdk_host_send_elections_request");
        this.b = str;
        this.c = j;
        this.d = obj;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("arbiter_package_name", this.b);
        ExtensionsKt.setResult$default(mapBuilder, this.d, null, null, 6, null);
        ExtensionsKt.setIntervalMs(mapBuilder, this.c);
        return mapBuilder.h();
    }
}

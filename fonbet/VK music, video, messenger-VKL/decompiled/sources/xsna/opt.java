package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: GetArbiterEvent.kt */
/* loaded from: classes5.dex */
public final class opt extends BaseAnalyticsEvent {
    public final long b;
    public final Object c;

    public opt(long j, Object obj) {
        super("vkcm_sdk_host_get_arbiter");
        this.b = j;
        this.c = obj;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setResult$default(mapBuilder, this.c, null, null, 6, null);
        ExtensionsKt.setIntervalMs(mapBuilder, this.b);
        return mapBuilder.h();
    }
}

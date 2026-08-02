package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MasterFromCacheUsedEvent.kt */
/* loaded from: classes5.dex */
public final class aj10 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final boolean d;

    public aj10(String str, String str2, boolean z) {
        super("vkcm_sdk_master_from_cache_used");
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        String str = this.b;
        if (str != null) {
            mapBuilder.put("client", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            mapBuilder.put("master", str2);
        }
        ExtensionsKt.set(mapBuilder, "is_used_from_cache", this.d);
        return mapBuilder.h();
    }
}

package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: NotifyOldMasterAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class cl70 extends BaseAnalyticsEvent {
    public final long b;
    public final Object c;
    public final String d;

    public cl70(String str, Object obj, long j) {
        super("vkcm_sdk_arbiter_notify_old_master");
        this.b = j;
        this.c = obj;
        this.d = str;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setResult$default(mapBuilder, this.c, null, null, 6, null);
        mapBuilder.put("old_master_package_name", this.d);
        ExtensionsKt.setIntervalMs(mapBuilder, this.b);
        return mapBuilder.h();
    }
}

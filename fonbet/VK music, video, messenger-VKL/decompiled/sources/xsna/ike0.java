package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: PushServiceActiveEvent.kt */
/* loaded from: classes5.dex */
public final class ike0 extends BaseAnalyticsEvent {
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    public ike0(long j, long j2, long j3, long j4, long j5, String str) {
        super("vkcm_sdk_master_activity_tracking");
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = str;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.set(mapBuilder, "active_for_ms", this.b);
        ExtensionsKt.set(mapBuilder, "avg_active_time", this.e);
        ExtensionsKt.set(mapBuilder, "median_active_time", this.f);
        ExtensionsKt.set(mapBuilder, "tracking_start_ms", this.c);
        ExtensionsKt.set(mapBuilder, "tracking_finish_ms", this.d);
        mapBuilder.put("activity_type", this.g);
        return mapBuilder.h();
    }
}

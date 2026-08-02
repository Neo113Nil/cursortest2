package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Lambda;

/* compiled from: CollectHostInfoAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class o4g extends BaseAnalyticsEvent {
    public final long b;
    public final Object c;

    /* compiled from: CollectHostInfoAnalyticsEvent.kt */
    public static final class a extends Lambda implements wzs<Map<String, String>, HostAppInfo, s3q0> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, HostAppInfo hostAppInfo) {
            Map<String, String> map2 = map;
            HostAppInfo hostAppInfo2 = hostAppInfo;
            map2.put("host_sdk_package_name", hostAppInfo2.getPackageName());
            map2.put("host_sdk_version", hostAppInfo2.getHostVersion());
            map2.put("is_battery_permission_given", hostAppInfo2.isIgnoringBatteryOptimization());
            return s3q0.a;
        }
    }

    public o4g(long j, Object obj) {
        super("vkcm_sdk_arbiter_collect_host_info");
        this.b = j;
        this.c = obj;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setResult$default(mapBuilder, this.c, a.i, null, 4, null);
        ExtensionsKt.setIntervalMs(mapBuilder, this.b);
        return mapBuilder.h();
    }
}

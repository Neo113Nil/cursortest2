package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Lambda;

/* compiled from: GetMasterAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class ost extends BaseAnalyticsEvent {
    public final long b;
    public final Object c;

    /* compiled from: GetMasterAnalyticsEvent.kt */
    public static final class a extends Lambda implements wzs<Map<String, String>, AppInfo, s3q0> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final s3q0 invoke(Map<String, String> map, AppInfo appInfo) {
            map.put("master_package_name", appInfo.getPackageName());
            return s3q0.a;
        }
    }

    public ost(long j, Object obj) {
        super("vkcm_sdk_arbiter_get_master_app");
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

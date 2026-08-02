package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: SendInvalidateInfoAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class shi0 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final Object d;
    public final long e;

    public shi0(long j, Object obj, String str, String str2) {
        super("vkcm_sdk_master_send_invalidate_info");
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = j;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        ExtensionsKt.setClientPackageName(mapBuilder, this.c);
        ExtensionsKt.setPushToken(mapBuilder, this.b);
        ExtensionsKt.setResult$default(mapBuilder, this.d, null, null, 6, null);
        ExtensionsKt.setIntervalMs(mapBuilder, this.e);
        return mapBuilder.h();
    }
}

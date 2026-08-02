package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: TooManyStoredPushesEvent.kt */
/* loaded from: classes5.dex */
public final class o2p0 extends BaseAnalyticsEvent {
    public final int b;
    public final String c;

    public o2p0(int i, String str) {
        super("vkcm_sdk_too_many_stored_pushes");
        this.b = i;
        this.c = str;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("push_messages_count", String.valueOf(this.b));
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        ExtensionsKt.setClientPackageName(mapBuilder, this.c);
        return mapBuilder.h();
    }
}

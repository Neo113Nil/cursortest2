package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class kiy0 extends BaseAnalyticsEvent {
    public final String b;
    public final ru.rustore.sdk.pushclient.b.b c;

    public kiy0(String str, ru.rustore.sdk.pushclient.b.b bVar) {
        super("vkcm_sdk_client_invalidate_token");
        this.b = str;
        this.c = bVar;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setPushToken(mapBuilder, this.b);
        mapBuilder.put("invalidate_initiator", this.c.name().toLowerCase(Locale.ROOT));
        return mapBuilder.h();
    }
}

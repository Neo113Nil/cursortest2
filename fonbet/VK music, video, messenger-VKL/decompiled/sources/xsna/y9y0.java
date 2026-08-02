package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.utils.MessageIdUtilsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class y9y0 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final String d;

    public y9y0(String str, String str2, String str3) {
        super("vkcm_sdk_client_click_push");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        String str;
        MapBuilder mapBuilder = new MapBuilder();
        String str2 = this.b;
        if (str2 != null && (str = this.c) != null) {
            ExtensionsKt.setPushId(mapBuilder, MessageIdUtilsKt.formPushId(str2, str));
        }
        mapBuilder.put("action", this.d);
        return mapBuilder.h();
    }
}

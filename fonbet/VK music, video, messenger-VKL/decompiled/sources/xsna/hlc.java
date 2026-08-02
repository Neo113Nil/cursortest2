package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ClientAppDeletedEvent.kt */
/* loaded from: classes5.dex */
public final class hlc extends BaseAnalyticsEvent {
    public final String b;
    public final int c;
    public final String d;

    public hlc(String str, int i, String str2) {
        super("vkcm_sdk_stop_push_delivery_to_client");
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.set((Map<String, String>) mapBuilder, "deleted_pushes_count", this.c);
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        ExtensionsKt.setClientPackageName(mapBuilder, this.b);
        ExtensionsKt.setPushToken(mapBuilder, this.d);
        return mapBuilder.h();
    }
}

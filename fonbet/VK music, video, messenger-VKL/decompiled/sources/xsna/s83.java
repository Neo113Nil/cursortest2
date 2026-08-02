package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: AppRemovedEvent.kt */
/* loaded from: classes5.dex */
public final class s83 extends BaseAnalyticsEvent {
    public final String b;
    public final boolean c;
    public final boolean d;

    public s83(String str, boolean z, boolean z2) {
        super("vkcm_sdk_app_removed");
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("deleted_package_name", this.b);
        ExtensionsKt.set(mapBuilder, "elections_started", this.c);
        ExtensionsKt.set(mapBuilder, "host_was_master", this.d);
        return mapBuilder.h();
    }
}

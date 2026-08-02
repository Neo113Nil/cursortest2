package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class voy0 extends BaseAnalyticsEvent {
    public final ArrayList b;

    public voy0(ArrayList arrayList) {
        super("vkcm_sdk_client_no_master_host_found");
        this.b = arrayList;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.set(mapBuilder, "installed_apps", this.b);
        return mapBuilder.h();
    }
}

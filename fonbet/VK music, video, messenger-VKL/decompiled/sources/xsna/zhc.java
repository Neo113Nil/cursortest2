package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ClearDataAfterNotifyAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class zhc extends BaseAnalyticsEvent {
    public final int b;
    public final String c;
    public final String d;

    public zhc(int i, String str, String str2) {
        super("vkcm_sdk_master_clear_data_after_notify");
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("master_package_name", this.d);
        mapBuilder.put("push_token", this.c);
        mapBuilder.put("removed_pushes_count", String.valueOf(this.b));
        return mapBuilder.h();
    }
}

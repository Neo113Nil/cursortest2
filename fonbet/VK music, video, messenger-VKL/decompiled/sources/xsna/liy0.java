package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class liy0 extends BaseAnalyticsEvent {
    public final String b;

    public liy0(String str) {
        super("vkcm_sdk_client_get_intermediate_token_start");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof liy0) && epx.f(this.b, ((liy0) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("master_package_name", this.b);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GetIntermediateTokenStartAnalyticsEvent(masterPackageName="), this.b, ')');
    }
}

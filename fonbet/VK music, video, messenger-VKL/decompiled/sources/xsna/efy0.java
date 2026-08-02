package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class efy0 extends BaseAnalyticsEvent {
    public final String b;
    public final Object c;
    public final long d;

    public efy0(String str, Object obj, long j) {
        super("vkcm_sdk_client_get_intermediate_token_finish");
        this.b = str;
        this.c = obj;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efy0)) {
            return false;
        }
        efy0 efy0Var = (efy0) obj;
        return epx.f(this.b, efy0Var.b) && epx.f(this.c, efy0Var.c) && this.d == efy0Var.d;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("master_package_name", this.b);
        ExtensionsKt.setIntervalMs(mapBuilder, this.d);
        ExtensionsKt.setResult$default(mapBuilder, this.c, null, null, 6, null);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((Result.b(this.c) + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetIntermediateTokenFinishAnalyticsEvent(masterPackageName=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append((Object) Result.c(this.c));
        sb.append(", intervalMs=");
        return vu5.a(')', this.d, sb);
    }
}

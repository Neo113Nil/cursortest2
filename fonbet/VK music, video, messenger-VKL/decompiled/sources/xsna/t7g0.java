package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import ru.ok.android.sdk.SharedKt;

/* compiled from: RequestIntermediateTokenAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class t7g0 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final long d;
    public final Object e;

    public t7g0(long j, Object obj, String str, String str2) {
        super("vkcm_sdk_master_request_intermediate_token");
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7g0)) {
            return false;
        }
        t7g0 t7g0Var = (t7g0) obj;
        return epx.f(this.b, t7g0Var.b) && epx.f(this.c, t7g0Var.c) && this.d == t7g0Var.d && epx.f(this.e, t7g0Var.e);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(SharedKt.PARAM_AUTH_TYPE, this.c);
        ExtensionsKt.setClientPackageName(mapBuilder, this.b);
        ExtensionsKt.setIntervalMs(mapBuilder, this.d);
        ExtensionsKt.setResult$default(mapBuilder, this.e, null, null, 6, null);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return Result.b(this.e) + bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "RequestIntermediateTokenAnalyticsEvent(clientPackageName=" + this.b + ", authType=" + this.c + ", intervalMs=" + this.d + ", result=" + ((Object) Result.c(this.e)) + ')';
    }
}

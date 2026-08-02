package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;

/* compiled from: SavePushTokenAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class c1h0 extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final Object d;

    public c1h0(Object obj, String str, String str2) {
        super("vkcm_sdk_master_save_push_token");
        this.b = str;
        this.c = str2;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1h0)) {
            return false;
        }
        c1h0 c1h0Var = (c1h0) obj;
        return epx.f(this.b, c1h0Var.b) && epx.f(this.c, c1h0Var.c) && epx.f(this.d, c1h0Var.d);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        Logger logger = v6g0.a;
        ExtensionsKt.setMasterPackageName(mapBuilder, v6g0.e().getPackageName());
        ExtensionsKt.setClientPackageName(mapBuilder, this.b);
        ExtensionsKt.setPushToken(mapBuilder, this.c);
        ExtensionsKt.setResult$default(mapBuilder, this.d, null, null, 6, null);
        return mapBuilder.h();
    }

    public final int hashCode() {
        return Result.b(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "SavePushTokenAnalyticsEvent(clientPackageName=" + this.b + ", pushToken=" + this.c + ", result=" + ((Object) Result.c(this.d)) + ')';
    }
}

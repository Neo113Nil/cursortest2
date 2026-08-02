package xsna;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class v9y0 extends BaseAnalyticsEvent {
    public final String b;
    public final boolean c;

    public v9y0(String str, boolean z) {
        super("vkcm_sdk_client_init");
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9y0)) {
            return false;
        }
        v9y0 v9y0Var = (v9y0) obj;
        return epx.f(this.b, v9y0Var.b) && this.c == v9y0Var.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Object getParams(spj<? super Map<String, String>> spjVar) {
        MapBuilder mapBuilder = new MapBuilder();
        ExtensionsKt.setPushToken(mapBuilder, this.b);
        ExtensionsKt.set(mapBuilder, "are_pushes_enabled", this.c);
        return mapBuilder.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSdkInitAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", arePushesEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}

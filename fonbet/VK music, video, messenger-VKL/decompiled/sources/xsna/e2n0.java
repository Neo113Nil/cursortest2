package xsna;

import com.vk.superapp.ads.js.bridge.api.events.CheckNativeAds$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import java.util.Locale;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class e2n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public e2n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public static String a(Enum r1) {
        String name;
        if (r1 == null || (name = r1.name()) == null) {
            return null;
        }
        return name.toLowerCase(Locale.ROOT);
    }

    public final void b(String str, boolean z) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppCheckNativeAds"), new CheckNativeAds$Response(null, new CheckNativeAds$Response.Data(z, null), null, 1, null), null, null, false, str, 28);
    }
}

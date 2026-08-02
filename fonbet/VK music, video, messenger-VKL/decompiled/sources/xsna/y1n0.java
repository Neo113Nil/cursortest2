package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Response;
import com.vk.superapp.core.js.bridge.api.events.Init$Response;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class y1n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public y1n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(String str, String str2) {
        CallAPIMethod$Response callAPIMethod$Response = new CallAPIMethod$Response(null, new CallAPIMethod$Response.Data(bay.e(str), str2), str2, 1, null);
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppCallAPIMethod"), callAPIMethod$Response, null, null, false, null, 60);
    }

    public final void b(String str, boolean z) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppInit"), new Init$Response(null, new Init$Response.Data(z, str), str, 1, null), null, null, z, null, 44);
    }
}

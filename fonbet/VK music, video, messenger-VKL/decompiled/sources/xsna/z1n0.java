package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Response;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class z1n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public z1n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(String str, boolean z) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppImageShare"), new ImageShare$Response(null, new ImageShare$Response.Data(z, str), str, 1, null), null, null, false, null, 60);
    }
}

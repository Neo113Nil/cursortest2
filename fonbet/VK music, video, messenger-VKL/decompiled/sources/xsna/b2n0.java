package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCheck$Response;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class b2n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public b2n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(String str) {
        LibverifyCheck$Response libverifyCheck$Response = new LibverifyCheck$Response(null, new LibverifyCheck$Response.Data(true, str), str, 1, null);
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppLibverifyCheck"), libverifyCheck$Response, null, null, false, null, 60);
    }
}

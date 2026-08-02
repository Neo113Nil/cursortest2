package xsna;

import com.vk.superapp.auth.js.bridge.api.events.AuthResumeRequests$Response;
import com.vk.superapp.base.js.bridge.JsMethod;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class w1n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public w1n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(String str) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppAuthResumeRequests"), new AuthResumeRequests$Response(null, new AuthResumeRequests$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
    }
}

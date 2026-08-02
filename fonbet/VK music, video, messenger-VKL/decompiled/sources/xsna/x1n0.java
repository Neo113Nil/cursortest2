package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Response;
import com.vk.superapp.common.js.bridge.api.events.Share$Response;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class x1n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public x1n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public static void b(x1n0 x1n0Var, String str, String str2) {
        com.vk.superapp.base.js.bridge.b.p(x1n0Var.a, new JsMethod("VKWebAppShare"), new Share$Response(null, new Share$Response.Data(str, null, null, str2), str2, 1, null), null, null, false, null, 60);
    }

    public final void a(String str, String str2) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppCustomMessage"), new CustomMessage$Response(null, new CustomMessage$Response.Data(str, str2), str2, 1, null), null, null, false, null, 60);
    }
}

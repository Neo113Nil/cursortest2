package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.vkclient.js.bridge.api.events.AllowMessagesFromGroup$Response;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Response;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Response;

/* compiled from: SuccessEventSender.kt */
/* loaded from: classes6.dex */
public final class u1n0 {
    public final com.vk.superapp.base.js.bridge.b a;

    public u1n0(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(String str) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppAllowMessagesFromGroup"), new AllowMessagesFromGroup$Response(null, new AllowMessagesFromGroup$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
    }

    public final void b(String str, String str2) {
        JoinGroup$Response joinGroup$Response = new JoinGroup$Response(null, new JoinGroup$Response.Data(true, str), str, 1, null);
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppJoinGroup"), joinGroup$Response, null, null, false, str2, 28);
    }

    public final void c(String str) {
        com.vk.superapp.base.js.bridge.b.p(this.a, new JsMethod("VKWebAppShowStoryBox"), new ShowStoryBox$Response(null, new ShowStoryBox$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
    }
}

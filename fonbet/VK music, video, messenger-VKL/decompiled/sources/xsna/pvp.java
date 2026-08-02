package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ApiError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.vkclient.js.bridge.api.events.AllowMessagesFromGroup$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.GetGroupInfo$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.JoinGroup$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowGoodOrderBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowNewPostBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowOrderBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowSubscriptionBox$Error;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowWallPostBox$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class pvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public pvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAllowMessagesFromGroup"), new AllowMessagesFromGroup$Error(null, new AllowMessagesFromGroup$Error.Data(AllowMessagesFromGroup$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    public final void b(String str, Throwable th) {
        if (fco0.d(th)) {
            a(fco0.h(str, th));
            return;
        }
        Responses$ApiError g = fco0.g(th);
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppAllowMessagesFromGroup"), new AllowMessagesFromGroup$Error(null, new AllowMessagesFromGroup$Error.Data(AllowMessagesFromGroup$Error.Data.Type.API_ERROR, str, null, g, 4, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetGroupInfo"), new GetGroupInfo$Error(null, new GetGroupInfo$Error.Data(GetGroupInfo$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void d(String str, Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppJoinGroup"), new JoinGroup$Error(null, new JoinGroup$Error.Data(JoinGroup$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), str, null, 8);
    }

    public final void e(String str, String str2, Throwable th) {
        if (fco0.d(th)) {
            d(str2, fco0.h(str, th));
            return;
        }
        Responses$ApiError g = fco0.g(th);
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppJoinGroup"), new JoinGroup$Error(null, new JoinGroup$Error.Data(JoinGroup$Error.Data.Type.CLIENT_ERROR, str, null, g, 4, null), 1, null), str2, null, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowGoodOrderBox"), new ShowGoodOrderBox$Error(null, new ShowGoodOrderBox$Error.Data(ShowGoodOrderBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowNewPostBox"), new ShowNewPostBox$Error(null, new ShowNewPostBox$Error.Data(ShowNewPostBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowOrderBox"), new ShowOrderBox$Error(null, new ShowOrderBox$Error.Data(ShowOrderBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    public final void i(Responses$ApiError responses$ApiError, String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowStoryBox"), new ShowStoryBox$Error(null, new ShowStoryBox$Error.Data(ShowStoryBox$Error.Data.Type.API_ERROR, str, null, responses$ApiError, 4, null), 1, null), null, null, 12);
    }

    public final void j(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowStoryBox"), new ShowStoryBox$Error(null, new ShowStoryBox$Error.Data(ShowStoryBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowSubscriptionBox"), new ShowSubscriptionBox$Error(null, new ShowSubscriptionBox$Error.Data(ShowSubscriptionBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppShowWallPostBox"), new ShowWallPostBox$Error(null, new ShowWallPostBox$Error.Data(ShowWallPostBox$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, 0 == true ? 1 : 0), null, null, 12);
    }
}

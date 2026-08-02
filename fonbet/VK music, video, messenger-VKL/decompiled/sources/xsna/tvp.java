package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ApiError;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.core.js.bridge.api.events.CallAPIMethod$Error;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Error;
import com.vk.superapp.core.js.bridge.api.events.SendCustomEvent$Error;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Error;
import com.vk.superapp.core.js.bridge.api.events.StorageGet$Error;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class tvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public tvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ApiError responses$ApiError, String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppCallAPIMethod"), new CallAPIMethod$Error(null, new CallAPIMethod$Error.Data(CallAPIMethod$Error.Data.Type.API_ERROR, str, null, responses$ApiError, 4, null), 1, null), null, null, 12);
    }

    public final void b(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppCallAPIMethod"), new CallAPIMethod$Error(null, new CallAPIMethod$Error.Data(CallAPIMethod$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    public final void c(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppSendCustomEvent"), new SendCustomEvent$Error(null, new SendCustomEvent$Error.Data(SendCustomEvent$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void d(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetLaunchParams"), new GetLaunchParams$Error(null, new GetLaunchParams$Error.Data(GetLaunchParams$Error.Data.Type.CLIENT_ERROR, responses$ClientError != null ? responses$ClientError.c() : null, responses$ClientError, null, 8, null), 1, null), null, null, 12);
    }

    public final void e(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppSetViewSettings"), new SetViewSettings$Error(null, new SetViewSettings$Error.Data(SetViewSettings$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void f(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppStorageGet"), new StorageGet$Error(null, new StorageGet$Error.Data(StorageGet$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void g(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppStorageSet"), new StorageSet$Error(null, new StorageSet$Error.Data(StorageSet$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }
}

package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.dating.js.bridge.api.events.GetPushToken$Error;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class uvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public uvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetPushToken"), new GetPushToken$Error(null, new GetPushToken$Error.Data(GetPushToken$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }

    public final void b(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppImageShare"), new ImageShare$Error(null, new ImageShare$Error.Data(ImageShare$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }
}

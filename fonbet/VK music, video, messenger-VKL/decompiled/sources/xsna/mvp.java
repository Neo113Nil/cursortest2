package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.location.js.bridge.api.events.GetGeodata$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class mvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public mvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetGeodata"), new GetGeodata$Error(null, new GetGeodata$Error.Data(GetGeodata$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }
}

package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.libverify.js.bridge.api.events.LibverifyCheck$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class xvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public xvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppLibverifyCheck"), new LibverifyCheck$Error(null, new LibverifyCheck$Error.Data(LibverifyCheck$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), null, null, 12);
    }
}

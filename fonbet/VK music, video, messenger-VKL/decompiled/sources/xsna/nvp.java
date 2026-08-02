package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Error;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class nvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public nvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(Responses$ClientError responses$ClientError) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetGrantedPermissions"), new GetGrantedPermissions$Error(null, new GetGrantedPermissions$Error.Data(GetGrantedPermissions$Error.Data.Type.CLIENT_ERROR, null, responses$ClientError, 2, null), 1, null), null, null, 12);
    }
}

package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Error;
import com.vk.superapp.dating.sdk.js.bridge.api.events.GetPermissions$Parameters;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class vvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public vvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public final void a(p2y<GetPermissions$Parameters> p2yVar) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppGetPermissions"), new GetPermissions$Error(null, new GetPermissions$Error.Data(GetPermissions$Error.Data.Type.CLIENT_ERROR, p2yVar.b(), new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), p2yVar.b(), 1, null)), 1, null), null, null, 12);
    }
}

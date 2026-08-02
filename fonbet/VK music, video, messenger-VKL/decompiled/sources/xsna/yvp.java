package xsna;

import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonCustom;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageDelete$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetMeta$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageGetState$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageRead$Error;
import com.vk.superapp.local_storage.js.bridge.api.events.LocalStorageWrite$Error;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: ErrorEventSender.kt */
/* loaded from: classes6.dex */
public final class yvp {
    public final com.vk.superapp.base.js.bridge.b a;

    public yvp(com.vk.superapp.base.js.bridge.b bVar) {
        this.a = bVar;
    }

    public static Responses$ClientError a(String str) {
        return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), str, 1, null);
    }

    public final void b(String str, JsMethod jsMethod, Throwable th, ow8 ow8Var) {
        String valueOf;
        Responses$ClientError responses$ClientError;
        String str2;
        com.vk.superapp.base.js.bridge.a localStorageGetMeta$Error;
        if (th instanceof JSONException) {
            str2 = str;
            responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131006, null), str2, 1, null);
        } else if (th instanceof IOException) {
            Responses$ClientError.ErrorData.Type type = Responses$ClientError.ErrorData.Type.REASON_CUSTOM;
            String localizedMessage = ((IOException) th).getLocalizedMessage();
            str2 = str;
            responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(type, null, null, null, null, null, null, null, null, null, null, null, null, null, localizedMessage != null ? new Responses$ReasonCustom(0, localizedMessage, 1, null) : null, null, null, 114686, null), str2, 1, null);
        } else {
            Responses$ClientError.ErrorData.Type type2 = Responses$ClientError.ErrorData.Type.REASON_CUSTOM;
            if (th == null || (valueOf = th.getLocalizedMessage()) == null) {
                valueOf = String.valueOf(ow8Var);
            }
            str2 = str;
            responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(type2, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonCustom(0, valueOf, 1, null), null, null, 114686, null), str2, 1, null);
        }
        if (jsMethod.equals(new JsMethod("VKWebAppLocalStorageRead"))) {
            localStorageGetMeta$Error = new LocalStorageRead$Error(null, new LocalStorageRead$Error.Data(LocalStorageRead$Error.Data.Type.CLIENT_ERROR, str2, responses$ClientError), 1, null);
        } else if (jsMethod.equals(new JsMethod("VKWebAppLocalStorageWrite"))) {
            localStorageGetMeta$Error = new LocalStorageWrite$Error(null, new LocalStorageWrite$Error.Data(LocalStorageWrite$Error.Data.Type.CLIENT_ERROR, str2, responses$ClientError), 1, null);
        } else if (jsMethod.equals(new JsMethod("VKWebAppLocalStorageDelete"))) {
            localStorageGetMeta$Error = new LocalStorageDelete$Error(null, new LocalStorageDelete$Error.Data(LocalStorageDelete$Error.Data.Type.CLIENT_ERROR, str2, responses$ClientError), 1, null);
        } else if (jsMethod.equals(new JsMethod("VKWebAppLocalStorageGetState"))) {
            localStorageGetMeta$Error = new LocalStorageGetState$Error(null, new LocalStorageGetState$Error.Data(LocalStorageGetState$Error.Data.Type.CLIENT_ERROR, str2, responses$ClientError), 1, null);
        } else if (!jsMethod.equals(new JsMethod("VKWebAppLocalStorageGetMeta"))) {
            return;
        } else {
            localStorageGetMeta$Error = new LocalStorageGetMeta$Error(null, new LocalStorageGetMeta$Error.Data(LocalStorageGetMeta$Error.Data.Type.CLIENT_ERROR, str2, responses$ClientError), 1, null);
        }
        com.vk.superapp.base.js.bridge.b.o(this.a, jsMethod, localStorageGetMeta$Error, null, null, 12);
    }

    public final void c(String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppLocalStorageDelete"), new LocalStorageDelete$Error(null, new LocalStorageDelete$Error.Data(LocalStorageDelete$Error.Data.Type.CLIENT_ERROR, str, a(str)), 1, null), null, null, 12);
    }

    public final void d(String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppLocalStorageGetMeta"), new LocalStorageGetMeta$Error(null, new LocalStorageGetMeta$Error.Data(LocalStorageGetMeta$Error.Data.Type.CLIENT_ERROR, str, a(str)), 1, null), null, null, 12);
    }

    public final void e(String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppLocalStorageGetState"), new LocalStorageGetState$Error(null, new LocalStorageGetState$Error.Data(LocalStorageGetState$Error.Data.Type.CLIENT_ERROR, str, a(str)), 1, null), null, null, 12);
    }

    public final void f(String str) {
        com.vk.superapp.base.js.bridge.b.o(this.a, new JsMethod("VKWebAppLocalStorageWrite"), new LocalStorageWrite$Error(null, new LocalStorageWrite$Error.Data(LocalStorageWrite$Error.Data.Type.CLIENT_ERROR, str, a(str)), 1, null), null, null, 12);
    }
}

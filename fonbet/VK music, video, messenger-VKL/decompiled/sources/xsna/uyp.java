package xsna;

import com.google.gson.Gson;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonConnectionLost;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUserDenied;
import com.vk.superapp.js.bridge.events.EventNames;

/* compiled from: EventFactory.kt */
/* loaded from: classes6.dex */
public final class uyp {
    public static final /* synthetic */ int a = 0;

    static {
        new Gson();
    }

    public static Responses$ClientError a(EventNames eventNames, mfu0 mfu0Var, Throwable th) {
        boolean z = th instanceof VKApiExecutionException;
        if (z) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() == -1) {
                return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_CONNECTION_LOST, vKApiExecutionException.u(), null, null, new Responses$ReasonConnectionLost(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, 131052, null), mfu0Var.D(eventNames), 1, null);
            }
        }
        if (z) {
            VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th;
            if (vKApiExecutionException2.s() == 24) {
                return b(eventNames, mfu0Var, vKApiExecutionException2.u());
            }
        }
        return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, z ? ((VKApiExecutionException) th).u() : null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), mfu0Var.D(eventNames), 1, null);
    }

    public static Responses$ClientError b(EventNames eventNames, mfu0 mfu0Var, String str) {
        return new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_USER_DENIED, str, null, null, null, new Responses$ReasonUserDenied(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, 131036, null), mfu0Var.D(eventNames), 1, null);
    }
}

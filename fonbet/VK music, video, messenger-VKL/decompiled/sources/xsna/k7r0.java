package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VKApiJSONResponseParser.kt */
/* loaded from: classes.dex */
public interface k7r0<Result> {

    /* compiled from: VKApiJSONResponseParser.kt */
    public static final class a {
        public static per0 a(k7r0 k7r0Var, qrj0 qrj0Var) throws VKApiException, VKApiExecutionException, JSONException, Exception {
            return qrj0Var.a(new s660(k7r0Var, 1));
        }
    }

    Result a(JSONObject jSONObject) throws VKApiException, VKApiExecutionException, JSONException, Exception;

    per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) throws VKApiException, VKApiExecutionException, JSONException, Exception;
}

package ru.ok.tracer.upload;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.brm0;

/* compiled from: NetworkResponseHandler.kt */
/* loaded from: classes9.dex */
public final class NetworkResponseHandler {
    public static final NetworkResponseHandler INSTANCE = new NetworkResponseHandler();

    private NetworkResponseHandler() {
    }

    public static /* synthetic */ void universalHandleResponse$default(NetworkResponseHandler networkResponseHandler, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        networkResponseHandler.universalHandleResponse(str, str2, str3, str4);
    }

    public final void universalHandleResponse(String str, String str2, String str3, String str4) {
        if (str2 == null) {
            Logger.w$default("Response with no body", null, 2, null);
            return;
        }
        if (brm0.B(str2, "{", false)) {
            try {
                universalHandleResponse(new JSONObject(str2), str3, str4);
            } catch (JSONException unused) {
            }
        } else {
            Logger.w$default("Unsupported Content-Type " + str, null, 2, null);
        }
    }

    public static /* synthetic */ void universalHandleResponse$default(NetworkResponseHandler networkResponseHandler, JSONObject jSONObject, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        networkResponseHandler.universalHandleResponse(jSONObject, str, str2);
    }

    public final void universalHandleResponse(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("commands");
        if (optJSONObject == null) {
            return;
        }
        long optLong = optJSONObject.optLong("tagShutdownMs");
        long optLong2 = optJSONObject.optLong("featureShutdownMs");
        long optLong3 = optJSONObject.optLong("globalShutdownMs");
        ConfigStorage configStorage = ConfigStorage.INSTANCE;
        configStorage.setLimits(str, str2, Long.valueOf(optLong3), Long.valueOf(optLong2), Long.valueOf(optLong));
        configStorage.save();
    }
}

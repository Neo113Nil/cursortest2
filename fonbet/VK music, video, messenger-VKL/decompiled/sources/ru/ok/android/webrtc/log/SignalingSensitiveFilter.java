package ru.ok.android.webrtc.log;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public class SignalingSensitiveFilter {
    public static String filterEndpoint(@Nullable String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (str2.equals("token")) {
                clearQuery.appendQueryParameter(str2, "<HIDDEN>");
            } else {
                clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        return clearQuery.build().toString();
    }

    public static String filterJson(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("joinLink")) {
                jSONObject.put("joinLink", "<HIDDEN>");
            }
            if (jSONObject.has(SignalingProtocol.KEY_CONVERSATION)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(SignalingProtocol.KEY_CONVERSATION);
                if (jSONObject2.has("joinLink")) {
                    jSONObject2.put("joinLink", "<HIDDEN>");
                }
            }
            if (jSONObject.has("endpoint")) {
                jSONObject.put("endpoint", filterEndpoint(jSONObject.getString("endpoint")));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }
}

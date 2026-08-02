package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.EbsException;
import ru.rt.ebs.cryptosdk.core.network.entities.exceptions.NetworkException;

/* loaded from: classes4.dex */
public final class at50 {
    public static NetworkException a(int i, String str, String str2) {
        String str3 = i + " " + str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString(AuthSdkActivity.RESPONSE_TYPE_CODE);
            String str4 = null;
            if (evu0.J(optString)) {
                optString = null;
            }
            if (optString == null) {
                optString = jSONObject.optString("error_code");
                if (evu0.J(optString)) {
                    optString = null;
                }
                if (optString == null) {
                    optString = EbsException.NETWORK_SDK_ERROR_CODE;
                }
            }
            String optString2 = jSONObject.optString(Constants.KEY_MESSAGE);
            if (evu0.J(optString2)) {
                optString2 = null;
            }
            if (optString2 == null) {
                String optString3 = jSONObject.optString("error_message");
                if (!evu0.J(optString3)) {
                    str4 = optString3;
                }
                optString2 = str4 == null ? str3 : str4;
            }
            return new NetworkException(i, str, optString, optString2);
        } catch (Exception unused) {
            return new NetworkException(i, str, EbsException.NETWORK_SDK_ERROR_CODE, str3);
        }
    }
}

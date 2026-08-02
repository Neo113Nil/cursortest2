package xsna;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: VKErrorUtils.kt */
/* loaded from: classes15.dex */
public final class pbr0 {
    public static VKApiException a(JSONArray jSONArray, String str, int[] iArr) {
        int s;
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                VKApiException c = c(jSONArray.getJSONObject(i), 6, null);
                if ((c instanceof VKApiExecutionException) && (s = ((VKApiExecutionException) c).s()) != 1 && s != 14 && s != 17 && s != 3610 && s != 4 && s != 5 && s != 6 && s != 9 && s != 10 && s != 24 && s != 25) {
                    if (iArr == null || !rl3.E(((VKApiExecutionException) c).s(), iArr)) {
                        arrayList.add(c);
                    }
                }
                return c;
            }
            return new VKApiExecutionException(Integer.MIN_VALUE, str, false, "", null, arrayList, null, null, 0, null, null, null, 4032);
        } catch (JSONException e) {
            return new VKApiIllegalResponseException(e);
        }
    }

    public static VKApiException b(String str, String str2, JSONObject jSONObject) {
        Bundle bundle;
        try {
            int optInt = jSONObject.optInt("error_code");
            Bundle bundle2 = null;
            bundle2 = null;
            if (optInt == 5) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ban_info");
                if (optJSONObject != null) {
                    bundle2 = new Bundle();
                    bundle2.putString("user_ban_info", optJSONObject.toString());
                }
            } else if (optInt == 14) {
                bundle2 = new Bundle();
                d(bundle2, jSONObject);
            } else if (optInt == 17) {
                bundle2 = new Bundle();
                bundle2.putString("validation_url", jSONObject.getString("redirect_uri"));
            } else if (optInt != 24) {
                if (optInt == 100) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("additional_info");
                    String jSONObject2 = optJSONObject2 != null ? optJSONObject2.toString() : null;
                    bundle = new Bundle();
                    bundle.putString("additional_info", jSONObject2);
                } else if (optInt == 3609) {
                    bundle = new Bundle();
                    bundle.putString("extend_hash", jSONObject.optString("extend_hash", null));
                } else if (optInt == 13300) {
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("ban_info");
                    long optLong = optJSONObject3 != null ? optJSONObject3.optLong("owner_id") : 0L;
                    bundle2 = new Bundle();
                    bundle2.putLong("owner_id", optLong);
                }
                bundle2 = bundle;
            } else {
                bundle2 = new Bundle();
                bundle2.putString("confirmation_text", jSONObject.getString("confirmation_text"));
            }
            if (str2 != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle(1);
                }
                bundle2.putString(SharedKt.PARAM_ACCESS_TOKEN, str2);
            }
            int i = VKApiExecutionException.b;
            return VKApiExecutionException.a.a(jSONObject, str, bundle2);
        } catch (Exception e) {
            return new VKApiIllegalResponseException(jSONObject.toString(), e);
        }
    }

    public static /* synthetic */ VKApiException c(JSONObject jSONObject, int i, String str) {
        if ((i & 2) != 0) {
            str = null;
        }
        return b(str, null, jSONObject);
    }

    public static void d(Bundle bundle, JSONObject jSONObject) {
        bundle.putString("captcha_sid", jSONObject.getString("captcha_sid"));
        bundle.putString("captcha_img", jSONObject.getString("captcha_img"));
        bundle.putInt("captcha_height", jSONObject.optInt("captcha_height", -1));
        bundle.putInt("captcha_width", jSONObject.optInt("captcha_width", -1));
        bundle.putDouble("captcha_ratio", jSONObject.optDouble("captcha_ratio"));
        if (jSONObject.has("captcha_attempt")) {
            bundle.putInt("captcha_attempt", jSONObject.optInt("captcha_attempt", -1));
        }
        if (jSONObject.has("captcha_ts")) {
            bundle.putDouble("captcha_ts", jSONObject.optDouble("captcha_ts", -1.0d));
        }
        if (jSONObject.has("is_refresh_enabled")) {
            bundle.putBoolean("is_refresh_enabled", jSONObject.optBoolean("is_refresh_enabled", false));
        }
        if (jSONObject.has("is_sound_captcha_available")) {
            bundle.putBoolean("is_sound_captcha_available", jSONObject.optBoolean("is_sound_captcha_available", false));
        }
        if (jSONObject.has("captcha_track")) {
            bundle.putString("captcha_track", jSONObject.optString("captcha_track", ""));
        }
        if (jSONObject.has("redirect_uri")) {
            bundle.putString("redirect_uri", jSONObject.optString("redirect_uri", ""));
        }
    }
}

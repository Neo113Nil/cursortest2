package ru.ok.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiRequest;
import ru.ok.android.sdk.util.StatsBuilder;
import xsna.dt;
import xsna.v1v;

/* compiled from: OKRestHelper.kt */
/* loaded from: classes9.dex */
public final class OKRestHelper {
    private final Odnoklassniki ok;

    public OKRestHelper(Odnoklassniki odnoklassniki) {
        this.ok = odnoklassniki;
    }

    @NonNull
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String getDeviceId(Context context) {
        Object systemService = context.getSystemService("phone");
        String str = null;
        if (!(systemService instanceof TelephonyManager)) {
            systemService = null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (telephonyManager != null) {
            try {
                str = telephonyManager.getDeviceId();
            } catch (SecurityException e) {
                e.getMessage();
            }
        }
        return v1v.a('_', str, Settings.Secure.getString(context.getContentResolver(), "android_id"));
    }

    public final boolean notifyListener(OkListener okListener, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(SharedKt.PARAM_ERROR_MSG)) {
                this.ok.notifySuccess(okListener, jSONObject);
                return true;
            }
            this.ok.notifyFailed(okListener, jSONObject.optString(SharedKt.PARAM_ERROR_MSG, jSONObject.toString()));
            return false;
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("reponse", str);
            } catch (JSONException unused2) {
            }
            this.ok.notifySuccess(okListener, jSONObject2);
            return true;
        }
    }

    public final boolean sdkInit(Context context) throws IOException {
        String sdkToken = this.ok.getSdkToken();
        if (sdkToken != null && sdkToken.length() != 0) {
            return true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 2);
            jSONObject.put("device_id", getDeviceId(context));
            jSONObject.put(AnonymLoginApiRequest.PARAM_NAME_CLIENT_VERSION, "android_sdk_1");
            jSONObject.put("client_type", "SDK_ANDROID");
            try {
                JSONObject jSONObject2 = new JSONObject(this.ok.request("sdk.init", dt.b("session_data", jSONObject.toString()), EnumSet.of(OkRequestMode.UNSIGNED)));
                if (jSONObject2.has("session_key")) {
                    this.ok.setSdkToken(jSONObject2.getString("session_key"));
                    String sdkToken2 = this.ok.getSdkToken();
                    if (sdkToken2 != null && sdkToken2.length() != 0) {
                        TokenStore.storeSdkToken(context, this.ok.getSdkToken());
                        return true;
                    }
                }
            } catch (JSONException e) {
                Log.e(SharedKt.LOG_TAG, "Parsing sdk.init response: " + e.getMessage(), e);
            }
            return false;
        } catch (JSONException e2) {
            Log.e(SharedKt.LOG_TAG, "Creating sdk.init request: " + e2.getMessage(), e2);
            return false;
        }
    }

    public final void sdkReportStats(StatsBuilder statsBuilder, OkListener okListener) throws JSONException, IOException {
        notifyListener(okListener, this.ok.request("sdk.reportStats", dt.b("stats", statsBuilder.build().toString()), OkRequestMode.Companion.getDEFAULT()));
    }
}

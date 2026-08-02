package ru.ok.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.preference.Preference;
import kotlin.Pair;

/* compiled from: TokenStore.kt */
/* loaded from: classes9.dex */
public final class TokenStore {
    public static final TokenStore INSTANCE = new TokenStore();

    private TokenStore() {
    }

    private final SharedPreferences getPreferences(Context context) {
        return Preference.h(context, 0, SharedKt.PREFERENCES_FILE);
    }

    public static final String getSdkToken(Context context) {
        return INSTANCE.getPreferences(context).getString("ok_sdk_tkn", null);
    }

    public static final String getStoredAccessToken(Context context) {
        return INSTANCE.getPreferences(context).getString("acctkn", null);
    }

    public static final String getStoredSessionSecretKey(Context context) {
        return INSTANCE.getPreferences(context).getString("ssk", null);
    }

    public static final void removeStoredTokens(Context context) {
        SharedPreferences.Editor edit = INSTANCE.getPreferences(context).edit();
        edit.remove("acctkn");
        edit.remove("ssk");
        edit.remove("ok_sdk_tkn");
        edit.apply();
    }

    public static final void store(Context context, String str, String str2) {
        SharedPreferences.Editor edit = INSTANCE.getPreferences(context).edit();
        edit.putString("acctkn", str);
        edit.putString("ssk", str2);
        edit.apply();
    }

    public static final void storeSdkToken(Context context, String str) {
        SharedPreferences.Editor edit = INSTANCE.getPreferences(context).edit();
        edit.putString("ok_sdk_tkn", str);
        edit.apply();
    }

    public final Pair<String, String> getAppInfo(Context context) {
        SharedPreferences preferences = getPreferences(context);
        return new Pair<>(preferences.getString("app_id", null), preferences.getString(MBridgeConstans.APP_KEY, null));
    }

    public final void setAppInfo(Context context, String str, String str2) {
        getPreferences(context).edit().putString("app_id", str).putString(MBridgeConstans.APP_KEY, str2).apply();
    }
}

package ru.ok.android.externcalls.sdk.android.ext.lifecycle.api;

import android.content.SharedPreferences;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.zcl;

/* compiled from: SharedPreferencesApiSessionStore.kt */
/* loaded from: classes9.dex */
public final class SharedPreferencesApiSessionStore implements ApiSessionStore {
    private static final String API_ENDPOINT = "api_endpoint";
    private static final Companion Companion = new Companion(null);
    private static final String SESSION_KEY = "session_key";
    private final SharedPreferences sharedPreferences;

    /* compiled from: SharedPreferencesApiSessionStore.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SharedPreferencesApiSessionStore(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    private final ApiSessionStore.SessionInfo getInfo() {
        String string = this.sharedPreferences.getString("session_key", null);
        String string2 = this.sharedPreferences.getString(API_ENDPOINT, null);
        if (string == null && string2 == null) {
            return null;
        }
        return new ApiSessionStore.SessionInfo(string, string2);
    }

    private final void setInfo(ApiSessionStore.SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            this.sharedPreferences.edit().remove("session_key").apply();
            return;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("session_key", sessionInfo.getSessionKey());
        edit.putString(API_ENDPOINT, sessionInfo.getApiEndpoint());
        edit.apply();
    }

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public ApiSessionStore.SessionInfo getSessionInfo() {
        return getInfo();
    }

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public void setSessionInfo(ApiSessionStore.SessionInfo sessionInfo) {
        setInfo(sessionInfo);
    }
}

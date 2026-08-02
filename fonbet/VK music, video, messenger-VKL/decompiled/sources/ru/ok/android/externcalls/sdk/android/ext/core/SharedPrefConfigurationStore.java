package ru.ok.android.externcalls.sdk.android.ext.core;

import android.content.SharedPreferences;
import java.util.List;
import ru.ok.android.sdk.api.ConfigurationStore;
import xsna.drm0;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SharedPrefConfigurationStore.kt */
/* loaded from: classes9.dex */
public final class SharedPrefConfigurationStore implements ConfigurationStore {
    public static final Companion Companion = new Companion(null);
    private static final String SESSION_KEY = "session";
    private final gzs<String> appKey;
    private final gzs<String> baseEndpoint;
    private final SharedPreferences prefs;

    /* compiled from: SharedPrefConfigurationStore.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public SharedPrefConfigurationStore(SharedPreferences sharedPreferences, gzs<String> gzsVar, gzs<String> gzsVar2) {
        this.prefs = sharedPreferences;
        this.appKey = gzsVar;
        this.baseEndpoint = gzsVar2;
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public String getAppKey() {
        return this.appKey.invoke();
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public String getBaseEndpoint() {
        return this.baseEndpoint.invoke();
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public ConfigurationStore.SessionInfo getSessionInfo() {
        String string = this.prefs.getString(SESSION_KEY, null);
        if (string != null) {
            try {
                List b0 = drm0.b0(string, new char[]{','}, 0, 6);
                return new ConfigurationStore.SessionInfo((String) b0.get(0), (String) b0.get(2), (String) b0.get(3));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public void setSessionInfo(ConfigurationStore.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            SharedPreferences.Editor edit = this.prefs.edit();
            s3q0 s3q0Var = s3q0.a;
            edit.putString(SESSION_KEY, sessionInfo.sessionKey + ",-," + sessionInfo.apiEndpoint + ',' + sessionInfo.authToken);
            edit.apply();
        }
    }
}

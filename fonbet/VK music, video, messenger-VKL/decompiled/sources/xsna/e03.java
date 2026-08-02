package xsna;

import com.google.gson.Gson;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import ru.ok.android.sdk.api.session.ApiSessionStore;

/* compiled from: ApiSessionStoreImpl.kt */
/* loaded from: classes7.dex */
public final class e03 implements ApiSessionStore {
    public static final Gson a = new Gson();

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public final ApiSessionStore.SessionInfo getSessionInfo() {
        String s;
        if (!Preference.v("voip_prefs_shared", "ok_session_state")) {
            return null;
        }
        s = Preference.s("voip_prefs_shared", "ok_session_state", new String());
        try {
            return (ApiSessionStore.SessionInfo) a.fromJson(s, ApiSessionStore.SessionInfo.class);
        } catch (Throwable th) {
            L.e("Session info parse error", th);
            return null;
        }
    }

    @Override // ru.ok.android.sdk.api.session.ApiSessionStore
    public final void setSessionInfo(ApiSessionStore.SessionInfo sessionInfo) {
        Preference.H("voip_prefs_shared", "ok_session_state", a.toJson(sessionInfo));
    }
}

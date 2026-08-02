package ru.ok.android.sdk.api;

import androidx.annotation.Nullable;
import xsna.i5s;

@Deprecated
/* loaded from: classes9.dex */
public interface ConfigurationStore {

    public static class SessionInfo {
        public final String apiEndpoint;
        public final String authToken;
        public final String sessionKey;

        public SessionInfo(String str, String str2, String str3) {
            this.sessionKey = str;
            this.apiEndpoint = str2;
            this.authToken = str3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SessionInfo{sessionKey='");
            sb.append(this.sessionKey);
            sb.append("', apiEndpoint='");
            sb.append(this.apiEndpoint);
            sb.append("', authToken='");
            return i5s.a(sb, this.authToken, "'}");
        }
    }

    String getAppKey();

    String getBaseEndpoint();

    @Nullable
    default SessionInfo getSessionInfo() {
        return null;
    }

    default void setSessionInfo(@Nullable SessionInfo sessionInfo) {
    }
}

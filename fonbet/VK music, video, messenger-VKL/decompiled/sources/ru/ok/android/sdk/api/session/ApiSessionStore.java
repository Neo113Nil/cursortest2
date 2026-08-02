package ru.ok.android.sdk.api.session;

import xsna.epx;
import xsna.ss9;
import xsna.zcl;

/* compiled from: ApiSessionStore.kt */
/* loaded from: classes9.dex */
public interface ApiSessionStore {

    /* compiled from: ApiSessionStore.kt */
    public static final class SessionInfo {
        private final String apiEndpoint;
        private final String sessionKey;

        /* JADX WARN: Multi-variable type inference failed */
        public SessionInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionInfo.sessionKey;
            }
            if ((i & 2) != 0) {
                str2 = sessionInfo.apiEndpoint;
            }
            return sessionInfo.copy(str, str2);
        }

        public final String component1() {
            return this.sessionKey;
        }

        public final String component2() {
            return this.apiEndpoint;
        }

        public final SessionInfo copy(String str, String str2) {
            return new SessionInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionInfo)) {
                return false;
            }
            SessionInfo sessionInfo = (SessionInfo) obj;
            return epx.f(this.sessionKey, sessionInfo.sessionKey) && epx.f(this.apiEndpoint, sessionInfo.apiEndpoint);
        }

        public final String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public final String getSessionKey() {
            return this.sessionKey;
        }

        public int hashCode() {
            String str = this.sessionKey;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.apiEndpoint;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ss9.a("SessionInfo(sessionKey=", this.sessionKey, ", apiEndpoint=", this.apiEndpoint, ")");
        }

        public SessionInfo(String str, String str2) {
            this.sessionKey = str;
            this.apiEndpoint = str2;
        }

        public /* synthetic */ SessionInfo(String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    SessionInfo getSessionInfo();

    void setSessionInfo(SessionInfo sessionInfo);
}

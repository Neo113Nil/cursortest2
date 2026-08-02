package ru.ok.android.sdk.api.token;

import java.io.IOException;
import xsna.epx;
import xsna.ss9;

/* compiled from: ApiTokenInfoProvider.kt */
/* loaded from: classes9.dex */
public interface ApiTokenInfoProvider {

    /* compiled from: ApiTokenInfoProvider.kt */
    public static final class Info {
        private final String apiEndpoint;
        private final String token;

        public Info(String str, String str2) {
            this.token = str;
            this.apiEndpoint = str2;
        }

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.token;
            }
            if ((i & 2) != 0) {
                str2 = info.apiEndpoint;
            }
            return info.copy(str, str2);
        }

        public final String component1() {
            return this.token;
        }

        public final String component2() {
            return this.apiEndpoint;
        }

        public final Info copy(String str, String str2) {
            return new Info(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return epx.f(this.token, info.token) && epx.f(this.apiEndpoint, info.apiEndpoint);
        }

        public final String getApiEndpoint() {
            return this.apiEndpoint;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.token;
            return this.apiEndpoint.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return ss9.a("Info(token=", this.token, ", apiEndpoint=", this.apiEndpoint, ")");
        }
    }

    Info getTokenInfo() throws IOException;
}

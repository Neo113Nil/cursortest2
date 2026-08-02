package ru.ok.android.api.core;

import androidx.annotation.CheckResult;
import java.util.Arrays;
import java.util.Locale;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.xe9;
import xsna.zcl;

/* compiled from: ApiConfig.kt */
/* loaded from: classes9.dex */
public final class ApiConfig {
    public static final Companion Companion = new Companion(null);
    public static final ApiConfig EMPTY = new ApiConfig(null, null, null, null, null);
    private final String applicationKey;
    private final String authToken;
    private final String sessionKey;
    private final String sessionSecret;
    private final String userId;

    /* compiled from: ApiConfig.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private ApiConfig(String str, String str2, String str3, String str4, String str5) {
        this.applicationKey = str;
        this.userId = str2;
        this.authToken = str3;
        this.sessionKey = str4;
        this.sessionSecret = str5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiConfig)) {
            return false;
        }
        ApiConfig apiConfig = (ApiConfig) obj;
        return epx.f(this.sessionSecret, apiConfig.sessionSecret) && epx.f(this.sessionKey, apiConfig.sessionKey) && epx.f(this.authToken, apiConfig.authToken) && epx.f(this.userId, apiConfig.userId) && epx.f(this.applicationKey, apiConfig.applicationKey);
    }

    public final String getApplicationKey() {
        return this.applicationKey;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public final String getSessionSecret() {
        return this.sessionSecret;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.applicationKey;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.authToken;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sessionKey;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.sessionSecret;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.applicationKey;
        String str2 = this.userId;
        String str3 = this.authToken;
        String str4 = this.sessionKey;
        Locale locale = Locale.US;
        String str5 = this.sessionSecret;
        String format = String.format(locale, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(str5 != null ? str5.hashCode() : 0)}, 1));
        StringBuilder a = xe9.a("ApiConfig{appKey='", str, "', userId='", str2, "', token='");
        n6j.b(a, str3, "', sessionKey='", str4, "', sessionSecret='");
        return i5s.a(a, format, "'}");
    }

    @CheckResult
    public final ApiConfig withApplication(String str) {
        if (this.sessionKey != null) {
            throw new IllegalStateException("Some session key");
        }
        if (this.authToken == null) {
            return str.equals(this.applicationKey) ? this : new ApiConfig(str, this.userId, this.authToken, this.sessionKey, this.sessionSecret);
        }
        throw new IllegalStateException("Some auth token");
    }

    @CheckResult
    public final ApiConfig withSession(String str, String str2) {
        if (this.applicationKey != null) {
            return (str.equals(this.sessionKey) && str2.equals(this.sessionSecret)) ? this : new ApiConfig(this.applicationKey, this.userId, this.authToken, str, str2);
        }
        throw new IllegalStateException("No app key");
    }

    @CheckResult
    public final ApiConfig withUser(String str, String str2) {
        if (this.applicationKey != null) {
            return (str.equals(this.userId) && str2.equals(this.authToken)) ? this : new ApiConfig(this.applicationKey, str, str2, this.sessionKey, this.sessionSecret);
        }
        throw new IllegalStateException("No application key");
    }

    @CheckResult
    public final ApiConfig withoutSession() {
        return this.sessionKey == null ? this : new ApiConfig(this.applicationKey, this.userId, this.authToken, null, null);
    }

    @CheckResult
    public final ApiConfig withoutUser() {
        return this.userId == null ? this : new ApiConfig(this.applicationKey, null, null, null, null);
    }
}

package ru.ok.android.sdk.api.config;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.ok.android.api.core.ApiConfig;

/* loaded from: classes9.dex */
public class SdkApiConfig {

    @NonNull
    public static final SdkApiConfig EMPTY = new SdkApiConfig(SimpleSnapshotMap.empty(), ApiConfig.EMPTY);

    @NonNull
    private final ApiConfig actual;

    @NonNull
    public final SimpleSnapshotMap<String, Uri> uris;

    private SdkApiConfig(@NonNull SimpleSnapshotMap<String, Uri> simpleSnapshotMap, @NonNull ApiConfig apiConfig) {
        this.uris = simpleSnapshotMap;
        this.actual = apiConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SdkApiConfig sdkApiConfig = (SdkApiConfig) obj;
            if (this.actual.equals(sdkApiConfig.actual) && this.uris.equals(sdkApiConfig.uris)) {
                return true;
            }
        }
        return false;
    }

    public Uri getApiAddressUri() {
        return getUri("api");
    }

    @NonNull
    public ApiConfig getApiConfig() {
        return this.actual;
    }

    @Nullable
    public String getApplicationKey() {
        return this.actual.getApplicationKey();
    }

    @Nullable
    public String getAuthToken() {
        return this.actual.getAuthToken();
    }

    @Nullable
    public String getSessionKey() {
        return this.actual.getSessionKey();
    }

    @Nullable
    public Uri getUri(@NonNull String str) {
        return this.uris.get(str);
    }

    @Nullable
    public String getUserId() {
        return this.actual.getUserId();
    }

    public int hashCode() {
        return (this.actual.hashCode() * 31) + this.uris.hashCode();
    }

    @NonNull
    public String toString() {
        return "SdkApiConfig{apiConfig=" + this.actual + ", uris=" + this.uris + '}';
    }

    @CheckResult
    public SdkApiConfig updateDefApiUri(String str) {
        return withUri("api", Uri.parse(str));
    }

    @CheckResult
    public SdkApiConfig withApplication(String str) {
        return Objects.equals(str, this.actual.getApplicationKey()) ? this : new SdkApiConfig(this.uris, this.actual.withApplication(str));
    }

    @CheckResult
    public SdkApiConfig withSession(String str) {
        return Objects.equals(str, this.actual.getSessionKey()) ? this : new SdkApiConfig(this.uris, this.actual.withSession(str, ""));
    }

    @CheckResult
    public SdkApiConfig withUri(String str, Uri uri) {
        SimpleSnapshotMap<String, Uri> with = this.uris.with(str, uri);
        return with == this.uris ? this : new SdkApiConfig(with, this.actual);
    }

    @CheckResult
    public SdkApiConfig withUser(String str, String str2) {
        return (Objects.equals(str, this.actual.getUserId()) && Objects.equals(str2, this.actual.getAuthToken())) ? this : new SdkApiConfig(this.uris, this.actual.withUser(str, str2));
    }

    @CheckResult
    public SdkApiConfig withoutLoginData() {
        return (this.actual.getUserId() == null && this.actual.getSessionKey() == null) ? this : new SdkApiConfig(this.uris, this.actual.withoutUser().withoutSession());
    }

    @CheckResult
    public SdkApiConfig withoutSession() {
        return this.actual.getSessionKey() == null ? this : new SdkApiConfig(this.uris, this.actual.withoutSession());
    }

    @CheckResult
    public SdkApiConfig withoutUri(String str) {
        SimpleSnapshotMap<String, Uri> without = this.uris.without(str);
        return without == this.uris ? this : new SdkApiConfig(without, this.actual);
    }

    @CheckResult
    public SdkApiConfig withoutUris() {
        return this.uris.isEmpty() ? this : new SdkApiConfig(SimpleSnapshotMap.empty(), this.actual);
    }

    @CheckResult
    public SdkApiConfig withoutUser() {
        return this.actual.getUserId() == null ? this : new SdkApiConfig(this.uris, this.actual.withoutUser());
    }
}

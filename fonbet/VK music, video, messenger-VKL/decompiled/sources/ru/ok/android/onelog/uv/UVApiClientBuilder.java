package ru.ok.android.onelog.uv;

import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.onelog.uv.token.DefaultUVTokenProvider;
import ru.ok.android.onelog.uv.token.UVTokenProvider;
import xsna.e9e0;
import xsna.gzs;
import xsna.y84;

/* compiled from: UVApiClientBuilder.kt */
/* loaded from: classes9.dex */
public final class UVApiClientBuilder {
    private String applicationId;
    private String applicationSecret;
    private String deviceId;
    private HttpClient httpClient;
    private UVTokenProvider tokenProvider;
    private boolean useGzip = true;
    private gzs<String> userIdProvider = new y84(29);

    private final UVTokenProvider deriveDefaultTokenProvider(HttpClient httpClient) {
        requireDefaultTokenProviderParams();
        return new DefaultUVTokenProvider(httpClient, this.applicationId, this.applicationSecret, this.deviceId, this.userIdProvider);
    }

    private final void requireDefaultTokenProviderParams() {
        if (this.applicationId == null || this.applicationSecret == null || this.deviceId == null) {
            throw new IllegalStateException("Either setUVStatTokenProvider() or setDefaultTokenProviderParams() must be called on the builder.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userIdProvider$lambda$0() {
        return null;
    }

    public final UVApiClient build() {
        HttpClient httpClient = this.httpClient;
        if (httpClient == null) {
            throw new IllegalStateException("setHttpClient() must be called on the builder.");
        }
        UVTokenProvider uVTokenProvider = this.tokenProvider;
        if (uVTokenProvider == null) {
            uVTokenProvider = deriveDefaultTokenProvider(httpClient);
        }
        return new UVApiClientImpl(httpClient, uVTokenProvider, this.useGzip);
    }

    public final UVApiClientBuilder setDefaultTokenProviderParams(String str, String str2, String str3, gzs<String> gzsVar) {
        this.applicationId = str;
        this.applicationSecret = str2;
        this.deviceId = str3;
        this.userIdProvider = gzsVar;
        return this;
    }

    public final UVApiClientBuilder setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public final UVApiClientBuilder setUVStatTokenProvider(UVTokenProvider uVTokenProvider) {
        this.tokenProvider = uVTokenProvider;
        return this;
    }

    public final UVApiClientBuilder setUseGzip(boolean z) {
        this.useGzip = z;
        return this;
    }

    public final e9e0<UVApiClient> toProvider() {
        return new UVApiClientBuilder$toProvider$1(this);
    }
}

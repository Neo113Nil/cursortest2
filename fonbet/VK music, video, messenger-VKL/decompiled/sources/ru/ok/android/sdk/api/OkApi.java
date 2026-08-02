package ru.ok.android.sdk.api;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.deprecated.DeprecatedDefaultOkApi;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.e9e0;
import xsna.izs;
import xsna.j5g;
import xsna.ozl;
import xsna.wyg0;
import xsna.yu50;

/* compiled from: OkApi.kt */
/* loaded from: classes9.dex */
public abstract class OkApi {
    private final ApiAppKeyProvider appKeyProvider;
    private final Builder builder;
    private final ApiDeviceIdProvider deviceIdProvider;

    /* compiled from: OkApi.kt */
    public static class Builder {
        private ApiAppKeyProvider appKeyProvider;
        private ConfigurationStore configurationStore;
        private ApiDeviceIdProvider deviceIdProvider;
        private ApiSessionStore sessionStore;
        private wyg0 sslProvider;
        private ApiTokenInfoProvider tokenInfoProvider;
        private TokenProvider tokenProvider = new yu50(3);
        private ApiRequestDebugger apiRequestDebugger = ApiRequestDebugger.NO_OP;
        private List<? extends OkApiInterceptor> okApiInterceptors = EmptyList.b;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String tokenProvider$lambda$0() {
            return null;
        }

        public final Builder addOkApiInterceptor(OkApiInterceptor okApiInterceptor) {
            this.okApiInterceptors = j5g.v0(okApiInterceptor, this.okApiInterceptors);
            return this;
        }

        public OkApi build() {
            ConfigurationStore configurationStore = this.configurationStore;
            TokenProvider tokenProvider = this.tokenProvider;
            ApiSessionStore apiSessionStore = this.sessionStore;
            ApiTokenInfoProvider apiTokenInfoProvider = this.tokenInfoProvider;
            ApiAppKeyProvider apiAppKeyProvider = this.appKeyProvider;
            if (apiSessionStore != null && apiTokenInfoProvider != null && apiAppKeyProvider != null) {
                return new DefaultOkApi(this, apiSessionStore, apiTokenInfoProvider, apiAppKeyProvider, this.okApiInterceptors);
            }
            if (configurationStore == null || tokenProvider == null) {
                throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
            }
            return new DeprecatedDefaultOkApi(this, configurationStore, tokenProvider, this.okApiInterceptors);
        }

        public final ApiRequestDebugger getApiRequestDebugger() {
            return this.apiRequestDebugger;
        }

        public final ApiAppKeyProvider getAppKeyProvider() {
            return this.appKeyProvider;
        }

        public final ConfigurationStore getConfigurationStore() {
            return this.configurationStore;
        }

        public final ApiDeviceIdProvider getDeviceIdProvider() {
            return this.deviceIdProvider;
        }

        public final List<OkApiInterceptor> getOkApiInterceptors() {
            return this.okApiInterceptors;
        }

        public final ApiSessionStore getSessionStore() {
            return this.sessionStore;
        }

        public final wyg0 getSslProvider() {
            return null;
        }

        public final ApiTokenInfoProvider getTokenInfoProvider() {
            return this.tokenInfoProvider;
        }

        public final TokenProvider getTokenProvider() {
            return this.tokenProvider;
        }

        public final Builder setApiRequestDebugger(ApiRequestDebugger apiRequestDebugger) {
            this.apiRequestDebugger = apiRequestDebugger;
            return this;
        }

        public final Builder setAppKeyProvider(ApiAppKeyProvider apiAppKeyProvider) {
            this.appKeyProvider = apiAppKeyProvider;
            return this;
        }

        @ozl
        public final Builder setConfigurationStore(ConfigurationStore configurationStore) {
            this.configurationStore = configurationStore;
            return this;
        }

        @ozl
        public final Builder setDeviceIdProvider(e9e0<String> e9e0Var) {
            final String str = e9e0Var.get();
            this.deviceIdProvider = str != null ? new ApiDeviceIdProvider() { // from class: xsna.mw70
                @Override // ru.ok.android.sdk.api.ApiDeviceIdProvider
                public final String getDeviceId() {
                    String deviceIdProvider$lambda$0$0$0;
                    deviceIdProvider$lambda$0$0$0 = OkApi.Builder.setDeviceIdProvider$lambda$0$0$0(str);
                    return deviceIdProvider$lambda$0$0$0;
                }
            } : null;
            return this;
        }

        public final Builder setOkApiInterceptors(List<? extends OkApiInterceptor> list) {
            this.okApiInterceptors = list;
            return this;
        }

        public final Builder setSessionStore(ApiSessionStore apiSessionStore) {
            this.sessionStore = apiSessionStore;
            return this;
        }

        public final Builder setTokenInfoProvider(ApiTokenInfoProvider apiTokenInfoProvider) {
            this.tokenInfoProvider = apiTokenInfoProvider;
            return this;
        }

        @ozl
        public final Builder setTokenProvider(TokenProvider tokenProvider) {
            this.tokenProvider = tokenProvider;
            return this;
        }

        @ozl
        public final Builder withWrappedConfigurationStorage(izs<? super ConfigurationStore, ? extends ConfigurationStore> izsVar) {
            this.configurationStore = izsVar.invoke(this.configurationStore);
            return this;
        }

        public final Builder withWrappedSessionStore(izs<? super ApiSessionStore, ? extends ApiSessionStore> izsVar) {
            this.sessionStore = izsVar.invoke(this.sessionStore);
            return this;
        }

        public final Builder setDeviceIdProvider(ApiDeviceIdProvider apiDeviceIdProvider) {
            this.deviceIdProvider = apiDeviceIdProvider;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setDeviceIdProvider$lambda$0$0$0(String str) {
            return str;
        }

        public final Builder setSSLProvider(wyg0 wyg0Var) {
            return this;
        }
    }

    public OkApi(Builder builder) {
        this.builder = builder;
    }

    public final Builder copyFromActual(Builder builder) {
        Builder okApiInterceptors = builder.setConfigurationStore(this.builder.getConfigurationStore()).setApiRequestDebugger(this.builder.getApiRequestDebugger()).setTokenProvider(this.builder.getTokenProvider()).setDeviceIdProvider(this.builder.getDeviceIdProvider()).setSessionStore(this.builder.getSessionStore()).setTokenInfoProvider(this.builder.getTokenInfoProvider()).setAppKeyProvider(this.builder.getAppKeyProvider()).setOkApiInterceptors(this.builder.getOkApiInterceptors());
        this.builder.getSslProvider();
        return okApiInterceptors.setSSLProvider(null);
    }

    public abstract ApiClient getApiClient();

    public ApiAppKeyProvider getAppKeyProvider() {
        return this.appKeyProvider;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public ApiDeviceIdProvider getDeviceIdProvider() {
        return this.deviceIdProvider;
    }

    public abstract OkApiHolder getOkApiHolder();

    public abstract List<OkApiInterceptor> getOkApiInterceptors();

    public abstract RxApiClient getRxApiClient();

    public abstract Builder newBuilder();
}

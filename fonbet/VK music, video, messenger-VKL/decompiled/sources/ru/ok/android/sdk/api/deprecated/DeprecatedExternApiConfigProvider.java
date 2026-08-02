package ru.ok.android.sdk.api.deprecated;

import android.net.Uri;
import androidx.annotation.NonNull;
import ru.ok.android.sdk.api.ConfigurationStore;
import ru.ok.android.sdk.api.ExternApiConfigProvider;
import ru.ok.android.sdk.api.config.SdkApiConfig;

/* loaded from: classes9.dex */
public class DeprecatedExternApiConfigProvider implements ExternApiConfigProvider {
    private volatile SdkApiConfig config;
    private final ConfigurationStore store;

    public DeprecatedExternApiConfigProvider(ConfigurationStore configurationStore) {
        this.store = configurationStore;
    }

    private void read() {
        String str;
        ConfigurationStore.SessionInfo sessionInfo = this.store.getSessionInfo();
        SdkApiConfig withUri = SdkApiConfig.EMPTY.withApplication(this.store.getAppKey()).withUri("api", Uri.parse(this.store.getBaseEndpoint()));
        if (sessionInfo != null && (str = sessionInfo.sessionKey) != null) {
            withUri = withUri.withSession(str);
        }
        this.config = withUri;
    }

    private void write() {
        Uri uri = this.config.getUri("api");
        this.store.setSessionInfo(new ConfigurationStore.SessionInfo(this.config.getSessionKey(), uri == null ? null : uri.toString(), this.config.getAuthToken()));
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    public void clearSession() {
        this.store.setSessionInfo(null);
        this.config = null;
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    @NonNull
    public SdkApiConfig getApiConfig() {
        if (this.config == null) {
            read();
        }
        return this.config;
    }

    @Override // ru.ok.android.sdk.api.ExternApiConfigProvider
    public void setApiConfig(SdkApiConfig sdkApiConfig) {
        this.config = sdkApiConfig;
        write();
    }
}

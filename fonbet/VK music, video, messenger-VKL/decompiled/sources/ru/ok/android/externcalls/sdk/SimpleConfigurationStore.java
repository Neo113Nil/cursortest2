package ru.ok.android.externcalls.sdk;

import androidx.annotation.NonNull;
import ru.ok.android.sdk.api.ConfigurationStore;

/* loaded from: classes9.dex */
public class SimpleConfigurationStore implements ConfigurationStore {
    private final String appKey;
    private final String baseEndpoint;
    private ConfigurationStore.SessionInfo sessionInfo;

    public SimpleConfigurationStore(ConfigurationStore configurationStore) {
        this.appKey = configurationStore.getAppKey();
        this.baseEndpoint = configurationStore.getBaseEndpoint();
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    @NonNull
    public String getAppKey() {
        return this.appKey;
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public String getBaseEndpoint() {
        return this.baseEndpoint;
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public ConfigurationStore.SessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // ru.ok.android.sdk.api.ConfigurationStore
    public void setSessionInfo(ConfigurationStore.SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }
}

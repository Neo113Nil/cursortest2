package ru.ok.android.sdk.api;

import ru.ok.android.sdk.api.config.SdkApiConfig;

/* compiled from: ExternApiConfigProvider.kt */
/* loaded from: classes9.dex */
public interface ExternApiConfigProvider {
    void clearSession();

    SdkApiConfig getApiConfig();

    void setApiConfig(SdkApiConfig sdkApiConfig);
}

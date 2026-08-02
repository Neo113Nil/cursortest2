package ru.ok.android.onelog;

import ru.ok.android.api.core.ApiClient;

/* compiled from: OneLogImplProxy.kt */
/* loaded from: classes9.dex */
public final class OneLogImplProxy {
    public static final OneLogImplProxy INSTANCE = new OneLogImplProxy();

    private OneLogImplProxy() {
    }

    public final ApiClient getApiClient() {
        return OneLogImpl.getInstance().getApiClient();
    }

    public final String getApplicationParam() {
        return OneLogImpl.getInstance().getApplicationParam();
    }
}

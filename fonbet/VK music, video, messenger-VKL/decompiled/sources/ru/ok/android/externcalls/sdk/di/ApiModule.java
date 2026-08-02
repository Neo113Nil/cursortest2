package ru.ok.android.externcalls.sdk.di;

import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.sdk.api.ApiAppKeyProvider;
import ru.ok.android.sdk.api.ApiDeviceIdProvider;
import ru.ok.android.sdk.api.OkApiHolder;

/* compiled from: ApiModule.kt */
/* loaded from: classes9.dex */
public interface ApiModule {
    ApiAppKeyProvider getAppKeyProvider();

    ApiDeviceIdProvider getDeviceIdProvider();

    OkApiHolder getOkApiHolder();

    OkApiServiceInternal getOkApiServiceInternal();

    RxApiClient getRxApiClient();
}

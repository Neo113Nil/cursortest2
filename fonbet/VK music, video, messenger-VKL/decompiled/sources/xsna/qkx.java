package xsna;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.sdk.api.ApiAppKeyProvider;
import ru.ok.android.sdk.api.ApiDeviceIdProvider;

/* compiled from: InternalParamsProvider.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class qkx {
    public final ApiDeviceIdProvider a;
    public final ApiAppKeyProvider b;

    public qkx(ApiDeviceIdProvider apiDeviceIdProvider, ApiAppKeyProvider apiAppKeyProvider) {
        this.a = apiDeviceIdProvider;
        this.b = apiAppKeyProvider;
    }
}

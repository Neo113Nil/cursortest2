package ru.ok.android.externcalls.sdk.api.interceptor;

import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.sdk.api.OkApiInterceptor;
import ru.ok.android.sdk.api.OkApiResponse;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.utils.time.TimeProviderExtKt;
import xsna.zcl;

/* compiled from: ExecutionTimeInterceptor.kt */
/* loaded from: classes9.dex */
public final class ExecutionTimeInterceptor implements OkApiInterceptor {
    private ApiStats apiStats;
    private final TimeProvider timeProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionTimeInterceptor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final ApiStats getApiStats() {
        return this.apiStats;
    }

    @Override // ru.ok.android.sdk.api.OkApiInterceptor
    public OkApiResponse intercept(OkApiInterceptor.Chain chain) {
        ApiStats apiStats;
        String method = InterceptorUtilsKt.getMethod(chain.request().getRequest());
        TimeProvider timeProvider = this.timeProvider;
        long msSinceBoot = timeProvider.getMsSinceBoot();
        OkApiResponse proceed = chain.proceed(chain.request());
        long msSinceBoot2 = timeProvider.getMsSinceBoot() - msSinceBoot;
        if (method != null && (apiStats = this.apiStats) != null) {
            apiStats.reportExecutionTime(method, msSinceBoot2);
        }
        return proceed;
    }

    public final void release() {
        this.apiStats = null;
    }

    public final void setApiStats(ApiStats apiStats) {
        this.apiStats = apiStats;
    }

    public ExecutionTimeInterceptor(ApiStats apiStats, TimeProvider timeProvider) {
        this.apiStats = apiStats;
        this.timeProvider = timeProvider;
    }

    public /* synthetic */ ExecutionTimeInterceptor(ApiStats apiStats, TimeProvider timeProvider, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : apiStats, (i & 2) != 0 ? TimeProviderExtKt.newInstance() : timeProvider);
    }
}

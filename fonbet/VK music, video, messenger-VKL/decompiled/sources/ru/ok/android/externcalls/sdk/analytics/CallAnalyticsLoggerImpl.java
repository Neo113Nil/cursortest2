package ru.ok.android.externcalls.sdk.analytics;

import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;

/* compiled from: CallAnalyticsLoggerImpl.kt */
/* loaded from: classes9.dex */
public final class CallAnalyticsLoggerImpl implements CallAnalyticsLogger {
    private final gzs<RTCLog> loggerProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public CallAnalyticsLoggerImpl(gzs<? extends RTCLog> gzsVar) {
        this.loggerProvider = gzsVar;
    }

    private final RTCLog getLogger() {
        return this.loggerProvider.invoke();
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void d(String str, String str2) {
        getLogger().log(str, str2);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String str, String str2) {
        getLogger().log(str, str2);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void i(String str, String str2) {
        getLogger().log(str, str2);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void report(String str, String str2, Throwable th) {
        getLogger().reportException(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void v(String str, String str2) {
        getLogger().log(str, str2);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String str, String str2) {
        getLogger().log(str, str2);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String str, String str2, Throwable th) {
        getLogger().logException(str, str2, th);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String str, String str2, Throwable th) {
        getLogger().logException(str, str2, th);
    }
}

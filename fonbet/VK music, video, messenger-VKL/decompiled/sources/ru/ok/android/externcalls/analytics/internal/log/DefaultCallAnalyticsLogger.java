package ru.ok.android.externcalls.analytics.internal.log;

import android.util.Log;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* compiled from: DefaultCallAnalyticsLogger.kt */
/* loaded from: classes9.dex */
public final class DefaultCallAnalyticsLogger implements CallAnalyticsLogger {
    private final boolean isDebug;

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String str, String str2) {
        if (this.isDebug) {
            Log.e(str, str2);
        }
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String str, String str2) {
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String str, String str2, Throwable th) {
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String str, String str2, Throwable th) {
        if (this.isDebug) {
            Log.e(str, str2, th);
        }
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void d(String str, String str2) {
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void i(String str, String str2) {
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void v(String str, String str2) {
    }
}

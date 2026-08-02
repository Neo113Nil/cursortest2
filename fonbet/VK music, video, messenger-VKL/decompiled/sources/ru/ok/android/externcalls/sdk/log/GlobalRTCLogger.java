package ru.ok.android.externcalls.sdk.log;

import java.lang.ref.WeakReference;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: GlobalRTClLog.kt */
/* loaded from: classes9.dex */
public final class GlobalRTCLogger {
    public static final GlobalRTCLogger INSTANCE = new GlobalRTCLogger();
    private static WeakReference<RTCLog> log = new WeakReference<>(null);

    private GlobalRTCLogger() {
    }

    public static final void log(String str, String str2) {
        RTCLog rTCLog = log.get();
        if (rTCLog != null) {
            rTCLog.log(str, str2);
        }
    }

    public static final void logException(String str, String str2, Throwable th) {
        RTCLog rTCLog = log.get();
        if (rTCLog != null) {
            rTCLog.logException(str, str2, th);
        }
    }

    public static final void reportException(String str, String str2, Throwable th) {
        RTCLog rTCLog = log.get();
        if (rTCLog != null) {
            rTCLog.reportException(str, str2, th);
        }
    }

    public static final void setLog(RTCLog rTCLog) {
        log = new WeakReference<>(rTCLog);
    }
}

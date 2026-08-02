package ru.ok.android.externcalls.sdk.factory.internal;

import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;

/* compiled from: RTCLogWrapper.kt */
/* loaded from: classes9.dex */
public final class RTCLogWrapper implements RTCLog {
    private final gzs<RTCLog> logger;

    /* JADX WARN: Multi-variable type inference failed */
    public RTCLogWrapper(gzs<? extends RTCLog> gzsVar) {
        this.logger = gzsVar;
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void log(String str, String str2) {
        RTCLog invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.log(str, str2);
        }
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void logException(String str, String str2, Throwable th) {
        RTCLog invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.logException(str, str2, th);
        }
    }

    @Override // ru.ok.android.webrtc.RTCLog
    public void reportException(String str, String str2, Throwable th) {
        RTCLog invoke = this.logger.invoke();
        if (invoke != null) {
            invoke.reportException(str, str2, th);
        }
    }
}

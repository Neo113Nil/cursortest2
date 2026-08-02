package ru.ok.android.webrtc.utils;

import org.webrtc.HardwareVideoEncoderExceptionHandler;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public final class HardwareVideoEncoderExceptionHandlerImpl implements HardwareVideoEncoderExceptionHandler {
    public final RTCLog a;

    public HardwareVideoEncoderExceptionHandlerImpl(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    @Override // org.webrtc.HardwareVideoEncoderExceptionHandler
    public void handle(Throwable th) {
        if (th != null) {
            RTCLog rTCLog = this.a;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            rTCLog.reportException("HardwareVideoEncoderExceptionHandler", message, th);
        }
    }
}

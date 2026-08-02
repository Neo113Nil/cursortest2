package ru.ok.android.webrtc.signaling.transport.log;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.log.SignalingSensitiveFilter;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.signaling.transport.log.LogThrottler;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.ba40;
import xsna.bjn0;
import xsna.efz;
import xsna.jr;
import xsna.pod0;
import xsna.s3q0;
import xsna.tj0;
import xsna.y57;
import xsna.zr;

/* loaded from: classes9.dex */
public final class SignalingLogger {
    public final RTCLog a;
    public final RTCLogConfiguration b;
    public final boolean c;
    public final String d;
    public final LogThrottler e;
    public final LogThrottler f;

    public SignalingLogger(RTCLog rTCLog, RTCLogConfiguration rTCLogConfiguration, TimeProvider timeProvider, String str, boolean z) {
        this.a = rTCLog;
        this.b = rTCLogConfiguration;
        this.c = z;
        String a = zr.a("OK", str, "Signaling");
        this.d = a;
        if (!z || !rTCLogConfiguration.shouldThrottleSignalingLogs()) {
            this.e = null;
            this.f = null;
            return;
        }
        Looper myLooper = Looper.myLooper();
        Handler handler = myLooper != null ? new Handler(myLooper) : null;
        if (handler == null) {
            rTCLog.log(a, "Thread has no Looper, Handler won't be created for log throttlers");
        }
        this.e = new LogThrottler(handler, timeProvider, new ba40(this, 24));
        this.f = new LogThrottler(handler, timeProvider, new pod0(this, 6));
    }

    public static final s3q0 a(SignalingLogger signalingLogger, LogThrottler.ThrottleInfo throttleInfo) {
        signalingLogger.b(SignalingTransport.PING, throttleInfo);
        return s3q0.a;
    }

    public static final s3q0 b(SignalingLogger signalingLogger, LogThrottler.ThrottleInfo throttleInfo) {
        signalingLogger.a(SignalingTransport.PONG, throttleInfo);
        return s3q0.a;
    }

    public final void log(String str) {
        this.a.log(this.d, str);
    }

    public final void logConnect(String str) {
        if (this.b.shouldHideSensitiveInformation()) {
            str = SignalingSensitiveFilter.filterEndpoint(str);
        }
        bjn0.b("Connect to ", str, this.a, this.d);
    }

    public final void logException(String str, Throwable th) {
        this.a.logException(this.d, str, th);
    }

    public final void logSignalingCommand(String str) {
        if (!this.c) {
            if (this.b.shouldThrottleSignalingLogs()) {
                a(SignalingSensitiveFilter.filterJson(str));
                return;
            } else {
                a(str);
                return;
            }
        }
        LogThrottler logThrottler = this.f;
        if (logThrottler != null && (str.equals(SignalingTransport.PING) || str.equals(SignalingTransport.PONG))) {
            logThrottler.onEvent();
        } else if (this.b.shouldHideSensitiveInformation()) {
            a(this, SignalingSensitiveFilter.filterJson(str));
        } else {
            a(this, str);
        }
    }

    public final void logSignalingMessage(String str) {
        if (!this.c) {
            if (this.b.shouldThrottleSignalingLogs()) {
                b(SignalingSensitiveFilter.filterJson(str));
                return;
            } else {
                b(str);
                return;
            }
        }
        LogThrottler logThrottler = this.e;
        if (logThrottler != null && (str.equals(SignalingTransport.PING) || str.equals(SignalingTransport.PONG))) {
            logThrottler.onEvent();
        } else if (this.b.shouldHideSensitiveInformation()) {
            b(this, SignalingSensitiveFilter.filterJson(str));
        } else {
            b(this, str);
        }
    }

    public final void logSocketAlreadyInUse(String str) {
        if (this.b.shouldHideSensitiveInformation()) {
            str = SignalingSensitiveFilter.filterEndpoint(str);
        }
        bjn0.b("May be ERROR, socket is already with ", str, this.a, this.d);
    }

    public final void reportException(String str, Throwable th) {
        this.a.reportException(this.d, str, th);
    }

    public static final s3q0 a(SignalingLogger signalingLogger, String str) {
        signalingLogger.a(str, (LogThrottler.ThrottleInfo) null);
        return s3q0.a;
    }

    public static final s3q0 b(SignalingLogger signalingLogger, String str) {
        signalingLogger.b(str, (LogThrottler.ThrottleInfo) null);
        return s3q0.a;
    }

    public static String a(LogThrottler.ThrottleInfo throttleInfo) {
        int count = throttleInfo.getCount();
        long totalIntervalMs = throttleInfo.getTotalIntervalMs();
        long intervalMinMs = throttleInfo.getIntervalMinMs();
        long intervalMaxMs = throttleInfo.getIntervalMaxMs();
        StringBuilder b = jr.b(count, "(", " times over ", totalIntervalMs);
        tj0.d(b, "ms; intervals from ", intervalMinMs, "ms to ");
        return efz.b(intervalMaxMs, "ms)", b);
    }

    public final void b(String str, LogThrottler.ThrottleInfo throttleInfo) {
        String str2;
        RTCLog rTCLog = this.a;
        String str3 = this.d;
        if (throttleInfo == null || (str2 = a(throttleInfo)) == null) {
            str2 = "";
        }
        rTCLog.log(str3, y57.a(" <- ", str, " ", str2));
    }

    public final void b(String str) {
        bjn0.b(" <- ", str, this.a, this.d);
    }

    public final void a(String str, LogThrottler.ThrottleInfo throttleInfo) {
        String str2;
        RTCLog rTCLog = this.a;
        String str3 = this.d;
        if (throttleInfo == null || (str2 = a(throttleInfo)) == null) {
            str2 = "";
        }
        rTCLog.log(str3, y57.a(" -> ", str, " ", str2));
    }

    public final void a(String str) {
        bjn0.b(" -> ", str, this.a, this.d);
    }
}

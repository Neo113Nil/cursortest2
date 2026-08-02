package ru.ok.android.webrtc.log;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.schedulers.a;
import ru.ok.android.webrtc.RTCLog;
import xsna.s19;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class CallCodecLogger {
    public final RTCLog a;
    public final b b = new b();

    public CallCodecLogger(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public static final s3q0 a(CallCodecLogger callCodecLogger) {
        callCodecLogger.a();
        return s3q0.a;
    }

    public final void logCodecs() {
        this.b.b(new m(new s19(this, 0)).q(a.a()).subscribe());
    }

    public final void release() {
        this.b.dispose();
    }

    public final void a() {
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                try {
                    this.a.log("OKRTCCall", "codec=" + mediaCodecInfo.getName());
                } catch (Exception e) {
                    this.a.reportException("OKRTCCall", "codec.log", e);
                }
            }
        } catch (Exception e2) {
            this.a.reportException("OKRTCCall", "codec.log", e2);
        }
    }
}

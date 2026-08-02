package xsna;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandConfig;

/* loaded from: classes8.dex */
public final class ivy0 {
    public final RTCLog a;
    public final long b;
    public final RtcCommand c;
    public final RtcCommandConfig d;
    public long e = 0;
    public long f = 0;

    public ivy0(long j, RtcCommandConfig rtcCommandConfig, RTCLog rTCLog) {
        this.b = j;
        this.c = rtcCommandConfig.command;
        this.d = rtcCommandConfig;
        this.a = rTCLog;
    }
}

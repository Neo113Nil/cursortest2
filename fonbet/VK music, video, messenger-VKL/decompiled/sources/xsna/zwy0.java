package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcCommand;

/* loaded from: classes8.dex */
public final class zwy0 {
    public final RTCLog a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Handler c = new Handler(Looper.getMainLooper());

    public zwy0(RTCLog rTCLog) {
        if (rTCLog == null) {
            throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
        }
        this.a = rTCLog;
    }

    public final void a(RtcCommand rtcCommand) {
        this.c.post(new xy4(8, this, rtcCommand));
    }
}

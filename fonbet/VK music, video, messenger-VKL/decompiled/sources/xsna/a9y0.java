package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes8.dex */
public final class a9y0 extends Handler {
    public final RTCLog a;
    public final String b;
    public final okcalls.z c;
    public double d;
    public double e;
    public double f;
    public long g;
    public long h;
    public double i;

    public a9y0(Looper looper, RTCLog rTCLog, String str, okcalls.z zVar) {
        super(looper);
        this.a = rTCLog;
        this.b = str;
        this.c = zVar;
    }

    public final void a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        double d = this.e + 1.0d;
        this.e = d;
        double d2 = this.d + (elapsedRealtime - j);
        this.d = d2;
        double d3 = d2 / d;
        double d4 = this.i;
        Object valueOf = d4 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Double.valueOf(this.f / d4) : 0;
        if (elapsedRealtime - this.g > 10000) {
            StringBuilder a = lby.a("Total calls: ", this.d, ", average call time: ");
            a.append(d3);
            a.append(", average idle time ");
            a.append(valueOf);
            this.a.log(this.b, a.toString());
            this.g = elapsedRealtime;
            this.e = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.i = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.f = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            this.h = 0L;
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.h > 0) {
                this.f = elapsedRealtime - r2;
                this.i += 1.0d;
            }
            super.dispatchMessage(message);
            this.h = SystemClock.elapsedRealtime();
            message.getCallback();
            a(elapsedRealtime);
        } catch (Throwable th) {
            message.getCallback();
            a(elapsedRealtime);
            this.c.invoke(th);
        }
    }
}

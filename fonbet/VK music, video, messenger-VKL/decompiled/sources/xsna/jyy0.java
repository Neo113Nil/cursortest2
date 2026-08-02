package xsna;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.time.DurationUnit;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.utils.time.TimeProvider;

/* loaded from: classes8.dex */
public final class jyy0 implements CallTimings {
    public final TimeProvider b;
    public final RTCLog c;
    public final long d;
    public final AtomicLong e;

    public jyy0(TimeProvider timeProvider, RTCLog rTCLog) {
        this.b = timeProvider;
        this.c = rTCLog;
        long msSinceBoot = timeProvider.getMsSinceBoot();
        this.d = msSinceBoot;
        this.e = new AtomicLong(msSinceBoot);
    }

    @Override // ru.ok.android.webrtc.CallTimings
    public final void trace(String str) {
        long msSinceBoot = this.b.getMsSinceBoot();
        long j = msSinceBoot - this.d;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long f = eoo.f(j, durationUnit);
        long f2 = eoo.f(msSinceBoot - this.e.getAndSet(msSinceBoot), durationUnit);
        this.c.log("CallTimings", zno.m(f) + " (" + zno.m(f2) + "): " + str);
    }
}

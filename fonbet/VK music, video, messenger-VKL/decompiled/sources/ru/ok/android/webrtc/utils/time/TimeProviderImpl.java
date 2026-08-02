package ru.ok.android.webrtc.utils.time;

import android.os.SystemClock;
import java.time.Clock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class TimeProviderImpl implements TimeProvider {
    public Long a;
    public Long b;

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public long getMsSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public Long getServerTimeMs() {
        Long l = this.b;
        if (l != null) {
            long msSinceBoot = getMsSinceBoot() - l.longValue();
            Long l2 = this.a;
            if (l2 != null) {
                return Long.valueOf(l2.longValue() + msSinceBoot);
            }
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public long localTimeMs() {
        return System.currentTimeMillis();
    }

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public Long mapToLocalTimeMs(long j) {
        Long serverTimeMs = getServerTimeMs();
        if (serverTimeMs == null) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() + (j - serverTimeMs.longValue()));
    }

    public final synchronized void setServerTimeMs(long j) {
        if (j != 0) {
            if (this.a == null) {
                this.a = Long.valueOf(j);
                this.b = Long.valueOf(getMsSinceBoot());
            }
        }
    }

    public final synchronized void setServerTimeNs(long j) {
        setServerTimeMs(TimeUnit.NANOSECONDS.toMillis(j));
    }

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public Timestamp timeMs() {
        Long serverTimeMs = getServerTimeMs();
        if (serverTimeMs != null) {
            Timestamp server = Timestamp.Companion.server(serverTimeMs.longValue());
            if (server != null) {
                return server;
            }
        }
        return Timestamp.Companion.utc(Clock.systemUTC().millis());
    }

    @Override // ru.ok.android.webrtc.utils.time.TimeProvider
    public long utcTimeMs() {
        return Clock.systemUTC().millis();
    }
}

package xsna;

import java.time.Instant;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ExerciseLap.kt */
/* loaded from: classes12.dex */
public final class g4q {
    public final Instant a;
    public final Instant b;
    public final c2z c;

    public g4q(Instant instant, Instant instant2, c2z c2zVar) {
        this.a = instant;
        this.b = instant2;
        this.c = c2zVar;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("startTime must be before endTime.");
        }
        if (c2zVar != null) {
            double a = c2zVar.a();
            if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE > a || a > 1000000.0d) {
                throw new IllegalArgumentException("length valid range: 0-1000000.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4q)) {
            return false;
        }
        g4q g4qVar = (g4q) obj;
        return epx.f(this.a, g4qVar.a) && epx.f(this.b, g4qVar.b) && epx.f(this.c, g4qVar.c);
    }

    public final int hashCode() {
        int c = w11.c(this.b, this.a.hashCode() * 31, 31);
        c2z c2zVar = this.c;
        return c + (c2zVar != null ? c2zVar.hashCode() : 0);
    }

    public final String toString() {
        return "ExerciseLap(startTime=" + this.a + ", endTime=" + this.b + ", length=" + this.c + ')';
    }
}

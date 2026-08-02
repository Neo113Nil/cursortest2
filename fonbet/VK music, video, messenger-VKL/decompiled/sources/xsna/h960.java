package xsna;

import java.util.List;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: NewVideoStatConfig.kt */
/* loaded from: classes11.dex */
public final class h960 {
    public static final a e = new a();
    public static final h960 f = new h960(e43.l(1000L, 2000L), 60000, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, 2);
    public final List<Long> a;
    public final long b;
    public final long c;
    public final int d;

    /* compiled from: NewVideoStatConfig.kt */
    public static final class a {
    }

    public h960(List<Long> list, long j, long j2, int i) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h960)) {
            return false;
        }
        h960 h960Var = (h960) obj;
        return epx.f(this.a, h960Var.a) && this.b == h960Var.b && this.c == h960Var.c && this.d == h960Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewVideoStatConfig(watchedNTimePoints=");
        sb.append(this.a);
        sb.append(", telemetryInterval=");
        sb.append(this.b);
        sb.append(", heartBeatInterval=");
        sb.append(this.c);
        sb.append(", maxSessions=");
        return vu5.b(sb, this.d, ')');
    }
}

package xsna;

import com.ironsource.X3;
import java.util.List;

/* compiled from: VideoSendExtendedInfoInStatsConfig.kt */
/* loaded from: classes11.dex */
public final class jft0 {
    public static final a c = new a();
    public static final jft0 d = new jft0(0);
    public final String a;
    public final List<String> b;

    /* compiled from: VideoSendExtendedInfoInStatsConfig.kt */
    public static final class a {
    }

    public jft0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jft0)) {
            return false;
        }
        jft0 jft0Var = (jft0) obj;
        return epx.f(this.a, jft0Var.a) && epx.f(this.b, jft0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSendExtendedInfoInStatsConfig(eventToSendSoc=");
        sb.append(this.a);
        sb.append(", eventsToSendExtendedInfo=");
        return ms9.a(')', sb, this.b);
    }

    public jft0(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public /* synthetic */ jft0(int i) {
        this("player_ready", e43.l("watch_coverage_record", "quality", X3.i.f0, "seek", "empty_buffer", "close_at_empty_buffer", "content_error", "track_switch", "failover", "quality"));
    }
}

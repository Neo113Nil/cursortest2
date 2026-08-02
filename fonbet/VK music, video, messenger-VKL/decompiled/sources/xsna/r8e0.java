package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ProtoToRecordUtils.kt */
/* loaded from: classes12.dex */
public final class r8e0 {
    public static double a(androidx.health.platform.client.proto.m mVar, String str) {
        androidx.health.platform.client.proto.r rVar = mVar.H().get(str);
        return rVar != null ? rVar.u() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    public static double b(androidx.health.platform.client.proto.p pVar, String str) {
        androidx.health.platform.client.proto.r rVar = pVar.t().get(str);
        return rVar != null ? rVar.u() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    public static final Instant c(androidx.health.platform.client.proto.m mVar) {
        return Instant.ofEpochMilli(mVar.x());
    }

    public static final ZoneOffset d(androidx.health.platform.client.proto.m mVar) {
        if (mVar.L()) {
            return ZoneOffset.ofTotalSeconds(mVar.y());
        }
        return null;
    }

    public static long e(androidx.health.platform.client.proto.m mVar, String str) {
        androidx.health.platform.client.proto.r rVar = mVar.H().get(str);
        if (rVar != null) {
            return rVar.w();
        }
        return 0L;
    }

    public static long f(androidx.health.platform.client.proto.p pVar) {
        androidx.health.platform.client.proto.r rVar = pVar.t().get("bpm");
        if (rVar != null) {
            return rVar.w();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    public static final hi20 g(androidx.health.platform.client.proto.m mVar) {
        u5m u5mVar;
        String F = mVar.N() ? mVar.F() : "";
        luk lukVar = new luk(mVar.u().u());
        Instant ofEpochMilli = Instant.ofEpochMilli(mVar.G());
        String s = mVar.J() ? mVar.s() : null;
        long t = mVar.t();
        if (mVar.K()) {
            androidx.health.platform.client.proto.o w = mVar.w();
            u5mVar = new u5m(((Number) x6m.a.getOrDefault(w.v(), 0)).intValue(), w.w() ? w.t() : null, w.x() ? w.u() : null);
        } else {
            u5mVar = null;
        }
        return new hi20(mVar.A(), F, lukVar, ofEpochMilli, s, t, u5mVar);
    }

    public static final Instant h(androidx.health.platform.client.proto.m mVar) {
        return Instant.ofEpochMilli(mVar.C());
    }

    public static final ZoneOffset i(androidx.health.platform.client.proto.m mVar) {
        if (mVar.M()) {
            return ZoneOffset.ofTotalSeconds(mVar.D());
        }
        return null;
    }

    public static final String j(androidx.health.platform.client.proto.m mVar, String str) {
        androidx.health.platform.client.proto.r rVar = mVar.H().get(str);
        if (rVar != null) {
            return rVar.x();
        }
        return null;
    }

    public static final Instant k(androidx.health.platform.client.proto.m mVar) {
        return Instant.ofEpochMilli(mVar.z());
    }

    public static final ZoneOffset l(androidx.health.platform.client.proto.m mVar) {
        if (mVar.O()) {
            return ZoneOffset.ofTotalSeconds(mVar.I());
        }
        return null;
    }

    public static final int m(androidx.health.platform.client.proto.m mVar, String str, Map map) {
        androidx.health.platform.client.proto.r rVar = mVar.H().get(str);
        String v = rVar != null ? rVar.v() : null;
        if (v == null) {
            return 0;
        }
        return ((Number) map.getOrDefault(v, 0)).intValue();
    }
}

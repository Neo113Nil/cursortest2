package xsna;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dqk;
import xsna.gkk0;
import xsna.r0l0;

/* compiled from: AggregatorUtils.kt */
/* loaded from: classes12.dex */
public final class tb1 {
    public static boolean a(zef0 zef0Var, cvo0 cvo0Var) {
        Instant instant;
        if (zef0Var instanceof jg7) {
            jg7 jg7Var = (jg7) zef0Var;
            return fz5.u(jg7Var.a, cvo0Var, jg7Var.b);
        }
        if (zef0Var instanceof yn70) {
            return ((yn70) zef0Var).L != null && c((oox) zef0Var, cvo0Var) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        if (!(zef0Var instanceof lni0)) {
            throw new IllegalStateException(("Unsupported record type for aggregation fallback: " + ((String) whf0.b.get(fpf0.a(zef0Var.getClass())))).toString());
        }
        lni0 lni0Var = (lni0) zef0Var;
        List K = lni0Var.K();
        if ((K instanceof Collection) && K.isEmpty()) {
            return false;
        }
        for (Object obj : K) {
            if (obj instanceof dqk.a) {
                instant = ((dqk.a) obj).a;
            } else if (obj instanceof gkk0.d) {
                instant = ((gkk0.d) obj).a;
            } else {
                if (!(obj instanceof r0l0.a)) {
                    throw new IllegalStateException(rqi.c(obj, "Unsupported type for time: "));
                }
                instant = ((r0l0.a) obj).a;
            }
            if (fz5.u(instant, cvo0Var, lni0Var.d())) {
                return true;
            }
        }
        return false;
    }

    public static double b(Object obj) {
        if (obj instanceof dqk.a) {
            return ((dqk.a) obj).b;
        }
        if (obj instanceof gkk0.d) {
            return ((gkk0.d) obj).b.a();
        }
        if (obj instanceof r0l0.a) {
            return ((r0l0.a) obj).b;
        }
        throw new IllegalStateException(rqi.c(obj, "Unsupported type for value: "));
    }

    public static double c(oox ooxVar, cvo0 cvo0Var) {
        Instant A;
        Instant A2;
        boolean z = cvo0Var instanceof u7x;
        if (z) {
            A = ((u7x) cvo0Var).a;
        } else {
            if (!(cvo0Var instanceof zvz)) {
                throw new NoWhenBranchMatchedException();
            }
            A = fz5.A(((zvz) cvo0Var).a, ooxVar.d());
        }
        if (z) {
            A2 = ((u7x) cvo0Var).b;
        } else {
            if (!(cvo0Var instanceof zvz)) {
                throw new NoWhenBranchMatchedException();
            }
            A2 = fz5.A(((zvz) cvo0Var).b, ooxVar.c());
        }
        return Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Duration.between((Instant) jw5.v(ooxVar.a(), A), (Instant) jw5.w(ooxVar.b(), A2)).toMillis() / Duration.between(ooxVar.a(), ooxVar.b()).toMillis());
    }
}

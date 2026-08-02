package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.concurrent.ThreadExecutorStuckException;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ gk2(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = this.b;
        long j = this.c;
        switch (i) {
            case 0:
                return ((kw8) obj).c(new yj2(j, 0));
            case 1:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.P(ggjVar, this.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 3, 62);
                return s3q0.a;
            default:
                adx0 adx0Var = (adx0) obj;
                int i2 = ThreadExecutorStuckException.b;
                StringBuilder sb = new StringBuilder("WatchdogTask(\nexecutionTime=");
                sb.append(TimeUnit.NANOSECONDS.toMillis(j - adx0Var.c));
                sb.append("ms, submitThread='");
                sb.append(adx0Var.a);
                sb.append("', ");
                Thread thread = adx0Var.d;
                String str2 = "";
                if (thread != null) {
                    StringBuilder sb2 = new StringBuilder("runningThread='");
                    String name = thread.getName();
                    if (name == null) {
                        name = "";
                    }
                    str = i5s.a(sb2, name, "', ");
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("\n\tsubmit_stacktrace:\n\t\t");
                sb.append(j5g.g0(j5g.H0(adx0.b(adx0Var.e), 5), "\n\t\t", null, null, 0, null, 62));
                if (thread != null) {
                    str2 = "\n\tlocked_stacktrace:\n\t\t" + j5g.g0(j5g.H0(adx0.b(rl3.u0(thread.getStackTrace())), 5), "\n\t\t", null, null, 0, null, 62);
                }
                return i5s.a(sb, str2, "\n)");
        }
    }
}

package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.time.Instant;
import java.util.function.Consumer;

/* compiled from: PacketInfo.java */
/* loaded from: classes8.dex */
public class jly0 {
    public final Instant a;
    public final tly0 b;
    public final Consumer<tly0> c;

    public jly0(Instant instant, tly0 tly0Var, Consumer<tly0> consumer) {
        this.a = instant;
        this.b = tly0Var;
        this.c = consumer;
    }

    public String toString() {
        tly0 tly0Var = this.b;
        char charAt = tly0Var.n().name().charAt(0);
        long j = tly0Var.b;
        return "Packet " + charAt + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (j >= 0 ? Long.valueOf(j) : ".");
    }
}

package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.g;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class l4z0 {
    public static final long d;
    public final long a;
    public final long b;
    public final ycs0 c;

    static {
        g gVar = g.a;
        d = v1x0.a;
    }

    public l4z0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = new ycs0();
    }

    public final void a(long j, long j2, String str, long j3) {
        long j4 = (((j * 1000) * j3) / this.a) / j2;
        ycs0 ycs0Var = this.c;
        vku vkuVar = (vku) ycs0Var.get(str);
        if (vkuVar == null) {
            Object obj = ComponentHistograms.b;
            vkuVar = ffx.J(vez0.u(), str, 10L, this.b, 100);
            ycs0Var.put(str, vkuVar);
        }
        vkuVar.c(j4, TimeUnit.MILLISECONDS);
    }

    public l4z0() {
        this(d, 500000L);
    }
}

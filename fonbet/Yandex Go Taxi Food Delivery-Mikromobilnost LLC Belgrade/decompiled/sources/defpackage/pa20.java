package defpackage;

import com.yandex.plus.core.benchmark.b;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class pa20 extends p45 {
    public final ComponentHistograms b;

    public pa20(ComponentHistograms componentHistograms) {
        this.b = componentHistograms;
    }

    @Override // defpackage.p45
    public final void d(ll5 ll5Var, String str, bzf0 bzf0Var, TimeUnit timeUnit) {
        long j = bzf0Var.a;
        ffx.J(this.b, str, timeUnit.toMillis(1L), timeUnit.toMillis(j), 50).c(bzf0Var.b.convert(((b) ll5Var).a(), TimeUnit.NANOSECONDS), timeUnit);
    }
}

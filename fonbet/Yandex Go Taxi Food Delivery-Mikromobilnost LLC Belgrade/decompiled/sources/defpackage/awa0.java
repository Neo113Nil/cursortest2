package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class awa0 {
    public final AppAnalyticsReporter a;
    public final String b;

    public awa0(AppAnalyticsReporter appAnalyticsReporter, String str) {
        this.a = appAnalyticsReporter;
        this.b = str;
    }

    public final void a(long j, String str) {
        String concat = "Perf.".concat(str);
        Object obj = ComponentHistograms.b;
        vku J = ffx.J(vez0.A("com.yandex.yb.sdk"), concat, 1L, 10000L, 50);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        J.c(j, timeUnit);
        this.a.b(concat, b.i(new Pair("duration", String.valueOf(j)), new Pair("timeunit", timeUnit.name()), new Pair("process_name", this.b)));
        e5z0 e5z0Var = i5z0.a;
        StringBuilder l = x4e.l("Reported time for ", concat, Extension.COLON_SPACE, j);
        l.append(" ");
        l.append(timeUnit);
        e5z0Var.g(l.toString(), new Object[0]);
    }

    public final zva0 b(String str) {
        return new zva0(this, String.format("%s.LoadTime", Arrays.copyOf(new Object[]{str}, 1)));
    }
}

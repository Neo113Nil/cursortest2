package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.MetricsState;

/* loaded from: classes8.dex */
public final class dd20 {
    public static final vku g = ffx.I(1, 720, 50, "UMA.ActualLogUploadInterval");
    public static final tnt0 h;
    public static final vku i;
    public static final vku j;
    public final ad20 a;
    public final xc20 b;
    public boolean c;
    public zc20 d;
    public vd20 e;
    public long f = -1;

    static {
        Object obj = ComponentHistograms.b;
        ComponentHistograms u = vez0.u();
        vku a = u.a("UMA.LogUpload.ResponseOrErrorCode");
        if (a == null) {
            a = u.e(new tnt0());
        }
        if (!(a instanceof tnt0)) {
            ny61.r("Already registered as non-sparse histogram");
            return;
        }
        h = (tnt0) a;
        i = ffx.I(1, 10000, 50, "UMA.LogSize.OnSuccess");
        j = ffx.I(1, 1000000, 50, "UMA.Large Rejected Log was Discarded");
    }

    public dd20(ad20 ad20Var, MetricsState metricsState) {
        this.a = ad20Var;
        this.b = new xc20(metricsState);
    }

    public final void a() {
        if (this.c) {
            this.e.start(15000L);
        }
    }
}

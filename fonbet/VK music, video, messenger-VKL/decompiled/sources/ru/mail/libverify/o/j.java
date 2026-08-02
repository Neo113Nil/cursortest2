package ru.mail.libverify.o;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.tracer.base.ucum.UcumUtils;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.performance.metrics.TracerPerformanceMetricsLite;
import xsna.bpn0;
import xsna.bqy;
import xsna.gzs;
import xsna.rmk0;

/* loaded from: classes9.dex */
public final class j implements f {
    private final w a;
    private final ApplicationModule.c b;
    private final Lazy c;

    public static final class a extends Lambda implements gzs<TracerPerformanceMetricsLite> {
        final /* synthetic */ bqy<TracerLite> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bqy<TracerLite> bqyVar) {
            super(0);
            this.a = bqyVar;
        }

        @Override // xsna.gzs
        public final TracerPerformanceMetricsLite invoke() {
            return new TracerPerformanceMetricsLite(this.a.get());
        }
    }

    public j(bqy<TracerLite> bqyVar, w wVar, ApplicationModule.c cVar) {
        this.a = wVar;
        this.b = cVar;
        this.c = new bpn0(new a(bqyVar));
    }

    @Override // ru.mail.libverify.o.f
    public final void a(ru.mail.libverify.o.a aVar, long j, Pair... pairArr) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (this.b.b()) {
            return;
        }
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit2.convert(j, timeUnit);
        FileLog.d("TracerMetricsLogger", "Send sample event[" + aVar.name() + "]=" + convert + UcumUtils.UCUM_NANOSECONDS);
        TracerPerformanceMetricsLite tracerPerformanceMetricsLite = (TracerPerformanceMetricsLite) this.c.getValue();
        String name = aVar.name();
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.b(pairArr);
        w wVar = this.a;
        rmk0Var.b(new Pair[]{new Pair("applicationName", wVar.G()), new Pair("applicationVersion", wVar.k()), new Pair("libverifyBuild", "297"), new Pair("libverifyLocale", wVar.d().getCountry())});
        ArrayList<Object> arrayList = rmk0Var.a;
        tracerPerformanceMetricsLite.sample(name, convert, timeUnit2, (Pair<String, ? extends Object>[]) arrayList.toArray(new Pair[arrayList.size()]));
    }
}

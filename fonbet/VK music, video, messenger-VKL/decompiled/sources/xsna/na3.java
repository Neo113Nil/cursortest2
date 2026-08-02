package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tracer.CoreTracerConfiguration;
import ru.ok.tracer.HasTracerConfiguration;
import ru.ok.tracer.HasTracerLogger;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.crash.report.CrashFreeConfiguration;
import ru.ok.tracer.crash.report.CrashReportConfiguration;
import ru.ok.tracer.heap.dumps.HeapDumpConfiguration;
import ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration;
import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import ru.ok.tracer.profiler.sampling.SamplingProfilerConfiguration;
import ru.ok.tracer.profiler.systrace.SystraceProfilerConfiguration;
import ru.ok.tracer.utils.TracerLoggerDelegate;
import xsna.ka3;

/* compiled from: AppTracerConfiguration.kt */
/* loaded from: classes.dex */
public interface na3 extends HasTracerConfiguration, HasTracerLogger {

    /* compiled from: AppTracerConfiguration.kt */
    public static final class a implements TracerLoggerDelegate {
        @Override // ru.ok.tracer.utils.TracerLoggerDelegate
        public final int getMinLogPriority() {
            return 2;
        }

        @Override // ru.ok.tracer.utils.TracerLoggerDelegate
        public final void println(int i, String str, Throwable th) {
            if (i == 2) {
                if (str != null) {
                    L.e(str);
                }
            } else if (i == 3) {
                if (str != null) {
                    L.e(str);
                }
            } else if (i == 5) {
                if (str != null) {
                    L.e(str);
                }
            } else if (i == 6 && th != null) {
                L.i(th);
            }
        }
    }

    @Override // ru.ok.tracer.HasTracerConfiguration
    default List<TracerConfiguration> getTracerConfiguration() {
        ka3.a aVar = ka3.a;
        Context applicationContext = ((VKApplication) this).getApplicationContext();
        if (epx.f(ka3.a, ka3.a.g)) {
            try {
                ka3.a = ka3.a.C3172a.a(ka3.a(applicationContext));
            } catch (Throwable unused) {
            }
        }
        ka3.a aVar2 = ka3.a;
        CrashReportConfiguration.Companion companion = CrashReportConfiguration.Companion;
        CrashReportConfiguration.Builder builder = new CrashReportConfiguration.Builder();
        builder.setEnabled(aVar2.a);
        builder.setSendAnr(aVar2.b);
        builder.setNativeEnabled(false);
        s3q0 s3q0Var = s3q0.a;
        CrashReportConfiguration build = builder.build();
        CrashFreeConfiguration.Companion companion2 = CrashFreeConfiguration.Companion;
        CrashFreeConfiguration.Builder builder2 = new CrashFreeConfiguration.Builder();
        builder2.setEnabled(true);
        CrashFreeConfiguration build2 = builder2.build();
        HeapDumpConfiguration.Companion companion3 = HeapDumpConfiguration.Companion;
        HeapDumpConfiguration.Builder builder3 = new HeapDumpConfiguration.Builder();
        builder3.setEnabled(aVar2.c);
        HeapDumpConfiguration build3 = builder3.build();
        SamplingProfilerConfiguration.Companion companion4 = SamplingProfilerConfiguration.Companion;
        SamplingProfilerConfiguration.Builder builder4 = new SamplingProfilerConfiguration.Builder();
        builder4.setEnabled(aVar2.e);
        SamplingProfilerConfiguration build4 = builder4.build();
        SystraceProfilerConfiguration.Companion companion5 = SystraceProfilerConfiguration.Companion;
        SystraceProfilerConfiguration.Builder builder5 = new SystraceProfilerConfiguration.Builder();
        builder5.setEnabled(aVar2.d);
        ArrayList o = e43.o(build, build2, build3, build4, builder5.build(), OpenTelemetryConfiguration.Companion.build(new ma3(0, aVar2, this)));
        CoreTracerConfiguration.Companion companion6 = CoreTracerConfiguration.Companion;
        CoreTracerConfiguration.Builder builder6 = new CoreTracerConfiguration.Builder();
        if (BuildInfo.h()) {
            builder6.setDebugUpload(true);
        }
        builder6.setIoExecutor(new mqy(new sq6(16)));
        builder6.setBgExecutor(new mqy(new c13(15)));
        CoreTracerConfiguration build5 = builder6.build();
        if (build5 != null) {
            o.add(build5);
        }
        if (aVar2.f.d) {
            m1u.d(TracerOpenTelemetry.INSTANCE);
        }
        return o;
    }
}

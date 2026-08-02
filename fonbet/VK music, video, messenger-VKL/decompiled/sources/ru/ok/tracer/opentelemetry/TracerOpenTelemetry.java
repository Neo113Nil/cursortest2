package ru.ok.tracer.opentelemetry;

import android.os.Build;
import com.ironsource.X3;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import ru.ok.tracer.BuildConfig;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.opentelemetry.TracerOpenTelemetry;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryLogExporter;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryLogProcessor;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetryMetricExporter;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanExporter;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanProcessor;
import ru.ok.tracer.opentelemetry.record.OpenTelemetryRecorderProvider;
import ru.ok.tracer.opentelemetry.record.TracerOpenTelemetryRecorderProvider;
import xsna.aj20;
import xsna.ajl0;
import xsna.bdl;
import xsna.bs80;
import xsna.bxj0;
import xsna.cj20;
import xsna.cvf;
import xsna.elh0;
import xsna.epl;
import xsna.fkh0;
import xsna.fr9;
import xsna.gag0;
import xsna.gcd0;
import xsna.ggj0;
import xsna.gkh0;
import xsna.glh0;
import xsna.gn5;
import xsna.go9;
import xsna.gpj;
import xsna.i94;
import xsna.ji90;
import xsna.jk3;
import xsna.ky80;
import xsna.l000;
import xsna.lk3;
import xsna.mep0;
import xsna.mx90;
import xsna.myc0;
import xsna.q94;
import xsna.syp;
import xsna.tjh0;
import xsna.tn5;
import xsna.wdp0;
import xsna.wjh0;
import xsna.y100;
import xsna.ydp0;
import xsna.yi20;
import xsna.yu6;
import xsna.zhk0;
import xsna.zu6;

/* compiled from: TracerOpenTelemetry.kt */
/* loaded from: classes11.dex */
public final class TracerOpenTelemetry implements bs80 {
    public static final TracerOpenTelemetry INSTANCE = new TracerOpenTelemetry();
    private static final AtomicReference<gag0> atomicResource = new AtomicReference<>();
    private static final AtomicReference<y100> atomicLoggerProvider = new AtomicReference<>();
    private static final AtomicReference<cj20> atomicMeterProvider = new AtomicReference<>();
    private static final AtomicReference<OpenTelemetryRecorderProvider> atomicRecorderProvider = new AtomicReference<>();
    private static final AtomicReference<mep0> atomicTracerProvider = new AtomicReference<>();

    private TracerOpenTelemetry() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [xsna.kep0] */
    private final y100 createLoggerProvider() {
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        if (!openTelemetryConfiguration.getEnabled$tracer_opentelemetry_release()) {
            return y100.m();
        }
        gn5 gn5Var = l000.a;
        int maxNumberOfAttributesPerLog$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfAttributesPerLog$tracer_opentelemetry_release();
        myc0.c("maxNumberOfAttributes must be non-negative", maxNumberOfAttributesPerLog$tracer_opentelemetry_release >= 0);
        int maxAttributeValueLength$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxAttributeValueLength$tracer_opentelemetry_release();
        myc0.c("maxAttributeValueLength must be non-negative", maxAttributeValueLength$tracer_opentelemetry_release >= 0);
        final gn5 gn5Var2 = new gn5(maxNumberOfAttributesPerLog$tracer_opentelemetry_release, maxAttributeValueLength$tracer_opentelemetry_release);
        wjh0 o = tjh0.o();
        o.c(getClock());
        o.e(getResource());
        o.d(new Supplier() { // from class: xsna.kep0
            @Override // java.util.function.Supplier
            public final Object get() {
                l000 createLoggerProvider$lambda$4;
                createLoggerProvider$lambda$4 = TracerOpenTelemetry.createLoggerProvider$lambda$4(gn5.this);
                return createLoggerProvider$lambda$4;
            }
        });
        TracerOpenTelemetryLogProcessor.Companion companion = TracerOpenTelemetryLogProcessor.Companion;
        zu6 b = yu6.b(TracerOpenTelemetryLogExporter.Companion.create(getClock()));
        long logsScheduleDelayMillis$tracer_opentelemetry_release = openTelemetryConfiguration.getLogsScheduleDelayMillis$tracer_opentelemetry_release();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b.c(logsScheduleDelayMillis$tracer_opentelemetry_release);
        b.b(openTelemetryConfiguration.getMaxLogCountToUpload$tracer_opentelemetry_release());
        o.a(companion.create(b.a()));
        return o.b();
    }

    private final cj20 createMeterProvider() {
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        if (!openTelemetryConfiguration.getEnabled$tracer_opentelemetry_release()) {
            return cj20.m();
        }
        gkh0 n = fkh0.n();
        n.c(getClock());
        n.d(getResource());
        syp b = mx90.b(TracerOpenTelemetryMetricExporter.Companion.create(getClock()));
        long metricsUploadIntervalMillis$tracer_opentelemetry_release = openTelemetryConfiguration.getMetricsUploadIntervalMillis$tracer_opentelemetry_release();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b.b(metricsUploadIntervalMillis$tracer_opentelemetry_release);
        n.b(b.a());
        return TracerOpenTelemetryMeterProvider.Companion.create(n.a());
    }

    private final OpenTelemetryRecorderProvider createRecorderProvider() {
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        if (!openTelemetryConfiguration.getEnabled$tracer_opentelemetry_release()) {
            OpenTelemetryRecorderProvider.Companion.noop();
        }
        return TracerOpenTelemetryRecorderProvider.Companion.create(getClock(), getResource(), openTelemetryConfiguration.getMetricsUploadIntervalMillis$tracer_opentelemetry_release(), TracerOpenTelemetryMetricExporter.Companion.create(getClock()));
    }

    private final gag0 createResource() {
        i94 i94Var;
        i94 i94Var2;
        i94 i94Var3;
        i94 i94Var4;
        i94 i94Var5;
        i94 i94Var6;
        i94 i94Var7;
        i94 i94Var8;
        i94 i94Var9;
        i94 i94Var10;
        i94 i94Var11;
        i94 i94Var12;
        i94 i94Var13;
        i94 i94Var14;
        i94 i94Var15;
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        SystemState currentSystemState = Tracer.INSTANCE.getStateStorage().getCurrentSystemState();
        fr9 a = gag0.a();
        i94Var = TracerOpenTelemetryKt.ATTR_KEY_APP_NAME;
        String serviceName$tracer_opentelemetry_release = openTelemetryConfiguration.getServiceName$tracer_opentelemetry_release();
        if (serviceName$tracer_opentelemetry_release == null) {
            serviceName$tracer_opentelemetry_release = go9.b("unknown_service:", currentSystemState.getPackageName());
        }
        a.f(i94Var, serviceName$tracer_opentelemetry_release);
        i94Var2 = TracerOpenTelemetryKt.ATTR_KEY_APP_VERSION;
        a.f(i94Var2, currentSystemState.getVersionName());
        i94Var3 = TracerOpenTelemetryKt.ATTR_KEY_APP_VERSION_CODE;
        a.f(i94Var3, Long.valueOf(currentSystemState.getVersionCode()));
        i94Var4 = TracerOpenTelemetryKt.ATTR_KEY_SDK_NAME;
        a.f(i94Var4, BuildConfig.LIBRARY_PACKAGE_NAME);
        i94Var5 = TracerOpenTelemetryKt.ATTR_KEY_SDK_VERSION;
        a.f(i94Var5, "1.3.3");
        i94Var6 = TracerOpenTelemetryKt.ATTR_KEY_SDK_LANGUAGE;
        a.f(i94Var6, "java");
        i94Var7 = TracerOpenTelemetryKt.ATTR_KEY_OS_NAME;
        a.f(i94Var7, X3.d);
        i94Var8 = TracerOpenTelemetryKt.ATTR_KEY_OS_VERSION;
        a.f(i94Var8, Build.VERSION.RELEASE);
        i94Var9 = TracerOpenTelemetryKt.ATTR_KEY_OS_TYPE;
        a.f(i94Var9, "linux");
        i94Var10 = TracerOpenTelemetryKt.ATTR_KEY_OS_SDK_INT;
        a.e(i94Var10, Build.VERSION.SDK_INT);
        i94Var11 = TracerOpenTelemetryKt.ATTR_KEY_DEVICE_MANUFACTURER;
        a.f(i94Var11, Build.MANUFACTURER);
        i94Var12 = TracerOpenTelemetryKt.ATTR_KEY_DEVICE_MODEL_NAME;
        a.f(i94Var12, Build.MODEL);
        i94Var13 = TracerOpenTelemetryKt.ATTR_KEY_DEVICE_MODEL_ID;
        a.f(i94Var13, Build.DEVICE);
        i94Var14 = TracerOpenTelemetryKt.ATTR_KEY_DEVICE_ID;
        a.f(i94Var14, currentSystemState.getDeviceId());
        String environment = currentSystemState.getEnvironment();
        if (environment != null) {
            i94Var15 = TracerOpenTelemetryKt.ATTR_KEY_ENVIRONMENT;
            a.f(i94Var15, environment);
        }
        return a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [xsna.jep0] */
    private final mep0 createTracerProvider() {
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        if (!openTelemetryConfiguration.getEnabled$tracer_opentelemetry_release()) {
            return epl.b;
        }
        tn5 tn5Var = zhk0.a;
        int maxNumberOfEventsPerSpan$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfEventsPerSpan$tracer_opentelemetry_release();
        myc0.c("maxNumberOfEvents must be non-negative", maxNumberOfEventsPerSpan$tracer_opentelemetry_release >= 0);
        int maxNumberOfLinksPerSpan$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfLinksPerSpan$tracer_opentelemetry_release();
        myc0.c("maxNumberOfLinks must be non-negative", maxNumberOfLinksPerSpan$tracer_opentelemetry_release >= 0);
        int maxNumberOfAttributesPerSpan$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release();
        myc0.c("maxNumberOfAttributes must be non-negative", maxNumberOfAttributesPerSpan$tracer_opentelemetry_release >= 0);
        int maxNumberOfAttributesPerEvent$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release();
        myc0.c("maxNumberOfAttributesPerEvent must be non-negative", maxNumberOfAttributesPerEvent$tracer_opentelemetry_release >= 0);
        int maxNumberOfAttributesPerLink$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxNumberOfAttributesPerLink$tracer_opentelemetry_release();
        myc0.c("maxNumberOfAttributesPerLink must be non-negative", maxNumberOfAttributesPerLink$tracer_opentelemetry_release >= 0);
        int maxAttributeValueLength$tracer_opentelemetry_release = openTelemetryConfiguration.getMaxAttributeValueLength$tracer_opentelemetry_release();
        myc0.c("maxAttributeValueLength must be non-negative", maxAttributeValueLength$tracer_opentelemetry_release >= 0);
        final tn5 tn5Var2 = new tn5(maxNumberOfAttributesPerSpan$tracer_opentelemetry_release, maxNumberOfEventsPerSpan$tracer_opentelemetry_release, maxNumberOfLinksPerSpan$tracer_opentelemetry_release, maxNumberOfAttributesPerEvent$tracer_opentelemetry_release, maxNumberOfAttributesPerLink$tracer_opentelemetry_release, maxAttributeValueLength$tracer_opentelemetry_release);
        glh0 m = elh0.m();
        m.c(getClock());
        m.d(getResource());
        m.f(new Supplier() { // from class: xsna.jep0
            @Override // java.util.function.Supplier
            public final Object get() {
                zhk0 createTracerProvider$lambda$8;
                createTracerProvider$lambda$8 = TracerOpenTelemetry.createTracerProvider$lambda$8(tn5.this);
                return createTracerProvider$lambda$8;
            }
        });
        m.a(TracerOpenTelemetrySpanProcessor.Companion.create(TracerOpenTelemetrySpanExporter.Companion.create(getClock(), openTelemetryConfiguration.getMaxSpanCountToUpload$tracer_opentelemetry_release()), openTelemetryConfiguration.getCompleteTracesToUpload$tracer_opentelemetry_release()));
        m.e(new ji90(TracerOpenTelemetrySampler.Companion.create(openTelemetryConfiguration.getSampler$tracer_opentelemetry_release())));
        return m.b();
    }

    public static q94 getBuiltinAttributes$tracer_opentelemetry_release$default(TracerOpenTelemetry tracerOpenTelemetry, q94 q94Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q94Var = jk3.e;
        }
        return tracerOpenTelemetry.getBuiltinAttributes$tracer_opentelemetry_release(q94Var);
    }

    private final cvf getClock() {
        return gcd0.d;
    }

    private final gag0 getResource() {
        gag0 gag0Var;
        AtomicReference<gag0> atomicReference = atomicResource;
        do {
            gag0Var = atomicReference.get();
            if (gag0Var != null) {
                break;
            }
            try {
                gag0Var = INSTANCE.createResource();
            } catch (Exception unused) {
                gag0Var = gag0.d();
            }
        } while (!ky80.d(atomicReference, gag0Var));
        return gag0Var;
    }

    public final q94 getBuiltinAttributes$tracer_opentelemetry_release(q94 q94Var) {
        SystemState currentSystemState = Tracer.INSTANCE.getStateStorage().getCurrentSystemState();
        lk3 lk3Var = new lk3();
        lk3Var.g(q94Var);
        lk3Var.f(TracerOpenTelemetryKt.getATTR_KEY_SESSION_UUID(), currentSystemState.getSessionUuid());
        lk3Var.f(TracerOpenTelemetryKt.getATTR_KEY_SAMPLED(), Boolean.valueOf(currentSystemState.getSampled()));
        String userId = currentSystemState.getUserId();
        if (userId != null) {
            lk3Var.f(TracerOpenTelemetryKt.getATTR_KEY_USER_ID(), userId);
        }
        return lk3Var.e();
    }

    public y100 getLogsBridge() {
        y100 y100Var;
        AtomicReference<y100> atomicReference = atomicLoggerProvider;
        do {
            y100Var = atomicReference.get();
            if (y100Var != null) {
                break;
            }
            try {
                y100Var = INSTANCE.createLoggerProvider();
            } catch (Exception unused) {
                y100Var = y100.m();
            }
        } while (!ggj0.a(atomicReference, y100Var));
        return y100Var;
    }

    public yi20 getMeter(String str) {
        return getMeterProvider().get(str);
    }

    @Override // xsna.bs80
    public cj20 getMeterProvider() {
        cj20 cj20Var;
        AtomicReference<cj20> atomicReference = atomicMeterProvider;
        do {
            cj20Var = atomicReference.get();
            if (cj20Var != null) {
                break;
            }
            try {
                cj20Var = INSTANCE.createMeterProvider();
            } catch (Exception unused) {
                cj20Var = cj20.m();
            }
        } while (!ajl0.b(atomicReference, cj20Var));
        return cj20Var;
    }

    public gpj getPropagators() {
        return bdl.b;
    }

    public final OpenTelemetryRecorderProvider getRecorderProvider$tracer_opentelemetry_release() {
        OpenTelemetryRecorderProvider openTelemetryRecorderProvider;
        AtomicReference<OpenTelemetryRecorderProvider> atomicReference = atomicRecorderProvider;
        do {
            openTelemetryRecorderProvider = atomicReference.get();
            if (openTelemetryRecorderProvider != null) {
                break;
            }
            try {
                openTelemetryRecorderProvider = INSTANCE.createRecorderProvider();
            } catch (Exception unused) {
                openTelemetryRecorderProvider = OpenTelemetryRecorderProvider.Companion.noop();
            }
        } while (!bxj0.c(atomicReference, openTelemetryRecorderProvider));
        return openTelemetryRecorderProvider;
    }

    @Override // xsna.bs80
    public /* bridge */ /* synthetic */ wdp0 getTracer(String str) {
        return super.getTracer(str);
    }

    @Override // xsna.bs80
    public mep0 getTracerProvider() {
        mep0 mep0Var;
        AtomicReference<mep0> atomicReference = atomicTracerProvider;
        loop0: while (true) {
            mep0Var = atomicReference.get();
            if (mep0Var == null) {
                try {
                    mep0Var = INSTANCE.createTracerProvider();
                } catch (Exception unused) {
                    mep0Var = epl.b;
                }
                while (!atomicReference.compareAndSet(null, mep0Var)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return mep0Var;
    }

    public aj20 meterBuilder(String str) {
        return getMeterProvider().meterBuilder(str);
    }

    public ydp0 tracerBuilder(String str) {
        return getTracerProvider().b(str);
    }

    @Override // xsna.bs80
    public /* bridge */ /* synthetic */ wdp0 getTracer(String str, String str2) {
        return super.getTracer(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l000 createLoggerProvider$lambda$4(l000 l000Var) {
        return l000Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zhk0 createTracerProvider$lambda$8(zhk0 zhk0Var) {
        return zhk0Var;
    }
}

package xsna;

import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import java.util.function.Supplier;

/* compiled from: SdkTracerInstrumentation.java */
/* loaded from: classes8.dex */
public final class clh0 {
    public static final jk3 f;
    public static final jk3 g;
    public static final jk3 h;
    public static final jk3 i;
    public static final jk3 j;
    public static final jk3 k;
    public static final jk3 l;
    public static final jk3 m;
    public final Object a = new Object();
    public final Supplier<cj20> b;
    public yi20 c;
    public volatile e300 d;
    public volatile c600 e;

    /* compiled from: SdkTracerInstrumentation.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SamplingDecision.values().length];
            a = iArr;
            try {
                iArr[SamplingDecision.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SamplingDecision.RECORD_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SamplingDecision.RECORD_AND_SAMPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        xfx xfxVar = rfi0.d;
        xfx xfxVar2 = rfi0.e;
        SamplingDecision samplingDecision = SamplingDecision.DROP;
        f = q94.k(xfxVar, "none", xfxVar2, samplingDecision.name());
        SamplingDecision samplingDecision2 = SamplingDecision.RECORD_ONLY;
        g = q94.k(xfxVar, "none", xfxVar2, samplingDecision2.name());
        SamplingDecision samplingDecision3 = SamplingDecision.RECORD_AND_SAMPLE;
        h = q94.k(xfxVar, "none", xfxVar2, samplingDecision3.name());
        q94.k(xfxVar, "remote", xfxVar2, samplingDecision.name());
        q94.k(xfxVar, "remote", xfxVar2, samplingDecision2.name());
        q94.k(xfxVar, "remote", xfxVar2, samplingDecision3.name());
        i = q94.k(xfxVar, "local", xfxVar2, samplingDecision.name());
        j = q94.k(xfxVar, "local", xfxVar2, samplingDecision2.name());
        k = q94.k(xfxVar, "local", xfxVar2, samplingDecision3.name());
        l = q94.j(xfxVar2, samplingDecision2.name());
        m = q94.j(xfxVar2, samplingDecision3.name());
    }

    public clh0(Supplier<cj20> supplier) {
        this.b = supplier;
    }

    public final c600 a() {
        c600 c600Var;
        c600 c600Var2 = this.e;
        if (c600Var2 != null) {
            return c600Var2;
        }
        synchronized (this.a) {
            try {
                c600Var = this.e;
                if (c600Var == null) {
                    if (this.c == null) {
                        this.c = this.b.get().get("io.opentelemetry.sdk.trace");
                    }
                    c600Var = this.c.upDownCounterBuilder("otel.sdk.span.live").setUnit("{span}").setDescription("The number of created spans with recording=true for which the end operation has not been called yet.").build();
                    this.e = c600Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c600Var;
    }

    public final e300 b() {
        e300 e300Var;
        e300 e300Var2 = this.d;
        if (e300Var2 != null) {
            return e300Var2;
        }
        synchronized (this.a) {
            try {
                e300Var = this.d;
                if (e300Var == null) {
                    if (this.c == null) {
                        this.c = this.b.get().get("io.opentelemetry.sdk.trace");
                    }
                    e300Var = this.c.counterBuilder("otel.sdk.span.started").setUnit("{span}").setDescription("The number of created spans.").build();
                    this.d = e300Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e300Var;
    }
}

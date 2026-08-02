package xsna;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: GlobalOpenTelemetry.java */
/* loaded from: classes11.dex */
public final class m1u {
    public static final Logger a = Logger.getLogger(m1u.class.getName());
    public static final Object b = new Object();
    public static volatile bs80 c;
    public static Throwable d;

    /* compiled from: GlobalOpenTelemetry.java */
    public static class a implements bs80 {
        public final bs80 a;

        public a(bs80 bs80Var) {
            this.a = bs80Var;
        }

        @Override // xsna.bs80
        public final cj20 getMeterProvider() {
            return this.a.getMeterProvider();
        }

        @Override // xsna.bs80
        public final mep0 getTracerProvider() {
            return this.a.getTracerProvider();
        }
    }

    public static wdp0 a(String str) {
        bs80 bs80Var = c;
        if (bs80Var == null) {
            synchronized (b) {
                try {
                    bs80Var = c;
                    if (bs80Var == null) {
                        bs80Var = b();
                        if (bs80Var == null) {
                            d(ujl.a);
                            bs80Var = c;
                            Objects.requireNonNull(bs80Var);
                        }
                    }
                } finally {
                }
            }
        }
        return bs80Var.getTracer(str);
    }

    public static bs80 b() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            boolean parseBoolean = Boolean.parseBoolean(zxi.a("otel.java.global-autoconfigure.enabled"));
            Logger logger = a;
            if (!parseBoolean) {
                logger.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                return c((bs80) cls.getMethod("getOpenTelemetrySdk", null).invoke(cls.getMethod("initialize", null).invoke(null, null), null));
            } catch (IllegalAccessException | NoSuchMethodException e) {
                throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
            } catch (InvocationTargetException e2) {
                logger.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e2.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bs80 c(bs80 bs80Var) {
        bs80 bs80Var2;
        Class<?> cls;
        try {
            cls = Class.forName("io.opentelemetry.api.incubator.ExtendedOpenTelemetry");
        } catch (Exception unused) {
        }
        if (cls.isInstance(bs80Var)) {
            bs80Var2 = (bs80) Class.forName("io.opentelemetry.api.incubator.internal.ObfuscatedExtendedOpenTelemetry").getDeclaredConstructor(cls).newInstance(cls.cast(bs80Var));
            return bs80Var2 == null ? bs80Var2 : new a(bs80Var);
        }
        bs80Var2 = null;
        if (bs80Var2 == null) {
        }
    }

    public static void d(bs80 bs80Var) {
        synchronized (b) {
            try {
                if (c != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", d);
                }
                c = c(bs80Var);
                d = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

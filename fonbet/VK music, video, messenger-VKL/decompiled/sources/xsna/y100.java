package xsna;

/* compiled from: LoggerProvider.java */
/* loaded from: classes8.dex */
public interface y100 {
    static y100 m() {
        return (y100) qjg.d(yhl.b, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider");
    }

    default h100 get() {
        return n().build();
    }

    t100 n();
}

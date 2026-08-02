package xsna;

import io.opentelemetry.api.logs.Severity;

/* compiled from: LoggerConfig.java */
/* loaded from: classes8.dex */
public abstract class u100 {
    public static final jn5 a;

    static {
        Severity severity = Severity.UNDEFINED_SEVERITY_NUMBER;
        a = new jn5(true, severity);
        new jn5(false, severity);
    }

    public abstract Severity a();

    public abstract boolean b();

    public abstract boolean c();
}

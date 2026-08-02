package xsna;

/* compiled from: SdkLogger.java */
/* loaded from: classes8.dex */
public class rjh0 implements h100 {
    public static final h100 a = y100.m().get();
    public static final boolean b;

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        b = z;
    }

    public rjh0(u100 u100Var) {
        u100Var.getClass();
    }
}

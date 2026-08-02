package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: TaskExecutionMetricsLogger.kt */
/* loaded from: classes.dex */
public final class j5o0 {
    public static final long c = TimeUnit.HOURS.toMillis(4);
    public final mb3 a;
    public final ConcurrentHashMap<String, i5o0> b = new ConcurrentHashMap<>();

    public j5o0(mb3 mb3Var) {
        this.a = mb3Var;
    }
}

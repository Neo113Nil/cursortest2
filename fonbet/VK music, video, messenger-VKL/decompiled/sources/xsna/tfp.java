package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: EmptyExponentialHistogramBuckets.java */
/* loaded from: classes8.dex */
public abstract class tfp implements naq {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static naq a(int i) {
        return (naq) a.computeIfAbsent(Integer.valueOf(i), new pb9(1));
    }
}

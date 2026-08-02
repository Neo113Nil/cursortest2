package xsna;

import kotlin.Result;

/* compiled from: ArrayPools.kt */
/* loaded from: classes8.dex */
public final class dl3 {
    public static final int a;

    static {
        Object failure;
        try {
            failure = arm0.m(10, System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        a = num != null ? num.intValue() : 2097152;
    }
}

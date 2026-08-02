package defpackage;

import kotlin.Result;

/* loaded from: classes9.dex */
public abstract class h63 {
    public static final int a;

    static {
        Object failure;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            failure = property != null ? bvu0.l(10, property) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
        a = num != null ? num.intValue() : 2097152;
    }
}

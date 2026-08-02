package defpackage;

import kotlin.Result;

/* loaded from: classes2.dex */
public abstract class clc {
    public final String a;
    public final Object b;

    public clc(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final syj0 c(zcx zcxVar) {
        Object failure;
        try {
            failure = d(zcxVar);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return q5z.i0(failure);
    }

    public abstract String d(zcx zcxVar);
}

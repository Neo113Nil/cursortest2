package defpackage;

import kotlin.Result;

/* loaded from: classes12.dex */
public final class czj0 {
    public final Object a;
    public final Object b;
    public final Throwable c;
    public final boolean d;

    public czj0(Object obj) {
        this.a = obj;
        this.b = obj instanceof Result.Failure ? null : obj;
        this.c = Result.a(obj);
        this.d = obj instanceof Result.Failure;
    }

    public static final void a(Object obj, Throwable th) {
        ym11.e(1, obj);
        ((tls) obj).invoke(new Result(new Result.Failure(th)));
    }

    public static final void b(Object obj, Object obj2) {
        ym11.e(1, obj2);
        ((tls) obj2).invoke(new Result(obj));
    }
}

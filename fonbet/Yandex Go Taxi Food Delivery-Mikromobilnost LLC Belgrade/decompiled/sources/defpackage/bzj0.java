package defpackage;

import kotlin.Result;

/* loaded from: classes4.dex */
public final class bzj0 {
    public final Object a;
    public final Object b;
    public final Throwable c;
    public final boolean d;

    public bzj0(Object obj) {
        this.a = obj;
        this.b = obj instanceof Result.Failure ? null : obj;
        this.c = Result.a(obj);
        this.d = obj instanceof Result.Failure;
    }
}

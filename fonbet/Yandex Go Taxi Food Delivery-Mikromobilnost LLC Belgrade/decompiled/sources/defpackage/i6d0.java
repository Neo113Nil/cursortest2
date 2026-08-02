package defpackage;

import defpackage.e6d0;
import java.io.IOException;
import kotlin.Result;

/* loaded from: classes8.dex */
public abstract class i6d0 {
    public static final Object a(e6d0 e6d0Var) {
        if (e6d0Var instanceof e6d0.b) {
            return ((e6d0.b) e6d0Var).a;
        }
        if (e6d0Var instanceof e6d0.a) {
            return new Result.Failure(new IOException(String.valueOf((e6d0.a) e6d0Var)));
        }
        w511.b();
        return null;
    }
}

package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class fro {
    public final Object a(q1d0 q1d0Var) {
        try {
            String str = q1d0Var.a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str2 = q1d0Var.b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list = q1d0Var.c;
            if (list == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Set set = q1d0Var.d;
            if (set != null) {
                return new k2d0(str, str2, list, set);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }
}

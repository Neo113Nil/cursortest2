package defpackage;

import defpackage.e6d0;
import java.io.IOException;
import kotlin.collections.b;
import kotlinx.serialization.SerializationException;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class j6d0 {
    public static e6d0 a(Response response) {
        kvj0 kvj0Var = response.a;
        Object obj = response.b;
        d5j0 d5j0Var = kvj0Var.a;
        f6d0 f6d0Var = new f6d0(d5j0Var.b, d5j0Var.a.i, b.s(d5j0Var.c));
        if (kvj0Var.J) {
            return obj != null ? new e6d0.b(obj, f6d0Var) : new e6d0.a.d(f6d0Var, new IllegalArgumentException("deserializedBody is null, but expected non-null value"));
        }
        int i = kvj0Var.w;
        String str = kvj0Var.c;
        rvj0 rvj0Var = response.c;
        String a0 = rvj0Var != null ? vez0.a0(rvj0Var) : null;
        return (500 > i || i >= 600) ? new e6d0.a.AbstractC0093a.b(f6d0Var, i, str, a0) : new e6d0.a.AbstractC0093a.C0094a(f6d0Var, i, str, a0);
    }

    public static e6d0.a b(d5j0 d5j0Var, Throwable th) {
        f6d0 f6d0Var = new f6d0(d5j0Var.b, d5j0Var.a.i, b.s(d5j0Var.c));
        return th instanceof SerializationException ? new e6d0.a.d(f6d0Var, (IllegalArgumentException) th) : th instanceof IOException ? new e6d0.a.b(f6d0Var, (IOException) th) : new e6d0.a.c(f6d0Var, th);
    }
}

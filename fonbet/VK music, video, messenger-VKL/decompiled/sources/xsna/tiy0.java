package xsna;

import kotlin.Pair;
import xsna.d5o0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class tiy0 {
    public static final d5o0 a(gwj0 gwj0Var) {
        d5o0 d5o0Var = new d5o0();
        Pair pair = new Pair(d5o0Var, new d5o0.a());
        d5o0 d5o0Var2 = (d5o0) pair.d();
        final d5o0.a aVar = (d5o0.a) pair.g();
        fwj0 fwj0Var = new fwj0(new izs<Throwable, s3q0>() { // from class: ru.rustore.sdk.review.c$a
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                aVar.a(th);
                return s3q0.a;
            }
        }, new izs<Object, s3q0>() { // from class: ru.rustore.sdk.review.c$b
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final s3q0 invoke(Object obj) {
                aVar.b(obj);
                return s3q0.a;
            }
        });
        gwj0Var.a(fwj0Var);
        d5o0Var2.a(new mvc0(fwj0Var, 16), null);
        return d5o0Var2;
    }
}

package defpackage;

import com.yandex.messaging.domain.actions.a;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.net.NoInternetException;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class c0j0 extends k {
    public final a b;
    public final k020 c;
    public final mxb0 d;
    public final el21 e;
    public final xw50 f;

    public c0j0(a aVar, k020 k020Var, mxb0 mxb0Var, el21 el21Var, xw50 xw50Var, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = k020Var;
        this.d = mxb0Var;
        this.e = el21Var;
        this.f = xw50Var;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        List list = (List) obj;
        if (!this.f.a()) {
            return new Result(new Result.Failure(new NoInternetException()));
        }
        return this.b.a(new bf9(list, this.c, this.d, this.e), continuation);
    }
}

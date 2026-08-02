package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import com.yandex.div.evaluable.function.k;
import java.util.List;
import kotlin.Result;

/* loaded from: classes11.dex */
public abstract class hfc extends c {
    public final List b = scc.g(new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
    public final EvaluableType c = EvaluableType.COLOR;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object failure;
        Object a = k.a(c(), list, j());
        if (!(a instanceof String)) {
            k.d(c(), list, this.c, a, j());
            throw null;
        }
        try {
            failure = new jdc(wwg.B((String) a));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        b.i(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}

package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public final class ldt extends get {
    public static final ldt d = new ldt();
    public static final List e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        e = scc.g(new kms(evaluableType, false), new kms(evaluableType, false), new kms(evaluableType, false));
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return e;
    }

    @Override // com.yandex.div.evaluable.function.n
    public final Object k(List list) {
        String e2 = b.e((String) list.get(2));
        if (e2 != null) {
            return new rg21(e2);
        }
        com.yandex.div.evaluable.b.e(this.b, list, "Unable to convert value to Url.", null);
        throw null;
    }

    @Override // com.yandex.div.evaluable.function.n
    public final boolean l() {
        return f;
    }
}

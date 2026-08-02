package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class e63 extends c53 {
    public final List e;

    public e63() {
        super(EvaluableType.URL, 1);
        this.e = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false), new kms(EvaluableType.STRING, false));
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        String e = b.e(c instanceof String ? (String) c : null);
        if (e != null) {
            return new rg21(e);
        }
        String e2 = b.e((String) list.get(2));
        if (e2 != null) {
            return new rg21(e2);
        }
        b.f(c(), "Unable to convert value to Url.", list);
        throw null;
    }

    @Override // defpackage.c53, com.yandex.div.evaluable.c
    public final List b() {
        return this.e;
    }
}

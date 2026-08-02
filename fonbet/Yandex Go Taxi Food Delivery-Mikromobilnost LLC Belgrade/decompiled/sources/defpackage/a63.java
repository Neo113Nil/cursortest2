package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class a63 extends c53 {
    public final List e;

    public a63() {
        super(EvaluableType.COLOR, 1);
        this.e = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false), new kms(EvaluableType.STRING, false));
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        jdc d = b.d(c instanceof String ? (String) c : null);
        if (d != null) {
            return d;
        }
        jdc d2 = b.d((String) list.get(2));
        if (d2 != null) {
            return d2;
        }
        b.f(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }

    @Override // defpackage.c53, com.yandex.div.evaluable.c
    public final List b() {
        return this.e;
    }
}

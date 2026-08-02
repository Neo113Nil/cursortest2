package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class k63 extends c53 {
    public k63() {
        super(EvaluableType.STRING, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        String str = b instanceof String ? (String) b : null;
        if (str != null) {
            return str;
        }
        b.g(c(), list, this.c, b, j());
        throw null;
    }
}

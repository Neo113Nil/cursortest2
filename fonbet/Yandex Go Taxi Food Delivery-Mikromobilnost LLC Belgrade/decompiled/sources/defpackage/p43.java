package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class p43 extends c53 {
    public p43() {
        super(EvaluableType.BOOLEAN, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        Boolean bool = b instanceof Boolean ? (Boolean) b : null;
        if (bool != null) {
            return bool;
        }
        b.g(c(), list, this.c, b, j());
        throw null;
    }
}

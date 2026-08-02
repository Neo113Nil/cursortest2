package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class c63 extends c53 {
    public c63() {
        super(EvaluableType.NUMBER, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        Number number = c instanceof Number ? (Number) c : null;
        return number != null ? Double.valueOf(number.doubleValue()) : list.get(2);
    }
}

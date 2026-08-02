package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class b63 extends c53 {
    public b63() {
        super(EvaluableType.INTEGER, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        return c instanceof Integer ? Long.valueOf(((Number) c).intValue()) : c instanceof Long ? c : list.get(2);
    }
}

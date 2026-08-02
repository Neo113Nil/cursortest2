package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class f63 extends c53 {
    public f63() {
        super(EvaluableType.URL, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        String e = b.e(c instanceof String ? (String) c : null);
        return e != null ? new rg21(e) : list.get(2);
    }
}

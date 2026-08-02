package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class d63 extends c53 {
    public d63() {
        super(EvaluableType.STRING, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        String str = c instanceof String ? (String) c : null;
        return str == null ? list.get(2) : str;
    }
}

package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public abstract class a53 extends c53 {
    public a53() {
        super(EvaluableType.ARRAY, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        JSONArray jSONArray = b instanceof JSONArray ? (JSONArray) b : null;
        if (jSONArray != null) {
            return jSONArray;
        }
        b.g(c(), list, this.c, b, j());
        throw null;
    }
}

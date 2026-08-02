package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class lgj extends c {
    public final List b;
    public final EvaluableType c;

    public lgj() {
        EvaluableType evaluableType = EvaluableType.DICT;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.STRING, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object a = k.a(c(), list, j());
        JSONObject jSONObject = a instanceof JSONObject ? (JSONObject) a : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        k.d(c(), list, this.c, a, j());
        throw null;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}

package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l8k implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public l8k(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        q8k q8kVar = (q8k) ft6.b.J0.getValue();
        lb7 lb7Var = ft6.a;
        q8kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "end", this.a);
        a.g(lb7Var, jSONObject, "start", this.b);
        wwg.Z(lb7Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}

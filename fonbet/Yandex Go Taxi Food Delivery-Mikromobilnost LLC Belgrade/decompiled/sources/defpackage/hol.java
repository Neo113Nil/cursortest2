package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hol implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public hol(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        mol molVar = (mol) ft6.b.L9.getValue();
        lb7 lb7Var = ft6.a;
        molVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "height", this.a);
        wwg.Z(lb7Var, jSONObject, "type", "resolution");
        a.g(lb7Var, jSONObject, "width", this.b);
        return jSONObject;
    }
}

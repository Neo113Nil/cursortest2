package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hqk implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public Integer d;

    static {
        new lvo(eg90.a, "_");
    }

    public hqk(Expression expression, Expression expression2, Expression expression3) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        nqk nqkVar = (nqk) ft6.b.B3.getValue();
        lb7 lb7Var = ft6.a;
        nqkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "key", this.a);
        a.g(lb7Var, jSONObject, "placeholder", this.b);
        a.g(lb7Var, jSONObject, "regex", this.c);
        return jSONObject;
    }
}

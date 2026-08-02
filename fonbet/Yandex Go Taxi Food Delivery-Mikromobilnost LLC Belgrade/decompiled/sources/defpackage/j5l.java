package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j5l implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public j5l(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        u5l u5lVar = (u5l) ft6.b.E6.getValue();
        lb7 lb7Var = ft6.a;
        u5lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.h(lb7Var, jSONObject, "color", this.a, b.a);
        a.g(lb7Var, jSONObject, "position", this.b);
        return jSONObject;
    }
}

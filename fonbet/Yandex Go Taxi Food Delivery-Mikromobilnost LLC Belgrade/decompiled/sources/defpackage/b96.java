package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b96 implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public b96(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        c96 c96Var = (c96) ft6.b.j.getValue();
        lb7 lb7Var = ft6.a;
        c96Var.getClass();
        return c96.d(lb7Var, this);
    }
}

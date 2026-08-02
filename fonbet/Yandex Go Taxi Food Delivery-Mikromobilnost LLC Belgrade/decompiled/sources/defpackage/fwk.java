package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fwk implements c4x {
    public static final kvo d = new kvo(Boolean.FALSE);
    public final Expression a;
    public final Expression b;
    public final String c;

    public fwk(Expression expression, Expression expression2, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = str;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        gwk gwkVar = (gwk) ft6.b.G4.getValue();
        lb7 lb7Var = ft6.a;
        gwkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "allow_empty", this.a);
        a.g(lb7Var, jSONObject, "label_id", this.b);
        wwg.Z(lb7Var, jSONObject, "variable", this.c);
        return jSONObject;
    }

    public fwk() {
        this(d, null, null);
    }
}

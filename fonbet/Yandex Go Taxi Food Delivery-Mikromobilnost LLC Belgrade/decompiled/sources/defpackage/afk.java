package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class afk implements c4x {
    public final Expression a;
    public Integer b;

    public afk(Expression expression) {
        this.a = expression;
    }

    public final boolean a(afk afkVar, rvo rvoVar, rvo rvoVar2) {
        return afkVar != null && ((Number) this.a.a(rvoVar)).doubleValue() == ((Number) afkVar.a.a(rvoVar2)).doubleValue();
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(afk.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        bfk bfkVar = (bfk) ft6.b.L1.getValue();
        lb7 lb7Var = ft6.a;
        bfkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.g(lb7Var, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}

package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jnk implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public jnk(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(jnk jnkVar, rvo rvoVar, rvo rvoVar2) {
        return jnkVar != null && this.a.a(rvoVar) == jnkVar.a.a(rvoVar2) && ((Number) this.b.a(rvoVar)).doubleValue() == ((Number) jnkVar.b.a(rvoVar2)).doubleValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(jnk.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        knk knkVar = (knk) ft6.b.U2.getValue();
        lb7 lb7Var = ft6.a;
        knkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        a.h(lb7Var, jSONObject, "unit", this.a, DivSizeUnit.TO_STRING);
        a.g(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}

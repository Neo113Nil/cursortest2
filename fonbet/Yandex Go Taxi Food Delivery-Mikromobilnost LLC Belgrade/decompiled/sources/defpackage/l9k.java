package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l9k implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public l9k(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(l9k l9kVar, rvo rvoVar, rvo rvoVar2) {
        if (l9kVar != null && jl40.l(this.a.a(rvoVar), l9kVar.a.a(rvoVar2))) {
            Expression expression = this.b;
            Boolean bool = expression != null ? (Boolean) expression.a(rvoVar) : null;
            Expression expression2 = l9kVar.b;
            if (jl40.l(bool, expression2 != null ? (Boolean) expression2.a(rvoVar2) : null)) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(l9k.class).hashCode();
        Expression expression = this.b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        m9k m9kVar = (m9k) ft6.b.V0.getValue();
        lb7 lb7Var = ft6.a;
        m9kVar.getClass();
        return m9k.d(lb7Var, this);
    }
}

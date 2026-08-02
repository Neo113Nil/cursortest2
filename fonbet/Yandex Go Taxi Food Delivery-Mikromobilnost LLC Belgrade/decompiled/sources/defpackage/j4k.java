package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class j4k implements c4x {
    public final Expression a;
    public final xll b;
    public final Expression c;
    public Integer d;

    public j4k(Expression expression, xll xllVar, Expression expression2) {
        this.a = expression;
        this.b = xllVar;
        this.c = expression2;
    }

    public final boolean a(j4k j4kVar, rvo rvoVar, rvo rvoVar2) {
        if (j4kVar == null) {
            return false;
        }
        Expression expression = this.a;
        Long l = expression != null ? (Long) expression.a(rvoVar) : null;
        Expression expression2 = j4kVar.a;
        return jl40.l(l, expression2 != null ? (Long) expression2.a(rvoVar2) : null) && this.b.a(j4kVar.b, rvoVar, rvoVar2) && jl40.l(this.c.a(rvoVar), j4kVar.c.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(j4k.class).hashCode();
        Expression expression = this.a;
        int hashCode2 = this.c.hashCode() + this.b.b() + hashCode + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((k4k) ft6.b.Q.getValue()).b(ft6.a, this);
    }
}

package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class b9k implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final xll d;
    public Integer e;

    public b9k(Expression expression, Expression expression2, Expression expression3, xll xllVar) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = xllVar;
    }

    public final boolean a(b9k b9kVar, rvo rvoVar, rvo rvoVar2) {
        if (b9kVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) b9kVar.a.a(rvoVar2)).longValue() && jl40.l(this.b.a(rvoVar), b9kVar.b.a(rvoVar2))) {
            Expression expression = this.c;
            DivActionSetStoredValue$Scope divActionSetStoredValue$Scope = expression != null ? (DivActionSetStoredValue$Scope) expression.a(rvoVar) : null;
            Expression expression2 = b9kVar.c;
            if (divActionSetStoredValue$Scope == (expression2 != null ? (DivActionSetStoredValue$Scope) expression2.a(rvoVar2) : null) && this.d.a(b9kVar.d, rvoVar, rvoVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(b9k.class).hashCode();
        Expression expression = this.c;
        int b = this.d.b() + hashCode + (expression != null ? expression.hashCode() : 0);
        this.e = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((c9k) ft6.b.P0.getValue()).b(ft6.a, this);
    }
}

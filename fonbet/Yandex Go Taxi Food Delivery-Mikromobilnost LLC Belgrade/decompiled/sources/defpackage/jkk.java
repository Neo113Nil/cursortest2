package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jkk implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public Integer e;

    public jkk(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
    }

    public final boolean a(jkk jkkVar, rvo rvoVar, rvo rvoVar2) {
        if (jkkVar == null) {
            return false;
        }
        Expression expression = this.a;
        Long l = expression != null ? (Long) expression.a(rvoVar) : null;
        Expression expression2 = jkkVar.a;
        if (jl40.l(l, expression2 != null ? (Long) expression2.a(rvoVar2) : null)) {
            Expression expression3 = this.b;
            Long l2 = expression3 != null ? (Long) expression3.a(rvoVar) : null;
            Expression expression4 = jkkVar.b;
            if (jl40.l(l2, expression4 != null ? (Long) expression4.a(rvoVar2) : null)) {
                Expression expression5 = this.c;
                Long l3 = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                Expression expression6 = jkkVar.c;
                if (jl40.l(l3, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                    Expression expression7 = this.d;
                    Long l4 = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                    Expression expression8 = jkkVar.d;
                    if (jl40.l(l4, expression8 != null ? (Long) expression8.a(rvoVar2) : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(jkk.class).hashCode();
        Expression expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.c;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.d;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.e = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        kkk kkkVar = (kkk) ft6.b.B2.getValue();
        lb7 lb7Var = ft6.a;
        kkkVar.getClass();
        return kkk.d(lb7Var, this);
    }

    public jkk() {
        this(null, null, null, null);
    }
}

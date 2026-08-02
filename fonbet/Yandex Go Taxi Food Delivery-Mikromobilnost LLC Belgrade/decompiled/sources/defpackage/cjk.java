package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class cjk implements c4x {
    public final m3k a;
    public final Expression b;
    public final Expression c;
    public Integer d;

    static {
        new kvo(Boolean.TRUE);
    }

    public cjk(m3k m3kVar, Expression expression, Expression expression2) {
        this.a = m3kVar;
        this.b = expression;
        this.c = expression2;
    }

    public final boolean a(cjk cjkVar, rvo rvoVar, rvo rvoVar2) {
        if (cjkVar != null && this.a.a(cjkVar.a, rvoVar, rvoVar2)) {
            Expression expression = this.b;
            String str = expression != null ? (String) expression.a(rvoVar) : null;
            Expression expression2 = cjkVar.b;
            if (jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null) && ((Boolean) this.c.a(rvoVar)).booleanValue() == ((Boolean) cjkVar.c.a(rvoVar2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int b = this.a.b() + qoi0.a(cjk.class).hashCode();
        Expression expression = this.b;
        int hashCode = this.c.hashCode() + b + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((fjk) ft6.b.p2.getValue()).b(ft6.a, this);
    }
}

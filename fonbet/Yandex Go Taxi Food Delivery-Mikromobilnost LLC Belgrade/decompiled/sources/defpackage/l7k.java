package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionScrollBy$Overflow;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class l7k implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public Integer f;

    static {
        ngd0.m(Boolean.TRUE);
        ngd0.m(0L);
        ngd0.m(0L);
        ngd0.m(DivActionScrollBy$Overflow.CLAMP);
    }

    public l7k(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
    }

    public final boolean a(l7k l7kVar, rvo rvoVar, rvo rvoVar2) {
        return l7kVar != null && ((Boolean) this.a.a(rvoVar)).booleanValue() == ((Boolean) l7kVar.a.a(rvoVar2)).booleanValue() && jl40.l(this.b.a(rvoVar), l7kVar.b.a(rvoVar2)) && ((Number) this.c.a(rvoVar)).longValue() == ((Number) l7kVar.c.a(rvoVar2)).longValue() && ((Number) this.d.a(rvoVar)).longValue() == ((Number) l7kVar.d.a(rvoVar2)).longValue() && this.e.a(rvoVar) == l7kVar.e.a(rvoVar2);
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(l7k.class).hashCode();
        this.f = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        m7k m7kVar = (m7k) ft6.b.x0.getValue();
        lb7 lb7Var = ft6.a;
        m7kVar.getClass();
        return m7k.d(lb7Var, this);
    }
}

package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o4k implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public o4k(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(o4k o4kVar, rvo rvoVar, rvo rvoVar2) {
        return o4kVar != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) o4kVar.a.a(rvoVar2)).longValue() && jl40.l(this.b.a(rvoVar), o4kVar.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(o4k.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        p4k p4kVar = (p4k) ft6.b.T.getValue();
        lb7 lb7Var = ft6.a;
        p4kVar.getClass();
        return p4k.d(lb7Var, this);
    }
}

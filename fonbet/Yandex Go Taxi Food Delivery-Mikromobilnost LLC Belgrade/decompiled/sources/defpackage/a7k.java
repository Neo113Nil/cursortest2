package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a7k implements c4x {
    public final Expression a;
    public Integer b;

    public a7k(Expression expression) {
        this.a = expression;
    }

    public final boolean a(a7k a7kVar, rvo rvoVar, rvo rvoVar2) {
        if (a7kVar == null) {
            return false;
        }
        return jl40.l(this.a.a(rvoVar), a7kVar.a.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(a7k.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        b7k b7kVar = (b7k) ft6.b.u0.getValue();
        lb7 lb7Var = ft6.a;
        b7kVar.getClass();
        return b7k.d(lb7Var, this);
    }
}

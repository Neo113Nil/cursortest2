package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f6k implements c4x {
    public final Expression a;
    public final xll b;
    public final Expression c;
    public Integer d;

    public f6k(Expression expression, xll xllVar, Expression expression2) {
        this.a = expression;
        this.b = xllVar;
        this.c = expression2;
    }

    public final boolean a(f6k f6kVar, rvo rvoVar, rvo rvoVar2) {
        if (f6kVar != null && jl40.l(this.a.a(rvoVar), f6kVar.a.a(rvoVar2))) {
            xll xllVar = f6kVar.b;
            xll xllVar2 = this.b;
            if ((xllVar2 != null ? xllVar2.a(xllVar, rvoVar, rvoVar2) : xllVar == null) && jl40.l(this.c.a(rvoVar), f6kVar.c.a(rvoVar2))) {
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
        int hashCode = this.a.hashCode() + qoi0.a(f6k.class).hashCode();
        xll xllVar = this.b;
        int hashCode2 = this.c.hashCode() + hashCode + (xllVar != null ? xllVar.b() : 0);
        this.d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((g6k) ft6.b.l0.getValue()).b(ft6.a, this);
    }
}

package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class g9k implements c4x {
    public final xll a;
    public final Expression b;
    public Integer c;

    public g9k(xll xllVar, Expression expression) {
        this.a = xllVar;
        this.b = expression;
    }

    public final boolean a(g9k g9kVar, rvo rvoVar, rvo rvoVar2) {
        return g9kVar != null && this.a.a(g9kVar.a, rvoVar, rvoVar2) && jl40.l(this.b.a(rvoVar), g9kVar.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.b() + qoi0.a(g9k.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((h9k) ft6.b.S0.getValue()).b(ft6.a, this);
    }
}

package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hi21 implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public hi21(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    public final boolean a(hi21 hi21Var, rvo rvoVar, rvo rvoVar2) {
        return hi21Var != null && jl40.l(this.a, hi21Var.a) && jl40.l(this.b.a(rvoVar), hi21Var.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(hi21.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        ii21 ii21Var = (ii21) ft6.b.Na.getValue();
        lb7 lb7Var = ft6.a;
        ii21Var.getClass();
        return ii21.d(lb7Var, this);
    }
}

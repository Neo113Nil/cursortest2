package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hak implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public hak(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(hak hakVar, rvo rvoVar, rvo rvoVar2) {
        return hakVar != null && this.a.a(rvoVar) == hakVar.a.a(rvoVar2) && jl40.l(this.b.a(rvoVar), hakVar.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(hak.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        iak iakVar = (iak) ft6.b.h1.getValue();
        lb7 lb7Var = ft6.a;
        iakVar.getClass();
        return iak.d(lb7Var, this);
    }
}

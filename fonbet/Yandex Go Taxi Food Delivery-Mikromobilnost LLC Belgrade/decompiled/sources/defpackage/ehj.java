package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ehj implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public ehj(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    public final boolean a(ehj ehjVar, rvo rvoVar, rvo rvoVar2) {
        return ehjVar != null && jl40.l(this.a, ehjVar.a) && jl40.l(this.b.a(rvoVar), ehjVar.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(ehj.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        fhj fhjVar = (fhj) ft6.b.B.getValue();
        lb7 lb7Var = ft6.a;
        fhjVar.getClass();
        return fhj.d(lb7Var, this);
    }
}

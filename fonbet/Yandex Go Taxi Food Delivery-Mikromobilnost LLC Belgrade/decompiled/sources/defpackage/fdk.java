package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fdk implements c4x {
    public final Expression a;
    public final Expression b;
    public Integer c;

    public fdk(Expression expression, Expression expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(fdk fdkVar, rvo rvoVar, rvo rvoVar2) {
        return fdkVar != null && this.a.a(rvoVar) == fdkVar.a.a(rvoVar2) && jl40.l(this.b.a(rvoVar), fdkVar.b.a(rvoVar2));
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + qoi0.a(fdk.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        gdk gdkVar = (gdk) ft6.b.q1.getValue();
        lb7 lb7Var = ft6.a;
        gdkVar.getClass();
        return gdk.d(lb7Var, this);
    }
}

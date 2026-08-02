package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class oik implements c4x {
    public static final sqk e = new sqk(new kvo(10L));
    public final Expression a;
    public final sqk b;
    public final bcl c;
    public Integer d;

    public oik(Expression expression, sqk sqkVar, bcl bclVar) {
        this.a = expression;
        this.b = sqkVar;
        this.c = bclVar;
    }

    public final boolean a(oik oikVar, rvo rvoVar, rvo rvoVar2) {
        if (oikVar == null) {
            return false;
        }
        Expression expression = this.a;
        Integer num = expression != null ? (Integer) expression.a(rvoVar) : null;
        Expression expression2 = oikVar.a;
        if (jl40.l(num, expression2 != null ? (Integer) expression2.a(rvoVar2) : null) && this.b.a(oikVar.b, rvoVar, rvoVar2)) {
            bcl bclVar = oikVar.c;
            bcl bclVar2 = this.c;
            if (bclVar2 != null ? bclVar2.a(bclVar, rvoVar, rvoVar2) : bclVar == null) {
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
        int hashCode = qoi0.a(oik.class).hashCode();
        Expression expression = this.a;
        int b = this.b.b() + hashCode + (expression != null ? expression.hashCode() : 0);
        bcl bclVar = this.c;
        int b2 = b + (bclVar != null ? bclVar.b() : 0);
        this.d = Integer.valueOf(b2);
        return b2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((pik) ft6.b.g2.getValue()).b(ft6.a, this);
    }

    public oik() {
        this(null, e, null);
    }
}

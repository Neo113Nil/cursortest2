package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hpk implements c4x {
    public static final kvo f = ngd0.m(Double.valueOf(0.0d));
    public static final kvo g = ngd0.m(200L);
    public static final kvo h = ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
    public static final kvo i = ngd0.m(0L);
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public Integer e;

    public hpk(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
    }

    public final boolean a(hpk hpkVar, rvo rvoVar, rvo rvoVar2) {
        return hpkVar != null && ((Number) this.a.a(rvoVar)).doubleValue() == ((Number) hpkVar.a.a(rvoVar2)).doubleValue() && ((Number) this.b.a(rvoVar)).longValue() == ((Number) hpkVar.b.a(rvoVar2)).longValue() && this.c.a(rvoVar) == hpkVar.c.a(rvoVar2) && ((Number) this.d.a(rvoVar)).longValue() == ((Number) hpkVar.d.a(rvoVar2)).longValue();
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(hpk.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        ipk ipkVar = (ipk) ft6.b.m3.getValue();
        lb7 lb7Var = ft6.a;
        ipkVar.getClass();
        return ipk.d(lb7Var, this);
    }

    public hpk() {
        this(f, g, h, i);
    }
}

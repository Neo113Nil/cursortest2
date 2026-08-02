package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m8l implements c4x {
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final x4l d;
    public Integer e;

    static {
        ngd0.m(Double.valueOf(0.19d));
        ngd0.m(2L);
        ngd0.m(0);
    }

    public m8l(Expression expression, Expression expression2, Expression expression3, x4l x4lVar) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = x4lVar;
    }

    public final boolean a(m8l m8lVar, rvo rvoVar, rvo rvoVar2) {
        return m8lVar != null && ((Number) this.a.a(rvoVar)).doubleValue() == ((Number) m8lVar.a.a(rvoVar2)).doubleValue() && ((Number) this.b.a(rvoVar)).longValue() == ((Number) m8lVar.b.a(rvoVar2)).longValue() && ((Number) this.c.a(rvoVar)).intValue() == ((Number) m8lVar.c.a(rvoVar2)).intValue() && this.d.a(m8lVar.d, rvoVar, rvoVar2);
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int b = this.d.b() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + qoi0.a(m8l.class).hashCode();
        this.e = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((n8l) ft6.b.c7.getValue()).b(ft6.a, this);
    }
}

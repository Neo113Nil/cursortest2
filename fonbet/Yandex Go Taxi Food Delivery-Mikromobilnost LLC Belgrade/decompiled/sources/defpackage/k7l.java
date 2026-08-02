package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k7l implements c4x {
    public static final sqk g = new sqk(ngd0.m(5L));
    public static final sqk h = new sqk(ngd0.m(10L));
    public static final sqk i = new sqk(ngd0.m(10L));
    public final Expression a;
    public final sqk b;
    public final sqk c;
    public final sqk d;
    public final bcl e;
    public Integer f;

    public k7l(Expression expression, sqk sqkVar, sqk sqkVar2, sqk sqkVar3, bcl bclVar) {
        this.a = expression;
        this.b = sqkVar;
        this.c = sqkVar2;
        this.d = sqkVar3;
        this.e = bclVar;
    }

    public final boolean a(k7l k7lVar, rvo rvoVar, rvo rvoVar2) {
        if (k7lVar == null) {
            return false;
        }
        Expression expression = this.a;
        Integer num = expression != null ? (Integer) expression.a(rvoVar) : null;
        Expression expression2 = k7lVar.a;
        if (jl40.l(num, expression2 != null ? (Integer) expression2.a(rvoVar2) : null) && this.b.a(k7lVar.b, rvoVar, rvoVar2) && this.c.a(k7lVar.c, rvoVar, rvoVar2) && this.d.a(k7lVar.d, rvoVar, rvoVar2)) {
            bcl bclVar = k7lVar.e;
            bcl bclVar2 = this.e;
            if (bclVar2 != null ? bclVar2.a(bclVar, rvoVar, rvoVar2) : bclVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(k7l.class).hashCode();
        Expression expression = this.a;
        int b = this.d.b() + this.c.b() + this.b.b() + hashCode + (expression != null ? expression.hashCode() : 0);
        bcl bclVar = this.e;
        int b2 = b + (bclVar != null ? bclVar.b() : 0);
        this.f = Integer.valueOf(b2);
        return b2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((l7l) ft6.b.K6.getValue()).b(ft6.a, this);
    }

    public k7l() {
        this(0);
    }

    public /* synthetic */ k7l(int i2) {
        this(null, g, h, i, null);
    }
}

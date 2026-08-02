package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class gal implements c4x {
    public static final kvo k = ngd0.m(12L);
    public static final kvo l = ngd0.m(DivSizeUnit.SP);
    public static final kvo m = ngd0.m(Double.valueOf(0.0d));
    public static final kvo n = ngd0.m(Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR));
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final x4l h;
    public final Expression i;
    public Integer j;

    public gal(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, x4l x4lVar, Expression expression8) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = expression7;
        this.h = x4lVar;
        this.i = expression8;
    }

    public final boolean a(gal galVar, rvo rvoVar, rvo rvoVar2) {
        if (galVar == null) {
            return false;
        }
        Expression expression = this.a;
        String str = expression != null ? (String) expression.a(rvoVar) : null;
        Expression expression2 = galVar.a;
        if (jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null) && ((Number) this.b.a(rvoVar)).longValue() == ((Number) galVar.b.a(rvoVar2)).longValue() && this.c.a(rvoVar) == galVar.c.a(rvoVar2)) {
            Expression expression3 = this.d;
            JSONObject jSONObject = expression3 != null ? (JSONObject) expression3.a(rvoVar) : null;
            Expression expression4 = galVar.d;
            if (jl40.l(jSONObject, expression4 != null ? (JSONObject) expression4.a(rvoVar2) : null)) {
                Expression expression5 = this.e;
                DivFontWeight divFontWeight = expression5 != null ? (DivFontWeight) expression5.a(rvoVar) : null;
                Expression expression6 = galVar.e;
                if (divFontWeight == (expression6 != null ? (DivFontWeight) expression6.a(rvoVar2) : null)) {
                    Expression expression7 = this.f;
                    Long l2 = expression7 != null ? (Long) expression7.a(rvoVar) : null;
                    Expression expression8 = galVar.f;
                    if (jl40.l(l2, expression8 != null ? (Long) expression8.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) galVar.g.a(rvoVar2)).doubleValue()) {
                        x4l x4lVar = galVar.h;
                        x4l x4lVar2 = this.h;
                        if ((x4lVar2 != null ? x4lVar2.a(x4lVar, rvoVar, rvoVar2) : x4lVar == null) && ((Number) this.i.a(rvoVar)).intValue() == ((Number) galVar.i.a(rvoVar2)).intValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.j;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(gal.class).hashCode();
        Expression expression = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.d;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.e;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f;
        int hashCode5 = this.g.hashCode() + hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        x4l x4lVar = this.h;
        int hashCode6 = this.i.hashCode() + hashCode5 + (x4lVar != null ? x4lVar.b() : 0);
        this.j = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ual) ft6.b.x7.getValue()).b(ft6.a, this);
    }

    public gal() {
        this(null, k, l, null, null, null, m, null, n);
    }
}

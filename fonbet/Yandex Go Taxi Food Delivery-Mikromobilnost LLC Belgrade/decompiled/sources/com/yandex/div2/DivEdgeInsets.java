package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.fok;
import defpackage.ft6;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.lb7;
import defpackage.ngd0;
import defpackage.qoi0;
import defpackage.rvo;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class DivEdgeInsets implements c4x {
    public static final kvo i = ngd0.m(0L);
    public static final kvo j = ngd0.m(0L);
    public static final kvo k = ngd0.m(0L);
    public static final kvo l = ngd0.m(0L);
    public static final kvo m = ngd0.m(DivSizeUnit.DP);
    public final Expression a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public Integer h;

    public /* synthetic */ DivEdgeInsets(kvo kvoVar, kvo kvoVar2, kvo kvoVar3, kvo kvoVar4, int i2) {
        this((i2 & 1) != 0 ? i : kvoVar, null, (i2 & 4) != 0 ? j : kvoVar2, (i2 & 8) != 0 ? k : kvoVar3, null, (i2 & 32) != 0 ? l : kvoVar4, m);
    }

    public final boolean a(DivEdgeInsets divEdgeInsets, rvo rvoVar, rvo rvoVar2) {
        if (divEdgeInsets != null && ((Number) this.a.a(rvoVar)).longValue() == ((Number) divEdgeInsets.a.a(rvoVar2)).longValue()) {
            Expression expression = this.b;
            Long l2 = expression != null ? (Long) expression.a(rvoVar) : null;
            Expression expression2 = divEdgeInsets.b;
            if (jl40.l(l2, expression2 != null ? (Long) expression2.a(rvoVar2) : null) && ((Number) this.c.a(rvoVar)).longValue() == ((Number) divEdgeInsets.c.a(rvoVar2)).longValue() && ((Number) this.d.a(rvoVar)).longValue() == ((Number) divEdgeInsets.d.a(rvoVar2)).longValue()) {
                Expression expression3 = this.e;
                Long l3 = expression3 != null ? (Long) expression3.a(rvoVar) : null;
                Expression expression4 = divEdgeInsets.e;
                if (jl40.l(l3, expression4 != null ? (Long) expression4.a(rvoVar2) : null) && ((Number) this.f.a(rvoVar)).longValue() == ((Number) divEdgeInsets.f.a(rvoVar2)).longValue() && this.g.a(rvoVar) == divEdgeInsets.g.a(rvoVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(DivEdgeInsets.class).hashCode();
        Expression expression = this.b;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.e;
        int hashCode3 = this.g.hashCode() + this.f.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.h = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        fok fokVar = (fok) ft6.b.g3.getValue();
        lb7 lb7Var = ft6.a;
        fokVar.getClass();
        return fok.c(lb7Var, this);
    }

    public DivEdgeInsets(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = expression7;
    }

    public DivEdgeInsets() {
        this(null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }
}

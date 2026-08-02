package com.yandex.div2;

import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.ft6;
import defpackage.i4l;
import defpackage.jl40;
import defpackage.ngd0;
import defpackage.qoi0;
import defpackage.rjl;
import defpackage.rvo;
import defpackage.y3l;
import defpackage.z3l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivTransform implements c4x {
    public static final y3l e;
    public static final y3l f;
    public final z3l a;
    public final z3l b;
    public final Expression c;
    public Integer d;

    static {
        Double valueOf = Double.valueOf(50.0d);
        e = new y3l(new i4l(ngd0.m(valueOf)));
        f = new y3l(new i4l(ngd0.m(valueOf)));
    }

    public DivTransform(z3l z3lVar, z3l z3lVar2, Expression expression) {
        this.a = z3lVar;
        this.b = z3lVar2;
        this.c = expression;
    }

    public final boolean a(DivTransform divTransform, rvo rvoVar, rvo rvoVar2) {
        if (divTransform != null && this.a.a(divTransform.a, rvoVar, rvoVar2) && this.b.a(divTransform.b, rvoVar, rvoVar2)) {
            Expression expression = this.c;
            Double d = expression != null ? (Double) expression.a(rvoVar) : null;
            Expression expression2 = divTransform.c;
            if (jl40.i(d, expression2 != null ? (Double) expression2.a(rvoVar2) : null)) {
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
        int b = this.b.b() + this.a.b() + qoi0.a(DivTransform.class).hashCode();
        Expression expression = this.c;
        int hashCode = b + (expression != null ? expression.hashCode() : 0);
        this.d = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((rjl) ft6.b.n9.getValue()).b(ft6.a, this);
    }

    public DivTransform() {
        this(e, f, null);
    }
}

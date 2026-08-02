package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import defpackage.c4x;
import defpackage.eql;
import defpackage.f9l;
import defpackage.ft6;
import defpackage.jbk;
import defpackage.jl40;
import defpackage.ngd0;
import defpackage.qoi0;
import defpackage.rvo;
import defpackage.tnk;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DivVisibilityAction implements c4x, f9l {
    public final tnk a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final JSONObject e;
    public final Expression f;
    public final String g;
    public final jbk h;
    public final Expression i;
    public final Expression j;
    public final Expression k;
    public Integer l;

    static {
        ngd0.m(Boolean.TRUE);
        ngd0.m(1L);
        ngd0.m(800L);
        ngd0.m(50L);
    }

    public DivVisibilityAction(jbk jbkVar, tnk tnkVar, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, String str, JSONObject jSONObject) {
        this.a = tnkVar;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = jSONObject;
        this.f = expression4;
        this.g = str;
        this.h = jbkVar;
        this.i = expression5;
        this.j = expression6;
        this.k = expression7;
    }

    @Override // defpackage.f9l
    public final tnk a() {
        return this.a;
    }

    @Override // defpackage.f9l
    public final Expression b() {
        return this.c;
    }

    @Override // defpackage.f9l
    public final Expression c() {
        return this.d;
    }

    @Override // defpackage.f9l
    public final jbk d() {
        return this.h;
    }

    @Override // defpackage.f9l
    public final String e() {
        return this.g;
    }

    public final boolean f(DivVisibilityAction divVisibilityAction, rvo rvoVar, rvo rvoVar2) {
        if (divVisibilityAction == null) {
            return false;
        }
        tnk tnkVar = divVisibilityAction.a;
        tnk tnkVar2 = this.a;
        if ((tnkVar2 != null ? tnkVar2.a(tnkVar, rvoVar, rvoVar2) : tnkVar == null) && ((Boolean) this.b.a(rvoVar)).booleanValue() == ((Boolean) divVisibilityAction.b.a(rvoVar2)).booleanValue() && jl40.l(this.c.a(rvoVar), divVisibilityAction.c.a(rvoVar2)) && ((Number) this.d.a(rvoVar)).longValue() == ((Number) divVisibilityAction.d.a(rvoVar2)).longValue() && jl40.l(this.e, divVisibilityAction.e)) {
            Expression expression = this.f;
            Uri uri = expression != null ? (Uri) expression.a(rvoVar) : null;
            Expression expression2 = divVisibilityAction.f;
            if (jl40.l(uri, expression2 != null ? (Uri) expression2.a(rvoVar2) : null) && jl40.l(this.g, divVisibilityAction.g)) {
                jbk jbkVar = divVisibilityAction.h;
                jbk jbkVar2 = this.h;
                if (jbkVar2 != null ? jbkVar2.a(jbkVar, rvoVar, rvoVar2) : jbkVar == null) {
                    Expression expression3 = this.i;
                    Uri uri2 = expression3 != null ? (Uri) expression3.a(rvoVar) : null;
                    Expression expression4 = divVisibilityAction.i;
                    if (jl40.l(uri2, expression4 != null ? (Uri) expression4.a(rvoVar2) : null) && ((Number) this.j.a(rvoVar)).longValue() == ((Number) divVisibilityAction.j.a(rvoVar2)).longValue() && ((Number) this.k.a(rvoVar)).longValue() == ((Number) divVisibilityAction.k.a(rvoVar2)).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int g() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(DivVisibilityAction.class).hashCode();
        tnk tnkVar = this.a;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (tnkVar != null ? tnkVar.b() : 0);
        JSONObject jSONObject = this.e;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression = this.f;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0);
        String str = this.g;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        jbk jbkVar = this.h;
        int b = hashCode5 + (jbkVar != null ? jbkVar.b() : 0);
        Expression expression2 = this.i;
        int hashCode6 = this.k.hashCode() + this.j.hashCode() + b + (expression2 != null ? expression2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // defpackage.f9l
    public final JSONObject getPayload() {
        return this.e;
    }

    @Override // defpackage.f9l
    public final Expression getUrl() {
        return this.i;
    }

    @Override // defpackage.f9l
    public final Expression isEnabled() {
        return this.b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((eql) ft6.b.R9.getValue()).b(ft6.a, this);
    }
}

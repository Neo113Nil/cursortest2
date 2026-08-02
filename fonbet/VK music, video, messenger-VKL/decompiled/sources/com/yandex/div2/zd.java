package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.ae;
import org.json.JSONObject;
import xsna.apn;
import xsna.epx;
import xsna.fpf0;
import xsna.pkn;

/* compiled from: DivVisibilityAction.kt */
/* loaded from: classes8.dex */
public final class zd implements JSONSerializable, Hashable, apn {
    public final pkn a;
    public final Expression<Boolean> b;
    public final Expression<String> c;
    public final Expression<Long> d;
    public final JSONObject e;
    public final Expression<Uri> f;
    public final String g;
    public final k0 h;
    public final Expression<Uri> i;
    public final Expression<Long> j;
    public final Expression<Long> k;
    public Integer l;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        Expression.Companion.constant$default(companion, 800L, null, 2, null);
        Expression.Companion.constant$default(companion, 50L, null, 2, null);
    }

    public zd(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, k0 k0Var, String str, JSONObject jSONObject, pkn pknVar) {
        this.a = pknVar;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = jSONObject;
        this.f = expression4;
        this.g = str;
        this.h = k0Var;
        this.i = expression5;
        this.j = expression6;
        this.k = expression7;
    }

    @Override // xsna.apn
    public final Expression<String> a() {
        return this.c;
    }

    @Override // xsna.apn
    public final Expression<Long> b() {
        return this.d;
    }

    @Override // xsna.apn
    public final k0 c() {
        return this.h;
    }

    @Override // xsna.apn
    public final String d() {
        return this.g;
    }

    @Override // xsna.apn
    public final Expression<Uri> e() {
        return this.f;
    }

    @Override // xsna.apn
    public final pkn f() {
        return this.a;
    }

    public final boolean g(zd zdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (zdVar == null) {
            return false;
        }
        k0 k0Var = zdVar.h;
        pkn pknVar = zdVar.a;
        pkn pknVar2 = this.a;
        if ((pknVar2 != null ? pknVar2.a(pknVar, expressionResolver, expressionResolver2) : pknVar == null) && this.b.evaluate(expressionResolver).booleanValue() == zdVar.b.evaluate(expressionResolver2).booleanValue() && epx.f(this.c.evaluate(expressionResolver), zdVar.c.evaluate(expressionResolver2)) && this.d.evaluate(expressionResolver).longValue() == zdVar.d.evaluate(expressionResolver2).longValue() && epx.f(this.e, zdVar.e)) {
            Expression<Uri> expression = this.f;
            Uri evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Uri> expression2 = zdVar.f;
            if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && epx.f(this.g, zdVar.g)) {
                k0 k0Var2 = this.h;
                if (k0Var2 != null ? k0Var2.a(k0Var, expressionResolver, expressionResolver2) : k0Var == null) {
                    Expression<Uri> expression3 = this.i;
                    Uri evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                    Expression<Uri> expression4 = zdVar.i;
                    if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) && this.j.evaluate(expressionResolver).longValue() == zdVar.j.evaluate(expressionResolver2).longValue() && this.k.evaluate(expressionResolver).longValue() == zdVar.k.evaluate(expressionResolver2).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.apn
    public final JSONObject getPayload() {
        return this.e;
    }

    @Override // xsna.apn
    public final Expression<Uri> getUrl() {
        return this.i;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(zd.class).hashCode();
        pkn pknVar = this.a;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (pknVar != null ? pknVar.hash() : 0);
        JSONObject jSONObject = this.e;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<Uri> expression = this.f;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0);
        String str = this.g;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        k0 k0Var = this.h;
        int hash = hashCode5 + (k0Var != null ? k0Var.hash() : 0);
        Expression<Uri> expression2 = this.i;
        int hashCode6 = this.k.hashCode() + this.j.hashCode() + hash + (expression2 != null ? expression2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // xsna.apn
    public final Expression<Boolean> isEnabled() {
        return this.b;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ae.a) BuiltInParserKt.getBuiltInParserComponent().t9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

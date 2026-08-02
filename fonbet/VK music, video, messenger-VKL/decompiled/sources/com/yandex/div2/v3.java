package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.w3;
import org.json.JSONObject;
import xsna.apn;
import xsna.epx;
import xsna.fpf0;
import xsna.pkn;

/* compiled from: DivDisappearAction.kt */
/* loaded from: classes8.dex */
public final class v3 implements JSONSerializable, Hashable, apn {
    public final Expression<Long> a;
    public final pkn b;
    public final Expression<Boolean> c;
    public final Expression<String> d;
    public final Expression<Long> e;
    public final JSONObject f;
    public final Expression<Uri> g;
    public final String h;
    public final k0 i;
    public final Expression<Uri> j;
    public final Expression<Long> k;
    public Integer l;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 800L, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 1L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
    }

    public v3(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, k0 k0Var, String str, JSONObject jSONObject, pkn pknVar) {
        this.a = expression;
        this.b = pknVar;
        this.c = expression2;
        this.d = expression3;
        this.e = expression4;
        this.f = jSONObject;
        this.g = expression5;
        this.h = str;
        this.i = k0Var;
        this.j = expression6;
        this.k = expression7;
    }

    @Override // xsna.apn
    public final Expression<String> a() {
        return this.d;
    }

    @Override // xsna.apn
    public final Expression<Long> b() {
        return this.e;
    }

    @Override // xsna.apn
    public final k0 c() {
        return this.i;
    }

    @Override // xsna.apn
    public final String d() {
        return this.h;
    }

    @Override // xsna.apn
    public final Expression<Uri> e() {
        return this.g;
    }

    @Override // xsna.apn
    public final pkn f() {
        return this.b;
    }

    public final boolean g(v3 v3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (v3Var == null) {
            return false;
        }
        k0 k0Var = v3Var.i;
        pkn pknVar = v3Var.b;
        if (this.a.evaluate(expressionResolver).longValue() == v3Var.a.evaluate(expressionResolver2).longValue()) {
            pkn pknVar2 = this.b;
            if ((pknVar2 != null ? pknVar2.a(pknVar, expressionResolver, expressionResolver2) : pknVar == null) && this.c.evaluate(expressionResolver).booleanValue() == v3Var.c.evaluate(expressionResolver2).booleanValue() && epx.f(this.d.evaluate(expressionResolver), v3Var.d.evaluate(expressionResolver2)) && this.e.evaluate(expressionResolver).longValue() == v3Var.e.evaluate(expressionResolver2).longValue() && epx.f(this.f, v3Var.f)) {
                Expression<Uri> expression = this.g;
                Uri evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
                Expression<Uri> expression2 = v3Var.g;
                if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && epx.f(this.h, v3Var.h)) {
                    k0 k0Var2 = this.i;
                    if (k0Var2 != null ? k0Var2.a(k0Var, expressionResolver, expressionResolver2) : k0Var == null) {
                        Expression<Uri> expression3 = this.j;
                        Uri evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                        Expression<Uri> expression4 = v3Var.j;
                        if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) && this.k.evaluate(expressionResolver).longValue() == v3Var.k.evaluate(expressionResolver2).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.apn
    public final JSONObject getPayload() {
        return this.f;
    }

    @Override // xsna.apn
    public final Expression<Uri> getUrl() {
        return this.j;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(v3.class).hashCode();
        pkn pknVar = this.b;
        int hashCode2 = this.e.hashCode() + this.d.hashCode() + this.c.hashCode() + hashCode + (pknVar != null ? pknVar.hash() : 0);
        JSONObject jSONObject = this.f;
        int hashCode3 = hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<Uri> expression = this.g;
        int hashCode4 = hashCode3 + (expression != null ? expression.hashCode() : 0);
        String str = this.h;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        k0 k0Var = this.i;
        int hash = hashCode5 + (k0Var != null ? k0Var.hash() : 0);
        Expression<Uri> expression2 = this.j;
        int hashCode6 = this.k.hashCode() + hash + (expression2 != null ? expression2.hashCode() : 0);
        this.l = Integer.valueOf(hashCode6);
        return hashCode6;
    }

    @Override // xsna.apn
    public final Expression<Boolean> isEnabled() {
        return this.c;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((w3.a) BuiltInParserKt.getBuiltInParserComponent().P2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

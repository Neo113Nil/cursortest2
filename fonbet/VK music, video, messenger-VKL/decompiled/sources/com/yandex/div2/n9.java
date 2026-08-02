package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.o9;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.jon;

/* compiled from: DivShadow.kt */
/* loaded from: classes8.dex */
public final class n9 implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public final Expression<Long> b;
    public final Expression<Integer> c;
    public final jon d;
    public Integer e;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        Expression.Companion.constant$default(companion, 2L, null, 2, null);
        Expression.Companion.constant$default(companion, 0, null, 2, null);
    }

    public n9(Expression<Double> expression, Expression<Long> expression2, Expression<Integer> expression3, jon jonVar) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = jonVar;
    }

    public final boolean a(n9 n9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return n9Var != null && this.a.evaluate(expressionResolver).doubleValue() == n9Var.a.evaluate(expressionResolver2).doubleValue() && this.b.evaluate(expressionResolver).longValue() == n9Var.b.evaluate(expressionResolver2).longValue() && this.c.evaluate(expressionResolver).intValue() == n9Var.c.evaluate(expressionResolver2).intValue() && this.d.a(n9Var.d, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hash = this.d.hash() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + fpf0.a(n9.class).hashCode();
        this.e = Integer.valueOf(hash);
        return hash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((o9.a) BuiltInParserKt.getBuiltInParserComponent().M6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

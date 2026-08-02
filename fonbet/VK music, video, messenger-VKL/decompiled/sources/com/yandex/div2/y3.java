package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.z3;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivEdgeInsets.kt */
/* loaded from: classes8.dex */
public final class y3 implements JSONSerializable, Hashable {
    public static final Expression<Long> i;
    public static final Expression<Long> j;
    public static final Expression<Long> k;
    public static final Expression<Long> l;
    public static final Expression<DivSizeUnit> m;
    public final Expression<Long> a;
    public final Expression<Long> b;
    public final Expression<Long> c;
    public final Expression<Long> d;
    public final Expression<Long> e;
    public final Expression<Long> f;
    public final Expression<DivSizeUnit> g;
    public Integer h;

    static {
        Expression.Companion companion = Expression.Companion;
        i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        l = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        m = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
    }

    public y3() {
        this(null, null, null, null, 127);
    }

    public final boolean a(y3 y3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y3Var != null && this.a.evaluate(expressionResolver).longValue() == y3Var.a.evaluate(expressionResolver2).longValue()) {
            Expression<Long> expression = this.b;
            Long evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<Long> expression2 = y3Var.b;
            if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.c.evaluate(expressionResolver).longValue() == y3Var.c.evaluate(expressionResolver2).longValue() && this.d.evaluate(expressionResolver).longValue() == y3Var.d.evaluate(expressionResolver2).longValue()) {
                Expression<Long> expression3 = this.e;
                Long evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<Long> expression4 = y3Var.e;
                if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) && this.f.evaluate(expressionResolver).longValue() == y3Var.f.evaluate(expressionResolver2).longValue() && this.g.evaluate(expressionResolver) == y3Var.g.evaluate(expressionResolver2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(y3.class).hashCode();
        Expression<Long> expression = this.b;
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + hashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.e;
        int hashCode3 = this.g.hashCode() + this.f.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.h = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z3.b bVar = (z3.b) BuiltInParserKt.getBuiltInParserComponent().Y2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return z3.b.a(builtInParsingContext, this);
    }

    public y3(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4, Expression<Long> expression5, Expression<Long> expression6, Expression<DivSizeUnit> expression7) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
        this.e = expression5;
        this.f = expression6;
        this.g = expression7;
    }

    public /* synthetic */ y3(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i2) {
        this((i2 & 1) != 0 ? i : expression, null, (i2 & 4) != 0 ? j : expression2, (i2 & 8) != 0 ? k : expression3, null, (i2 & 32) != 0 ? l : expression4, m);
    }
}

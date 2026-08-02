package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.v1;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivBorder.kt */
/* loaded from: classes8.dex */
public final class u1 implements JSONSerializable, Hashable {
    public static final Expression<Boolean> g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);
    public final Expression<Long> a;
    public final y2 b;
    public final Expression<Boolean> c;
    public final n9 d;
    public final va e;
    public Integer f;

    public u1(Expression<Long> expression, y2 y2Var, Expression<Boolean> expression2, n9 n9Var, va vaVar) {
        this.a = expression;
        this.b = y2Var;
        this.c = expression2;
        this.d = n9Var;
        this.e = vaVar;
    }

    public final boolean a(u1 u1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (u1Var == null) {
            return false;
        }
        va vaVar = u1Var.e;
        n9 n9Var = u1Var.d;
        y2 y2Var = u1Var.b;
        Expression<Long> expression = this.a;
        Long evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = u1Var.a;
        if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            y2 y2Var2 = this.b;
            if ((y2Var2 != null ? y2Var2.a(y2Var, expressionResolver, expressionResolver2) : y2Var == null) && this.c.evaluate(expressionResolver).booleanValue() == u1Var.c.evaluate(expressionResolver2).booleanValue()) {
                n9 n9Var2 = this.d;
                if (n9Var2 != null ? n9Var2.a(n9Var, expressionResolver, expressionResolver2) : n9Var == null) {
                    va vaVar2 = this.e;
                    if (vaVar2 != null ? vaVar2.a(vaVar, expressionResolver, expressionResolver2) : vaVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(u1.class).hashCode();
        Expression<Long> expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        y2 y2Var = this.b;
        int hashCode3 = this.c.hashCode() + hashCode2 + (y2Var != null ? y2Var.hash() : 0);
        n9 n9Var = this.d;
        int hash = hashCode3 + (n9Var != null ? n9Var.hash() : 0);
        va vaVar = this.e;
        int hash2 = hash + (vaVar != null ? vaVar.hash() : 0);
        this.f = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v1.a) BuiltInParserKt.getBuiltInParserComponent().L1.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public u1() {
        this(null, null, g, null, null);
    }
}

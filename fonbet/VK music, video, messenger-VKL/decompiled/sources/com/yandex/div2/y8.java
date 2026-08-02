package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.z8;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivRoundedRectangleShape.kt */
/* loaded from: classes8.dex */
public final class y8 implements JSONSerializable, Hashable {
    public static final q4 g;
    public static final q4 h;
    public static final q4 i;
    public final Expression<Integer> a;
    public final q4 b;
    public final q4 c;
    public final q4 d;
    public final va e;
    public Integer f;

    static {
        Expression.Companion companion = Expression.Companion;
        g = new q4(Expression.Companion.constant$default(companion, 5L, null, 2, null));
        h = new q4(Expression.Companion.constant$default(companion, 10L, null, 2, null));
        i = new q4(Expression.Companion.constant$default(companion, 10L, null, 2, null));
    }

    public y8() {
        this(0);
    }

    public final boolean a(y8 y8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y8Var == null) {
            return false;
        }
        va vaVar = y8Var.e;
        Expression<Integer> expression = this.a;
        Integer evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Integer> expression2 = y8Var.a;
        if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) && this.b.a(y8Var.b, expressionResolver, expressionResolver2) && this.c.a(y8Var.c, expressionResolver, expressionResolver2) && this.d.a(y8Var.d, expressionResolver, expressionResolver2)) {
            va vaVar2 = this.e;
            if (vaVar2 != null ? vaVar2.a(vaVar, expressionResolver, expressionResolver2) : vaVar == null) {
                return true;
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
        int hashCode = fpf0.a(y8.class).hashCode();
        Expression<Integer> expression = this.a;
        int hash = this.d.hash() + this.c.hash() + this.b.hash() + hashCode + (expression != null ? expression.hashCode() : 0);
        va vaVar = this.e;
        int hash2 = hash + (vaVar != null ? vaVar.hash() : 0);
        this.f = Integer.valueOf(hash2);
        return hash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((z8.a) BuiltInParserKt.getBuiltInParserComponent().u6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public y8(Expression<Integer> expression, q4 q4Var, q4 q4Var2, q4 q4Var3, va vaVar) {
        this.a = expression;
        this.b = q4Var;
        this.c = q4Var2;
        this.d = q4Var3;
        this.e = vaVar;
    }

    public /* synthetic */ y8(int i2) {
        this(null, g, h, i, null);
    }
}

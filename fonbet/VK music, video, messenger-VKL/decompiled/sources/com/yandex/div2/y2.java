package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.z2;
import org.json.JSONObject;
import xsna.epx;
import xsna.fpf0;

/* compiled from: DivCornersRadius.kt */
/* loaded from: classes8.dex */
public final class y2 implements JSONSerializable, Hashable {
    public final Expression<Long> a;
    public final Expression<Long> b;
    public final Expression<Long> c;
    public final Expression<Long> d;
    public Integer e;

    public y2() {
        this(null, null, null, null);
    }

    public final boolean a(y2 y2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y2Var == null) {
            return false;
        }
        Expression<Long> expression = this.a;
        Long evaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = y2Var.a;
        if (epx.f(evaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            Expression<Long> expression3 = this.b;
            Long evaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
            Expression<Long> expression4 = y2Var.b;
            if (epx.f(evaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null)) {
                Expression<Long> expression5 = this.c;
                Long evaluate3 = expression5 != null ? expression5.evaluate(expressionResolver) : null;
                Expression<Long> expression6 = y2Var.c;
                if (epx.f(evaluate3, expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
                    Expression<Long> expression7 = this.d;
                    Long evaluate4 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
                    Expression<Long> expression8 = y2Var.d;
                    if (epx.f(evaluate4, expression8 != null ? expression8.evaluate(expressionResolver2) : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(y2.class).hashCode();
        Expression<Long> expression = this.a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression<Long> expression2 = this.b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression<Long> expression3 = this.c;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression<Long> expression4 = this.d;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this.e = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        z2.a aVar = (z2.a) BuiltInParserKt.getBuiltInParserComponent().s2.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        return z2.a.a(builtInParsingContext, this);
    }

    public y2(Expression<Long> expression, Expression<Long> expression2, Expression<Long> expression3, Expression<Long> expression4) {
        this.a = expression;
        this.b = expression2;
        this.c = expression3;
        this.d = expression4;
    }
}

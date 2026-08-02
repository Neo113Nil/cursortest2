package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.r4;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivFixedSize.kt */
/* loaded from: classes8.dex */
public final class q4 implements JSONSerializable, Hashable {
    public static final Expression<DivSizeUnit> d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    public final Expression<DivSizeUnit> a;
    public final Expression<Long> b;
    public Integer c;

    public q4(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(q4 q4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return q4Var != null && this.a.evaluate(expressionResolver) == q4Var.a.evaluate(expressionResolver2) && this.b.evaluate(expressionResolver).longValue() == q4Var.b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(q4.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        r4.b bVar = (r4.b) BuiltInParserKt.getBuiltInParserComponent().w3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        return r4.b.b(builtInParsingContext, this);
    }

    public /* synthetic */ q4(Expression expression) {
        this(d, expression);
    }
}

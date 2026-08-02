package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.ba;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivSizeUnitValue.kt */
/* loaded from: classes8.dex */
public final class aa implements JSONSerializable, Hashable {
    public final Expression<DivSizeUnit> a;
    public final Expression<Long> b;
    public Integer c;

    static {
        Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    }

    public aa(Expression<DivSizeUnit> expression, Expression<Long> expression2) {
        this.a = expression;
        this.b = expression2;
    }

    public final boolean a(aa aaVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return aaVar != null && this.a.evaluate(expressionResolver) == aaVar.a.evaluate(expressionResolver2) && this.b.evaluate(expressionResolver).longValue() == aaVar.b.evaluate(expressionResolver2).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + fpf0.a(aa.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ba.b bVar = (ba.b) BuiltInParserKt.getBuiltInParserComponent().V6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "unit", this.a, DivSizeUnit.TO_STRING);
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "value", this.b);
        return jSONObject;
    }
}

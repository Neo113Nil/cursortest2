package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k1;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivAspect.kt */
/* loaded from: classes8.dex */
public final class j1 implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public Integer b;

    public j1(Expression<Double> expression) {
        this.a = expression;
    }

    public final boolean a(j1 j1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return j1Var != null && this.a.evaluate(expressionResolver).doubleValue() == j1Var.a.evaluate(expressionResolver2).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(j1.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        k1.a aVar = (k1.a) BuiltInParserKt.getBuiltInParserComponent().C1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}

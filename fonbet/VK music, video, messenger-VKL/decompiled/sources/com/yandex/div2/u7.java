package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.v7;
import org.json.JSONObject;
import xsna.fpf0;

/* compiled from: DivPercentageSize.kt */
/* loaded from: classes8.dex */
public final class u7 implements JSONSerializable, Hashable {
    public final Expression<Double> a;
    public Integer b;

    public u7(Expression<Double> expression) {
        this.a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + fpf0.a(u7.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        v7.a aVar = (v7.a) BuiltInParserKt.getBuiltInParserComponent().H5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        aVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "percentage");
        JsonExpressionParser.writeExpression(builtInParsingContext, jSONObject, "value", this.a);
        return jSONObject;
    }
}

package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.ba;
import org.json.JSONObject;

/* compiled from: DivSizeUnitValueTemplate.kt */
/* loaded from: classes8.dex */
public final class ca implements JSONSerializable, JsonTemplate<aa> {
    public final Field<Expression<DivSizeUnit>> a;
    public final Field<Expression<Long>> b;

    static {
        Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);
    }

    public ca(Field<Expression<DivSizeUnit>> field, Field<Expression<Long>> field2) {
        this.a = field;
        this.b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        ba.c cVar = (ba.c) BuiltInParserKt.getBuiltInParserComponent().W6.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        cVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "unit", this.a, DivSizeUnit.TO_STRING);
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "value", this.b);
        return jSONObject;
    }
}

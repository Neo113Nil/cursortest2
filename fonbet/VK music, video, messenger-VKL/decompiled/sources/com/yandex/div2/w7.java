package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.v7;
import org.json.JSONObject;

/* compiled from: DivPercentageSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class w7 implements JSONSerializable, JsonTemplate<u7> {
    public final Field<Expression<Double>> a;

    public w7(Field<Expression<Double>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        v7.b bVar = (v7.b) BuiltInParserKt.getBuiltInParserComponent().I5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "percentage");
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "value", this.a);
        return jSONObject;
    }
}

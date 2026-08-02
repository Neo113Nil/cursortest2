package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.k1;
import org.json.JSONObject;

/* compiled from: DivAspectTemplate.kt */
/* loaded from: classes8.dex */
public final class l1 implements JSONSerializable, JsonTemplate<j1> {
    public final Field<Expression<Double>> a;

    public l1(Field<Expression<Double>> field) {
        this.a = field;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        k1.b bVar = (k1.b) BuiltInParserKt.getBuiltInParserComponent().D1.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}

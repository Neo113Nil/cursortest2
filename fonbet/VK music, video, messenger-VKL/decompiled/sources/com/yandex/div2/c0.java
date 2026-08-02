package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionSubmit;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class c0 implements Serializer, Deserializer {
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.a(JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        DivActionSubmit.Request.a aVar = (DivActionSubmit.Request.a) obj;
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", aVar.a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", aVar.b);
        return jSONObject;
    }
}

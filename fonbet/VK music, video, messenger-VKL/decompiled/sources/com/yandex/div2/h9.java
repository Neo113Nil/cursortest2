package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.j9;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes8.dex */
public final class h9 implements Serializer, TemplateDeserializer {
    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        j9.a aVar = (j9.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new j9.a(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text", typeHelper, allowPropertyOverride, aVar != null ? aVar.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, aVar != null ? aVar.b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        j9.a aVar = (j9.a) obj;
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", aVar.a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", aVar.b);
        return jSONObject;
    }
}

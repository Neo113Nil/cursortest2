package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class v8g implements Serializer, TemplateDeserializer {
    public static x8g a(ParsingContext parsingContext, x8g x8gVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new x8g(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, x8gVar != null ? x8gVar.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, x8gVar != null ? x8gVar.b : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public static JSONObject b(ParsingContext parsingContext, x8g x8gVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", x8gVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", x8gVar.b, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (x8g) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (x8g) obj);
    }
}

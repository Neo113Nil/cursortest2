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

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class eax implements Serializer, TemplateDeserializer {
    public static gax a(ParsingContext parsingContext, gax gaxVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new gax(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, gaxVar != null ? gaxVar.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, gaxVar != null ? gaxVar.b : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    public static JSONObject b(ParsingContext parsingContext, gax gaxVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", gaxVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "integer");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", gaxVar.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (gax) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (gax) obj);
    }
}

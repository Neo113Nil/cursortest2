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

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class thn implements Serializer, TemplateDeserializer {
    public static vhn a(ParsingContext parsingContext, vhn vhnVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new vhn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, vhnVar != null ? vhnVar.a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, vhnVar != null ? vhnVar.b : null));
    }

    public static JSONObject b(ParsingContext parsingContext, vhn vhnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", vhnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", vhnVar.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (vhn) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (vhn) obj);
    }
}

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

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class rn70 implements Serializer, TemplateDeserializer {
    public static tn70 a(ParsingContext parsingContext, tn70 tn70Var, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new tn70(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, tn70Var != null ? tn70Var.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, tn70Var != null ? tn70Var.b : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    public static JSONObject b(ParsingContext parsingContext, tn70 tn70Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", tn70Var.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", tn70Var.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (tn70) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (tn70) obj);
    }
}

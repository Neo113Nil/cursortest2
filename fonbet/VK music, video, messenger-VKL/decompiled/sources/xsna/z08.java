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

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class z08 implements Serializer, TemplateDeserializer {
    public static b18 a(ParsingContext parsingContext, b18 b18Var, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new b18(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, b18Var != null ? b18Var.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, b18Var != null ? b18Var.b : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    public static JSONObject b(ParsingContext parsingContext, b18 b18Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", b18Var.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", b18Var.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (b18) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (b18) obj);
    }
}

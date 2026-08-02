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

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class rfq0 implements Serializer, TemplateDeserializer {
    public static tfq0 a(ParsingContext parsingContext, tfq0 tfq0Var, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new tfq0(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, tfq0Var != null ? tfq0Var.a : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, tfq0Var != null ? tfq0Var.b : null, ParsingConvertersKt.ANY_TO_URI));
    }

    public static JSONObject b(ParsingContext parsingContext, tfq0 tfq0Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", tfq0Var.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", tfq0Var.b, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (tfq0) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (tfq0) obj);
    }
}

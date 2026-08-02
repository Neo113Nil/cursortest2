package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: ContentUrlJsonParser.kt */
/* loaded from: classes8.dex */
public final class qlj implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, slj sljVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", sljVar.a, ParsingConvertersKt.URI_TO_STRING);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        slj sljVar = (slj) entityTemplate;
        return new slj(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_URI, parsingContext.getAllowPropertyOverride(), sljVar != null ? sljVar.a : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (slj) obj);
    }
}

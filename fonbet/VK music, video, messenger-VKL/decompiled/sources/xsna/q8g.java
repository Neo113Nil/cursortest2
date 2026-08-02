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

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class q8g implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, s8g s8gVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "color");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", s8gVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        s8g s8gVar = (s8g) entityTemplate;
        return new s8g(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), s8gVar != null ? s8gVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (s8g) obj);
    }
}

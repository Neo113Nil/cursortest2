package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class vwm implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, xwm xwmVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "dict");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", xwmVar.a);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        xwm xwmVar = (xwm) entityTemplate;
        return new xwm(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DICT, parsingContext.getAllowPropertyOverride(), xwmVar != null ? xwmVar.a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (xwm) obj);
    }
}

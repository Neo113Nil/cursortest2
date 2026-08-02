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

/* compiled from: BoolValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class u08 implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, w08 w08Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "boolean");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", w08Var.a);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        w08 w08Var = (w08) entityTemplate;
        return new w08(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), w08Var != null ? w08Var.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (w08) obj);
    }
}

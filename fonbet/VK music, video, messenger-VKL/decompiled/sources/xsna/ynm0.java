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

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class ynm0 implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, aom0 aom0Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "string");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", aom0Var.a);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        aom0 aom0Var = (aom0) entityTemplate;
        return new aom0(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), aom0Var != null ? aom0Var.a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (aom0) obj);
    }
}

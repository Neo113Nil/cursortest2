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

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class il3 implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, kl3 kl3Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "array");
        JsonFieldParser.writeExpressionField(parsingContext, b, "value", kl3Var.a);
        return b;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        kl3 kl3Var = (kl3) entityTemplate;
        return new kl3(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, parsingContext.getAllowPropertyOverride(), kl3Var != null ? kl3Var.a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (kl3) obj);
    }
}

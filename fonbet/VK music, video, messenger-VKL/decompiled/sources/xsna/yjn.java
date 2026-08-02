package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class yjn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public yjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final akn deserialize(ParsingContext parsingContext, akn aknVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new akn(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, aknVar != null ? aknVar.a : null, this.a.f9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aknVar != null ? aknVar.b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, akn aknVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "set_variable");
        JsonFieldParser.writeField(parsingContext, b, "value", aknVar.a, this.a.f9);
        JsonFieldParser.writeExpressionField(parsingContext, b, "variable_name", aknVar.b);
        return b;
    }
}

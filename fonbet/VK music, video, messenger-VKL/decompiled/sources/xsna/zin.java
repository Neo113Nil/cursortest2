package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class zin implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public zin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjn deserialize(ParsingContext parsingContext, bjn bjnVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new bjn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, bjnVar != null ? bjnVar.a : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, bjnVar != null ? bjnVar.b : null, this.a.f9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, bjnVar != null ? bjnVar.c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, bjn bjnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", bjnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", bjnVar.b, this.a.f9);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", bjnVar.c);
        return jSONObject;
    }
}

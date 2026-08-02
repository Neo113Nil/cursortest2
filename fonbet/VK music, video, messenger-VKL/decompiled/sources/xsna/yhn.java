package xsna;

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

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class yhn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public yhn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ain deserialize(ParsingContext parsingContext, ain ainVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ain(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, ainVar != null ? ainVar.a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, ainVar != null ? ainVar.b : null, this.a.f9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ainVar != null ? ainVar.c : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ain ainVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", ainVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", ainVar.b, this.a.f9);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", ainVar.c);
        return jSONObject;
    }
}

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

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class tjn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public tjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vjn deserialize(ParsingContext parsingContext, vjn vjnVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new vjn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, vjnVar != null ? vjnVar.a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, vjnVar != null ? vjnVar.b : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, vjnVar != null ? vjnVar.c : null, this.a.f9));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, vjn vjnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "lifetime", vjnVar.a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", vjnVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", vjnVar.c, this.a.f9);
        return jSONObject;
    }
}

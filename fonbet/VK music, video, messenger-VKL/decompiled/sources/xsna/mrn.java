package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class mrn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public mrn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final orn deserialize(ParsingContext parsingContext, orn ornVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, ornVar != null ? ornVar.a : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field<com.yandex.div2.ca> field = ornVar != null ? ornVar.b : null;
        com.yandex.div2.fe feVar = this.a;
        return new orn(readOptionalFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, field, feVar.W6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, ornVar != null ? ornVar.c : null, feVar.W6));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, orn ornVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "constrained", ornVar.a);
        Field<com.yandex.div2.ca> field = ornVar.b;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", field, feVar.W6);
        JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", ornVar.c, feVar.W6);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}

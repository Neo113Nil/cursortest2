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

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class xon implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public xon(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zon deserialize(ParsingContext parsingContext, zon zonVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, zonVar != null ? zonVar.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field<com.yandex.div2.u9> field = zonVar != null ? zonVar.b : null;
        com.yandex.div2.fe feVar = this.a;
        return new zon(readFieldWithExpression, JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, field, feVar.T6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, zonVar != null ? zonVar.c : null, feVar.J7));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, zon zonVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", zonVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        Field<com.yandex.div2.u9> field = zonVar.b;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "shape", field, feVar.T6);
        JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", zonVar.c, feVar.J7);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}

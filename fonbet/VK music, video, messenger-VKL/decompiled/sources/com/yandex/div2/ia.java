package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.ka;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.ykn;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public final class ia implements Serializer, TemplateDeserializer {
    public final fe a;

    public ia(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ka.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.END, aVar.a);
        Field<a4> field = aVar.b;
        fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field, feVar.Z2);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", aVar.c);
        Field<ykn> field2 = aVar.d;
        bpn0 bpn0Var = feVar.W2;
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", field2, bpn0Var);
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", aVar.e, bpn0Var);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        ka.a aVar = (ka.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field<Expression<Long>> field = aVar != null ? aVar.a : null;
        izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.END, typeHelper, allowPropertyOverride, field, izsVar);
        Field<a4> field2 = aVar != null ? aVar.b : null;
        fe feVar = this.a;
        bpn0 bpn0Var = feVar.Z2;
        bpn0 bpn0Var2 = feVar.W2;
        return new ka.a(readOptionalFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, field2, bpn0Var), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, aVar != null ? aVar.c : null, izsVar), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, aVar != null ? aVar.d : null, bpn0Var2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, aVar != null ? aVar.e : null, bpn0Var2));
    }
}

package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.ra;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class pa implements Serializer, TemplateDeserializer {
    public final fe a;

    public pa(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ra.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<v0> field = aVar.a;
        fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", field, feVar.r1);
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", aVar.b, feVar.r1);
        JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar.c, feVar.A9);
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", aVar.d);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "swipe_out_actions", aVar.e, feVar.l1);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        ra.a aVar = (ra.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<v0> field = aVar != null ? aVar.a : null;
        fe feVar = this.a;
        return new ra.a(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, field, feVar.r1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, aVar != null ? aVar.b : null, feVar.r1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_DIV, allowPropertyOverride, aVar != null ? aVar.c : null, feVar.A9), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, aVar != null ? aVar.d : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "swipe_out_actions", allowPropertyOverride, aVar != null ? aVar.e : null, feVar.l1));
    }
}

package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.o3;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes8.dex */
public final class m3 implements Serializer, TemplateDeserializer {
    public final fe a;

    public m3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        o3.a aVar = (o3.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new o3.a(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_DIV, allowPropertyOverride, aVar != null ? aVar.a : null, this.a.A9), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "state_id", allowPropertyOverride, aVar != null ? aVar.b : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        o3.a aVar = (o3.a) obj;
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar.a, this.a.A9);
        JsonFieldParser.writeField(parsingContext, jSONObject, "state_id", aVar.b);
        return jSONObject;
    }
}

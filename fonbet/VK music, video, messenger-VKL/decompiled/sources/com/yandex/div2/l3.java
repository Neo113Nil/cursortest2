package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.j3;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes8.dex */
public final class l3 implements Serializer, Deserializer {
    public final fe a;

    public l3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new j3.b(((Number) JsonPropertyParser.read(parsingContext, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue(), (a) JsonPropertyParser.read(parsingContext, jSONObject, TtmlNode.TAG_DIV, this.a.z9));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        j3.b bVar = (j3.b) obj;
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_DIV, bVar.a, this.a.z9);
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", Long.valueOf(bVar.b));
        return jSONObject;
    }
}

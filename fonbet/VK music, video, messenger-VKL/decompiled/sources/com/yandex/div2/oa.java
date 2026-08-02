package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.ma;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class oa implements Serializer, Deserializer {
    public final fe a;

    public oa(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, ma.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        DivAnimation divAnimation = aVar.a;
        fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", divAnimation, feVar.q1);
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", aVar.b, feVar.q1);
        JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar.c, feVar.z9);
        JsonPropertyParser.write(parsingContext, jSONObject, "state_id", aVar.d);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "swipe_out_actions", aVar.e, feVar.k1);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        fe feVar = this.a;
        return new ma.a((DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", feVar.q1), (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", feVar.q1), (a) JsonPropertyParser.readOptional(parsingContext, jSONObject, TtmlNode.TAG_DIV, feVar.z9), (String) JsonPropertyParser.read(parsingContext, jSONObject, "state_id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "swipe_out_actions", feVar.k1));
    }
}

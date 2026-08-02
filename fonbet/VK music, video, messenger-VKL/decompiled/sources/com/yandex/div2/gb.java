package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTabs;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class gb implements Serializer, Deserializer {
    public final fe a;

    public gb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, DivTabs.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        a aVar2 = aVar.a;
        fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, TtmlNode.TAG_DIV, aVar2, feVar.z9);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "title", aVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, "title_click_action", aVar.c, feVar.k1);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        fe feVar = this.a;
        return new DivTabs.a((a) JsonPropertyParser.read(parsingContext, jSONObject, TtmlNode.TAG_DIV, feVar.z9), JsonExpressionParser.readExpression(parsingContext, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_click_action", feVar.k1));
    }
}

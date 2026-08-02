package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: EndDestinationTemplate.kt */
/* loaded from: classes8.dex */
public final class pkp implements JSONSerializable, JsonTemplate<lkp> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        nkp nkpVar = (nkp) BuiltInParserKt.getBuiltInParserComponent().D9.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        nkpVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", TtmlNode.END);
        return jSONObject;
    }
}

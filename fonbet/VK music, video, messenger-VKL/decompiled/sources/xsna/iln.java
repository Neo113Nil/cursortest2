package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivFilterRtlMirrorTemplate.kt */
/* loaded from: classes8.dex */
public final class iln implements JSONSerializable, JsonTemplate<eln> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        gln glnVar = (gln) BuiltInParserKt.getBuiltInParserComponent().i3.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        glnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleDashedTemplate.kt */
/* loaded from: classes8.dex */
public final class ppn implements JSONSerializable, JsonTemplate<lpn> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        npn npnVar = (npn) BuiltInParserKt.getBuiltInParserComponent().A7.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        npnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "dashed");
        return jSONObject;
    }
}

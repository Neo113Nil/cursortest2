package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StartDestinationTemplate.kt */
/* loaded from: classes8.dex */
public final class bqk0 implements JSONSerializable, JsonTemplate<xpk0> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        zpk0 zpk0Var = (zpk0) BuiltInParserKt.getBuiltInParserComponent().ba.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        zpk0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "start");
        return jSONObject;
    }
}

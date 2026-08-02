package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivTooltipModeModalTemplate.kt */
/* loaded from: classes8.dex */
public final class dqn implements JSONSerializable, JsonTemplate<zpn> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        bqn bqnVar = (bqn) BuiltInParserKt.getBuiltInParserComponent().N8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        bqnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "modal");
        return jSONObject;
    }
}

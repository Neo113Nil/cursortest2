package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModalTemplate.kt */
/* loaded from: classes8.dex */
public final class iqn implements JSONSerializable, JsonTemplate<eqn> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        gqn gqnVar = (gqn) BuiltInParserKt.getBuiltInParserComponent().Q8.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        gqnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}

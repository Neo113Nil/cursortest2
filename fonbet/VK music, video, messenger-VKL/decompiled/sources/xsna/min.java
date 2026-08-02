package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionClearFocusTemplate.kt */
/* loaded from: classes8.dex */
public final class min implements JSONSerializable, JsonTemplate<iin> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        kin kinVar = (kin) BuiltInParserKt.getBuiltInParserComponent().a0.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        kinVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "clear_focus");
        return jSONObject;
    }
}

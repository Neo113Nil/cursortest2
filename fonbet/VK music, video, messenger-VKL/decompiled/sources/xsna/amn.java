package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInfinityCountTemplate.kt */
/* loaded from: classes8.dex */
public final class amn implements JSONSerializable, JsonTemplate<wln> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        yln ylnVar = (yln) BuiltInParserKt.getBuiltInParserComponent().h4.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        ylnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "infinity");
        return jSONObject;
    }
}

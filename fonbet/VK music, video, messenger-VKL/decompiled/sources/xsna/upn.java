package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleSolidTemplate.kt */
/* loaded from: classes8.dex */
public final class upn implements JSONSerializable, JsonTemplate<qpn> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        spn spnVar = (spn) BuiltInParserKt.getBuiltInParserComponent().D7.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        spnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }
}

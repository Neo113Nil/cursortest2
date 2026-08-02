package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeTemplate.kt */
/* loaded from: classes8.dex */
public final class onn implements JSONSerializable, JsonTemplate<knn> {
    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        mnn mnnVar = (mnn) BuiltInParserKt.getBuiltInParserComponent().i5.getValue();
        ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
        mnnVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(builtInParsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}

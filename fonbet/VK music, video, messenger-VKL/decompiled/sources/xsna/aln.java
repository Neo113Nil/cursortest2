package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes8.dex */
public final class aln implements Serializer, Deserializer {
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new zkn((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "params"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        zkn zknVar = (zkn) obj;
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", zknVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "params", zknVar.b);
        return jSONObject;
    }
}

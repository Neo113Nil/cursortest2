package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes8.dex */
public final class wmn implements Serializer, Deserializer {
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new vmn((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height_variable_name"), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        vmn vmnVar = (vmn) obj;
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "height_variable_name", vmnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "width_variable_name", vmnVar.b);
        return jSONObject;
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes8.dex */
public final class kon implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public kon(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.yandex.div2.fe feVar = this.a;
        return new jon((com.yandex.div2.s3) JsonPropertyParser.read(parsingContext, jSONObject, "x", feVar.M2), (com.yandex.div2.s3) JsonPropertyParser.read(parsingContext, jSONObject, "y", feVar.M2));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        jon jonVar = (jon) obj;
        JSONObject jSONObject = new JSONObject();
        com.yandex.div2.s3 s3Var = jonVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "x", s3Var, feVar.M2);
        JsonPropertyParser.write(parsingContext, jSONObject, "y", jonVar.b, feVar.M2);
        return jSONObject;
    }
}

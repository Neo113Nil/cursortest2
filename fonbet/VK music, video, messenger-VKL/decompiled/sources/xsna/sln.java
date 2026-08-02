package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes8.dex */
public final class sln implements Serializer, Deserializer {
    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new rln((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        rln rlnVar = (rln) obj;
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", rlnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", rlnVar.b, (izs<DivEvaluableType, R>) DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAction;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes8.dex */
public final class qkn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public qkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.yandex.div2.fe feVar = this.a;
        return new pkn(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", feVar.k1), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", feVar.k1));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        pkn pknVar = (pkn) obj;
        JSONObject jSONObject = new JSONObject();
        List<DivAction> list = pknVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", list, feVar.k1);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", pknVar.b, feVar.k1);
        return jSONObject;
    }
}

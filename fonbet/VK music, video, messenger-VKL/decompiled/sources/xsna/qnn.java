package xsna;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class qnn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public qnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pnn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new pnn((com.yandex.div2.u7) JsonPropertyParser.read(parsingContext, jSONObject, "page_width", this.a.H5));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, pnn pnnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "page_width", pnnVar.a, this.a.H5);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }
}

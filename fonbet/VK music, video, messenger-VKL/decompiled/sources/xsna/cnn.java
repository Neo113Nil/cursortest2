package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class cnn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public cnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, enn ennVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "neighbour_page_width", ennVar.a, this.a.x3);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        enn ennVar = (enn) entityTemplate;
        return new enn(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), ennVar != null ? ennVar.a : null, this.a.x3));
    }
}

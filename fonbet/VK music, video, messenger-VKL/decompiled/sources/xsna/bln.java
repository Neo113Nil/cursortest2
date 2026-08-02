package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes8.dex */
public final class bln implements Serializer, TemplateDeserializer {
    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        dln dlnVar = (dln) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new dln(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, dlnVar != null ? dlnVar.a : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "params", allowPropertyOverride, dlnVar != null ? dlnVar.b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        dln dlnVar = (dln) obj;
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", dlnVar.a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "params", dlnVar.b);
        return jSONObject;
    }
}

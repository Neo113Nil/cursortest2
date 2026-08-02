package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes8.dex */
public final class xmn implements Serializer, TemplateDeserializer {
    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        zmn zmnVar = (zmn) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new zmn(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height_variable_name", allowPropertyOverride, zmnVar != null ? zmnVar.a : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width_variable_name", allowPropertyOverride, zmnVar != null ? zmnVar.b : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        zmn zmnVar = (zmn) obj;
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "height_variable_name", zmnVar.a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "width_variable_name", zmnVar.b);
        return jSONObject;
    }
}

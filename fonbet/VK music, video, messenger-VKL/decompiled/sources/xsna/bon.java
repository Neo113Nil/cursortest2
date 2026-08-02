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

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class bon implements Serializer, TemplateDeserializer {
    public static JSONObject a(ParsingContext parsingContext, don donVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", donVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        don donVar = (don) entityTemplate;
        return new don(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "raw_text_variable", parsingContext.getAllowPropertyOverride(), donVar != null ? donVar.a : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (don) obj);
    }
}

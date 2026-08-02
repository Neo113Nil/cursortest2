package xsna;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class mkn implements Serializer, TemplateDeserializer {
    public static okn a(ParsingContext parsingContext, okn oknVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new okn(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "locale", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, oknVar != null ? oknVar.a : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, oknVar != null ? oknVar.b : null));
    }

    public static JSONObject b(ParsingContext parsingContext, okn oknVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "locale", oknVar.a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", oknVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", InAppPurchaseMetaData.KEY_CURRENCY);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        return a(parsingContext, (okn) entityTemplate, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (okn) obj);
    }
}

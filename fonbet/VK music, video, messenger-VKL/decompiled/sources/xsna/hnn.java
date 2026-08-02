package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class hnn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public hnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jnn deserialize(ParsingContext parsingContext, jnn jnnVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new jnn(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, jnnVar != null ? jnnVar.a : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "insets", allowPropertyOverride, jnnVar != null ? jnnVar.b : null, this.a.F));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, jnn jnnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, jnnVar.a, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "insets", jnnVar.b, this.a.F);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}

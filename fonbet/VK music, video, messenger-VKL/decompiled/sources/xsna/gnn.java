package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class gnn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public gnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fnn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new fnn(JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (com.yandex.div2.b) JsonPropertyParser.read(parsingContext, jSONObject, "insets", this.a.E));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, fnn fnnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, fnnVar.a, ParsingConvertersKt.URI_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "insets", fnnVar.b, this.a.E);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}

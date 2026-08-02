package xsna;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class lkn implements Serializer, Deserializer {
    public static kkn a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new kkn(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "locale", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    public static JSONObject b(ParsingContext parsingContext, kkn kknVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "locale", kknVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", kknVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", InAppPurchaseMetaData.KEY_CURRENCY);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (kkn) obj);
    }
}

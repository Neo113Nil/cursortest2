package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class cpn implements Serializer, Deserializer {
    public static bpn a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new bpn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    public static JSONObject b(ParsingContext parsingContext, bpn bpnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", bpnVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (bpn) obj);
    }
}

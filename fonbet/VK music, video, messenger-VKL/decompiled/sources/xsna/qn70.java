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

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class qn70 implements Serializer, Deserializer {
    public static pn70 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new pn70(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name"));
    }

    public static JSONObject b(ParsingContext parsingContext, pn70 pn70Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", pn70Var.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", pn70Var.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (pn70) obj);
    }
}

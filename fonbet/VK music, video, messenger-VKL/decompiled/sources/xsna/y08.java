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

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class y08 implements Serializer, Deserializer {
    public static x08 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new x08(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name"));
    }

    public static JSONObject b(ParsingContext parsingContext, x08 x08Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", x08Var.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", x08Var.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (x08) obj);
    }
}

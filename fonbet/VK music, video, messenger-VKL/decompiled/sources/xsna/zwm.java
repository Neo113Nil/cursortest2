package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class zwm implements Serializer, Deserializer {
    public static ywm a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new ywm(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name"));
    }

    public static JSONObject b(ParsingContext parsingContext, ywm ywmVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", ywmVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", ywmVar.b);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (JSONObject) obj);
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return b(parsingContext, (ywm) obj);
    }
}

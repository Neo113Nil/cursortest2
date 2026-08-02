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

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class xhn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public xhn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final whn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new whn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING), (kqn) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.a.e9));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, whn whnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", whnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", whnVar.b, this.a.e9);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", whnVar.c);
        return jSONObject;
    }
}

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

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class sjn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public sjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rjn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new rjn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (kqn) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.a.e9));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, rjn rjnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "lifetime", rjnVar.a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", rjnVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", rjnVar.c, this.a.e9);
        return jSONObject;
    }
}

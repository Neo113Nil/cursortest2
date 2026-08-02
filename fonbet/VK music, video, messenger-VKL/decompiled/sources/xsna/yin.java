package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class yin implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public yin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xin deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new xin(JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper), (kqn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value", this.a.e9));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, xin xinVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", xinVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", xinVar.b, this.a.e9);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", xinVar.c);
        return jSONObject;
    }
}

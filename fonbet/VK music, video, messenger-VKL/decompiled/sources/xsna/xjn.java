package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class xjn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public xjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wjn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        return new wjn((kqn) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.a.e9), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, wjn wjnVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "set_variable");
        JsonPropertyParser.write(parsingContext, b, "value", wjnVar.a, this.a.e9);
        JsonExpressionParser.writeExpression(parsingContext, b, "variable_name", wjnVar.b);
        return b;
    }
}

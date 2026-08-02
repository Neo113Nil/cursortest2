package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class hl3 implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, gl3 gl3Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "array");
        JsonExpressionParser.writeExpression(parsingContext, b, "value", gl3Var.a);
        return b;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new gl3(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (gl3) obj);
    }
}

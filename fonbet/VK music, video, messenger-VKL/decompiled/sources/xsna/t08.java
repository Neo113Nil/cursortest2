package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: BoolValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class t08 implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, s08 s08Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "boolean");
        JsonExpressionParser.writeExpression(parsingContext, b, "value", s08Var.a);
        return b;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new s08(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (s08) obj);
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: UrlValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class lfq0 implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, kfq0 kfq0Var) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "url");
        JsonExpressionParser.writeExpression(parsingContext, b, "value", kfq0Var.a, ParsingConvertersKt.URI_TO_STRING);
        return b;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new kfq0(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (kfq0) obj);
    }
}

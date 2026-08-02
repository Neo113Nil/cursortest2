package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class uwm implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, twm twmVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "dict");
        JsonExpressionParser.writeExpression(parsingContext, b, "value", twmVar.a);
        return b;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new twm(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (twm) obj);
    }
}

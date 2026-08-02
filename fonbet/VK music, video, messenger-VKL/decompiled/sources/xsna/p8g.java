package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class p8g implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, o8g o8gVar) throws ParsingException {
        JSONObject b = lr.b(parsingContext, "type", "color");
        JsonExpressionParser.writeExpression(parsingContext, b, "value", o8gVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return b;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new o8g(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (o8g) obj);
    }
}

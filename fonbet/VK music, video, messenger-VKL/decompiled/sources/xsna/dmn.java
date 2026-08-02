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
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes8.dex */
public final class dmn implements Serializer, Deserializer {
    public static JSONObject a(ParsingContext parsingContext, cmn cmnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, cmnVar.a);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        return new cmn(JsonExpressionParser.readExpression(parsingContext, (JSONObject) obj, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
        return a(parsingContext, (cmn) obj);
    }
}

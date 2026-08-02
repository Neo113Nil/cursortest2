package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class lrn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public lrn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final krn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        com.yandex.div2.fe feVar = this.a;
        return new krn(readOptionalExpression, (com.yandex.div2.aa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", feVar.V6), (com.yandex.div2.aa) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", feVar.V6));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, krn krnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "constrained", krnVar.a);
        com.yandex.div2.aa aaVar = krnVar.b;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "max_size", aaVar, feVar.V6);
        JsonPropertyParser.write(parsingContext, jSONObject, "min_size", krnVar.c, feVar.V6);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}

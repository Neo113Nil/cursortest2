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

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class won implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public won(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final von deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        com.yandex.div2.fe feVar = this.a;
        return new von(readExpression, (com.yandex.div2.q9) JsonPropertyParser.read(parsingContext, jSONObject, "shape", feVar.S6), (com.yandex.div2.va) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", feVar.I7));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, von vonVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", vonVar.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        com.yandex.div2.q9 q9Var = vonVar.b;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.write(parsingContext, jSONObject, "shape", q9Var, feVar.S6);
        JsonPropertyParser.write(parsingContext, jSONObject, "stroke", vonVar.c, feVar.I7);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivAction;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes8.dex */
public final class djn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public djn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjn deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
        com.yandex.div2.fe feVar = this.a;
        return new cjn(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", feVar.k1), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", feVar.k1), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, cjn cjnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        List<DivAction> list = cjnVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", list, feVar.k1);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", cjnVar.b, feVar.k1);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "download");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", cjnVar.c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}

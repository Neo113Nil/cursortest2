package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.oin;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes8.dex */
public final class pin implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public pin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, oin oinVar) throws ParsingException {
        boolean z = oinVar instanceof oin.a;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            flj fljVar = (flj) feVar.s.getValue();
            elj eljVar = ((oin.a) oinVar).b;
            fljVar.getClass();
            return flj.a(parsingContext, eljVar);
        }
        if (!(oinVar instanceof oin.b)) {
            throw new NoWhenBranchMatchedException();
        }
        plj pljVar = (plj) feVar.v.getValue();
        olj oljVar = ((oin.b) oinVar).b;
        pljVar.getClass();
        return plj.a(parsingContext, oljVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "text");
        com.yandex.div2.fe feVar = this.a;
        if (f) {
            ((flj) feVar.s.getValue()).getClass();
            return new oin.a(new elj(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (epx.f(readString, "url")) {
            ((plj) feVar.v.getValue()).getClass();
            return new oin.b(new olj(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI)));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        sin sinVar = orThrow instanceof sin ? (sin) orThrow : null;
        if (sinVar != null) {
            return ((rin) feVar.e0.getValue()).resolve(parsingContext, sinVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}

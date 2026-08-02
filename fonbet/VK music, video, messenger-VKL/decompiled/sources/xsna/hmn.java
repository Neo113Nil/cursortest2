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
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.bmn;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class hmn implements Serializer, Deserializer {
    public final com.yandex.div2.fe a;

    public hmn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, bmn bmnVar) throws ParsingException {
        boolean z = bmnVar instanceof bmn.b;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            lmn lmnVar = (lmn) feVar.m4.getValue();
            kmn kmnVar = ((bmn.b) bmnVar).b;
            lmnVar.getClass();
            return lmn.a(parsingContext, kmnVar);
        }
        if (!(bmnVar instanceof bmn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        dmn dmnVar = (dmn) feVar.j4.getValue();
        cmn cmnVar = ((bmn.a) bmnVar).b;
        dmnVar.getClass();
        return dmn.a(parsingContext, cmnVar);
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        boolean f = epx.f(readString, "regex");
        com.yandex.div2.fe feVar = this.a;
        if (f) {
            ((lmn) feVar.m4.getValue()).getClass();
            return new bmn.b(new kmn(JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (epx.f(readString, "expression")) {
            ((dmn) feVar.j4.getValue()).getClass();
            return new bmn.a(new cmn(JsonExpressionParser.readExpression(parsingContext, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN)));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        pmn pmnVar = orThrow instanceof pmn ? (pmn) orThrow : null;
        if (pmnVar != null) {
            return ((jmn) feVar.r4.getValue()).resolve(parsingContext, pmnVar, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }
}

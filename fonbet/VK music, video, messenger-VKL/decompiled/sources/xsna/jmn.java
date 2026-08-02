package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.bmn;
import xsna.pmn;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class jmn implements TemplateResolver<JSONObject, pmn, bmn> {
    public final com.yandex.div2.fe a;

    public jmn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmn resolve(ParsingContext parsingContext, pmn pmnVar, JSONObject jSONObject) throws ParsingException {
        boolean z = pmnVar instanceof pmn.b;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            nmn nmnVar = (nmn) feVar.o4.getValue();
            omn omnVar = ((pmn.b) pmnVar).a;
            nmnVar.getClass();
            return new bmn.b(new kmn(JsonFieldResolver.resolveExpression(parsingContext, omnVar.a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (!(pmnVar instanceof pmn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        fmn fmnVar = (fmn) feVar.l4.getValue();
        gmn gmnVar = ((pmn.a) pmnVar).a;
        fmnVar.getClass();
        return new bmn.a(new cmn(JsonFieldResolver.resolveExpression(parsingContext, gmnVar.a, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN)));
    }
}

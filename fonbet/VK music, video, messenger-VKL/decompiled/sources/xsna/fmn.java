package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes8.dex */
public final class fmn implements TemplateResolver<JSONObject, gmn, cmn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final cmn resolve(ParsingContext parsingContext, gmn gmnVar, JSONObject jSONObject) {
        return new cmn(JsonFieldResolver.resolveExpression(parsingContext, gmnVar.a, jSONObject, BatchApiRequest.FIELD_NAME_CONDITION, TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}

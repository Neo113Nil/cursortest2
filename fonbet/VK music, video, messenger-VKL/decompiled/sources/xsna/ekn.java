package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes8.dex */
public final class ekn implements TemplateResolver<JSONObject, fkn, bkn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final bkn resolve(ParsingContext parsingContext, fkn fknVar, JSONObject jSONObject) {
        fkn fknVar2 = fknVar;
        JSONObject jSONObject2 = jSONObject;
        return new bkn(JsonFieldResolver.resolveExpression(parsingContext, fknVar2.a, jSONObject2, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, fknVar2.b, jSONObject2, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}

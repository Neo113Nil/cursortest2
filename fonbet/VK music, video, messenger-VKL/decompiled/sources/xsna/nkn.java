package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class nkn implements TemplateResolver<JSONObject, okn, kkn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final kkn resolve(ParsingContext parsingContext, okn oknVar, JSONObject jSONObject) {
        okn oknVar2 = oknVar;
        JSONObject jSONObject2 = jSONObject;
        return new kkn(JsonFieldResolver.resolveOptionalExpression(parsingContext, oknVar2.a, jSONObject2, "locale", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, oknVar2.b, jSONObject2, "raw_text_variable"));
    }
}

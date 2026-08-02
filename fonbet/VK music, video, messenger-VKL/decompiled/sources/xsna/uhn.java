package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class uhn implements TemplateResolver<JSONObject, vhn, rhn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final rhn resolve(ParsingContext parsingContext, vhn vhnVar, JSONObject jSONObject) {
        vhn vhnVar2 = vhnVar;
        JSONObject jSONObject2 = jSONObject;
        return new rhn(JsonFieldResolver.resolveExpression(parsingContext, vhnVar2.a, jSONObject2, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, vhnVar2.b, jSONObject2, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

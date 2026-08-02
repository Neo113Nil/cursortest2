package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: StrVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class eom0 implements TemplateResolver<JSONObject, fom0, bom0> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final bom0 resolve(ParsingContext parsingContext, fom0 fom0Var, JSONObject jSONObject) {
        fom0 fom0Var2 = fom0Var;
        JSONObject jSONObject2 = jSONObject;
        return new bom0(JsonFieldResolver.resolveExpression(parsingContext, fom0Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, fom0Var2.a, jSONObject2, "name"));
    }
}

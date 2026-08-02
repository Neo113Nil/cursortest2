package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class ol3 implements TemplateResolver<JSONObject, pl3, ll3> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final ll3 resolve(ParsingContext parsingContext, pl3 pl3Var, JSONObject jSONObject) {
        pl3 pl3Var2 = pl3Var;
        JSONObject jSONObject2 = jSONObject;
        return new ll3(JsonFieldResolver.resolveExpression(parsingContext, pl3Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY), (String) JsonFieldResolver.resolve(parsingContext, pl3Var2.a, jSONObject2, "name"));
    }
}

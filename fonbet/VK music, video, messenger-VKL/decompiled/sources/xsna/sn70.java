package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class sn70 implements TemplateResolver<JSONObject, tn70, pn70> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final pn70 resolve(ParsingContext parsingContext, tn70 tn70Var, JSONObject jSONObject) {
        tn70 tn70Var2 = tn70Var;
        JSONObject jSONObject2 = jSONObject;
        return new pn70(JsonFieldResolver.resolveExpression(parsingContext, tn70Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE), (String) JsonFieldResolver.resolve(parsingContext, tn70Var2.a, jSONObject2, "name"));
    }
}

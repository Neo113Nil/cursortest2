package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class a18 implements TemplateResolver<JSONObject, b18, x08> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final x08 resolve(ParsingContext parsingContext, b18 b18Var, JSONObject jSONObject) {
        b18 b18Var2 = b18Var;
        JSONObject jSONObject2 = jSONObject;
        return new x08(JsonFieldResolver.resolveExpression(parsingContext, b18Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (String) JsonFieldResolver.resolve(parsingContext, b18Var2.a, jSONObject2, "name"));
    }
}

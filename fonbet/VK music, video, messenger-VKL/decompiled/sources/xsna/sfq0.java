package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class sfq0 implements TemplateResolver<JSONObject, tfq0, pfq0> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final pfq0 resolve(ParsingContext parsingContext, tfq0 tfq0Var, JSONObject jSONObject) {
        tfq0 tfq0Var2 = tfq0Var;
        JSONObject jSONObject2 = jSONObject;
        return new pfq0(JsonFieldResolver.resolveExpression(parsingContext, tfq0Var2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (String) JsonFieldResolver.resolve(parsingContext, tfq0Var2.a, jSONObject2, "name"));
    }
}

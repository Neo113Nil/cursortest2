package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class jl3 implements TemplateResolver<JSONObject, kl3, gl3> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final gl3 resolve(ParsingContext parsingContext, kl3 kl3Var, JSONObject jSONObject) {
        return new gl3(JsonFieldResolver.resolveExpression(parsingContext, kl3Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}

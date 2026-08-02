package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class znm0 implements TemplateResolver<JSONObject, aom0, wnm0> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final wnm0 resolve(ParsingContext parsingContext, aom0 aom0Var, JSONObject jSONObject) {
        return new wnm0(JsonFieldResolver.resolveExpression(parsingContext, aom0Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

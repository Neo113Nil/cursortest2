package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: BoolValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class v08 implements TemplateResolver<JSONObject, w08, s08> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final s08 resolve(ParsingContext parsingContext, w08 w08Var, JSONObject jSONObject) {
        return new s08(JsonFieldResolver.resolveExpression(parsingContext, w08Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: NumberValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class nn70 implements TemplateResolver<JSONObject, on70, kn70> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final kn70 resolve(ParsingContext parsingContext, on70 on70Var, JSONObject jSONObject) {
        return new kn70(JsonFieldResolver.resolveExpression(parsingContext, on70Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}

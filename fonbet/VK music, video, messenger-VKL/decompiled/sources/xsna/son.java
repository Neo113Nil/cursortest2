package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* loaded from: classes8.dex */
public final class son implements TemplateResolver<JSONObject, ton, pon> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final pon resolve(ParsingContext parsingContext, ton tonVar, JSONObject jSONObject) {
        return new pon(JsonFieldResolver.resolveExpression(parsingContext, tonVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}

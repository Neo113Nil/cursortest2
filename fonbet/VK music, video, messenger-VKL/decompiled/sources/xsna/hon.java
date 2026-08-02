package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* loaded from: classes8.dex */
public final class hon implements TemplateResolver<JSONObject, ion, eon> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final eon resolve(ParsingContext parsingContext, ion ionVar, JSONObject jSONObject) {
        return new eon(JsonFieldResolver.resolveExpression(parsingContext, ionVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}

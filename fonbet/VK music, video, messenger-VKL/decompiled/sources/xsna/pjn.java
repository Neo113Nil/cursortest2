package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* loaded from: classes8.dex */
public final class pjn implements TemplateResolver<JSONObject, qjn, mjn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final mjn resolve(ParsingContext parsingContext, qjn qjnVar, JSONObject jSONObject) {
        return new mjn(JsonFieldResolver.resolveExpression(parsingContext, qjnVar.a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

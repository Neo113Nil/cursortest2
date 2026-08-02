package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ContentUrlJsonParser.kt */
/* loaded from: classes8.dex */
public final class rlj implements TemplateResolver<JSONObject, slj, olj> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final olj resolve(ParsingContext parsingContext, slj sljVar, JSONObject jSONObject) {
        return new olj(JsonFieldResolver.resolveExpression(parsingContext, sljVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}

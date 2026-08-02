package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ContentTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class hlj implements TemplateResolver<JSONObject, ilj, elj> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final elj resolve(ParsingContext parsingContext, ilj iljVar, JSONObject jSONObject) {
        return new elj(JsonFieldResolver.resolveExpression(parsingContext, iljVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class r8g implements TemplateResolver<JSONObject, s8g, o8g> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final o8g resolve(ParsingContext parsingContext, s8g s8gVar, JSONObject jSONObject) {
        return new o8g(JsonFieldResolver.resolveExpression(parsingContext, s8gVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class w8g implements TemplateResolver<JSONObject, x8g, t8g> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final t8g resolve(ParsingContext parsingContext, x8g x8gVar, JSONObject jSONObject) {
        x8g x8gVar2 = x8gVar;
        JSONObject jSONObject2 = jSONObject;
        return new t8g(JsonFieldResolver.resolveExpression(parsingContext, x8gVar2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (String) JsonFieldResolver.resolve(parsingContext, x8gVar2.a, jSONObject2, "name"));
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class wwm implements TemplateResolver<JSONObject, xwm, twm> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final twm resolve(ParsingContext parsingContext, xwm xwmVar, JSONObject jSONObject) {
        return new twm(JsonFieldResolver.resolveExpression(parsingContext, xwmVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}

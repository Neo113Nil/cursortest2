package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class bxm implements TemplateResolver<JSONObject, cxm, ywm> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final ywm resolve(ParsingContext parsingContext, cxm cxmVar, JSONObject jSONObject) {
        cxm cxmVar2 = cxmVar;
        JSONObject jSONObject2 = jSONObject;
        return new ywm(JsonFieldResolver.resolveExpression(parsingContext, cxmVar2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_DICT), (String) JsonFieldResolver.resolve(parsingContext, cxmVar2.a, jSONObject2, "name"));
    }
}

package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes8.dex */
public final class uln implements TemplateResolver<JSONObject, vln, rln> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final rln resolve(ParsingContext parsingContext, vln vlnVar, JSONObject jSONObject) {
        vln vlnVar2 = vlnVar;
        JSONObject jSONObject2 = jSONObject;
        return new rln((String) JsonFieldResolver.resolve(parsingContext, vlnVar2.a, jSONObject2, "name"), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, vlnVar2.b, jSONObject2, "type", DivEvaluableType.FROM_STRING));
    }
}

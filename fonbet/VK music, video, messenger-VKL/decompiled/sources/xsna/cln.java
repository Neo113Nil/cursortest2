package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes8.dex */
public final class cln implements TemplateResolver<JSONObject, dln, zkn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final zkn resolve(ParsingContext parsingContext, dln dlnVar, JSONObject jSONObject) {
        dln dlnVar2 = dlnVar;
        JSONObject jSONObject2 = jSONObject;
        return new zkn((String) JsonFieldResolver.resolve(parsingContext, dlnVar2.a, jSONObject2, "id"), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, dlnVar2.b, jSONObject2, "params"));
    }
}

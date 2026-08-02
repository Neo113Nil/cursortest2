package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes8.dex */
public final class ymn implements TemplateResolver<JSONObject, zmn, vmn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final vmn resolve(ParsingContext parsingContext, zmn zmnVar, JSONObject jSONObject) {
        zmn zmnVar2 = zmnVar;
        JSONObject jSONObject2 = jSONObject;
        return new vmn((String) JsonFieldResolver.resolveOptional(parsingContext, zmnVar2.a, jSONObject2, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(parsingContext, zmnVar2.b, jSONObject2, "width_variable_name"));
    }
}

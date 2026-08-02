package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* loaded from: classes8.dex */
public final class khn implements TemplateResolver<JSONObject, lhn, hhn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final hhn resolve(ParsingContext parsingContext, lhn lhnVar, JSONObject jSONObject) {
        return new hhn((String) JsonFieldResolver.resolve(parsingContext, lhnVar.a, jSONObject, "animator_id"));
    }
}

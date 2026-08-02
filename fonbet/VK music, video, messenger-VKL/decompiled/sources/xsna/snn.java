package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class snn implements TemplateResolver<JSONObject, tnn, pnn> {
    public final com.yandex.div2.fe a;

    public snn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final pnn resolve(ParsingContext parsingContext, tnn tnnVar, JSONObject jSONObject) {
        Field<com.yandex.div2.w7> field = tnnVar.a;
        com.yandex.div2.fe feVar = this.a;
        return new pnn((com.yandex.div2.u7) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "page_width", feVar.J5, feVar.H5));
    }
}

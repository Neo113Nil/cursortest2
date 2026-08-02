package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class dnn implements TemplateResolver<JSONObject, enn, ann> {
    public final com.yandex.div2.fe a;

    public dnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final ann resolve(ParsingContext parsingContext, enn ennVar, JSONObject jSONObject) {
        Field<com.yandex.div2.s4> field = ennVar.a;
        com.yandex.div2.fe feVar = this.a;
        return new ann((com.yandex.div2.q4) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "neighbour_page_width", feVar.y3, feVar.w3));
    }
}

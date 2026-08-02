package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.unn;
import xsna.ynn;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class xnn implements TemplateResolver<JSONObject, ynn, unn> {
    public final com.yandex.div2.fe a;

    public xnn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final unn resolve(ParsingContext parsingContext, ynn ynnVar, JSONObject jSONObject) throws ParsingException {
        boolean z = ynnVar instanceof ynn.c;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            snn snnVar = (snn) feVar.m5.getValue();
            tnn tnnVar = ((ynn.c) ynnVar).a;
            snnVar.getClass();
            Field<com.yandex.div2.w7> field = tnnVar.a;
            com.yandex.div2.fe feVar2 = snnVar.a;
            return new unn.c(new pnn((com.yandex.div2.u7) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "page_width", feVar2.J5, feVar2.H5)));
        }
        if (ynnVar instanceof ynn.a) {
            dnn dnnVar = (dnn) feVar.a5.getValue();
            enn ennVar = ((ynn.a) ynnVar).a;
            dnnVar.getClass();
            Field<com.yandex.div2.s4> field2 = ennVar.a;
            com.yandex.div2.fe feVar3 = dnnVar.a;
            return new unn.a(new ann((com.yandex.div2.q4) JsonFieldResolver.resolve(parsingContext, field2, jSONObject, "neighbour_page_width", feVar3.y3, feVar3.w3)));
        }
        if (!(ynnVar instanceof ynn.b)) {
            throw new NoWhenBranchMatchedException();
        }
        nnn nnnVar = (nnn) feVar.j5.getValue();
        onn onnVar = ((ynn.b) ynnVar).a;
        nnnVar.getClass();
        return new unn.b(new knn());
    }
}

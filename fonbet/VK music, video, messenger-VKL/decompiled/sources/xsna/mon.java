package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes8.dex */
public final class mon implements TemplateResolver<JSONObject, non, jon> {
    public final com.yandex.div2.fe a;

    public mon(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final jon resolve(ParsingContext parsingContext, non nonVar, JSONObject jSONObject) {
        non nonVar2 = nonVar;
        JSONObject jSONObject2 = jSONObject;
        Field<com.yandex.div2.u3> field = nonVar2.a;
        com.yandex.div2.fe feVar = this.a;
        bpn0 bpn0Var = feVar.O2;
        bpn0 bpn0Var2 = feVar.M2;
        return new jon((com.yandex.div2.s3) JsonFieldResolver.resolve(parsingContext, field, jSONObject2, "x", bpn0Var, bpn0Var2), (com.yandex.div2.s3) JsonFieldResolver.resolve(parsingContext, nonVar2.b, jSONObject2, "y", feVar.O2, bpn0Var2));
    }
}

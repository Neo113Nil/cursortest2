package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import org.json.JSONObject;
import xsna.jln;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class mln implements TemplateResolver<JSONObject, qln, jln> {
    public final com.yandex.div2.fe a;

    public mln(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final jln resolve(ParsingContext parsingContext, qln qlnVar, JSONObject jSONObject) {
        qln qlnVar2 = qlnVar;
        JSONObject jSONObject2 = jSONObject;
        Field<List<com.yandex.div2.q1>> field = qlnVar2.a;
        com.yandex.div2.fe feVar = this.a;
        List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, L2.g, feVar.H1, feVar.F1);
        com.yandex.div2.u1 u1Var = (com.yandex.div2.u1) JsonFieldResolver.resolveOptional(parsingContext, qlnVar2.b, jSONObject2, "border", feVar.N1, feVar.L1);
        jln.a aVar = (jln.a) JsonFieldResolver.resolveOptional(parsingContext, qlnVar2.c, jSONObject2, "next_focus_ids", feVar.E3, feVar.C3);
        Field<List<com.yandex.div2.h0>> field2 = qlnVar2.d;
        bpn0 bpn0Var = feVar.m1;
        bpn0 bpn0Var2 = feVar.k1;
        return new jln(resolveOptionalList, u1Var, aVar, JsonFieldResolver.resolveOptionalList(parsingContext, field2, jSONObject2, "on_blur", bpn0Var, bpn0Var2), JsonFieldResolver.resolveOptionalList(parsingContext, qlnVar2.e, jSONObject2, "on_focus", bpn0Var, bpn0Var2));
    }
}

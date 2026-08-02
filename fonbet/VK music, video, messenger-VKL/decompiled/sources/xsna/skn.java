package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes8.dex */
public final class skn implements TemplateResolver<JSONObject, tkn, pkn> {
    public final com.yandex.div2.fe a;

    public skn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final pkn resolve(ParsingContext parsingContext, tkn tknVar, JSONObject jSONObject) {
        tkn tknVar2 = tknVar;
        JSONObject jSONObject2 = jSONObject;
        Field<List<com.yandex.div2.h0>> field = tknVar2.a;
        com.yandex.div2.fe feVar = this.a;
        bpn0 bpn0Var = feVar.m1;
        bpn0 bpn0Var2 = feVar.k1;
        return new pkn(JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "on_fail_actions", bpn0Var, bpn0Var2), JsonFieldResolver.resolveOptionalList(parsingContext, tknVar2.b, jSONObject2, "on_success_actions", feVar.m1, bpn0Var2));
    }
}

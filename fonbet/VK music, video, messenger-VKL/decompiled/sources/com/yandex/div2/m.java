package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.h0;
import org.json.JSONObject;
import xsna.bpn0;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class m implements TemplateResolver<JSONObject, h0.a, DivAction.a> {
    public final fe a;

    public m(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivAction.a resolve(ParsingContext parsingContext, h0.a aVar, JSONObject jSONObject) {
        h0.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<h0> field = aVar2.a;
        fe feVar = this.a;
        bpn0 bpn0Var = feVar.m1;
        bpn0 bpn0Var2 = feVar.k1;
        return new DivAction.a((DivAction) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "action", bpn0Var, bpn0Var2), JsonFieldResolver.resolveOptionalList(parsingContext, aVar2.b, jSONObject2, "actions", feVar.m1, bpn0Var2), JsonFieldResolver.resolveExpression(parsingContext, aVar2.c, jSONObject2, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

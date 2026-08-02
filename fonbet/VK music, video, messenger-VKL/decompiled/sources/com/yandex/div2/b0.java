package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class b0 implements TemplateResolver<JSONObject, g0, DivActionSubmit> {
    public final fe a;

    public b0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DivActionSubmit resolve(ParsingContext parsingContext, g0 g0Var, JSONObject jSONObject) throws ParsingException {
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, g0Var.a, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        Field<List<h0>> field = g0Var.b;
        fe feVar = this.a;
        return new DivActionSubmit(resolveExpression, JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "on_fail_actions", feVar.m1, feVar.k1), JsonFieldResolver.resolveOptionalList(parsingContext, g0Var.c, jSONObject, "on_success_actions", feVar.m1, feVar.k1), (DivActionSubmit.Request) JsonFieldResolver.resolve(parsingContext, g0Var.d, jSONObject, "request", feVar.U0, feVar.S0));
    }
}

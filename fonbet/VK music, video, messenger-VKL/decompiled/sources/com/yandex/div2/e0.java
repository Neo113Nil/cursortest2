package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.g0;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class e0 implements TemplateResolver<JSONObject, g0.a.C2113a, DivActionSubmit.Request.a> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivActionSubmit.Request.a resolve(ParsingContext parsingContext, g0.a.C2113a c2113a, JSONObject jSONObject) {
        g0.a.C2113a c2113a2 = c2113a;
        JSONObject jSONObject2 = jSONObject;
        Field<Expression<String>> field = c2113a2.a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.a(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject2, "name", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, c2113a2.b, jSONObject2, "value", typeHelper));
    }
}

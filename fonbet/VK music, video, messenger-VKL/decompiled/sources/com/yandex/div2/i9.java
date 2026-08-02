package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.e9;
import com.yandex.div2.j9;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes8.dex */
public final class i9 implements TemplateResolver<JSONObject, j9.a, e9.a> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final e9.a resolve(ParsingContext parsingContext, j9.a aVar, JSONObject jSONObject) {
        j9.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<Expression<String>> field = aVar2.a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new e9.a(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "text", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, aVar2.b, jSONObject2, "value", typeHelper));
    }
}

package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInput;
import com.yandex.div2.a6;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes8.dex */
public final class z5 implements TemplateResolver<JSONObject, a6.a, DivInput.a> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivInput.a resolve(ParsingContext parsingContext, a6.a aVar, JSONObject jSONObject) {
        return new DivInput.a(JsonFieldResolver.resolveExpression(parsingContext, aVar.a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}

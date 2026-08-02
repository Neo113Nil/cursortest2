package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.wc;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class qb implements TemplateResolver<JSONObject, wc.a, DivText.a> {
    public final fe a;

    public qb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivText.a resolve(ParsingContext parsingContext, wc.a aVar, JSONObject jSONObject) {
        wc.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<List<h0>> field = aVar2.a;
        fe feVar = this.a;
        return new DivText.a(JsonFieldResolver.resolveExpression(parsingContext, aVar2.d, jSONObject2, "text", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "actions", feVar.m1, feVar.k1), JsonFieldResolver.resolveOptionalList(parsingContext, aVar2.b, jSONObject2, "images", feVar.C8, feVar.A8), JsonFieldResolver.resolveOptionalList(parsingContext, aVar2.c, jSONObject2, "ranges", feVar.z8, feVar.x8));
    }
}

package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatch;
import com.yandex.div2.t7;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes8.dex */
public final class r7 implements TemplateResolver<JSONObject, t7.a, DivPatch.a> {
    public final fe a;

    public r7(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivPatch.a resolve(ParsingContext parsingContext, t7.a aVar, JSONObject jSONObject) {
        t7.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        String str = (String) JsonFieldResolver.resolve(parsingContext, aVar2.a, jSONObject2, "id");
        Field<List<nb>> field = aVar2.b;
        fe feVar = this.a;
        return new DivPatch.a(str, JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "items", feVar.B9, feVar.z9));
    }
}

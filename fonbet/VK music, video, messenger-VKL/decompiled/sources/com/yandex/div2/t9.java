package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.j2;
import com.yandex.div2.q9;
import com.yandex.div2.u9;
import com.yandex.div2.z8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes8.dex */
public final class t9 implements TemplateResolver<JSONObject, u9, q9> {
    public final fe a;

    public t9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q9 resolve(ParsingContext parsingContext, u9 u9Var, JSONObject jSONObject) throws ParsingException {
        boolean z = u9Var instanceof u9.b;
        fe feVar = this.a;
        if (z) {
            return new q9.b(((z8.c) feVar.w6.getValue()).resolve(parsingContext, ((u9.b) u9Var).a, jSONObject));
        }
        if (u9Var instanceof u9.a) {
            return new q9.a(((j2.c) feVar.Z1.getValue()).resolve(parsingContext, ((u9.a) u9Var).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

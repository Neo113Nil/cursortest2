package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.c7;
import com.yandex.div2.h7;
import com.yandex.div2.k7;
import com.yandex.div2.m7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes8.dex */
public final class f7 implements TemplateResolver<JSONObject, m7, c7> {
    public final fe a;

    public f7(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c7 resolve(ParsingContext parsingContext, m7 m7Var, JSONObject jSONObject) throws ParsingException {
        boolean z = m7Var instanceof m7.b;
        fe feVar = this.a;
        if (z) {
            k7.d dVar = (k7.d) feVar.s5.getValue();
            l7 l7Var = ((m7.b) m7Var).a;
            dVar.getClass();
            return new c7.b(k7.d.a(parsingContext, l7Var, jSONObject));
        }
        if (!(m7Var instanceof m7.a)) {
            throw new NoWhenBranchMatchedException();
        }
        h7.d dVar2 = (h7.d) feVar.p5.getValue();
        i7 i7Var = ((m7.a) m7Var).a;
        dVar2.getClass();
        return new c7.a(h7.d.a(parsingContext, i7Var, jSONObject));
    }
}

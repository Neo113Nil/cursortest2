package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.b6;
import com.yandex.div2.g6;
import com.yandex.div2.m6;
import com.yandex.div2.o6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class k6 implements TemplateResolver<JSONObject, o6, b6> {
    public final fe a;

    public k6(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b6 resolve(ParsingContext parsingContext, o6 o6Var, JSONObject jSONObject) throws ParsingException {
        boolean z = o6Var instanceof o6.b;
        fe feVar = this.a;
        if (z) {
            m6.c cVar = (m6.c) feVar.C4.getValue();
            n6 n6Var = ((o6.b) o6Var).a;
            cVar.getClass();
            return new b6.b(m6.c.a(parsingContext, n6Var, jSONObject));
        }
        if (!(o6Var instanceof o6.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g6.c cVar2 = (g6.c) feVar.z4.getValue();
        h6 h6Var = ((o6.a) o6Var).a;
        cVar2.getClass();
        return new b6.a(g6.c.a(parsingContext, h6Var, jSONObject));
    }
}

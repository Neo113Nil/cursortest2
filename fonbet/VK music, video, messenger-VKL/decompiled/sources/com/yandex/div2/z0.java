package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.a1;
import com.yandex.div2.a7;
import com.yandex.div2.t2;
import com.yandex.div2.w0;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class z0 implements TemplateResolver<JSONObject, a1, w0> {
    public final fe a;

    public z0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w0 resolve(ParsingContext parsingContext, a1 a1Var, JSONObject jSONObject) throws ParsingException {
        boolean z = a1Var instanceof a1.a;
        fe feVar = this.a;
        if (z) {
            return new w0.a(((t2.e) feVar.l2.getValue()).resolve(parsingContext, ((a1.a) a1Var).a, jSONObject));
        }
        if (a1Var instanceof a1.b) {
            return new w0.b(((a7.e) feVar.g5.getValue()).resolve(parsingContext, ((a1.b) a1Var).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.r4;
import com.yandex.div2.v9;
import com.yandex.div2.x6;
import com.yandex.div2.z9;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.nrn;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class y9 implements TemplateResolver<JSONObject, z9, v9> {
    public final fe a;

    public y9(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v9 resolve(ParsingContext parsingContext, z9 z9Var, JSONObject jSONObject) throws ParsingException {
        boolean z = z9Var instanceof z9.a;
        fe feVar = this.a;
        if (z) {
            r4.d dVar = (r4.d) feVar.y3.getValue();
            s4 s4Var = ((z9.a) z9Var).a;
            dVar.getClass();
            return new v9.a(r4.d.a(parsingContext, s4Var, jSONObject));
        }
        if (z9Var instanceof z9.b) {
            return new v9.b(((x6.c) feVar.X4.getValue()).resolve(parsingContext, ((z9.b) z9Var).a, jSONObject));
        }
        if (z9Var instanceof z9.c) {
            return new v9.c(((nrn) feVar.y9.getValue()).resolve(parsingContext, ((z9.c) z9Var).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

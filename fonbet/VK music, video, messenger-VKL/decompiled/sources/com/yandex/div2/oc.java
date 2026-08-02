package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ic;
import com.yandex.div2.qc;
import com.yandex.div2.tc;
import com.yandex.div2.vc;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class oc implements TemplateResolver<JSONObject, vc, ic> {
    public final fe a;

    public oc(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ic resolve(ParsingContext parsingContext, vc vcVar, JSONObject jSONObject) throws ParsingException {
        boolean z = vcVar instanceof vc.a;
        fe feVar = this.a;
        if (z) {
            return new ic.a(((qc.c) feVar.n8.getValue()).resolve(parsingContext, ((vc.a) vcVar).a, jSONObject));
        }
        if (!(vcVar instanceof vc.b)) {
            throw new NoWhenBranchMatchedException();
        }
        tc.c cVar = (tc.c) feVar.q8.getValue();
        uc ucVar = ((vc.b) vcVar).a;
        cVar.getClass();
        return new ic.b(tc.c.a(parsingContext, ucVar, jSONObject));
    }
}

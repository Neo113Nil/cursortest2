package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.de;
import com.yandex.div2.he;
import com.yandex.div2.p;
import com.yandex.div2.t;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.aqk0;
import xsna.bqk0;
import xsna.lkp;
import xsna.okp;
import xsna.pkp;
import xsna.xpk0;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public final class s implements TemplateResolver<JSONObject, t, p> {
    public final fe a;

    public s(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p resolve(ParsingContext parsingContext, t tVar, JSONObject jSONObject) throws ParsingException {
        boolean z = tVar instanceof t.c;
        fe feVar = this.a;
        if (z) {
            he.c cVar = (he.c) feVar.W9.getValue();
            ie ieVar = ((t.c) tVar).a;
            cVar.getClass();
            return new p.c(new ge(JsonFieldResolver.resolveExpression(parsingContext, ieVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, he.a)));
        }
        if (tVar instanceof t.b) {
            de.c cVar2 = (de.c) feVar.H9.getValue();
            ee eeVar = ((t.b) tVar).a;
            cVar2.getClass();
            return new p.b(new ce(JsonFieldResolver.resolveExpression(parsingContext, eeVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, de.a)));
        }
        if (tVar instanceof t.d) {
            aqk0 aqk0Var = (aqk0) feVar.ca.getValue();
            bqk0 bqk0Var = ((t.d) tVar).a;
            aqk0Var.getClass();
            return new p.d(new xpk0());
        }
        if (!(tVar instanceof t.a)) {
            throw new NoWhenBranchMatchedException();
        }
        okp okpVar = (okp) feVar.E9.getValue();
        pkp pkpVar = ((t.a) tVar).a;
        okpVar.getClass();
        return new p.a(new lkp());
    }
}

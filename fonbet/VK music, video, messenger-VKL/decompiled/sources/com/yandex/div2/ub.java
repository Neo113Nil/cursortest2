package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.p8;
import com.yandex.div2.rb;
import com.yandex.div2.u6;
import com.yandex.div2.vb;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class ub implements TemplateResolver<JSONObject, vb, rb> {
    public final fe a;

    public ub(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rb resolve(ParsingContext parsingContext, vb vbVar, JSONObject jSONObject) throws ParsingException {
        boolean z = vbVar instanceof vb.a;
        fe feVar = this.a;
        if (z) {
            return new rb.a(((u6.c) feVar.R4.getValue()).resolve(parsingContext, ((vb.a) vbVar).a, jSONObject));
        }
        if (vbVar instanceof vb.b) {
            return new rb.b(((p8.c) feVar.q6.getValue()).resolve(parsingContext, ((vb.b) vbVar).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

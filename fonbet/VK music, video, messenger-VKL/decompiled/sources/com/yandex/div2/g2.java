package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.b2;
import com.yandex.div2.d2;
import com.yandex.div2.h2;
import com.yandex.div2.y1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class g2 implements TemplateResolver<JSONObject, h2, d2> {
    public final fe a;

    public g2(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d2 resolve(ParsingContext parsingContext, h2 h2Var, JSONObject jSONObject) throws ParsingException {
        boolean z = h2Var instanceof h2.b;
        fe feVar = this.a;
        if (z) {
            b2.c cVar = (b2.c) feVar.T1.getValue();
            c2 c2Var = ((h2.b) h2Var).a;
            cVar.getClass();
            Field<List<h2>> field = c2Var.a;
            fe feVar2 = cVar.a;
            return new d2.b(new a2(JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", feVar2.W1, feVar2.U1, b2.a)));
        }
        if (!(h2Var instanceof h2.a)) {
            throw new NoWhenBranchMatchedException();
        }
        y1.d dVar = (y1.d) feVar.Q1.getValue();
        z1 z1Var = ((h2.a) h2Var).a;
        dVar.getClass();
        return new d2.a(y1.d.a(parsingContext, z1Var, jSONObject));
    }
}

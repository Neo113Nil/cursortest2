package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.g5;
import com.yandex.div2.m1;
import com.yandex.div2.p8;
import com.yandex.div2.q1;
import com.yandex.div2.u6;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epn;
import xsna.fpn;
import xsna.inn;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class p1 implements TemplateResolver<JSONObject, q1, m1> {
    public final fe a;

    public p1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m1 resolve(ParsingContext parsingContext, q1 q1Var, JSONObject jSONObject) throws ParsingException {
        boolean z = q1Var instanceof q1.b;
        fe feVar = this.a;
        if (z) {
            return new m1.b(((u6.c) feVar.R4.getValue()).resolve(parsingContext, ((q1.b) q1Var).a, jSONObject));
        }
        if (q1Var instanceof q1.d) {
            return new m1.d(((p8.c) feVar.q6.getValue()).resolve(parsingContext, ((q1.d) q1Var).a, jSONObject));
        }
        if (q1Var instanceof q1.a) {
            return new m1.a(((g5.f) feVar.W3.getValue()).resolve(parsingContext, ((q1.a) q1Var).a, jSONObject));
        }
        if (!(q1Var instanceof q1.e)) {
            if (q1Var instanceof q1.c) {
                return new m1.c(((inn) feVar.d5.getValue()).resolve(parsingContext, ((q1.c) q1Var).a, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        epn epnVar = (epn) feVar.p7.getValue();
        fpn fpnVar = ((q1.e) q1Var).a;
        epnVar.getClass();
        return new m1.e(epn.a(parsingContext, fpnVar, jSONObject));
    }
}

package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.a;
import com.yandex.div2.c5;
import com.yandex.div2.eb;
import com.yandex.div2.f9;
import com.yandex.div2.ga;
import com.yandex.div2.h3;
import com.yandex.div2.i5;
import com.yandex.div2.jb;
import com.yandex.div2.l9;
import com.yandex.div2.n7;
import com.yandex.div2.na;
import com.yandex.div2.nb;
import com.yandex.div2.p5;
import com.yandex.div2.r5;
import com.yandex.div2.sd;
import com.yandex.div2.v2;
import com.yandex.div2.w4;
import com.yandex.div2.yb;
import com.yandex.div2.z4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes8.dex */
public final class r6 implements TemplateResolver<JSONObject, nb, a> {
    public final fe a;

    public r6(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a resolve(ParsingContext parsingContext, nb nbVar, JSONObject jSONObject) throws ParsingException {
        boolean z = nbVar instanceof nb.f;
        fe feVar = this.a;
        if (z) {
            return new a.f(((i5.j) feVar.Z3.getValue()).resolve(parsingContext, ((nb.f) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.d) {
            return new a.d(((z4.i) feVar.Q3.getValue()).resolve(parsingContext, ((nb.d) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.p) {
            return new a.p(((yb.m) feVar.w8.getValue()).resolve(parsingContext, ((nb.p) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.k) {
            return new a.k(((l9.f) feVar.I6.getValue()).resolve(parsingContext, ((nb.k) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.a) {
            return new a.C2110a(((v2.j) feVar.o2.getValue()).resolve(parsingContext, ((nb.a) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.e) {
            return new a.e(((c5.h) feVar.T3.getValue()).resolve(parsingContext, ((nb.e) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.c) {
            return new a.c(((w4.j) feVar.N3.getValue()).resolve(parsingContext, ((nb.c) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.i) {
            return new a.i(((n7.i) feVar.B5.getValue()).resolve(parsingContext, ((nb.i) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.o) {
            return new a.o(((jb.f) feVar.Q7.getValue()).resolve(parsingContext, ((nb.o) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.m) {
            return new a.m(((na.g) feVar.s7.getValue()).resolve(parsingContext, ((nb.m) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.b) {
            return new a.b(((h3.f) feVar.D2.getValue()).resolve(parsingContext, ((nb.b) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.g) {
            return new a.g(((p5.g) feVar.f4.getValue()).resolve(parsingContext, ((nb.g) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.l) {
            return new a.l(((ga.f) feVar.g7.getValue()).resolve(parsingContext, ((nb.l) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.n) {
            return new a.n(((eb.f) feVar.N7.getValue()).resolve(parsingContext, ((nb.n) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.h) {
            return new a.h(((r5.m) feVar.I4.getValue()).resolve(parsingContext, ((nb.h) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.j) {
            return new a.j(((f9.h) feVar.C6.getValue()).resolve(parsingContext, ((nb.j) nbVar).a, jSONObject));
        }
        if (nbVar instanceof nb.q) {
            return new a.q(((sd.g) feVar.s9.getValue()).resolve(parsingContext, ((nb.q) nbVar).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

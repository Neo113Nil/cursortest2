package com.yandex.div2;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionTimer;
import com.yandex.div2.DivActionVideo;
import com.yandex.div2.h;
import com.yandex.div2.i0;
import com.yandex.div2.k0;
import com.yandex.div2.n;
import com.yandex.div2.o0;
import com.yandex.div2.q0;
import com.yandex.div2.s0;
import com.yandex.div2.v;
import com.yandex.div2.y;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ajn;
import xsna.bkn;
import xsna.ekn;
import xsna.fjn;
import xsna.fkn;
import xsna.hhn;
import xsna.hjn;
import xsna.iin;
import xsna.khn;
import xsna.kjn;
import xsna.lhn;
import xsna.lin;
import xsna.ljn;
import xsna.min;
import xsna.mjn;
import xsna.nin;
import xsna.oin;
import xsna.phn;
import xsna.pjn;
import xsna.qjn;
import xsna.rhn;
import xsna.sin;
import xsna.uhn;
import xsna.ujn;
import xsna.vhn;
import xsna.vin;
import xsna.win;
import xsna.zhn;
import xsna.zjn;

/* compiled from: DivActionTypedJsonParser.kt */
/* loaded from: classes8.dex */
public final class n0 implements TemplateResolver<JSONObject, o0, k0> {
    public final fe a;

    public n0(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k0 resolve(ParsingContext parsingContext, o0 o0Var, JSONObject jSONObject) throws ParsingException {
        boolean z = o0Var instanceof o0.a;
        fe feVar = this.a;
        if (z) {
            return new k0.a(((h.e) feVar.M.getValue()).resolve(parsingContext, ((o0.a) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.b) {
            khn khnVar = (khn) feVar.P.getValue();
            lhn lhnVar = ((o0.b) o0Var).a;
            khnVar.getClass();
            return new k0.b(new hhn((String) JsonFieldResolver.resolve(parsingContext, lhnVar.a, jSONObject, "animator_id")));
        }
        if (o0Var instanceof o0.c) {
            return new k0.c(((phn) feVar.S.getValue()).resolve(parsingContext, ((o0.c) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.d) {
            uhn uhnVar = (uhn) feVar.V.getValue();
            vhn vhnVar = ((o0.d) o0Var).a;
            uhnVar.getClass();
            return new k0.d(new rhn(JsonFieldResolver.resolveExpression(parsingContext, vhnVar.a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, vhnVar.b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (o0Var instanceof o0.e) {
            return new k0.e(((zhn) feVar.Y.getValue()).resolve(parsingContext, ((o0.e) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.f) {
            lin linVar = (lin) feVar.b0.getValue();
            min minVar = ((o0.f) o0Var).a;
            linVar.getClass();
            return new k0.f(new iin());
        }
        if (o0Var instanceof o0.g) {
            vin vinVar = (vin) feVar.h0.getValue();
            win winVar = ((o0.g) o0Var).a;
            vinVar.getClass();
            Field<sin> field = winVar.a;
            fe feVar2 = vinVar.a;
            return new k0.g(new nin((oin) JsonFieldResolver.resolve(parsingContext, field, jSONObject, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, feVar2.e0, feVar2.c0)));
        }
        if (o0Var instanceof o0.h) {
            return new k0.h(((ajn) feVar.k0.getValue()).resolve(parsingContext, ((o0.h) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.i) {
            return new k0.i(((fjn) feVar.n0.getValue()).resolve(parsingContext, ((o0.i) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.j) {
            kjn kjnVar = (kjn) feVar.q0.getValue();
            ljn ljnVar = ((o0.j) o0Var).a;
            kjnVar.getClass();
            return new k0.j(new hjn(JsonFieldResolver.resolveExpression(parsingContext, ljnVar.a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (o0Var instanceof o0.k) {
            pjn pjnVar = (pjn) feVar.t0.getValue();
            qjn qjnVar = ((o0.k) o0Var).a;
            pjnVar.getClass();
            return new k0.k(new mjn(JsonFieldResolver.resolveExpression(parsingContext, qjnVar.a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (o0Var instanceof o0.l) {
            n.d dVar = (n.d) feVar.w0.getValue();
            o oVar = ((o0.l) o0Var).a;
            dVar.getClass();
            return new k0.l(n.d.a(parsingContext, oVar, jSONObject));
        }
        if (o0Var instanceof o0.m) {
            return new k0.m(((v.c) feVar.C0.getValue()).resolve(parsingContext, ((o0.m) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.n) {
            y.c cVar = (y.c) feVar.F0.getValue();
            z zVar = ((o0.n) o0Var).a;
            cVar.getClass();
            return new k0.n(y.c.a(parsingContext, zVar, jSONObject));
        }
        if (o0Var instanceof o0.o) {
            return new k0.o(((ujn) feVar.I0.getValue()).resolve(parsingContext, ((o0.o) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.p) {
            return new k0.p(((zjn) feVar.L0.getValue()).resolve(parsingContext, ((o0.p) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.q) {
            ekn eknVar = (ekn) feVar.O0.getValue();
            fkn fknVar = ((o0.q) o0Var).a;
            eknVar.getClass();
            return new k0.q(new bkn(JsonFieldResolver.resolveExpression(parsingContext, fknVar.a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, fknVar.b, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN)));
        }
        if (o0Var instanceof o0.r) {
            return new k0.r(((b0) feVar.R0.getValue()).resolve(parsingContext, ((o0.r) o0Var).a, jSONObject));
        }
        if (o0Var instanceof o0.s) {
            i0.d dVar2 = (i0.d) feVar.a1.getValue();
            j0 j0Var = ((o0.s) o0Var).a;
            dVar2.getClass();
            return new k0.s(new DivActionTimer(JsonFieldResolver.resolveExpression(parsingContext, j0Var.a, jSONObject, "action", i0.a, DivActionTimer.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, j0Var.b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (o0Var instanceof o0.t) {
            return new k0.t(((q0.c) feVar.g1.getValue()).resolve(parsingContext, ((o0.t) o0Var).a, jSONObject));
        }
        if (!(o0Var instanceof o0.u)) {
            throw new NoWhenBranchMatchedException();
        }
        s0.d dVar3 = (s0.d) feVar.j1.getValue();
        t0 t0Var = ((o0.u) o0Var).a;
        dVar3.getClass();
        return new k0.u(new DivActionVideo(JsonFieldResolver.resolveExpression(parsingContext, t0Var.a, jSONObject, "action", s0.a, DivActionVideo.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, t0Var.b, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING)));
    }
}

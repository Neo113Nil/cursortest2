package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ke;
import com.yandex.div2.md;
import com.yandex.div2.qd;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.a18;
import xsna.b18;
import xsna.bom0;
import xsna.bxm;
import xsna.cax;
import xsna.cxm;
import xsna.eom0;
import xsna.fax;
import xsna.fom0;
import xsna.gax;
import xsna.ll3;
import xsna.ol3;
import xsna.pfq0;
import xsna.pl3;
import xsna.pn70;
import xsna.sfq0;
import xsna.sn70;
import xsna.t8g;
import xsna.tfq0;
import xsna.tn70;
import xsna.w8g;
import xsna.x08;
import xsna.x8g;
import xsna.ywm;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class pd implements TemplateResolver<JSONObject, qd, md> {
    public final fe a;

    public pd(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final md resolve(ParsingContext parsingContext, qd qdVar, JSONObject jSONObject) throws ParsingException {
        boolean z = qdVar instanceof qd.h;
        fe feVar = this.a;
        if (z) {
            eom0 eom0Var = (eom0) feVar.ia.getValue();
            fom0 fom0Var = ((qd.h) qdVar).a;
            eom0Var.getClass();
            return new md.h(new bom0(JsonFieldResolver.resolveExpression(parsingContext, fom0Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, fom0Var.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.f) {
            sn70 sn70Var = (sn70) feVar.T9.getValue();
            tn70 tn70Var = ((qd.f) qdVar).a;
            sn70Var.getClass();
            return new md.f(new pn70(JsonFieldResolver.resolveExpression(parsingContext, tn70Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE), (String) JsonFieldResolver.resolve(parsingContext, tn70Var.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.e) {
            fax faxVar = (fax) feVar.N9.getValue();
            gax gaxVar = ((qd.e) qdVar).a;
            faxVar.getClass();
            return new md.e(new cax(JsonFieldResolver.resolveExpression(parsingContext, gaxVar.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (String) JsonFieldResolver.resolve(parsingContext, gaxVar.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.b) {
            a18 a18Var = (a18) feVar.l.getValue();
            b18 b18Var = ((qd.b) qdVar).a;
            a18Var.getClass();
            return new md.b(new x08(JsonFieldResolver.resolveExpression(parsingContext, b18Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (String) JsonFieldResolver.resolve(parsingContext, b18Var.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.c) {
            w8g w8gVar = (w8g) feVar.r.getValue();
            x8g x8gVar = ((qd.c) qdVar).a;
            w8gVar.getClass();
            return new md.c(new t8g(JsonFieldResolver.resolveExpression(parsingContext, x8gVar.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (String) JsonFieldResolver.resolve(parsingContext, x8gVar.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.i) {
            sfq0 sfq0Var = (sfq0) feVar.oa.getValue();
            tfq0 tfq0Var = ((qd.i) qdVar).a;
            sfq0Var.getClass();
            return new md.i(new pfq0(JsonFieldResolver.resolveExpression(parsingContext, tfq0Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (String) JsonFieldResolver.resolve(parsingContext, tfq0Var.a, jSONObject, "name")));
        }
        if (qdVar instanceof qd.d) {
            bxm bxmVar = (bxm) feVar.D.getValue();
            cxm cxmVar = ((qd.d) qdVar).a;
            bxmVar.getClass();
            return new md.d(new ywm(JsonFieldResolver.resolveExpression(parsingContext, cxmVar.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT), (String) JsonFieldResolver.resolve(parsingContext, cxmVar.a, jSONObject, "name")));
        }
        if (!(qdVar instanceof qd.a)) {
            if (qdVar instanceof qd.g) {
                return new md.g(((ke.d) feVar.Z9.getValue()).resolve(parsingContext, ((qd.g) qdVar).a, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        ol3 ol3Var = (ol3) feVar.f.getValue();
        pl3 pl3Var = ((qd.a) qdVar).a;
        ol3Var.getClass();
        return new md.a(new ll3(JsonFieldResolver.resolveExpression(parsingContext, pl3Var.b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY), (String) JsonFieldResolver.resolve(parsingContext, pl3Var.a, jSONObject, "name")));
    }
}

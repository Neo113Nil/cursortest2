package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.kqn;
import xsna.oqn;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class nqn implements TemplateResolver<JSONObject, oqn, kqn> {
    public final com.yandex.div2.fe a;

    public nqn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kqn resolve(ParsingContext parsingContext, oqn oqnVar, JSONObject jSONObject) throws ParsingException {
        boolean z = oqnVar instanceof oqn.g;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            znm0 znm0Var = (znm0) feVar.fa.getValue();
            aom0 aom0Var = ((oqn.g) oqnVar).a;
            znm0Var.getClass();
            return new kqn.g(new wnm0(JsonFieldResolver.resolveExpression(parsingContext, aom0Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (oqnVar instanceof oqn.e) {
            aax aaxVar = (aax) feVar.K9.getValue();
            bax baxVar = ((oqn.e) oqnVar).a;
            aaxVar.getClass();
            return new kqn.e(new x9x(JsonFieldResolver.resolveExpression(parsingContext, baxVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT)));
        }
        if (oqnVar instanceof oqn.f) {
            nn70 nn70Var = (nn70) feVar.Q9.getValue();
            on70 on70Var = ((oqn.f) oqnVar).a;
            nn70Var.getClass();
            return new kqn.f(new kn70(JsonFieldResolver.resolveExpression(parsingContext, on70Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
        }
        if (oqnVar instanceof oqn.c) {
            r8g r8gVar = (r8g) feVar.o.getValue();
            s8g s8gVar = ((oqn.c) oqnVar).a;
            r8gVar.getClass();
            return new kqn.c(new o8g(JsonFieldResolver.resolveExpression(parsingContext, s8gVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT)));
        }
        if (oqnVar instanceof oqn.b) {
            v08 v08Var = (v08) feVar.i.getValue();
            w08 w08Var = ((oqn.b) oqnVar).a;
            v08Var.getClass();
            return new kqn.b(new s08(JsonFieldResolver.resolveExpression(parsingContext, w08Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN)));
        }
        if (oqnVar instanceof oqn.h) {
            nfq0 nfq0Var = (nfq0) feVar.la.getValue();
            ofq0 ofq0Var = ((oqn.h) oqnVar).a;
            nfq0Var.getClass();
            return new kqn.h(new kfq0(JsonFieldResolver.resolveExpression(parsingContext, ofq0Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI)));
        }
        if (oqnVar instanceof oqn.d) {
            wwm wwmVar = (wwm) feVar.A.getValue();
            xwm xwmVar = ((oqn.d) oqnVar).a;
            wwmVar.getClass();
            return new kqn.d(new twm(JsonFieldResolver.resolveExpression(parsingContext, xwmVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT)));
        }
        if (!(oqnVar instanceof oqn.a)) {
            throw new NoWhenBranchMatchedException();
        }
        jl3 jl3Var = (jl3) feVar.c.getValue();
        kl3 kl3Var = ((oqn.a) oqnVar).a;
        jl3Var.getClass();
        return new kqn.a(new gl3(JsonFieldResolver.resolveExpression(parsingContext, kl3Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY)));
    }
}

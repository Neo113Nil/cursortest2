package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.n4;
import com.yandex.div2.s5;
import com.yandex.div2.w5;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.con;
import xsna.don;
import xsna.kkn;
import xsna.nkn;
import xsna.okn;
import xsna.znn;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class v5 implements TemplateResolver<JSONObject, w5, s5> {
    public final fe a;

    public v5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s5 resolve(ParsingContext parsingContext, w5 w5Var, JSONObject jSONObject) throws ParsingException {
        boolean z = w5Var instanceof w5.b;
        fe feVar = this.a;
        if (z) {
            return new s5.b(((n4.c) feVar.s3.getValue()).resolve(parsingContext, ((w5.b) w5Var).a, jSONObject));
        }
        if (w5Var instanceof w5.a) {
            nkn nknVar = (nkn) feVar.A2.getValue();
            okn oknVar = ((w5.a) w5Var).a;
            nknVar.getClass();
            return new s5.a(new kkn(JsonFieldResolver.resolveOptionalExpression(parsingContext, oknVar.a, jSONObject, "locale", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, oknVar.b, jSONObject, "raw_text_variable")));
        }
        if (!(w5Var instanceof w5.c)) {
            throw new NoWhenBranchMatchedException();
        }
        con conVar = (con) feVar.M5.getValue();
        don donVar = ((w5.c) w5Var).a;
        conVar.getClass();
        return new s5.c(new znn((String) JsonFieldResolver.resolve(parsingContext, donVar.a, jSONObject, "raw_text_variable")));
    }
}

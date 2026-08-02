package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.e4;
import com.yandex.div2.i4;
import com.yandex.div2.s1;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eln;
import xsna.hln;
import xsna.iln;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes8.dex */
public final class h4 implements TemplateResolver<JSONObject, i4, e4> {
    public final fe a;

    public h4(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e4 resolve(ParsingContext parsingContext, i4 i4Var, JSONObject jSONObject) throws ParsingException {
        boolean z = i4Var instanceof i4.a;
        fe feVar = this.a;
        if (z) {
            s1.c cVar = (s1.c) feVar.K1.getValue();
            t1 t1Var = ((i4.a) i4Var).a;
            cVar.getClass();
            return new e4.a(new r1(JsonFieldResolver.resolveExpression(parsingContext, t1Var.a, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, s1.a)));
        }
        if (!(i4Var instanceof i4.b)) {
            throw new NoWhenBranchMatchedException();
        }
        hln hlnVar = (hln) feVar.j3.getValue();
        iln ilnVar = ((i4.b) i4Var).a;
        hlnVar.getClass();
        return new e4.b(new eln());
    }
}

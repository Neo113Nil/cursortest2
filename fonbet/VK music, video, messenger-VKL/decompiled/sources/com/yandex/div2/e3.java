package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.b3;
import com.yandex.div2.f3;
import com.yandex.div2.k4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.amn;
import xsna.wln;
import xsna.zln;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes8.dex */
public final class e3 implements TemplateResolver<JSONObject, f3, b3> {
    public final fe a;

    public e3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b3 resolve(ParsingContext parsingContext, f3 f3Var, JSONObject jSONObject) throws ParsingException {
        boolean z = f3Var instanceof f3.b;
        fe feVar = this.a;
        if (z) {
            zln zlnVar = (zln) feVar.i4.getValue();
            amn amnVar = ((f3.b) f3Var).a;
            zlnVar.getClass();
            return new b3.b(new wln());
        }
        if (!(f3Var instanceof f3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        k4.c cVar = (k4.c) feVar.p3.getValue();
        l4 l4Var = ((f3.a) f3Var).a;
        cVar.getClass();
        return new b3.a(new j4(JsonFieldResolver.resolveExpression(parsingContext, l4Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, k4.a)));
    }
}

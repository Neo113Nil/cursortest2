package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.q8;
import com.yandex.div2.r4;
import com.yandex.div2.u8;
import com.yandex.div2.v8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public final class t8 implements TemplateResolver<JSONObject, u8, q8> {
    public final fe a;

    public t8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q8 resolve(ParsingContext parsingContext, u8 u8Var, JSONObject jSONObject) throws ParsingException {
        boolean z = u8Var instanceof u8.a;
        fe feVar = this.a;
        if (z) {
            r4.d dVar = (r4.d) feVar.y3.getValue();
            s4 s4Var = ((u8.a) u8Var).a;
            dVar.getClass();
            return new q8.a(r4.d.a(parsingContext, s4Var, jSONObject));
        }
        if (!(u8Var instanceof u8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        v8.d dVar2 = (v8.d) feVar.n6.getValue();
        w8 w8Var = ((u8.b) u8Var).a;
        dVar2.getClass();
        return new q8.b(new DivRadialGradientRelativeRadius(JsonFieldResolver.resolveExpression(parsingContext, w8Var.a, jSONObject, "value", v8.a, DivRadialGradientRelativeRadius.Value.FROM_STRING)));
    }
}

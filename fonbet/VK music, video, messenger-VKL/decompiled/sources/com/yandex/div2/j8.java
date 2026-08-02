package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.g8;
import com.yandex.div2.k8;
import com.yandex.div2.n8;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.pon;
import xsna.son;
import xsna.ton;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes8.dex */
public final class j8 implements TemplateResolver<JSONObject, k8, g8> {
    public final fe a;

    public j8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g8 resolve(ParsingContext parsingContext, k8 k8Var, JSONObject jSONObject) throws ParsingException {
        boolean z = k8Var instanceof k8.a;
        fe feVar = this.a;
        if (z) {
            n8.d dVar = (n8.d) feVar.e6.getValue();
            o8 o8Var = ((k8.a) k8Var).a;
            dVar.getClass();
            return new g8.a(n8.d.a(parsingContext, o8Var, jSONObject));
        }
        if (!(k8Var instanceof k8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        son sonVar = (son) feVar.k6.getValue();
        ton tonVar = ((k8.b) k8Var).a;
        sonVar.getClass();
        return new g8.b(new pon(JsonFieldResolver.resolveExpression(parsingContext, tonVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
    }
}

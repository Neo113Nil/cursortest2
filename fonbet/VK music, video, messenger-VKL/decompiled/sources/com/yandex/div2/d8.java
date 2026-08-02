package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.e8;
import com.yandex.div2.x7;
import com.yandex.div2.z7;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.eon;
import xsna.hon;
import xsna.ion;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes8.dex */
public final class d8 implements TemplateResolver<JSONObject, e8, x7> {
    public final fe a;

    public d8(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x7 resolve(ParsingContext parsingContext, e8 e8Var, JSONObject jSONObject) throws ParsingException {
        boolean z = e8Var instanceof e8.a;
        fe feVar = this.a;
        if (z) {
            z7.d dVar = (z7.d) feVar.P5.getValue();
            a8 a8Var = ((e8.a) e8Var).a;
            dVar.getClass();
            return new x7.a(z7.d.a(parsingContext, a8Var, jSONObject));
        }
        if (!(e8Var instanceof e8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        hon honVar = (hon) feVar.S5.getValue();
        ion ionVar = ((e8.b) e8Var).a;
        honVar.getClass();
        return new x7.b(new eon(JsonFieldResolver.resolveExpression(parsingContext, ionVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE)));
    }
}

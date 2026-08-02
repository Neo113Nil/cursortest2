package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.k5;
import com.yandex.div2.o5;
import com.yandex.div2.q3;
import com.yandex.div2.ta;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class n5 implements TemplateResolver<JSONObject, o5, k5> {
    public final fe a;

    public n5(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final k5 resolve(ParsingContext parsingContext, o5 o5Var, JSONObject jSONObject) throws ParsingException {
        boolean z = o5Var instanceof o5.a;
        fe feVar = this.a;
        if (!z) {
            if (o5Var instanceof o5.b) {
                return new k5.b(((ta.c) feVar.y7.getValue()).resolve(parsingContext, ((o5.b) o5Var).a, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        q3.c cVar = (q3.c) feVar.L2.getValue();
        r3 r3Var = ((o5.a) o5Var).a;
        cVar.getClass();
        Field<s4> field = r3Var.a;
        fe feVar2 = cVar.a;
        q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "space_between_centers", feVar2.y3, feVar2.w3);
        if (q4Var == null) {
            q4Var = q3.a;
        }
        return new k5.a(new p3(q4Var));
    }
}

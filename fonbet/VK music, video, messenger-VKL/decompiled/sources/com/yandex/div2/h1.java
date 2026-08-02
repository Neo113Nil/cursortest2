package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.c1;
import com.yandex.div2.c4;
import com.yandex.div2.c9;
import com.yandex.div2.da;
import com.yandex.div2.e1;
import com.yandex.div2.i1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class h1 implements TemplateResolver<JSONObject, i1, e1> {
    public final fe a;

    public h1(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e1 resolve(ParsingContext parsingContext, i1 i1Var, JSONObject jSONObject) throws ParsingException {
        boolean z = i1Var instanceof i1.c;
        fe feVar = this.a;
        if (z) {
            c1.c cVar = (c1.c) feVar.y1.getValue();
            d1 d1Var = ((i1.c) i1Var).a;
            cVar.getClass();
            Field<List<i1>> field = d1Var.a;
            fe feVar2 = cVar.a;
            return new e1.c(new b1(JsonFieldResolver.resolveList(parsingContext, field, jSONObject, "items", feVar2.B1, feVar2.z1, c1.a)));
        }
        if (i1Var instanceof i1.a) {
            c4.d dVar = (c4.d) feVar.g3.getValue();
            d4 d4Var = ((i1.a) i1Var).a;
            dVar.getClass();
            return new e1.a(c4.d.a(parsingContext, d4Var, jSONObject));
        }
        if (!(i1Var instanceof i1.b)) {
            if (i1Var instanceof i1.d) {
                return new e1.d(((da.e) feVar.d7.getValue()).resolve(parsingContext, ((i1.d) i1Var).a, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        c9.d dVar2 = (c9.d) feVar.z6.getValue();
        d9 d9Var = ((i1.b) i1Var).a;
        dVar2.getClass();
        return new e1.b(c9.d.a(parsingContext, d9Var, jSONObject));
    }
}

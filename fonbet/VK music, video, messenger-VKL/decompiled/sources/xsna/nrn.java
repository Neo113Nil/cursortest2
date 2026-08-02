package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes8.dex */
public final class nrn implements TemplateResolver<JSONObject, orn, krn> {
    public final com.yandex.div2.fe a;

    public nrn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final krn resolve(ParsingContext parsingContext, orn ornVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, ornVar.a, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Field<com.yandex.div2.ca> field = ornVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new krn(resolveOptionalExpression, (com.yandex.div2.aa) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "max_size", feVar.X6, feVar.V6), (com.yandex.div2.aa) JsonFieldResolver.resolveOptional(parsingContext, ornVar.c, jSONObject, "min_size", feVar.X6, feVar.V6));
    }
}

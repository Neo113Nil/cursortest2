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

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class yon implements TemplateResolver<JSONObject, zon, von> {
    public final com.yandex.div2.fe a;

    public yon(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final von resolve(ParsingContext parsingContext, zon zonVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, zonVar.a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Field<com.yandex.div2.u9> field = zonVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new von(resolveExpression, (com.yandex.div2.q9) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "shape", feVar.U6, feVar.S6), (com.yandex.div2.va) JsonFieldResolver.resolveOptional(parsingContext, zonVar.c, jSONObject, "stroke", feVar.K7, feVar.I7));
    }
}

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

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class phn implements TemplateResolver<JSONObject, qhn, mhn> {
    public final com.yandex.div2.fe a;

    public phn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mhn resolve(ParsingContext parsingContext, qhn qhnVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, qhnVar.a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Field<oqn> field = qhnVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new mhn(resolveOptionalExpression, JsonFieldResolver.resolveExpression(parsingContext, qhnVar.c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING), (kqn) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "value", feVar.g9, feVar.e9));
    }
}

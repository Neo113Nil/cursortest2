package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class ajn implements TemplateResolver<JSONObject, bjn, xin> {
    public final com.yandex.div2.fe a;

    public ajn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xin resolve(ParsingContext parsingContext, bjn bjnVar, JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = bjnVar.a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper);
        Field<oqn> field2 = bjnVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new xin(resolveExpression, JsonFieldResolver.resolveExpression(parsingContext, bjnVar.c, jSONObject, "variable_name", typeHelper), (kqn) JsonFieldResolver.resolveOptional(parsingContext, field2, jSONObject, "value", feVar.g9, feVar.e9));
    }
}

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

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class ujn implements TemplateResolver<JSONObject, vjn, rjn> {
    public final com.yandex.div2.fe a;

    public ujn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rjn resolve(ParsingContext parsingContext, vjn vjnVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, vjnVar.a, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, vjnVar.b, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING);
        Field<oqn> field = vjnVar.c;
        com.yandex.div2.fe feVar = this.a;
        return new rjn(resolveExpression, resolveExpression2, (kqn) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "value", feVar.g9, feVar.e9));
    }
}

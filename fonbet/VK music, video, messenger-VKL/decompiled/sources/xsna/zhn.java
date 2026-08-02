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

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class zhn implements TemplateResolver<JSONObject, ain, whn> {
    public final com.yandex.div2.fe a;

    public zhn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final whn resolve(ParsingContext parsingContext, ain ainVar, JSONObject jSONObject) throws ParsingException {
        Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, ainVar.a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Field<oqn> field = ainVar.b;
        com.yandex.div2.fe feVar = this.a;
        return new whn(resolveExpression, JsonFieldResolver.resolveExpression(parsingContext, ainVar.c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING), (kqn) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "value", feVar.g9, feVar.e9));
    }
}

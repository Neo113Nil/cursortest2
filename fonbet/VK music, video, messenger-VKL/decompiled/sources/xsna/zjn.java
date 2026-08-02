package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class zjn implements TemplateResolver<JSONObject, akn, wjn> {
    public final com.yandex.div2.fe a;

    public zjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wjn resolve(ParsingContext parsingContext, akn aknVar, JSONObject jSONObject) throws ParsingException {
        Field<oqn> field = aknVar.a;
        com.yandex.div2.fe feVar = this.a;
        return new wjn((kqn) JsonFieldResolver.resolve(parsingContext, field, jSONObject, "value", feVar.g9, feVar.e9), JsonFieldResolver.resolveExpression(parsingContext, aknVar.b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

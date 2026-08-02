package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* loaded from: classes8.dex */
public final class kjn implements TemplateResolver<JSONObject, ljn, hjn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final hjn resolve(ParsingContext parsingContext, ljn ljnVar, JSONObject jSONObject) {
        return new hjn(JsonFieldResolver.resolveExpression(parsingContext, ljnVar.a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

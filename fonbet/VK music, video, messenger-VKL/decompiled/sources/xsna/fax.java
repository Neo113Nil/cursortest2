package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes8.dex */
public final class fax implements TemplateResolver<JSONObject, gax, cax> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final cax resolve(ParsingContext parsingContext, gax gaxVar, JSONObject jSONObject) {
        gax gaxVar2 = gaxVar;
        JSONObject jSONObject2 = jSONObject;
        return new cax(JsonFieldResolver.resolveExpression(parsingContext, gaxVar2.b, jSONObject2, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (String) JsonFieldResolver.resolve(parsingContext, gaxVar2.a, jSONObject2, "name"));
    }
}

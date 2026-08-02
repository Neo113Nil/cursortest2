package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: IntegerValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class aax implements TemplateResolver<JSONObject, bax, x9x> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final x9x resolve(ParsingContext parsingContext, bax baxVar, JSONObject jSONObject) {
        return new x9x(JsonFieldResolver.resolveExpression(parsingContext, baxVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }
}

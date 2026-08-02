package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: UrlValueJsonParser.kt */
/* loaded from: classes8.dex */
public final class nfq0 implements TemplateResolver<JSONObject, ofq0, kfq0> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final kfq0 resolve(ParsingContext parsingContext, ofq0 ofq0Var, JSONObject jSONObject) {
        return new kfq0(JsonFieldResolver.resolveExpression(parsingContext, ofq0Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}

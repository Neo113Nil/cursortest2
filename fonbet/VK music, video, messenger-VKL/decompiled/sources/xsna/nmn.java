package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* loaded from: classes8.dex */
public final class nmn implements TemplateResolver<JSONObject, omn, kmn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final kmn resolve(ParsingContext parsingContext, omn omnVar, JSONObject jSONObject) {
        return new kmn(JsonFieldResolver.resolveExpression(parsingContext, omnVar.a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}

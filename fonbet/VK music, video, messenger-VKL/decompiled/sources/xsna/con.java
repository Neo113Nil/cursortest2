package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* loaded from: classes8.dex */
public final class con implements TemplateResolver<JSONObject, don, znn> {
    @Override // com.yandex.div.serialization.TemplateResolver
    public final znn resolve(ParsingContext parsingContext, don donVar, JSONObject jSONObject) {
        return new znn((String) JsonFieldResolver.resolve(parsingContext, donVar.a, jSONObject, "raw_text_variable"));
    }
}

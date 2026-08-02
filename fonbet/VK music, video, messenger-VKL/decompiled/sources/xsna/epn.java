package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class epn implements TemplateResolver<JSONObject, fpn, bpn> {
    public static bpn a(ParsingContext parsingContext, fpn fpnVar, JSONObject jSONObject) throws ParsingException {
        return new bpn(JsonFieldResolver.resolveExpression(parsingContext, fpnVar.a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ bpn resolve(ParsingContext parsingContext, fpn fpnVar, JSONObject jSONObject) {
        return a(parsingContext, fpnVar, jSONObject);
    }
}

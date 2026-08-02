package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes8.dex */
public final class fjn implements TemplateResolver<JSONObject, gjn, cjn> {
    public final com.yandex.div2.fe a;

    public fjn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjn resolve(ParsingContext parsingContext, gjn gjnVar, JSONObject jSONObject) throws ParsingException {
        Field<List<com.yandex.div2.h0>> field = gjnVar.a;
        com.yandex.div2.fe feVar = this.a;
        return new cjn(JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "on_fail_actions", feVar.m1, feVar.k1), JsonFieldResolver.resolveOptionalList(parsingContext, gjnVar.b, jSONObject, "on_success_actions", feVar.m1, feVar.k1), JsonFieldResolver.resolveExpression(parsingContext, gjnVar.c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}

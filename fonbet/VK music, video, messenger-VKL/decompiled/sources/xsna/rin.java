package xsna;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.oin;
import xsna.sin;

/* compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* loaded from: classes8.dex */
public final class rin implements TemplateResolver<JSONObject, sin, oin> {
    public final com.yandex.div2.fe a;

    public rin(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oin resolve(ParsingContext parsingContext, sin sinVar, JSONObject jSONObject) throws ParsingException {
        boolean z = sinVar instanceof sin.a;
        com.yandex.div2.fe feVar = this.a;
        if (z) {
            hlj hljVar = (hlj) feVar.u.getValue();
            ilj iljVar = ((sin.a) sinVar).a;
            hljVar.getClass();
            return new oin.a(new elj(JsonFieldResolver.resolveExpression(parsingContext, iljVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING)));
        }
        if (!(sinVar instanceof sin.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rlj rljVar = (rlj) feVar.x.getValue();
        slj sljVar = ((sin.b) sinVar).a;
        rljVar.getClass();
        return new oin.b(new olj(JsonFieldResolver.resolveExpression(parsingContext, sljVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI)));
    }
}

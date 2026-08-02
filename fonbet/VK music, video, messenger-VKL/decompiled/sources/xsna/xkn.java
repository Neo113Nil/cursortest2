package xsna;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.ukn;
import xsna.ykn;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes8.dex */
public final class xkn implements TemplateResolver<JSONObject, ykn, ukn> {
    public final com.yandex.div2.fe a;

    public xkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ukn.a resolve(ParsingContext parsingContext, ykn yknVar, JSONObject jSONObject) throws ParsingException {
        if (yknVar instanceof ykn.a) {
            return new ukn.a(((yon) this.a.R6.getValue()).resolve(parsingContext, ((ykn.a) yknVar).a, jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}

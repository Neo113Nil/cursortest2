package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.bd;
import com.yandex.div2.fd;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.cqn;
import xsna.dqn;
import xsna.eqn;
import xsna.hqn;
import xsna.iqn;
import xsna.zpn;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class ed implements TemplateResolver<JSONObject, fd, bd> {
    public final fe a;

    public ed(fe feVar) {
        this.a = feVar;
    }

    public final bd a(fd fdVar) throws ParsingException {
        boolean z = fdVar instanceof fd.b;
        fe feVar = this.a;
        if (z) {
            hqn hqnVar = (hqn) feVar.R8.getValue();
            iqn iqnVar = ((fd.b) fdVar).a;
            hqnVar.getClass();
            return new bd.b(new eqn());
        }
        if (!(fdVar instanceof fd.a)) {
            throw new NoWhenBranchMatchedException();
        }
        cqn cqnVar = (cqn) feVar.O8.getValue();
        dqn dqnVar = ((fd.a) fdVar).a;
        cqnVar.getClass();
        return new bd.a(new zpn());
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ bd resolve(ParsingContext parsingContext, fd fdVar, JSONObject jSONObject) {
        return a(fdVar);
    }
}

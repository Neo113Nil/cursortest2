package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.bb;
import com.yandex.div2.xa;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.lpn;
import xsna.opn;
import xsna.ppn;
import xsna.qpn;
import xsna.tpn;
import xsna.upn;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes8.dex */
public final class ab implements TemplateResolver<JSONObject, bb, xa> {
    public final fe a;

    public ab(fe feVar) {
        this.a = feVar;
    }

    public final xa a(bb bbVar) throws ParsingException {
        boolean z = bbVar instanceof bb.b;
        fe feVar = this.a;
        if (z) {
            tpn tpnVar = (tpn) feVar.E7.getValue();
            upn upnVar = ((bb.b) bbVar).a;
            tpnVar.getClass();
            return new xa.b(new qpn());
        }
        if (!(bbVar instanceof bb.a)) {
            throw new NoWhenBranchMatchedException();
        }
        opn opnVar = (opn) feVar.B7.getValue();
        ppn ppnVar = ((bb.a) bbVar).a;
        opnVar.getClass();
        return new xa.a(new lpn());
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final /* bridge */ /* synthetic */ xa resolve(ParsingContext parsingContext, bb bbVar, JSONObject jSONObject) {
        return a(bbVar);
    }
}

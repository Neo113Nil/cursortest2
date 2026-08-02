package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.dc;
import com.yandex.div2.m2;
import com.yandex.div2.zb;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.epn;
import xsna.fpn;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class cc implements TemplateResolver<JSONObject, dc, zb> {
    public final fe a;

    public cc(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zb resolve(ParsingContext parsingContext, dc dcVar, JSONObject jSONObject) throws ParsingException {
        boolean z = dcVar instanceof dc.b;
        fe feVar = this.a;
        if (!z) {
            if (dcVar instanceof dc.a) {
                return new zb.a(((m2.c) feVar.c2.getValue()).resolve(parsingContext, ((dc.a) dcVar).a, jSONObject));
            }
            throw new NoWhenBranchMatchedException();
        }
        epn epnVar = (epn) feVar.p7.getValue();
        fpn fpnVar = ((dc.b) dcVar).a;
        epnVar.getClass();
        return new zb.b(epn.a(parsingContext, fpnVar, jSONObject));
    }
}

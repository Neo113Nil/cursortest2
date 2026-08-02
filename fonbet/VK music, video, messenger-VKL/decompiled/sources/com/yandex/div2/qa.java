package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ma;
import com.yandex.div2.ra;
import org.json.JSONObject;
import xsna.bpn0;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class qa implements TemplateResolver<JSONObject, ra.a, ma.a> {
    public final fe a;

    public qa(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final ma.a resolve(ParsingContext parsingContext, ra.a aVar, JSONObject jSONObject) {
        ra.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<v0> field = aVar2.a;
        fe feVar = this.a;
        bpn0 bpn0Var = feVar.s1;
        bpn0 bpn0Var2 = feVar.q1;
        return new ma.a((DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "animation_in", bpn0Var, bpn0Var2), (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, aVar2.b, jSONObject2, "animation_out", feVar.s1, bpn0Var2), (a) JsonFieldResolver.resolveOptional(parsingContext, aVar2.c, jSONObject2, TtmlNode.TAG_DIV, feVar.B9, feVar.z9), (String) JsonFieldResolver.resolve(parsingContext, aVar2.d, jSONObject2, "state_id"), JsonFieldResolver.resolveOptionalList(parsingContext, aVar2.e, jSONObject2, "swipe_out_actions", feVar.m1, feVar.k1));
    }
}

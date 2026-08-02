package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.fa;
import com.yandex.div2.ka;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.ukn;
import xsna.ykn;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public final class ja implements TemplateResolver<JSONObject, ka.a, fa.a> {
    public final fe a;

    public ja(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final fa.a resolve(ParsingContext parsingContext, ka.a aVar, JSONObject jSONObject) {
        ka.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<Expression<Long>> field = aVar2.a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, TtmlNode.END, typeHelper, izsVar);
        Field<a4> field2 = aVar2.b;
        fe feVar = this.a;
        y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, field2, jSONObject2, "margins", feVar.a3, feVar.Y2);
        Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, aVar2.c, jSONObject2, "start", typeHelper, izsVar);
        Field<ykn> field3 = aVar2.d;
        bpn0 bpn0Var = feVar.X2;
        bpn0 bpn0Var2 = feVar.V2;
        return new fa.a(resolveOptionalExpression, y3Var, resolveOptionalExpression2, (ukn) JsonFieldResolver.resolveOptional(parsingContext, field3, jSONObject2, "track_active_style", bpn0Var, bpn0Var2), (ukn) JsonFieldResolver.resolveOptional(parsingContext, aVar2.e, jSONObject2, "track_inactive_style", bpn0Var, bpn0Var2));
    }
}

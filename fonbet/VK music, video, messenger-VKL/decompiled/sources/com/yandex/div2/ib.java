package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.mb;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class ib implements TemplateResolver<JSONObject, mb.a, DivTabs.a> {
    public final fe a;

    public ib(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final DivTabs.a resolve(ParsingContext parsingContext, mb.a aVar, JSONObject jSONObject) {
        mb.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<nb> field = aVar2.a;
        fe feVar = this.a;
        return new DivTabs.a((a) JsonFieldResolver.resolve(parsingContext, field, jSONObject2, TtmlNode.TAG_DIV, feVar.B9, feVar.z9), JsonFieldResolver.resolveExpression(parsingContext, aVar2.b, jSONObject2, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonFieldResolver.resolveOptional(parsingContext, aVar2.c, jSONObject2, "title_click_action", feVar.m1, feVar.k1));
    }
}

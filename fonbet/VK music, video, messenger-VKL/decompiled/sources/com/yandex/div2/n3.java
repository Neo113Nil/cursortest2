package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.j3;
import com.yandex.div2.o3;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes8.dex */
public final class n3 implements TemplateResolver<JSONObject, o3.a, j3.b> {
    public final fe a;

    public n3(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final j3.b resolve(ParsingContext parsingContext, o3.a aVar, JSONObject jSONObject) {
        o3.a aVar2 = aVar;
        JSONObject jSONObject2 = jSONObject;
        Field<nb> field = aVar2.a;
        fe feVar = this.a;
        return new j3.b(((Number) JsonFieldResolver.resolve(parsingContext, aVar2.b, jSONObject2, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue(), (a) JsonFieldResolver.resolve(parsingContext, field, jSONObject2, TtmlNode.TAG_DIV, feVar.B9, feVar.z9));
    }
}

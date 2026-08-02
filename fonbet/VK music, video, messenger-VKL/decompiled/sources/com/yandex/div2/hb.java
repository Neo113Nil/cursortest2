package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.mb;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class hb implements Serializer, TemplateDeserializer {
    public final fe a;

    public hb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, mb.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<nb> field = aVar.a;
        fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, TtmlNode.TAG_DIV, field, feVar.A9);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "title", aVar.b);
        JsonFieldParser.writeField(parsingContext, jSONObject, "title_click_action", aVar.c, feVar.l1);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        mb.a aVar = (mb.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<nb> field = aVar != null ? aVar.a : null;
        fe feVar = this.a;
        return new mb.a(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, TtmlNode.TAG_DIV, allowPropertyOverride, field, feVar.A9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.b : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "title_click_action", allowPropertyOverride, aVar != null ? aVar.c : null, feVar.l1));
    }
}

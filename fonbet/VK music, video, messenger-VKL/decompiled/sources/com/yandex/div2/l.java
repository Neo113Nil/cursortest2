package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.h0;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes8.dex */
public final class l implements Serializer, TemplateDeserializer {
    public final fe a;

    public l(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, h0.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<h0> field = aVar.a;
        fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "action", field, feVar.l1);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", aVar.b, feVar.l1);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", aVar.c);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        h0.a aVar = (h0.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<h0> field = aVar != null ? aVar.a : null;
        fe feVar = this.a;
        return new h0.a(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, field, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, aVar != null ? aVar.b : null, feVar.l1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.c : null));
    }
}

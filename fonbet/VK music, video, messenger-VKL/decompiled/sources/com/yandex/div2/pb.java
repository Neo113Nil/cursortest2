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
import com.yandex.div2.wc;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class pb implements Serializer, TemplateDeserializer {
    public final fe a;

    public pb(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, wc.a aVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<List<h0>> field = aVar.a;
        fe feVar = this.a;
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", field, feVar.l1);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "images", aVar.b, feVar.B8);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", aVar.c, feVar.y8);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", aVar.d);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        wc.a aVar = (wc.a) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<List<h0>> field = aVar != null ? aVar.a : null;
        fe feVar = this.a;
        return new wc.a(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "images", allowPropertyOverride, aVar != null ? aVar.b : null, feVar.B8), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, aVar != null ? aVar.c : null, feVar.y8), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, aVar != null ? aVar.d : null));
    }
}

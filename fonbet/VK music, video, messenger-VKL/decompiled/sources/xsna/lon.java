package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes8.dex */
public final class lon implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public lon(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        non nonVar = (non) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<com.yandex.div2.u3> field = nonVar != null ? nonVar.a : null;
        com.yandex.div2.fe feVar = this.a;
        return new non(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "x", allowPropertyOverride, field, feVar.N2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "y", allowPropertyOverride, nonVar != null ? nonVar.b : null, feVar.N2));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        non nonVar = (non) obj;
        JSONObject jSONObject = new JSONObject();
        Field<com.yandex.div2.u3> field = nonVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeField(parsingContext, jSONObject, "x", field, feVar.N2);
        JsonFieldParser.writeField(parsingContext, jSONObject, "y", nonVar.b, feVar.N2);
        return jSONObject;
    }
}

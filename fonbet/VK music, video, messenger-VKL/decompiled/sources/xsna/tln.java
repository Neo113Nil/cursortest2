package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivEvaluableType;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes8.dex */
public final class tln implements Serializer, TemplateDeserializer {
    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        vln vlnVar = (vln) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new vln(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, vlnVar != null ? vlnVar.a : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, vlnVar != null ? vlnVar.b : null, DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        vln vlnVar = (vln) obj;
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", vlnVar.a);
        JsonFieldParser.writeField(parsingContext, jSONObject, "type", vlnVar.b, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}

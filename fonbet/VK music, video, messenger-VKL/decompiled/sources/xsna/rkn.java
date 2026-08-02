package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes8.dex */
public final class rkn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public rkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        tkn tknVar = (tkn) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<List<com.yandex.div2.h0>> field = tknVar != null ? tknVar.a : null;
        com.yandex.div2.fe feVar = this.a;
        return new tkn(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, tknVar != null ? tknVar.b : null, feVar.l1));
    }

    @Override // com.yandex.div.serialization.Serializer
    public final Object serialize(ParsingContext parsingContext, Object obj) {
        tkn tknVar = (tkn) obj;
        JSONObject jSONObject = new JSONObject();
        Field<List<com.yandex.div2.h0>> field = tknVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", field, feVar.l1);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", tknVar.b, feVar.l1);
        return jSONObject;
    }
}

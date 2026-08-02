package xsna;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes8.dex */
public final class lln implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public lln(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, qln qlnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<List<com.yandex.div2.q1>> field = qlnVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, field, feVar.G1);
        JsonFieldParser.writeField(parsingContext, jSONObject, "border", qlnVar.b, feVar.M1);
        JsonFieldParser.writeField(parsingContext, jSONObject, "next_focus_ids", qlnVar.c, feVar.D3);
        Field<List<com.yandex.div2.h0>> field2 = qlnVar.d;
        bpn0 bpn0Var = feVar.l1;
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_blur", field2, bpn0Var);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_focus", qlnVar.e, bpn0Var);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        qln qlnVar = (qln) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<List<com.yandex.div2.q1>> field = qlnVar != null ? qlnVar.a : null;
        com.yandex.div2.fe feVar = this.a;
        bpn0 bpn0Var = feVar.G1;
        bpn0 bpn0Var2 = feVar.l1;
        return new qln(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, field, bpn0Var), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, qlnVar != null ? qlnVar.b : null, feVar.M1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "next_focus_ids", allowPropertyOverride, qlnVar != null ? qlnVar.c : null, feVar.D3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_blur", allowPropertyOverride, qlnVar != null ? qlnVar.d : null, bpn0Var2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_focus", allowPropertyOverride, qlnVar != null ? qlnVar.e : null, bpn0Var2));
    }
}

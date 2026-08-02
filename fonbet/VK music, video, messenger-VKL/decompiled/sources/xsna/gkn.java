package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes8.dex */
public final class gkn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public gkn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.yandex.div2.g0 deserialize(ParsingContext parsingContext, com.yandex.div2.g0 g0Var, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, g0Var != null ? g0Var.a : null);
        Field<List<com.yandex.div2.h0>> field = g0Var != null ? g0Var.b : null;
        com.yandex.div2.fe feVar = this.a;
        return new com.yandex.div2.g0(readFieldWithExpression, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, g0Var != null ? g0Var.c : null, feVar.l1), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "request", allowPropertyOverride, g0Var != null ? g0Var.d : null, feVar.T0));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, com.yandex.div2.g0 g0Var) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "container_id", g0Var.a);
        Field<List<com.yandex.div2.h0>> field = g0Var.b;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", field, feVar.l1);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", g0Var.c, feVar.l1);
        JsonFieldParser.writeField(parsingContext, jSONObject, "request", g0Var.d, feVar.T0);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }
}

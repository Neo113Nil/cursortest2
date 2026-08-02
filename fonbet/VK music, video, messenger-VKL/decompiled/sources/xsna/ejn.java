package xsna;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes8.dex */
public final class ejn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public ejn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gjn deserialize(ParsingContext parsingContext, gjn gjnVar, JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field<List<com.yandex.div2.h0>> field = gjnVar != null ? gjnVar.a : null;
        com.yandex.div2.fe feVar = this.a;
        return new gjn(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, field, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, gjnVar != null ? gjnVar.b : null, feVar.l1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, gjnVar != null ? gjnVar.c : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, gjn gjnVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        Field<List<com.yandex.div2.h0>> field = gjnVar.a;
        com.yandex.div2.fe feVar = this.a;
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", field, feVar.l1);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", gjnVar.b, feVar.l1);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "download");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", gjnVar.c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}

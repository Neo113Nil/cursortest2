package xsna;

import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes8.dex */
public final class pqn implements Serializer, TemplateDeserializer {
    public final com.yandex.div2.fe a;

    public pqn(com.yandex.div2.fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, com.yandex.div2.xd xdVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BadConnectionSignaling.KEY_BAD_NET_BITRATE, xdVar.a);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mime_type", xdVar.b);
        JsonFieldParser.writeField(parsingContext, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, xdVar.c, this.a.o9);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", xdVar.d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        com.yandex.div2.xd xdVar = (com.yandex.div2.xd) entityTemplate;
        JSONObject jSONObject = (JSONObject) obj;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new com.yandex.div2.xd(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, BadConnectionSignaling.KEY_BAD_NET_BITRATE, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, xdVar != null ? xdVar.a : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, xdVar != null ? xdVar.b : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, allowPropertyOverride, xdVar != null ? xdVar.c : null, this.a.o9), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, xdVar != null ? xdVar.d : null, ParsingConvertersKt.ANY_TO_URI));
    }
}

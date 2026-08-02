package com.yandex.div2;

import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.td;
import org.json.JSONObject;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes8.dex */
public final class ud implements Serializer, Deserializer {
    public final fe a;

    public ud(fe feVar) {
        this.a = feVar;
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject serialize(ParsingContext parsingContext, td tdVar) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, BadConnectionSignaling.KEY_BAD_NET_BITRATE, tdVar.a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mime_type", tdVar.b);
        JsonPropertyParser.write(parsingContext, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, tdVar.c, this.a.n9);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", tdVar.d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public final Object deserialize(ParsingContext parsingContext, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new td(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, BadConnectionSignaling.KEY_BAD_NET_BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (td.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, CommonCode.MapKey.HAS_RESOLUTION, this.a.n9), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}

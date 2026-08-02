package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.lr;
import xsna.rq;

/* compiled from: OffsetDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public final class he {

    @Deprecated
    public static final rq a = new rq(20);

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static ge a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new ge(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, he.a));
        }

        public static JSONObject b(ParsingContext parsingContext, ge geVar) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", SignalingProtocol.KEY_OFFSET);
            JsonExpressionParser.writeExpression(parsingContext, b, "value", geVar.a);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (ge) obj);
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static ie a(ParsingContext parsingContext, ie ieVar, JSONObject jSONObject) throws ParsingException {
            return new ie(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), ieVar != null ? ieVar.a : null, ParsingConvertersKt.NUMBER_TO_INT, he.a));
        }

        public static JSONObject b(ParsingContext parsingContext, ie ieVar) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", SignalingProtocol.KEY_OFFSET);
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", ieVar.a);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (ie) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (ie) obj);
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, ie, ge> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final ge resolve(ParsingContext parsingContext, ie ieVar, JSONObject jSONObject) {
            return new ge(JsonFieldResolver.resolveExpression(parsingContext, ieVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, he.a));
        }
    }
}

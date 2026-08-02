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
import xsna.lr;
import xsna.w11;

/* compiled from: IndexDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public final class de {

    @Deprecated
    public static final w11 a = new w11(20);

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static ce a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new ce(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, de.a));
        }

        public static JSONObject b(ParsingContext parsingContext, ce ceVar) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "index");
            JsonExpressionParser.writeExpression(parsingContext, b, "value", ceVar.a);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (ce) obj);
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static ee a(ParsingContext parsingContext, ee eeVar, JSONObject jSONObject) throws ParsingException {
            return new ee(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), eeVar != null ? eeVar.a : null, ParsingConvertersKt.NUMBER_TO_INT, de.a));
        }

        public static JSONObject b(ParsingContext parsingContext, ee eeVar) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "index");
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", eeVar.a);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (ee) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (ee) obj);
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, ee, ce> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final ce resolve(ParsingContext parsingContext, ee eeVar, JSONObject jSONObject) {
            return new ce(JsonFieldResolver.resolveExpression(parsingContext, eeVar.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, de.a));
        }
    }
}

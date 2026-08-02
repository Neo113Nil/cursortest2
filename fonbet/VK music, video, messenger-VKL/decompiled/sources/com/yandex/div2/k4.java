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

/* compiled from: DivFixedCountJsonParser.kt */
/* loaded from: classes8.dex */
public final class k4 {

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.k a = new io.reactivex.rxjava3.internal.operators.mixed.k(12);

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static j4 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new j4(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, k4.a));
        }

        public static JSONObject b(ParsingContext parsingContext, j4 j4Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, b, "value", j4Var.a);
            return b;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (j4) obj);
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static l4 a(ParsingContext parsingContext, l4 l4Var, JSONObject jSONObject) throws ParsingException {
            return new l4(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), l4Var != null ? l4Var.a : null, ParsingConvertersKt.NUMBER_TO_INT, k4.a));
        }

        public static JSONObject b(ParsingContext parsingContext, l4 l4Var) throws ParsingException {
            JSONObject b = lr.b(parsingContext, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, b, "value", l4Var.a);
            return b;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (l4) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (l4) obj);
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, l4, j4> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final j4 resolve(ParsingContext parsingContext, l4 l4Var, JSONObject jSONObject) {
            return new j4(JsonFieldResolver.resolveExpression(parsingContext, l4Var.a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, k4.a));
        }
    }
}

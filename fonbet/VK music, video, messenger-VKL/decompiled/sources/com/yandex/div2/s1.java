package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import xsna.et;

/* compiled from: DivBlurJsonParser.kt */
/* loaded from: classes8.dex */
public final class s1 {

    @Deprecated
    public static final et a = new et(11);

    /* compiled from: DivBlurJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public static r1 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            return new r1(JsonExpressionParser.readExpression(parsingContext, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, s1.a));
        }

        public static JSONObject b(ParsingContext parsingContext, r1 r1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "radius", r1Var.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (r1) obj);
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public static t1 a(ParsingContext parsingContext, t1 t1Var, JSONObject jSONObject) throws ParsingException {
            return new t1(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), t1Var != null ? t1Var.a : null, ParsingConvertersKt.NUMBER_TO_INT, s1.a));
        }

        public static JSONObject b(ParsingContext parsingContext, t1 t1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "radius", t1Var.a);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (t1) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (t1) obj);
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, t1, r1> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final r1 resolve(ParsingContext parsingContext, t1 t1Var, JSONObject jSONObject) {
            return new r1(JsonFieldResolver.resolveExpression(parsingContext, t1Var.a, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, s1.a));
        }
    }
}

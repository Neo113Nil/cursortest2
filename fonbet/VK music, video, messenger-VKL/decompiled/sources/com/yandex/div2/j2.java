package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivCircleShapeJsonParser.kt */
/* loaded from: classes8.dex */
public final class j2 {

    @Deprecated
    public static final q4 a = new q4(Expression.Companion.constant$default(Expression.Companion, 10L, null, 2, null));

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            fe feVar = this.a;
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", feVar.w3);
            if (q4Var == null) {
                q4Var = j2.a;
            }
            return new i2(readOptionalExpression, q4Var, (va) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", feVar.I7));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, i2 i2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", i2Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            q4 q4Var = i2Var.b;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", q4Var, feVar.w3);
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", i2Var.c, feVar.I7);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2 deserialize(ParsingContext parsingContext, k2 k2Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, k2Var != null ? k2Var.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<s4> field = k2Var != null ? k2Var.b : null;
            fe feVar = this.a;
            return new k2(readOptionalFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, field, feVar.x3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, k2Var != null ? k2Var.c : null, feVar.J7));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, k2 k2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", k2Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            Field<s4> field = k2Var.b;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", field, feVar.x3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", k2Var.c, feVar.J7);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, k2, i2> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2 resolve(ParsingContext parsingContext, k2 k2Var, JSONObject jSONObject) throws ParsingException {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, k2Var.a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<s4> field = k2Var.b;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "radius", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = j2.a;
            }
            return new i2(resolveOptionalExpression, q4Var, (va) JsonFieldResolver.resolveOptional(parsingContext, k2Var.c, jSONObject, "stroke", feVar.K7, feVar.I7));
        }
    }
}

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
import xsna.bpn0;

/* compiled from: DivRoundedRectangleShapeJsonParser.kt */
/* loaded from: classes8.dex */
public final class z8 {

    @Deprecated
    public static final q4 a;

    @Deprecated
    public static final q4 b;

    @Deprecated
    public static final q4 c;

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y8 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.w3;
            bpn0 bpn0Var2 = feVar.w3;
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", bpn0Var);
            if (q4Var == null) {
                q4Var = z8.a;
            }
            q4 q4Var2 = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", bpn0Var2);
            if (q4Var2 == null) {
                q4Var2 = z8.b;
            }
            q4 q4Var3 = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", bpn0Var2);
            if (q4Var3 == null) {
                q4Var3 = z8.c;
            }
            return new y8(readOptionalExpression, q4Var, q4Var2, q4Var3, (va) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", feVar.I7));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, y8 y8Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", y8Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            q4 q4Var = y8Var.b;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "corner_radius", q4Var, feVar.w3);
            q4 q4Var2 = y8Var.c;
            bpn0 bpn0Var = feVar.w3;
            JsonPropertyParser.write(parsingContext, jSONObject, "item_height", q4Var2, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_width", y8Var.d, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", y8Var.e, feVar.I7);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a9 deserialize(ParsingContext parsingContext, a9 a9Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, a9Var != null ? a9Var.a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<s4> field = a9Var != null ? a9Var.b : null;
            fe feVar = this.a;
            return new a9(readOptionalFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, field, feVar.x3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, a9Var != null ? a9Var.c : null, feVar.x3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, a9Var != null ? a9Var.d : null, feVar.x3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, a9Var != null ? a9Var.e : null, feVar.J7));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, a9 a9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", a9Var.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            Field<s4> field = a9Var.b;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "corner_radius", field, feVar.x3);
            Field<s4> field2 = a9Var.c;
            bpn0 bpn0Var = feVar.x3;
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_width", a9Var.d, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", a9Var.e, feVar.J7);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, a9, y8> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y8 resolve(ParsingContext parsingContext, a9 a9Var, JSONObject jSONObject) throws ParsingException {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, a9Var.a, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field<s4> field = a9Var.b;
            fe feVar = this.a;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "corner_radius", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = z8.a;
            }
            q4 q4Var2 = q4Var;
            q4 q4Var3 = (q4) JsonFieldResolver.resolveOptional(parsingContext, a9Var.c, jSONObject, "item_height", feVar.y3, feVar.w3);
            if (q4Var3 == null) {
                q4Var3 = z8.b;
            }
            q4 q4Var4 = q4Var3;
            q4 q4Var5 = (q4) JsonFieldResolver.resolveOptional(parsingContext, a9Var.d, jSONObject, "item_width", feVar.y3, feVar.w3);
            if (q4Var5 == null) {
                q4Var5 = z8.c;
            }
            return new y8(resolveOptionalExpression, q4Var2, q4Var4, q4Var5, (va) JsonFieldResolver.resolveOptional(parsingContext, a9Var.e, jSONObject, "stroke", feVar.K7, feVar.I7));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = new q4(Expression.Companion.constant$default(companion, 5L, null, 2, null));
        b = new q4(Expression.Companion.constant$default(companion, 10L, null, 2, null));
        c = new q4(Expression.Companion.constant$default(companion, 10L, null, 2, null));
    }
}

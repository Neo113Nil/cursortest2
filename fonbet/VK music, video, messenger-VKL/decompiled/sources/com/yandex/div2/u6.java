package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
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
import com.yandex.div2.v6;
import java.util.List;
import org.json.JSONObject;
import xsna.izs;
import xsna.u11;
import xsna.v11;
import xsna.w11;

/* compiled from: DivLinearGradientJsonParser.kt */
/* loaded from: classes8.dex */
public final class u6 {

    @Deprecated
    public static final Expression<Long> a = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    @Deprecated
    public static final u11 b = new u11(18);

    @Deprecated
    public static final v11 c = new v11(12);

    @Deprecated
    public static final w11 d = new w11(13);

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            u11 u11Var = u6.b;
            Expression<Long> expression = u6.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "angle", typeHelper, izsVar, u11Var, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new s6(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.a.S4, u6.d), JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, u6.c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, s6 s6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "angle", s6Var.a);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", s6Var.b, this.a.S4);
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", s6Var.c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6 deserialize(ParsingContext parsingContext, v6 v6Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new v6(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, v6Var != null ? v6Var.a : null, ParsingConvertersKt.NUMBER_TO_INT, u6.b), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, v6Var != null ? v6Var.b : null, this.a.T4, u6.d), JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, v6Var != null ? v6Var.c : null, ParsingConvertersKt.STRING_TO_COLOR_INT, u6.c));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, v6 v6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "angle", v6Var.a);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", v6Var.b, this.a.T4);
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", v6Var.c, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, v6, s6> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s6 resolve(ParsingContext parsingContext, v6 v6Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = v6Var.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            u11 u11Var = u6.b;
            Expression<Long> expression = u6.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "angle", typeHelper, izsVar, u11Var, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<List<v6.a>> field2 = v6Var.b;
            fe feVar = this.a;
            return new s6(expression, JsonFieldResolver.resolveOptionalList(parsingContext, field2, jSONObject, "color_map", feVar.U4, feVar.S4, u6.d), JsonFieldResolver.resolveOptionalExpressionList(parsingContext, v6Var.c, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, u6.c));
        }
    }
}

package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
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
import org.json.JSONObject;
import xsna.gp;
import xsna.izs;

/* compiled from: DivBorderJsonParser.kt */
/* loaded from: classes8.dex */
public final class v1 {

    @Deprecated
    public static final Expression<Boolean> a = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    @Deprecated
    public static final gp b = new gp(12);

    /* compiled from: DivBorderJsonParser.kt */
    public static final class a implements Serializer, Deserializer {
        public final fe a;

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, u1 u1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", u1Var.a);
            y2 y2Var = u1Var.b;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", y2Var, feVar.s2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_shadow", u1Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "shadow", u1Var.d, feVar.M6);
            JsonPropertyParser.write(parsingContext, jSONObject, "stroke", u1Var.e, feVar.I7);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, v1.b);
            fe feVar = this.a;
            y2 y2Var = (y2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", feVar.s2);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = v1.a;
            Expression<Boolean> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_shadow", typeHelper, izsVar, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            return new u1(readOptionalExpression, y2Var, expression, (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shadow", feVar.M6), (va) JsonPropertyParser.readOptional(parsingContext, jSONObject, "stroke", feVar.I7));
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class b implements Serializer, TemplateDeserializer {
        public final fe a;

        public b(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, w1 w1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", w1Var.a);
            Field<a3> field = w1Var.b;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", field, feVar.t2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_shadow", w1Var.c);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shadow", w1Var.d, feVar.N6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "stroke", w1Var.e, feVar.J7);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            w1 w1Var = (w1) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, w1Var != null ? w1Var.a : null, ParsingConvertersKt.NUMBER_TO_INT, v1.b);
            Field<a3> field = w1Var != null ? w1Var.b : null;
            fe feVar = this.a;
            return new w1(readOptionalFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, field, feVar.t2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, w1Var != null ? w1Var.c : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "shadow", allowPropertyOverride, w1Var != null ? w1Var.d : null, feVar.N6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "stroke", allowPropertyOverride, w1Var != null ? w1Var.e : null, feVar.J7));
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class c implements TemplateResolver<JSONObject, w1, u1> {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final u1 resolve(ParsingContext parsingContext, w1 w1Var, JSONObject jSONObject) {
            w1 w1Var2 = w1Var;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, w1Var2.a, jSONObject2, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, v1.b);
            Field<a3> field = w1Var2.b;
            fe feVar = this.a;
            y2 y2Var = (y2) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject2, "corners_radius", feVar.u2, feVar.s2);
            Field<Expression<Boolean>> field2 = w1Var2.c;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression = v1.a;
            Expression<Boolean> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "has_shadow", typeHelper, izsVar, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new u1(resolveOptionalExpression, y2Var, expression, (n9) JsonFieldResolver.resolveOptional(parsingContext, w1Var2.d, jSONObject2, "shadow", feVar.O6, feVar.M6), (va) JsonFieldResolver.resolveOptional(parsingContext, w1Var2.e, jSONObject2, "stroke", feVar.K7, feVar.I7));
        }
    }
}

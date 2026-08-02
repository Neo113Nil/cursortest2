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
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.dt;
import xsna.eq0;
import xsna.et;
import xsna.gp;
import xsna.izs;

/* compiled from: DivPageTransformationOverlapJsonParser.kt */
/* loaded from: classes8.dex */
public final class h7 {

    @Deprecated
    public static final Expression<DivAnimationInterpolator> a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Double> c;

    @Deprecated
    public static final Expression<Double> d;

    @Deprecated
    public static final Expression<Double> e;

    @Deprecated
    public static final Expression<Boolean> f;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> g;

    @Deprecated
    public static final dt h;

    @Deprecated
    public static final et i;

    @Deprecated
    public static final gp j;

    @Deprecated
    public static final eq0 k;

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static g7 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = h7.g;
            izs<String, DivAnimationInterpolator> izsVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = h7.a;
            Expression<DivAnimationInterpolator> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, izsVar, expression);
            Expression<DivAnimationInterpolator> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            dt dtVar = h7.h;
            Expression<Double> expression3 = h7.b;
            Expression<Double> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, izsVar2, dtVar, expression3);
            Expression<Double> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            et etVar = h7.i;
            Expression<Double> expression5 = h7.c;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, izsVar2, etVar, expression5);
            Expression<Double> expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            gp gpVar = h7.j;
            Expression<Double> expression7 = h7.d;
            Expression<Double> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, izsVar2, gpVar, expression7);
            Expression<Double> expression8 = readOptionalExpression4 == null ? expression7 : readOptionalExpression4;
            eq0 eq0Var = h7.k;
            Expression<Double> expression9 = h7.e;
            Expression<Double> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, izsVar2, eq0Var, expression9);
            Expression<Double> expression10 = readOptionalExpression5 == null ? expression9 : readOptionalExpression5;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression11 = h7.f;
            Expression<Boolean> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reversed_stacking_order", typeHelper3, izsVar3, expression11);
            return new g7(expression2, expression4, expression6, expression8, expression10, readOptionalExpression6 == null ? expression11 : readOptionalExpression6);
        }

        public static JSONObject b(ParsingContext parsingContext, g7 g7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", g7Var.a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", g7Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", g7Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", g7Var.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", g7Var.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reversed_stacking_order", g7Var.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (g7) obj);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static i7 a(ParsingContext parsingContext, i7 i7Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", h7.g, allowPropertyOverride, i7Var != null ? i7Var.a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = i7Var != null ? i7Var.b : null;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new i7(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, izsVar, h7.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, i7Var != null ? i7Var.c : null, izsVar, h7.i), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, i7Var != null ? i7Var.d : null, izsVar, h7.j), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, i7Var != null ? i7Var.e : null, izsVar, h7.k), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, i7Var != null ? i7Var.f : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        public static JSONObject b(ParsingContext parsingContext, i7 i7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", i7Var.a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", i7Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", i7Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", i7Var.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", i7Var.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reversed_stacking_order", i7Var.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (i7) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (i7) obj);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, i7, g7> {
        public static g7 a(ParsingContext parsingContext, i7 i7Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = i7Var.a;
            TypeHelper<DivAnimationInterpolator> typeHelper = h7.g;
            izs<String, DivAnimationInterpolator> izsVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = h7.a;
            Expression<DivAnimationInterpolator> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = i7Var.b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            dt dtVar = h7.h;
            Expression<Double> expression2 = h7.b;
            Expression<Double> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, izsVar2, dtVar, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Double>> field3 = i7Var.c;
            et etVar = h7.i;
            Expression<Double> expression3 = h7.c;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, izsVar2, etVar, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<Expression<Double>> field4 = i7Var.d;
            gp gpVar = h7.j;
            Expression<Double> expression4 = h7.d;
            Expression<Double> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, izsVar2, gpVar, expression4);
            if (resolveOptionalExpression4 == null) {
                resolveOptionalExpression4 = expression4;
            }
            Field<Expression<Double>> field5 = i7Var.e;
            eq0 eq0Var = h7.k;
            Expression<Double> expression5 = h7.e;
            Expression<Double> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, izsVar2, eq0Var, expression5);
            if (resolveOptionalExpression5 == null) {
                resolveOptionalExpression5 = expression5;
            }
            Field<Expression<Boolean>> field6 = i7Var.f;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = h7.f;
            Expression<Boolean> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "reversed_stacking_order", typeHelper3, izsVar3, expression6);
            return new g7(expression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6 == null ? expression6 : resolveOptionalExpression6);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ g7 resolve(ParsingContext parsingContext, i7 i7Var, JSONObject jSONObject) {
            return a(parsingContext, i7Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        a = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        b = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        c = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        d = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        e = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        f = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        g = TypeHelper.Companion.from(divAnimationInterpolator, a.i);
        h = new dt(9);
        i = new et(12);
        j = new gp(13);
        k = new eq0(9);
    }
}

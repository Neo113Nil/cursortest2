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
import xsna.izs;
import xsna.k73;
import xsna.pm0;
import xsna.tf3;
import xsna.uf3;

/* compiled from: DivPageTransformationSlideJsonParser.kt */
/* loaded from: classes8.dex */
public final class k7 {

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
    public static final TypeHelper<DivAnimationInterpolator> f;

    @Deprecated
    public static final k73 g;

    @Deprecated
    public static final pm0 h;

    @Deprecated
    public static final tf3 i;

    @Deprecated
    public static final uf3 j;

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static j7 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<DivAnimationInterpolator> typeHelper = k7.f;
            izs<String, DivAnimationInterpolator> izsVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = k7.a;
            Expression<DivAnimationInterpolator> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, izsVar, expression);
            Expression<DivAnimationInterpolator> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            k73 k73Var = k7.g;
            Expression<Double> expression3 = k7.b;
            Expression<Double> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, izsVar2, k73Var, expression3);
            Expression<Double> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            pm0 pm0Var = k7.h;
            Expression<Double> expression5 = k7.c;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, izsVar2, pm0Var, expression5);
            Expression<Double> expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            tf3 tf3Var = k7.i;
            Expression<Double> expression7 = k7.d;
            Expression<Double> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, izsVar2, tf3Var, expression7);
            Expression<Double> expression8 = readOptionalExpression4 == null ? expression7 : readOptionalExpression4;
            uf3 uf3Var = k7.j;
            Expression<Double> expression9 = k7.e;
            Expression<Double> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, izsVar2, uf3Var, expression9);
            return new j7(expression2, expression4, expression6, expression8, readOptionalExpression5 == null ? expression9 : readOptionalExpression5);
        }

        public static JSONObject b(ParsingContext parsingContext, j7 j7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", j7Var.a, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", j7Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", j7Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", j7Var.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", j7Var.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (j7) obj);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static l7 a(ParsingContext parsingContext, l7 l7Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", k7.f, allowPropertyOverride, l7Var != null ? l7Var.a : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field = l7Var != null ? l7Var.b : null;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new l7(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, izsVar, k7.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, l7Var != null ? l7Var.c : null, izsVar, k7.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, l7Var != null ? l7Var.d : null, izsVar, k7.i), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, l7Var != null ? l7Var.e : null, izsVar, k7.j));
        }

        public static JSONObject b(ParsingContext parsingContext, l7 l7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", l7Var.a, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", l7Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", l7Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", l7Var.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", l7Var.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (l7) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (l7) obj);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, l7, j7> {
        public static j7 a(ParsingContext parsingContext, l7 l7Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<DivAnimationInterpolator>> field = l7Var.a;
            TypeHelper<DivAnimationInterpolator> typeHelper = k7.f;
            izs<String, DivAnimationInterpolator> izsVar = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression = k7.a;
            Expression<DivAnimationInterpolator> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, izsVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<Double>> field2 = l7Var.b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            k73 k73Var = k7.g;
            Expression<Double> expression2 = k7.b;
            Expression<Double> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, izsVar2, k73Var, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Double>> field3 = l7Var.c;
            pm0 pm0Var = k7.h;
            Expression<Double> expression3 = k7.c;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, izsVar2, pm0Var, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<Expression<Double>> field4 = l7Var.d;
            tf3 tf3Var = k7.i;
            Expression<Double> expression4 = k7.d;
            Expression<Double> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, izsVar2, tf3Var, expression4);
            if (resolveOptionalExpression4 == null) {
                resolveOptionalExpression4 = expression4;
            }
            Field<Expression<Double>> field5 = l7Var.e;
            uf3 uf3Var = k7.j;
            Expression<Double> expression5 = k7.e;
            Expression<Double> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, izsVar2, uf3Var, expression5);
            return new j7(expression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalExpression4, resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ j7 resolve(ParsingContext parsingContext, l7 l7Var, JSONObject jSONObject) {
            return a(parsingContext, l7Var, jSONObject);
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
        f = TypeHelper.Companion.from(divAnimationInterpolator, a.i);
        g = new k73(11);
        h = new pm0(13);
        i = new tf3(10);
        j = new uf3(7);
    }
}

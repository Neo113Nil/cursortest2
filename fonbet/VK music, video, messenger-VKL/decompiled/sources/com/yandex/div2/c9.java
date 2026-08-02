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
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.izs;
import xsna.nq;
import xsna.oq;
import xsna.pq;

/* compiled from: DivScaleTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class c9 {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> b;

    @Deprecated
    public static final Expression<Double> c;

    @Deprecated
    public static final Expression<Double> d;

    @Deprecated
    public static final Expression<Double> e;

    @Deprecated
    public static final Expression<Long> f;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> g;

    @Deprecated
    public static final xsna.l4 h;

    @Deprecated
    public static final nq i;

    @Deprecated
    public static final oq j;

    @Deprecated
    public static final pq k;

    @Deprecated
    public static final xsna.j8 l;

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static b9 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            xsna.l4 l4Var = c9.h;
            Expression<Long> expression = c9.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, l4Var, expression);
            Expression<Long> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = c9.g;
            izs<String, DivAnimationInterpolator> izsVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = c9.b;
            Expression<DivAnimationInterpolator> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, izsVar2, expression3);
            Expression<DivAnimationInterpolator> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            nq nqVar = c9.i;
            Expression<Double> expression5 = c9.c;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_x", typeHelper3, izsVar3, nqVar, expression5);
            Expression<Double> expression6 = readOptionalExpression3 == null ? expression5 : readOptionalExpression3;
            oq oqVar = c9.j;
            Expression<Double> expression7 = c9.d;
            Expression<Double> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_y", typeHelper3, izsVar3, oqVar, expression7);
            Expression<Double> expression8 = readOptionalExpression4 == null ? expression7 : readOptionalExpression4;
            pq pqVar = c9.k;
            Expression<Double> expression9 = c9.e;
            Expression<Double> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper3, izsVar3, pqVar, expression9);
            if (readOptionalExpression5 != null) {
                expression9 = readOptionalExpression5;
            }
            xsna.j8 j8Var = c9.l;
            Expression<Long> expression10 = c9.f;
            Expression<Long> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, izsVar, j8Var, expression10);
            return new b9(expression2, expression4, expression6, expression8, expression9, readOptionalExpression6 == null ? expression10 : readOptionalExpression6);
        }

        public static JSONObject b(ParsingContext parsingContext, b9 b9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", b9Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", b9Var.b, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_x", b9Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_y", b9Var.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", b9Var.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", b9Var.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (b9) obj);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static d9 a(ParsingContext parsingContext, d9 d9Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = d9Var != null ? d9Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, c9.h);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", c9.g, allowPropertyOverride, d9Var != null ? d9Var.b : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = d9Var != null ? d9Var.c : null;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new d9(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "pivot_x", typeHelper2, allowPropertyOverride, field2, izsVar2, c9.i), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "pivot_y", typeHelper2, allowPropertyOverride, d9Var != null ? d9Var.d : null, izsVar2, c9.j), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", typeHelper2, allowPropertyOverride, d9Var != null ? d9Var.e : null, izsVar2, c9.k), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, d9Var != null ? d9Var.f : null, izsVar, c9.l));
        }

        public static JSONObject b(ParsingContext parsingContext, d9 d9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", d9Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", d9Var.b, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_x", d9Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_y", d9Var.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", d9Var.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", d9Var.f);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (d9) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (d9) obj);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, d9, b9> {
        public static b9 a(ParsingContext parsingContext, d9 d9Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = d9Var.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            xsna.l4 l4Var = c9.h;
            Expression<Long> expression = c9.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, izsVar, l4Var, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<DivAnimationInterpolator>> field2 = d9Var.b;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = c9.g;
            izs<String, DivAnimationInterpolator> izsVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = c9.b;
            Expression<DivAnimationInterpolator> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Double>> field3 = d9Var.c;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            nq nqVar = c9.i;
            Expression<Double> expression3 = c9.c;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "pivot_x", typeHelper3, izsVar3, nqVar, expression3);
            Expression<Double> expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            Field<Expression<Double>> field4 = d9Var.d;
            oq oqVar = c9.j;
            Expression<Double> expression5 = c9.d;
            Expression<Double> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "pivot_y", typeHelper3, izsVar3, oqVar, expression5);
            Expression<Double> expression6 = resolveOptionalExpression4 == null ? expression5 : resolveOptionalExpression4;
            Field<Expression<Double>> field5 = d9Var.e;
            pq pqVar = c9.k;
            Expression<Double> expression7 = c9.e;
            Expression<Double> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper3, izsVar3, pqVar, expression7);
            if (resolveOptionalExpression5 != null) {
                expression7 = resolveOptionalExpression5;
            }
            Field<Expression<Long>> field6 = d9Var.f;
            xsna.j8 j8Var = c9.l;
            Expression<Long> expression8 = c9.f;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper, izsVar, j8Var, expression8);
            return new b9(resolveOptionalExpression, resolveOptionalExpression2, expression4, expression6, expression7, resolveOptionalExpression6 == null ? expression8 : resolveOptionalExpression6);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ b9 resolve(ParsingContext parsingContext, d9 d9Var, JSONObject jSONObject) {
            return a(parsingContext, d9Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        c = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        d = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        e = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        g = TypeHelper.Companion.from(divAnimationInterpolator, a.i);
        h = new xsna.l4(15);
        i = new nq(10);
        j = new oq(11);
        k = new pq(7);
        l = new xsna.j8(10);
    }
}

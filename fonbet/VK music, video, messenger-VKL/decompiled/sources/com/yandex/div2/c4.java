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
import xsna.xq;
import xsna.yq;

/* compiled from: DivFadeTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class c4 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> e;

    @Deprecated
    public static final xq f;

    @Deprecated
    public static final yq g;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.j h;

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static b4 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            xq xqVar = c4.f;
            Expression<Double> expression = c4.a;
            Expression<Double> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, xqVar, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            yq yqVar = c4.g;
            Expression<Long> expression2 = c4.b;
            Expression<Long> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper2, izsVar2, yqVar, expression2);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression2;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper3 = c4.e;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = c4.c;
            Expression<DivAnimationInterpolator> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, izsVar3, expression3);
            if (readOptionalExpression3 == null) {
                readOptionalExpression3 = expression3;
            }
            io.reactivex.rxjava3.internal.operators.mixed.j jVar = c4.h;
            Expression<Long> expression4 = c4.d;
            Expression<Long> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, izsVar2, jVar, expression4);
            if (readOptionalExpression4 != null) {
                expression4 = readOptionalExpression4;
            }
            return new b4(expression, readOptionalExpression2, readOptionalExpression3, expression4);
        }

        public static JSONObject b(ParsingContext parsingContext, b4 b4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", b4Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", b4Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", b4Var.c, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", b4Var.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (b4) obj);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static d4 a(ParsingContext parsingContext, d4 d4Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, d4Var != null ? d4Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, c4.f);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = d4Var != null ? d4Var.b : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new d4(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, c4.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", c4.e, allowPropertyOverride, d4Var != null ? d4Var.c : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, d4Var != null ? d4Var.d : null, izsVar, c4.h));
        }

        public static JSONObject b(ParsingContext parsingContext, d4 d4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", d4Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", d4Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", d4Var.c, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", d4Var.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (d4) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (d4) obj);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, d4, b4> {
        public static b4 a(ParsingContext parsingContext, d4 d4Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = d4Var.a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            xq xqVar = c4.f;
            Expression<Double> expression = c4.a;
            Expression<Double> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, izsVar, xqVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<Long>> field2 = d4Var.b;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            yq yqVar = c4.g;
            Expression<Long> expression2 = c4.b;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper2, izsVar2, yqVar, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<DivAnimationInterpolator>> field3 = d4Var.c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = c4.e;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = c4.c;
            Expression<DivAnimationInterpolator> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, izsVar3, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field4 = d4Var.d;
            io.reactivex.rxjava3.internal.operators.mixed.j jVar = c4.h;
            Expression<Long> expression4 = c4.d;
            Expression<Long> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper2, izsVar2, jVar, expression4);
            if (resolveOptionalExpression4 == null) {
                resolveOptionalExpression4 = expression4;
            }
            return new b4(expression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalExpression4);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ b4 resolve(ParsingContext parsingContext, d4 d4Var, JSONObject jSONObject) {
            return a(parsingContext, d4Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        b = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        e = TypeHelper.Companion.from(divAnimationInterpolator, a.i);
        f = new xq(12);
        g = new yq(11);
        h = new io.reactivex.rxjava3.internal.operators.mixed.j(13);
    }
}

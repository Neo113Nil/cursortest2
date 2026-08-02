package com.yandex.div2;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
import com.yandex.div2.b3;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bt;
import xsna.ct;
import xsna.izs;

/* compiled from: DivNumberAnimatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class a7 {

    @Deprecated
    public static final Expression<DivAnimationDirection> a;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> b;

    @Deprecated
    public static final b3.a c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final TypeHelper<DivAnimationDirection> e;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f;

    @Deprecated
    public static final bt g;

    @Deprecated
    public static final ct h;

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationDirection);
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z6 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", feVar.k1);
            TypeHelper<DivAnimationDirection> typeHelper = a7.e;
            izs<String, DivAnimationDirection> izsVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = a7.a;
            Expression<DivAnimationDirection> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, izsVar, expression);
            Expression<DivAnimationDirection> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, izsVar2, a7.g);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", feVar.k1);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, izsVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = a7.f;
            izs<String, DivAnimationInterpolator> izsVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = a7.b;
            Expression<DivAnimationInterpolator> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, izsVar4, expression3);
            Expression<DivAnimationInterpolator> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            b3 b3Var = (b3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", feVar.v2);
            if (b3Var == null) {
                b3Var = a7.c;
            }
            b3 b3Var2 = b3Var;
            ct ctVar = a7.h;
            Expression<Long> expression5 = a7.d;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, izsVar2, ctVar, expression5);
            if (readOptionalExpression3 != null) {
                expression5 = readOptionalExpression3;
            }
            return new z6(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression4, b3Var2, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, izsVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, z6 z6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            List<DivAction> list = z6Var.a;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", list, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, z6Var.b, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", z6Var.c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", z6Var.d, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", z6Var.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", z6Var.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", z6Var.g, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", z6Var.h, feVar.v2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", z6Var.i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", z6Var.j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", z6Var.k);
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b7 deserialize(ParsingContext parsingContext, b7 b7Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<h0>> field = b7Var != null ? b7Var.a : null;
            fe feVar = this.a;
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, field, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, a7.e, allowPropertyOverride, b7Var != null ? b7Var.b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = b7Var != null ? b7Var.c : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, izsVar, a7.g);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, b7Var != null ? b7Var.d : null, feVar.l1);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = b7Var != null ? b7Var.e : null;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new b7(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field3, izsVar2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, b7Var != null ? b7Var.f : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", a7.f, allowPropertyOverride, b7Var != null ? b7Var.g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, b7Var != null ? b7Var.h : null, feVar.w2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, b7Var != null ? b7Var.i : null, izsVar, a7.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, b7Var != null ? b7Var.j : null, izsVar2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, b7Var != null ? b7Var.k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, b7 b7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<List<h0>> field = b7Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", field, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, b7Var.b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", b7Var.c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", b7Var.d, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", b7Var.e);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", b7Var.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", b7Var.g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", b7Var.h, feVar.w2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", b7Var.i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", b7Var.j);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", b7Var.k);
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, b7, z6> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z6 resolve(ParsingContext parsingContext, b7 b7Var, JSONObject jSONObject) throws ParsingException {
            Field<List<h0>> field = b7Var.a;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "cancel_actions", feVar.m1, feVar.k1);
            Field<Expression<DivAnimationDirection>> field2 = b7Var.b;
            TypeHelper<DivAnimationDirection> typeHelper = a7.e;
            izs<String, DivAnimationDirection> izsVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = a7.a;
            Expression<DivAnimationDirection> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, izsVar, expression);
            Expression<DivAnimationDirection> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Long>> field3 = b7Var.c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "duration", typeHelper2, izsVar2, a7.g);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, b7Var.d, jSONObject, "end_actions", feVar.m1, feVar.k1);
            Field<Expression<Double>> field4 = b7Var.e;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field4, jSONObject, "end_value", typeHelper3, izsVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, b7Var.f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field5 = b7Var.g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = a7.f;
            izs<String, DivAnimationInterpolator> izsVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = a7.b;
            Expression<DivAnimationInterpolator> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "interpolator", typeHelper4, izsVar4, expression3);
            Expression<DivAnimationInterpolator> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            b3 b3Var = (b3) JsonFieldResolver.resolveOptional(parsingContext, b7Var.h, jSONObject, "repeat_count", feVar.x2, feVar.v2);
            if (b3Var == null) {
                b3Var = a7.c;
            }
            b3 b3Var2 = b3Var;
            Field<Expression<Long>> field6 = b7Var.i;
            ct ctVar = a7.h;
            Expression<Long> expression5 = a7.d;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper2, izsVar2, ctVar, expression5);
            if (resolveOptionalExpression3 != null) {
                expression5 = resolveOptionalExpression3;
            }
            return new z6(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression4, b3Var2, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, b7Var.j, jSONObject, "start_value", typeHelper3, izsVar3), (String) JsonFieldResolver.resolve(parsingContext, b7Var.k, jSONObject, "variable_name"));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        a = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        c = new b3.a(new j4(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        e = companion2.from(divAnimationDirection, a.i);
        f = companion2.from(divAnimationInterpolator, b.i);
        g = new bt(10);
        h = new ct(8);
    }
}

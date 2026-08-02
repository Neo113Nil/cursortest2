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
import xsna.izs;
import xsna.up;
import xsna.vp;

/* compiled from: DivColorAnimatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class t2 {

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
    public static final up g;

    @Deprecated
    public static final vp h;

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationDirection);
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s2 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", feVar.k1);
            TypeHelper<DivAnimationDirection> typeHelper = t2.e;
            izs<String, DivAnimationDirection> izsVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = t2.a;
            Expression<DivAnimationDirection> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, izsVar, expression);
            Expression<DivAnimationDirection> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "duration", typeHelper2, izsVar2, t2.g);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", feVar.k1);
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, izsVar3);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper<DivAnimationInterpolator> typeHelper4 = t2.f;
            izs<String, DivAnimationInterpolator> izsVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = t2.b;
            Expression<DivAnimationInterpolator> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, izsVar4, expression3);
            Expression<DivAnimationInterpolator> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            b3 b3Var = (b3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", feVar.v2);
            if (b3Var == null) {
                b3Var = t2.c;
            }
            b3 b3Var2 = b3Var;
            vp vpVar = t2.h;
            Expression<Long> expression5 = t2.d;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, izsVar2, vpVar, expression5);
            if (readOptionalExpression3 != null) {
                expression5 = readOptionalExpression3;
            }
            return new s2(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression4, b3Var2, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, izsVar3), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, s2 s2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            List<DivAction> list = s2Var.a;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", list, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, s2Var.b, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", s2Var.c);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", s2Var.d, feVar.k1);
            Expression<Integer> expression = s2Var.e;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", expression, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", s2Var.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", s2Var.g, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", s2Var.h, feVar.v2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", s2Var.i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", s2Var.j, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", s2Var.k);
            return jSONObject;
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2 deserialize(ParsingContext parsingContext, u2 u2Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<h0>> field = u2Var != null ? u2Var.a : null;
            fe feVar = this.a;
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, field, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, t2.e, allowPropertyOverride, u2Var != null ? u2Var.b : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = u2Var != null ? u2Var.c : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field2, izsVar, t2.g);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, u2Var != null ? u2Var.d : null, feVar.l1);
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field3 = u2Var != null ? u2Var.e : null;
            izs<Object, Integer> izsVar2 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new u2(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field3, izsVar2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, u2Var != null ? u2Var.f : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", t2.f, allowPropertyOverride, u2Var != null ? u2Var.g : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, u2Var != null ? u2Var.h : null, feVar.w2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, u2Var != null ? u2Var.i : null, izsVar, t2.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, u2Var != null ? u2Var.j : null, izsVar2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, u2Var != null ? u2Var.k : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, u2 u2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<List<h0>> field = u2Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", field, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, u2Var.b, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", u2Var.c);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", u2Var.d, feVar.l1);
            Field<Expression<Integer>> field2 = u2Var.e;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", field2, izsVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", u2Var.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", u2Var.g, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", u2Var.h, feVar.w2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", u2Var.i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", u2Var.j, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", u2Var.k);
            return jSONObject;
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, u2, s2> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s2 resolve(ParsingContext parsingContext, u2 u2Var, JSONObject jSONObject) throws ParsingException {
            Field<List<h0>> field = u2Var.a;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "cancel_actions", feVar.m1, feVar.k1);
            Field<Expression<DivAnimationDirection>> field2 = u2Var.b;
            TypeHelper<DivAnimationDirection> typeHelper = t2.e;
            izs<String, DivAnimationDirection> izsVar = DivAnimationDirection.FROM_STRING;
            Expression<DivAnimationDirection> expression = t2.a;
            Expression<DivAnimationDirection> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, typeHelper, izsVar, expression);
            Expression<DivAnimationDirection> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Long>> field3 = u2Var.c;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "duration", typeHelper2, izsVar2, t2.g);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, u2Var.d, jSONObject, "end_actions", feVar.m1, feVar.k1);
            Field<Expression<Integer>> field4 = u2Var.e;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field4, jSONObject, "end_value", typeHelper3, izsVar3);
            String str = (String) JsonFieldResolver.resolve(parsingContext, u2Var.f, jSONObject, "id");
            Field<Expression<DivAnimationInterpolator>> field5 = u2Var.g;
            TypeHelper<DivAnimationInterpolator> typeHelper4 = t2.f;
            izs<String, DivAnimationInterpolator> izsVar4 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = t2.b;
            Expression<DivAnimationInterpolator> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "interpolator", typeHelper4, izsVar4, expression3);
            Expression<DivAnimationInterpolator> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            b3 b3Var = (b3) JsonFieldResolver.resolveOptional(parsingContext, u2Var.h, jSONObject, "repeat_count", feVar.x2, feVar.v2);
            if (b3Var == null) {
                b3Var = t2.c;
            }
            b3 b3Var2 = b3Var;
            Field<Expression<Long>> field6 = u2Var.i;
            vp vpVar = t2.h;
            Expression<Long> expression5 = t2.d;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper2, izsVar2, vpVar, expression5);
            if (resolveOptionalExpression3 != null) {
                expression5 = resolveOptionalExpression3;
            }
            return new s2(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression4, b3Var2, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, u2Var.j, jSONObject, "start_value", typeHelper3, izsVar3), (String) JsonFieldResolver.resolve(parsingContext, u2Var.k, jSONObject, "variable_name"));
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
        g = new up(10);
        h = new vp(12);
    }
}

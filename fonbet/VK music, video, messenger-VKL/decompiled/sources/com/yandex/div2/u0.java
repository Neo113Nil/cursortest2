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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.b3;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.at;
import xsna.izs;
import xsna.rl3;
import xsna.w11;
import xsna.wln;

/* compiled from: DivAnimationJsonParser.kt */
/* loaded from: classes8.dex */
public final class u0 {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> b;

    @Deprecated
    public static final b3.b c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> e;

    @Deprecated
    public static final TypeHelper<DivAnimation.Name> f;

    @Deprecated
    public static final w11 g;

    @Deprecated
    public static final at h;

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimation.Name);
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivAnimation divAnimation) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divAnimation.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divAnimation.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divAnimation.c, DivAnimationInterpolator.TO_STRING);
            List<DivAnimation> list = divAnimation.d;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", list, feVar.q1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divAnimation.e, DivAnimation.Name.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat", divAnimation.f, feVar.v2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divAnimation.g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divAnimation.h);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            w11 w11Var = u0.g;
            Expression<Long> expression = u0.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, w11Var, expression);
            Expression<Long> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end_value", typeHelper2, izsVar2);
            TypeHelper<DivAnimationInterpolator> typeHelper3 = u0.e;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = u0.b;
            Expression<DivAnimationInterpolator> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, izsVar3, expression3);
            Expression<DivAnimationInterpolator> expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            fe feVar = this.a;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.q1);
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", u0.f, DivAnimation.Name.FROM_STRING);
            b3 b3Var = (b3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat", feVar.v2);
            if (b3Var == null) {
                b3Var = u0.c;
            }
            b3 b3Var2 = b3Var;
            at atVar = u0.h;
            Expression<Long> expression5 = u0.d;
            Expression<Long> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, izsVar, atVar, expression5);
            return new DivAnimation(expression2, readOptionalExpression2, expression4, readOptionalList, readExpression, b3Var2, readOptionalExpression4 == null ? expression5 : readOptionalExpression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, izsVar2));
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, v0 v0Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", v0Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", v0Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", v0Var.c, DivAnimationInterpolator.TO_STRING);
            Field<List<v0>> field = v0Var.d;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", field, feVar.r1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", v0Var.e, DivAnimation.Name.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat", v0Var.f, feVar.w2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", v0Var.g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", v0Var.h);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            v0 v0Var = (v0) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = v0Var != null ? v0Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, u0.g);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = v0Var != null ? v0Var.b : null;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, izsVar2);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", u0.e, allowPropertyOverride, v0Var != null ? v0Var.c : null, DivAnimationInterpolator.FROM_STRING);
            Field<List<v0>> field3 = v0Var != null ? v0Var.d : null;
            fe feVar = this.a;
            return new v0(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field3, feVar.r1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "name", u0.f, allowPropertyOverride, v0Var != null ? v0Var.e : null, DivAnimation.Name.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat", allowPropertyOverride, v0Var != null ? v0Var.f : null, feVar.w2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, v0Var != null ? v0Var.g : null, izsVar, u0.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, v0Var != null ? v0Var.h : null, izsVar2));
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, v0, DivAnimation> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivAnimation resolve(ParsingContext parsingContext, v0 v0Var, JSONObject jSONObject) {
            v0 v0Var2 = v0Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = v0Var2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            w11 w11Var = u0.g;
            Expression<Long> expression = u0.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "duration", typeHelper, izsVar, w11Var, expression);
            Expression<Long> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Double>> field2 = v0Var2.b;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "end_value", typeHelper2, izsVar2);
            Field<Expression<DivAnimationInterpolator>> field3 = v0Var2.c;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = u0.e;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = u0.b;
            Expression<DivAnimationInterpolator> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "interpolator", typeHelper3, izsVar3, expression3);
            Expression<DivAnimationInterpolator> expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            Field<List<v0>> field4 = v0Var2.d;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field4, jSONObject2, "items", feVar.s1, feVar.q1);
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, v0Var2.e, jSONObject2, "name", u0.f, DivAnimation.Name.FROM_STRING);
            b3 b3Var = (b3) JsonFieldResolver.resolveOptional(parsingContext, v0Var2.f, jSONObject2, "repeat", feVar.x2, feVar.v2);
            if (b3Var == null) {
                b3Var = u0.c;
            }
            b3 b3Var2 = b3Var;
            Field<Expression<Long>> field5 = v0Var2.g;
            at atVar = u0.h;
            Expression<Long> expression5 = u0.d;
            Expression<Long> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "start_delay", typeHelper, izsVar, atVar, expression5);
            return new DivAnimation(expression2, resolveOptionalExpression2, expression4, resolveOptionalList, resolveExpression, b3Var2, resolveOptionalExpression4 == null ? expression5 : resolveOptionalExpression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, v0Var2.h, jSONObject2, "start_value", typeHelper2, izsVar2));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.SPRING;
        b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        c = new b3.b(new wln());
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        e = companion2.from(divAnimationInterpolator, a.i);
        f = companion2.from(rl3.L(DivAnimation.Name.values()), b.i);
        g = new w11(12);
        h = new at(14);
    }
}

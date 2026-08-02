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
import com.yandex.div2.DivSlideTransition;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.br;
import xsna.cr;
import xsna.izs;

/* compiled from: DivSlideTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class da {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<DivSlideTransition.Edge> b;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final TypeHelper<DivSlideTransition.Edge> e;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> f;

    @Deprecated
    public static final br g;

    @Deprecated
    public static final cr h;

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSlideTransition.Edge);
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivSlideTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            s3 s3Var = (s3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "distance", this.a.M2);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            br brVar = da.g;
            Expression<Long> expression = da.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, brVar, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = da.e;
            izs<String, DivSlideTransition.Edge> izsVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = da.b;
            Expression<DivSlideTransition.Edge> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", typeHelper2, izsVar2, expression2);
            Expression<DivSlideTransition.Edge> expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = da.f;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression4 = da.c;
            Expression<DivAnimationInterpolator> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, izsVar3, expression4);
            Expression<DivAnimationInterpolator> expression5 = readOptionalExpression3 == null ? expression4 : readOptionalExpression3;
            cr crVar = da.h;
            Expression<Long> expression6 = da.d;
            Expression<Long> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, izsVar, crVar, expression6);
            return new DivSlideTransition(s3Var, readOptionalExpression, expression3, expression5, readOptionalExpression4 == null ? expression6 : readOptionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivSlideTransition divSlideTransition) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "distance", divSlideTransition.a, this.a.M2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", divSlideTransition.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "edge", divSlideTransition.c, DivSlideTransition.Edge.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divSlideTransition.d, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divSlideTransition.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ea deserialize(ParsingContext parsingContext, ea eaVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "distance", allowPropertyOverride, eaVar != null ? eaVar.a : null, this.a.N2);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = eaVar != null ? eaVar.b : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new ea(readOptionalField, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, da.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "edge", da.e, allowPropertyOverride, eaVar != null ? eaVar.c : null, DivSlideTransition.Edge.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", da.f, allowPropertyOverride, eaVar != null ? eaVar.d : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, eaVar != null ? eaVar.e : null, izsVar, da.h));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ea eaVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "distance", eaVar.a, this.a.N2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", eaVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "edge", eaVar.c, DivSlideTransition.Edge.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", eaVar.d, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", eaVar.e);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, ea, DivSlideTransition> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivSlideTransition resolve(ParsingContext parsingContext, ea eaVar, JSONObject jSONObject) throws ParsingException {
            Field<u3> field = eaVar.a;
            fe feVar = this.a;
            s3 s3Var = (s3) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "distance", feVar.O2, feVar.M2);
            Field<Expression<Long>> field2 = eaVar.b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            br brVar = da.g;
            Expression<Long> expression = da.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "duration", typeHelper, izsVar, brVar, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<DivSlideTransition.Edge>> field3 = eaVar.c;
            TypeHelper<DivSlideTransition.Edge> typeHelper2 = da.e;
            izs<String, DivSlideTransition.Edge> izsVar2 = DivSlideTransition.Edge.FROM_STRING;
            Expression<DivSlideTransition.Edge> expression2 = da.b;
            Expression<DivSlideTransition.Edge> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "edge", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<DivAnimationInterpolator>> field4 = eaVar.d;
            TypeHelper<DivAnimationInterpolator> typeHelper3 = da.f;
            izs<String, DivAnimationInterpolator> izsVar3 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression3 = da.c;
            Expression<DivAnimationInterpolator> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper3, izsVar3, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<Expression<Long>> field5 = eaVar.e;
            cr crVar = da.h;
            Expression<Long> expression4 = da.d;
            Expression<Long> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper, izsVar, crVar, expression4);
            return new DivSlideTransition(s3Var, resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalExpression4 == null ? expression4 : resolveOptionalExpression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivSlideTransition.Edge edge = DivSlideTransition.Edge.BOTTOM;
        b = Expression.Companion.constant$default(companion, edge, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        c = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        e = companion2.from(edge, a.i);
        f = companion2.from(divAnimationInterpolator, b.i);
        g = new br(13);
        h = new cr(10);
    }
}

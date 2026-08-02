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
import xsna.eq0;
import xsna.izs;
import xsna.k73;

/* compiled from: DivChangeBoundsTransitionJsonParser.kt */
/* loaded from: classes8.dex */
public final class y1 {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<DivAnimationInterpolator> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final TypeHelper<DivAnimationInterpolator> d;

    @Deprecated
    public static final eq0 e;

    @Deprecated
    public static final k73 f;

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static x1 a(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            eq0 eq0Var = y1.e;
            Expression<Long> expression = y1.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "duration", typeHelper, izsVar, eq0Var, expression);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression;
            }
            TypeHelper<DivAnimationInterpolator> typeHelper2 = y1.d;
            izs<String, DivAnimationInterpolator> izsVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = y1.b;
            Expression<DivAnimationInterpolator> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, izsVar2, expression2);
            Expression<DivAnimationInterpolator> expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            k73 k73Var = y1.f;
            Expression<Long> expression4 = y1.c;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, izsVar, k73Var, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new x1(readOptionalExpression, expression3, expression4);
        }

        public static JSONObject b(ParsingContext parsingContext, x1 x1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "duration", x1Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", x1Var.b, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", x1Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final /* bridge */ /* synthetic */ Object deserialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (x1) obj);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static z1 a(ParsingContext parsingContext, z1 z1Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = z1Var != null ? z1Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new z1(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "duration", typeHelper, allowPropertyOverride, field, izsVar, y1.e), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", y1.d, allowPropertyOverride, z1Var != null ? z1Var.b : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, z1Var != null ? z1Var.c : null, izsVar, y1.f));
        }

        public static JSONObject b(ParsingContext parsingContext, z1 z1Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "duration", z1Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", z1Var.b, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", z1Var.c);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final /* bridge */ /* synthetic */ EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            return a(parsingContext, (z1) entityTemplate, (JSONObject) obj);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return b(parsingContext, (z1) obj);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, z1, x1> {
        public static x1 a(ParsingContext parsingContext, z1 z1Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Long>> field = z1Var.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            eq0 eq0Var = y1.e;
            Expression<Long> expression = y1.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "duration", typeHelper, izsVar, eq0Var, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field<Expression<DivAnimationInterpolator>> field2 = z1Var.b;
            TypeHelper<DivAnimationInterpolator> typeHelper2 = y1.d;
            izs<String, DivAnimationInterpolator> izsVar2 = DivAnimationInterpolator.FROM_STRING;
            Expression<DivAnimationInterpolator> expression2 = y1.b;
            Expression<DivAnimationInterpolator> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<Long>> field3 = z1Var.c;
            k73 k73Var = y1.f;
            Expression<Long> expression3 = y1.c;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "start_delay", typeHelper, izsVar, k73Var, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            return new x1(resolveOptionalExpression, resolveOptionalExpression2, expression3);
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final /* bridge */ /* synthetic */ x1 resolve(ParsingContext parsingContext, z1 z1Var, JSONObject jSONObject) {
            return a(parsingContext, z1Var, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        b = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        d = TypeHelper.Companion.from(divAnimationInterpolator, a.i);
        e = new eq0(8);
        f = new k73(10);
    }
}

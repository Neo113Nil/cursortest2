package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import xsna.qq;
import xsna.rq;
import xsna.sq;
import xsna.tq;
import xsna.uq;
import xsna.vq;

/* compiled from: DivEdgeInsetsJsonParser.kt */
/* loaded from: classes8.dex */
public final class z3 {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final Expression<DivSizeUnit> e;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> f;

    @Deprecated
    public static final qq g;

    @Deprecated
    public static final rq h;

    @Deprecated
    public static final sq i;

    @Deprecated
    public static final tq j;

    @Deprecated
    public static final uq k;

    @Deprecated
    public static final vq l;

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class b implements Serializer, Deserializer {
        public static JSONObject a(ParsingContext parsingContext, y3 y3Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", y3Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.END, y3Var.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.LEFT, y3Var.c);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.RIGHT, y3Var.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", y3Var.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top", y3Var.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", y3Var.g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            Expression<Long> expression;
            Expression<Long> expression2;
            Expression<Long> expression3;
            Expression<DivSizeUnit> expression4;
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            qq qqVar = z3.g;
            Expression<Long> expression5 = z3.a;
            Expression<Long> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, izsVar, qqVar, expression5);
            if (readOptionalExpression == null) {
                readOptionalExpression = expression5;
            }
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.END, typeHelper, izsVar, z3.h);
            sq sqVar = z3.i;
            Expression<Long> expression6 = z3.b;
            Expression<Long> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.LEFT, typeHelper, izsVar, sqVar, expression6);
            Expression<Long> expression7 = readOptionalExpression3 == null ? expression6 : readOptionalExpression3;
            tq tqVar = z3.j;
            Expression<Long> expression8 = z3.c;
            Expression<Long> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.RIGHT, typeHelper, izsVar, tqVar, expression8);
            Expression<Long> expression9 = readOptionalExpression4 == null ? expression8 : readOptionalExpression4;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, izsVar, z3.k);
            vq vqVar = z3.l;
            Expression<Long> expression10 = z3.d;
            Expression<Long> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top", typeHelper, izsVar, vqVar, expression10);
            if (readOptionalExpression6 != null) {
                expression10 = readOptionalExpression6;
            }
            TypeHelper<DivSizeUnit> typeHelper2 = z3.f;
            izs<String, DivSizeUnit> izsVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression11 = z3.e;
            Expression<DivSizeUnit> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper2, izsVar2, expression11);
            if (readOptionalExpression7 == null) {
                Expression<Long> expression12 = expression9;
                expression4 = expression11;
                expression = expression7;
                expression2 = expression10;
                expression3 = expression12;
            } else {
                expression = expression7;
                expression2 = expression10;
                expression3 = expression9;
                expression4 = readOptionalExpression7;
            }
            return new y3(readOptionalExpression, readOptionalExpression2, expression, expression3, readOptionalExpression5, expression2, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (y3) obj);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class c implements Serializer, TemplateDeserializer {
        public static JSONObject a(ParsingContext parsingContext, a4 a4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", a4Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.END, a4Var.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.LEFT, a4Var.c);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.RIGHT, a4Var.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", a4Var.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top", a4Var.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", a4Var.g, DivSizeUnit.TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            a4 a4Var = (a4) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = a4Var != null ? a4Var.a : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new a4(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, izsVar, z3.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.END, typeHelper, allowPropertyOverride, a4Var != null ? a4Var.b : null, izsVar, z3.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.LEFT, typeHelper, allowPropertyOverride, a4Var != null ? a4Var.c : null, izsVar, z3.i), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.RIGHT, typeHelper, allowPropertyOverride, a4Var != null ? a4Var.d : null, izsVar, z3.j), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, a4Var != null ? a4Var.e : null, izsVar, z3.k), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "top", typeHelper, allowPropertyOverride, a4Var != null ? a4Var.f : null, izsVar, z3.l), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", z3.f, allowPropertyOverride, a4Var != null ? a4Var.g : null, DivSizeUnit.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public final /* bridge */ /* synthetic */ Object serialize(ParsingContext parsingContext, Object obj) {
            return a(parsingContext, (a4) obj);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class d implements TemplateResolver<JSONObject, a4, y3> {
        @Override // com.yandex.div.serialization.TemplateResolver
        public final y3 resolve(ParsingContext parsingContext, a4 a4Var, JSONObject jSONObject) {
            Expression<Long> expression;
            Expression<Long> expression2;
            Expression<Long> expression3;
            Expression<DivSizeUnit> expression4;
            a4 a4Var2 = a4Var;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Long>> field = a4Var2.a;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            qq qqVar = z3.g;
            Expression<Long> expression5 = z3.a;
            Expression<Long> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "bottom", typeHelper, izsVar, qqVar, expression5);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression5;
            }
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a4Var2.b, jSONObject2, TtmlNode.END, typeHelper, izsVar, z3.h);
            Field<Expression<Long>> field2 = a4Var2.c;
            sq sqVar = z3.i;
            Expression<Long> expression6 = z3.b;
            Expression<Long> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, TtmlNode.LEFT, typeHelper, izsVar, sqVar, expression6);
            Expression<Long> expression7 = resolveOptionalExpression3 == null ? expression6 : resolveOptionalExpression3;
            Field<Expression<Long>> field3 = a4Var2.d;
            tq tqVar = z3.j;
            Expression<Long> expression8 = z3.c;
            Expression<Long> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, TtmlNode.RIGHT, typeHelper, izsVar, tqVar, expression8);
            Expression<Long> expression9 = resolveOptionalExpression4 == null ? expression8 : resolveOptionalExpression4;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a4Var2.e, jSONObject2, "start", typeHelper, izsVar, z3.k);
            Field<Expression<Long>> field4 = a4Var2.f;
            vq vqVar = z3.l;
            Expression<Long> expression10 = z3.d;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "top", typeHelper, izsVar, vqVar, expression10);
            if (resolveOptionalExpression6 != null) {
                expression10 = resolveOptionalExpression6;
            }
            Field<Expression<DivSizeUnit>> field5 = a4Var2.g;
            TypeHelper<DivSizeUnit> typeHelper2 = z3.f;
            izs<String, DivSizeUnit> izsVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression11 = z3.e;
            Expression<DivSizeUnit> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "unit", typeHelper2, izsVar2, expression11);
            if (resolveOptionalExpression7 == null) {
                Expression<Long> expression12 = expression9;
                expression4 = expression11;
                expression = expression7;
                expression2 = expression10;
                expression3 = expression12;
            } else {
                expression = expression7;
                expression2 = expression10;
                expression3 = expression9;
                expression4 = resolveOptionalExpression7;
            }
            return new y3(resolveOptionalExpression, resolveOptionalExpression2, expression, expression3, resolveOptionalExpression5, expression2, expression4);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        b = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        d = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        e = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f = TypeHelper.Companion.from(divSizeUnit, a.i);
        g = new qq(9);
        h = new rq(10);
        i = new sq(10);
        j = new tq(11);
        k = new uq(10);
        l = new vq(12);
    }
}

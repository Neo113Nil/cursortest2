package com.yandex.div2;

import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.nr;

/* compiled from: DivImageBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public final class g5 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<DivAlignmentHorizontal> b;

    @Deprecated
    public static final Expression<DivAlignmentVertical> c;

    @Deprecated
    public static final Expression<Boolean> d;

    @Deprecated
    public static final Expression<DivImageScale> e;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> f;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> g;

    @Deprecated
    public static final TypeHelper<DivImageScale> h;

    @Deprecated
    public static final nr i;

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            Expression<DivImageScale> expression;
            Expression<Double> expression2;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            nr nrVar = g5.i;
            Expression<Double> expression3 = g5.a;
            Expression<Double> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, nrVar, expression3);
            if (readOptionalExpression != null) {
                expression3 = readOptionalExpression;
            }
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = g5.f;
            izs<String, DivAlignmentHorizontal> izsVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression4 = g5.b;
            Expression<DivAlignmentHorizontal> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper2, izsVar2, expression4);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression4;
            }
            TypeHelper<DivAlignmentVertical> typeHelper3 = g5.g;
            izs<String, DivAlignmentVertical> izsVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression5 = g5.c;
            Expression<DivAlignmentVertical> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper3, izsVar3, expression5);
            if (readOptionalExpression3 == null) {
                readOptionalExpression3 = expression5;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.a.k3);
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = g5.d;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, izsVar4, expression6);
            Expression<Boolean> expression7 = readOptionalExpression4 == null ? expression6 : readOptionalExpression4;
            TypeHelper<DivImageScale> typeHelper5 = g5.h;
            izs<String, DivImageScale> izsVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression8 = g5.e;
            Expression<DivImageScale> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, izsVar5, expression8);
            if (readOptionalExpression5 == null) {
                expression2 = expression3;
                expression = expression8;
            } else {
                Expression<Double> expression9 = expression3;
                expression = readOptionalExpression5;
                expression2 = expression9;
            }
            return new f5(expression2, readOptionalExpression2, readOptionalExpression3, readOptionalList, readExpression, expression7, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, f5 f5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", f5Var.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", f5Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", f5Var.c, DivAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", f5Var.d, this.a.k3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, f5Var.e, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", f5Var.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", f5Var.g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h5 deserialize(ParsingContext parsingContext, h5 h5Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new h5(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, h5Var != null ? h5Var.a : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, g5.i), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", g5.f, allowPropertyOverride, h5Var != null ? h5Var.b : null, DivAlignmentHorizontal.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", g5.g, allowPropertyOverride, h5Var != null ? h5Var.c : null, DivAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, h5Var != null ? h5Var.d : null, this.a.l3), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, h5Var != null ? h5Var.e : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, h5Var != null ? h5Var.f : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", g5.h, allowPropertyOverride, h5Var != null ? h5Var.g : null, DivImageScale.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, h5 h5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", h5Var.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", h5Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", h5Var.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", h5Var.d, this.a.l3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, h5Var.e, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", h5Var.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", h5Var.g, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, h5, f5> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f5 resolve(ParsingContext parsingContext, h5 h5Var, JSONObject jSONObject) throws ParsingException {
            Field<Expression<Double>> field = h5Var.a;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            nr nrVar = g5.i;
            Expression<Double> expression = g5.a;
            Expression<Double> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, izsVar, nrVar, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field<Expression<DivAlignmentHorizontal>> field2 = h5Var.b;
            TypeHelper<DivAlignmentHorizontal> typeHelper2 = g5.f;
            izs<String, DivAlignmentHorizontal> izsVar2 = DivAlignmentHorizontal.FROM_STRING;
            Expression<DivAlignmentHorizontal> expression2 = g5.b;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "content_alignment_horizontal", typeHelper2, izsVar2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field<Expression<DivAlignmentVertical>> field3 = h5Var.c;
            TypeHelper<DivAlignmentVertical> typeHelper3 = g5.g;
            izs<String, DivAlignmentVertical> izsVar3 = DivAlignmentVertical.FROM_STRING;
            Expression<DivAlignmentVertical> expression3 = g5.c;
            Expression<DivAlignmentVertical> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "content_alignment_vertical", typeHelper3, izsVar3, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field<List<i4>> field4 = h5Var.d;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field4, jSONObject, "filters", feVar.m3, feVar.k3);
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, h5Var.e, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Field<Expression<Boolean>> field5 = h5Var.f;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression4 = g5.d;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "preload_required", typeHelper4, izsVar4, expression4);
            Expression<Boolean> expression5 = resolveOptionalExpression4 == null ? expression4 : resolveOptionalExpression4;
            Field<Expression<DivImageScale>> field6 = h5Var.g;
            TypeHelper<DivImageScale> typeHelper5 = g5.h;
            izs<String, DivImageScale> izsVar5 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression6 = g5.e;
            Expression<DivImageScale> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "scale", typeHelper5, izsVar5, expression6);
            if (resolveOptionalExpression5 != null) {
                expression6 = resolveOptionalExpression5;
            }
            return new f5(expression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalList, resolveExpression, expression5, expression6);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        b = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        c = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        d = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        e = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        f = companion2.from(divAlignmentHorizontal, a.i);
        g = companion2.from(divAlignmentVertical, b.i);
        h = companion2.from(divImageScale, c.i);
        i = new nr(11);
    }
}

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
import com.yandex.div2.fa;
import com.yandex.div2.ka;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.fr;
import xsna.gr;
import xsna.izs;
import xsna.jon;
import xsna.non;
import xsna.rl3;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public final class la {

    @Deprecated
    public static final Expression<Long> a;

    @Deprecated
    public static final Expression<DivSizeUnit> b;

    @Deprecated
    public static final Expression<Double> c;

    @Deprecated
    public static final Expression<Integer> d;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> e;

    @Deprecated
    public static final TypeHelper<DivFontWeight> f;

    @Deprecated
    public static final fr g;

    @Deprecated
    public static final gr h;

    /* compiled from: DivSliderJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class c implements Serializer, Deserializer {
        public final fe a;

        public c(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, fa.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", bVar.a);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", bVar.b);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", bVar.c, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", bVar.d);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", bVar.e, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", bVar.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", bVar.g);
            JsonPropertyParser.write(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, bVar.h, this.a.W5);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", bVar.i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.yandex.div.serialization.Deserializer
        public final java.lang.Object deserialize(com.yandex.div.serialization.ParsingContext r14, java.lang.Object r15) {
            /*
                r13 = this;
                r1 = r15
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                com.yandex.div2.fa$b r15 = new com.yandex.div2.fa$b
                java.lang.String r0 = "font_family"
                com.yandex.div.internal.parser.TypeHelper<java.lang.String> r2 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_STRING
                com.yandex.div.json.expressions.Expression r7 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r14, r1, r0, r2)
                com.yandex.div.internal.parser.TypeHelper<java.lang.Long> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_INT
                xsna.izs<java.lang.Number, java.lang.Long> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_INT
                xsna.fr r5 = com.yandex.div2.la.g
                com.yandex.div.json.expressions.Expression<java.lang.Long> r6 = com.yandex.div2.la.a
                java.lang.String r2 = "font_size"
                r0 = r14
                com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5, r6)
                r8 = r3
                r9 = r4
                if (r14 != 0) goto L21
                goto L22
            L21:
                r6 = r14
            L22:
                com.yandex.div.internal.parser.TypeHelper<com.yandex.div2.DivSizeUnit> r3 = com.yandex.div2.la.e
                xsna.izs<java.lang.String, com.yandex.div2.DivSizeUnit> r4 = com.yandex.div2.DivSizeUnit.FROM_STRING
                com.yandex.div.json.expressions.Expression<com.yandex.div2.DivSizeUnit> r5 = com.yandex.div2.la.b
                java.lang.String r2 = "font_size_unit"
                com.yandex.div.json.expressions.Expression r14 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                if (r14 != 0) goto L31
                r14 = r5
            L31:
                java.lang.String r2 = "font_variation_settings"
                com.yandex.div.internal.parser.TypeHelper<org.json.JSONObject> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DICT
                com.yandex.div.json.expressions.Expression r10 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3)
                com.yandex.div.internal.parser.TypeHelper<com.yandex.div2.DivFontWeight> r2 = com.yandex.div2.la.f
                xsna.izs<java.lang.String, com.yandex.div2.DivFontWeight> r3 = com.yandex.div2.DivFontWeight.FROM_STRING
                java.lang.String r4 = "font_weight"
                com.yandex.div.json.expressions.Expression r11 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r4, r2, r3)
                java.lang.String r2 = "font_weight_value"
                xsna.gr r5 = com.yandex.div2.la.h
                r3 = r8
                r4 = r9
                com.yandex.div.json.expressions.Expression r8 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                com.yandex.div.internal.parser.TypeHelper<java.lang.Double> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_DOUBLE
                xsna.izs<java.lang.Number, java.lang.Double> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.NUMBER_TO_DOUBLE
                com.yandex.div.json.expressions.Expression<java.lang.Double> r5 = com.yandex.div2.la.c
                java.lang.String r2 = "letter_spacing"
                com.yandex.div.json.expressions.Expression r2 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                if (r2 != 0) goto L5d
                r9 = r5
                goto L5e
            L5d:
                r9 = r2
            L5e:
                com.yandex.div2.fe r2 = r13.a
                xsna.bpn0 r2 = r2.W5
                java.lang.String r3 = "offset"
                java.lang.Object r2 = com.yandex.div.internal.parser.JsonPropertyParser.readOptional(r0, r1, r3, r2)
                r12 = r2
                xsna.jon r12 = (xsna.jon) r12
                com.yandex.div.internal.parser.TypeHelper<java.lang.Integer> r3 = com.yandex.div.internal.parser.TypeHelpersKt.TYPE_HELPER_COLOR
                xsna.izs<java.lang.Object, java.lang.Integer> r4 = com.yandex.div.internal.parser.ParsingConvertersKt.STRING_TO_COLOR_INT
                com.yandex.div.json.expressions.Expression<java.lang.Integer> r5 = com.yandex.div2.la.d
                java.lang.String r2 = "text_color"
                com.yandex.div.json.expressions.Expression r0 = com.yandex.div.internal.parser.JsonExpressionParser.readOptionalExpression(r0, r1, r2, r3, r4, r5)
                r3 = r7
                r7 = r11
                if (r0 != 0) goto L82
                r11 = r5
                r2 = r15
                r4 = r6
                r6 = r10
                r10 = r12
                r5 = r14
                goto L88
            L82:
                r11 = r0
                r5 = r14
                r2 = r15
                r4 = r6
                r6 = r10
                r10 = r12
            L88:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div2.la.c.deserialize(com.yandex.div.serialization.ParsingContext, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class d implements Serializer, TemplateDeserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ka.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", bVar.a);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", bVar.b);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", bVar.c, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", bVar.d);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", bVar.e, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", bVar.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", bVar.g);
            JsonFieldParser.writeField(parsingContext, jSONObject, SignalingProtocol.KEY_OFFSET, bVar.h, this.a.X5);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", bVar.i, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            ka.b bVar = (ka.b) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, bVar != null ? bVar.a : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field = bVar != null ? bVar.b : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new ka.b(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper, allowPropertyOverride, field, izsVar, la.g), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", la.e, allowPropertyOverride, bVar != null ? bVar.c : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, bVar != null ? bVar.d : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", la.f, allowPropertyOverride, bVar != null ? bVar.e : null, DivFontWeight.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper, allowPropertyOverride, bVar != null ? bVar.f : null, izsVar, la.h), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, bVar != null ? bVar.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, SignalingProtocol.KEY_OFFSET, allowPropertyOverride, bVar != null ? bVar.h : null, this.a.X5), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, bVar != null ? bVar.i : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class e implements TemplateResolver<JSONObject, ka.b, fa.b> {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final fa.b resolve(ParsingContext parsingContext, ka.b bVar, JSONObject jSONObject) {
            ka.b bVar2 = bVar;
            JSONObject jSONObject2 = jSONObject;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, bVar2.a, jSONObject2, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field = bVar2.b;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            fr frVar = la.g;
            Expression<Long> expression = la.a;
            Expression<Long> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "font_size", typeHelper, izsVar, frVar, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            Field<Expression<DivSizeUnit>> field2 = bVar2.c;
            TypeHelper<DivSizeUnit> typeHelper2 = la.e;
            izs<String, DivSizeUnit> izsVar2 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression2 = la.b;
            Expression<DivSizeUnit> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "font_size_unit", typeHelper2, izsVar2, expression2);
            Expression<DivSizeUnit> expression3 = resolveOptionalExpression3 == null ? expression2 : resolveOptionalExpression3;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, bVar2.d, jSONObject2, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, bVar2.e, jSONObject2, "font_weight", la.f, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, bVar2.f, jSONObject2, "font_weight_value", typeHelper, izsVar, la.h);
            Field<Expression<Double>> field3 = bVar2.g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression4 = la.c;
            Expression<Double> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "letter_spacing", typeHelper3, izsVar3, expression4);
            Expression<Double> expression5 = resolveOptionalExpression7 == null ? expression4 : resolveOptionalExpression7;
            Field<non> field4 = bVar2.h;
            fe feVar = this.a;
            jon jonVar = (jon) JsonFieldResolver.resolveOptional(parsingContext, field4, jSONObject2, SignalingProtocol.KEY_OFFSET, feVar.Y5, feVar.W5);
            Field<Expression<Integer>> field5 = bVar2.i;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = la.d;
            Expression<Integer> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "text_color", typeHelper4, izsVar4, expression6);
            return new fa.b(resolveOptionalExpression, expression, expression3, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6, expression5, jonVar, resolveOptionalExpression8 == null ? expression6 : resolveOptionalExpression8);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        c = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        d = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        e = companion2.from(divSizeUnit, a.i);
        f = companion2.from(rl3.L(DivFontWeight.values()), b.i);
        g = new fr(16);
        h = new gr(13);
    }
}

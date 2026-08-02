package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import com.yandex.div2.DivText;
import com.yandex.div2.wc;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.eq0;
import xsna.izs;
import xsna.k73;
import xsna.pm0;
import xsna.rl3;
import xsna.tf3;
import xsna.uf3;
import xsna.up;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class hc {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<DivSizeUnit> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final TypeHelper<DivTextAlignmentVertical> d;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> e;

    @Deprecated
    public static final TypeHelper<DivFontWeight> f;

    @Deprecated
    public static final TypeHelper<DivLineStyle> g;

    @Deprecated
    public static final TypeHelper<DivLineStyle> h;

    @Deprecated
    public static final eq0 i;

    @Deprecated
    public static final k73 j;

    @Deprecated
    public static final pm0 k;

    @Deprecated
    public static final tf3 l;

    @Deprecated
    public static final uf3 m;

    @Deprecated
    public static final up n;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivLineStyle);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivLineStyle);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class f implements Serializer, Deserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivText.b bVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            List<DivAction> list = bVar.a;
            fe feVar = this.a;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", list, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", bVar.b, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, L2.g, bVar.c, feVar.d8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "baseline_offset", bVar.d);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", bVar.e, feVar.g8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.END, bVar.f);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", bVar.g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", bVar.h);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", bVar.i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", bVar.j, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", bVar.k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", bVar.l, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", bVar.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", bVar.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", bVar.o);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", bVar.p, feVar.r8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", bVar.q);
            Expression<DivLineStyle> expression = bVar.r;
            izs<DivLineStyle, String> izsVar = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", bVar.s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", bVar.t, feVar.M6);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top_offset", bVar.u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.UNDERLINE, bVar.v, izsVar);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            fe feVar = this.a;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", feVar.k1);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", hc.d, DivTextAlignmentVertical.FROM_STRING);
            zb zbVar = (zb) JsonPropertyParser.readOptional(parsingContext, jSONObject, L2.g, feVar.d8);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = hc.a;
            Expression<Double> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "baseline_offset", typeHelper, izsVar, expression);
            Expression<Double> expression2 = readOptionalExpression2 == null ? expression : readOptionalExpression2;
            ec ecVar = (ec) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.g8);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.END, typeHelper2, izsVar2, hc.i);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper3);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, izsVar2, hc.j);
            TypeHelper<DivSizeUnit> typeHelper4 = hc.e;
            izs<String, DivSizeUnit> izsVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression3 = hc.b;
            Expression<DivSizeUnit> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, izsVar3, expression3);
            Expression<DivSizeUnit> expression4 = readOptionalExpression7 == null ? expression3 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", hc.f, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, izsVar2, hc.k);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, izsVar);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, izsVar2, hc.l);
            ic icVar = (ic) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", feVar.r8);
            uf3 uf3Var = hc.m;
            Expression<Long> expression5 = hc.c;
            Expression<Long> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper2, izsVar2, uf3Var, expression5);
            if (readOptionalExpression13 != null) {
                expression5 = readOptionalExpression13;
            }
            TypeHelper<DivLineStyle> typeHelper5 = hc.g;
            izs<String, DivLineStyle> izsVar4 = DivLineStyle.FROM_STRING;
            return new DivText.b(readOptionalList, readOptionalExpression, zbVar, expression2, ecVar, readOptionalExpression3, readOptionalExpression4, readOptionalExpression5, readOptionalExpression6, expression4, readOptionalExpression8, readOptionalExpression9, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, icVar, expression5, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper5, izsVar4), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", feVar.M6), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top_offset", typeHelper2, izsVar2, hc.n), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.UNDERLINE, hc.h, izsVar4));
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class g implements Serializer, TemplateDeserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, wc.c cVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<List<h0>> field = cVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", field, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", cVar.b, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, L2.g, cVar.c, feVar.e8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "baseline_offset", cVar.d);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", cVar.e, feVar.h8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.END, cVar.f);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", cVar.g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", cVar.h);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", cVar.i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", cVar.j, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", cVar.k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", cVar.l, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", cVar.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", cVar.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", cVar.o);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", cVar.p, feVar.s8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", cVar.q);
            Field<Expression<DivLineStyle>> field2 = cVar.r;
            izs<DivLineStyle, String> izsVar = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field2, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", cVar.s, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", cVar.t, feVar.N6);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top_offset", cVar.u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.UNDERLINE, cVar.v, izsVar);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            wc.c cVar = (wc.c) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<List<h0>> field = cVar != null ? cVar.a : null;
            fe feVar = this.a;
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", hc.d, allowPropertyOverride, cVar != null ? cVar.b : null, DivTextAlignmentVertical.FROM_STRING);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, cVar != null ? cVar.c : null, feVar.e8);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = cVar != null ? cVar.d : null;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field2, izsVar);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, cVar != null ? cVar.e : null, feVar.h8);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = cVar != null ? cVar.f : null;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.END, typeHelper2, allowPropertyOverride, field3, izsVar2, hc.i);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, cVar != null ? cVar.g : null);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, cVar != null ? cVar.h : null);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, cVar != null ? cVar.i : null, izsVar2, hc.j);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", hc.e, allowPropertyOverride, cVar != null ? cVar.j : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, cVar != null ? cVar.k : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", hc.f, allowPropertyOverride, cVar != null ? cVar.l : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, cVar != null ? cVar.m : null, izsVar2, hc.k);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, cVar != null ? cVar.n : null, izsVar);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, cVar != null ? cVar.o : null, izsVar2, hc.l);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, cVar != null ? cVar.p : null, feVar.s8);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, cVar != null ? cVar.q : null, izsVar2, hc.m);
            TypeHelper<DivLineStyle> typeHelper4 = hc.g;
            Field<Expression<DivLineStyle>> field4 = cVar != null ? cVar.r : null;
            izs<String, DivLineStyle> izsVar3 = DivLineStyle.FROM_STRING;
            return new wc.c(readOptionalListField, readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalField3, readOptionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field4, izsVar3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, cVar != null ? cVar.s : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, cVar != null ? cVar.t : null, feVar.N6), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, cVar != null ? cVar.u : null, izsVar2, hc.n), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.UNDERLINE, hc.h, allowPropertyOverride, cVar != null ? cVar.v : null, izsVar3));
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class h implements TemplateResolver<JSONObject, wc.c, DivText.b> {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivText.b resolve(ParsingContext parsingContext, wc.c cVar, JSONObject jSONObject) {
            wc.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            Field<List<h0>> field = cVar2.a;
            fe feVar = this.a;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject2, "actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.b, jSONObject2, "alignment_vertical", hc.d, DivTextAlignmentVertical.FROM_STRING);
            zb zbVar = (zb) JsonFieldResolver.resolveOptional(parsingContext, cVar2.c, jSONObject2, L2.g, feVar.f8, feVar.d8);
            Field<Expression<Double>> field2 = cVar2.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression = hc.a;
            Expression<Double> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "baseline_offset", typeHelper, izsVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression2 == null ? expression : resolveOptionalExpression2;
            ec ecVar = (ec) JsonFieldResolver.resolveOptional(parsingContext, cVar2.e, jSONObject2, "border", feVar.i8, feVar.g8);
            Field<Expression<Long>> field3 = cVar2.f;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, TtmlNode.END, typeHelper2, izsVar2, hc.i);
            Field<Expression<String>> field4 = cVar2.g;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "font_family", typeHelper3);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.h, jSONObject2, "font_feature_settings", typeHelper3);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.i, jSONObject2, "font_size", typeHelper2, izsVar2, hc.j);
            Field<Expression<DivSizeUnit>> field5 = cVar2.j;
            TypeHelper<DivSizeUnit> typeHelper4 = hc.e;
            izs<String, DivSizeUnit> izsVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression3 = hc.b;
            Expression<DivSizeUnit> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "font_size_unit", typeHelper4, izsVar3, expression3);
            Expression<DivSizeUnit> expression4 = resolveOptionalExpression7 == null ? expression3 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.k, jSONObject2, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.l, jSONObject2, "font_weight", hc.f, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.m, jSONObject2, "font_weight_value", typeHelper2, izsVar2, hc.k);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.n, jSONObject2, "letter_spacing", typeHelper, izsVar);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.o, jSONObject2, "line_height", typeHelper2, izsVar2, hc.l);
            ic icVar = (ic) JsonFieldResolver.resolveOptional(parsingContext, cVar2.p, jSONObject2, "mask", feVar.t8, feVar.r8);
            Field<Expression<Long>> field6 = cVar2.q;
            uf3 uf3Var = hc.m;
            Expression<Long> expression5 = hc.c;
            Expression<Long> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject2, "start", typeHelper2, izsVar2, uf3Var, expression5);
            if (resolveOptionalExpression13 != null) {
                expression5 = resolveOptionalExpression13;
            }
            Field<Expression<DivLineStyle>> field7 = cVar2.r;
            TypeHelper<DivLineStyle> typeHelper5 = hc.g;
            izs<String, DivLineStyle> izsVar4 = DivLineStyle.FROM_STRING;
            return new DivText.b(resolveOptionalList, resolveOptionalExpression, zbVar, expression2, ecVar, resolveOptionalExpression3, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6, expression4, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, icVar, expression5, JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject2, "strike", typeHelper5, izsVar4), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.s, jSONObject2, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (n9) JsonFieldResolver.resolveOptional(parsingContext, cVar2.t, jSONObject2, "text_shadow", feVar.O6, feVar.M6), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.u, jSONObject2, "top_offset", typeHelper2, izsVar2, hc.n), JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.v, jSONObject2, TtmlNode.UNDERLINE, hc.h, izsVar4));
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        b = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        d = companion2.from(rl3.L(DivTextAlignmentVertical.values()), a.i);
        e = companion2.from(divSizeUnit, b.i);
        f = companion2.from(rl3.L(DivFontWeight.values()), c.i);
        g = companion2.from(rl3.L(DivLineStyle.values()), d.i);
        h = companion2.from(rl3.L(DivLineStyle.values()), e.i);
        i = new eq0(10);
        j = new k73(12);
        k = new pm0(14);
        l = new tf3(11);
        m = new uf3(8);
        n = new up(12);
    }
}

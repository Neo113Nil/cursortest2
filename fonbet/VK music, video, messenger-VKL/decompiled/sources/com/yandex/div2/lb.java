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
import com.yandex.div2.DivTabs;
import com.yandex.div2.mb;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.izs;
import xsna.p11;
import xsna.r11;
import xsna.rf3;
import xsna.rl3;
import xsna.s11;
import xsna.sf3;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class lb {

    @Deprecated
    public static final Expression<Integer> a;

    @Deprecated
    public static final Expression<Integer> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final Expression<DivTabs.TabTitleStyle.AnimationType> d;

    @Deprecated
    public static final Expression<Long> e;

    @Deprecated
    public static final Expression<DivSizeUnit> f;

    @Deprecated
    public static final Expression<DivFontWeight> g;

    @Deprecated
    public static final Expression<Integer> h;

    @Deprecated
    public static final Expression<Long> i;

    @Deprecated
    public static final Expression<Double> j;

    @Deprecated
    public static final y3 k;

    @Deprecated
    public static final TypeHelper<DivFontWeight> l;

    @Deprecated
    public static final TypeHelper<DivTabs.TabTitleStyle.AnimationType> m;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> n;

    @Deprecated
    public static final TypeHelper<DivFontWeight> o;

    @Deprecated
    public static final TypeHelper<DivFontWeight> p;

    @Deprecated
    public static final p11 q;

    @Deprecated
    public static final rf3 r;

    @Deprecated
    public static final r11 s;

    @Deprecated
    public static final sf3 t;

    @Deprecated
    public static final s11 u;

    /* compiled from: DivTabsJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTabs.TabTitleStyle.AnimationType);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class f implements Serializer, Deserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivTabs.TabTitleStyle tabTitleStyle) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Expression<Integer> expression = tabTitleStyle.a;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_background_color", expression, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyle.b);
            Expression<DivFontWeight> expression2 = tabTitleStyle.c;
            izs<DivFontWeight, String> izsVar2 = DivFontWeight.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_weight", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_text_color", tabTitleStyle.d, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_duration", tabTitleStyle.e);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_type", tabTitleStyle.f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", tabTitleStyle.g);
            y2 y2Var = tabTitleStyle.h;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", y2Var, feVar.s2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", tabTitleStyle.i);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", tabTitleStyle.j);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", tabTitleStyle.k, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", tabTitleStyle.l, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_background_color", tabTitleStyle.m, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyle.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyle.o, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_text_color", tabTitleStyle.p, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", tabTitleStyle.q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", tabTitleStyle.r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", tabTitleStyle.s);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tabTitleStyle.t, feVar.Y2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public final Object deserialize(ParsingContext parsingContext, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = lb.a;
            Expression<Integer> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_background_color", typeHelper, izsVar, expression);
            Expression<Integer> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_variation_settings", typeHelper2);
            TypeHelper<DivFontWeight> typeHelper3 = lb.l;
            izs<String, DivFontWeight> izsVar2 = DivFontWeight.FROM_STRING;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_weight", typeHelper3, izsVar2);
            Expression<Integer> expression3 = lb.b;
            Expression<Integer> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_text_color", typeHelper, izsVar, expression3);
            Expression<Integer> expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            p11 p11Var = lb.q;
            Expression<Long> expression5 = lb.c;
            Expression<Long> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_duration", typeHelper4, izsVar3, p11Var, expression5);
            Expression<Long> expression6 = readOptionalExpression5 == null ? expression5 : readOptionalExpression5;
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = lb.m;
            izs<String, DivTabs.TabTitleStyle.AnimationType> izsVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = lb.d;
            Expression<DivTabs.TabTitleStyle.AnimationType> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_type", typeHelper5, izsVar4, expression7);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression8 = readOptionalExpression6 == null ? expression7 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", typeHelper4, izsVar3, lb.r);
            fe feVar = this.a;
            y2 y2Var = (y2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", feVar.s2);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            r11 r11Var = lb.s;
            Expression<Long> expression9 = lb.e;
            Expression<Long> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper4, izsVar3, r11Var, expression9);
            Expression<Long> expression10 = readOptionalExpression9 == null ? expression9 : readOptionalExpression9;
            TypeHelper<DivSizeUnit> typeHelper6 = lb.n;
            izs<String, DivSizeUnit> izsVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression11 = lb.f;
            Expression<DivSizeUnit> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper6, izsVar5, expression11);
            Expression<DivSizeUnit> expression12 = readOptionalExpression10 == null ? expression11 : readOptionalExpression10;
            TypeHelper<DivFontWeight> typeHelper7 = lb.o;
            Expression<DivFontWeight> expression13 = lb.g;
            Expression<DivFontWeight> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", typeHelper7, izsVar2, expression13);
            Expression<DivFontWeight> expression14 = readOptionalExpression11 == null ? expression13 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_background_color", typeHelper, izsVar);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_weight", lb.p, izsVar2);
            Expression<Integer> expression15 = lb.h;
            Expression<Integer> readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_text_color", typeHelper, izsVar, expression15);
            Expression<Integer> expression16 = readOptionalExpression15 == null ? expression15 : readOptionalExpression15;
            sf3 sf3Var = lb.t;
            Expression<Long> expression17 = lb.i;
            Expression<Long> readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper4, izsVar3, sf3Var, expression17);
            if (readOptionalExpression16 != null) {
                expression17 = readOptionalExpression16;
            }
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression18 = lb.j;
            Expression<Double> readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper8, izsVar6, expression18);
            Expression<Double> expression19 = readOptionalExpression17 == null ? expression18 : readOptionalExpression17;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, izsVar3, lb.u);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", feVar.Y2);
            if (y3Var == null) {
                y3Var = lb.k;
            }
            return new DivTabs.TabTitleStyle(expression2, readOptionalExpression2, readOptionalExpression3, expression4, expression6, expression8, readOptionalExpression7, y2Var, readOptionalExpression8, expression10, expression12, expression14, readOptionalExpression12, readOptionalExpression13, readOptionalExpression14, expression16, expression17, expression19, readOptionalExpression18, y3Var);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class g implements Serializer, TemplateDeserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, mb.c cVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<Expression<Integer>> field = cVar.a;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_background_color", field, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_variation_settings", cVar.b);
            Field<Expression<DivFontWeight>> field2 = cVar.c;
            izs<DivFontWeight, String> izsVar2 = DivFontWeight.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_weight", field2, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_text_color", cVar.d, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_duration", cVar.e);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_type", cVar.f, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", cVar.g);
            Field<a3> field3 = cVar.h;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", field3, feVar.t2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", cVar.i);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", cVar.j);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", cVar.k, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", cVar.l, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_background_color", cVar.m, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_variation_settings", cVar.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_weight", cVar.o, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_text_color", cVar.p, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", cVar.q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", cVar.r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", cVar.s);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", cVar.t, feVar.Z2);
            return jSONObject;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
            mb.c cVar = (mb.c) entityTemplate;
            JSONObject jSONObject = (JSONObject) obj;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field = cVar != null ? cVar.a : null;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_background_color", typeHelper, allowPropertyOverride, field, izsVar);
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_font_variation_settings", typeHelper2, allowPropertyOverride, cVar != null ? cVar.b : null);
            TypeHelper<DivFontWeight> typeHelper3 = lb.l;
            Field<Expression<DivFontWeight>> field2 = cVar != null ? cVar.c : null;
            izs<String, DivFontWeight> izsVar2 = DivFontWeight.FROM_STRING;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_font_weight", typeHelper3, allowPropertyOverride, field2, izsVar2);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_text_color", typeHelper, allowPropertyOverride, cVar != null ? cVar.d : null, izsVar);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = cVar != null ? cVar.e : null;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation_duration", typeHelper4, allowPropertyOverride, field3, izsVar3, lb.q);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation_type", lb.m, allowPropertyOverride, cVar != null ? cVar.f : null, DivTabs.TabTitleStyle.AnimationType.FROM_STRING);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", typeHelper4, allowPropertyOverride, cVar != null ? cVar.g : null, izsVar3, lb.r);
            Field<a3> field4 = cVar != null ? cVar.h : null;
            fe feVar = this.a;
            return new mb.c(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, field4, feVar.t2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, cVar != null ? cVar.i : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, cVar != null ? cVar.j : null, izsVar3, lb.s), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", lb.n, allowPropertyOverride, cVar != null ? cVar.k : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", lb.o, allowPropertyOverride, cVar != null ? cVar.l : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_background_color", typeHelper, allowPropertyOverride, cVar != null ? cVar.m : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, cVar != null ? cVar.n : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_font_weight", lb.p, allowPropertyOverride, cVar != null ? cVar.o : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_text_color", typeHelper, allowPropertyOverride, cVar != null ? cVar.p : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper4, allowPropertyOverride, cVar != null ? cVar.q : null, izsVar3, lb.t), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, cVar != null ? cVar.r : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, cVar != null ? cVar.s : null, izsVar3, lb.u), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, cVar != null ? cVar.t : null, feVar.Z2));
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class h implements TemplateResolver<JSONObject, mb.c, DivTabs.TabTitleStyle> {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public final DivTabs.TabTitleStyle resolve(ParsingContext parsingContext, mb.c cVar, JSONObject jSONObject) {
            mb.c cVar2 = cVar;
            JSONObject jSONObject2 = jSONObject;
            Field<Expression<Integer>> field = cVar2.a;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = lb.a;
            Expression<Integer> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject2, "active_background_color", typeHelper, izsVar, expression);
            Expression<Integer> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<JSONObject>> field2 = cVar2.b;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "active_font_variation_settings", typeHelper2);
            Field<Expression<DivFontWeight>> field3 = cVar2.c;
            TypeHelper<DivFontWeight> typeHelper3 = lb.l;
            izs<String, DivFontWeight> izsVar2 = DivFontWeight.FROM_STRING;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "active_font_weight", typeHelper3, izsVar2);
            Field<Expression<Integer>> field4 = cVar2.d;
            Expression<Integer> expression3 = lb.b;
            Expression<Integer> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject2, "active_text_color", typeHelper, izsVar, expression3);
            Expression<Integer> expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            Field<Expression<Long>> field5 = cVar2.e;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            p11 p11Var = lb.q;
            Expression<Long> expression5 = lb.c;
            Expression<Long> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject2, "animation_duration", typeHelper4, izsVar3, p11Var, expression5);
            Expression<Long> expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6 = cVar2.f;
            TypeHelper<DivTabs.TabTitleStyle.AnimationType> typeHelper5 = lb.m;
            izs<String, DivTabs.TabTitleStyle.AnimationType> izsVar4 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression<DivTabs.TabTitleStyle.AnimationType> expression7 = lb.d;
            Expression<DivTabs.TabTitleStyle.AnimationType> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject2, "animation_type", typeHelper5, izsVar4, expression7);
            Expression<DivTabs.TabTitleStyle.AnimationType> expression8 = resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.g, jSONObject2, "corner_radius", typeHelper4, izsVar3, lb.r);
            Field<a3> field7 = cVar2.h;
            fe feVar = this.a;
            y2 y2Var = (y2) JsonFieldResolver.resolveOptional(parsingContext, field7, jSONObject2, "corners_radius", feVar.u2, feVar.s2);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.i, jSONObject2, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field<Expression<Long>> field8 = cVar2.j;
            r11 r11Var = lb.s;
            Expression<Long> expression9 = lb.e;
            Expression<Long> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject2, "font_size", typeHelper4, izsVar3, r11Var, expression9);
            Expression<Long> expression10 = resolveOptionalExpression9 == null ? expression9 : resolveOptionalExpression9;
            Field<Expression<DivSizeUnit>> field9 = cVar2.k;
            TypeHelper<DivSizeUnit> typeHelper6 = lb.n;
            izs<String, DivSizeUnit> izsVar5 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression11 = lb.f;
            Expression<DivSizeUnit> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject2, "font_size_unit", typeHelper6, izsVar5, expression11);
            Expression<DivSizeUnit> expression12 = resolveOptionalExpression10 == null ? expression11 : resolveOptionalExpression10;
            Field<Expression<DivFontWeight>> field10 = cVar2.l;
            TypeHelper<DivFontWeight> typeHelper7 = lb.o;
            Expression<DivFontWeight> expression13 = lb.g;
            Expression<DivFontWeight> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject2, "font_weight", typeHelper7, izsVar2, expression13);
            Expression<DivFontWeight> expression14 = resolveOptionalExpression11 == null ? expression13 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.m, jSONObject2, "inactive_background_color", typeHelper, izsVar);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.n, jSONObject2, "inactive_font_variation_settings", typeHelper2);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.o, jSONObject2, "inactive_font_weight", lb.p, izsVar2);
            Field<Expression<Integer>> field11 = cVar2.p;
            Expression<Integer> expression15 = lb.h;
            Expression<Integer> resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject2, "inactive_text_color", typeHelper, izsVar, expression15);
            Expression<Integer> expression16 = resolveOptionalExpression15 == null ? expression15 : resolveOptionalExpression15;
            Field<Expression<Long>> field12 = cVar2.q;
            sf3 sf3Var = lb.t;
            Expression<Long> expression17 = lb.i;
            Expression<Long> resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject2, "item_spacing", typeHelper4, izsVar3, sf3Var, expression17);
            if (resolveOptionalExpression16 != null) {
                expression17 = resolveOptionalExpression16;
            }
            Field<Expression<Double>> field13 = cVar2.r;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar6 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression<Double> expression18 = lb.j;
            Expression<Double> resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject2, "letter_spacing", typeHelper8, izsVar6, expression18);
            Expression<Double> expression19 = resolveOptionalExpression17 == null ? expression18 : resolveOptionalExpression17;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, cVar2.s, jSONObject2, "line_height", typeHelper4, izsVar3, lb.u);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, cVar2.t, jSONObject2, "paddings", feVar.a3, feVar.Y2);
            if (y3Var == null) {
                y3Var = lb.k;
            }
            return new DivTabs.TabTitleStyle(expression2, resolveOptionalExpression2, resolveOptionalExpression3, expression4, expression6, expression8, resolveOptionalExpression7, y2Var, resolveOptionalExpression8, expression10, expression12, expression14, resolveOptionalExpression12, resolveOptionalExpression13, resolveOptionalExpression14, expression16, expression17, expression19, resolveOptionalExpression18, y3Var);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, -9120, null, 2, null);
        b = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
        c = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
        d = Expression.Companion.constant$default(companion, animationType, null, 2, null);
        e = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        f = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        DivFontWeight divFontWeight = DivFontWeight.REGULAR;
        g = Expression.Companion.constant$default(companion, divFontWeight, null, 2, null);
        h = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
        i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        j = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        k = new y3(Expression.Companion.constant$default(companion, 6L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 6L, null, 2, null), 82);
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        l = companion2.from(rl3.L(DivFontWeight.values()), a.i);
        m = companion2.from(animationType, b.i);
        n = companion2.from(divSizeUnit, c.i);
        o = companion2.from(divFontWeight, d.i);
        p = companion2.from(rl3.L(DivFontWeight.values()), e.i);
        q = new p11(12);
        r = new rf3(8);
        s = new r11(11);
        t = new sf3(8);
        u = new s11(9);
    }
}

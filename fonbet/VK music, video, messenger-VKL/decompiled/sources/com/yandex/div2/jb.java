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
import com.yandex.div2.DivTabs;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.as;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;
import xsna.wr;
import xsna.xr;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public final class jb {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Boolean> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final v9.c d;

    @Deprecated
    public static final Expression<Boolean> e;

    @Deprecated
    public static final Expression<Long> f;

    @Deprecated
    public static final Expression<Integer> g;

    @Deprecated
    public static final y3 h;

    @Deprecated
    public static final Expression<Boolean> i;

    @Deprecated
    public static final y3 j;

    @Deprecated
    public static final Expression<DivVisibility> k;

    @Deprecated
    public static final v9.b l;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> m;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> n;

    @Deprecated
    public static final TypeHelper<DivVisibility> o;

    @Deprecated
    public static final wr p;

    @Deprecated
    public static final xr q;

    @Deprecated
    public static final io.reactivex.rxjava3.processors.b r;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.b s;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.c t;

    @Deprecated
    public static final as u;

    /* compiled from: DivTabsJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivTabs deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y6;
            bpn0 bpn0Var5 = feVar.Y2;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", jb.m, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", jb.n, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            wr wrVar = jb.p;
            Expression<Double> expression = jb.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, wrVar, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, jb.q);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = jb.b;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "dynamic_height", typeHelper3, izsVar3, expression3);
            Expression<Boolean> expression4 = readOptionalExpression5 == null ? expression3 : readOptionalExpression5;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            Expression<Boolean> expression5 = jb.c;
            Expression<Boolean> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_separator", typeHelper3, izsVar3, expression5);
            Expression<Boolean> expression6 = readOptionalExpression6 == null ? expression5 : readOptionalExpression6;
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var4);
            if (v9Var == null) {
                v9Var = jb.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "items", feVar.X7, jb.r);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var5);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var5);
            Expression<Boolean> expression7 = jb.e;
            Expression<Boolean> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, izsVar3, expression7);
            Expression<Boolean> expression8 = readOptionalExpression7 == null ? expression7 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, jb.s);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            io.reactivex.rxjava3.subjects.c cVar = jb.t;
            Expression<Long> expression9 = jb.f;
            Expression<Long> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selected_tab", typeHelper2, izsVar2, cVar, expression9);
            if (readOptionalExpression10 != null) {
                expression9 = readOptionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression10 = jb.g;
            Expression<Integer> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "separator_color", typeHelper4, izsVar4, expression10);
            Expression<Integer> expression11 = readOptionalExpression11 == null ? expression10 : readOptionalExpression11;
            y3 y3Var3 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator_paddings", bpn0Var5);
            if (y3Var3 == null) {
                y3Var3 = jb.h;
            }
            y3 y3Var4 = y3Var3;
            Expression<Boolean> expression12 = jb.i;
            Expression<Boolean> readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, izsVar3, expression12);
            Expression<Boolean> expression13 = readOptionalExpression12 == null ? expression12 : readOptionalExpression12;
            DivTabs.b bVar = (DivTabs.b) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_delimiter", feVar.U7);
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_style", feVar.R7);
            y3 y3Var5 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_paddings", bpn0Var5);
            if (y3Var5 == null) {
                y3Var5 = jb.j;
            }
            y3 y3Var6 = y3Var5;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, jb.u);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper5 = jb.o;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = jb.k;
            Expression<DivVisibility> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, izsVar5, expression14);
            if (readOptionalExpression13 != null) {
                expression14 = readOptionalExpression13;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var4);
            if (v9Var3 == null) {
                v9Var3 = jb.l;
            }
            return new DivTabs(divAccessibility, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, readOptionalList3, expression4, readOptionalList4, jlnVar, readOptionalList5, expression6, v9Var2, str, readList, vmnVar, y3Var, y3Var2, expression8, readOptionalExpression8, readOptionalExpression9, readOptionalList6, expression9, expression11, y3Var4, expression13, bVar, tabTitleStyle, y3Var6, readOptionalList7, hdVar, d2Var, e1Var, e1Var2, readOptionalList8, readOptionalList9, readOptionalList10, expression14, zdVar, readOptionalList11, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivTabs divTabs) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divTabs.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divTabs.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divTabs.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divTabs.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divTabs.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divTabs.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divTabs.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divTabs.h);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divTabs.i, feVar.P2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "dynamic_height", divTabs.j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divTabs.k, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divTabs.l, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divTabs.m, feVar.I3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_separator", divTabs.n);
            v9 v9Var = divTabs.o;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTabs.p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divTabs.q, feVar.X7);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divTabs.r, feVar.M4);
            y3 y3Var = divTabs.s;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divTabs.t, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divTabs.u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divTabs.v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divTabs.w);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divTabs.x, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selected_tab", divTabs.y);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "separator_color", divTabs.z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator_paddings", divTabs.A, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabs.B);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_delimiter", divTabs.C, feVar.U7);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_style", divTabs.D, feVar.R7);
            JsonPropertyParser.write(parsingContext, jSONObject, "title_paddings", divTabs.E, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divTabs.F, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divTabs.G, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divTabs.H, feVar.U1);
            e1 e1Var = divTabs.I;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divTabs.J, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divTabs.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divTabs.L, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divTabs.M, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divTabs.N, DivVisibility.TO_STRING);
            zd zdVar = divTabs.O;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divTabs.P, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divTabs.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mb deserialize(ParsingContext parsingContext, mb mbVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = mbVar != null ? mbVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", jb.m, allowPropertyOverride, mbVar != null ? mbVar.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", jb.n, allowPropertyOverride, mbVar != null ? mbVar.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, mbVar != null ? mbVar.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, jb.p);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, mbVar != null ? mbVar.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, mbVar != null ? mbVar.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, mbVar != null ? mbVar.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = mbVar != null ? mbVar.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, jb.q);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, mbVar != null ? mbVar.i : null, feVar.Q2);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field3 = mbVar != null ? mbVar.j : null;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new mb(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field3, izsVar2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, mbVar != null ? mbVar.k : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, mbVar != null ? mbVar.l : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, mbVar != null ? mbVar.m : null, feVar.J3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, mbVar != null ? mbVar.n : null, izsVar2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, mbVar != null ? mbVar.o : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, mbVar != null ? mbVar.p : null), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, mbVar != null ? mbVar.q : null, feVar.Y7, jb.r), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, mbVar != null ? mbVar.r : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, mbVar != null ? mbVar.s : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, mbVar != null ? mbVar.t : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, mbVar != null ? mbVar.u : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, mbVar != null ? mbVar.v : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, mbVar != null ? mbVar.w : null, izsVar, jb.s), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, mbVar != null ? mbVar.x : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, mbVar != null ? mbVar.y : null, izsVar, jb.t), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, mbVar != null ? mbVar.z : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, mbVar != null ? mbVar.A : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, mbVar != null ? mbVar.B : null, izsVar2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, mbVar != null ? mbVar.C : null, feVar.V7), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, mbVar != null ? mbVar.D : null, feVar.S7), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, mbVar != null ? mbVar.E : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, mbVar != null ? mbVar.F : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, mbVar != null ? mbVar.G : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, mbVar != null ? mbVar.H : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, mbVar != null ? mbVar.I : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, mbVar != null ? mbVar.J : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, mbVar != null ? mbVar.K : null, DivTransitionTrigger.FROM_STRING, jb.u), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, mbVar != null ? mbVar.L : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, mbVar != null ? mbVar.M : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", jb.o, allowPropertyOverride, mbVar != null ? mbVar.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, mbVar != null ? mbVar.O : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, mbVar != null ? mbVar.P : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, mbVar != null ? mbVar.Q : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, mb mbVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = mbVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", mbVar.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", mbVar.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", mbVar.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", mbVar.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, mbVar.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", mbVar.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", mbVar.h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", mbVar.i, feVar.Q2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "dynamic_height", mbVar.j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", mbVar.k, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", mbVar.l, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", mbVar.m, feVar.J3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_separator", mbVar.n);
            Field<z9> field2 = mbVar.o;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", mbVar.p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", mbVar.q, feVar.Y7);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", mbVar.r, feVar.N4);
            Field<a4> field3 = mbVar.s;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field3, bpn0Var2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", mbVar.t, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", mbVar.u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", mbVar.v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", mbVar.w);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", mbVar.x, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selected_tab", mbVar.y);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "separator_color", mbVar.z, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator_paddings", mbVar.A, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", mbVar.B);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_delimiter", mbVar.C, feVar.V7);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_style", mbVar.D, feVar.S7);
            JsonFieldParser.writeField(parsingContext, jSONObject, "title_paddings", mbVar.E, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", mbVar.F, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", mbVar.G, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", mbVar.H, feVar.V1);
            Field<i1> field4 = mbVar.I;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", mbVar.J, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", mbVar.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", mbVar.L, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", mbVar.M, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", mbVar.N, DivVisibility.TO_STRING);
            Field<be> field5 = mbVar.O;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field5, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", mbVar.P, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", mbVar.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, mb, DivTabs> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivTabs resolve(ParsingContext parsingContext, mb mbVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = mbVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, mbVar.b, jSONObject, "alignment_horizontal", jb.m, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, mbVar.c, jSONObject, "alignment_vertical", jb.n, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = mbVar.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            wr wrVar = jb.p;
            Expression<Double> expression = jb.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, wrVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, mbVar.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = mbVar.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, jb.q);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.i, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            Field<Expression<Boolean>> field4 = mbVar.j;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = jb.b;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "dynamic_height", typeHelper3, izsVar3, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.k, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, mbVar.l, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.m, jSONObject, "functions", feVar.K3, feVar.I3);
            Field<Expression<Boolean>> field5 = mbVar.n;
            Expression<Boolean> expression5 = jb.c;
            Expression<Boolean> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "has_separator", typeHelper3, izsVar3, expression5);
            Expression<Boolean> expression6 = resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6;
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, mbVar.o, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = jb.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, mbVar.p, jSONObject, "id");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, mbVar.q, jSONObject, "items", feVar.Z7, feVar.X7, jb.r);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, mbVar.r, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, mbVar.s, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, mbVar.t, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Field<Expression<Boolean>> field6 = mbVar.u;
            Expression<Boolean> expression7 = jb.e;
            Expression<Boolean> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "restrict_parent_scroll", typeHelper3, izsVar3, expression7);
            Expression<Boolean> expression8 = resolveOptionalExpression7 == null ? expression7 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, mbVar.v, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, mbVar.w, jSONObject, "row_span", typeHelper2, izsVar2, jb.s);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.x, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            Field<Expression<Long>> field7 = mbVar.y;
            io.reactivex.rxjava3.subjects.c cVar = jb.t;
            Expression<Long> expression9 = jb.f;
            Expression<Long> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "selected_tab", typeHelper2, izsVar2, cVar, expression9);
            if (resolveOptionalExpression10 != null) {
                expression9 = resolveOptionalExpression10;
            }
            Field<Expression<Integer>> field8 = mbVar.z;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression10 = jb.g;
            Expression<Integer> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "separator_color", typeHelper4, izsVar4, expression10);
            Expression<Integer> expression11 = resolveOptionalExpression11 == null ? expression10 : resolveOptionalExpression11;
            y3 y3Var3 = (y3) JsonFieldResolver.resolveOptional(parsingContext, mbVar.A, jSONObject, "separator_paddings", feVar.a3, feVar.Y2);
            if (y3Var3 == null) {
                y3Var3 = jb.h;
            }
            y3 y3Var4 = y3Var3;
            Field<Expression<Boolean>> field9 = mbVar.B;
            Expression<Boolean> expression12 = jb.i;
            Expression<Boolean> resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, izsVar3, expression12);
            Expression<Boolean> expression13 = resolveOptionalExpression12 == null ? expression12 : resolveOptionalExpression12;
            DivTabs.b bVar = (DivTabs.b) JsonFieldResolver.resolveOptional(parsingContext, mbVar.C, jSONObject, "tab_title_delimiter", feVar.W7, feVar.U7);
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonFieldResolver.resolveOptional(parsingContext, mbVar.D, jSONObject, "tab_title_style", feVar.T7, feVar.R7);
            y3 y3Var5 = (y3) JsonFieldResolver.resolveOptional(parsingContext, mbVar.E, jSONObject, "title_paddings", feVar.a3, feVar.Y2);
            if (y3Var5 == null) {
                y3Var5 = jb.j;
            }
            y3 y3Var6 = y3Var5;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.F, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, mbVar.G, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, mbVar.H, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, mbVar.I, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, mbVar.J, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, jb.u);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.L, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.M, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field10 = mbVar.N;
            TypeHelper<DivVisibility> typeHelper5 = jb.o;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = jb.k;
            Expression<DivVisibility> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper5, izsVar5, expression14);
            if (resolveOptionalExpression13 != null) {
                expression14 = resolveOptionalExpression13;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, mbVar.O, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, mbVar.P, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, mbVar.Q, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = jb.l;
            }
            return new DivTabs(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, resolveOptionalList3, expression4, resolveOptionalList4, jlnVar, resolveOptionalList5, expression6, v9Var2, str, resolveList, vmnVar, y3Var, y3Var2, expression8, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList6, expression9, expression11, y3Var4, expression13, bVar, tabTitleStyle, y3Var6, resolveOptionalList7, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression14, zdVar, resolveOptionalList11, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        b = Expression.Companion.constant$default(companion, bool, null, 2, null);
        c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        d = new v9.c(new krn(null, null, null));
        e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        g = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        h = new y3(Expression.Companion.constant$default(companion, 0L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 0L, null, 2, null), 82);
        i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        j = new y3(Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 0L, null, 2, null), 82);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        k = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        l = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        m = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        n = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        o = companion2.from(divVisibility, c.i);
        p = new wr(16);
        q = new xr(16);
        r = new io.reactivex.rxjava3.processors.b(13);
        s = new io.reactivex.rxjava3.subjects.b(15);
        t = new io.reactivex.rxjava3.subjects.c(15);
        u = new as(15);
    }
}

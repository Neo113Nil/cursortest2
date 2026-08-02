package com.yandex.div2;

import com.ironsource.X3;
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
import com.yandex.div2.DivPager;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cq;
import xsna.dq;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.unn;
import xsna.up;
import xsna.vmn;
import xsna.vp;
import xsna.wp;

/* compiled from: DivPagerJsonParser.kt */
/* loaded from: classes8.dex */
public final class n7 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<DivPager.ItemAlignment> b;

    @Deprecated
    public static final Expression<Long> c;

    @Deprecated
    public static final v9.c d;

    @Deprecated
    public static final Expression<Boolean> e;

    @Deprecated
    public static final q4 f;

    @Deprecated
    public static final Expression<DivPager.Orientation> g;

    @Deprecated
    public static final Expression<Boolean> h;

    @Deprecated
    public static final Expression<DivPager.ItemAlignment> i;

    @Deprecated
    public static final Expression<DivVisibility> j;

    @Deprecated
    public static final v9.b k;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> l;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> m;

    @Deprecated
    public static final TypeHelper<DivPager.ItemAlignment> n;

    @Deprecated
    public static final TypeHelper<DivPager.Orientation> o;

    @Deprecated
    public static final TypeHelper<DivPager.ItemAlignment> p;

    @Deprecated
    public static final TypeHelper<DivVisibility> q;

    @Deprecated
    public static final up r;

    @Deprecated
    public static final vp s;

    @Deprecated
    public static final wp t;

    @Deprecated
    public static final cq u;

    @Deprecated
    public static final dq v;

    /* compiled from: DivPagerJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivPager.Orientation);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class g implements Serializer, Deserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivPager deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", n7.l, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", n7.m, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            up upVar = n7.r;
            Expression<Double> expression = n7.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, upVar, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, n7.s);
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = n7.n;
            izs<String, DivPager.ItemAlignment> izsVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression3 = n7.b;
            Expression<DivPager.ItemAlignment> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper3, izsVar3, expression3);
            Expression<DivPager.ItemAlignment> expression4 = readOptionalExpression5 == null ? expression3 : readOptionalExpression5;
            wp wpVar = n7.t;
            Expression<Long> expression5 = n7.c;
            Expression<Long> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, izsVar2, wpVar, expression5);
            if (readOptionalExpression6 != null) {
                expression5 = readOptionalExpression6;
            }
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = n7.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = n7.e;
            Expression<Boolean> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper4, izsVar4, expression6);
            Expression<Boolean> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            o2 o2Var = (o2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", feVar.d2);
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", feVar.w3);
            if (q4Var == null) {
                q4Var = n7.f;
            }
            q4 q4Var2 = q4Var;
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.z9);
            unn unnVar = (unn) JsonPropertyParser.read(parsingContext, jSONObject, "layout_mode", feVar.w5);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            TypeHelper<DivPager.Orientation> typeHelper5 = n7.o;
            izs<String, DivPager.Orientation> izsVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression8 = n7.g;
            Expression<DivPager.Orientation> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper5, izsVar5, expression8);
            Expression<DivPager.Orientation> expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            c7 c7Var = (c7) JsonPropertyParser.readOptional(parsingContext, jSONObject, "page_transformation", feVar.t5);
            Expression<Boolean> expression10 = n7.h;
            Expression<Boolean> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, n7.u);
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = n7.p;
            Expression<DivPager.ItemAlignment> expression12 = n7.i;
            Expression<DivPager.ItemAlignment> readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", typeHelper6, izsVar3, expression12);
            Expression<DivPager.ItemAlignment> expression13 = readOptionalExpression12 == null ? expression12 : readOptionalExpression12;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, n7.v);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper7 = n7.q;
            izs<String, DivVisibility> izsVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = n7.j;
            Expression<DivVisibility> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper7, izsVar6, expression14);
            if (readOptionalExpression13 != null) {
                expression14 = readOptionalExpression13;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = n7.k;
            }
            return new DivPager(divAccessibility, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, expression4, expression5, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str, expression7, o2Var, q4Var2, readOptionalList6, unnVar, vmnVar, y3Var, expression9, y3Var2, c7Var, expression11, readOptionalExpression10, readOptionalExpression11, expression13, readOptionalList7, readOptionalList8, hdVar, d2Var, e1Var, e1Var2, readOptionalList9, readOptionalList10, readOptionalList11, expression14, zdVar, readOptionalList12, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivPager divPager) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divPager.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divPager.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divPager.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divPager.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divPager.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divPager.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divPager.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divPager.h);
            Expression<DivPager.ItemAlignment> expression = divPager.i;
            izs<DivPager.ItemAlignment, String> izsVar = DivPager.ItemAlignment.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_axis_alignment", expression, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divPager.j);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divPager.k, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divPager.l, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divPager.m, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divPager.n, feVar.I3);
            v9 v9Var = divPager.o;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divPager.p);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "infinite_scroll", divPager.q);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divPager.r, feVar.d2);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divPager.s, feVar.w3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divPager.t, feVar.z9);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_mode", divPager.u, feVar.w5);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divPager.v, feVar.M4);
            y3 y3Var = divPager.w;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divPager.x, DivPager.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divPager.y, bpn0Var2);
            JsonPropertyParser.write(parsingContext, jSONObject, "page_transformation", divPager.z, feVar.t5);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divPager.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divPager.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divPager.C);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_axis_alignment", divPager.D, izsVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divPager.E, feVar.k1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divPager.F, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divPager.G, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divPager.H, feVar.U1);
            e1 e1Var = divPager.I;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divPager.J, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divPager.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divPager.L, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divPager.M, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divPager.N, DivVisibility.TO_STRING);
            zd zdVar = divPager.O;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divPager.P, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divPager.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class h implements Serializer, TemplateDeserializer {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o7 deserialize(ParsingContext parsingContext, o7 o7Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = o7Var != null ? o7Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", n7.l, allowPropertyOverride, o7Var != null ? o7Var.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", n7.m, allowPropertyOverride, o7Var != null ? o7Var.c : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, o7Var != null ? o7Var.d : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, n7.r);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, o7Var != null ? o7Var.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, o7Var != null ? o7Var.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, o7Var != null ? o7Var.g : null, feVar.M1);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = o7Var != null ? o7Var.h : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, n7.s);
            TypeHelper<DivPager.ItemAlignment> typeHelper2 = n7.n;
            Field<Expression<DivPager.ItemAlignment>> field3 = o7Var != null ? o7Var.i : null;
            izs<String, DivPager.ItemAlignment> izsVar2 = DivPager.ItemAlignment.FROM_STRING;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field3, izsVar2);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, o7Var != null ? o7Var.j : null, izsVar, n7.t);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, o7Var != null ? o7Var.k : null, feVar.Q2);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, o7Var != null ? o7Var.l : null, feVar.c3);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, o7Var != null ? o7Var.m : null, feVar.A3);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, o7Var != null ? o7Var.n : null, feVar.J3);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, o7Var != null ? o7Var.o : null, feVar.Z6);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, o7Var != null ? o7Var.p : null);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field4 = o7Var != null ? o7Var.q : null;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new o7(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field4, izsVar3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, o7Var != null ? o7Var.r : null, feVar.e2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, o7Var != null ? o7Var.s : null, feVar.x3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, o7Var != null ? o7Var.t : null, feVar.A9), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, o7Var != null ? o7Var.u : null, feVar.x5), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, o7Var != null ? o7Var.v : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, o7Var != null ? o7Var.w : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, n7.o, allowPropertyOverride, o7Var != null ? o7Var.x : null, DivPager.Orientation.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, o7Var != null ? o7Var.y : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, o7Var != null ? o7Var.z : null, feVar.u5), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, o7Var != null ? o7Var.A : null, izsVar3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, o7Var != null ? o7Var.B : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, o7Var != null ? o7Var.C : null, izsVar, n7.u), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scroll_axis_alignment", n7.p, allowPropertyOverride, o7Var != null ? o7Var.D : null, izsVar2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, o7Var != null ? o7Var.E : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, o7Var != null ? o7Var.F : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, o7Var != null ? o7Var.G : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, o7Var != null ? o7Var.H : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, o7Var != null ? o7Var.I : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, o7Var != null ? o7Var.J : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, o7Var != null ? o7Var.K : null, DivTransitionTrigger.FROM_STRING, n7.v), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, o7Var != null ? o7Var.L : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, o7Var != null ? o7Var.M : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", n7.q, allowPropertyOverride, o7Var != null ? o7Var.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, o7Var != null ? o7Var.O : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, o7Var != null ? o7Var.P : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, o7Var != null ? o7Var.Q : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, o7 o7Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = o7Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", o7Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", o7Var.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", o7Var.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", o7Var.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, o7Var.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", o7Var.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", o7Var.h);
            Field<Expression<DivPager.ItemAlignment>> field2 = o7Var.i;
            izs<DivPager.ItemAlignment, String> izsVar = DivPager.ItemAlignment.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_axis_alignment", field2, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", o7Var.j);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", o7Var.k, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", o7Var.l, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", o7Var.m, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", o7Var.n, feVar.J3);
            Field<z9> field3 = o7Var.o;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field3, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", o7Var.p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "infinite_scroll", o7Var.q);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", o7Var.r, feVar.e2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", o7Var.s, feVar.x3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", o7Var.t, feVar.A9);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_mode", o7Var.u, feVar.x5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", o7Var.v, feVar.N4);
            Field<a4> field4 = o7Var.w;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field4, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, o7Var.x, DivPager.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", o7Var.y, bpn0Var2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "page_transformation", o7Var.z, feVar.u5);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", o7Var.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", o7Var.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", o7Var.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_axis_alignment", o7Var.D, izsVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", o7Var.E, feVar.l1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", o7Var.F, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", o7Var.G, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", o7Var.H, feVar.V1);
            Field<i1> field5 = o7Var.I;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field5, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", o7Var.J, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", o7Var.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", o7Var.L, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", o7Var.M, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", o7Var.N, DivVisibility.TO_STRING);
            Field<be> field6 = o7Var.O;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field6, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", o7Var.P, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", o7Var.Q, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class i implements TemplateResolver<JSONObject, o7, DivPager> {
        public final fe a;

        public i(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivPager resolve(ParsingContext parsingContext, o7 o7Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = o7Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, o7Var.b, jSONObject, "alignment_horizontal", n7.l, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, o7Var.c, jSONObject, "alignment_vertical", n7.m, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = o7Var.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            up upVar = n7.r;
            Expression<Double> expression = n7.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, upVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, o7Var.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = o7Var.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, n7.s);
            Field<Expression<DivPager.ItemAlignment>> field4 = o7Var.i;
            TypeHelper<DivPager.ItemAlignment> typeHelper3 = n7.n;
            izs<String, DivPager.ItemAlignment> izsVar3 = DivPager.ItemAlignment.FROM_STRING;
            Expression<DivPager.ItemAlignment> expression3 = n7.b;
            Expression<DivPager.ItemAlignment> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "cross_axis_alignment", typeHelper3, izsVar3, expression3);
            Expression<DivPager.ItemAlignment> expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            Field<Expression<Long>> field5 = o7Var.j;
            wp wpVar = n7.t;
            Expression<Long> expression5 = n7.c;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_item", typeHelper2, izsVar2, wpVar, expression5);
            if (resolveOptionalExpression6 != null) {
                expression5 = resolveOptionalExpression6;
            }
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.k, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.l, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, o7Var.m, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.n, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, o7Var.o, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = n7.d;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, o7Var.p, jSONObject, "id");
            Field<Expression<Boolean>> field6 = o7Var.q;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression6 = n7.e;
            Expression<Boolean> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "infinite_scroll", typeHelper4, izsVar4, expression6);
            Expression<Boolean> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            o2 o2Var = (o2) JsonFieldResolver.resolveOptional(parsingContext, o7Var.r, jSONObject, "item_builder", feVar.f2, feVar.d2);
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, o7Var.s, jSONObject, "item_spacing", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = n7.f;
            }
            q4 q4Var2 = q4Var;
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.t, jSONObject, "items", feVar.B9, feVar.z9);
            unn unnVar = (unn) JsonFieldResolver.resolve(parsingContext, o7Var.u, jSONObject, "layout_mode", feVar.y5, feVar.w5);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, o7Var.v, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, o7Var.w, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<DivPager.Orientation>> field7 = o7Var.x;
            TypeHelper<DivPager.Orientation> typeHelper5 = n7.o;
            izs<String, DivPager.Orientation> izsVar5 = DivPager.Orientation.FROM_STRING;
            Expression<DivPager.Orientation> expression8 = n7.g;
            Expression<DivPager.Orientation> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, X3.i.n, typeHelper5, izsVar5, expression8);
            Expression<DivPager.Orientation> expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, o7Var.y, jSONObject, "paddings", feVar.a3, feVar.Y2);
            c7 c7Var = (c7) JsonFieldResolver.resolveOptional(parsingContext, o7Var.z, jSONObject, "page_transformation", feVar.v5, feVar.t5);
            Field<Expression<Boolean>> field8 = o7Var.A;
            Expression<Boolean> expression10 = n7.h;
            Expression<Boolean> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "restrict_parent_scroll", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, o7Var.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, o7Var.C, jSONObject, "row_span", typeHelper2, izsVar2, n7.u);
            Field<Expression<DivPager.ItemAlignment>> field9 = o7Var.D;
            TypeHelper<DivPager.ItemAlignment> typeHelper6 = n7.p;
            Expression<DivPager.ItemAlignment> expression12 = n7.i;
            Expression<DivPager.ItemAlignment> resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scroll_axis_alignment", typeHelper6, izsVar3, expression12);
            Expression<DivPager.ItemAlignment> expression13 = resolveOptionalExpression12 == null ? expression12 : resolveOptionalExpression12;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.E, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.F, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, o7Var.G, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, o7Var.H, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, o7Var.I, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, o7Var.J, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, n7.v);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.L, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.M, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field10 = o7Var.N;
            TypeHelper<DivVisibility> typeHelper7 = n7.q;
            izs<String, DivVisibility> izsVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = n7.j;
            Expression<DivVisibility> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper7, izsVar6, expression14);
            if (resolveOptionalExpression13 != null) {
                expression14 = resolveOptionalExpression13;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, o7Var.O, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, o7Var.P, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, o7Var.Q, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = n7.k;
            }
            return new DivPager(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, expression4, expression5, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str, expression7, o2Var, q4Var2, resolveOptionalList6, unnVar, vmnVar, y3Var, expression9, y3Var2, c7Var, expression11, resolveOptionalExpression10, resolveOptionalExpression11, expression13, resolveOptionalList7, resolveOptionalList8, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression14, zdVar, resolveOptionalList12, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivPager.ItemAlignment itemAlignment = DivPager.ItemAlignment.START;
        b = Expression.Companion.constant$default(companion, itemAlignment, null, 2, null);
        c = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        d = new v9.c(new krn(null, null, null));
        Boolean bool = Boolean.FALSE;
        e = Expression.Companion.constant$default(companion, bool, null, 2, null);
        f = new q4(Expression.Companion.constant$default(companion, 0L, null, 2, null));
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        g = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        h = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivPager.ItemAlignment itemAlignment2 = DivPager.ItemAlignment.CENTER;
        i = Expression.Companion.constant$default(companion, itemAlignment2, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        k = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        l = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        m = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        n = companion2.from(itemAlignment, c.i);
        o = companion2.from(orientation, d.i);
        p = companion2.from(itemAlignment2, e.i);
        q = companion2.from(divVisibility, f.i);
        r = new up(11);
        s = new vp(13);
        t = new wp(10);
        u = new cq(11);
        v = new dq(11);
    }
}

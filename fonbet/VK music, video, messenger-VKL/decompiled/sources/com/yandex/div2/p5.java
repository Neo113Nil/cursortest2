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
import com.yandex.div2.DivIndicator;
import com.yandex.div2.q9;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.ao;
import xsna.bo;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.rr;
import xsna.sr;
import xsna.tr;
import xsna.vmn;
import xsna.zn;

/* compiled from: DivIndicatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class p5 {

    @Deprecated
    public static final Expression<Integer> a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Double> c;

    @Deprecated
    public static final Expression<DivIndicator.Animation> d;

    @Deprecated
    public static final v9.c e;

    @Deprecated
    public static final Expression<Integer> f;

    @Deprecated
    public static final Expression<Double> g;

    @Deprecated
    public static final q9.b h;

    @Deprecated
    public static final q4 i;

    @Deprecated
    public static final Expression<DivVisibility> j;

    @Deprecated
    public static final v9.b k;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> l;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> m;

    @Deprecated
    public static final TypeHelper<DivIndicator.Animation> n;

    @Deprecated
    public static final TypeHelper<DivVisibility> o;

    @Deprecated
    public static final rr p;

    @Deprecated
    public static final zn q;

    @Deprecated
    public static final ao r;

    @Deprecated
    public static final bo s;

    @Deprecated
    public static final sr t;

    @Deprecated
    public static final tr u;

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivIndicator.Animation);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class e implements Serializer, Deserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivIndicator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            bpn0 bpn0Var6 = feVar.u6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = p5.a;
            Expression<Integer> readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, izsVar, expression);
            Expression<Integer> expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            rr rrVar = p5.p;
            Expression<Double> expression3 = p5.b;
            Expression<Double> readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, izsVar2, rrVar, expression3);
            Expression<Double> expression4 = readOptionalExpression2 == null ? expression3 : readOptionalExpression2;
            y8 y8Var = (y8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "active_shape", bpn0Var6);
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", p5.l, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", p5.m, DivAlignmentVertical.FROM_STRING);
            zn znVar = p5.q;
            Expression<Double> expression5 = p5.c;
            Expression<Double> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper2, izsVar2, znVar, expression5);
            Expression<Double> expression6 = readOptionalExpression5 == null ? expression5 : readOptionalExpression5;
            TypeHelper<DivIndicator.Animation> typeHelper3 = p5.n;
            izs<String, DivIndicator.Animation> izsVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression7 = p5.d;
            Expression<DivIndicator.Animation> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", typeHelper3, izsVar3, expression7);
            Expression<DivIndicator.Animation> expression8 = readOptionalExpression6 == null ? expression7 : readOptionalExpression6;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, izsVar4, p5.r);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = p5.e;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression<Integer> expression9 = p5.f;
            Expression<Integer> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, izsVar, expression9);
            Expression<Integer> expression10 = readOptionalExpression8 == null ? expression9 : readOptionalExpression8;
            y8 y8Var2 = (y8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_minimum_shape", bpn0Var6);
            y8 y8Var3 = (y8) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_shape", bpn0Var6);
            k5 k5Var = (k5) JsonPropertyParser.readOptional(parsingContext, jSONObject, "items_placement", feVar.a4);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            bo boVar = p5.s;
            Expression<Double> expression11 = p5.g;
            Expression<Double> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, izsVar2, boVar, expression11);
            if (readOptionalExpression9 != null) {
                expression11 = readOptionalExpression9;
            }
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pager_id");
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, izsVar4, p5.t);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            q9 q9Var = (q9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shape", feVar.S6);
            if (q9Var == null) {
                q9Var = p5.h;
            }
            q9 q9Var2 = q9Var;
            q4 q4Var = (q4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", feVar.w3);
            if (q4Var == null) {
                q4Var = p5.i;
            }
            q4 q4Var2 = q4Var;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, p5.u);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper5 = p5.o;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression12 = p5.j;
            Expression<DivVisibility> readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper5, izsVar5, expression12);
            if (readOptionalExpression12 != null) {
                expression12 = readOptionalExpression12;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = p5.k;
            }
            return new DivIndicator(divAccessibility, expression2, expression4, y8Var, readOptionalExpression3, readOptionalExpression4, expression6, expression8, readOptionalList, readOptionalList2, u1Var, readOptionalExpression7, readOptionalList3, readOptionalList4, jlnVar, readOptionalList5, v9Var2, str, expression10, y8Var2, y8Var3, k5Var, vmnVar, y3Var, expression11, y3Var2, str2, readOptionalExpression10, readOptionalExpression11, readOptionalList6, q9Var2, q4Var2, readOptionalList7, hdVar, d2Var, e1Var, e1Var2, readOptionalList8, readOptionalList9, readOptionalList10, expression12, zdVar, readOptionalList11, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivIndicator divIndicator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divIndicator.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            Expression<Integer> expression = divIndicator.b;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_color", expression, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_size", divIndicator.c);
            y8 y8Var = divIndicator.d;
            bpn0 bpn0Var = feVar.u6;
            JsonPropertyParser.write(parsingContext, jSONObject, "active_shape", y8Var, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divIndicator.e, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divIndicator.f, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divIndicator.g);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation", divIndicator.h, DivIndicator.Animation.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divIndicator.i, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divIndicator.j, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divIndicator.k, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divIndicator.l);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divIndicator.m, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divIndicator.n, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divIndicator.o, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divIndicator.p, feVar.I3);
            v9 v9Var = divIndicator.q;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divIndicator.r);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_item_color", divIndicator.s, izsVar);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_minimum_shape", divIndicator.t, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_shape", divIndicator.u, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "items_placement", divIndicator.v, feVar.a4);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divIndicator.w, feVar.M4);
            y3 y3Var = divIndicator.x;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "minimum_item_size", divIndicator.y);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divIndicator.z, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "pager_id", divIndicator.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divIndicator.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divIndicator.C);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divIndicator.D, feVar.k1);
            JsonPropertyParser.write(parsingContext, jSONObject, "shape", divIndicator.E, feVar.S6);
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divIndicator.F, feVar.w3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divIndicator.G, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divIndicator.H, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divIndicator.I, feVar.U1);
            e1 e1Var = divIndicator.J;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divIndicator.K, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divIndicator.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divIndicator.M, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divIndicator.N, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divIndicator.O, DivVisibility.TO_STRING);
            zd zdVar = divIndicator.P;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divIndicator.Q, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divIndicator.R, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class f implements Serializer, TemplateDeserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q5 deserialize(ParsingContext parsingContext, q5 q5Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = q5Var != null ? q5Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field2 = q5Var != null ? q5Var.b : null;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field3 = q5Var != null ? q5Var.c : null;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field3, izsVar2, p5.p);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, q5Var != null ? q5Var.d : null, feVar.v6);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", p5.l, allowPropertyOverride, q5Var != null ? q5Var.e : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", p5.m, allowPropertyOverride, q5Var != null ? q5Var.f : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper2, allowPropertyOverride, q5Var != null ? q5Var.g : null, izsVar2, p5.q);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation", p5.n, allowPropertyOverride, q5Var != null ? q5Var.h : null, DivIndicator.Animation.FROM_STRING);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, q5Var != null ? q5Var.i : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, q5Var != null ? q5Var.j : null, feVar.G1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, q5Var != null ? q5Var.k : null, feVar.M1);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = q5Var != null ? q5Var.l : null;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            return new q5(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField, readOptionalListField2, readOptionalField3, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field4, izsVar3, p5.r), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, q5Var != null ? q5Var.m : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, q5Var != null ? q5Var.n : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, q5Var != null ? q5Var.o : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, q5Var != null ? q5Var.p : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, q5Var != null ? q5Var.q : null, feVar.Z6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, q5Var != null ? q5Var.r : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, q5Var != null ? q5Var.s : null, izsVar), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, q5Var != null ? q5Var.t : null, feVar.v6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, q5Var != null ? q5Var.u : null, feVar.v6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, q5Var != null ? q5Var.v : null, feVar.b4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, q5Var != null ? q5Var.w : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, q5Var != null ? q5Var.x : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, q5Var != null ? q5Var.y : null, izsVar2, p5.s), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, q5Var != null ? q5Var.z : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, q5Var != null ? q5Var.A : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, q5Var != null ? q5Var.B : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, q5Var != null ? q5Var.C : null, izsVar3, p5.t), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, q5Var != null ? q5Var.D : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, q5Var != null ? q5Var.E : null, feVar.T6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, q5Var != null ? q5Var.F : null, feVar.x3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, q5Var != null ? q5Var.G : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, q5Var != null ? q5Var.H : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, q5Var != null ? q5Var.I : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, q5Var != null ? q5Var.J : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, q5Var != null ? q5Var.K : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, q5Var != null ? q5Var.L : null, DivTransitionTrigger.FROM_STRING, p5.u), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, q5Var != null ? q5Var.M : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, q5Var != null ? q5Var.N : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", p5.o, allowPropertyOverride, q5Var != null ? q5Var.O : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, q5Var != null ? q5Var.P : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, q5Var != null ? q5Var.Q : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, q5Var != null ? q5Var.R : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, q5 q5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = q5Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<Expression<Integer>> field2 = q5Var.b;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_color", field2, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_size", q5Var.c);
            Field<a9> field3 = q5Var.d;
            bpn0 bpn0Var = feVar.v6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "active_shape", field3, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", q5Var.e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", q5Var.f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", q5Var.g);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation", q5Var.h, DivIndicator.Animation.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", q5Var.i, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, q5Var.j, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", q5Var.k, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", q5Var.l);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", q5Var.m, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", q5Var.n, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", q5Var.o, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", q5Var.p, feVar.J3);
            Field<z9> field4 = q5Var.q;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field4, bpn0Var2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", q5Var.r);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_item_color", q5Var.s, izsVar);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_minimum_shape", q5Var.t, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_shape", q5Var.u, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "items_placement", q5Var.v, feVar.b4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", q5Var.w, feVar.N4);
            Field<a4> field5 = q5Var.x;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field5, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "minimum_item_size", q5Var.y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", q5Var.z, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "pager_id", q5Var.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", q5Var.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", q5Var.C);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", q5Var.D, feVar.l1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shape", q5Var.E, feVar.T6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", q5Var.F, feVar.x3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", q5Var.G, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", q5Var.H, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", q5Var.I, feVar.V1);
            Field<i1> field6 = q5Var.J;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field6, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", q5Var.K, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", q5Var.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", q5Var.M, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", q5Var.N, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", q5Var.O, DivVisibility.TO_STRING);
            Field<be> field7 = q5Var.P;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field7, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", q5Var.Q, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", q5Var.R, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class g implements TemplateResolver<JSONObject, q5, DivIndicator> {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivIndicator resolve(ParsingContext parsingContext, q5 q5Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = q5Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Field<Expression<Integer>> field2 = q5Var.b;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression = p5.a;
            Expression<Integer> resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_color", typeHelper, izsVar, expression);
            Expression<Integer> expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field<Expression<Double>> field3 = q5Var.c;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar2 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            rr rrVar = p5.p;
            Expression<Double> expression3 = p5.b;
            Expression<Double> resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_item_size", typeHelper2, izsVar2, rrVar, expression3);
            Expression<Double> expression4 = resolveOptionalExpression2 == null ? expression3 : resolveOptionalExpression2;
            y8 y8Var = (y8) JsonFieldResolver.resolveOptional(parsingContext, q5Var.d, jSONObject, "active_shape", feVar.w6, feVar.u6);
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, q5Var.e, jSONObject, "alignment_horizontal", p5.l, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, q5Var.f, jSONObject, "alignment_vertical", p5.m, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field4 = q5Var.g;
            zn znVar = p5.q;
            Expression<Double> expression5 = p5.c;
            Expression<Double> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper2, izsVar2, znVar, expression5);
            Expression<Double> expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field<Expression<DivIndicator.Animation>> field5 = q5Var.h;
            TypeHelper<DivIndicator.Animation> typeHelper3 = p5.n;
            izs<String, DivIndicator.Animation> izsVar3 = DivIndicator.Animation.FROM_STRING;
            Expression<DivIndicator.Animation> expression7 = p5.d;
            Expression<DivIndicator.Animation> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "animation", typeHelper3, izsVar3, expression7);
            Expression<DivIndicator.Animation> expression8 = resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.i, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.j, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, q5Var.k, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field6 = q5Var.l;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper4, izsVar4, p5.r);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.m, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.n, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, q5Var.o, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.p, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, q5Var.q, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = p5.e;
            }
            v9 v9Var2 = v9Var;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, q5Var.r, jSONObject, "id");
            Field<Expression<Integer>> field7 = q5Var.s;
            Expression<Integer> expression9 = p5.f;
            Expression<Integer> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "inactive_item_color", typeHelper, izsVar, expression9);
            Expression<Integer> expression10 = resolveOptionalExpression8 == null ? expression9 : resolveOptionalExpression8;
            y8 y8Var2 = (y8) JsonFieldResolver.resolveOptional(parsingContext, q5Var.t, jSONObject, "inactive_minimum_shape", feVar.w6, feVar.u6);
            y8 y8Var3 = (y8) JsonFieldResolver.resolveOptional(parsingContext, q5Var.u, jSONObject, "inactive_shape", feVar.w6, feVar.u6);
            k5 k5Var = (k5) JsonFieldResolver.resolveOptional(parsingContext, q5Var.v, jSONObject, "items_placement", feVar.c4, feVar.a4);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, q5Var.w, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, q5Var.x, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<Double>> field8 = q5Var.y;
            bo boVar = p5.s;
            Expression<Double> expression11 = p5.g;
            Expression<Double> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "minimum_item_size", typeHelper2, izsVar2, boVar, expression11);
            if (resolveOptionalExpression9 != null) {
                expression11 = resolveOptionalExpression9;
            }
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, q5Var.z, jSONObject, "paddings", feVar.a3, feVar.Y2);
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, q5Var.A, jSONObject, "pager_id");
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, q5Var.B, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, q5Var.C, jSONObject, "row_span", typeHelper4, izsVar4, p5.t);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.D, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            q9 q9Var = (q9) JsonFieldResolver.resolveOptional(parsingContext, q5Var.E, jSONObject, "shape", feVar.U6, feVar.S6);
            if (q9Var == null) {
                q9Var = p5.h;
            }
            q9 q9Var2 = q9Var;
            q4 q4Var = (q4) JsonFieldResolver.resolveOptional(parsingContext, q5Var.F, jSONObject, "space_between_centers", feVar.y3, feVar.w3);
            if (q4Var == null) {
                q4Var = p5.i;
            }
            q4 q4Var2 = q4Var;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.G, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, q5Var.H, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, q5Var.I, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, q5Var.J, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, q5Var.K, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, p5.u);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.M, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.N, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field9 = q5Var.O;
            TypeHelper<DivVisibility> typeHelper5 = p5.o;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression12 = p5.j;
            Expression<DivVisibility> resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper5, izsVar5, expression12);
            if (resolveOptionalExpression12 != null) {
                expression12 = resolveOptionalExpression12;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, q5Var.P, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, q5Var.Q, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, q5Var.R, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = p5.k;
            }
            return new DivIndicator(divAccessibility, expression2, expression4, y8Var, resolveOptionalExpression3, resolveOptionalExpression4, expression6, expression8, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression7, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalList5, v9Var2, str, expression10, y8Var2, y8Var3, k5Var, vmnVar, y3Var, expression11, y3Var2, str2, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalList6, q9Var2, q4Var2, resolveOptionalList7, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression12, zdVar, resolveOptionalList11, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        b = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        c = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
        d = Expression.Companion.constant$default(companion, animation, null, 2, null);
        e = new v9.c(new krn(null, null, null));
        f = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        g = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        h = new q9.b(new y8(0));
        i = new q4(Expression.Companion.constant$default(companion, 15L, null, 2, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        k = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        l = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        m = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        n = companion2.from(animation, c.i);
        o = companion2.from(divVisibility, d.i);
        p = new rr(13);
        q = new zn(12);
        r = new ao(15);
        s = new bo(16);
        t = new sr(11);
        u = new tr(10);
    }
}

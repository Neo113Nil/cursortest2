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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;
import xsna.yq;

/* compiled from: DivSeparatorJsonParser.kt */
/* loaded from: classes8.dex */
public final class l9 {

    @Deprecated
    public static final DivAnimation a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final v9.c d;

    @Deprecated
    public static final Expression<DivVisibility> e;

    @Deprecated
    public static final v9.b f;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> g;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> h;

    @Deprecated
    public static final TypeHelper<DivVisibility> i;

    @Deprecated
    public static final yq j;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.j k;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.k l;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.mixed.n m;

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class d implements Serializer, Deserializer {
        public final fe a;

        public d(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivSeparator deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            bpn0 bpn0Var6 = feVar.k1;
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", bpn0Var6);
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", feVar.q1);
            if (divAnimation == null) {
                divAnimation = l9.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", l9.g, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", l9.h, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            yq yqVar = l9.j;
            Expression<Double> expression = l9.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, yqVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = l9.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, izsVar3, l9.k);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "delimiter_style", feVar.J6);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = l9.d;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, izsVar3, l9.l);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, l9.m);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper4 = l9.i;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = l9.e;
            Expression<DivVisibility> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper4, izsVar4, expression4);
            if (readOptionalExpression8 != null) {
                expression4 = readOptionalExpression8;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = l9.f;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, u1Var, expression3, readOptionalExpression5, delimiterStyle, readOptionalList4, readOptionalList5, readOptionalList6, jlnVar, readOptionalList7, v9Var2, readOptionalList8, readOptionalList9, str, vmnVar, readOptionalList10, y3Var, y3Var2, readOptionalList11, readOptionalList12, readOptionalExpression6, readOptionalExpression7, readOptionalList13, readOptionalList14, hdVar, d2Var, e1Var, e1Var2, readOptionalList15, readOptionalList16, readOptionalList17, expression4, zdVar, readOptionalList18, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivSeparator divSeparator) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divSeparator.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = divSeparator.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divSeparator.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divSeparator.d, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSeparator.e, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSeparator.f, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSeparator.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSeparator.h, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divSeparator.i, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSeparator.j, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divSeparator.k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSeparator.l);
            JsonPropertyParser.write(parsingContext, jSONObject, "delimiter_style", divSeparator.m, feVar.J6);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSeparator.n, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divSeparator.o, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSeparator.p, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSeparator.q, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSeparator.r, feVar.I3);
            v9 v9Var = divSeparator.s;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divSeparator.t, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divSeparator.u, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSeparator.v);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSeparator.w, feVar.M4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divSeparator.x, bpn0Var);
            y3 y3Var = divSeparator.y;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSeparator.z, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divSeparator.A, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divSeparator.B, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSeparator.C);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSeparator.D);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSeparator.E, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSeparator.F, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSeparator.G, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSeparator.H, feVar.U1);
            e1 e1Var = divSeparator.I;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSeparator.J, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSeparator.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSeparator.L, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSeparator.M, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divSeparator.N, DivVisibility.TO_STRING);
            zd zdVar = divSeparator.O;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSeparator.P, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSeparator.Q, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class e implements Serializer, TemplateDeserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m9 deserialize(ParsingContext parsingContext, m9 m9Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = m9Var != null ? m9Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, m9Var != null ? m9Var.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, m9Var != null ? m9Var.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, m9Var != null ? m9Var.d : null, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", l9.g, allowPropertyOverride, m9Var != null ? m9Var.e : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", l9.h, allowPropertyOverride, m9Var != null ? m9Var.f : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, m9Var != null ? m9Var.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, l9.j);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, m9Var != null ? m9Var.h : null, feVar.u1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, m9Var != null ? m9Var.i : null, feVar.G1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, m9Var != null ? m9Var.j : null, feVar.M1);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, m9Var != null ? m9Var.k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field2 = m9Var != null ? m9Var.l : null;
            izs<Number, Long> izsVar = ParsingConvertersKt.NUMBER_TO_INT;
            return new m9(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field2, izsVar, l9.k), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "delimiter_style", allowPropertyOverride, m9Var != null ? m9Var.m : null, feVar.K6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, m9Var != null ? m9Var.n : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, m9Var != null ? m9Var.o : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, m9Var != null ? m9Var.p : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, m9Var != null ? m9Var.q : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, m9Var != null ? m9Var.r : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, m9Var != null ? m9Var.s : null, feVar.Z6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, m9Var != null ? m9Var.t : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, m9Var != null ? m9Var.u : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, m9Var != null ? m9Var.v : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, m9Var != null ? m9Var.w : null, feVar.N4), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, m9Var != null ? m9Var.x : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, m9Var != null ? m9Var.y : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, m9Var != null ? m9Var.z : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, m9Var != null ? m9Var.A : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, m9Var != null ? m9Var.B : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, m9Var != null ? m9Var.C : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, m9Var != null ? m9Var.D : null, izsVar, l9.l), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, m9Var != null ? m9Var.E : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, m9Var != null ? m9Var.F : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, m9Var != null ? m9Var.G : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, m9Var != null ? m9Var.H : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, m9Var != null ? m9Var.I : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, m9Var != null ? m9Var.J : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, m9Var != null ? m9Var.K : null, DivTransitionTrigger.FROM_STRING, l9.m), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, m9Var != null ? m9Var.L : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, m9Var != null ? m9Var.M : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", l9.i, allowPropertyOverride, m9Var != null ? m9Var.N : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, m9Var != null ? m9Var.O : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, m9Var != null ? m9Var.P : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, m9Var != null ? m9Var.Q : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, m9 m9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = m9Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = m9Var.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", m9Var.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", m9Var.d, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", m9Var.e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", m9Var.f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", m9Var.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", m9Var.h, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, m9Var.i, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", m9Var.j, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", m9Var.k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", m9Var.l);
            JsonFieldParser.writeField(parsingContext, jSONObject, "delimiter_style", m9Var.m, feVar.K6);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", m9Var.n, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", m9Var.o, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", m9Var.p, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", m9Var.q, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", m9Var.r, feVar.J3);
            Field<z9> field3 = m9Var.s;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field3, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", m9Var.t, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", m9Var.u, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", m9Var.v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", m9Var.w, feVar.N4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", m9Var.x, bpn0Var);
            Field<a4> field4 = m9Var.y;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", m9Var.z, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", m9Var.A, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", m9Var.B, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", m9Var.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", m9Var.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", m9Var.E, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", m9Var.F, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", m9Var.G, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", m9Var.H, feVar.V1);
            Field<i1> field5 = m9Var.I;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field5, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", m9Var.J, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", m9Var.K, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "separator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", m9Var.L, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", m9Var.M, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", m9Var.N, DivVisibility.TO_STRING);
            Field<be> field6 = m9Var.O;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field6, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", m9Var.P, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", m9Var.Q, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class f implements TemplateResolver<JSONObject, m9, DivSeparator> {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivSeparator resolve(ParsingContext parsingContext, m9 m9Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = m9Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, m9Var.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, m9Var.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = l9.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.e, jSONObject, "alignment_horizontal", l9.g, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.f, jSONObject, "alignment_vertical", l9.h, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = m9Var.g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            yq yqVar = l9.j;
            Expression<Double> expression = l9.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, yqVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.h, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.i, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, m9Var.j, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field3 = m9Var.k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = l9.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field<Expression<Long>> field4 = m9Var.l;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, izsVar3, l9.k);
            DivSeparator.DelimiterStyle delimiterStyle = (DivSeparator.DelimiterStyle) JsonFieldResolver.resolveOptional(parsingContext, m9Var.m, jSONObject, "delimiter_style", feVar.L6, feVar.J6);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.n, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.o, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.p, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, m9Var.q, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.r, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, m9Var.s, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = l9.d;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.t, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.u, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, m9Var.v, jSONObject, "id");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, m9Var.w, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.x, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, m9Var.y, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, m9Var.z, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.A, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.B, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.C, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, m9Var.D, jSONObject, "row_span", typeHelper3, izsVar3, l9.l);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.E, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.F, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, m9Var.G, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, m9Var.H, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, m9Var.I, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, m9Var.J, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.K, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, l9.m);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.L, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.M, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field5 = m9Var.N;
            TypeHelper<DivVisibility> typeHelper4 = l9.i;
            izs<String, DivVisibility> izsVar4 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression4 = l9.e;
            Expression<DivVisibility> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility", typeHelper4, izsVar4, expression4);
            if (resolveOptionalExpression8 != null) {
                expression4 = resolveOptionalExpression8;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, m9Var.O, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, m9Var.P, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, m9Var.Q, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = l9.f;
            }
            return new DivSeparator(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalList3, u1Var, expression3, resolveOptionalExpression5, delimiterStyle, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalList7, v9Var2, resolveOptionalList8, resolveOptionalList9, str, vmnVar, resolveOptionalList10, y3Var, y3Var2, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression6, resolveOptionalExpression7, resolveOptionalList13, resolveOptionalList14, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression4, zdVar, resolveOptionalList18, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        a = new DivAnimation(constant$default, constant$default2, constant$default3, Expression.Companion.constant$default(companion, valueOf, null, 2, null));
        b = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        c = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        d = new v9.c(new krn(null, null, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        e = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        f = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        g = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        h = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        i = companion2.from(divVisibility, c.i);
        j = new yq(12);
        k = new io.reactivex.rxjava3.internal.operators.mixed.j(14);
        l = new io.reactivex.rxjava3.internal.operators.mixed.k(13);
        m = new io.reactivex.rxjava3.internal.operators.mixed.n(10);
    }
}

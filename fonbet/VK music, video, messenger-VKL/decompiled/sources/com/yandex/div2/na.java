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
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.dn;
import xsna.en;
import xsna.hr;
import xsna.ir;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class na {

    @Deprecated
    public static final DivAnimation a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<Boolean> d;

    @Deprecated
    public static final v9.c e;

    @Deprecated
    public static final Expression<DivTransitionSelector> f;

    @Deprecated
    public static final Expression<DivVisibility> g;

    @Deprecated
    public static final v9.b h;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> i;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> j;

    @Deprecated
    public static final TypeHelper<DivTransitionSelector> k;

    @Deprecated
    public static final TypeHelper<DivVisibility> l;

    @Deprecated
    public static final dn m;

    @Deprecated
    public static final en n;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.observable.q1 o;

    @Deprecated
    public static final hr p;

    @Deprecated
    public static final ir q;

    /* compiled from: DivStateJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivTransitionSelector);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class e implements Serializer, Deserializer {
        public final fe a;

        public e(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ma deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
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
                divAnimation = na.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", na.i, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", na.j, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            dn dnVar = na.m;
            Expression<Double> expression = na.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, dnVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = na.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            Expression<Boolean> expression4 = na.d;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, izsVar2, expression4);
            Expression<Boolean> expression5 = readOptionalExpression5 == null ? expression4 : readOptionalExpression5;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, izsVar3, na.n);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper4);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div_id");
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = na.e;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, izsVar3, na.o);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "state_id_variable");
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "states", feVar.t7, na.p);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            TypeHelper<DivTransitionSelector> typeHelper5 = na.k;
            izs<String, DivTransitionSelector> izsVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression6 = na.f;
            Expression<DivTransitionSelector> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", typeHelper5, izsVar4, expression6);
            Expression<DivTransitionSelector> expression7 = readOptionalExpression10 == null ? expression6 : readOptionalExpression10;
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, na.q);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper6 = na.l;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = na.g;
            Expression<DivVisibility> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, izsVar5, expression8);
            if (readOptionalExpression11 != null) {
                expression8 = readOptionalExpression11;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = na.h;
            }
            return new ma(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, u1Var, expression3, expression5, readOptionalExpression6, readOptionalExpression7, readOptionalList4, str, readOptionalList5, readOptionalList6, jlnVar, readOptionalList7, v9Var2, readOptionalList8, readOptionalList9, str2, vmnVar, readOptionalList10, y3Var, y3Var2, readOptionalList11, readOptionalList12, readOptionalExpression8, readOptionalExpression9, readOptionalList13, str3, readList, readOptionalList14, hdVar, expression7, d2Var, e1Var, e1Var2, readOptionalList15, readOptionalList16, readOptionalList17, expression8, zdVar, readOptionalList18, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ma maVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = maVar.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = maVar.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", maVar.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", maVar.d, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", maVar.e, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", maVar.f, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", maVar.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", maVar.h, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, maVar.i, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", maVar.j, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", maVar.k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", maVar.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", maVar.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_state_id", maVar.n);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", maVar.o, feVar.P2);
            JsonPropertyParser.write(parsingContext, jSONObject, "div_id", maVar.p);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", maVar.q, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", maVar.r, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", maVar.s, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", maVar.t, feVar.I3);
            v9 v9Var = maVar.u;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", maVar.v, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", maVar.w, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", maVar.x);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", maVar.y, feVar.M4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", maVar.z, bpn0Var);
            y3 y3Var = maVar.A;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", maVar.B, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", maVar.C, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", maVar.D, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", maVar.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", maVar.F);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", maVar.G, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "state_id_variable", maVar.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", maVar.I, feVar.t7);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", maVar.J, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", maVar.K, feVar.Y8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", maVar.L, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", maVar.M, feVar.U1);
            e1 e1Var = maVar.N;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", maVar.O, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", maVar.P, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", maVar.Q, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", maVar.R, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", maVar.S, DivVisibility.TO_STRING);
            zd zdVar = maVar.T;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", maVar.U, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", maVar.V, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class f implements Serializer, TemplateDeserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ra deserialize(ParsingContext parsingContext, ra raVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = raVar != null ? raVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, raVar != null ? raVar.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, raVar != null ? raVar.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, raVar != null ? raVar.d : null, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", na.i, allowPropertyOverride, raVar != null ? raVar.e : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", na.j, allowPropertyOverride, raVar != null ? raVar.f : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, raVar != null ? raVar.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, na.m);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, raVar != null ? raVar.h : null, feVar.u1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, raVar != null ? raVar.i : null, feVar.G1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, raVar != null ? raVar.j : null, feVar.M1);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = raVar != null ? raVar.k : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field2, izsVar);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, raVar != null ? raVar.l : null, izsVar);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = raVar != null ? raVar.m : null;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, izsVar2, na.n);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new ra(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_state_id", typeHelper3, allowPropertyOverride, raVar != null ? raVar.n : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, raVar != null ? raVar.o : null, feVar.Q2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "div_id", allowPropertyOverride, raVar != null ? raVar.p : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, raVar != null ? raVar.q : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, raVar != null ? raVar.r : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, raVar != null ? raVar.s : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, raVar != null ? raVar.t : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, raVar != null ? raVar.u : null, feVar.Z6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, raVar != null ? raVar.v : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, raVar != null ? raVar.w : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, raVar != null ? raVar.x : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, raVar != null ? raVar.y : null, feVar.N4), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, raVar != null ? raVar.z : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, raVar != null ? raVar.A : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, raVar != null ? raVar.B : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, raVar != null ? raVar.C : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, raVar != null ? raVar.D : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, raVar != null ? raVar.E : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, raVar != null ? raVar.F : null, izsVar2, na.o), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, raVar != null ? raVar.G : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "state_id_variable", allowPropertyOverride, raVar != null ? raVar.H : null), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "states", allowPropertyOverride, raVar != null ? raVar.I : null, feVar.u7, na.p), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, raVar != null ? raVar.J : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, raVar != null ? raVar.K : null, feVar.Z8), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "transition_animation_selector", na.k, allowPropertyOverride, raVar != null ? raVar.L : null, DivTransitionSelector.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, raVar != null ? raVar.M : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, raVar != null ? raVar.N : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, raVar != null ? raVar.O : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, raVar != null ? raVar.P : null, DivTransitionTrigger.FROM_STRING, na.q), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, raVar != null ? raVar.Q : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, raVar != null ? raVar.R : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", na.l, allowPropertyOverride, raVar != null ? raVar.S : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, raVar != null ? raVar.T : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, raVar != null ? raVar.U : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, raVar != null ? raVar.V : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, ra raVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = raVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = raVar.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", raVar.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", raVar.d, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", raVar.e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", raVar.f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", raVar.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", raVar.h, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, raVar.i, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", raVar.j, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", raVar.k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", raVar.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", raVar.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_state_id", raVar.n);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", raVar.o, feVar.Q2);
            JsonFieldParser.writeField(parsingContext, jSONObject, "div_id", raVar.p);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", raVar.q, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", raVar.r, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", raVar.s, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", raVar.t, feVar.J3);
            Field<z9> field3 = raVar.u;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field3, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", raVar.v, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", raVar.w, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", raVar.x);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", raVar.y, feVar.N4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", raVar.z, bpn0Var);
            Field<a4> field4 = raVar.A;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field4, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", raVar.B, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", raVar.C, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", raVar.D, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", raVar.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", raVar.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", raVar.G, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "state_id_variable", raVar.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", raVar.I, feVar.u7);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", raVar.J, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", raVar.K, feVar.Z8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", raVar.L, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", raVar.M, feVar.V1);
            Field<i1> field5 = raVar.N;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field5, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", raVar.O, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", raVar.P, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", raVar.Q, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", raVar.R, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", raVar.S, DivVisibility.TO_STRING);
            Field<be> field6 = raVar.T;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field6, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", raVar.U, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", raVar.V, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class g implements TemplateResolver<JSONObject, ra, ma> {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ma resolve(ParsingContext parsingContext, ra raVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = raVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, raVar.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, raVar.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = na.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, raVar.e, jSONObject, "alignment_horizontal", na.i, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, raVar.f, jSONObject, "alignment_vertical", na.j, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = raVar.g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            dn dnVar = na.m;
            Expression<Double> expression = na.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, dnVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.h, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.i, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, raVar.j, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field3 = raVar.k;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = na.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field<Expression<Boolean>> field4 = raVar.l;
            Expression<Boolean> expression4 = na.d;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "clip_to_bounds", typeHelper2, izsVar2, expression4);
            Expression<Boolean> expression5 = resolveOptionalExpression5 == null ? expression4 : resolveOptionalExpression5;
            Field<Expression<Long>> field5 = raVar.m;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper3, izsVar3, na.n);
            Field<Expression<String>> field6 = raVar.n;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "default_state_id", typeHelper4);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.o, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, raVar.p, jSONObject, "div_id");
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.q, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.r, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, raVar.s, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.t, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, raVar.u, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = na.e;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.v, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.w, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, raVar.x, jSONObject, "id");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, raVar.y, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.z, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, raVar.A, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, raVar.B, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.C, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.D, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, raVar.E, jSONObject, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, raVar.F, jSONObject, "row_span", typeHelper3, izsVar3, na.o);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.G, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, raVar.H, jSONObject, "state_id_variable");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, raVar.I, jSONObject, "states", feVar.v7, feVar.t7, na.p);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.J, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, raVar.K, jSONObject, "transform", feVar.a9, feVar.Y8);
            Field<Expression<DivTransitionSelector>> field7 = raVar.L;
            TypeHelper<DivTransitionSelector> typeHelper5 = na.k;
            izs<String, DivTransitionSelector> izsVar4 = DivTransitionSelector.FROM_STRING;
            Expression<DivTransitionSelector> expression6 = na.f;
            Expression<DivTransitionSelector> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "transition_animation_selector", typeHelper5, izsVar4, expression6);
            Expression<DivTransitionSelector> expression7 = resolveOptionalExpression10 == null ? expression6 : resolveOptionalExpression10;
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, raVar.M, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, raVar.N, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, raVar.O, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.P, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, na.q);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.Q, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.R, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field8 = raVar.S;
            TypeHelper<DivVisibility> typeHelper6 = na.l;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = na.g;
            Expression<DivVisibility> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "visibility", typeHelper6, izsVar5, expression8);
            if (resolveOptionalExpression11 != null) {
                expression8 = resolveOptionalExpression11;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, raVar.T, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, raVar.U, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, raVar.V, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = na.h;
            }
            return new ma(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalList3, u1Var, expression3, expression5, resolveOptionalExpression6, resolveOptionalExpression7, resolveOptionalList4, str, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalList7, v9Var2, resolveOptionalList8, resolveOptionalList9, str2, vmnVar, resolveOptionalList10, y3Var, y3Var2, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList13, str3, resolveList, resolveOptionalList14, hdVar, expression7, d2Var, e1Var, e1Var2, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression8, zdVar, resolveOptionalList18, v9Var3);
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
        Boolean bool = Boolean.TRUE;
        c = Expression.Companion.constant$default(companion, bool, null, 2, null);
        d = Expression.Companion.constant$default(companion, bool, null, 2, null);
        e = new v9.c(new krn(null, null, null));
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.STATE_CHANGE;
        f = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        g = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        h = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        i = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        j = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        k = companion2.from(divTransitionSelector, c.i);
        l = companion2.from(divVisibility, d.i);
        m = new dn(14);
        n = new en(18);
        o = new io.reactivex.rxjava3.internal.operators.observable.q1(19);
        p = new hr(12);
        q = new ir(16);
    }
}

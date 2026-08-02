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
import xsna.izs;
import xsna.jln;
import xsna.kr;
import xsna.krn;
import xsna.lr;
import xsna.mr;
import xsna.pn;
import xsna.rl3;
import xsna.sn;
import xsna.vmn;

/* compiled from: DivGridJsonParser.kt */
/* loaded from: classes8.dex */
public final class c5 {

    @Deprecated
    public static final DivAnimation a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<DivAlignmentHorizontal> d;

    @Deprecated
    public static final Expression<DivAlignmentVertical> e;

    @Deprecated
    public static final v9.c f;

    @Deprecated
    public static final Expression<DivVisibility> g;

    @Deprecated
    public static final v9.b h;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> i;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> j;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> k;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> l;

    @Deprecated
    public static final TypeHelper<DivVisibility> m;

    @Deprecated
    public static final kr n;

    @Deprecated
    public static final lr o;

    @Deprecated
    public static final pn p;

    @Deprecated
    public static final mr q;

    @Deprecated
    public static final sn r;

    /* compiled from: DivGridJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class f implements Serializer, Deserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
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
                divAnimation = c5.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            TypeHelper<DivAlignmentHorizontal> typeHelper = c5.i;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = c5.j;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            kr krVar = c5.n;
            Expression<Double> expression = c5.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, izsVar3, krVar, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = c5.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper5, izsVar5, c5.o);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, izsVar5, c5.p);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = c5.k;
            Expression<DivAlignmentHorizontal> expression4 = c5.d;
            Expression<DivAlignmentHorizontal> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper<DivAlignmentVertical> typeHelper7 = c5.l;
            Expression<DivAlignmentVertical> expression6 = c5.e;
            Expression<DivAlignmentVertical> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = c5.f;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.z9);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, izsVar5, c5.q);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, c5.r);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper8 = c5.m;
            izs<String, DivVisibility> izsVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = c5.g;
            Expression<DivVisibility> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, izsVar6, expression8);
            if (readOptionalExpression10 != null) {
                expression8 = readOptionalExpression10;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = c5.h;
            }
            return new b5(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, u1Var, expression3, readExpression, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, jlnVar, readOptionalList7, v9Var2, readOptionalList8, readOptionalList9, str, readOptionalList10, vmnVar, readOptionalList11, y3Var, y3Var2, readOptionalList12, readOptionalList13, readOptionalExpression8, readOptionalExpression9, readOptionalList14, readOptionalList15, hdVar, d2Var, e1Var, e1Var2, readOptionalList16, readOptionalList17, readOptionalList18, expression8, zdVar, readOptionalList19, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, b5 b5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = b5Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = b5Var.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", b5Var.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", b5Var.d, bpn0Var);
            Expression<DivAlignmentHorizontal> expression = b5Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expression, izsVar);
            Expression<DivAlignmentVertical> expression2 = b5Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", b5Var.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", b5Var.h, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, b5Var.i, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", b5Var.j, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", b5Var.k);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", b5Var.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", b5Var.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", b5Var.n, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", b5Var.o, izsVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", b5Var.p, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", b5Var.q, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", b5Var.r, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", b5Var.s, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", b5Var.t, feVar.I3);
            v9 v9Var = b5Var.u;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", b5Var.v, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", b5Var.w, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", b5Var.x);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", b5Var.y, feVar.z9);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", b5Var.z, feVar.M4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", b5Var.A, bpn0Var);
            y3 y3Var = b5Var.B;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", b5Var.C, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", b5Var.D, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", b5Var.E, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", b5Var.F);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", b5Var.G);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", b5Var.H, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", b5Var.I, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", b5Var.J, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", b5Var.K, feVar.U1);
            e1 e1Var = b5Var.L;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", b5Var.M, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", b5Var.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", b5Var.O, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", b5Var.P, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", b5Var.Q, DivVisibility.TO_STRING);
            zd zdVar = b5Var.R;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", b5Var.S, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", b5Var.T, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class g implements Serializer, TemplateDeserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d5 deserialize(ParsingContext parsingContext, d5 d5Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = d5Var != null ? d5Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, d5Var != null ? d5Var.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, d5Var != null ? d5Var.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, d5Var != null ? d5Var.d : null, feVar.l1);
            TypeHelper<DivAlignmentHorizontal> typeHelper = c5.i;
            Field<Expression<DivAlignmentHorizontal>> field2 = d5Var != null ? d5Var.e : null;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = c5.j;
            Field<Expression<DivAlignmentVertical>> field3 = d5Var != null ? d5Var.f : null;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, izsVar2);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, d5Var != null ? d5Var.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, c5.n);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, d5Var != null ? d5Var.h : null, feVar.u1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, d5Var != null ? d5Var.i : null, feVar.G1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, d5Var != null ? d5Var.j : null, feVar.M1);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, d5Var != null ? d5Var.k : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field4 = d5Var != null ? d5Var.l : null;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            return new d5(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "column_count", typeHelper3, allowPropertyOverride, field4, izsVar3, c5.o), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, d5Var != null ? d5Var.m : null, izsVar3, c5.p), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", c5.k, allowPropertyOverride, d5Var != null ? d5Var.n : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", c5.l, allowPropertyOverride, d5Var != null ? d5Var.o : null, izsVar2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, d5Var != null ? d5Var.p : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, d5Var != null ? d5Var.q : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, d5Var != null ? d5Var.r : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, d5Var != null ? d5Var.s : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, d5Var != null ? d5Var.t : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, d5Var != null ? d5Var.u : null, feVar.Z6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, d5Var != null ? d5Var.v : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, d5Var != null ? d5Var.w : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, d5Var != null ? d5Var.x : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, d5Var != null ? d5Var.y : null, feVar.A9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, d5Var != null ? d5Var.z : null, feVar.N4), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, d5Var != null ? d5Var.A : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, d5Var != null ? d5Var.B : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, d5Var != null ? d5Var.C : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, d5Var != null ? d5Var.D : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, d5Var != null ? d5Var.E : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, d5Var != null ? d5Var.F : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, d5Var != null ? d5Var.G : null, izsVar3, c5.q), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, d5Var != null ? d5Var.H : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, d5Var != null ? d5Var.I : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, d5Var != null ? d5Var.J : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, d5Var != null ? d5Var.K : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, d5Var != null ? d5Var.L : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, d5Var != null ? d5Var.M : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, d5Var != null ? d5Var.N : null, DivTransitionTrigger.FROM_STRING, c5.r), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, d5Var != null ? d5Var.O : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, d5Var != null ? d5Var.P : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", c5.m, allowPropertyOverride, d5Var != null ? d5Var.Q : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, d5Var != null ? d5Var.R : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, d5Var != null ? d5Var.S : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, d5Var != null ? d5Var.T : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, d5 d5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = d5Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = d5Var.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", d5Var.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", d5Var.d, bpn0Var);
            Field<Expression<DivAlignmentHorizontal>> field3 = d5Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field3, izsVar);
            Field<Expression<DivAlignmentVertical>> field4 = d5Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field4, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", d5Var.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", d5Var.h, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, d5Var.i, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", d5Var.j, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", d5Var.k);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", d5Var.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", d5Var.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", d5Var.n, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", d5Var.o, izsVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", d5Var.p, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", d5Var.q, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", d5Var.r, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", d5Var.s, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", d5Var.t, feVar.J3);
            Field<z9> field5 = d5Var.u;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field5, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", d5Var.v, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", d5Var.w, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", d5Var.x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", d5Var.y, feVar.A9);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", d5Var.z, feVar.N4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", d5Var.A, bpn0Var);
            Field<a4> field6 = d5Var.B;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field6, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", d5Var.C, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", d5Var.D, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", d5Var.E, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", d5Var.F);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", d5Var.G);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", d5Var.H, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", d5Var.I, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", d5Var.J, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", d5Var.K, feVar.V1);
            Field<i1> field7 = d5Var.L;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field7, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", d5Var.M, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", d5Var.N, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", d5Var.O, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", d5Var.P, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", d5Var.Q, DivVisibility.TO_STRING);
            Field<be> field8 = d5Var.R;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field8, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", d5Var.S, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", d5Var.T, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class h implements TemplateResolver<JSONObject, d5, b5> {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b5 resolve(ParsingContext parsingContext, d5 d5Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = d5Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, d5Var.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, d5Var.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = c5.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Field<Expression<DivAlignmentHorizontal>> field2 = d5Var.e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = c5.i;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = d5Var.f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = c5.j;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            Field<Expression<Double>> field4 = d5Var.g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            kr krVar = c5.n;
            Expression<Double> expression = c5.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper3, izsVar3, krVar, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.h, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.i, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, d5Var.j, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field5 = d5Var.k;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = c5.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field<Expression<Long>> field6 = d5Var.l;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field6, jSONObject, "column_count", typeHelper5, izsVar5, c5.o);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d5Var.m, jSONObject, "column_span", typeHelper5, izsVar5, c5.p);
            Field<Expression<DivAlignmentHorizontal>> field7 = d5Var.n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = c5.k;
            Expression<DivAlignmentHorizontal> expression4 = c5.d;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field<Expression<DivAlignmentVertical>> field8 = d5Var.o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = c5.l;
            Expression<DivAlignmentVertical> expression6 = c5.e;
            Expression<DivAlignmentVertical> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.p, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.q, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.r, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, d5Var.s, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.t, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, d5Var.u, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = c5.f;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.v, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.w, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, d5Var.x, jSONObject, "id");
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.y, jSONObject, "items", feVar.B9, feVar.z9);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, d5Var.z, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.A, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, d5Var.B, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, d5Var.C, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.D, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.E, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d5Var.F, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, d5Var.G, jSONObject, "row_span", typeHelper5, izsVar5, c5.q);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.H, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.I, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, d5Var.J, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, d5Var.K, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, d5Var.L, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, d5Var.M, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.N, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, c5.r);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.O, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.P, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field9 = d5Var.Q;
            TypeHelper<DivVisibility> typeHelper8 = c5.m;
            izs<String, DivVisibility> izsVar6 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression8 = c5.g;
            Expression<DivVisibility> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "visibility", typeHelper8, izsVar6, expression8);
            if (resolveOptionalExpression10 != null) {
                expression8 = resolveOptionalExpression10;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, d5Var.R, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, d5Var.S, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, d5Var.T, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = c5.h;
            }
            return new b5(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalList3, u1Var, expression3, resolveExpression, resolveOptionalExpression5, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalList7, v9Var2, resolveOptionalList8, resolveOptionalList9, str, resolveOptionalList10, vmnVar, resolveOptionalList11, y3Var, y3Var2, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList14, resolveOptionalList15, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression8, zdVar, resolveOptionalList19, v9Var3);
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
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        d = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        e = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f = new v9.c(new krn(null, null, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        g = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        h = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        i = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        j = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        k = companion2.from(divAlignmentHorizontal, c.i);
        l = companion2.from(divAlignmentVertical, d.i);
        m = companion2.from(divVisibility, e.i);
        n = new kr(16);
        o = new lr(13);
        p = new pn(16);
        q = new mr(14);
        r = new sn(17);
    }
}

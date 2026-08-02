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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.or;
import xsna.pr;
import xsna.qr;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivImageJsonParser.kt */
/* loaded from: classes8.dex */
public final class i5 {

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
    public static final Expression<Boolean> g;

    @Deprecated
    public static final Expression<Integer> h;

    @Deprecated
    public static final Expression<Boolean> i;

    @Deprecated
    public static final Expression<DivImageScale> j;

    @Deprecated
    public static final Expression<DivBlendMode> k;

    @Deprecated
    public static final Expression<DivVisibility> l;

    @Deprecated
    public static final v9.b m;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> n;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> o;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> p;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> q;

    @Deprecated
    public static final TypeHelper<DivImageScale> r;

    @Deprecated
    public static final TypeHelper<DivBlendMode> s;

    @Deprecated
    public static final TypeHelper<DivVisibility> t;

    @Deprecated
    public static final defpackage.j0 u;

    @Deprecated
    public static final or v;

    @Deprecated
    public static final pr w;

    @Deprecated
    public static final qr x;

    /* compiled from: DivImageJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivBlendMode);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class g extends Lambda implements izs<Object, Boolean> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class h implements Serializer, Deserializer {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e5 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
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
                divAnimation = i5.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            TypeHelper<DivAlignmentHorizontal> typeHelper = i5.n;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = i5.o;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            defpackage.j0 j0Var = i5.u;
            Expression<Double> expression = i5.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, izsVar3, j0Var, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            b4 b4Var = (b4) JsonPropertyParser.readOptional(parsingContext, jSONObject, "appearance_animation", feVar.e3);
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", feVar.C1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = i5.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, izsVar5, i5.v);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = i5.p;
            Expression<DivAlignmentHorizontal> expression4 = i5.d;
            Expression<DivAlignmentHorizontal> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper<DivAlignmentVertical> typeHelper7 = i5.q;
            Expression<DivAlignmentVertical> expression6 = i5.e;
            Expression<DivAlignmentVertical> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", feVar.k3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = i5.f;
            }
            v9 v9Var2 = v9Var;
            Expression<Boolean> expression8 = i5.g;
            Expression<Boolean> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "high_priority_preview_show", typeHelper4, izsVar4, expression8);
            Expression<Boolean> expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression10 = i5.h;
            Expression<Integer> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, izsVar6, expression10);
            Expression<Integer> expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            Expression<Boolean> expression12 = i5.i;
            Expression<Double> expression13 = expression;
            Expression<Boolean> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, izsVar4, expression12);
            Expression<Boolean> expression14 = readOptionalExpression10 == null ? expression12 : readOptionalExpression10;
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, izsVar5, i5.w);
            TypeHelper<DivImageScale> typeHelper10 = i5.r;
            izs<String, DivImageScale> izsVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression15 = i5.j;
            Expression<DivImageScale> readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, izsVar7, expression15);
            Expression<DivImageScale> expression16 = readOptionalExpression14 == null ? expression15 : readOptionalExpression14;
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", typeHelper8, izsVar6);
            TypeHelper<DivBlendMode> typeHelper11 = i5.s;
            izs<String, DivBlendMode> izsVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression17 = i5.k;
            Expression<DivBlendMode> readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper11, izsVar8, expression17);
            Expression<DivBlendMode> expression18 = readOptionalExpression16 == null ? expression17 : readOptionalExpression16;
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, i5.x);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper12 = i5.t;
            izs<String, DivVisibility> izsVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression19 = i5.l;
            Expression<DivVisibility> readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper12, izsVar9, expression19);
            if (readOptionalExpression17 != null) {
                expression19 = readOptionalExpression17;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = i5.m;
            }
            return new e5(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression13, readOptionalList2, b4Var, j1Var, readOptionalList3, u1Var, expression3, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, readOptionalList7, jlnVar, readOptionalList8, v9Var2, expression9, readOptionalList9, readOptionalList10, str, readExpression, vmnVar, readOptionalList11, y3Var, y3Var2, expression11, expression14, readOptionalList12, readOptionalList13, readOptionalExpression11, readOptionalExpression12, readOptionalExpression13, expression16, readOptionalList14, readOptionalExpression15, expression18, readOptionalList15, hdVar, d2Var, e1Var, e1Var2, readOptionalList16, readOptionalList17, readOptionalList18, expression19, zdVar, readOptionalList19, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, e5 e5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = e5Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = e5Var.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", e5Var.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", e5Var.d, bpn0Var);
            Expression<DivAlignmentHorizontal> expression = e5Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expression, izsVar);
            Expression<DivAlignmentVertical> expression2 = e5Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", e5Var.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", e5Var.h, feVar.t1);
            JsonPropertyParser.write(parsingContext, jSONObject, "appearance_animation", e5Var.i, feVar.e3);
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", e5Var.j, feVar.C1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, e5Var.k, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", e5Var.l, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", e5Var.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", e5Var.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", e5Var.o, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", e5Var.p, izsVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", e5Var.q, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", e5Var.r, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", e5Var.s, feVar.b3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", e5Var.t, feVar.k3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", e5Var.u, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", e5Var.v, feVar.I3);
            v9 v9Var = e5Var.w;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "high_priority_preview_show", e5Var.x);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", e5Var.y, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", e5Var.z, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", e5Var.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, e5Var.B, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", e5Var.C, feVar.M4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", e5Var.D, bpn0Var);
            y3 y3Var = e5Var.E;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", e5Var.F, bpn0Var3);
            Expression<Integer> expression3 = e5Var.G;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", expression3, izsVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", e5Var.H);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", e5Var.I, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", e5Var.J, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", e5Var.K);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", e5Var.L);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", e5Var.M);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", e5Var.N, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", e5Var.O, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", e5Var.P, izsVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", e5Var.Q, DivBlendMode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", e5Var.R, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", e5Var.S, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", e5Var.T, feVar.U1);
            e1 e1Var = e5Var.U;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", e5Var.V, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", e5Var.W, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", e5Var.X, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", e5Var.Y, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", e5Var.Z, DivVisibility.TO_STRING);
            zd zdVar = e5Var.a0;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", e5Var.b0, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", e5Var.c0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class i implements Serializer, TemplateDeserializer {
        public final fe a;

        public i(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j5 deserialize(ParsingContext parsingContext, j5 j5Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = j5Var != null ? j5Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, j5Var != null ? j5Var.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, j5Var != null ? j5Var.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, j5Var != null ? j5Var.d : null, feVar.l1);
            TypeHelper<DivAlignmentHorizontal> typeHelper = i5.n;
            Field<Expression<DivAlignmentHorizontal>> field2 = j5Var != null ? j5Var.e : null;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = i5.o;
            Field<Expression<DivAlignmentVertical>> field3 = j5Var != null ? j5Var.f : null;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, izsVar2);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, j5Var != null ? j5Var.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, i5.u);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, j5Var != null ? j5Var.h : null, feVar.u1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "appearance_animation", allowPropertyOverride, j5Var != null ? j5Var.i : null, feVar.f3);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, j5Var != null ? j5Var.j : null, feVar.D1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, j5Var != null ? j5Var.k : null, feVar.G1);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, j5Var != null ? j5Var.l : null, feVar.M1);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field4 = j5Var != null ? j5Var.m : null;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field4, izsVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field5 = j5Var != null ? j5Var.n : null;
            izs<Number, Long> izsVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field5, izsVar4, i5.v);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", i5.p, allowPropertyOverride, j5Var != null ? j5Var.o : null, izsVar);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", i5.q, allowPropertyOverride, j5Var != null ? j5Var.p : null, izsVar2);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, j5Var != null ? j5Var.q : null, feVar.Q2);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, j5Var != null ? j5Var.r : null, feVar.l1);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, j5Var != null ? j5Var.s : null, feVar.c3);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, j5Var != null ? j5Var.t : null, feVar.l3);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, j5Var != null ? j5Var.u : null, feVar.A3);
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, j5Var != null ? j5Var.v : null, feVar.J3);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, j5Var != null ? j5Var.w : null, feVar.Z6);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "high_priority_preview_show", typeHelper3, allowPropertyOverride, j5Var != null ? j5Var.x : null, izsVar3);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, j5Var != null ? j5Var.y : null, feVar.l1);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, j5Var != null ? j5Var.z : null, feVar.l1);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, j5Var != null ? j5Var.A : null);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, j5Var != null ? j5Var.B : null, ParsingConvertersKt.ANY_TO_URI);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, j5Var != null ? j5Var.C : null, feVar.N4);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, j5Var != null ? j5Var.D : null, feVar.l1);
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, j5Var != null ? j5Var.E : null, feVar.Z2);
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, j5Var != null ? j5Var.F : null, feVar.Z2);
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field6 = j5Var != null ? j5Var.G : null;
            izs<Object, Integer> izsVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder_color", typeHelper5, allowPropertyOverride, field6, izsVar5);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, j5Var != null ? j5Var.H : null, izsVar3);
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, j5Var != null ? j5Var.I : null, feVar.l1);
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, j5Var != null ? j5Var.J : null, feVar.l1);
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new j5(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalField5, readOptionalListField3, readOptionalField6, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalField8, readOptionalFieldWithExpression8, readOptionalListField9, readOptionalListField10, readOptionalField9, readFieldWithExpression, readOptionalField10, readOptionalListField11, readOptionalField11, readOptionalField12, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField12, readOptionalListField13, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper6, allowPropertyOverride, j5Var != null ? j5Var.K : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper6, allowPropertyOverride, j5Var != null ? j5Var.L : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, j5Var != null ? j5Var.M : null, izsVar4, i5.w), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", i5.r, allowPropertyOverride, j5Var != null ? j5Var.N : null, DivImageScale.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, j5Var != null ? j5Var.O : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_color", typeHelper5, allowPropertyOverride, j5Var != null ? j5Var.P : null, izsVar5), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_mode", i5.s, allowPropertyOverride, j5Var != null ? j5Var.Q : null, DivBlendMode.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, j5Var != null ? j5Var.R : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, j5Var != null ? j5Var.S : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, j5Var != null ? j5Var.T : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, j5Var != null ? j5Var.U : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, j5Var != null ? j5Var.V : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, j5Var != null ? j5Var.W : null, DivTransitionTrigger.FROM_STRING, i5.x), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, j5Var != null ? j5Var.X : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, j5Var != null ? j5Var.Y : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", i5.t, allowPropertyOverride, j5Var != null ? j5Var.Z : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, j5Var != null ? j5Var.a0 : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, j5Var != null ? j5Var.b0 : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, j5Var != null ? j5Var.c0 : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, j5 j5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = j5Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = j5Var.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", j5Var.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", j5Var.d, bpn0Var);
            Field<Expression<DivAlignmentHorizontal>> field3 = j5Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field3, izsVar);
            Field<Expression<DivAlignmentVertical>> field4 = j5Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field4, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", j5Var.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", j5Var.h, feVar.u1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "appearance_animation", j5Var.i, feVar.f3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", j5Var.j, feVar.D1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, j5Var.k, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", j5Var.l, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", j5Var.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", j5Var.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", j5Var.o, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", j5Var.p, izsVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", j5Var.q, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", j5Var.r, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", j5Var.s, feVar.c3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", j5Var.t, feVar.l3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", j5Var.u, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", j5Var.v, feVar.J3);
            Field<z9> field5 = j5Var.w;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field5, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "high_priority_preview_show", j5Var.x);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", j5Var.y, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", j5Var.z, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", j5Var.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, j5Var.B, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", j5Var.C, feVar.N4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", j5Var.D, bpn0Var);
            Field<a4> field6 = j5Var.E;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field6, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", j5Var.F, bpn0Var3);
            Field<Expression<Integer>> field7 = j5Var.G;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", field7, izsVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", j5Var.H);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", j5Var.I, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", j5Var.J, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", j5Var.K);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", j5Var.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", j5Var.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", j5Var.N, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", j5Var.O, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", j5Var.P, izsVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", j5Var.Q, DivBlendMode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", j5Var.R, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", j5Var.S, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", j5Var.T, feVar.V1);
            Field<i1> field8 = j5Var.U;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field8, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", j5Var.V, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", j5Var.W, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", j5Var.X, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", j5Var.Y, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", j5Var.Z, DivVisibility.TO_STRING);
            Field<be> field9 = j5Var.a0;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field9, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", j5Var.b0, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", j5Var.c0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class j implements TemplateResolver<JSONObject, j5, e5> {
        public final fe a;

        public j(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e5 resolve(ParsingContext parsingContext, j5 j5Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = j5Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, j5Var.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, j5Var.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = i5.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Field<Expression<DivAlignmentHorizontal>> field2 = j5Var.e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = i5.n;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = j5Var.f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = i5.o;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            Field<Expression<Double>> field4 = j5Var.g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            defpackage.j0 j0Var = i5.u;
            Expression<Double> expression = i5.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper3, izsVar3, j0Var, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.h, jSONObject, "animators", feVar.v1, feVar.t1);
            b4 b4Var = (b4) JsonFieldResolver.resolveOptional(parsingContext, j5Var.i, jSONObject, "appearance_animation", feVar.g3, feVar.e3);
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, j5Var.j, jSONObject, "aspect", feVar.E1, feVar.C1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.k, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, j5Var.l, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field5 = j5Var.m;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = i5.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field<Expression<Long>> field6 = j5Var.n;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, izsVar5, i5.v);
            Field<Expression<DivAlignmentHorizontal>> field7 = j5Var.o;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = i5.p;
            Expression<DivAlignmentHorizontal> expression4 = i5.d;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field<Expression<DivAlignmentVertical>> field8 = j5Var.p;
            TypeHelper<DivAlignmentVertical> typeHelper7 = i5.q;
            Expression<DivAlignmentVertical> expression6 = i5.e;
            Expression<DivAlignmentVertical> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.q, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.r, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.s, jSONObject, "extensions", feVar.d3, feVar.b3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.t, jSONObject, "filters", feVar.m3, feVar.k3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, j5Var.u, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.v, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, j5Var.w, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = i5.f;
            }
            v9 v9Var2 = v9Var;
            Field<Expression<Boolean>> field9 = j5Var.x;
            Expression<Boolean> expression8 = i5.g;
            Expression<Boolean> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "high_priority_preview_show", typeHelper4, izsVar4, expression8);
            Expression<Boolean> expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.y, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.z, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, j5Var.A, jSONObject, "id");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, j5Var.B, jSONObject, CampaignEx.JSON_KEY_IMAGE_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, j5Var.C, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.D, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, j5Var.E, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, j5Var.F, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Field<Expression<Integer>> field10 = j5Var.G;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression10 = i5.h;
            Expression<Integer> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "placeholder_color", typeHelper8, izsVar6, expression10);
            Expression<Integer> expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            Field<Expression<Boolean>> field11 = j5Var.H;
            Expression<Boolean> expression12 = i5.i;
            Expression<Boolean> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preload_required", typeHelper4, izsVar4, expression12);
            Expression<Boolean> expression13 = resolveOptionalExpression10 == null ? expression12 : resolveOptionalExpression10;
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.I, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.J, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Field<Expression<String>> field12 = j5Var.K;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "preview", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j5Var.L, jSONObject, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j5Var.M, jSONObject, "row_span", typeHelper5, izsVar5, i5.w);
            Field<Expression<DivImageScale>> field13 = j5Var.N;
            TypeHelper<DivImageScale> typeHelper10 = i5.r;
            izs<String, DivImageScale> izsVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression14 = i5.j;
            Expression<DivImageScale> resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "scale", typeHelper10, izsVar7, expression14);
            Expression<DivImageScale> expression15 = resolveOptionalExpression14 == null ? expression14 : resolveOptionalExpression14;
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.O, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j5Var.P, jSONObject, "tint_color", typeHelper8, izsVar6);
            Field<Expression<DivBlendMode>> field14 = j5Var.Q;
            TypeHelper<DivBlendMode> typeHelper11 = i5.s;
            izs<String, DivBlendMode> izsVar8 = DivBlendMode.FROM_STRING;
            Expression<DivBlendMode> expression16 = i5.k;
            Expression<DivBlendMode> resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "tint_mode", typeHelper11, izsVar8, expression16);
            Expression<DivBlendMode> expression17 = resolveOptionalExpression16 == null ? expression16 : resolveOptionalExpression16;
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.R, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, j5Var.S, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, j5Var.T, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, j5Var.U, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, j5Var.V, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.W, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, i5.x);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.X, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.Y, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field15 = j5Var.Z;
            TypeHelper<DivVisibility> typeHelper12 = i5.t;
            izs<String, DivVisibility> izsVar9 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression18 = i5.l;
            Expression<DivVisibility> resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "visibility", typeHelper12, izsVar9, expression18);
            if (resolveOptionalExpression17 != null) {
                expression18 = resolveOptionalExpression17;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, j5Var.a0, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, j5Var.b0, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, j5Var.c0, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = i5.m;
            }
            return new e5(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, b4Var, j1Var, resolveOptionalList3, u1Var, expression3, resolveOptionalExpression5, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, jlnVar, resolveOptionalList8, v9Var2, expression9, resolveOptionalList9, resolveOptionalList10, str, resolveExpression, vmnVar, resolveOptionalList11, y3Var, y3Var2, expression11, expression13, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression11, resolveOptionalExpression12, resolveOptionalExpression13, expression15, resolveOptionalList14, resolveOptionalExpression15, expression17, resolveOptionalList15, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression18, zdVar, resolveOptionalList19, v9Var3);
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
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        d = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        e = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        f = new v9.c(new krn(null, null, null));
        Boolean bool = Boolean.FALSE;
        g = Expression.Companion.constant$default(companion, bool, null, 2, null);
        h = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        i = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        j = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        k = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        l = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        m = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        n = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        o = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        p = companion2.from(divAlignmentHorizontal, c.i);
        q = companion2.from(divAlignmentVertical, d.i);
        r = companion2.from(divImageScale, e.i);
        s = companion2.from(divBlendMode, f.i);
        t = companion2.from(divVisibility, g.i);
        u = new defpackage.j0(14);
        v = new or(9);
        w = new pr(13);
        x = new qr(12);
    }
}

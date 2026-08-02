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
import xsna.hr;
import xsna.ir;
import xsna.izs;
import xsna.jln;
import xsna.jr;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;

/* compiled from: DivGifImageJsonParser.kt */
/* loaded from: classes8.dex */
public final class z4 {

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
    public static final Expression<Integer> g;

    @Deprecated
    public static final Expression<Boolean> h;

    @Deprecated
    public static final Expression<DivImageScale> i;

    @Deprecated
    public static final Expression<DivVisibility> j;

    @Deprecated
    public static final v9.b k;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> l;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> m;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> n;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> o;

    @Deprecated
    public static final TypeHelper<DivImageScale> p;

    @Deprecated
    public static final TypeHelper<DivVisibility> q;

    @Deprecated
    public static final io.reactivex.rxjava3.internal.operators.observable.q1 r;

    @Deprecated
    public static final hr s;

    @Deprecated
    public static final ir t;

    @Deprecated
    public static final jr u;

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivImageScale);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class g implements Serializer, Deserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y4 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
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
                divAnimation = z4.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            TypeHelper<DivAlignmentHorizontal> typeHelper = z4.l;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = z4.m;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.q1 q1Var = z4.r;
            Expression<Double> expression = z4.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, izsVar3, q1Var, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", feVar.C1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z4.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, izsVar5, z4.s);
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = z4.n;
            Expression<DivAlignmentHorizontal> expression4 = z4.d;
            Expression<DivAlignmentHorizontal> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper<DivAlignmentVertical> typeHelper7 = z4.o;
            Expression<DivAlignmentVertical> expression6 = z4.e;
            Expression<DivAlignmentVertical> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = readOptionalExpression7 == null ? expression6 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = z4.f;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression8 = z4.g;
            Expression<Integer> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, izsVar6, expression8);
            Expression<Integer> expression9 = readOptionalExpression8 == null ? expression8 : readOptionalExpression8;
            Expression<Boolean> expression10 = z4.h;
            Expression<Boolean> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = readOptionalExpression9 == null ? expression10 : readOptionalExpression9;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, izsVar5, z4.t);
            TypeHelper<DivImageScale> typeHelper10 = z4.p;
            izs<String, DivImageScale> izsVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression12 = z4.i;
            Expression<DivImageScale> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, izsVar7, expression12);
            Expression<DivImageScale> expression13 = readOptionalExpression13 == null ? expression12 : readOptionalExpression13;
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, z4.u);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper11 = z4.q;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = z4.j;
            Expression<DivVisibility> readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper11, izsVar8, expression14);
            if (readOptionalExpression14 != null) {
                expression14 = readOptionalExpression14;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = z4.k;
            }
            return new y4(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, j1Var, readOptionalList3, u1Var, expression3, readOptionalExpression5, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, jlnVar, readOptionalList7, readExpression, v9Var2, readOptionalList8, readOptionalList9, str, vmnVar, readOptionalList10, y3Var, y3Var2, expression9, expression11, readOptionalList11, readOptionalList12, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, expression13, readOptionalList13, readOptionalList14, hdVar, d2Var, e1Var, e1Var2, readOptionalList15, readOptionalList16, readOptionalList17, expression14, zdVar, readOptionalList18, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, y4 y4Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = y4Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = y4Var.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", y4Var.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", y4Var.d, bpn0Var);
            Expression<DivAlignmentHorizontal> expression = y4Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expression, izsVar);
            Expression<DivAlignmentVertical> expression2 = y4Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", y4Var.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", y4Var.h, feVar.t1);
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", y4Var.i, feVar.C1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, y4Var.j, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", y4Var.k, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", y4Var.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", y4Var.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", y4Var.n, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", y4Var.o, izsVar2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", y4Var.p, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", y4Var.q, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", y4Var.r, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", y4Var.s, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", y4Var.t, feVar.I3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, y4Var.u, ParsingConvertersKt.URI_TO_STRING);
            v9 v9Var = y4Var.v;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", y4Var.w, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", y4Var.x, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", y4Var.y);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", y4Var.z, feVar.M4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", y4Var.A, bpn0Var);
            y3 y3Var = y4Var.B;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", y4Var.C, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", y4Var.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", y4Var.E);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", y4Var.F, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", y4Var.G, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", y4Var.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", y4Var.I);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", y4Var.J);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", y4Var.K, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", y4Var.L, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", y4Var.M, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", y4Var.N, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", y4Var.O, feVar.U1);
            e1 e1Var = y4Var.P;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", y4Var.Q, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", y4Var.R, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", y4Var.S, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", y4Var.T, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", y4Var.U, DivVisibility.TO_STRING);
            zd zdVar = y4Var.V;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", y4Var.W, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", y4Var.X, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class h implements Serializer, TemplateDeserializer {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a5 deserialize(ParsingContext parsingContext, a5 a5Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = a5Var != null ? a5Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, a5Var != null ? a5Var.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, a5Var != null ? a5Var.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, a5Var != null ? a5Var.d : null, feVar.l1);
            TypeHelper<DivAlignmentHorizontal> typeHelper = z4.l;
            Field<Expression<DivAlignmentHorizontal>> field2 = a5Var != null ? a5Var.e : null;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = z4.m;
            Field<Expression<DivAlignmentVertical>> field3 = a5Var != null ? a5Var.f : null;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, izsVar2);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, a5Var != null ? a5Var.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, z4.r);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, a5Var != null ? a5Var.h : null, feVar.u1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, a5Var != null ? a5Var.i : null, feVar.D1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, a5Var != null ? a5Var.j : null, feVar.G1);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, a5Var != null ? a5Var.k : null, feVar.M1);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field4 = a5Var != null ? a5Var.l : null;
            izs<Object, Boolean> izsVar3 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field4, izsVar3);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field5 = a5Var != null ? a5Var.m : null;
            izs<Number, Long> izsVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field5, izsVar4, z4.s);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", z4.n, allowPropertyOverride, a5Var != null ? a5Var.n : null, izsVar);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", z4.o, allowPropertyOverride, a5Var != null ? a5Var.o : null, izsVar2);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, a5Var != null ? a5Var.p : null, feVar.Q2);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, a5Var != null ? a5Var.q : null, feVar.l1);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, a5Var != null ? a5Var.r : null, feVar.c3);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, a5Var != null ? a5Var.s : null, feVar.A3);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, a5Var != null ? a5Var.t : null, feVar.J3);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, a5Var != null ? a5Var.u : null, ParsingConvertersKt.ANY_TO_URI);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, a5Var != null ? a5Var.v : null, feVar.Z6);
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, a5Var != null ? a5Var.w : null, feVar.l1);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, a5Var != null ? a5Var.x : null, feVar.l1);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, a5Var != null ? a5Var.y : null);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, a5Var != null ? a5Var.z : null, feVar.N4);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, a5Var != null ? a5Var.A : null, feVar.l1);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, a5Var != null ? a5Var.B : null, feVar.Z2);
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, a5Var != null ? a5Var.C : null, feVar.Z2);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, a5Var != null ? a5Var.D : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, a5Var != null ? a5Var.E : null, izsVar3);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, a5Var != null ? a5Var.F : null, feVar.l1);
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, a5Var != null ? a5Var.G : null, feVar.l1);
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new a5(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalListField3, readOptionalField5, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readFieldWithExpression, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalListField10, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField11, readOptionalListField12, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper5, allowPropertyOverride, a5Var != null ? a5Var.H : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, a5Var != null ? a5Var.I : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, a5Var != null ? a5Var.J : null, izsVar4, z4.t), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", z4.p, allowPropertyOverride, a5Var != null ? a5Var.K : null, DivImageScale.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, a5Var != null ? a5Var.L : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, a5Var != null ? a5Var.M : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, a5Var != null ? a5Var.N : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, a5Var != null ? a5Var.O : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, a5Var != null ? a5Var.P : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, a5Var != null ? a5Var.Q : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, a5Var != null ? a5Var.R : null, DivTransitionTrigger.FROM_STRING, z4.u), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, a5Var != null ? a5Var.S : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, a5Var != null ? a5Var.T : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", z4.q, allowPropertyOverride, a5Var != null ? a5Var.U : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, a5Var != null ? a5Var.V : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, a5Var != null ? a5Var.W : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, a5Var != null ? a5Var.X : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, a5 a5Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = a5Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = a5Var.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", a5Var.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", a5Var.d, bpn0Var);
            Field<Expression<DivAlignmentHorizontal>> field3 = a5Var.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field3, izsVar);
            Field<Expression<DivAlignmentVertical>> field4 = a5Var.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field4, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", a5Var.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", a5Var.h, feVar.u1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", a5Var.i, feVar.D1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, a5Var.j, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", a5Var.k, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", a5Var.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", a5Var.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", a5Var.n, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", a5Var.o, izsVar2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", a5Var.p, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", a5Var.q, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", a5Var.r, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", a5Var.s, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", a5Var.t, feVar.J3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, a5Var.u, ParsingConvertersKt.URI_TO_STRING);
            Field<z9> field5 = a5Var.v;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field5, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", a5Var.w, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", a5Var.x, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", a5Var.y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", a5Var.z, feVar.N4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", a5Var.A, bpn0Var);
            Field<a4> field6 = a5Var.B;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field6, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", a5Var.C, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", a5Var.D, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", a5Var.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", a5Var.F, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", a5Var.G, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", a5Var.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", a5Var.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", a5Var.J);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", a5Var.K, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", a5Var.L, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", a5Var.M, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", a5Var.N, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", a5Var.O, feVar.V1);
            Field<i1> field7 = a5Var.P;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field7, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", a5Var.Q, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", a5Var.R, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", a5Var.S, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", a5Var.T, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", a5Var.U, DivVisibility.TO_STRING);
            Field<be> field8 = a5Var.V;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field8, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", a5Var.W, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", a5Var.X, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class i implements TemplateResolver<JSONObject, a5, y4> {
        public final fe a;

        public i(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y4 resolve(ParsingContext parsingContext, a5 a5Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = a5Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, a5Var.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, a5Var.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = z4.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Field<Expression<DivAlignmentHorizontal>> field2 = a5Var.e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = z4.l;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = a5Var.f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = z4.m;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            Field<Expression<Double>> field4 = a5Var.g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            io.reactivex.rxjava3.internal.operators.observable.q1 q1Var = z4.r;
            Expression<Double> expression = z4.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper3, izsVar3, q1Var, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.h, jSONObject, "animators", feVar.v1, feVar.t1);
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, a5Var.i, jSONObject, "aspect", feVar.E1, feVar.C1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.j, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, a5Var.k, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field5 = a5Var.l;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression2 = z4.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression2);
            Expression<Boolean> expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            Field<Expression<Long>> field6 = a5Var.m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, izsVar5, z4.s);
            Field<Expression<DivAlignmentHorizontal>> field7 = a5Var.n;
            TypeHelper<DivAlignmentHorizontal> typeHelper6 = z4.n;
            Expression<DivAlignmentHorizontal> expression4 = z4.d;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_horizontal", typeHelper6, izsVar, expression4);
            Expression<DivAlignmentHorizontal> expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field<Expression<DivAlignmentVertical>> field8 = a5Var.o;
            TypeHelper<DivAlignmentVertical> typeHelper7 = z4.o;
            Expression<DivAlignmentVertical> expression6 = z4.e;
            Expression<DivAlignmentVertical> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "content_alignment_vertical", typeHelper7, izsVar2, expression6);
            Expression<DivAlignmentVertical> expression7 = resolveOptionalExpression7 == null ? expression6 : resolveOptionalExpression7;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.p, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.q, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.r, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, a5Var.s, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.t, jSONObject, "functions", feVar.K3, feVar.I3);
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, a5Var.u, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, a5Var.v, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = z4.f;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.w, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.x, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, a5Var.y, jSONObject, "id");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, a5Var.z, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.A, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, a5Var.B, jSONObject, "margins", feVar.a3, feVar.Y2);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, a5Var.C, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Field<Expression<Integer>> field9 = a5Var.D;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression8 = z4.g;
            Expression<Integer> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "placeholder_color", typeHelper8, izsVar6, expression8);
            Expression<Integer> expression9 = resolveOptionalExpression8 == null ? expression8 : resolveOptionalExpression8;
            Field<Expression<Boolean>> field10 = a5Var.E;
            Expression<Boolean> expression10 = z4.h;
            Expression<Boolean> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preload_required", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = resolveOptionalExpression9 == null ? expression10 : resolveOptionalExpression9;
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.F, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.G, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Field<Expression<String>> field11 = a5Var.H;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preview", typeHelper9);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a5Var.I, jSONObject, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a5Var.J, jSONObject, "row_span", typeHelper5, izsVar5, z4.t);
            Field<Expression<DivImageScale>> field12 = a5Var.K;
            TypeHelper<DivImageScale> typeHelper10 = z4.p;
            izs<String, DivImageScale> izsVar7 = DivImageScale.FROM_STRING;
            Expression<DivImageScale> expression12 = z4.i;
            Expression<DivImageScale> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "scale", typeHelper10, izsVar7, expression12);
            Expression<DivImageScale> expression13 = resolveOptionalExpression13 == null ? expression12 : resolveOptionalExpression13;
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.L, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.M, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, a5Var.N, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, a5Var.O, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, a5Var.P, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, a5Var.Q, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.R, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, z4.u);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.S, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.T, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field13 = a5Var.U;
            TypeHelper<DivVisibility> typeHelper11 = z4.q;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression14 = z4.j;
            Expression<DivVisibility> resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "visibility", typeHelper11, izsVar8, expression14);
            if (resolveOptionalExpression14 != null) {
                expression14 = resolveOptionalExpression14;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, a5Var.V, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.W, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, a5Var.X, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = z4.k;
            }
            return new y4(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, j1Var, resolveOptionalList3, u1Var, expression3, resolveOptionalExpression5, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalList7, resolveExpression, v9Var2, resolveOptionalList8, resolveOptionalList9, str, vmnVar, resolveOptionalList10, y3Var, y3Var2, expression9, expression11, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, expression13, resolveOptionalList13, resolveOptionalList14, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression14, zdVar, resolveOptionalList18, v9Var3);
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
        g = Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        i = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        j = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        k = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        l = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        m = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        n = companion2.from(divAlignmentHorizontal, c.i);
        o = companion2.from(divAlignmentVertical, d.i);
        p = companion2.from(divImageScale, e.i);
        q = companion2.from(divVisibility, f.i);
        r = new io.reactivex.rxjava3.internal.operators.observable.q1(18);
        s = new hr(11);
        t = new ir(15);
        u = new jr(11);
    }
}

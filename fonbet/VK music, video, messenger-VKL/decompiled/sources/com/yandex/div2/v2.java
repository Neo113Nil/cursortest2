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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.v9;
import com.yandex.div2.x2;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cq;
import xsna.dq;
import xsna.eq;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.vmn;
import xsna.wp;

/* compiled from: DivContainerJsonParser.kt */
/* loaded from: classes8.dex */
public final class v2 {

    @Deprecated
    public static final DivAnimation a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<Boolean> d;

    @Deprecated
    public static final Expression<DivContentAlignmentHorizontal> e;

    @Deprecated
    public static final Expression<DivContentAlignmentVertical> f;

    @Deprecated
    public static final v9.c g;

    @Deprecated
    public static final Expression<Long> h;

    @Deprecated
    public static final Expression<DivContainer.LayoutMode> i;

    @Deprecated
    public static final Expression<Long> j;

    @Deprecated
    public static final Expression<DivContainer.Orientation> k;

    @Deprecated
    public static final Expression<DivVisibility> l;

    @Deprecated
    public static final v9.b m;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> n;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> o;

    @Deprecated
    public static final TypeHelper<DivContentAlignmentHorizontal> p;

    @Deprecated
    public static final TypeHelper<DivContentAlignmentVertical> q;

    @Deprecated
    public static final TypeHelper<DivContainer.LayoutMode> r;

    @Deprecated
    public static final TypeHelper<DivContainer.Orientation> s;

    @Deprecated
    public static final TypeHelper<DivVisibility> t;

    @Deprecated
    public static final wp u;

    @Deprecated
    public static final cq v;

    @Deprecated
    public static final dq w;

    @Deprecated
    public static final com.vk.movika.sdk.base.model.n x;

    @Deprecated
    public static final eq y;

    @Deprecated
    public static final com.vk.movika.sdk.base.model.history.b z;

    /* compiled from: DivContainerJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContentAlignmentHorizontal);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContentAlignmentVertical);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContainer.LayoutMode);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivContainer.Orientation);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class g extends Lambda implements izs<Object, Boolean> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class h implements Serializer, Deserializer {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivContainer deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.p2;
            bpn0 bpn0Var6 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            bpn0 bpn0Var7 = feVar.k1;
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", bpn0Var7);
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", feVar.q1);
            if (divAnimation == null) {
                divAnimation = v2.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var7);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", v2.n, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", v2.o, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            wp wpVar = v2.u;
            Expression<Double> expression = v2.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, wpVar, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            j1 j1Var = (j1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", feVar.C1);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = v2.c;
            Expression<Boolean> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression3);
            Expression<Boolean> expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            Expression<Boolean> expression5 = v2.d;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, izsVar2, expression5);
            Expression<Boolean> expression6 = readOptionalExpression5 == null ? expression5 : readOptionalExpression5;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, izsVar3, v2.v);
            TypeHelper<DivContentAlignmentHorizontal> typeHelper4 = v2.p;
            izs<String, DivContentAlignmentHorizontal> izsVar4 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression<DivContentAlignmentHorizontal> expression7 = v2.e;
            Expression<DivContentAlignmentHorizontal> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper4, izsVar4, expression7);
            Expression<DivContentAlignmentHorizontal> expression8 = readOptionalExpression7 == null ? expression7 : readOptionalExpression7;
            TypeHelper<DivContentAlignmentVertical> typeHelper5 = v2.q;
            izs<String, DivContentAlignmentVertical> izsVar5 = DivContentAlignmentVertical.FROM_STRING;
            Expression<DivContentAlignmentVertical> expression9 = v2.f;
            Expression<DivContentAlignmentVertical> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper5, izsVar5, expression9);
            Expression<DivContentAlignmentVertical> expression10 = readOptionalExpression8 == null ? expression9 : readOptionalExpression8;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var7);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var6);
            if (v9Var == null) {
                v9Var = v2.g;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var7);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            o2 o2Var = (o2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", feVar.d2);
            dq dqVar = v2.w;
            Expression<Long> expression11 = v2.h;
            Expression<Long> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper3, izsVar3, dqVar, expression11);
            Expression<Long> expression12 = readOptionalExpression9 == null ? expression11 : readOptionalExpression9;
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", feVar.z9);
            TypeHelper<DivContainer.LayoutMode> typeHelper6 = v2.r;
            izs<String, DivContainer.LayoutMode> izsVar6 = DivContainer.LayoutMode.FROM_STRING;
            Expression<DivContainer.LayoutMode> expression13 = v2.i;
            Expression<DivContainer.LayoutMode> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "layout_mode", typeHelper6, izsVar6, expression13);
            Expression<DivContainer.LayoutMode> expression14 = readOptionalExpression10 == null ? expression13 : readOptionalExpression10;
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            DivContainer.a aVar = (DivContainer.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "line_separator", bpn0Var5);
            com.vk.movika.sdk.base.model.n nVar = v2.x;
            Expression<Long> expression15 = v2.j;
            Expression<Long> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_spacing", typeHelper3, izsVar3, nVar, expression15);
            if (readOptionalExpression11 != null) {
                expression15 = readOptionalExpression11;
            }
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var7);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            TypeHelper<DivContainer.Orientation> typeHelper7 = v2.s;
            izs<String, DivContainer.Orientation> izsVar7 = DivContainer.Orientation.FROM_STRING;
            Expression<DivContainer.Orientation> expression16 = v2.k;
            Expression<DivContainer.Orientation> readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper7, izsVar7, expression16);
            Expression<DivContainer.Orientation> expression17 = readOptionalExpression12 == null ? expression16 : readOptionalExpression12;
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var7);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var7);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, izsVar3, v2.y);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var7);
            DivContainer.a aVar2 = (DivContainer.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator", bpn0Var5);
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, v2.z);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper8 = v2.t;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression18 = v2.l;
            Expression<DivVisibility> readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper8, izsVar8, expression18);
            if (readOptionalExpression15 != null) {
                expression18 = readOptionalExpression15;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var6);
            if (v9Var3 == null) {
                v9Var3 = v2.m;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList2, j1Var, readOptionalList3, u1Var, expression4, expression6, readOptionalExpression6, expression8, expression10, readOptionalList4, readOptionalList5, readOptionalList6, jlnVar, readOptionalList7, v9Var2, readOptionalList8, readOptionalList9, str, o2Var, expression12, readOptionalList10, expression14, vmnVar, aVar, expression15, readOptionalList11, y3Var, expression17, y3Var2, readOptionalList12, readOptionalList13, readOptionalExpression13, readOptionalExpression14, readOptionalList14, aVar2, readOptionalList15, hdVar, d2Var, e1Var, e1Var2, readOptionalList16, readOptionalList17, readOptionalList18, expression18, zdVar, readOptionalList19, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivContainer divContainer) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divContainer.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = divContainer.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divContainer.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divContainer.d, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divContainer.e, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divContainer.f, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divContainer.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divContainer.h, feVar.t1);
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divContainer.i, feVar.C1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divContainer.j, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divContainer.k, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divContainer.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divContainer.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divContainer.n);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divContainer.o, DivContentAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divContainer.p, DivContentAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divContainer.q, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divContainer.r, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divContainer.s, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divContainer.t, feVar.z3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divContainer.u, feVar.I3);
            v9 v9Var = divContainer.v;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divContainer.w, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divContainer.x, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divContainer.y);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divContainer.z, feVar.d2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divContainer.A);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divContainer.B, feVar.z9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "layout_mode", divContainer.C, DivContainer.LayoutMode.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divContainer.D, feVar.M4);
            DivContainer.a aVar = divContainer.E;
            bpn0 bpn0Var3 = feVar.p2;
            JsonPropertyParser.write(parsingContext, jSONObject, "line_separator", aVar, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_spacing", divContainer.F);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divContainer.G, bpn0Var);
            y3 y3Var = divContainer.H;
            bpn0 bpn0Var4 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divContainer.I, DivContainer.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divContainer.J, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divContainer.K, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divContainer.L, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divContainer.M);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divContainer.N);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divContainer.O, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator", divContainer.P, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divContainer.Q, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divContainer.R, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divContainer.S, feVar.U1);
            e1 e1Var = divContainer.T;
            bpn0 bpn0Var5 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divContainer.U, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divContainer.V, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divContainer.W, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divContainer.X, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divContainer.Y, DivVisibility.TO_STRING);
            zd zdVar = divContainer.Z;
            bpn0 bpn0Var6 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var6);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divContainer.a0, bpn0Var6);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divContainer.b0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class i implements Serializer, TemplateDeserializer {
        public final fe a;

        public i(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x2 deserialize(ParsingContext parsingContext, x2 x2Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = x2Var != null ? x2Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, x2Var != null ? x2Var.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, x2Var != null ? x2Var.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, x2Var != null ? x2Var.d : null, feVar.l1);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", v2.n, allowPropertyOverride, x2Var != null ? x2Var.e : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", v2.o, allowPropertyOverride, x2Var != null ? x2Var.f : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, x2Var != null ? x2Var.g : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, v2.u);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, x2Var != null ? x2Var.h : null, feVar.u1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, x2Var != null ? x2Var.i : null, feVar.D1);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, x2Var != null ? x2Var.j : null, feVar.G1);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, x2Var != null ? x2Var.k : null, feVar.M1);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field2 = x2Var != null ? x2Var.l : null;
            izs<Object, Boolean> izsVar = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field2, izsVar);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, x2Var != null ? x2Var.m : null, izsVar);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = x2Var != null ? x2Var.n : null;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            return new x2(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalListField3, readOptionalField5, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, izsVar2, v2.v), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", v2.p, allowPropertyOverride, x2Var != null ? x2Var.o : null, DivContentAlignmentHorizontal.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", v2.q, allowPropertyOverride, x2Var != null ? x2Var.p : null, DivContentAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, x2Var != null ? x2Var.q : null, feVar.Q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, x2Var != null ? x2Var.r : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, x2Var != null ? x2Var.s : null, feVar.c3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, x2Var != null ? x2Var.t : null, feVar.A3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, x2Var != null ? x2Var.u : null, feVar.J3), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, x2Var != null ? x2Var.v : null, feVar.Z6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, x2Var != null ? x2Var.w : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, x2Var != null ? x2Var.x : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, x2Var != null ? x2Var.y : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, x2Var != null ? x2Var.z : null, feVar.e2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper2, allowPropertyOverride, x2Var != null ? x2Var.A : null, izsVar2, v2.w), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, x2Var != null ? x2Var.B : null, feVar.A9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "layout_mode", v2.r, allowPropertyOverride, x2Var != null ? x2Var.C : null, DivContainer.LayoutMode.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, x2Var != null ? x2Var.D : null, feVar.N4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "line_separator", allowPropertyOverride, x2Var != null ? x2Var.E : null, feVar.q2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_spacing", typeHelper2, allowPropertyOverride, x2Var != null ? x2Var.F : null, izsVar2, v2.x), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, x2Var != null ? x2Var.G : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, x2Var != null ? x2Var.H : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, v2.s, allowPropertyOverride, x2Var != null ? x2Var.I : null, DivContainer.Orientation.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, x2Var != null ? x2Var.J : null, feVar.Z2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, x2Var != null ? x2Var.K : null, feVar.l1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, x2Var != null ? x2Var.L : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, x2Var != null ? x2Var.M : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, x2Var != null ? x2Var.N : null, izsVar2, v2.y), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, x2Var != null ? x2Var.O : null, feVar.l1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "separator", allowPropertyOverride, x2Var != null ? x2Var.P : null, feVar.q2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, x2Var != null ? x2Var.Q : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, x2Var != null ? x2Var.R : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, x2Var != null ? x2Var.S : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, x2Var != null ? x2Var.T : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, x2Var != null ? x2Var.U : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, x2Var != null ? x2Var.V : null, DivTransitionTrigger.FROM_STRING, v2.z), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, x2Var != null ? x2Var.W : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, x2Var != null ? x2Var.X : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", v2.t, allowPropertyOverride, x2Var != null ? x2Var.Y : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, x2Var != null ? x2Var.Z : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, x2Var != null ? x2Var.a0 : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, x2Var != null ? x2Var.b0 : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, x2 x2Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = x2Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = x2Var.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", x2Var.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", x2Var.d, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", x2Var.e, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", x2Var.f, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", x2Var.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", x2Var.h, feVar.u1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", x2Var.i, feVar.D1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, x2Var.j, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", x2Var.k, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", x2Var.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", x2Var.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", x2Var.n);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", x2Var.o, DivContentAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", x2Var.p, DivContentAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", x2Var.q, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", x2Var.r, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", x2Var.s, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", x2Var.t, feVar.A3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", x2Var.u, feVar.J3);
            Field<z9> field3 = x2Var.v;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field3, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", x2Var.w, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", x2Var.x, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", x2Var.y);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", x2Var.z, feVar.e2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", x2Var.A);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", x2Var.B, feVar.A9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "layout_mode", x2Var.C, DivContainer.LayoutMode.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", x2Var.D, feVar.N4);
            Field<x2.a> field4 = x2Var.E;
            bpn0 bpn0Var3 = feVar.q2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "line_separator", field4, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_spacing", x2Var.F);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", x2Var.G, bpn0Var);
            Field<a4> field5 = x2Var.H;
            bpn0 bpn0Var4 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field5, bpn0Var4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, x2Var.I, DivContainer.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", x2Var.J, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", x2Var.K, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", x2Var.L, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", x2Var.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", x2Var.N);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", x2Var.O, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator", x2Var.P, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", x2Var.Q, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", x2Var.R, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", x2Var.S, feVar.V1);
            Field<i1> field6 = x2Var.T;
            bpn0 bpn0Var5 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field6, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", x2Var.U, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", x2Var.V, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", x2Var.W, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", x2Var.X, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", x2Var.Y, DivVisibility.TO_STRING);
            Field<be> field7 = x2Var.Z;
            bpn0 bpn0Var6 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field7, bpn0Var6);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", x2Var.a0, bpn0Var6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", x2Var.b0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class j implements TemplateResolver<JSONObject, x2, DivContainer> {
        public final fe a;

        public j(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivContainer resolve(ParsingContext parsingContext, x2 x2Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = x2Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, x2Var.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, x2Var.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = v2.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, x2Var.e, jSONObject, "alignment_horizontal", v2.n, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x2Var.f, jSONObject, "alignment_vertical", v2.o, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = x2Var.g;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            wp wpVar = v2.u;
            Expression<Double> expression = v2.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, wpVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.h, jSONObject, "animators", feVar.v1, feVar.t1);
            j1 j1Var = (j1) JsonFieldResolver.resolveOptional(parsingContext, x2Var.i, jSONObject, "aspect", feVar.E1, feVar.C1);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.j, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, x2Var.k, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field3 = x2Var.l;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar2 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression3 = v2.c;
            Expression<Boolean> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "capture_focus_on_action", typeHelper2, izsVar2, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            Field<Expression<Boolean>> field4 = x2Var.m;
            Expression<Boolean> expression5 = v2.d;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "clip_to_bounds", typeHelper2, izsVar2, expression5);
            Expression<Boolean> expression6 = resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5;
            Field<Expression<Long>> field5 = x2Var.n;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar3 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper3, izsVar3, v2.v);
            Field<Expression<DivContentAlignmentHorizontal>> field6 = x2Var.o;
            TypeHelper<DivContentAlignmentHorizontal> typeHelper4 = v2.p;
            izs<String, DivContentAlignmentHorizontal> izsVar4 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression<DivContentAlignmentHorizontal> expression7 = v2.e;
            Expression<DivContentAlignmentHorizontal> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper4, izsVar4, expression7);
            Expression<DivContentAlignmentHorizontal> expression8 = resolveOptionalExpression7 == null ? expression7 : resolveOptionalExpression7;
            Field<Expression<DivContentAlignmentVertical>> field7 = x2Var.p;
            TypeHelper<DivContentAlignmentVertical> typeHelper5 = v2.q;
            izs<String, DivContentAlignmentVertical> izsVar5 = DivContentAlignmentVertical.FROM_STRING;
            Expression<DivContentAlignmentVertical> expression9 = v2.f;
            Expression<DivContentAlignmentVertical> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper5, izsVar5, expression9);
            Expression<DivContentAlignmentVertical> expression10 = resolveOptionalExpression8 == null ? expression9 : resolveOptionalExpression8;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.q, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.r, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.s, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, x2Var.t, jSONObject, "focus", feVar.B3, feVar.z3);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.u, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, x2Var.v, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = v2.g;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.w, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.x, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, x2Var.y, jSONObject, "id");
            o2 o2Var = (o2) JsonFieldResolver.resolveOptional(parsingContext, x2Var.z, jSONObject, "item_builder", feVar.f2, feVar.d2);
            Field<Expression<Long>> field8 = x2Var.A;
            dq dqVar = v2.w;
            Expression<Long> expression11 = v2.h;
            Expression<Long> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "item_spacing", typeHelper3, izsVar3, dqVar, expression11);
            Expression<Long> expression12 = resolveOptionalExpression9 == null ? expression11 : resolveOptionalExpression9;
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.B, jSONObject, "items", feVar.B9, feVar.z9);
            Field<Expression<DivContainer.LayoutMode>> field9 = x2Var.C;
            TypeHelper<DivContainer.LayoutMode> typeHelper6 = v2.r;
            izs<String, DivContainer.LayoutMode> izsVar6 = DivContainer.LayoutMode.FROM_STRING;
            Expression<DivContainer.LayoutMode> expression13 = v2.i;
            Expression<DivContainer.LayoutMode> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "layout_mode", typeHelper6, izsVar6, expression13);
            Expression<DivContainer.LayoutMode> expression14 = resolveOptionalExpression10 == null ? expression13 : resolveOptionalExpression10;
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, x2Var.D, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            DivContainer.a aVar = (DivContainer.a) JsonFieldResolver.resolveOptional(parsingContext, x2Var.E, jSONObject, "line_separator", feVar.r2, feVar.p2);
            Field<Expression<Long>> field10 = x2Var.F;
            com.vk.movika.sdk.base.model.n nVar = v2.x;
            Expression<Long> expression15 = v2.j;
            Expression<Long> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "line_spacing", typeHelper3, izsVar3, nVar, expression15);
            if (resolveOptionalExpression11 != null) {
                expression15 = resolveOptionalExpression11;
            }
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.G, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, x2Var.H, jSONObject, "margins", feVar.a3, feVar.Y2);
            Field<Expression<DivContainer.Orientation>> field11 = x2Var.I;
            TypeHelper<DivContainer.Orientation> typeHelper7 = v2.s;
            izs<String, DivContainer.Orientation> izsVar7 = DivContainer.Orientation.FROM_STRING;
            Expression<DivContainer.Orientation> expression16 = v2.k;
            Expression<DivContainer.Orientation> resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, X3.i.n, typeHelper7, izsVar7, expression16);
            Expression<DivContainer.Orientation> expression17 = resolveOptionalExpression12 == null ? expression16 : resolveOptionalExpression12;
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, x2Var.J, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.K, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.L, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x2Var.M, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, x2Var.N, jSONObject, "row_span", typeHelper3, izsVar3, v2.y);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.O, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            DivContainer.a aVar2 = (DivContainer.a) JsonFieldResolver.resolveOptional(parsingContext, x2Var.P, jSONObject, "separator", feVar.r2, feVar.p2);
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.Q, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, x2Var.R, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, x2Var.S, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, x2Var.T, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, x2Var.U, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.V, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, v2.z);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.W, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.X, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field12 = x2Var.Y;
            TypeHelper<DivVisibility> typeHelper8 = v2.t;
            izs<String, DivVisibility> izsVar8 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression18 = v2.l;
            Expression<DivVisibility> resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "visibility", typeHelper8, izsVar8, expression18);
            if (resolveOptionalExpression15 != null) {
                expression18 = resolveOptionalExpression15;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, x2Var.Z, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, x2Var.a0, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, x2Var.b0, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = v2.m;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, j1Var, resolveOptionalList3, u1Var, expression4, expression6, resolveOptionalExpression6, expression8, expression10, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalList7, v9Var2, resolveOptionalList8, resolveOptionalList9, str, o2Var, expression12, resolveOptionalList10, expression14, vmnVar, aVar, expression15, resolveOptionalList11, y3Var, expression17, y3Var2, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression13, resolveOptionalExpression14, resolveOptionalList14, aVar2, resolveOptionalList15, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression18, zdVar, resolveOptionalList19, v9Var3);
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
        DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.START;
        e = Expression.Companion.constant$default(companion, divContentAlignmentHorizontal, null, 2, null);
        DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
        f = Expression.Companion.constant$default(companion, divContentAlignmentVertical, null, 2, null);
        g = new v9.c(new krn(null, null, null));
        h = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.LayoutMode layoutMode = DivContainer.LayoutMode.NO_WRAP;
        i = Expression.Companion.constant$default(companion, layoutMode, null, 2, null);
        j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.Orientation orientation = DivContainer.Orientation.VERTICAL;
        k = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        l = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        m = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        n = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        o = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        p = companion2.from(divContentAlignmentHorizontal, c.i);
        q = companion2.from(divContentAlignmentVertical, d.i);
        r = companion2.from(layoutMode, e.i);
        s = companion2.from(orientation, f.i);
        t = companion2.from(divVisibility, g.i);
        u = new wp(9);
        v = new cq(10);
        w = new dq(10);
        x = new com.vk.movika.sdk.base.model.n(8);
        y = new eq(9);
        z = new com.vk.movika.sdk.base.model.history.b(9);
    }
}

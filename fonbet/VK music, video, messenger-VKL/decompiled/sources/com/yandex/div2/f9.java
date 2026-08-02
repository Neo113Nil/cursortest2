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
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.qq;
import xsna.rl3;
import xsna.rq;
import xsna.sq;
import xsna.tq;
import xsna.uq;
import xsna.vmn;
import xsna.vq;
import xsna.wq;
import xsna.xq;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes8.dex */
public final class f9 {

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<Long> b;

    @Deprecated
    public static final Expression<DivSizeUnit> c;

    @Deprecated
    public static final v9.c d;

    @Deprecated
    public static final Expression<Integer> e;

    @Deprecated
    public static final Expression<Double> f;

    @Deprecated
    public static final Expression<Integer> g;

    @Deprecated
    public static final Expression<DivVisibility> h;

    @Deprecated
    public static final v9.b i;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> j;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> k;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> l;

    @Deprecated
    public static final TypeHelper<DivFontWeight> m;

    @Deprecated
    public static final TypeHelper<DivVisibility> n;

    @Deprecated
    public static final qq o;

    @Deprecated
    public static final rq p;

    @Deprecated
    public static final sq q;

    @Deprecated
    public static final tq r;

    @Deprecated
    public static final uq s;

    @Deprecated
    public static final vq t;

    @Deprecated
    public static final wq u;

    @Deprecated
    public static final xq v;

    /* compiled from: DivSelectJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class f implements Serializer, Deserializer {
        public final fe a;

        public f(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e9 deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", f9.j, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", f9.k, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            qq qqVar = f9.o;
            Expression<Double> expression = f9.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, izsVar, qqVar, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, izsVar2, f9.p);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            sq sqVar = f9.q;
            Expression<Long> expression3 = f9.b;
            Expression<Long> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper2, izsVar2, sqVar, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            TypeHelper<DivSizeUnit> typeHelper4 = f9.l;
            izs<String, DivSizeUnit> izsVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = f9.c;
            Expression<DivSizeUnit> readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, izsVar3, expression4);
            Expression<DivSizeUnit> expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", f9.m, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, izsVar2, f9.r);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = f9.d;
            }
            v9 v9Var2 = v9Var;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = f9.e;
            Expression<Integer> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper5, izsVar4, expression6);
            Expression<Integer> expression7 = readOptionalExpression11 == null ? expression6 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            Expression<Double> expression8 = f9.f;
            Expression<Double> readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, izsVar, expression8);
            Expression<Double> expression9 = readOptionalExpression13 == null ? expression8 : readOptionalExpression13;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, izsVar2, f9.s);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, SignalingProtocol.KEY_OPTIONS, feVar.D6, f9.t);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, izsVar2, f9.u);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", feVar.k1);
            Expression<Integer> expression10 = f9.g;
            Expression<Integer> readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper5, izsVar4, expression10);
            Expression<Integer> expression11 = readOptionalExpression17 == null ? expression10 : readOptionalExpression17;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, f9.v);
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "value_variable");
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper6 = f9.n;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression12 = f9.h;
            Expression<DivVisibility> readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper6, izsVar5, expression12);
            if (readOptionalExpression18 != null) {
                expression12 = readOptionalExpression18;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = f9.i;
            }
            return new e9(divAccessibility, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, readOptionalList2, u1Var, readOptionalExpression4, readOptionalList3, readOptionalList4, jlnVar, readOptionalExpression5, expression3, expression5, readOptionalExpression8, readOptionalExpression9, readOptionalExpression10, readOptionalList5, v9Var2, expression7, readOptionalExpression12, str, vmnVar, expression9, readOptionalExpression14, y3Var, readList, y3Var2, readOptionalExpression15, readOptionalExpression16, readOptionalList6, expression11, readOptionalList7, hdVar, d2Var, e1Var, e1Var2, readOptionalList8, str2, readOptionalList9, readOptionalList10, expression12, zdVar, readOptionalList11, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, e9 e9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = e9Var.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", e9Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", e9Var.c, DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", e9Var.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", e9Var.e, feVar.t1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, e9Var.f, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", e9Var.g, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", e9Var.h);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", e9Var.i, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", e9Var.j, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", e9Var.k, feVar.z3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", e9Var.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", e9Var.m);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", e9Var.n, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", e9Var.o);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", e9Var.p, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", e9Var.q);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", e9Var.r, feVar.I3);
            v9 v9Var = e9Var.s;
            bpn0 bpn0Var = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var);
            Expression<Integer> expression = e9Var.t;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", expression, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", e9Var.u);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", e9Var.v);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", e9Var.w, feVar.M4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", e9Var.x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", e9Var.y);
            y3 y3Var = e9Var.z;
            bpn0 bpn0Var2 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, SignalingProtocol.KEY_OPTIONS, e9Var.A, feVar.D6);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", e9Var.B, bpn0Var2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", e9Var.C);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", e9Var.D);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", e9Var.E, feVar.k1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", e9Var.F, izsVar);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", e9Var.G, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", e9Var.H, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", e9Var.I, feVar.U1);
            e1 e1Var = e9Var.J;
            bpn0 bpn0Var3 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", e9Var.K, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", e9Var.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", e9Var.M);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", e9Var.N, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", e9Var.O, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", e9Var.P, DivVisibility.TO_STRING);
            zd zdVar = e9Var.Q;
            bpn0 bpn0Var4 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", e9Var.R, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", e9Var.S, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class g implements Serializer, TemplateDeserializer {
        public final fe a;

        public g(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j9 deserialize(ParsingContext parsingContext, j9 j9Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = j9Var != null ? j9Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", f9.j, allowPropertyOverride, j9Var != null ? j9Var.b : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", f9.k, allowPropertyOverride, j9Var != null ? j9Var.c : null, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field2 = j9Var != null ? j9Var.d : null;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field2, izsVar, f9.o);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, j9Var != null ? j9Var.e : null, feVar.u1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, j9Var != null ? j9Var.f : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, j9Var != null ? j9Var.g : null, feVar.M1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field3 = j9Var != null ? j9Var.h : null;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field3, izsVar2, f9.p);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, j9Var != null ? j9Var.i : null, feVar.Q2);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, j9Var != null ? j9Var.j : null, feVar.c3);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, j9Var != null ? j9Var.k : null, feVar.A3);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, j9Var != null ? j9Var.l : null);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper2, allowPropertyOverride, j9Var != null ? j9Var.m : null, izsVar2, f9.q);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", f9.l, allowPropertyOverride, j9Var != null ? j9Var.n : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, j9Var != null ? j9Var.o : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", f9.m, allowPropertyOverride, j9Var != null ? j9Var.p : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, j9Var != null ? j9Var.q : null, izsVar2, f9.r);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, j9Var != null ? j9Var.r : null, feVar.J3);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, j9Var != null ? j9Var.s : null, feVar.Z6);
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field4 = j9Var != null ? j9Var.t : null;
            izs<Object, Integer> izsVar3 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new j9(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField5, readOptionalField4, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field4, izsVar3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, j9Var != null ? j9Var.u : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, j9Var != null ? j9Var.v : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, j9Var != null ? j9Var.w : null, feVar.N4), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, j9Var != null ? j9Var.x : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, j9Var != null ? j9Var.y : null, izsVar2, f9.s), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, j9Var != null ? j9Var.z : null, feVar.Z2), JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, SignalingProtocol.KEY_OPTIONS, allowPropertyOverride, j9Var != null ? j9Var.A : null, feVar.E6, f9.t), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, j9Var != null ? j9Var.B : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, j9Var != null ? j9Var.C : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, j9Var != null ? j9Var.D : null, izsVar2, f9.u), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, j9Var != null ? j9Var.E : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, j9Var != null ? j9Var.F : null, izsVar3), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, j9Var != null ? j9Var.G : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, j9Var != null ? j9Var.H : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, j9Var != null ? j9Var.I : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, j9Var != null ? j9Var.J : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, j9Var != null ? j9Var.K : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, j9Var != null ? j9Var.L : null, DivTransitionTrigger.FROM_STRING, f9.v), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, j9Var != null ? j9Var.M : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, j9Var != null ? j9Var.N : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, j9Var != null ? j9Var.O : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", f9.n, allowPropertyOverride, j9Var != null ? j9Var.P : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, j9Var != null ? j9Var.Q : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, j9Var != null ? j9Var.R : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, j9Var != null ? j9Var.S : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, j9 j9Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = j9Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", j9Var.b, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", j9Var.c, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", j9Var.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", j9Var.e, feVar.u1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, j9Var.f, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", j9Var.g, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", j9Var.h);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", j9Var.i, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", j9Var.j, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", j9Var.k, feVar.A3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", j9Var.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", j9Var.m);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", j9Var.n, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", j9Var.o);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", j9Var.p, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", j9Var.q);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", j9Var.r, feVar.J3);
            Field<z9> field2 = j9Var.s;
            bpn0 bpn0Var = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field2, bpn0Var);
            Field<Expression<Integer>> field3 = j9Var.t;
            izs<Integer, String> izsVar = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", field3, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", j9Var.u);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", j9Var.v);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", j9Var.w, feVar.N4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", j9Var.x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", j9Var.y);
            Field<a4> field4 = j9Var.z;
            bpn0 bpn0Var2 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field4, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, SignalingProtocol.KEY_OPTIONS, j9Var.A, feVar.E6);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", j9Var.B, bpn0Var2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", j9Var.C);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", j9Var.D);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", j9Var.E, feVar.l1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", j9Var.F, izsVar);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", j9Var.G, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", j9Var.H, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", j9Var.I, feVar.V1);
            Field<i1> field5 = j9Var.J;
            bpn0 bpn0Var3 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field5, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", j9Var.K, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", j9Var.L, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", j9Var.M);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", j9Var.N, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", j9Var.O, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", j9Var.P, DivVisibility.TO_STRING);
            Field<be> field6 = j9Var.Q;
            bpn0 bpn0Var4 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field6, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", j9Var.R, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", j9Var.S, bpn0Var);
            return jSONObject;
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class h implements TemplateResolver<JSONObject, j9, e9> {
        public final fe a;

        public h(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e9 resolve(ParsingContext parsingContext, j9 j9Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = j9Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.b, jSONObject, "alignment_horizontal", f9.j, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.c, jSONObject, "alignment_vertical", f9.k, DivAlignmentVertical.FROM_STRING);
            Field<Expression<Double>> field2 = j9Var.d;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            qq qqVar = f9.o;
            Expression<Double> expression = f9.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alpha", typeHelper, izsVar, qqVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.e, jSONObject, "animators", feVar.v1, feVar.t1);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.f, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, j9Var.g, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field3 = j9Var.h;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar2 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper2, izsVar2, f9.p);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.i, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.j, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, j9Var.k, jSONObject, "focus", feVar.B3, feVar.z3);
            Field<Expression<String>> field4 = j9Var.l;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_family", typeHelper3);
            Field<Expression<Long>> field5 = j9Var.m;
            sq sqVar = f9.q;
            Expression<Long> expression3 = f9.b;
            Expression<Long> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "font_size", typeHelper2, izsVar2, sqVar, expression3);
            if (resolveOptionalExpression6 != null) {
                expression3 = resolveOptionalExpression6;
            }
            Field<Expression<DivSizeUnit>> field6 = j9Var.n;
            TypeHelper<DivSizeUnit> typeHelper4 = f9.l;
            izs<String, DivSizeUnit> izsVar3 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression4 = f9.c;
            Expression<DivSizeUnit> resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "font_size_unit", typeHelper4, izsVar3, expression4);
            Expression<DivSizeUnit> expression5 = resolveOptionalExpression7 == null ? expression4 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.o, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.p, jSONObject, "font_weight", f9.m, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.q, jSONObject, "font_weight_value", typeHelper2, izsVar2, f9.r);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.r, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, j9Var.s, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = f9.d;
            }
            v9 v9Var2 = v9Var;
            Field<Expression<Integer>> field7 = j9Var.t;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar4 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression<Integer> expression6 = f9.e;
            Expression<Integer> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "hint_color", typeHelper5, izsVar4, expression6);
            Expression<Integer> expression7 = resolveOptionalExpression11 == null ? expression6 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.u, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, j9Var.v, jSONObject, "id");
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, j9Var.w, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            Field<Expression<Double>> field8 = j9Var.x;
            Expression<Double> expression8 = f9.f;
            Expression<Double> resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "letter_spacing", typeHelper, izsVar, expression8);
            Expression<Double> expression9 = resolveOptionalExpression13 == null ? expression8 : resolveOptionalExpression13;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.y, jSONObject, "line_height", typeHelper2, izsVar2, f9.s);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, j9Var.z, jSONObject, "margins", feVar.a3, feVar.Y2);
            List resolveList = JsonFieldResolver.resolveList(parsingContext, j9Var.A, jSONObject, SignalingProtocol.KEY_OPTIONS, feVar.F6, feVar.D6, f9.t);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, j9Var.B, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.C, jSONObject, "reuse_id", typeHelper3);
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.D, jSONObject, "row_span", typeHelper2, izsVar2, f9.u);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.E, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            Field<Expression<Integer>> field9 = j9Var.F;
            Expression<Integer> expression10 = f9.g;
            Expression<Integer> resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "text_color", typeHelper5, izsVar4, expression10);
            Expression<Integer> expression11 = resolveOptionalExpression17 == null ? expression10 : resolveOptionalExpression17;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.G, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, j9Var.H, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, j9Var.I, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, j9Var.J, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, j9Var.K, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.L, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, f9.v);
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, j9Var.M, jSONObject, "value_variable");
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.N, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.O, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field10 = j9Var.P;
            TypeHelper<DivVisibility> typeHelper6 = f9.n;
            izs<String, DivVisibility> izsVar5 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression12 = f9.h;
            Expression<DivVisibility> resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "visibility", typeHelper6, izsVar5, expression12);
            if (resolveOptionalExpression18 != null) {
                expression12 = resolveOptionalExpression18;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, j9Var.Q, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, j9Var.R, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, j9Var.S, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = f9.i;
            }
            return new e9(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, resolveOptionalList2, u1Var, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, jlnVar, resolveOptionalExpression5, expression3, expression5, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalExpression10, resolveOptionalList5, v9Var2, expression7, resolveOptionalExpression12, str, vmnVar, expression9, resolveOptionalExpression14, y3Var, resolveList, y3Var2, resolveOptionalExpression15, resolveOptionalExpression16, resolveOptionalList6, expression11, resolveOptionalList7, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList8, str2, resolveOptionalList9, resolveOptionalList10, expression12, zdVar, resolveOptionalList11, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        b = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        c = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        d = new v9.c(new krn(null, null, null));
        e = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        f = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        g = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        h = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        i = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        j = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        k = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        l = companion2.from(divSizeUnit, c.i);
        m = companion2.from(rl3.L(DivFontWeight.values()), d.i);
        n = companion2.from(divVisibility, e.i);
        o = new qq(10);
        p = new rq(11);
        q = new sq(11);
        r = new tq(12);
        s = new uq(11);
        t = new vq(13);
        u = new wq(14);
        v = new xq(13);
    }
}

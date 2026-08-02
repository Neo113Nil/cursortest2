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
import com.yandex.div2.DivInput;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.as;
import xsna.bpn0;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.p11;
import xsna.rl3;
import xsna.ur;
import xsna.vmn;
import xsna.vr;
import xsna.wr;
import xsna.xr;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes8.dex */
public final class r5 {

    @Deprecated
    public static final ur A;

    @Deprecated
    public static final vr B;

    @Deprecated
    public static final wr C;

    @Deprecated
    public static final xr D;

    @Deprecated
    public static final io.reactivex.rxjava3.processors.b E;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.b F;

    @Deprecated
    public static final io.reactivex.rxjava3.subjects.c G;

    @Deprecated
    public static final as H;

    @Deprecated
    public static final p11 I;

    @Deprecated
    public static final Expression<Double> a;

    @Deprecated
    public static final Expression<DivInput.Autocapitalization> b;

    @Deprecated
    public static final Expression<DivInput.EnterKeyType> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final Expression<DivSizeUnit> e;

    @Deprecated
    public static final v9.c f;

    @Deprecated
    public static final Expression<Integer> g;

    @Deprecated
    public static final Expression<Boolean> h;

    @Deprecated
    public static final Expression<DivInput.KeyboardType> i;

    @Deprecated
    public static final Expression<Double> j;

    @Deprecated
    public static final Expression<Boolean> k;

    @Deprecated
    public static final Expression<DivAlignmentHorizontal> l;

    @Deprecated
    public static final Expression<DivAlignmentVertical> m;

    @Deprecated
    public static final Expression<Integer> n;

    @Deprecated
    public static final Expression<DivVisibility> o;

    @Deprecated
    public static final v9.b p;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> q;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> r;

    @Deprecated
    public static final TypeHelper<DivInput.Autocapitalization> s;

    @Deprecated
    public static final TypeHelper<DivInput.EnterKeyType> t;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> u;

    @Deprecated
    public static final TypeHelper<DivFontWeight> v;

    @Deprecated
    public static final TypeHelper<DivInput.KeyboardType> w;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> x;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> y;

    @Deprecated
    public static final TypeHelper<DivVisibility> z;

    /* compiled from: DivInputJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivInput.Autocapitalization);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivInput.EnterKeyType);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class g extends Lambda implements izs<Object, Boolean> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivInput.KeyboardType);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class h extends Lambda implements izs<Object, Boolean> {
        public static final h i = new h(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class i extends Lambda implements izs<Object, Boolean> {
        public static final i i = new i(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class j extends Lambda implements izs<Object, Boolean> {
        public static final j i = new j(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class k implements Serializer, Deserializer {
        public final fe a;

        public k(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivInput deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
            fe feVar = this.a;
            bpn0 bpn0Var = feVar.H;
            bpn0 bpn0Var2 = feVar.t9;
            bpn0 bpn0Var3 = feVar.z1;
            bpn0 bpn0Var4 = feVar.Y2;
            bpn0 bpn0Var5 = feVar.Y6;
            bpn0 bpn0Var6 = feVar.k1;
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", bpn0Var);
            TypeHelper<DivAlignmentHorizontal> typeHelper = r5.q;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = r5.r;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ur urVar = r5.A;
            Expression<Double> expression = r5.a;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, izsVar3, urVar, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = r5.s;
            izs<String, DivInput.Autocapitalization> izsVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression3 = r5.b;
            Expression<DivInput.Autocapitalization> readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", typeHelper4, izsVar4, expression3);
            Expression<DivInput.Autocapitalization> expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, izsVar5, r5.B);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", bpn0Var6);
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = r5.t;
            izs<String, DivInput.EnterKeyType> izsVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression5 = r5.c;
            Expression<DivInput.EnterKeyType> readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", typeHelper6, izsVar6, expression5);
            Expression<DivInput.EnterKeyType> expression6 = readOptionalExpression6 == null ? expression5 : readOptionalExpression6;
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", feVar.p4);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            wr wrVar = r5.C;
            Expression<Long> expression7 = r5.d;
            Expression<Long> readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, izsVar5, wrVar, expression7);
            if (readOptionalExpression8 != null) {
                expression7 = readOptionalExpression8;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = r5.u;
            izs<String, DivSizeUnit> izsVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression8 = r5.e;
            Expression<DivSizeUnit> readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, izsVar7, expression8);
            Expression<DivSizeUnit> expression9 = readOptionalExpression9 == null ? expression8 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", r5.v, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, izsVar5, r5.D);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = r5.f;
            }
            v9 v9Var2 = v9Var;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper9, izsVar8);
            Expression<Integer> expression10 = r5.g;
            Expression<Integer> readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper9, izsVar8, expression10);
            Expression<Integer> expression11 = readOptionalExpression14 == null ? expression10 : readOptionalExpression14;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression12 = r5.h;
            Expression<Boolean> readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper10, izsVar9, expression12);
            Expression<Boolean> expression13 = readOptionalExpression16 == null ? expression12 : readOptionalExpression16;
            TypeHelper<DivInput.KeyboardType> typeHelper11 = r5.w;
            izs<String, DivInput.KeyboardType> izsVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression14 = r5.i;
            Expression<DivInput.KeyboardType> readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", typeHelper11, izsVar10, expression14);
            Expression<DivInput.KeyboardType> expression15 = readOptionalExpression17 == null ? expression14 : readOptionalExpression17;
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            Expression<Double> expression16 = r5.j;
            Expression<Double> readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, izsVar3, expression16);
            Expression<Double> expression17 = readOptionalExpression18 == null ? expression16 : readOptionalExpression18;
            Expression readOptionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, izsVar5, r5.E);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            s5 s5Var = (s5) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", feVar.s4);
            Expression readOptionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper5, izsVar5, r5.F);
            Expression readOptionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper5, izsVar5, r5.G);
            DivInput.a aVar = (DivInput.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "native_interface", feVar.J4);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            Expression readOptionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression readOptionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, izsVar5, r5.H);
            Expression<Boolean> expression18 = r5.k;
            Expression<Boolean> readOptionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper10, izsVar9, expression18);
            Expression<Boolean> expression19 = readOptionalExpression24 == null ? expression18 : readOptionalExpression24;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = r5.x;
            Expression<DivAlignmentHorizontal> expression20 = r5.l;
            Expression<DivAlignmentHorizontal> readOptionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper12, izsVar, expression20);
            Expression<DivAlignmentHorizontal> expression21 = readOptionalExpression25 == null ? expression20 : readOptionalExpression25;
            TypeHelper<DivAlignmentVertical> typeHelper13 = r5.y;
            Expression<DivAlignmentVertical> expression22 = r5.m;
            Expression<DivAlignmentVertical> readOptionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper13, izsVar2, expression22);
            Expression<DivAlignmentVertical> expression23 = readOptionalExpression26 == null ? expression22 : readOptionalExpression26;
            Expression<Integer> expression24 = r5.n;
            Expression<Integer> readOptionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper9, izsVar8, expression24);
            Expression<Integer> expression25 = readOptionalExpression27 == null ? expression24 : readOptionalExpression27;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "text_variable");
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, r5.I);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", feVar.D4);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper14 = r5.z;
            izs<String, DivVisibility> izsVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression26 = r5.o;
            Expression<DivVisibility> readOptionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, izsVar11, expression26);
            if (readOptionalExpression28 != null) {
                expression26 = readOptionalExpression28;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = r5.p;
            }
            return new DivInput(divAccessibility, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList, expression4, readOptionalList2, u1Var, readOptionalExpression5, readOptionalList3, readOptionalList4, expression6, readOptionalList5, readOptionalList6, jlnVar, readOptionalExpression7, expression7, expression9, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, readOptionalList7, v9Var2, readOptionalExpression13, expression11, readOptionalExpression15, str, expression13, expression15, vmnVar, expression17, readOptionalExpression19, y3Var, s5Var, readOptionalExpression20, readOptionalExpression21, aVar, y3Var2, readOptionalExpression22, readOptionalExpression23, expression19, readOptionalList8, expression21, expression23, expression25, str2, readOptionalList9, hdVar, d2Var, e1Var, e1Var2, readOptionalList10, readOptionalList11, readOptionalList12, readOptionalList13, expression26, zdVar, readOptionalList14, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivInput divInput) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divInput.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            Expression<DivAlignmentHorizontal> expression = divInput.b;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expression, izsVar);
            Expression<DivAlignmentVertical> expression2 = divInput.c;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divInput.d);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divInput.e, feVar.t1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autocapitalization", divInput.f, DivInput.Autocapitalization.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divInput.g, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divInput.h, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divInput.i);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divInput.j, feVar.P2);
            List<DivAction> list = divInput.k;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.writeList(parsingContext, jSONObject, "enter_key_actions", list, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "enter_key_type", divInput.l, DivInput.EnterKeyType.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divInput.m, feVar.b3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divInput.n, feVar.p4);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divInput.o, feVar.z3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divInput.p);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divInput.q);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divInput.r, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", divInput.s);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", divInput.t, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divInput.u);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divInput.v, feVar.I3);
            v9 v9Var = divInput.w;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            Expression<Integer> expression3 = divInput.x;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "highlight_color", expression3, izsVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", divInput.y, izsVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divInput.z);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divInput.A);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divInput.B);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "keyboard_type", divInput.C, DivInput.KeyboardType.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divInput.D, feVar.M4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divInput.E);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divInput.F);
            y3 y3Var = divInput.G;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", divInput.H, feVar.s4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_length", divInput.I);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_lines", divInput.J);
            JsonPropertyParser.write(parsingContext, jSONObject, "native_interface", divInput.K, feVar.J4);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divInput.L, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divInput.M);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divInput.N);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "select_all_on_focus", divInput.O);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divInput.P, bpn0Var);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divInput.Q, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divInput.R, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divInput.S, izsVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_variable", divInput.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divInput.U, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divInput.V, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divInput.W, feVar.U1);
            e1 e1Var = divInput.X;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divInput.Y, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divInput.Z, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "validators", divInput.a0, feVar.D4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divInput.b0, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divInput.c0, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divInput.d0, DivVisibility.TO_STRING);
            zd zdVar = divInput.e0;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divInput.f0, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divInput.g0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class l implements Serializer, TemplateDeserializer {
        public final fe a;

        public l(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a6 deserialize(ParsingContext parsingContext, a6 a6Var, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = a6Var != null ? a6Var.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            TypeHelper<DivAlignmentHorizontal> typeHelper = r5.q;
            Field<Expression<DivAlignmentHorizontal>> field2 = a6Var != null ? a6Var.b : null;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = r5.r;
            Field<Expression<DivAlignmentVertical>> field3 = a6Var != null ? a6Var.c : null;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field4 = a6Var != null ? a6Var.d : null;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field4, izsVar3, r5.A);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, a6Var != null ? a6Var.e : null, feVar.u1);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "autocapitalization", r5.s, allowPropertyOverride, a6Var != null ? a6Var.f : null, DivInput.Autocapitalization.FROM_STRING);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, a6Var != null ? a6Var.g : null, feVar.G1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, a6Var != null ? a6Var.h : null, feVar.M1);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field5 = a6Var != null ? a6Var.i : null;
            izs<Number, Long> izsVar4 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field5, izsVar4, r5.B);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, a6Var != null ? a6Var.j : null, feVar.Q2);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, a6Var != null ? a6Var.k : null, feVar.l1);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "enter_key_type", r5.t, allowPropertyOverride, a6Var != null ? a6Var.l : null, DivInput.EnterKeyType.FROM_STRING);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, a6Var != null ? a6Var.m : null, feVar.c3);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, a6Var != null ? a6Var.n : null, feVar.q4);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, a6Var != null ? a6Var.o : null, feVar.A3);
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, a6Var != null ? a6Var.p : null);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.q : null, izsVar4, r5.C);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", r5.u, allowPropertyOverride, a6Var != null ? a6Var.r : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, a6Var != null ? a6Var.s : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", r5.v, allowPropertyOverride, a6Var != null ? a6Var.t : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.u : null, izsVar4, r5.D);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, a6Var != null ? a6Var.v : null, feVar.J3);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, a6Var != null ? a6Var.w : null, feVar.Z6);
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field6 = a6Var != null ? a6Var.x : null;
            izs<Object, Integer> izsVar5 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field6, izsVar5);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, a6Var != null ? a6Var.y : null, izsVar5);
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, a6Var != null ? a6Var.z : null);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, a6Var != null ? a6Var.A : null);
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field7 = a6Var != null ? a6Var.B : null;
            izs<Object, Boolean> izsVar6 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new a6(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression5, readOptionalListField3, readOptionalListField4, readOptionalFieldWithExpression6, readOptionalListField5, readOptionalListField6, readOptionalField3, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField7, readOptionalField4, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalField5, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field7, izsVar6), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "keyboard_type", r5.w, allowPropertyOverride, a6Var != null ? a6Var.C : null, DivInput.KeyboardType.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, a6Var != null ? a6Var.D : null, feVar.N4), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, a6Var != null ? a6Var.E : null, izsVar3), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.F : null, izsVar4, r5.E), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, a6Var != null ? a6Var.G : null, feVar.Z2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, a6Var != null ? a6Var.H : null, feVar.t4), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.I : null, izsVar4, r5.F), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.J : null, izsVar4, r5.G), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, a6Var != null ? a6Var.K : null, feVar.K4), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, a6Var != null ? a6Var.L : null, feVar.Z2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, a6Var != null ? a6Var.M : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, a6Var != null ? a6Var.N : null, izsVar4, r5.H), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, a6Var != null ? a6Var.O : null, izsVar6), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, a6Var != null ? a6Var.P : null, feVar.l1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_horizontal", r5.x, allowPropertyOverride, a6Var != null ? a6Var.Q : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_vertical", r5.y, allowPropertyOverride, a6Var != null ? a6Var.R : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, a6Var != null ? a6Var.S : null, izsVar5), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, a6Var != null ? a6Var.T : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, a6Var != null ? a6Var.U : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, a6Var != null ? a6Var.V : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, a6Var != null ? a6Var.W : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, a6Var != null ? a6Var.X : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, a6Var != null ? a6Var.Y : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, a6Var != null ? a6Var.Z : null, DivTransitionTrigger.FROM_STRING, r5.I), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, a6Var != null ? a6Var.a0 : null, feVar.E4), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, a6Var != null ? a6Var.b0 : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, a6Var != null ? a6Var.c0 : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", r5.z, allowPropertyOverride, a6Var != null ? a6Var.d0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, a6Var != null ? a6Var.e0 : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, a6Var != null ? a6Var.f0 : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, a6Var != null ? a6Var.g0 : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, a6 a6Var) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = a6Var.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<Expression<DivAlignmentHorizontal>> field2 = a6Var.b;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field2, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = a6Var.c;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field3, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", a6Var.d);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", a6Var.e, feVar.u1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autocapitalization", a6Var.f, DivInput.Autocapitalization.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, a6Var.g, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", a6Var.h, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", a6Var.i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", a6Var.j, feVar.Q2);
            Field<List<h0>> field4 = a6Var.k;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeListField(parsingContext, jSONObject, "enter_key_actions", field4, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "enter_key_type", a6Var.l, DivInput.EnterKeyType.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", a6Var.m, feVar.c3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", a6Var.n, feVar.q4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", a6Var.o, feVar.A3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", a6Var.p);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", a6Var.q);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", a6Var.r, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", a6Var.s);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", a6Var.t, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", a6Var.u);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", a6Var.v, feVar.J3);
            Field<z9> field5 = a6Var.w;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field5, bpn0Var2);
            Field<Expression<Integer>> field6 = a6Var.x;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "highlight_color", field6, izsVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", a6Var.y, izsVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", a6Var.z);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", a6Var.A);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", a6Var.B);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "keyboard_type", a6Var.C, DivInput.KeyboardType.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", a6Var.D, feVar.N4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", a6Var.E);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", a6Var.F);
            Field<a4> field7 = a6Var.G;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field7, bpn0Var3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", a6Var.H, feVar.t4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_length", a6Var.I);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_lines", a6Var.J);
            JsonFieldParser.writeField(parsingContext, jSONObject, "native_interface", a6Var.K, feVar.K4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", a6Var.L, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", a6Var.M);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", a6Var.N);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "select_all_on_focus", a6Var.O);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", a6Var.P, bpn0Var);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", a6Var.Q, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", a6Var.R, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", a6Var.S, izsVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_variable", a6Var.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", a6Var.U, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", a6Var.V, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", a6Var.W, feVar.V1);
            Field<i1> field8 = a6Var.X;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field8, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", a6Var.Y, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", a6Var.Z, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "validators", a6Var.a0, feVar.E4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", a6Var.b0, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", a6Var.c0, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", a6Var.d0, DivVisibility.TO_STRING);
            Field<be> field9 = a6Var.e0;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field9, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", a6Var.f0, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", a6Var.g0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class m implements TemplateResolver<JSONObject, a6, DivInput> {
        public final fe a;

        public m(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivInput resolve(ParsingContext parsingContext, a6 a6Var, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = a6Var.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            Field<Expression<DivAlignmentHorizontal>> field2 = a6Var.b;
            TypeHelper<DivAlignmentHorizontal> typeHelper = r5.q;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = a6Var.c;
            TypeHelper<DivAlignmentVertical> typeHelper2 = r5.r;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            Field<Expression<Double>> field4 = a6Var.d;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ur urVar = r5.A;
            Expression<Double> expression = r5.a;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper3, izsVar3, urVar, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.e, jSONObject, "animators", feVar.v1, feVar.t1);
            Field<Expression<DivInput.Autocapitalization>> field5 = a6Var.f;
            TypeHelper<DivInput.Autocapitalization> typeHelper4 = r5.s;
            izs<String, DivInput.Autocapitalization> izsVar4 = DivInput.Autocapitalization.FROM_STRING;
            Expression<DivInput.Autocapitalization> expression3 = r5.b;
            Expression<DivInput.Autocapitalization> resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "autocapitalization", typeHelper4, izsVar4, expression3);
            Expression<DivInput.Autocapitalization> expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.g, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, a6Var.h, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Long>> field6 = a6Var.i;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, izsVar5, r5.B);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.j, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.k, jSONObject, "enter_key_actions", feVar.m1, feVar.k1);
            Field<Expression<DivInput.EnterKeyType>> field7 = a6Var.l;
            TypeHelper<DivInput.EnterKeyType> typeHelper6 = r5.t;
            izs<String, DivInput.EnterKeyType> izsVar6 = DivInput.EnterKeyType.FROM_STRING;
            Expression<DivInput.EnterKeyType> expression5 = r5.c;
            Expression<DivInput.EnterKeyType> resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "enter_key_type", typeHelper6, izsVar6, expression5);
            Expression<DivInput.EnterKeyType> expression6 = resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6;
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.m, jSONObject, "extensions", feVar.d3, feVar.b3);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.n, jSONObject, "filters", feVar.r4, feVar.p4);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, a6Var.o, jSONObject, "focus", feVar.B3, feVar.z3);
            Field<Expression<String>> field8 = a6Var.p;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
            Field<Expression<Long>> field9 = a6Var.q;
            wr wrVar = r5.C;
            Expression<Long> expression7 = r5.d;
            Expression<Long> resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size", typeHelper5, izsVar5, wrVar, expression7);
            if (resolveOptionalExpression8 != null) {
                expression7 = resolveOptionalExpression8;
            }
            Field<Expression<DivSizeUnit>> field10 = a6Var.r;
            TypeHelper<DivSizeUnit> typeHelper8 = r5.u;
            izs<String, DivSizeUnit> izsVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression8 = r5.e;
            Expression<DivSizeUnit> resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size_unit", typeHelper8, izsVar7, expression8);
            Expression<DivSizeUnit> expression9 = resolveOptionalExpression9 == null ? expression8 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.s, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.t, jSONObject, "font_weight", r5.v, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.u, jSONObject, "font_weight_value", typeHelper5, izsVar5, r5.D);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.v, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, a6Var.w, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = r5.f;
            }
            v9 v9Var2 = v9Var;
            Field<Expression<Integer>> field11 = a6Var.x;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar8 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "highlight_color", typeHelper9, izsVar8);
            Field<Expression<Integer>> field12 = a6Var.y;
            Expression<Integer> expression10 = r5.g;
            Expression<Integer> resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "hint_color", typeHelper9, izsVar8, expression10);
            Expression<Integer> expression11 = resolveOptionalExpression14 == null ? expression10 : resolveOptionalExpression14;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.z, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, a6Var.A, jSONObject, "id");
            Field<Expression<Boolean>> field13 = a6Var.B;
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar9 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression<Boolean> expression12 = r5.h;
            Expression<Boolean> resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "is_enabled", typeHelper10, izsVar9, expression12);
            Expression<Boolean> expression13 = resolveOptionalExpression16 == null ? expression12 : resolveOptionalExpression16;
            Field<Expression<DivInput.KeyboardType>> field14 = a6Var.C;
            TypeHelper<DivInput.KeyboardType> typeHelper11 = r5.w;
            izs<String, DivInput.KeyboardType> izsVar10 = DivInput.KeyboardType.FROM_STRING;
            Expression<DivInput.KeyboardType> expression14 = r5.i;
            Expression<DivInput.KeyboardType> resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "keyboard_type", typeHelper11, izsVar10, expression14);
            Expression<DivInput.KeyboardType> expression15 = resolveOptionalExpression17 == null ? expression14 : resolveOptionalExpression17;
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, a6Var.D, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            Field<Expression<Double>> field15 = a6Var.E;
            Expression<Double> expression16 = r5.j;
            Expression<Double> resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "letter_spacing", typeHelper3, izsVar3, expression16);
            Expression<Double> expression17 = resolveOptionalExpression18 == null ? expression16 : resolveOptionalExpression18;
            Expression resolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.F, jSONObject, "line_height", typeHelper5, izsVar5, r5.E);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, a6Var.G, jSONObject, "margins", feVar.a3, feVar.Y2);
            s5 s5Var = (s5) JsonFieldResolver.resolveOptional(parsingContext, a6Var.H, jSONObject, "mask", feVar.u4, feVar.s4);
            Expression resolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.I, jSONObject, "max_length", typeHelper5, izsVar5, r5.F);
            Expression resolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.J, jSONObject, "max_visible_lines", typeHelper5, izsVar5, r5.G);
            DivInput.a aVar = (DivInput.a) JsonFieldResolver.resolveOptional(parsingContext, a6Var.K, jSONObject, "native_interface", feVar.L4, feVar.J4);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, a6Var.L, jSONObject, "paddings", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.M, jSONObject, "reuse_id", typeHelper7);
            Expression resolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, a6Var.N, jSONObject, "row_span", typeHelper5, izsVar5, r5.H);
            Field<Expression<Boolean>> field16 = a6Var.O;
            Expression<Boolean> expression18 = r5.k;
            Expression<Boolean> resolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "select_all_on_focus", typeHelper10, izsVar9, expression18);
            Expression<Boolean> expression19 = resolveOptionalExpression24 == null ? expression18 : resolveOptionalExpression24;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.P, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            Field<Expression<DivAlignmentHorizontal>> field17 = a6Var.Q;
            TypeHelper<DivAlignmentHorizontal> typeHelper12 = r5.x;
            Expression<DivAlignmentHorizontal> expression20 = r5.l;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_alignment_horizontal", typeHelper12, izsVar, expression20);
            Expression<DivAlignmentHorizontal> expression21 = resolveOptionalExpression25 == null ? expression20 : resolveOptionalExpression25;
            Field<Expression<DivAlignmentVertical>> field18 = a6Var.R;
            TypeHelper<DivAlignmentVertical> typeHelper13 = r5.y;
            Expression<DivAlignmentVertical> expression22 = r5.m;
            Expression<DivAlignmentVertical> resolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "text_alignment_vertical", typeHelper13, izsVar2, expression22);
            Expression<DivAlignmentVertical> expression23 = resolveOptionalExpression26 == null ? expression22 : resolveOptionalExpression26;
            Field<Expression<Integer>> field19 = a6Var.S;
            Expression<Integer> expression24 = r5.n;
            Expression<Integer> resolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "text_color", typeHelper9, izsVar8, expression24);
            Expression<Integer> expression25 = resolveOptionalExpression27 == null ? expression24 : resolveOptionalExpression27;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, a6Var.T, jSONObject, "text_variable");
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.U, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, a6Var.V, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, a6Var.W, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, a6Var.X, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, a6Var.Y, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.Z, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, r5.I);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.a0, jSONObject, "validators", feVar.F4, feVar.D4);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.b0, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.c0, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field20 = a6Var.d0;
            TypeHelper<DivVisibility> typeHelper14 = r5.z;
            izs<String, DivVisibility> izsVar11 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression26 = r5.o;
            Expression<DivVisibility> resolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, "visibility", typeHelper14, izsVar11, expression26);
            if (resolveOptionalExpression28 != null) {
                expression26 = resolveOptionalExpression28;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, a6Var.e0, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, a6Var.f0, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, a6Var.g0, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = r5.p;
            }
            return new DivInput(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList, expression4, resolveOptionalList2, u1Var, resolveOptionalExpression5, resolveOptionalList3, resolveOptionalList4, expression6, resolveOptionalList5, resolveOptionalList6, jlnVar, resolveOptionalExpression7, expression7, expression9, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, resolveOptionalList7, v9Var2, resolveOptionalExpression13, expression11, resolveOptionalExpression15, str, expression13, expression15, vmnVar, expression17, resolveOptionalExpression19, y3Var, s5Var, resolveOptionalExpression20, resolveOptionalExpression21, aVar, y3Var2, resolveOptionalExpression22, resolveOptionalExpression23, expression19, resolveOptionalList8, expression21, expression23, expression25, str2, resolveOptionalList9, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList10, resolveOptionalList11, resolveOptionalList12, resolveOptionalList13, expression26, zdVar, resolveOptionalList14, v9Var3);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        a = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivInput.Autocapitalization autocapitalization = DivInput.Autocapitalization.AUTO;
        b = Expression.Companion.constant$default(companion, autocapitalization, null, 2, null);
        DivInput.EnterKeyType enterKeyType = DivInput.EnterKeyType.DEFAULT;
        c = Expression.Companion.constant$default(companion, enterKeyType, null, 2, null);
        d = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        e = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f = new v9.c(new krn(null, null, null));
        g = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        h = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivInput.KeyboardType keyboardType = DivInput.KeyboardType.MULTI_LINE_TEXT;
        i = Expression.Companion.constant$default(companion, keyboardType, null, 2, null);
        j = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        k = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        l = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        m = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        n = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        o = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        p = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        q = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        r = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        s = companion2.from(autocapitalization, c.i);
        t = companion2.from(enterKeyType, d.i);
        u = companion2.from(divSizeUnit, e.i);
        v = companion2.from(rl3.L(DivFontWeight.values()), f.i);
        w = companion2.from(keyboardType, g.i);
        x = companion2.from(divAlignmentHorizontal, h.i);
        y = companion2.from(divAlignmentVertical, i.i);
        z = companion2.from(divVisibility, j.i);
        A = new ur(15);
        B = new vr(12);
        C = new wr(15);
        D = new xr(15);
        E = new io.reactivex.rxjava3.processors.b(12);
        F = new io.reactivex.rxjava3.subjects.b(14);
        G = new io.reactivex.rxjava3.subjects.c(14);
        H = new as(14);
        I = new p11(11);
    }
}

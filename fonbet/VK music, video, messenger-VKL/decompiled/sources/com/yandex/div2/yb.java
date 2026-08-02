package com.yandex.div2;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import com.yandex.div2.DivText;
import com.yandex.div2.v9;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.at;
import xsna.bpn0;
import xsna.bt;
import xsna.ct;
import xsna.dt;
import xsna.et;
import xsna.izs;
import xsna.jln;
import xsna.krn;
import xsna.rl3;
import xsna.t11;
import xsna.u11;
import xsna.v11;
import xsna.vmn;
import xsna.w11;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes8.dex */
public final class yb {

    @Deprecated
    public static final TypeHelper<DivVisibility> A;

    @Deprecated
    public static final t11 B;

    @Deprecated
    public static final u11 C;

    @Deprecated
    public static final v11 D;

    @Deprecated
    public static final w11 E;

    @Deprecated
    public static final at F;

    @Deprecated
    public static final bt G;

    @Deprecated
    public static final ct H;

    @Deprecated
    public static final dt I;

    @Deprecated
    public static final et J;

    @Deprecated
    public static final DivAnimation a;

    @Deprecated
    public static final Expression<Double> b;

    @Deprecated
    public static final Expression<Boolean> c;

    @Deprecated
    public static final Expression<Long> d;

    @Deprecated
    public static final Expression<DivSizeUnit> e;

    @Deprecated
    public static final v9.c f;

    @Deprecated
    public static final Expression<Double> g;

    @Deprecated
    public static final Expression<Boolean> h;

    @Deprecated
    public static final Expression<DivLineStyle> i;

    @Deprecated
    public static final Expression<DivAlignmentHorizontal> j;

    @Deprecated
    public static final Expression<DivAlignmentVertical> k;

    @Deprecated
    public static final Expression<Integer> l;

    @Deprecated
    public static final Expression<Boolean> m;

    @Deprecated
    public static final Expression<DivText.Truncate> n;

    @Deprecated
    public static final Expression<DivLineStyle> o;

    @Deprecated
    public static final Expression<DivVisibility> p;

    @Deprecated
    public static final v9.b q;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> r;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> s;

    @Deprecated
    public static final TypeHelper<DivSizeUnit> t;

    @Deprecated
    public static final TypeHelper<DivFontWeight> u;

    @Deprecated
    public static final TypeHelper<DivLineStyle> v;

    @Deprecated
    public static final TypeHelper<DivAlignmentHorizontal> w;

    @Deprecated
    public static final TypeHelper<DivAlignmentVertical> x;

    @Deprecated
    public static final TypeHelper<DivText.Truncate> y;

    @Deprecated
    public static final TypeHelper<DivLineStyle> z;

    /* compiled from: DivTextJsonParser.kt */
    public static final class a extends Lambda implements izs<Object, Boolean> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class b extends Lambda implements izs<Object, Boolean> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class c extends Lambda implements izs<Object, Boolean> {
        public static final c i = new c(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivSizeUnit);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class d extends Lambda implements izs<Object, Boolean> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivFontWeight);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class e extends Lambda implements izs<Object, Boolean> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivLineStyle);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class f extends Lambda implements izs<Object, Boolean> {
        public static final f i = new f(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class g extends Lambda implements izs<Object, Boolean> {
        public static final g i = new g(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivAlignmentVertical);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class h extends Lambda implements izs<Object, Boolean> {
        public static final h i = new h(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivText.Truncate);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class i extends Lambda implements izs<Object, Boolean> {
        public static final i i = new i(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivLineStyle);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class j extends Lambda implements izs<Object, Boolean> {
        public static final j i = new j(1);

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof DivVisibility);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class k implements Serializer, Deserializer {
        public final fe a;

        public k(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivText deserialize(ParsingContext parsingContext, JSONObject jSONObject) throws ParsingException {
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
                divAnimation = yb.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", bpn0Var6);
            TypeHelper<DivAlignmentHorizontal> typeHelper = yb.r;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = yb.s;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            t11 t11Var = yb.B;
            Expression<Double> expression = yb.b;
            Expression<Double> readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, izsVar3, t11Var, expression);
            Expression<Double> expression2 = readOptionalExpression3 == null ? expression : readOptionalExpression3;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", feVar.t1);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, izsVar4);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, L2.g, feVar.F1);
            u1 u1Var = (u1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", feVar.L1);
            Expression<Boolean> expression3 = yb.c;
            Expression<Boolean> readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression3);
            Expression<Boolean> expression4 = readOptionalExpression5 == null ? expression3 : readOptionalExpression5;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, izsVar5, yb.C);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", feVar.P2);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", bpn0Var6);
            DivText.a aVar = (DivText.a) JsonPropertyParser.readOptional(parsingContext, jSONObject, "ellipsis", feVar.G8);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", feVar.b3);
            jln jlnVar = (jln) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", feVar.z3);
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, izsVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
            v11 v11Var = yb.D;
            Expression<Long> expression5 = yb.d;
            Expression<Long> readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size", typeHelper5, izsVar5, v11Var, expression5);
            if (readOptionalExpression10 != null) {
                expression5 = readOptionalExpression10;
            }
            TypeHelper<DivSizeUnit> typeHelper8 = yb.t;
            izs<String, DivSizeUnit> izsVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression6 = yb.e;
            Expression<DivSizeUnit> readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, izsVar7, expression6);
            Expression<DivSizeUnit> expression7 = readOptionalExpression11 == null ? expression6 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", yb.u, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, izsVar5, yb.E);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", feVar.I3);
            v9 v9Var = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", bpn0Var5);
            if (v9Var == null) {
                v9Var = yb.f;
            }
            v9 v9Var2 = v9Var;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", bpn0Var6);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", bpn0Var6);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", feVar.A8);
            vmn vmnVar = (vmn) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", feVar.M4);
            Expression<Double> expression8 = yb.g;
            Expression<Double> readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, izsVar3, expression8);
            Expression<Double> expression9 = readOptionalExpression15 == null ? expression8 : readOptionalExpression15;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, izsVar5, yb.F);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", bpn0Var6);
            y3 y3Var = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", bpn0Var4);
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, izsVar5, yb.G);
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, izsVar5, yb.H);
            y3 y3Var2 = (y3) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", bpn0Var4);
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", bpn0Var6);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", bpn0Var6);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", feVar.x8);
            Expression readOptionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression readOptionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, izsVar5, yb.I);
            Expression<Boolean> expression10 = yb.h;
            Expression<Boolean> readOptionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = readOptionalExpression21 == null ? expression10 : readOptionalExpression21;
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", bpn0Var6);
            TypeHelper<DivLineStyle> typeHelper9 = yb.v;
            izs<String, DivLineStyle> izsVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression12 = yb.i;
            Expression<DivLineStyle> readOptionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper9, izsVar8, expression12);
            Expression<DivLineStyle> expression13 = readOptionalExpression22 == null ? expression12 : readOptionalExpression22;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = yb.w;
            Expression<DivAlignmentHorizontal> expression14 = yb.j;
            Expression<DivAlignmentHorizontal> readOptionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper10, izsVar, expression14);
            Expression<DivAlignmentHorizontal> expression15 = readOptionalExpression23 == null ? expression14 : readOptionalExpression23;
            TypeHelper<DivAlignmentVertical> typeHelper11 = yb.x;
            Expression<DivAlignmentVertical> expression16 = yb.k;
            Expression<DivAlignmentVertical> readOptionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper11, izsVar2, expression16);
            Expression<DivAlignmentVertical> expression17 = readOptionalExpression24 == null ? expression16 : readOptionalExpression24;
            Expression<Integer> expression18 = yb.l;
            Expression<Integer> readOptionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, izsVar6, expression18);
            Expression<Integer> expression19 = readOptionalExpression25 == null ? expression18 : readOptionalExpression25;
            rb rbVar = (rb) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_gradient", feVar.a8);
            n9 n9Var = (n9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", feVar.M6);
            Expression<Boolean> expression20 = yb.m;
            Expression<Boolean> readOptionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, izsVar4, expression20);
            Expression<Boolean> expression21 = readOptionalExpression26 == null ? expression20 : readOptionalExpression26;
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", feVar.V8);
            hd hdVar = (hd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", feVar.Y8);
            d2 d2Var = (d2) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", feVar.U1);
            e1 e1Var = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", bpn0Var3);
            e1 e1Var2 = (e1) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", bpn0Var3);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, yb.J);
            TypeHelper<DivText.Truncate> typeHelper12 = yb.y;
            izs<String, DivText.Truncate> izsVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression22 = yb.n;
            Expression<DivText.Truncate> readOptionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", typeHelper12, izsVar9, expression22);
            Expression<DivText.Truncate> expression23 = readOptionalExpression27 == null ? expression22 : readOptionalExpression27;
            TypeHelper<DivLineStyle> typeHelper13 = yb.z;
            Expression<DivLineStyle> expression24 = yb.o;
            Expression<DivLineStyle> readOptionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, TtmlNode.UNDERLINE, typeHelper13, izsVar8, expression24);
            Expression<DivLineStyle> expression25 = readOptionalExpression28 == null ? expression24 : readOptionalExpression28;
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", feVar.b9);
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", feVar.h9);
            TypeHelper<DivVisibility> typeHelper14 = yb.A;
            izs<String, DivVisibility> izsVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression26 = yb.p;
            Expression<DivVisibility> readOptionalExpression29 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility", typeHelper14, izsVar10, expression26);
            if (readOptionalExpression29 != null) {
                expression26 = readOptionalExpression29;
            }
            zd zdVar = (zd) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", bpn0Var2);
            List readOptionalList20 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", bpn0Var2);
            v9 v9Var3 = (v9) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", bpn0Var5);
            if (v9Var3 == null) {
                v9Var3 = yb.q;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression2, readOptionalList2, readOptionalExpression4, readOptionalList3, u1Var, expression4, readOptionalExpression6, readOptionalList4, readOptionalList5, aVar, readOptionalList6, jlnVar, readOptionalExpression7, readOptionalExpression8, readOptionalExpression9, expression5, expression7, readOptionalExpression12, readOptionalExpression13, readOptionalExpression14, readOptionalList7, v9Var2, readOptionalList8, readOptionalList9, str, readOptionalList10, vmnVar, expression9, readOptionalExpression16, readOptionalList11, y3Var, readOptionalExpression17, readOptionalExpression18, y3Var2, readOptionalList12, readOptionalList13, readOptionalList14, readOptionalExpression19, readOptionalExpression20, expression11, readOptionalList15, expression13, readExpression, expression15, expression17, expression19, rbVar, n9Var, expression21, readOptionalList16, hdVar, d2Var, e1Var, e1Var2, readOptionalList17, expression23, expression25, readOptionalList18, readOptionalList19, expression26, zdVar, readOptionalList20, v9Var3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, DivText divText) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            DivAccessibility divAccessibility = divText.a;
            fe feVar = this.a;
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divAccessibility, feVar.H);
            DivAction divAction = divText.b;
            bpn0 bpn0Var = feVar.k1;
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divAction, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divText.c, feVar.q1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divText.d, bpn0Var);
            Expression<DivAlignmentHorizontal> expression = divText.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", expression, izsVar);
            Expression<DivAlignmentVertical> expression2 = divText.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", expression2, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divText.g);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divText.h, feVar.t1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "auto_ellipsize", divText.i);
            JsonPropertyParser.writeList(parsingContext, jSONObject, L2.g, divText.j, feVar.F1);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divText.k, feVar.L1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divText.l);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divText.m);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divText.n, feVar.P2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divText.o, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "ellipsis", divText.p, feVar.G8);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divText.q, feVar.b3);
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divText.r, feVar.z3);
            Expression<Integer> expression3 = divText.s;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "focused_text_color", expression3, izsVar3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divText.t);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", divText.u);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size", divText.v);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divText.w, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", divText.x);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", divText.y, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divText.z);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divText.A, feVar.I3);
            v9 v9Var = divText.B;
            bpn0 bpn0Var2 = feVar.Y6;
            JsonPropertyParser.write(parsingContext, jSONObject, "height", v9Var, bpn0Var2);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divText.C, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divText.D, bpn0Var);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divText.E);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "images", divText.F, feVar.A8);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divText.G, feVar.M4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divText.H);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divText.I);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divText.J, bpn0Var);
            y3 y3Var = divText.K;
            bpn0 bpn0Var3 = feVar.Y2;
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", y3Var, bpn0Var3);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_lines", divText.L);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_hidden_lines", divText.M);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divText.N, bpn0Var3);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divText.O, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divText.P, bpn0Var);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divText.Q, feVar.x8);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divText.R);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divText.S);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selectable", divText.T);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divText.U, bpn0Var);
            Expression<DivLineStyle> expression4 = divText.V;
            izs<DivLineStyle, String> izsVar4 = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression4, izsVar4);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", divText.W);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divText.X, izsVar);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divText.Y, izsVar2);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divText.Z, izsVar3);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_gradient", divText.a0, feVar.a8);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", divText.b0, feVar.M6);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tighten_width", divText.c0);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divText.d0, feVar.V8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divText.e0, feVar.Y8);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divText.f0, feVar.U1);
            e1 e1Var = divText.g0;
            bpn0 bpn0Var4 = feVar.z1;
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", e1Var, bpn0Var4);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divText.h0, bpn0Var4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divText.i0, DivTransitionTrigger.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "truncate", divText.j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, TtmlNode.UNDERLINE, divText.k0, izsVar4);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divText.l0, feVar.b9);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divText.m0, feVar.h9);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility", divText.n0, DivVisibility.TO_STRING);
            zd zdVar = divText.o0;
            bpn0 bpn0Var5 = feVar.t9;
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", zdVar, bpn0Var5);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divText.p0, bpn0Var5);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divText.q0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class l implements Serializer, TemplateDeserializer {
        public final fe a;

        public l(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wc deserialize(ParsingContext parsingContext, wc wcVar, JSONObject jSONObject) throws ParsingException {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field<com.yandex.div2.f> field = wcVar != null ? wcVar.a : null;
            fe feVar = this.a;
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, field, feVar.I);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, wcVar != null ? wcVar.b : null, feVar.l1);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, wcVar != null ? wcVar.c : null, feVar.r1);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, wcVar != null ? wcVar.d : null, feVar.l1);
            TypeHelper<DivAlignmentHorizontal> typeHelper = yb.r;
            Field<Expression<DivAlignmentHorizontal>> field2 = wcVar != null ? wcVar.e : null;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field2, izsVar);
            TypeHelper<DivAlignmentVertical> typeHelper2 = yb.s;
            Field<Expression<DivAlignmentVertical>> field3 = wcVar != null ? wcVar.f : null;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field3, izsVar2);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field<Expression<Double>> field4 = wcVar != null ? wcVar.g : null;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field4, izsVar3, yb.B);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, wcVar != null ? wcVar.h : null, feVar.u1);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field<Expression<Boolean>> field5 = wcVar != null ? wcVar.i : null;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field5, izsVar4);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, L2.g, allowPropertyOverride, wcVar != null ? wcVar.j : null, feVar.G1);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, wcVar != null ? wcVar.k : null, feVar.M1);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, wcVar != null ? wcVar.l : null, izsVar4);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Field<Expression<Long>> field6 = wcVar != null ? wcVar.m : null;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field6, izsVar5, yb.C);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, wcVar != null ? wcVar.n : null, feVar.Q2);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, wcVar != null ? wcVar.o : null, feVar.l1);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, wcVar != null ? wcVar.p : null, feVar.H8);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, wcVar != null ? wcVar.q : null, feVar.c3);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, wcVar != null ? wcVar.r : null, feVar.A3);
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field<Expression<Integer>> field7 = wcVar != null ? wcVar.s : null;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field7, izsVar6);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, wcVar != null ? wcVar.t : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, wcVar != null ? wcVar.u : null);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.v : null, izsVar5, yb.D);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", yb.t, allowPropertyOverride, wcVar != null ? wcVar.w : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, wcVar != null ? wcVar.x : null);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", yb.u, allowPropertyOverride, wcVar != null ? wcVar.y : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.z : null, izsVar5, yb.E);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, wcVar != null ? wcVar.A : null, feVar.J3);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, wcVar != null ? wcVar.B : null, feVar.Z6);
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, wcVar != null ? wcVar.C : null, feVar.l1);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, wcVar != null ? wcVar.D : null, feVar.l1);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, wcVar != null ? wcVar.E : null);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "images", allowPropertyOverride, wcVar != null ? wcVar.F : null, feVar.B8);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, wcVar != null ? wcVar.G : null, feVar.N4);
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, wcVar != null ? wcVar.H : null, izsVar3);
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.I : null, izsVar5, yb.F);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, wcVar != null ? wcVar.J : null, feVar.l1);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, wcVar != null ? wcVar.K : null, feVar.Z2);
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.L : null, izsVar5, yb.G);
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.M : null, izsVar5, yb.H);
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, wcVar != null ? wcVar.N : null, feVar.Z2);
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, wcVar != null ? wcVar.O : null, feVar.l1);
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, wcVar != null ? wcVar.P : null, feVar.l1);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, wcVar != null ? wcVar.Q : null, feVar.y8);
            Field readOptionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, wcVar != null ? wcVar.R : null);
            Field readOptionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, wcVar != null ? wcVar.S : null, izsVar5, yb.I);
            Field readOptionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, wcVar != null ? wcVar.T : null, izsVar4);
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, wcVar != null ? wcVar.U : null, feVar.l1);
            TypeHelper<DivLineStyle> typeHelper8 = yb.v;
            Field<Expression<DivLineStyle>> field8 = wcVar != null ? wcVar.V : null;
            izs<String, DivLineStyle> izsVar7 = DivLineStyle.FROM_STRING;
            return new wc(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField4, readOptionalListField5, readOptionalField5, readOptionalListField6, readOptionalField6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalListField10, readOptionalField9, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField11, readOptionalField10, readOptionalFieldWithExpression17, readOptionalFieldWithExpression18, readOptionalField11, readOptionalListField12, readOptionalListField13, readOptionalListField14, readOptionalFieldWithExpression19, readOptionalFieldWithExpression20, readOptionalFieldWithExpression21, readOptionalListField15, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field8, izsVar7), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, wcVar != null ? wcVar.W : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_horizontal", yb.w, allowPropertyOverride, wcVar != null ? wcVar.X : null, izsVar), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_vertical", yb.x, allowPropertyOverride, wcVar != null ? wcVar.Y : null, izsVar2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, wcVar != null ? wcVar.Z : null, izsVar6), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, wcVar != null ? wcVar.a0 : null, feVar.b8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, wcVar != null ? wcVar.b0 : null, feVar.N6), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, wcVar != null ? wcVar.c0 : null, izsVar4), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, wcVar != null ? wcVar.d0 : null, feVar.W8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, wcVar != null ? wcVar.e0 : null, feVar.Z8), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, wcVar != null ? wcVar.f0 : null, feVar.V1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, wcVar != null ? wcVar.g0 : null, feVar.A1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, wcVar != null ? wcVar.h0 : null, feVar.A1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, wcVar != null ? wcVar.i0 : null, DivTransitionTrigger.FROM_STRING, yb.J), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "truncate", yb.y, allowPropertyOverride, wcVar != null ? wcVar.j0 : null, DivText.Truncate.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, TtmlNode.UNDERLINE, yb.z, allowPropertyOverride, wcVar != null ? wcVar.k0 : null, izsVar7), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, wcVar != null ? wcVar.l0 : null, feVar.c9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, wcVar != null ? wcVar.m0 : null, feVar.i9), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility", yb.A, allowPropertyOverride, wcVar != null ? wcVar.n0 : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, wcVar != null ? wcVar.o0 : null, feVar.u9), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, wcVar != null ? wcVar.p0 : null, feVar.u9), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, wcVar != null ? wcVar.q0 : null, feVar.Z6));
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JSONObject serialize(ParsingContext parsingContext, wc wcVar) throws ParsingException {
            JSONObject jSONObject = new JSONObject();
            Field<com.yandex.div2.f> field = wcVar.a;
            fe feVar = this.a;
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", field, feVar.I);
            Field<h0> field2 = wcVar.b;
            bpn0 bpn0Var = feVar.l1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", field2, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", wcVar.c, feVar.r1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", wcVar.d, bpn0Var);
            Field<Expression<DivAlignmentHorizontal>> field3 = wcVar.e;
            izs<DivAlignmentHorizontal, String> izsVar = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field3, izsVar);
            Field<Expression<DivAlignmentVertical>> field4 = wcVar.f;
            izs<DivAlignmentVertical, String> izsVar2 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field4, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", wcVar.g);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", wcVar.h, feVar.u1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "auto_ellipsize", wcVar.i);
            JsonFieldParser.writeListField(parsingContext, jSONObject, L2.g, wcVar.j, feVar.G1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", wcVar.k, feVar.M1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", wcVar.l);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", wcVar.m);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", wcVar.n, feVar.Q2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", wcVar.o, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "ellipsis", wcVar.p, feVar.H8);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", wcVar.q, feVar.c3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", wcVar.r, feVar.A3);
            Field<Expression<Integer>> field5 = wcVar.s;
            izs<Integer, String> izsVar3 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "focused_text_color", field5, izsVar3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", wcVar.t);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", wcVar.u);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size", wcVar.v);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", wcVar.w, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", wcVar.x);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", wcVar.y, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", wcVar.z);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", wcVar.A, feVar.J3);
            Field<z9> field6 = wcVar.B;
            bpn0 bpn0Var2 = feVar.Z6;
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", field6, bpn0Var2);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", wcVar.C, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", wcVar.D, bpn0Var);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", wcVar.E);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "images", wcVar.F, feVar.B8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", wcVar.G, feVar.N4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", wcVar.H);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", wcVar.I);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", wcVar.J, bpn0Var);
            Field<a4> field7 = wcVar.K;
            bpn0 bpn0Var3 = feVar.Z2;
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", field7, bpn0Var3);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_lines", wcVar.L);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_hidden_lines", wcVar.M);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", wcVar.N, bpn0Var3);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", wcVar.O, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", wcVar.P, bpn0Var);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", wcVar.Q, feVar.y8);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", wcVar.R);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", wcVar.S);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selectable", wcVar.T);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", wcVar.U, bpn0Var);
            Field<Expression<DivLineStyle>> field8 = wcVar.V;
            izs<DivLineStyle, String> izsVar4 = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field8, izsVar4);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", wcVar.W);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", wcVar.X, izsVar);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", wcVar.Y, izsVar2);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", wcVar.Z, izsVar3);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_gradient", wcVar.a0, feVar.b8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", wcVar.b0, feVar.N6);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tighten_width", wcVar.c0);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", wcVar.d0, feVar.W8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", wcVar.e0, feVar.Z8);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", wcVar.f0, feVar.V1);
            Field<i1> field9 = wcVar.g0;
            bpn0 bpn0Var4 = feVar.A1;
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", field9, bpn0Var4);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", wcVar.h0, bpn0Var4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", wcVar.i0, DivTransitionTrigger.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "truncate", wcVar.j0, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, TtmlNode.UNDERLINE, wcVar.k0, izsVar4);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", wcVar.l0, feVar.c9);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", wcVar.m0, feVar.i9);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility", wcVar.n0, DivVisibility.TO_STRING);
            Field<be> field10 = wcVar.o0;
            bpn0 bpn0Var5 = feVar.u9;
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", field10, bpn0Var5);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", wcVar.p0, bpn0Var5);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", wcVar.q0, bpn0Var2);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class m implements TemplateResolver<JSONObject, wc, DivText> {
        public final fe a;

        public m(fe feVar) {
            this.a = feVar;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DivText resolve(ParsingContext parsingContext, wc wcVar, JSONObject jSONObject) throws ParsingException {
            Field<com.yandex.div2.f> field = wcVar.a;
            fe feVar = this.a;
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, field, jSONObject, "accessibility", feVar.J, feVar.H);
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, wcVar.b, jSONObject, "action", feVar.m1, feVar.k1);
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, wcVar.c, jSONObject, "action_animation", feVar.s1, feVar.q1);
            if (divAnimation == null) {
                divAnimation = yb.a;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.d, jSONObject, "actions", feVar.m1, feVar.k1);
            Field<Expression<DivAlignmentHorizontal>> field2 = wcVar.e;
            TypeHelper<DivAlignmentHorizontal> typeHelper = yb.r;
            izs<String, DivAlignmentHorizontal> izsVar = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_horizontal", typeHelper, izsVar);
            Field<Expression<DivAlignmentVertical>> field3 = wcVar.f;
            TypeHelper<DivAlignmentVertical> typeHelper2 = yb.s;
            izs<String, DivAlignmentVertical> izsVar2 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alignment_vertical", typeHelper2, izsVar2);
            Field<Expression<Double>> field4 = wcVar.g;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            izs<Number, Double> izsVar3 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            t11 t11Var = yb.B;
            Expression<Double> expression = yb.b;
            Expression<Double> resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "alpha", typeHelper3, izsVar3, t11Var, expression);
            Expression<Double> expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.h, jSONObject, "animators", feVar.v1, feVar.t1);
            Field<Expression<Boolean>> field5 = wcVar.i;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            izs<Object, Boolean> izsVar4 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "auto_ellipsize", typeHelper4, izsVar4);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.j, jSONObject, L2.g, feVar.H1, feVar.F1);
            u1 u1Var = (u1) JsonFieldResolver.resolveOptional(parsingContext, wcVar.k, jSONObject, "border", feVar.N1, feVar.L1);
            Field<Expression<Boolean>> field6 = wcVar.l;
            Expression<Boolean> expression3 = yb.c;
            Expression<Boolean> resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "capture_focus_on_action", typeHelper4, izsVar4, expression3);
            Expression<Boolean> expression4 = resolveOptionalExpression5 == null ? expression3 : resolveOptionalExpression5;
            Field<Expression<Long>> field7 = wcVar.m;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            izs<Number, Long> izsVar5 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "column_span", typeHelper5, izsVar5, yb.C);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.n, jSONObject, "disappear_actions", feVar.R2, feVar.P2);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.o, jSONObject, "doubletap_actions", feVar.m1, feVar.k1);
            DivText.a aVar = (DivText.a) JsonFieldResolver.resolveOptional(parsingContext, wcVar.p, jSONObject, "ellipsis", feVar.I8, feVar.G8);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.q, jSONObject, "extensions", feVar.d3, feVar.b3);
            jln jlnVar = (jln) JsonFieldResolver.resolveOptional(parsingContext, wcVar.r, jSONObject, "focus", feVar.B3, feVar.z3);
            Field<Expression<Integer>> field8 = wcVar.s;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            izs<Object, Integer> izsVar6 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "focused_text_color", typeHelper6, izsVar6);
            Field<Expression<String>> field9 = wcVar.t;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_family", typeHelper7);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.u, jSONObject, "font_feature_settings", typeHelper7);
            Field<Expression<Long>> field10 = wcVar.v;
            v11 v11Var = yb.D;
            Expression<Long> expression5 = yb.d;
            Expression<Long> resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size", typeHelper5, izsVar5, v11Var, expression5);
            if (resolveOptionalExpression10 != null) {
                expression5 = resolveOptionalExpression10;
            }
            Field<Expression<DivSizeUnit>> field11 = wcVar.w;
            TypeHelper<DivSizeUnit> typeHelper8 = yb.t;
            izs<String, DivSizeUnit> izsVar7 = DivSizeUnit.FROM_STRING;
            Expression<DivSizeUnit> expression6 = yb.e;
            Expression<DivSizeUnit> resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "font_size_unit", typeHelper8, izsVar7, expression6);
            Expression<DivSizeUnit> expression7 = resolveOptionalExpression11 == null ? expression6 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.x, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.y, jSONObject, "font_weight", yb.u, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.z, jSONObject, "font_weight_value", typeHelper5, izsVar5, yb.E);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.A, jSONObject, "functions", feVar.K3, feVar.I3);
            v9 v9Var = (v9) JsonFieldResolver.resolveOptional(parsingContext, wcVar.B, jSONObject, "height", feVar.a7, feVar.Y6);
            if (v9Var == null) {
                v9Var = yb.f;
            }
            v9 v9Var2 = v9Var;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.C, jSONObject, "hover_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.D, jSONObject, "hover_start_actions", feVar.m1, feVar.k1);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, wcVar.E, jSONObject, "id");
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.F, jSONObject, "images", feVar.C8, feVar.A8);
            vmn vmnVar = (vmn) JsonFieldResolver.resolveOptional(parsingContext, wcVar.G, jSONObject, "layout_provider", feVar.O4, feVar.M4);
            Field<Expression<Double>> field12 = wcVar.H;
            Expression<Double> expression8 = yb.g;
            Expression<Double> resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "letter_spacing", typeHelper3, izsVar3, expression8);
            Expression<Double> expression9 = resolveOptionalExpression15 == null ? expression8 : resolveOptionalExpression15;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.I, jSONObject, "line_height", typeHelper5, izsVar5, yb.F);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.J, jSONObject, "longtap_actions", feVar.m1, feVar.k1);
            y3 y3Var = (y3) JsonFieldResolver.resolveOptional(parsingContext, wcVar.K, jSONObject, "margins", feVar.a3, feVar.Y2);
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.L, jSONObject, "max_lines", typeHelper5, izsVar5, yb.G);
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.M, jSONObject, "min_hidden_lines", typeHelper5, izsVar5, yb.H);
            y3 y3Var2 = (y3) JsonFieldResolver.resolveOptional(parsingContext, wcVar.N, jSONObject, "paddings", feVar.a3, feVar.Y2);
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.O, jSONObject, "press_end_actions", feVar.m1, feVar.k1);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.P, jSONObject, "press_start_actions", feVar.m1, feVar.k1);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.Q, jSONObject, "ranges", feVar.z8, feVar.x8);
            Expression resolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.R, jSONObject, "reuse_id", typeHelper7);
            Expression resolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, wcVar.S, jSONObject, "row_span", typeHelper5, izsVar5, yb.I);
            Field<Expression<Boolean>> field13 = wcVar.T;
            Expression<Boolean> expression10 = yb.h;
            Expression<Boolean> resolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "selectable", typeHelper4, izsVar4, expression10);
            Expression<Boolean> expression11 = resolveOptionalExpression21 == null ? expression10 : resolveOptionalExpression21;
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.U, jSONObject, "selected_actions", feVar.m1, feVar.k1);
            Field<Expression<DivLineStyle>> field14 = wcVar.V;
            TypeHelper<DivLineStyle> typeHelper9 = yb.v;
            izs<String, DivLineStyle> izsVar8 = DivLineStyle.FROM_STRING;
            Expression<DivLineStyle> expression12 = yb.i;
            Expression<DivLineStyle> resolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "strike", typeHelper9, izsVar8, expression12);
            Expression<DivLineStyle> expression13 = resolveOptionalExpression22 == null ? expression12 : resolveOptionalExpression22;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, wcVar.W, jSONObject, "text", typeHelper7);
            Field<Expression<DivAlignmentHorizontal>> field15 = wcVar.X;
            TypeHelper<DivAlignmentHorizontal> typeHelper10 = yb.w;
            Expression<DivAlignmentHorizontal> expression14 = yb.j;
            Expression<DivAlignmentHorizontal> resolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "text_alignment_horizontal", typeHelper10, izsVar, expression14);
            Expression<DivAlignmentHorizontal> expression15 = resolveOptionalExpression23 == null ? expression14 : resolveOptionalExpression23;
            Field<Expression<DivAlignmentVertical>> field16 = wcVar.Y;
            TypeHelper<DivAlignmentVertical> typeHelper11 = yb.x;
            Expression<DivAlignmentVertical> expression16 = yb.k;
            Expression<DivAlignmentVertical> resolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_alignment_vertical", typeHelper11, izsVar2, expression16);
            Expression<DivAlignmentVertical> expression17 = resolveOptionalExpression24 == null ? expression16 : resolveOptionalExpression24;
            Field<Expression<Integer>> field17 = wcVar.Z;
            Expression<Integer> expression18 = yb.l;
            Expression<Integer> resolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_color", typeHelper6, izsVar6, expression18);
            Expression<Integer> expression19 = resolveOptionalExpression25 == null ? expression18 : resolveOptionalExpression25;
            rb rbVar = (rb) JsonFieldResolver.resolveOptional(parsingContext, wcVar.a0, jSONObject, "text_gradient", feVar.c8, feVar.a8);
            n9 n9Var = (n9) JsonFieldResolver.resolveOptional(parsingContext, wcVar.b0, jSONObject, "text_shadow", feVar.O6, feVar.M6);
            Field<Expression<Boolean>> field18 = wcVar.c0;
            Expression<Boolean> expression20 = yb.m;
            Expression<Boolean> resolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "tighten_width", typeHelper4, izsVar4, expression20);
            Expression<Boolean> expression21 = resolveOptionalExpression26 == null ? expression20 : resolveOptionalExpression26;
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.d0, jSONObject, "tooltips", feVar.X8, feVar.V8);
            hd hdVar = (hd) JsonFieldResolver.resolveOptional(parsingContext, wcVar.e0, jSONObject, "transform", feVar.a9, feVar.Y8);
            d2 d2Var = (d2) JsonFieldResolver.resolveOptional(parsingContext, wcVar.f0, jSONObject, "transition_change", feVar.W1, feVar.U1);
            e1 e1Var = (e1) JsonFieldResolver.resolveOptional(parsingContext, wcVar.g0, jSONObject, "transition_in", feVar.B1, feVar.z1);
            e1 e1Var2 = (e1) JsonFieldResolver.resolveOptional(parsingContext, wcVar.h0, jSONObject, "transition_out", feVar.B1, feVar.z1);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.i0, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, yb.J);
            Field<Expression<DivText.Truncate>> field19 = wcVar.j0;
            TypeHelper<DivText.Truncate> typeHelper12 = yb.y;
            izs<String, DivText.Truncate> izsVar9 = DivText.Truncate.FROM_STRING;
            Expression<DivText.Truncate> expression22 = yb.n;
            Expression<DivText.Truncate> resolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "truncate", typeHelper12, izsVar9, expression22);
            Expression<DivText.Truncate> expression23 = resolveOptionalExpression27 == null ? expression22 : resolveOptionalExpression27;
            Field<Expression<DivLineStyle>> field20 = wcVar.k0;
            TypeHelper<DivLineStyle> typeHelper13 = yb.z;
            Expression<DivLineStyle> expression24 = yb.o;
            Expression<DivLineStyle> resolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, TtmlNode.UNDERLINE, typeHelper13, izsVar8, expression24);
            Expression<DivLineStyle> expression25 = resolveOptionalExpression28 == null ? expression24 : resolveOptionalExpression28;
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.l0, jSONObject, "variable_triggers", feVar.d9, feVar.b9);
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.m0, jSONObject, "variables", feVar.j9, feVar.h9);
            Field<Expression<DivVisibility>> field21 = wcVar.n0;
            TypeHelper<DivVisibility> typeHelper14 = yb.A;
            izs<String, DivVisibility> izsVar10 = DivVisibility.FROM_STRING;
            Expression<DivVisibility> expression26 = yb.p;
            Expression<DivVisibility> resolveOptionalExpression29 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field21, jSONObject, "visibility", typeHelper14, izsVar10, expression26);
            if (resolveOptionalExpression29 != null) {
                expression26 = resolveOptionalExpression29;
            }
            zd zdVar = (zd) JsonFieldResolver.resolveOptional(parsingContext, wcVar.o0, jSONObject, "visibility_action", feVar.v9, feVar.t9);
            List resolveOptionalList20 = JsonFieldResolver.resolveOptionalList(parsingContext, wcVar.p0, jSONObject, "visibility_actions", feVar.v9, feVar.t9);
            v9 v9Var3 = (v9) JsonFieldResolver.resolveOptional(parsingContext, wcVar.q0, jSONObject, "width", feVar.a7, feVar.Y6);
            if (v9Var3 == null) {
                v9Var3 = yb.q;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, resolveOptionalExpression4, resolveOptionalList3, u1Var, expression4, resolveOptionalExpression6, resolveOptionalList4, resolveOptionalList5, aVar, resolveOptionalList6, jlnVar, resolveOptionalExpression7, resolveOptionalExpression8, resolveOptionalExpression9, expression5, expression7, resolveOptionalExpression12, resolveOptionalExpression13, resolveOptionalExpression14, resolveOptionalList7, v9Var2, resolveOptionalList8, resolveOptionalList9, str, resolveOptionalList10, vmnVar, expression9, resolveOptionalExpression16, resolveOptionalList11, y3Var, resolveOptionalExpression17, resolveOptionalExpression18, y3Var2, resolveOptionalList12, resolveOptionalList13, resolveOptionalList14, resolveOptionalExpression19, resolveOptionalExpression20, expression11, resolveOptionalList15, expression13, resolveExpression, expression15, expression17, expression19, rbVar, n9Var, expression21, resolveOptionalList16, hdVar, d2Var, e1Var, e1Var2, resolveOptionalList17, expression23, expression25, resolveOptionalList18, resolveOptionalList19, expression26, zdVar, resolveOptionalList20, v9Var3);
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
        d = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        e = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        f = new v9.c(new krn(null, null, null));
        g = Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Boolean bool = Boolean.FALSE;
        h = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        i = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        j = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        k = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        l = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        m = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivText.Truncate truncate = DivText.Truncate.END;
        n = Expression.Companion.constant$default(companion, truncate, null, 2, null);
        o = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        p = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        q = new v9.b(new w6(null, null, null));
        TypeHelper.Companion companion2 = TypeHelper.Companion;
        r = companion2.from(rl3.L(DivAlignmentHorizontal.values()), a.i);
        s = companion2.from(rl3.L(DivAlignmentVertical.values()), b.i);
        t = companion2.from(divSizeUnit, c.i);
        u = companion2.from(rl3.L(DivFontWeight.values()), d.i);
        v = companion2.from(divLineStyle, e.i);
        w = companion2.from(divAlignmentHorizontal, f.i);
        x = companion2.from(divAlignmentVertical, g.i);
        y = companion2.from(truncate, h.i);
        z = companion2.from(divLineStyle, i.i);
        A = companion2.from(divVisibility, j.i);
        B = new t11(15);
        C = new u11(19);
        D = new v11(13);
        E = new w11(14);
        F = new at(16);
        G = new bt(11);
        H = new ct(9);
        I = new dt(10);
        J = new et(13);
    }
}

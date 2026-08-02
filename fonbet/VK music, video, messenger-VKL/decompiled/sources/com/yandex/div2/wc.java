package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivText;
import com.yandex.div2.hc;
import com.yandex.div2.v9;
import com.yandex.div2.wb;
import com.yandex.div2.xb;
import com.yandex.div2.yb;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivTextTemplate.kt */
/* loaded from: classes8.dex */
public final class wc implements JSONSerializable, JsonTemplate<DivText> {
    public final Field<List<v4>> A;
    public final Field<z9> B;
    public final Field<List<h0>> C;
    public final Field<List<h0>> D;
    public final Field<String> E;
    public final Field<List<b>> F;
    public final Field<zmn> G;
    public final Field<Expression<Double>> H;
    public final Field<Expression<Long>> I;
    public final Field<List<h0>> J;
    public final Field<a4> K;
    public final Field<Expression<Long>> L;
    public final Field<Expression<Long>> M;
    public final Field<a4> N;
    public final Field<List<h0>> O;
    public final Field<List<h0>> P;
    public final Field<List<c>> Q;
    public final Field<Expression<String>> R;
    public final Field<Expression<Long>> S;
    public final Field<Expression<Boolean>> T;
    public final Field<List<h0>> U;
    public final Field<Expression<DivLineStyle>> V;
    public final Field<Expression<String>> W;
    public final Field<Expression<DivAlignmentHorizontal>> X;
    public final Field<Expression<DivAlignmentVertical>> Y;
    public final Field<Expression<Integer>> Z;
    public final Field<f> a;
    public final Field<vb> a0;
    public final Field<h0> b;
    public final Field<p9> b0;
    public final Field<v0> c;
    public final Field<Expression<Boolean>> c0;
    public final Field<List<h0>> d;
    public final Field<List<gd>> d0;
    public final Field<Expression<DivAlignmentHorizontal>> e;
    public final Field<jd> e0;
    public final Field<Expression<DivAlignmentVertical>> f;
    public final Field<h2> f0;
    public final Field<Expression<Double>> g;
    public final Field<i1> g0;
    public final Field<List<a1>> h;
    public final Field<i1> h0;
    public final Field<Expression<Boolean>> i;
    public final Field<List<DivTransitionTrigger>> i0;
    public final Field<List<q1>> j;
    public final Field<Expression<DivText.Truncate>> j0;
    public final Field<w1> k;
    public final Field<Expression<DivLineStyle>> k0;
    public final Field<Expression<Boolean>> l;
    public final Field<List<ld>> l0;
    public final Field<Expression<Long>> m;
    public final Field<List<qd>> m0;
    public final Field<List<x3>> n;
    public final Field<Expression<DivVisibility>> n0;
    public final Field<List<h0>> o;
    public final Field<be> o0;
    public final Field<a> p;
    public final Field<List<be>> p0;
    public final Field<List<dln>> q;
    public final Field<z9> q0;
    public final Field<qln> r;
    public final Field<Expression<Integer>> s;
    public final Field<Expression<String>> t;
    public final Field<Expression<String>> u;
    public final Field<Expression<Long>> v;
    public final Field<Expression<DivSizeUnit>> w;
    public final Field<Expression<JSONObject>> x;
    public final Field<Expression<DivFontWeight>> y;
    public final Field<Expression<Long>> z;

    /* compiled from: DivTextTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivText.a> {
        public final Field<List<h0>> a;
        public final Field<List<b>> b;
        public final Field<List<c>> c;
        public final Field<Expression<String>> d;

        public a(Field<List<h0>> field, Field<List<b>> field2, Field<List<c>> field3, Field<Expression<String>> field4) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((pb) BuiltInParserKt.getBuiltInParserComponent().H8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivTextTemplate.kt */
    public static final class b implements JSONSerializable, JsonTemplate<DivText.Image> {
        public final Field<a> a;
        public final Field<Expression<DivTextAlignmentVertical>> b;
        public final Field<s4> c;
        public final Field<Expression<DivText.Image.IndexingDirection>> d;
        public final Field<Expression<Boolean>> e;
        public final Field<Expression<Long>> f;
        public final Field<Expression<Integer>> g;
        public final Field<Expression<DivBlendMode>> h;
        public final Field<Expression<Uri>> i;
        public final Field<s4> j;

        /* compiled from: DivTextTemplate.kt */
        public static final class a implements JSONSerializable, JsonTemplate<DivText.Image.Accessibility> {
            public final Field<Expression<String>> a;
            public final Field<DivText.Image.Accessibility.Type> b;

            static {
                DivText.Image.Accessibility.Type.c cVar = DivText.Image.Accessibility.Type.Converter;
            }

            public a(Field<Expression<String>> field, Field<DivText.Image.Accessibility.Type> field2) {
                this.a = field;
                this.b = field2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public final JSONObject writeToJSON() {
                wb.b bVar = (wb.b) BuiltInParserKt.getBuiltInParserComponent().E8.getValue();
                ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
                bVar.getClass();
                JSONObject jSONObject = new JSONObject();
                JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "description", this.a);
                JsonFieldParser.writeField(builtInParsingContext, jSONObject, "type", this.b, DivText.Image.Accessibility.Type.TO_STRING);
                return jSONObject;
            }
        }

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            Expression.Companion.constant$default(companion, 20L, null, 2, null);
            Expression.Companion.constant$default(companion, DivText.Image.IndexingDirection.NORMAL, null, 2, null);
            Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            Expression.Companion.constant$default(companion, 20L, null, 2, null);
        }

        public b(Field<a> field, Field<Expression<DivTextAlignmentVertical>> field2, Field<s4> field3, Field<Expression<DivText.Image.IndexingDirection>> field4, Field<Expression<Boolean>> field5, Field<Expression<Long>> field6, Field<Expression<Integer>> field7, Field<Expression<DivBlendMode>> field8, Field<Expression<Uri>> field9, Field<s4> field10) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
            this.f = field6;
            this.g = field7;
            this.h = field8;
            this.i = field9;
            this.j = field10;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((xb.e) BuiltInParserKt.getBuiltInParserComponent().B8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivTextTemplate.kt */
    public static final class c implements JSONSerializable, JsonTemplate<DivText.b> {
        public final Field<List<h0>> a;
        public final Field<Expression<DivTextAlignmentVertical>> b;
        public final Field<dc> c;
        public final Field<Expression<Double>> d;
        public final Field<gc> e;
        public final Field<Expression<Long>> f;
        public final Field<Expression<String>> g;
        public final Field<Expression<String>> h;
        public final Field<Expression<Long>> i;
        public final Field<Expression<DivSizeUnit>> j;
        public final Field<Expression<JSONObject>> k;
        public final Field<Expression<DivFontWeight>> l;
        public final Field<Expression<Long>> m;
        public final Field<Expression<Double>> n;
        public final Field<Expression<Long>> o;
        public final Field<vc> p;
        public final Field<Expression<Long>> q;
        public final Field<Expression<DivLineStyle>> r;
        public final Field<Expression<Integer>> s;
        public final Field<p9> t;
        public final Field<Expression<Long>> u;
        public final Field<Expression<DivLineStyle>> v;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            Expression.Companion.constant$default(companion, 0L, null, 2, null);
        }

        public c(Field<List<h0>> field, Field<Expression<DivTextAlignmentVertical>> field2, Field<dc> field3, Field<Expression<Double>> field4, Field<gc> field5, Field<Expression<Long>> field6, Field<Expression<String>> field7, Field<Expression<String>> field8, Field<Expression<Long>> field9, Field<Expression<DivSizeUnit>> field10, Field<Expression<JSONObject>> field11, Field<Expression<DivFontWeight>> field12, Field<Expression<Long>> field13, Field<Expression<Double>> field14, Field<Expression<Long>> field15, Field<vc> field16, Field<Expression<Long>> field17, Field<Expression<DivLineStyle>> field18, Field<Expression<Integer>> field19, Field<p9> field20, Field<Expression<Long>> field21, Field<Expression<DivLineStyle>> field22) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
            this.f = field6;
            this.g = field7;
            this.h = field8;
            this.i = field9;
            this.j = field10;
            this.k = field11;
            this.l = field12;
            this.m = field13;
            this.n = field14;
            this.o = field15;
            this.p = field16;
            this.q = field17;
            this.r = field18;
            this.s = field19;
            this.t = field20;
            this.u = field21;
            this.v = field22;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((hc.g) BuiltInParserKt.getBuiltInParserComponent().y8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, DivText.Truncate.END, null, 2, null);
        Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public wc(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<Expression<Boolean>> field9, Field<List<q1>> field10, Field<w1> field11, Field<Expression<Boolean>> field12, Field<Expression<Long>> field13, Field<List<x3>> field14, Field<List<h0>> field15, Field<a> field16, Field<List<dln>> field17, Field<qln> field18, Field<Expression<Integer>> field19, Field<Expression<String>> field20, Field<Expression<String>> field21, Field<Expression<Long>> field22, Field<Expression<DivSizeUnit>> field23, Field<Expression<JSONObject>> field24, Field<Expression<DivFontWeight>> field25, Field<Expression<Long>> field26, Field<List<v4>> field27, Field<z9> field28, Field<List<h0>> field29, Field<List<h0>> field30, Field<String> field31, Field<List<b>> field32, Field<zmn> field33, Field<Expression<Double>> field34, Field<Expression<Long>> field35, Field<List<h0>> field36, Field<a4> field37, Field<Expression<Long>> field38, Field<Expression<Long>> field39, Field<a4> field40, Field<List<h0>> field41, Field<List<h0>> field42, Field<List<c>> field43, Field<Expression<String>> field44, Field<Expression<Long>> field45, Field<Expression<Boolean>> field46, Field<List<h0>> field47, Field<Expression<DivLineStyle>> field48, Field<Expression<String>> field49, Field<Expression<DivAlignmentHorizontal>> field50, Field<Expression<DivAlignmentVertical>> field51, Field<Expression<Integer>> field52, Field<vb> field53, Field<p9> field54, Field<Expression<Boolean>> field55, Field<List<gd>> field56, Field<jd> field57, Field<h2> field58, Field<i1> field59, Field<i1> field60, Field<List<DivTransitionTrigger>> field61, Field<Expression<DivText.Truncate>> field62, Field<Expression<DivLineStyle>> field63, Field<List<ld>> field64, Field<List<qd>> field65, Field<Expression<DivVisibility>> field66, Field<be> field67, Field<List<be>> field68, Field<z9> field69) {
        this.a = field;
        this.b = field2;
        this.c = field3;
        this.d = field4;
        this.e = field5;
        this.f = field6;
        this.g = field7;
        this.h = field8;
        this.i = field9;
        this.j = field10;
        this.k = field11;
        this.l = field12;
        this.m = field13;
        this.n = field14;
        this.o = field15;
        this.p = field16;
        this.q = field17;
        this.r = field18;
        this.s = field19;
        this.t = field20;
        this.u = field21;
        this.v = field22;
        this.w = field23;
        this.x = field24;
        this.y = field25;
        this.z = field26;
        this.A = field27;
        this.B = field28;
        this.C = field29;
        this.D = field30;
        this.E = field31;
        this.F = field32;
        this.G = field33;
        this.H = field34;
        this.I = field35;
        this.J = field36;
        this.K = field37;
        this.L = field38;
        this.M = field39;
        this.N = field40;
        this.O = field41;
        this.P = field42;
        this.Q = field43;
        this.R = field44;
        this.S = field45;
        this.T = field46;
        this.U = field47;
        this.V = field48;
        this.W = field49;
        this.X = field50;
        this.Y = field51;
        this.Z = field52;
        this.a0 = field53;
        this.b0 = field54;
        this.c0 = field55;
        this.d0 = field56;
        this.e0 = field57;
        this.f0 = field58;
        this.g0 = field59;
        this.h0 = field60;
        this.i0 = field61;
        this.j0 = field62;
        this.k0 = field63;
        this.l0 = field64;
        this.m0 = field65;
        this.n0 = field66;
        this.o0 = field67;
        this.p0 = field68;
        this.q0 = field69;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((yb.l) BuiltInParserKt.getBuiltInParserComponent().v8.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

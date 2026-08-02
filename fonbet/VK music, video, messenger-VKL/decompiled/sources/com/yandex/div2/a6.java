package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInput;
import com.yandex.div2.r5;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dln;
import xsna.krn;
import xsna.pmn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivInputTemplate.kt */
/* loaded from: classes8.dex */
public final class a6 implements JSONSerializable, JsonTemplate<DivInput> {
    public final Field<String> A;
    public final Field<Expression<Boolean>> B;
    public final Field<Expression<DivInput.KeyboardType>> C;
    public final Field<zmn> D;
    public final Field<Expression<Double>> E;
    public final Field<Expression<Long>> F;
    public final Field<a4> G;
    public final Field<w5> H;
    public final Field<Expression<Long>> I;
    public final Field<Expression<Long>> J;
    public final Field<a> K;
    public final Field<a4> L;
    public final Field<Expression<String>> M;
    public final Field<Expression<Long>> N;
    public final Field<Expression<Boolean>> O;
    public final Field<List<h0>> P;
    public final Field<Expression<DivAlignmentHorizontal>> Q;
    public final Field<Expression<DivAlignmentVertical>> R;
    public final Field<Expression<Integer>> S;
    public final Field<String> T;
    public final Field<List<gd>> U;
    public final Field<jd> V;
    public final Field<h2> W;
    public final Field<i1> X;
    public final Field<i1> Y;
    public final Field<List<DivTransitionTrigger>> Z;
    public final Field<f> a;
    public final Field<List<o6>> a0;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<List<ld>> b0;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<List<qd>> c0;
    public final Field<Expression<Double>> d;
    public final Field<Expression<DivVisibility>> d0;
    public final Field<List<a1>> e;
    public final Field<be> e0;
    public final Field<Expression<DivInput.Autocapitalization>> f;
    public final Field<List<be>> f0;
    public final Field<List<q1>> g;
    public final Field<z9> g0;
    public final Field<w1> h;
    public final Field<Expression<Long>> i;
    public final Field<List<x3>> j;
    public final Field<List<h0>> k;
    public final Field<Expression<DivInput.EnterKeyType>> l;
    public final Field<List<dln>> m;
    public final Field<List<pmn>> n;
    public final Field<qln> o;
    public final Field<Expression<String>> p;
    public final Field<Expression<Long>> q;
    public final Field<Expression<DivSizeUnit>> r;
    public final Field<Expression<JSONObject>> s;
    public final Field<Expression<DivFontWeight>> t;
    public final Field<Expression<Long>> u;
    public final Field<List<v4>> v;
    public final Field<z9> w;
    public final Field<Expression<Integer>> x;
    public final Field<Expression<Integer>> y;
    public final Field<Expression<String>> z;

    /* compiled from: DivInputTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivInput.a> {
        public final Field<Expression<Integer>> a;

        public a(Field<Expression<Integer>> field) {
            this.a = field;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            y5 y5Var = (y5) BuiltInParserKt.getBuiltInParserComponent().K4.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            y5Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivInput.Autocapitalization.AUTO, null, 2, null);
        Expression.Companion.constant$default(companion, DivInput.EnterKeyType.DEFAULT, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, DivInput.KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public a6(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<Expression<DivInput.Autocapitalization>> field6, Field<List<q1>> field7, Field<w1> field8, Field<Expression<Long>> field9, Field<List<x3>> field10, Field<List<h0>> field11, Field<Expression<DivInput.EnterKeyType>> field12, Field<List<dln>> field13, Field<List<pmn>> field14, Field<qln> field15, Field<Expression<String>> field16, Field<Expression<Long>> field17, Field<Expression<DivSizeUnit>> field18, Field<Expression<JSONObject>> field19, Field<Expression<DivFontWeight>> field20, Field<Expression<Long>> field21, Field<List<v4>> field22, Field<z9> field23, Field<Expression<Integer>> field24, Field<Expression<Integer>> field25, Field<Expression<String>> field26, Field<String> field27, Field<Expression<Boolean>> field28, Field<Expression<DivInput.KeyboardType>> field29, Field<zmn> field30, Field<Expression<Double>> field31, Field<Expression<Long>> field32, Field<a4> field33, Field<w5> field34, Field<Expression<Long>> field35, Field<Expression<Long>> field36, Field<a> field37, Field<a4> field38, Field<Expression<String>> field39, Field<Expression<Long>> field40, Field<Expression<Boolean>> field41, Field<List<h0>> field42, Field<Expression<DivAlignmentHorizontal>> field43, Field<Expression<DivAlignmentVertical>> field44, Field<Expression<Integer>> field45, Field<String> field46, Field<List<gd>> field47, Field<jd> field48, Field<h2> field49, Field<i1> field50, Field<i1> field51, Field<List<DivTransitionTrigger>> field52, Field<List<o6>> field53, Field<List<ld>> field54, Field<List<qd>> field55, Field<Expression<DivVisibility>> field56, Field<be> field57, Field<List<be>> field58, Field<z9> field59) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((r5.l) BuiltInParserKt.getBuiltInParserComponent().H4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

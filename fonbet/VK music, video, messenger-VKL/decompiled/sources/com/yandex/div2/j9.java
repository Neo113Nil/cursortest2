package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.e9;
import com.yandex.div2.f9;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivSelectTemplate.kt */
/* loaded from: classes8.dex */
public final class j9 implements JSONSerializable, JsonTemplate<e9> {
    public final Field<List<a>> A;
    public final Field<a4> B;
    public final Field<Expression<String>> C;
    public final Field<Expression<Long>> D;
    public final Field<List<h0>> E;
    public final Field<Expression<Integer>> F;
    public final Field<List<gd>> G;
    public final Field<jd> H;
    public final Field<h2> I;
    public final Field<i1> J;
    public final Field<i1> K;
    public final Field<List<DivTransitionTrigger>> L;
    public final Field<String> M;
    public final Field<List<ld>> N;
    public final Field<List<qd>> O;
    public final Field<Expression<DivVisibility>> P;
    public final Field<be> Q;
    public final Field<List<be>> R;
    public final Field<z9> S;
    public final Field<f> a;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<Expression<Double>> d;
    public final Field<List<a1>> e;
    public final Field<List<q1>> f;
    public final Field<w1> g;
    public final Field<Expression<Long>> h;
    public final Field<List<x3>> i;
    public final Field<List<dln>> j;
    public final Field<qln> k;
    public final Field<Expression<String>> l;
    public final Field<Expression<Long>> m;
    public final Field<Expression<DivSizeUnit>> n;
    public final Field<Expression<JSONObject>> o;
    public final Field<Expression<DivFontWeight>> p;
    public final Field<Expression<Long>> q;
    public final Field<List<v4>> r;
    public final Field<z9> s;
    public final Field<Expression<Integer>> t;
    public final Field<Expression<String>> u;
    public final Field<String> v;
    public final Field<zmn> w;
    public final Field<Expression<Double>> x;
    public final Field<Expression<Long>> y;
    public final Field<a4> z;

    /* compiled from: DivSelectTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<e9.a> {
        public final Field<Expression<String>> a;
        public final Field<Expression<String>> b;

        public a(Field<Expression<String>> field, Field<Expression<String>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            h9 h9Var = (h9) BuiltInParserKt.getBuiltInParserComponent().E6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            h9Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "text", this.a);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "value", this.b);
            return jSONObject;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
        Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public j9(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<List<x3>> field9, Field<List<dln>> field10, Field<qln> field11, Field<Expression<String>> field12, Field<Expression<Long>> field13, Field<Expression<DivSizeUnit>> field14, Field<Expression<JSONObject>> field15, Field<Expression<DivFontWeight>> field16, Field<Expression<Long>> field17, Field<List<v4>> field18, Field<z9> field19, Field<Expression<Integer>> field20, Field<Expression<String>> field21, Field<String> field22, Field<zmn> field23, Field<Expression<Double>> field24, Field<Expression<Long>> field25, Field<a4> field26, Field<List<a>> field27, Field<a4> field28, Field<Expression<String>> field29, Field<Expression<Long>> field30, Field<List<h0>> field31, Field<Expression<Integer>> field32, Field<List<gd>> field33, Field<jd> field34, Field<h2> field35, Field<i1> field36, Field<i1> field37, Field<List<DivTransitionTrigger>> field38, Field<String> field39, Field<List<ld>> field40, Field<List<qd>> field41, Field<Expression<DivVisibility>> field42, Field<be> field43, Field<List<be>> field44, Field<z9> field45) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((f9.g) BuiltInParserKt.getBuiltInParserComponent().B6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

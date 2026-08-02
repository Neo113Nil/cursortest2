package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.fa;
import com.yandex.div2.ga;
import com.yandex.div2.la;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dln;
import xsna.krn;
import xsna.non;
import xsna.qln;
import xsna.ykn;
import xsna.zmn;

/* compiled from: DivSliderTemplate.kt */
/* loaded from: classes8.dex */
public final class ka implements JSONSerializable, JsonTemplate<fa> {
    public final Field<b> A;
    public final Field<String> B;
    public final Field<ykn> C;
    public final Field<b> D;
    public final Field<String> E;
    public final Field<ykn> F;
    public final Field<ykn> G;
    public final Field<List<gd>> H;
    public final Field<ykn> I;
    public final Field<ykn> J;
    public final Field<jd> K;
    public final Field<h2> L;
    public final Field<i1> M;
    public final Field<i1> N;
    public final Field<List<DivTransitionTrigger>> O;
    public final Field<List<ld>> P;
    public final Field<List<qd>> Q;
    public final Field<Expression<DivVisibility>> R;
    public final Field<be> S;
    public final Field<List<be>> T;
    public final Field<z9> U;
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
    public final Field<List<v4>> l;
    public final Field<z9> m;
    public final Field<String> n;
    public final Field<Expression<Boolean>> o;
    public final Field<zmn> p;
    public final Field<a4> q;
    public final Field<Expression<Long>> r;
    public final Field<Expression<Long>> s;
    public final Field<a4> t;
    public final Field<List<a>> u;
    public final Field<Expression<String>> v;
    public final Field<Expression<Long>> w;
    public final Field<f> x;
    public final Field<List<h0>> y;
    public final Field<ykn> z;

    /* compiled from: DivSliderTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<fa.a> {
        public final Field<Expression<Long>> a;
        public final Field<a4> b;
        public final Field<Expression<Long>> c;
        public final Field<ykn> d;
        public final Field<ykn> e;

        public a(Field<Expression<Long>> field, Field<a4> field2, Field<Expression<Long>> field3, Field<ykn> field4, Field<ykn> field5) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((ia) BuiltInParserKt.getBuiltInParserComponent().l7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivSliderTemplate.kt */
    public static final class b implements JSONSerializable, JsonTemplate<fa.b> {
        public final Field<Expression<String>> a;
        public final Field<Expression<Long>> b;
        public final Field<Expression<DivSizeUnit>> c;
        public final Field<Expression<JSONObject>> d;
        public final Field<Expression<DivFontWeight>> e;
        public final Field<Expression<Long>> f;
        public final Field<Expression<Double>> g;
        public final Field<non> h;
        public final Field<Expression<Integer>> i;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
            Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        }

        public b(Field<Expression<String>> field, Field<Expression<Long>> field2, Field<Expression<DivSizeUnit>> field3, Field<Expression<JSONObject>> field4, Field<Expression<DivFontWeight>> field5, Field<Expression<Long>> field6, Field<Expression<Double>> field7, Field<non> field8, Field<Expression<Integer>> field9) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
            this.f = field6;
            this.g = field7;
            this.h = field8;
            this.i = field9;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((la.d) BuiltInParserKt.getBuiltInParserComponent().i7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public ka(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<List<x3>> field9, Field<List<dln>> field10, Field<qln> field11, Field<List<v4>> field12, Field<z9> field13, Field<String> field14, Field<Expression<Boolean>> field15, Field<zmn> field16, Field<a4> field17, Field<Expression<Long>> field18, Field<Expression<Long>> field19, Field<a4> field20, Field<List<a>> field21, Field<Expression<String>> field22, Field<Expression<Long>> field23, Field<f> field24, Field<List<h0>> field25, Field<ykn> field26, Field<b> field27, Field<String> field28, Field<ykn> field29, Field<b> field30, Field<String> field31, Field<ykn> field32, Field<ykn> field33, Field<List<gd>> field34, Field<ykn> field35, Field<ykn> field36, Field<jd> field37, Field<h2> field38, Field<i1> field39, Field<i1> field40, Field<List<DivTransitionTrigger>> field41, Field<List<ld>> field42, Field<List<qd>> field43, Field<Expression<DivVisibility>> field44, Field<be> field45, Field<List<be>> field46, Field<z9> field47) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((ga.e) BuiltInParserKt.getBuiltInParserComponent().f7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

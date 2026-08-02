package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.ma;
import com.yandex.div2.na;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivStateTemplate.kt */
/* loaded from: classes8.dex */
public final class ra implements JSONSerializable, JsonTemplate<ma> {
    public final Field<a4> A;
    public final Field<a4> B;
    public final Field<List<h0>> C;
    public final Field<List<h0>> D;
    public final Field<Expression<String>> E;
    public final Field<Expression<Long>> F;
    public final Field<List<h0>> G;
    public final Field<String> H;
    public final Field<List<a>> I;
    public final Field<List<gd>> J;
    public final Field<jd> K;
    public final Field<Expression<DivTransitionSelector>> L;
    public final Field<h2> M;
    public final Field<i1> N;
    public final Field<i1> O;
    public final Field<List<DivTransitionTrigger>> P;
    public final Field<List<ld>> Q;
    public final Field<List<qd>> R;
    public final Field<Expression<DivVisibility>> S;
    public final Field<be> T;
    public final Field<List<be>> U;
    public final Field<z9> V;
    public final Field<f> a;
    public final Field<h0> b;
    public final Field<v0> c;
    public final Field<List<h0>> d;
    public final Field<Expression<DivAlignmentHorizontal>> e;
    public final Field<Expression<DivAlignmentVertical>> f;
    public final Field<Expression<Double>> g;
    public final Field<List<a1>> h;
    public final Field<List<q1>> i;
    public final Field<w1> j;
    public final Field<Expression<Boolean>> k;
    public final Field<Expression<Boolean>> l;
    public final Field<Expression<Long>> m;
    public final Field<Expression<String>> n;
    public final Field<List<x3>> o;
    public final Field<String> p;
    public final Field<List<h0>> q;
    public final Field<List<dln>> r;
    public final Field<qln> s;
    public final Field<List<v4>> t;
    public final Field<z9> u;
    public final Field<List<h0>> v;
    public final Field<List<h0>> w;
    public final Field<String> x;
    public final Field<zmn> y;
    public final Field<List<h0>> z;

    /* compiled from: DivStateTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<ma.a> {
        public final Field<v0> a;
        public final Field<v0> b;
        public final Field<nb> c;
        public final Field<String> d;
        public final Field<List<h0>> e;

        public a(Field<v0> field, Field<v0> field2, Field<nb> field3, Field<String> field4, Field<List<h0>> field5) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((pa) BuiltInParserKt.getBuiltInParserComponent().u7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        Boolean bool = Boolean.TRUE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public ra(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<List<q1>> field9, Field<w1> field10, Field<Expression<Boolean>> field11, Field<Expression<Boolean>> field12, Field<Expression<Long>> field13, Field<Expression<String>> field14, Field<List<x3>> field15, Field<String> field16, Field<List<h0>> field17, Field<List<dln>> field18, Field<qln> field19, Field<List<v4>> field20, Field<z9> field21, Field<List<h0>> field22, Field<List<h0>> field23, Field<String> field24, Field<zmn> field25, Field<List<h0>> field26, Field<a4> field27, Field<a4> field28, Field<List<h0>> field29, Field<List<h0>> field30, Field<Expression<String>> field31, Field<Expression<Long>> field32, Field<List<h0>> field33, Field<String> field34, Field<List<a>> field35, Field<List<gd>> field36, Field<jd> field37, Field<Expression<DivTransitionSelector>> field38, Field<h2> field39, Field<i1> field40, Field<i1> field41, Field<List<DivTransitionTrigger>> field42, Field<List<ld>> field43, Field<List<qd>> field44, Field<Expression<DivVisibility>> field45, Field<be> field46, Field<List<be>> field47, Field<z9> field48) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((na.f) BuiltInParserKt.getBuiltInParserComponent().r7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

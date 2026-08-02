package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.p5;
import com.yandex.div2.q9;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivIndicatorTemplate.kt */
/* loaded from: classes8.dex */
public final class q5 implements JSONSerializable, JsonTemplate<DivIndicator> {
    public final Field<String> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Long>> C;
    public final Field<List<h0>> D;
    public final Field<u9> E;
    public final Field<s4> F;
    public final Field<List<gd>> G;
    public final Field<jd> H;
    public final Field<h2> I;
    public final Field<i1> J;
    public final Field<i1> K;
    public final Field<List<DivTransitionTrigger>> L;
    public final Field<List<ld>> M;
    public final Field<List<qd>> N;
    public final Field<Expression<DivVisibility>> O;
    public final Field<be> P;
    public final Field<List<be>> Q;
    public final Field<z9> R;
    public final Field<f> a;
    public final Field<Expression<Integer>> b;
    public final Field<Expression<Double>> c;
    public final Field<a9> d;
    public final Field<Expression<DivAlignmentHorizontal>> e;
    public final Field<Expression<DivAlignmentVertical>> f;
    public final Field<Expression<Double>> g;
    public final Field<Expression<DivIndicator.Animation>> h;
    public final Field<List<a1>> i;
    public final Field<List<q1>> j;
    public final Field<w1> k;
    public final Field<Expression<Long>> l;
    public final Field<List<x3>> m;
    public final Field<List<dln>> n;
    public final Field<qln> o;
    public final Field<List<v4>> p;
    public final Field<z9> q;
    public final Field<String> r;
    public final Field<Expression<Integer>> s;
    public final Field<a9> t;
    public final Field<a9> u;
    public final Field<o5> v;
    public final Field<zmn> w;
    public final Field<a4> x;
    public final Field<Expression<Double>> y;
    public final Field<a4> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivIndicator.Animation.SCALE, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        new q9.b(new y8(0));
        Expression.Companion.constant$default(companion, 15L, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public q5(Field<f> field, Field<Expression<Integer>> field2, Field<Expression<Double>> field3, Field<a9> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<Expression<DivIndicator.Animation>> field8, Field<List<a1>> field9, Field<List<q1>> field10, Field<w1> field11, Field<Expression<Long>> field12, Field<List<x3>> field13, Field<List<dln>> field14, Field<qln> field15, Field<List<v4>> field16, Field<z9> field17, Field<String> field18, Field<Expression<Integer>> field19, Field<a9> field20, Field<a9> field21, Field<o5> field22, Field<zmn> field23, Field<a4> field24, Field<Expression<Double>> field25, Field<a4> field26, Field<String> field27, Field<Expression<String>> field28, Field<Expression<Long>> field29, Field<List<h0>> field30, Field<u9> field31, Field<s4> field32, Field<List<gd>> field33, Field<jd> field34, Field<h2> field35, Field<i1> field36, Field<i1> field37, Field<List<DivTransitionTrigger>> field38, Field<List<ld>> field39, Field<List<qd>> field40, Field<Expression<DivVisibility>> field41, Field<be> field42, Field<List<be>> field43, Field<z9> field44) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((p5.f) BuiltInParserKt.getBuiltInParserComponent().e4.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

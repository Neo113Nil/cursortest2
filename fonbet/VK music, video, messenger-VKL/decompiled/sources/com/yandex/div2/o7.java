package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPager;
import com.yandex.div2.n7;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.ynn;
import xsna.zmn;

/* compiled from: DivPagerTemplate.kt */
/* loaded from: classes8.dex */
public final class o7 implements JSONSerializable, JsonTemplate<DivPager> {
    public final Field<Expression<Boolean>> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Long>> C;
    public final Field<Expression<DivPager.ItemAlignment>> D;
    public final Field<List<h0>> E;
    public final Field<List<gd>> F;
    public final Field<jd> G;
    public final Field<h2> H;
    public final Field<i1> I;
    public final Field<i1> J;
    public final Field<List<DivTransitionTrigger>> K;
    public final Field<List<ld>> L;
    public final Field<List<qd>> M;
    public final Field<Expression<DivVisibility>> N;
    public final Field<be> O;
    public final Field<List<be>> P;
    public final Field<z9> Q;
    public final Field<f> a;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<Expression<Double>> d;
    public final Field<List<a1>> e;
    public final Field<List<q1>> f;
    public final Field<w1> g;
    public final Field<Expression<Long>> h;
    public final Field<Expression<DivPager.ItemAlignment>> i;
    public final Field<Expression<Long>> j;
    public final Field<List<x3>> k;
    public final Field<List<dln>> l;
    public final Field<qln> m;
    public final Field<List<v4>> n;
    public final Field<z9> o;
    public final Field<String> p;
    public final Field<Expression<Boolean>> q;
    public final Field<r2> r;
    public final Field<s4> s;
    public final Field<List<nb>> t;
    public final Field<ynn> u;
    public final Field<zmn> v;
    public final Field<a4> w;
    public final Field<Expression<DivPager.Orientation>> x;
    public final Field<a4> y;
    public final Field<m7> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivPager.ItemAlignment.START, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        new v9.c(new krn(null, null, null));
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivPager.Orientation.HORIZONTAL, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, DivPager.ItemAlignment.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public o7(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<Expression<DivPager.ItemAlignment>> field9, Field<Expression<Long>> field10, Field<List<x3>> field11, Field<List<dln>> field12, Field<qln> field13, Field<List<v4>> field14, Field<z9> field15, Field<String> field16, Field<Expression<Boolean>> field17, Field<r2> field18, Field<s4> field19, Field<List<nb>> field20, Field<ynn> field21, Field<zmn> field22, Field<a4> field23, Field<Expression<DivPager.Orientation>> field24, Field<a4> field25, Field<m7> field26, Field<Expression<Boolean>> field27, Field<Expression<String>> field28, Field<Expression<Long>> field29, Field<Expression<DivPager.ItemAlignment>> field30, Field<List<h0>> field31, Field<List<gd>> field32, Field<jd> field33, Field<h2> field34, Field<i1> field35, Field<i1> field36, Field<List<DivTransitionTrigger>> field37, Field<List<ld>> field38, Field<List<qd>> field39, Field<Expression<DivVisibility>> field40, Field<be> field41, Field<List<be>> field42, Field<z9> field43) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((n7.h) BuiltInParserKt.getBuiltInParserComponent().A5.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

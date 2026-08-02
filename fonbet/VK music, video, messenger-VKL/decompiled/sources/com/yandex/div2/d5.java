package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.c5;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivGridTemplate.kt */
/* loaded from: classes8.dex */
public final class d5 implements JSONSerializable, JsonTemplate<b5> {
    public final Field<List<h0>> A;
    public final Field<a4> B;
    public final Field<a4> C;
    public final Field<List<h0>> D;
    public final Field<List<h0>> E;
    public final Field<Expression<String>> F;
    public final Field<Expression<Long>> G;
    public final Field<List<h0>> H;
    public final Field<List<gd>> I;
    public final Field<jd> J;
    public final Field<h2> K;
    public final Field<i1> L;
    public final Field<i1> M;
    public final Field<List<DivTransitionTrigger>> N;
    public final Field<List<ld>> O;
    public final Field<List<qd>> P;
    public final Field<Expression<DivVisibility>> Q;
    public final Field<be> R;
    public final Field<List<be>> S;
    public final Field<z9> T;
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
    public final Field<Expression<Long>> l;
    public final Field<Expression<Long>> m;
    public final Field<Expression<DivAlignmentHorizontal>> n;
    public final Field<Expression<DivAlignmentVertical>> o;
    public final Field<List<x3>> p;
    public final Field<List<h0>> q;
    public final Field<List<dln>> r;
    public final Field<qln> s;
    public final Field<List<v4>> t;
    public final Field<z9> u;
    public final Field<List<h0>> v;
    public final Field<List<h0>> w;
    public final Field<String> x;
    public final Field<List<nb>> y;
    public final Field<zmn> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public d5(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<List<q1>> field9, Field<w1> field10, Field<Expression<Boolean>> field11, Field<Expression<Long>> field12, Field<Expression<Long>> field13, Field<Expression<DivAlignmentHorizontal>> field14, Field<Expression<DivAlignmentVertical>> field15, Field<List<x3>> field16, Field<List<h0>> field17, Field<List<dln>> field18, Field<qln> field19, Field<List<v4>> field20, Field<z9> field21, Field<List<h0>> field22, Field<List<h0>> field23, Field<String> field24, Field<List<nb>> field25, Field<zmn> field26, Field<List<h0>> field27, Field<a4> field28, Field<a4> field29, Field<List<h0>> field30, Field<List<h0>> field31, Field<Expression<String>> field32, Field<Expression<Long>> field33, Field<List<h0>> field34, Field<List<gd>> field35, Field<jd> field36, Field<h2> field37, Field<i1> field38, Field<i1> field39, Field<List<DivTransitionTrigger>> field40, Field<List<ld>> field41, Field<List<qd>> field42, Field<Expression<DivVisibility>> field43, Field<be> field44, Field<List<be>> field45, Field<z9> field46) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((c5.g) BuiltInParserKt.getBuiltInParserComponent().S3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

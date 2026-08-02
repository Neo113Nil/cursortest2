package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.i5;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivImageTemplate.kt */
/* loaded from: classes8.dex */
public final class j5 implements JSONSerializable, JsonTemplate<e5> {
    public final Field<String> A;
    public final Field<Expression<Uri>> B;
    public final Field<zmn> C;
    public final Field<List<h0>> D;
    public final Field<a4> E;
    public final Field<a4> F;
    public final Field<Expression<Integer>> G;
    public final Field<Expression<Boolean>> H;
    public final Field<List<h0>> I;
    public final Field<List<h0>> J;
    public final Field<Expression<String>> K;
    public final Field<Expression<String>> L;
    public final Field<Expression<Long>> M;
    public final Field<Expression<DivImageScale>> N;
    public final Field<List<h0>> O;
    public final Field<Expression<Integer>> P;
    public final Field<Expression<DivBlendMode>> Q;
    public final Field<List<gd>> R;
    public final Field<jd> S;
    public final Field<h2> T;
    public final Field<i1> U;
    public final Field<i1> V;
    public final Field<List<DivTransitionTrigger>> W;
    public final Field<List<ld>> X;
    public final Field<List<qd>> Y;
    public final Field<Expression<DivVisibility>> Z;
    public final Field<f> a;
    public final Field<be> a0;
    public final Field<h0> b;
    public final Field<List<be>> b0;
    public final Field<v0> c;
    public final Field<z9> c0;
    public final Field<List<h0>> d;
    public final Field<Expression<DivAlignmentHorizontal>> e;
    public final Field<Expression<DivAlignmentVertical>> f;
    public final Field<Expression<Double>> g;
    public final Field<List<a1>> h;
    public final Field<d4> i;
    public final Field<l1> j;
    public final Field<List<q1>> k;
    public final Field<w1> l;
    public final Field<Expression<Boolean>> m;
    public final Field<Expression<Long>> n;
    public final Field<Expression<DivAlignmentHorizontal>> o;
    public final Field<Expression<DivAlignmentVertical>> p;
    public final Field<List<x3>> q;
    public final Field<List<h0>> r;
    public final Field<List<dln>> s;
    public final Field<List<i4>> t;
    public final Field<qln> u;
    public final Field<List<v4>> v;
    public final Field<z9> w;
    public final Field<Expression<Boolean>> x;
    public final Field<List<h0>> y;
    public final Field<List<h0>> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        new v9.c(new krn(null, null, null));
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public j5(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<d4> field9, Field<l1> field10, Field<List<q1>> field11, Field<w1> field12, Field<Expression<Boolean>> field13, Field<Expression<Long>> field14, Field<Expression<DivAlignmentHorizontal>> field15, Field<Expression<DivAlignmentVertical>> field16, Field<List<x3>> field17, Field<List<h0>> field18, Field<List<dln>> field19, Field<List<i4>> field20, Field<qln> field21, Field<List<v4>> field22, Field<z9> field23, Field<Expression<Boolean>> field24, Field<List<h0>> field25, Field<List<h0>> field26, Field<String> field27, Field<Expression<Uri>> field28, Field<zmn> field29, Field<List<h0>> field30, Field<a4> field31, Field<a4> field32, Field<Expression<Integer>> field33, Field<Expression<Boolean>> field34, Field<List<h0>> field35, Field<List<h0>> field36, Field<Expression<String>> field37, Field<Expression<String>> field38, Field<Expression<Long>> field39, Field<Expression<DivImageScale>> field40, Field<List<h0>> field41, Field<Expression<Integer>> field42, Field<Expression<DivBlendMode>> field43, Field<List<gd>> field44, Field<jd> field45, Field<h2> field46, Field<i1> field47, Field<i1> field48, Field<List<DivTransitionTrigger>> field49, Field<List<ld>> field50, Field<List<qd>> field51, Field<Expression<DivVisibility>> field52, Field<be> field53, Field<List<be>> field54, Field<z9> field55) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((i5.i) BuiltInParserKt.getBuiltInParserComponent().Y3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

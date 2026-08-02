package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.sd;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivVideoTemplate.kt */
/* loaded from: classes8.dex */
public final class yd implements JSONSerializable, JsonTemplate<rd> {
    public final Field<Expression<Boolean>> A;
    public final Field<Expression<String>> B;
    public final Field<Expression<Boolean>> C;
    public final Field<List<h0>> D;
    public final Field<Expression<String>> E;
    public final Field<Expression<Long>> F;
    public final Field<Expression<DivVideoScale>> G;
    public final Field<List<h0>> H;
    public final Field<List<gd>> I;
    public final Field<jd> J;
    public final Field<h2> K;
    public final Field<i1> L;
    public final Field<i1> M;
    public final Field<List<DivTransitionTrigger>> N;
    public final Field<List<ld>> O;
    public final Field<List<qd>> P;
    public final Field<List<xd>> Q;
    public final Field<Expression<DivVisibility>> R;
    public final Field<be> S;
    public final Field<List<be>> T;
    public final Field<z9> U;
    public final Field<f> a;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<Expression<Double>> d;
    public final Field<List<a1>> e;
    public final Field<l1> f;
    public final Field<Expression<Boolean>> g;
    public final Field<List<q1>> h;
    public final Field<w1> i;
    public final Field<List<h0>> j;
    public final Field<Expression<Long>> k;
    public final Field<List<x3>> l;
    public final Field<String> m;
    public final Field<List<h0>> n;
    public final Field<List<dln>> o;
    public final Field<List<h0>> p;
    public final Field<qln> q;
    public final Field<List<v4>> r;
    public final Field<z9> s;
    public final Field<String> t;
    public final Field<zmn> u;
    public final Field<a4> v;
    public final Field<Expression<Boolean>> w;
    public final Field<a4> x;
    public final Field<List<h0>> y;
    public final Field<JSONObject> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public yd(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<l1> field6, Field<Expression<Boolean>> field7, Field<List<q1>> field8, Field<w1> field9, Field<List<h0>> field10, Field<Expression<Long>> field11, Field<List<x3>> field12, Field<String> field13, Field<List<h0>> field14, Field<List<dln>> field15, Field<List<h0>> field16, Field<qln> field17, Field<List<v4>> field18, Field<z9> field19, Field<String> field20, Field<zmn> field21, Field<a4> field22, Field<Expression<Boolean>> field23, Field<a4> field24, Field<List<h0>> field25, Field<JSONObject> field26, Field<Expression<Boolean>> field27, Field<Expression<String>> field28, Field<Expression<Boolean>> field29, Field<List<h0>> field30, Field<Expression<String>> field31, Field<Expression<Long>> field32, Field<Expression<DivVideoScale>> field33, Field<List<h0>> field34, Field<List<gd>> field35, Field<jd> field36, Field<h2> field37, Field<i1> field38, Field<i1> field39, Field<List<DivTransitionTrigger>> field40, Field<List<ld>> field41, Field<List<qd>> field42, Field<List<xd>> field43, Field<Expression<DivVisibility>> field44, Field<be> field45, Field<List<be>> field46, Field<z9> field47) {
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
        return ((sd.f) BuiltInParserKt.getBuiltInParserComponent().r9.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.h3;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivCustomTemplate.kt */
/* loaded from: classes8.dex */
public final class i3 implements JSONSerializable, JsonTemplate<g3> {
    public final Field<i1> A;
    public final Field<i1> B;
    public final Field<List<DivTransitionTrigger>> C;
    public final Field<List<ld>> D;
    public final Field<List<qd>> E;
    public final Field<Expression<DivVisibility>> F;
    public final Field<be> G;
    public final Field<List<be>> H;
    public final Field<z9> I;
    public final Field<f> a;
    public final Field<Expression<DivAlignmentHorizontal>> b;
    public final Field<Expression<DivAlignmentVertical>> c;
    public final Field<Expression<Double>> d;
    public final Field<List<a1>> e;
    public final Field<List<q1>> f;
    public final Field<w1> g;
    public final Field<Expression<Long>> h;
    public final Field<JSONObject> i;
    public final Field<String> j;
    public final Field<List<x3>> k;
    public final Field<List<dln>> l;
    public final Field<qln> m;
    public final Field<List<v4>> n;
    public final Field<z9> o;
    public final Field<String> p;
    public final Field<List<nb>> q;
    public final Field<zmn> r;
    public final Field<a4> s;
    public final Field<a4> t;
    public final Field<Expression<String>> u;
    public final Field<Expression<Long>> v;
    public final Field<List<h0>> w;
    public final Field<List<gd>> x;
    public final Field<jd> y;
    public final Field<h2> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public i3(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<JSONObject> field9, Field<String> field10, Field<List<x3>> field11, Field<List<dln>> field12, Field<qln> field13, Field<List<v4>> field14, Field<z9> field15, Field<String> field16, Field<List<nb>> field17, Field<zmn> field18, Field<a4> field19, Field<a4> field20, Field<Expression<String>> field21, Field<Expression<Long>> field22, Field<List<h0>> field23, Field<List<gd>> field24, Field<jd> field25, Field<h2> field26, Field<i1> field27, Field<i1> field28, Field<List<DivTransitionTrigger>> field29, Field<List<ld>> field30, Field<List<qd>> field31, Field<Expression<DivVisibility>> field32, Field<be> field33, Field<List<be>> field34, Field<z9> field35) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((h3.e) BuiltInParserKt.getBuiltInParserComponent().C2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

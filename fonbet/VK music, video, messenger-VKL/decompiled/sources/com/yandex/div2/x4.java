package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivGallery;
import com.yandex.div2.v9;
import com.yandex.div2.w4;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivGalleryTemplate.kt */
/* loaded from: classes8.dex */
public final class x4 implements JSONSerializable, JsonTemplate<DivGallery> {
    public final Field<Expression<String>> A;
    public final Field<Expression<Long>> B;
    public final Field<Expression<DivGallery.ScrollMode>> C;
    public final Field<Expression<DivGallery.Scrollbar>> D;
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
    public final Field<Expression<Long>> i;
    public final Field<Expression<DivGallery.CrossContentAlignment>> j;
    public final Field<Expression<Long>> k;
    public final Field<Expression<Long>> l;
    public final Field<List<x3>> m;
    public final Field<List<dln>> n;
    public final Field<qln> o;
    public final Field<List<v4>> p;
    public final Field<z9> q;
    public final Field<String> r;
    public final Field<r2> s;
    public final Field<Expression<Long>> t;
    public final Field<List<nb>> u;
    public final Field<zmn> v;
    public final Field<a4> w;
    public final Field<Expression<DivGallery.Orientation>> x;
    public final Field<a4> y;
    public final Field<Expression<Boolean>> z;

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Expression.Companion.constant$default(companion, DivGallery.CrossContentAlignment.START, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Expression.Companion.constant$default(companion, DivGallery.Orientation.HORIZONTAL, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        Expression.Companion.constant$default(companion, DivGallery.ScrollMode.DEFAULT, null, 2, null);
        Expression.Companion.constant$default(companion, DivGallery.Scrollbar.NONE, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public x4(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<Expression<Long>> field9, Field<Expression<DivGallery.CrossContentAlignment>> field10, Field<Expression<Long>> field11, Field<Expression<Long>> field12, Field<List<x3>> field13, Field<List<dln>> field14, Field<qln> field15, Field<List<v4>> field16, Field<z9> field17, Field<String> field18, Field<r2> field19, Field<Expression<Long>> field20, Field<List<nb>> field21, Field<zmn> field22, Field<a4> field23, Field<Expression<DivGallery.Orientation>> field24, Field<a4> field25, Field<Expression<Boolean>> field26, Field<Expression<String>> field27, Field<Expression<Long>> field28, Field<Expression<DivGallery.ScrollMode>> field29, Field<Expression<DivGallery.Scrollbar>> field30, Field<List<h0>> field31, Field<List<gd>> field32, Field<jd> field33, Field<h2> field34, Field<i1> field35, Field<i1> field36, Field<List<DivTransitionTrigger>> field37, Field<List<ld>> field38, Field<List<qd>> field39, Field<Expression<DivVisibility>> field40, Field<be> field41, Field<List<be>> field42, Field<z9> field43) {
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
        return ((w4.i) BuiltInParserKt.getBuiltInParserComponent().M3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

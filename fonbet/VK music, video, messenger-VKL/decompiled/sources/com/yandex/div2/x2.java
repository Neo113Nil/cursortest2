package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.v2;
import com.yandex.div2.v9;
import com.yandex.div2.w2;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.ykn;
import xsna.zmn;

/* compiled from: DivContainerTemplate.kt */
/* loaded from: classes8.dex */
public final class x2 implements JSONSerializable, JsonTemplate<DivContainer> {
    public final Field<Expression<Long>> A;
    public final Field<List<nb>> B;
    public final Field<Expression<DivContainer.LayoutMode>> C;
    public final Field<zmn> D;
    public final Field<a> E;
    public final Field<Expression<Long>> F;
    public final Field<List<h0>> G;
    public final Field<a4> H;
    public final Field<Expression<DivContainer.Orientation>> I;
    public final Field<a4> J;
    public final Field<List<h0>> K;
    public final Field<List<h0>> L;
    public final Field<Expression<String>> M;
    public final Field<Expression<Long>> N;
    public final Field<List<h0>> O;
    public final Field<a> P;
    public final Field<List<gd>> Q;
    public final Field<jd> R;
    public final Field<h2> S;
    public final Field<i1> T;
    public final Field<i1> U;
    public final Field<List<DivTransitionTrigger>> V;
    public final Field<List<ld>> W;
    public final Field<List<qd>> X;
    public final Field<Expression<DivVisibility>> Y;
    public final Field<be> Z;
    public final Field<f> a;
    public final Field<List<be>> a0;
    public final Field<h0> b;
    public final Field<z9> b0;
    public final Field<v0> c;
    public final Field<List<h0>> d;
    public final Field<Expression<DivAlignmentHorizontal>> e;
    public final Field<Expression<DivAlignmentVertical>> f;
    public final Field<Expression<Double>> g;
    public final Field<List<a1>> h;
    public final Field<l1> i;
    public final Field<List<q1>> j;
    public final Field<w1> k;
    public final Field<Expression<Boolean>> l;
    public final Field<Expression<Boolean>> m;
    public final Field<Expression<Long>> n;
    public final Field<Expression<DivContentAlignmentHorizontal>> o;
    public final Field<Expression<DivContentAlignmentVertical>> p;
    public final Field<List<x3>> q;
    public final Field<List<h0>> r;
    public final Field<List<dln>> s;
    public final Field<qln> t;
    public final Field<List<v4>> u;
    public final Field<z9> v;
    public final Field<List<h0>> w;
    public final Field<List<h0>> x;
    public final Field<String> y;
    public final Field<r2> z;

    /* compiled from: DivContainerTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivContainer.a> {
        public final Field<a4> a;
        public final Field<Expression<Boolean>> b;
        public final Field<Expression<Boolean>> c;
        public final Field<Expression<Boolean>> d;
        public final Field<ykn> e;

        static {
            Expression.Companion companion = Expression.Companion;
            Boolean bool = Boolean.FALSE;
            Expression.Companion.constant$default(companion, bool, null, 2, null);
            Expression.Companion.constant$default(companion, bool, null, 2, null);
            Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        }

        public a(Field<a4> field, Field<Expression<Boolean>> field2, Field<Expression<Boolean>> field3, Field<Expression<Boolean>> field4, Field<ykn> field5) {
            this.a = field;
            this.b = field2;
            this.c = field3;
            this.d = field4;
            this.e = field5;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((w2.b) BuiltInParserKt.getBuiltInParserComponent().q2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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
        Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivContainer.LayoutMode.NO_WRAP, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivContainer.Orientation.VERTICAL, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public x2(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<l1> field9, Field<List<q1>> field10, Field<w1> field11, Field<Expression<Boolean>> field12, Field<Expression<Boolean>> field13, Field<Expression<Long>> field14, Field<Expression<DivContentAlignmentHorizontal>> field15, Field<Expression<DivContentAlignmentVertical>> field16, Field<List<x3>> field17, Field<List<h0>> field18, Field<List<dln>> field19, Field<qln> field20, Field<List<v4>> field21, Field<z9> field22, Field<List<h0>> field23, Field<List<h0>> field24, Field<String> field25, Field<r2> field26, Field<Expression<Long>> field27, Field<List<nb>> field28, Field<Expression<DivContainer.LayoutMode>> field29, Field<zmn> field30, Field<a> field31, Field<Expression<Long>> field32, Field<List<h0>> field33, Field<a4> field34, Field<Expression<DivContainer.Orientation>> field35, Field<a4> field36, Field<List<h0>> field37, Field<List<h0>> field38, Field<Expression<String>> field39, Field<Expression<Long>> field40, Field<List<h0>> field41, Field<a> field42, Field<List<gd>> field43, Field<jd> field44, Field<h2> field45, Field<i1> field46, Field<i1> field47, Field<List<DivTransitionTrigger>> field48, Field<List<ld>> field49, Field<List<qd>> field50, Field<Expression<DivVisibility>> field51, Field<be> field52, Field<List<be>> field53, Field<z9> field54) {
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
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((v2.i) BuiltInParserKt.getBuiltInParserComponent().n2.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

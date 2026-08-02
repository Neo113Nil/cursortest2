package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTabs;
import com.yandex.div2.jb;
import com.yandex.div2.kb;
import com.yandex.div2.lb;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivTabsTemplate.kt */
/* loaded from: classes8.dex */
public final class mb implements JSONSerializable, JsonTemplate<DivTabs> {
    public final Field<a4> A;
    public final Field<Expression<Boolean>> B;
    public final Field<b> C;
    public final Field<c> D;
    public final Field<a4> E;
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
    public final Field<List<x3>> i;
    public final Field<Expression<Boolean>> j;
    public final Field<List<dln>> k;
    public final Field<qln> l;
    public final Field<List<v4>> m;
    public final Field<Expression<Boolean>> n;
    public final Field<z9> o;
    public final Field<String> p;
    public final Field<List<a>> q;
    public final Field<zmn> r;
    public final Field<a4> s;
    public final Field<a4> t;
    public final Field<Expression<Boolean>> u;
    public final Field<Expression<String>> v;
    public final Field<Expression<Long>> w;
    public final Field<List<h0>> x;
    public final Field<Expression<Long>> y;
    public final Field<Expression<Integer>> z;

    /* compiled from: DivTabsTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivTabs.a> {
        public final Field<nb> a;
        public final Field<Expression<String>> b;
        public final Field<h0> c;

        public a(Field<nb> field, Field<Expression<String>> field2, Field<h0> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((hb) BuiltInParserKt.getBuiltInParserComponent().Y7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivTabsTemplate.kt */
    public static final class b implements JSONSerializable, JsonTemplate<DivTabs.b> {
        public final Field<s4> a;
        public final Field<Expression<Uri>> b;
        public final Field<s4> c;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
        }

        public b(Field<s4> field, Field<Expression<Uri>> field2, Field<s4> field3) {
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((kb.b) BuiltInParserKt.getBuiltInParserComponent().V7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* compiled from: DivTabsTemplate.kt */
    public static final class c implements JSONSerializable, JsonTemplate<DivTabs.TabTitleStyle> {
        public final Field<Expression<Integer>> a;
        public final Field<Expression<JSONObject>> b;
        public final Field<Expression<DivFontWeight>> c;
        public final Field<Expression<Integer>> d;
        public final Field<Expression<Long>> e;
        public final Field<Expression<DivTabs.TabTitleStyle.AnimationType>> f;
        public final Field<Expression<Long>> g;
        public final Field<a3> h;
        public final Field<Expression<String>> i;
        public final Field<Expression<Long>> j;
        public final Field<Expression<DivSizeUnit>> k;
        public final Field<Expression<DivFontWeight>> l;
        public final Field<Expression<Integer>> m;
        public final Field<Expression<JSONObject>> n;
        public final Field<Expression<DivFontWeight>> o;
        public final Field<Expression<Integer>> p;
        public final Field<Expression<Long>> q;
        public final Field<Expression<Double>> r;
        public final Field<Expression<Long>> s;
        public final Field<a4> t;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, -9120, null, 2, null);
            Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            Expression.Companion.constant$default(companion, 300L, null, 2, null);
            Expression.Companion.constant$default(companion, DivTabs.TabTitleStyle.AnimationType.SLIDE, null, 2, null);
            Expression.Companion.constant$default(companion, 12L, null, 2, null);
            Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            Expression.Companion.constant$default(companion, 0L, null, 2, null);
            Expression.Companion.constant$default(companion, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE), null, 2, null);
            Expression.Companion.constant$default(companion, 6L, null, 2, null);
            Expression.Companion.constant$default(companion, 8L, null, 2, null);
            Expression.Companion.constant$default(companion, 8L, null, 2, null);
            Expression.Companion.constant$default(companion, 6L, null, 2, null);
        }

        public c(Field<Expression<Integer>> field, Field<Expression<JSONObject>> field2, Field<Expression<DivFontWeight>> field3, Field<Expression<Integer>> field4, Field<Expression<Long>> field5, Field<Expression<DivTabs.TabTitleStyle.AnimationType>> field6, Field<Expression<Long>> field7, Field<a3> field8, Field<Expression<String>> field9, Field<Expression<Long>> field10, Field<Expression<DivSizeUnit>> field11, Field<Expression<DivFontWeight>> field12, Field<Expression<Integer>> field13, Field<Expression<JSONObject>> field14, Field<Expression<DivFontWeight>> field15, Field<Expression<Integer>> field16, Field<Expression<Long>> field17, Field<Expression<Double>> field18, Field<Expression<Long>> field19, Field<a4> field20) {
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
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            return ((lb.g) BuiltInParserKt.getBuiltInParserComponent().S7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, bool, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 335544320, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        Expression.Companion.constant$default(companion, 8L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 12L, null, 2, null);
        Expression.Companion.constant$default(companion, 0L, null, 2, null);
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public mb(Field<f> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<Expression<Double>> field4, Field<List<a1>> field5, Field<List<q1>> field6, Field<w1> field7, Field<Expression<Long>> field8, Field<List<x3>> field9, Field<Expression<Boolean>> field10, Field<List<dln>> field11, Field<qln> field12, Field<List<v4>> field13, Field<Expression<Boolean>> field14, Field<z9> field15, Field<String> field16, Field<List<a>> field17, Field<zmn> field18, Field<a4> field19, Field<a4> field20, Field<Expression<Boolean>> field21, Field<Expression<String>> field22, Field<Expression<Long>> field23, Field<List<h0>> field24, Field<Expression<Long>> field25, Field<Expression<Integer>> field26, Field<a4> field27, Field<Expression<Boolean>> field28, Field<b> field29, Field<c> field30, Field<a4> field31, Field<List<gd>> field32, Field<jd> field33, Field<h2> field34, Field<i1> field35, Field<i1> field36, Field<List<DivTransitionTrigger>> field37, Field<List<ld>> field38, Field<List<qd>> field39, Field<Expression<DivVisibility>> field40, Field<be> field41, Field<List<be>> field42, Field<z9> field43) {
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
        return ((jb.e) BuiltInParserKt.getBuiltInParserComponent().P7.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

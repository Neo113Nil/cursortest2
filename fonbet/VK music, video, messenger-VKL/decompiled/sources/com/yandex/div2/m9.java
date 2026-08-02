package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.k9;
import com.yandex.div2.l9;
import com.yandex.div2.v9;
import java.util.List;
import org.json.JSONObject;
import xsna.dln;
import xsna.krn;
import xsna.qln;
import xsna.zmn;

/* compiled from: DivSeparatorTemplate.kt */
/* loaded from: classes8.dex */
public final class m9 implements JSONSerializable, JsonTemplate<DivSeparator> {
    public final Field<List<h0>> A;
    public final Field<List<h0>> B;
    public final Field<Expression<String>> C;
    public final Field<Expression<Long>> D;
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
    public final Field<a> m;
    public final Field<List<x3>> n;
    public final Field<List<h0>> o;
    public final Field<List<dln>> p;
    public final Field<qln> q;
    public final Field<List<v4>> r;
    public final Field<z9> s;
    public final Field<List<h0>> t;
    public final Field<List<h0>> u;
    public final Field<String> v;
    public final Field<zmn> w;
    public final Field<List<h0>> x;
    public final Field<a4> y;
    public final Field<a4> z;

    /* compiled from: DivSeparatorTemplate.kt */
    public static final class a implements JSONSerializable, JsonTemplate<DivSeparator.DelimiterStyle> {
        public final Field<Expression<Integer>> a;
        public final Field<Expression<DivSeparator.DelimiterStyle.Orientation>> b;

        static {
            Expression.Companion companion = Expression.Companion;
            Expression.Companion.constant$default(companion, 335544320, null, 2, null);
            Expression.Companion.constant$default(companion, DivSeparator.DelimiterStyle.Orientation.HORIZONTAL, null, 2, null);
        }

        public a(Field<Expression<Integer>> field, Field<Expression<DivSeparator.DelimiterStyle.Orientation>> field2) {
            this.a = field;
            this.b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public final JSONObject writeToJSON() {
            k9.c cVar = (k9.c) BuiltInParserKt.getBuiltInParserComponent().K6.getValue();
            ParsingContext builtInParsingContext = BuiltInParserKt.getBuiltInParsingContext();
            cVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, "color", this.a, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(builtInParsingContext, jSONObject, X3.i.n, this.b, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
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
        Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        new v9.c(new krn(null, null, null));
        Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        new v9.b(new w6(null, null, null));
    }

    public m9(Field<f> field, Field<h0> field2, Field<v0> field3, Field<List<h0>> field4, Field<Expression<DivAlignmentHorizontal>> field5, Field<Expression<DivAlignmentVertical>> field6, Field<Expression<Double>> field7, Field<List<a1>> field8, Field<List<q1>> field9, Field<w1> field10, Field<Expression<Boolean>> field11, Field<Expression<Long>> field12, Field<a> field13, Field<List<x3>> field14, Field<List<h0>> field15, Field<List<dln>> field16, Field<qln> field17, Field<List<v4>> field18, Field<z9> field19, Field<List<h0>> field20, Field<List<h0>> field21, Field<String> field22, Field<zmn> field23, Field<List<h0>> field24, Field<a4> field25, Field<a4> field26, Field<List<h0>> field27, Field<List<h0>> field28, Field<Expression<String>> field29, Field<Expression<Long>> field30, Field<List<h0>> field31, Field<List<gd>> field32, Field<jd> field33, Field<h2> field34, Field<i1> field35, Field<i1> field36, Field<List<DivTransitionTrigger>> field37, Field<List<ld>> field38, Field<List<qd>> field39, Field<Expression<DivVisibility>> field40, Field<be> field41, Field<List<be>> field42, Field<z9> field43) {
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
        return ((l9.e) BuiltInParserKt.getBuiltInParserComponent().H6.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}

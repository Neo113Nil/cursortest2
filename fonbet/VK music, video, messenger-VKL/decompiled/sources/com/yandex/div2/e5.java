package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.i5;
import com.yandex.div2.v9;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.fpf0;
import xsna.ikn;
import xsna.jln;
import xsna.krn;
import xsna.vmn;
import xsna.zkn;

/* compiled from: DivImage.kt */
/* loaded from: classes8.dex */
public final class e5 implements JSONSerializable, Hashable, ikn {
    public static final /* synthetic */ int e0 = 0;
    public final String A;
    public final Expression<Uri> B;
    public final vmn C;
    public final List<DivAction> D;
    public final y3 E;
    public final y3 F;
    public final Expression<Integer> G;
    public final Expression<Boolean> H;
    public final List<DivAction> I;
    public final List<DivAction> J;
    public final Expression<String> K;
    public final Expression<String> L;
    public final Expression<Long> M;
    public final Expression<DivImageScale> N;
    public final List<DivAction> O;
    public final Expression<Integer> P;
    public final Expression<DivBlendMode> Q;
    public final List<DivTooltip> R;
    public final hd S;
    public final d2 T;
    public final e1 U;
    public final e1 V;
    public final List<DivTransitionTrigger> W;
    public final List<DivTrigger> X;
    public final List<md> Y;
    public final Expression<DivVisibility> Z;
    public final DivAccessibility a;
    public final zd a0;
    public final DivAction b;
    public final List<zd> b0;
    public final DivAnimation c;
    public final v9 c0;
    public final List<DivAction> d;
    public Integer d0;
    public final Expression<DivAlignmentHorizontal> e;
    public final Expression<DivAlignmentVertical> f;
    public final Expression<Double> g;
    public final List<w0> h;
    public final b4 i;
    public final j1 j;
    public final List<m1> k;
    public final u1 l;
    public final Expression<Boolean> m;
    public final Expression<Long> n;
    public final Expression<DivAlignmentHorizontal> o;
    public final Expression<DivAlignmentVertical> p;
    public final List<v3> q;
    public final List<DivAction> r;
    public final List<zkn> s;
    public final List<e4> t;
    public final jln u;
    public final List<t4> v;
    public final v9 w;
    public final Expression<Boolean> x;
    public final List<DivAction> y;
    public final List<DivAction> z;

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

    /* JADX WARN: Multi-variable type inference failed */
    public e5(DivAccessibility divAccessibility, DivAction divAction, DivAnimation divAnimation, List<DivAction> list, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2, Expression<Double> expression3, List<? extends w0> list2, b4 b4Var, j1 j1Var, List<? extends m1> list3, u1 u1Var, Expression<Boolean> expression4, Expression<Long> expression5, Expression<DivAlignmentHorizontal> expression6, Expression<DivAlignmentVertical> expression7, List<v3> list4, List<DivAction> list5, List<zkn> list6, List<? extends e4> list7, jln jlnVar, List<t4> list8, v9 v9Var, Expression<Boolean> expression8, List<DivAction> list9, List<DivAction> list10, String str, Expression<Uri> expression9, vmn vmnVar, List<DivAction> list11, y3 y3Var, y3 y3Var2, Expression<Integer> expression10, Expression<Boolean> expression11, List<DivAction> list12, List<DivAction> list13, Expression<String> expression12, Expression<String> expression13, Expression<Long> expression14, Expression<DivImageScale> expression15, List<DivAction> list14, Expression<Integer> expression16, Expression<DivBlendMode> expression17, List<DivTooltip> list15, hd hdVar, d2 d2Var, e1 e1Var, e1 e1Var2, List<? extends DivTransitionTrigger> list16, List<DivTrigger> list17, List<? extends md> list18, Expression<DivVisibility> expression18, zd zdVar, List<zd> list19, v9 v9Var2) {
        this.a = divAccessibility;
        this.b = divAction;
        this.c = divAnimation;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = b4Var;
        this.j = j1Var;
        this.k = list3;
        this.l = u1Var;
        this.m = expression4;
        this.n = expression5;
        this.o = expression6;
        this.p = expression7;
        this.q = list4;
        this.r = list5;
        this.s = list6;
        this.t = list7;
        this.u = jlnVar;
        this.v = list8;
        this.w = v9Var;
        this.x = expression8;
        this.y = list9;
        this.z = list10;
        this.A = str;
        this.B = expression9;
        this.C = vmnVar;
        this.D = list11;
        this.E = y3Var;
        this.F = y3Var2;
        this.G = expression10;
        this.H = expression11;
        this.I = list12;
        this.J = list13;
        this.K = expression12;
        this.L = expression13;
        this.M = expression14;
        this.N = expression15;
        this.O = list14;
        this.P = expression16;
        this.Q = expression17;
        this.R = list15;
        this.S = hdVar;
        this.T = d2Var;
        this.U = e1Var;
        this.V = e1Var2;
        this.W = list16;
        this.X = list17;
        this.Y = list18;
        this.Z = expression18;
        this.a0 = zdVar;
        this.b0 = list19;
        this.c0 = v9Var2;
    }

    @Override // xsna.ikn
    public final List<t4> A() {
        return this.v;
    }

    @Override // xsna.ikn
    public final Expression<Double> a() {
        return this.g;
    }

    @Override // xsna.ikn
    public final List<DivTooltip> b() {
        return this.R;
    }

    @Override // xsna.ikn
    public final hd c() {
        return this.S;
    }

    @Override // xsna.ikn
    public final u1 d() {
        return this.l;
    }

    @Override // xsna.ikn
    public final Expression<Long> e() {
        return this.n;
    }

    @Override // xsna.ikn
    public final List<md> f() {
        return this.Y;
    }

    @Override // xsna.ikn
    public final y3 g() {
        return this.E;
    }

    @Override // xsna.ikn
    public final List<m1> getBackground() {
        return this.k;
    }

    @Override // xsna.ikn
    public final v9 getHeight() {
        return this.w;
    }

    @Override // xsna.ikn
    public final String getId() {
        return this.A;
    }

    @Override // xsna.ikn
    public final Expression<DivVisibility> getVisibility() {
        return this.Z;
    }

    @Override // xsna.ikn
    public final v9 getWidth() {
        return this.c0;
    }

    @Override // xsna.ikn
    public final Expression<Long> h() {
        return this.M;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer num = this.d0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(e5.class).hashCode();
        int i18 = 0;
        DivAccessibility divAccessibility = this.a;
        int hash = hashCode + (divAccessibility != null ? divAccessibility.hash() : 0);
        DivAction divAction = this.b;
        int hash2 = this.c.hash() + hash + (divAction != null ? divAction.hash() : 0);
        List<DivAction> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((DivAction) it.next()).hash();
            }
        } else {
            i = 0;
        }
        int i19 = hash2 + i;
        Expression<DivAlignmentHorizontal> expression = this.e;
        int hashCode2 = i19 + (expression != null ? expression.hashCode() : 0);
        Expression<DivAlignmentVertical> expression2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List<w0> list2 = this.h;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((w0) it2.next()).hash();
            }
        } else {
            i2 = 0;
        }
        int i20 = hashCode3 + i2;
        b4 b4Var = this.i;
        int hash3 = i20 + (b4Var != null ? b4Var.hash() : 0);
        j1 j1Var = this.j;
        int hash4 = hash3 + (j1Var != null ? j1Var.hash() : 0);
        List<m1> list3 = this.k;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((m1) it3.next()).hash();
            }
        } else {
            i3 = 0;
        }
        int i21 = hash4 + i3;
        u1 u1Var = this.l;
        int hashCode4 = this.m.hashCode() + i21 + (u1Var != null ? u1Var.hash() : 0);
        Expression<Long> expression3 = this.n;
        int hashCode5 = this.p.hashCode() + this.o.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List<v3> list4 = this.q;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((v3) it4.next()).hash();
            }
        } else {
            i4 = 0;
        }
        int i22 = hashCode5 + i4;
        List<DivAction> list5 = this.r;
        if (list5 != null) {
            Iterator<T> it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((DivAction) it5.next()).hash();
            }
        } else {
            i5 = 0;
        }
        int i23 = i22 + i5;
        List<zkn> list6 = this.s;
        if (list6 != null) {
            Iterator<T> it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((zkn) it6.next()).hash();
            }
        } else {
            i6 = 0;
        }
        int i24 = i23 + i6;
        List<e4> list7 = this.t;
        if (list7 != null) {
            Iterator<T> it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((e4) it7.next()).hash();
            }
        } else {
            i7 = 0;
        }
        int i25 = i24 + i7;
        jln jlnVar = this.u;
        int hash5 = i25 + (jlnVar != null ? jlnVar.hash() : 0);
        List<t4> list8 = this.v;
        if (list8 != null) {
            Iterator<T> it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((t4) it8.next()).hash();
            }
        } else {
            i8 = 0;
        }
        int hashCode6 = this.x.hashCode() + this.w.hash() + hash5 + i8;
        List<DivAction> list9 = this.y;
        if (list9 != null) {
            Iterator<T> it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((DivAction) it9.next()).hash();
            }
        } else {
            i9 = 0;
        }
        int i26 = hashCode6 + i9;
        List<DivAction> list10 = this.z;
        if (list10 != null) {
            Iterator<T> it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((DivAction) it10.next()).hash();
            }
        } else {
            i10 = 0;
        }
        int i27 = i26 + i10;
        String str = this.A;
        int hashCode7 = this.B.hashCode() + i27 + (str != null ? str.hashCode() : 0);
        vmn vmnVar = this.C;
        int hash6 = hashCode7 + (vmnVar != null ? vmnVar.hash() : 0);
        List<DivAction> list11 = this.D;
        if (list11 != null) {
            Iterator<T> it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((DivAction) it11.next()).hash();
            }
        } else {
            i11 = 0;
        }
        int i28 = hash6 + i11;
        y3 y3Var = this.E;
        int hash7 = i28 + (y3Var != null ? y3Var.hash() : 0);
        y3 y3Var2 = this.F;
        int hashCode8 = this.H.hashCode() + this.G.hashCode() + hash7 + (y3Var2 != null ? y3Var2.hash() : 0);
        List<DivAction> list12 = this.I;
        if (list12 != null) {
            Iterator<T> it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((DivAction) it12.next()).hash();
            }
        } else {
            i12 = 0;
        }
        int i29 = hashCode8 + i12;
        List<DivAction> list13 = this.J;
        if (list13 != null) {
            Iterator<T> it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((DivAction) it13.next()).hash();
            }
        } else {
            i13 = 0;
        }
        int i30 = i29 + i13;
        Expression<String> expression4 = this.K;
        int hashCode9 = i30 + (expression4 != null ? expression4.hashCode() : 0);
        Expression<String> expression5 = this.L;
        int hashCode10 = hashCode9 + (expression5 != null ? expression5.hashCode() : 0);
        Expression<Long> expression6 = this.M;
        int hashCode11 = this.N.hashCode() + hashCode10 + (expression6 != null ? expression6.hashCode() : 0);
        List<DivAction> list14 = this.O;
        if (list14 != null) {
            Iterator<T> it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((DivAction) it14.next()).hash();
            }
        } else {
            i14 = 0;
        }
        int i31 = hashCode11 + i14;
        Expression<Integer> expression7 = this.P;
        int hashCode12 = this.Q.hashCode() + i31 + (expression7 != null ? expression7.hashCode() : 0);
        List<DivTooltip> list15 = this.R;
        if (list15 != null) {
            Iterator<T> it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((DivTooltip) it15.next()).hash();
            }
        } else {
            i15 = 0;
        }
        int i32 = hashCode12 + i15;
        hd hdVar = this.S;
        int hash8 = i32 + (hdVar != null ? hdVar.hash() : 0);
        d2 d2Var = this.T;
        int hash9 = hash8 + (d2Var != null ? d2Var.hash() : 0);
        e1 e1Var = this.U;
        int hash10 = hash9 + (e1Var != null ? e1Var.hash() : 0);
        e1 e1Var2 = this.V;
        int hash11 = hash10 + (e1Var2 != null ? e1Var2.hash() : 0);
        List<DivTransitionTrigger> list16 = this.W;
        int hashCode13 = hash11 + (list16 != null ? list16.hashCode() : 0);
        List<DivTrigger> list17 = this.X;
        if (list17 != null) {
            Iterator<T> it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((DivTrigger) it16.next()).hash();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode13 + i16;
        List<md> list18 = this.Y;
        if (list18 != null) {
            Iterator<T> it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((md) it17.next()).hash();
            }
        } else {
            i17 = 0;
        }
        int hashCode14 = this.Z.hashCode() + i33 + i17;
        zd zdVar = this.a0;
        int hash12 = hashCode14 + (zdVar != null ? zdVar.hash() : 0);
        List<zd> list19 = this.b0;
        if (list19 != null) {
            Iterator<T> it18 = list19.iterator();
            while (it18.hasNext()) {
                i18 += ((zd) it18.next()).hash();
            }
        }
        int hash13 = this.c0.hash() + hash12 + i18;
        this.d0 = Integer.valueOf(hash13);
        return hash13;
    }

    @Override // xsna.ikn
    public final Expression<String> i() {
        return this.L;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentHorizontal> j() {
        return this.e;
    }

    @Override // xsna.ikn
    public final e1 k() {
        return this.V;
    }

    @Override // xsna.ikn
    public final List<DivTransitionTrigger> l() {
        return this.W;
    }

    @Override // xsna.ikn
    public final List<zkn> m() {
        return this.s;
    }

    @Override // xsna.ikn
    public final List<DivAction> n() {
        return this.O;
    }

    @Override // xsna.ikn
    public final vmn o() {
        return this.C;
    }

    @Override // xsna.ikn
    public final List<DivTrigger> p() {
        return this.X;
    }

    @Override // xsna.ikn
    public final e1 q() {
        return this.U;
    }

    @Override // xsna.ikn
    public final List<w0> r() {
        return this.h;
    }

    @Override // xsna.ikn
    public final List<zd> s() {
        return this.b0;
    }

    @Override // xsna.ikn
    public final d2 t() {
        return this.T;
    }

    @Override // xsna.ikn
    public final List<v3> u() {
        return this.q;
    }

    @Override // xsna.ikn
    public final Expression<DivAlignmentVertical> v() {
        return this.f;
    }

    @Override // xsna.ikn
    public final jln w() {
        return this.u;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((i5.h) BuiltInParserKt.getBuiltInParserComponent().X3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // xsna.ikn
    public final DivAccessibility x() {
        return this.a;
    }

    @Override // xsna.ikn
    public final y3 y() {
        return this.F;
    }

    @Override // xsna.ikn
    public final zd z() {
        return this.a0;
    }
}

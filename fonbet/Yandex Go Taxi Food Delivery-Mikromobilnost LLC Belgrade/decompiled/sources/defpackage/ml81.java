package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import yads.io2;
import yads.n62;
import yads.wk2;

/* loaded from: classes7.dex */
public final class ml81 extends t371 implements Comparable {
    public final zu81 A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final int x;
    public final boolean y;
    public final String z;

    public ml81(int i, tu71 tu71Var, int i2, zu81 zu81Var, int i3, boolean z, aa71 aa71Var) {
        super(i, tu71Var, i2);
        int i4;
        int i5;
        String[] strArr;
        int i6;
        this.A = zu81Var;
        this.z = ba71.e(this.w.c);
        int i7 = 0;
        this.B = ba71.g(i3, false);
        int i8 = 0;
        while (true) {
            wk2 wk2Var = zu81Var.G;
            i4 = Integer.MAX_VALUE;
            if (i8 >= wk2Var.w) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = ba71.c(this.w, (String) wk2Var.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.D = i8;
        this.C = i5;
        int i9 = this.w.x;
        int i10 = zu81Var.H;
        this.E = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        qd81 qd81Var = this.w;
        int i11 = qd81Var.x;
        this.F = i11 == 0 || (i11 & 1) != 0;
        this.I = (qd81Var.w & 1) != 0;
        int i12 = qd81Var.R;
        this.J = i12;
        this.K = qd81Var.S;
        int i13 = qd81Var.A;
        this.L = i13;
        this.y = (i13 == -1 || i13 <= zu81Var.J) && (i12 == -1 || i12 <= zu81Var.I) && aa71Var.apply(qd81Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i14 = rf71.a;
        if (i14 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArr = new String[]{i14 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i15 = 0; i15 < strArr.length; i15++) {
            strArr[i15] = rf71.A(strArr[i15]);
        }
        int i16 = 0;
        while (true) {
            if (i16 >= strArr.length) {
                i6 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = ba71.c(this.w, strArr[i16], false);
                if (i6 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.G = i16;
        this.H = i6;
        int i17 = 0;
        while (true) {
            wk2 wk2Var2 = zu81Var.K;
            if (i17 >= wk2Var2.w) {
                break;
            }
            String str = this.w.E;
            if (str != null && str.equals(wk2Var2.get(i17))) {
                i4 = i17;
                break;
            }
            i17++;
        }
        this.M = i4;
        this.N = gy61.a(i3) == 128;
        this.O = gy61.b(i3) == 64;
        if (ba71.g(i3, this.A.f0) && (this.y || this.A.Z)) {
            if (ba71.g(i3, false) && this.y && this.w.A != -1) {
                zu81 zu81Var2 = this.A;
                if (!zu81Var2.Q && !zu81Var2.P && (zu81Var2.h0 || !z)) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.x = i7;
    }

    @Override // defpackage.t371
    public final int a() {
        return this.x;
    }

    @Override // defpackage.t371
    public final boolean b(t371 t371Var) {
        int i;
        String str;
        int i2;
        ml81 ml81Var = (ml81) t371Var;
        qd81 qd81Var = ml81Var.w;
        zu81 zu81Var = this.A;
        boolean z = zu81Var.c0;
        qd81 qd81Var2 = this.w;
        if (!z && ((i2 = qd81Var2.R) == -1 || i2 != qd81Var.R)) {
            return false;
        }
        if (!zu81Var.a0 && ((str = qd81Var2.E) == null || !TextUtils.equals(str, qd81Var.E))) {
            return false;
        }
        if (!zu81Var.b0 && ((i = qd81Var2.S) == -1 || i != qd81Var.S)) {
            return false;
        }
        if (zu81Var.d0) {
            return true;
        }
        return this.N == ml81Var.N && this.O == ml81Var.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ml81 ml81Var) {
        boolean z = this.B;
        boolean z2 = this.y;
        f371 a = (z2 && z) ? ba71.i : ba71.i.a();
        boolean z3 = ml81Var.B;
        int i = ml81Var.L;
        wd81 g = u681.g(ena1.a(z, z3));
        Integer valueOf = Integer.valueOf(this.D);
        Integer valueOf2 = Integer.valueOf(ml81Var.D);
        n62.a.getClass();
        io2 io2Var = io2.a;
        wd81 d = g.d(valueOf, valueOf2, io2Var).b(this.C, ml81Var.C).b(this.E, ml81Var.E).e(this.I, ml81Var.I).e(this.F, ml81Var.F).d(Integer.valueOf(this.G), Integer.valueOf(ml81Var.G), io2Var).b(this.H, ml81Var.H).e(z2, ml81Var.y).d(Integer.valueOf(this.M), Integer.valueOf(ml81Var.M), io2Var);
        int i2 = this.L;
        wd81 d2 = d.d(Integer.valueOf(i2), Integer.valueOf(i), this.A.P ? ba71.i.a() : ba71.j).e(this.N, ml81Var.N).e(this.O, ml81Var.O).d(Integer.valueOf(this.J), Integer.valueOf(ml81Var.J), a).d(Integer.valueOf(this.K), Integer.valueOf(ml81Var.K), a);
        Integer valueOf3 = Integer.valueOf(i2);
        Integer valueOf4 = Integer.valueOf(i);
        if (!rf71.o(this.z, ml81Var.z)) {
            a = ba71.j;
        }
        return d2.d(valueOf3, valueOf4, a).a();
    }
}

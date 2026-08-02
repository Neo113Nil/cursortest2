package defpackage;

import android.os.Trace;
import androidx.compose.foundation.pager.d;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class h890 {
    public final nw70 a;
    public final wx40 b = y5w.a();
    public final xx40 c = new xx40((Object) null);
    public final ux40 d;
    public final wx40 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final c6y n;
    public final p370 o;

    public h890(nw70 nw70Var, c6y c6yVar, ny8 ny8Var) {
        this.a = nw70Var;
        int i = r5w.a;
        this.d = new ux40((Object) null);
        this.e = y5w.a();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = c6yVar;
        this.o = new p370(14, ny8Var);
    }

    public final int a(p370 p370Var, int i, boolean z) {
        List list;
        List list2;
        wx40 wx40Var = this.e;
        if (wx40Var.a(i)) {
            return ((qd7) wx40Var.b(i)).b;
        }
        wx40 wx40Var2 = this.b;
        int i2 = 0;
        if (wx40Var2.a(i)) {
            if (!z || (list2 = (List) wx40Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((b6y) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        wc7 wc7Var = new wc7(this, p370Var, i2);
        s890 s890Var = (s890) p370Var.c;
        if (s890Var == null) {
            s890Var = null;
        }
        long j = s890Var.u;
        c6y c6yVar = (c6y) p370Var.w;
        wx40Var2.i(i, Collections.singletonList((c6yVar != null ? c6yVar : null).a(i, j, true, new zl50(24, wc7Var, p370Var))));
        if (!z || (list = (List) wx40Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((b6y) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(p370 p370Var, int i, int i2) {
        int i3;
        int i4;
        wx40 wx40Var = this.e;
        qd7 qd7Var = (qd7) wx40Var.b(i);
        m501 m501Var = qd7.c;
        if (qd7Var != null) {
            qd7Var.b = i2;
            qd7Var.a = m501Var;
        } else {
            qd7Var = new qd7();
            qd7Var.a = m501Var;
            qd7Var.b = i2;
        }
        wx40Var.i(i, qd7Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > 0.0f && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            p370Var.getClass();
            if (i4 != -1 && i4 < this.m) {
                wc7 wc7Var = new wc7(this, p370Var, i5);
                s890 s890Var = (s890) p370Var.c;
                if (s890Var == null) {
                    s890Var = null;
                }
                long j = s890Var.u;
                c6y c6yVar = (c6y) p370Var.w;
                this.b.i(i4, Collections.singletonList((c6yVar != null ? c6yVar : null).a(i4, j, true, new zl50(24, wc7Var, p370Var))));
            }
        }
        h();
    }

    public final void d(p370 p370Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int b = m810.b(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (b > i8) {
                    b = i8;
                }
                this.j = b;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int a = a(p370Var, this.h - 1, i6 + (-1) == i + (-1) && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (a == -1) {
                    return;
                }
                this.h--;
                this.j -= a;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int b2 = m810.b(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (b2 > i9) {
                b2 = i9;
            }
            this.k = b2;
        }
        while (this.k > 0) {
            int i10 = this.i;
            p370Var.getClass();
            if (i10 == -1 || (i7 = this.i) >= this.m - 1) {
                return;
            }
            int a2 = a(p370Var, this.i + 1, i7 + 1 == i2 + 1 && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (a2 == -1) {
                return;
            }
            this.i++;
            this.k -= a2;
        }
    }

    public final void e(float f, s890 s890Var) {
        h890 h890Var;
        int i;
        int i2;
        p370 p370Var = this.o;
        p370Var.c = s890Var;
        p370Var.w = this.n;
        float f2 = -f;
        h();
        if (p370Var.p()) {
            s890 s890Var2 = (s890) p370Var.c;
            if (s890Var2 == null) {
                s890Var2 = null;
            }
            h6u0.i(s890Var2);
            s890 s890Var3 = (s890) p370Var.c;
            if (s890Var3 == null) {
                s890Var3 = null;
            }
            fwi fwiVar = s890Var3.t;
            this.m = p370Var.x();
            int o = p370Var.o();
            int s = p370Var.s();
            int x = p370Var.x();
            int u = p370Var.u();
            int t = p370Var.t();
            wx40 wx40Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - u;
                this.h = o;
                while (this.j > 0 && (i2 = this.h) > 0 && wx40Var.a(i2 - 1)) {
                    this.h--;
                    this.j -= ((qd7) wx40Var.b(this.h - 1)).b;
                }
                f(0, this.h - 1);
            } else {
                this.k = 0 - t;
                this.i = s;
                while (this.k > 0 && (i = this.i) < x - 1 && wx40Var.a(i + 1)) {
                    int i3 = ((qd7) wx40Var.b(this.i + 1)).b;
                    this.i++;
                    this.k -= i3;
                }
                f(this.i + 1, x - 1);
            }
        }
        if (p370Var.p()) {
            s890 s890Var4 = (s890) p370Var.c;
            if (s890Var4 == null) {
                s890Var4 = null;
            }
            h6u0.i(s890Var4);
            s890 s890Var5 = (s890) p370Var.c;
            h890Var = this;
            h890Var.d(p370Var, p370Var.o(), p370Var.s(), (s890Var5 != null ? s890Var5 : null).t != null ? ((d) this.a.b).o : 0, p370Var.t(), p370Var.u(), f2, f2 <= 0.0f);
        } else {
            h890Var = this;
        }
        h890Var.f = f2;
        h890Var.h();
    }

    public final void f(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i3;
        char c3;
        int i4;
        xx40 xx40Var = this.c;
        xx40Var.b();
        wx40 wx40Var = this.b;
        int[] iArr3 = wx40Var.b;
        long[] jArr3 = wx40Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr3[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr3[(i5 << 3) + i7]) && i4 <= i2) {
                            xx40Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        ux40 ux40Var = this.d;
        int[] iArr4 = ux40Var.b;
        long[] jArr4 = ux40Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr4[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr4[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                xx40Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        wx40 wx40Var2 = this.e;
        int[] iArr5 = wx40Var2.b;
        long[] jArr5 = wx40Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr5[i12];
                if ((((~j6) << c2) & j6 & j3) != j3) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr5[(i12 << 3) + i14]) && i3 <= i2) {
                            xx40Var.a(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length3) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr6 = xx40Var.b;
        long[] jArr6 = xx40Var.a;
        int length4 = jArr6.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr6[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr6[(i15 << 3) + i17];
                        List list = (List) wx40Var.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((b6y) list.get(i19)).cancel();
                            }
                        }
                        int c4 = ux40Var.c(i18);
                        if (c4 >= 0) {
                            ux40Var.e--;
                            long[] jArr7 = ux40Var.a;
                            int i20 = ux40Var.d;
                            int i21 = c4 >> 3;
                            int i22 = (c4 & 7) << 3;
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                            long j8 = (jArr7[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr7[i21] = j8;
                            jArr7[(((c4 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        } else {
                            iArr2 = iArr6;
                            jArr2 = jArr6;
                        }
                        wx40Var2.g(i18);
                    } else {
                        iArr2 = iArr6;
                        jArr2 = jArr6;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr6 = iArr2;
                    jArr6 = jArr2;
                }
                iArr = iArr6;
                jArr = jArr6;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr6;
                jArr = jArr6;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr6 = iArr;
            jArr6 = jArr;
        }
    }

    public final void g() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        wx40 wx40Var = this.b;
        long[] jArr = wx40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = wx40Var.b[i4];
                        List list = (List) wx40Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((b6y) list.get(i6)).cancel();
                        }
                        wx40Var.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void h() {
        Trace.setCounter("prefetchWindowStartExtraSpace", this.j);
        Trace.setCounter("prefetchWindowEndExtraSpace", this.k);
        Trace.setCounter("prefetchWindowStartIndex", this.h);
        Trace.setCounter("prefetchWindowEndIndex", this.i);
    }
}

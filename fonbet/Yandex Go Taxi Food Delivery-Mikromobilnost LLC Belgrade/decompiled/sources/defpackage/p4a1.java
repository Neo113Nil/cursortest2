package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.c;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class p4a1 {
    public static bfr a(dl81 dl81Var) {
        dl81Var.m(dl81Var.b + 1);
        int u = dl81Var.u();
        long j = dl81Var.b + u;
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long o = dl81Var.o();
            if (o == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = o;
            jArr2[i2] = dl81Var.o();
            dl81Var.m(dl81Var.b + 2);
            i2++;
        }
        int i3 = dl81Var.b;
        dl81Var.m(i3 + ((int) (j - i3)));
        return new bfr(jArr, jArr2);
    }

    public static oze0 b() {
        return new oze0();
    }

    public static pze0 c() {
        return pze0.e;
    }

    public static final f530 d(f530 f530Var, c cVar, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        return f530Var.k(new nly0(cVar, tlsVar, tlsVar2, tlsVar3));
    }

    public static final zii0 e(zii0 zii0Var, rzx rzxVar, rzx rzxVar2) {
        if (!rzxVar.d() || !rzxVar2.d()) {
            return zii0.e;
        }
        return wwg.b(rzxVar2.T(gwk0.o(rzxVar), zii0Var.e()), zii0Var.d());
    }

    public static final long f(long j, long j2) {
        int d;
        int f = asy0.f(j);
        int e = asy0.e(j);
        if ((asy0.f(j2) < asy0.e(j)) && (asy0.f(j) < asy0.e(j2))) {
            if ((asy0.f(j2) <= asy0.f(j)) && (asy0.e(j) <= asy0.e(j2))) {
                f = asy0.f(j2);
                e = f;
            } else {
                if ((asy0.f(j) <= asy0.f(j2)) && (asy0.e(j2) <= asy0.e(j))) {
                    d = asy0.d(j2);
                } else {
                    int f2 = asy0.f(j2);
                    if (f >= asy0.e(j2) || f2 > f) {
                        e = asy0.f(j2);
                    } else {
                        f = asy0.f(j2);
                        d = asy0.d(j2);
                    }
                }
                e -= d;
            }
        } else if (e > asy0.f(j2)) {
            f -= asy0.d(j2);
            d = asy0.d(j2);
            e -= d;
        }
        return eja1.c(f, e);
    }
}

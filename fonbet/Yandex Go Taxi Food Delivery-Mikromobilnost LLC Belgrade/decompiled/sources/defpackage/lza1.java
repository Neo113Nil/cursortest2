package defpackage;

import android.graphics.PointF;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class lza1 {
    public static final int a(oay oayVar, long j, xp31 xp31Var) {
        dry0 dry0Var;
        long mo44screenToLocalMKHz9U;
        int f;
        ery0 d = oayVar.d();
        if (d != null && (dry0Var = d.a) != null) {
            hm40 hm40Var = dry0Var.b;
            rzx c = oayVar.c();
            if (c != null && (f = f(hm40Var, (mo44screenToLocalMKHz9U = c.mo44screenToLocalMKHz9U(j)), xp31Var)) != -1) {
                return hm40Var.g(wu60.a((hm40Var.b(f) + hm40Var.f(f)) / 2.0f, mo44screenToLocalMKHz9U, 1));
            }
        }
        return -1;
    }

    public static final long b(oay oayVar, zii0 zii0Var, zii0 zii0Var2, int i) {
        long g = g(oayVar, zii0Var, i);
        if (asy0.c(g)) {
            return asy0.b;
        }
        long g2 = g(oayVar, zii0Var2, i);
        if (asy0.c(g2)) {
            return asy0.b;
        }
        int i2 = (int) (g >> 32);
        int min = Math.min(i2, i2);
        int i3 = (int) (g2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return eja1.c(min, Math.max(i3, i3));
    }

    public static final boolean c(dry0 dry0Var, int i) {
        int d = dry0Var.b.d(i);
        return i == dry0Var.k(d) || i == dry0Var.b.c(d, false) ? dry0Var.l(i) != dry0Var.a(i) : dry0Var.a(i) != dry0Var.a(i - 1);
    }

    public static final long d(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final w53 e(Pair... pairArr) {
        w53 w53Var = new w53(pairArr.length);
        for (Pair pair : pairArr) {
            w53Var.put(pair.c(), pair.f());
        }
        return w53Var;
    }

    public static final int f(hm40 hm40Var, long j, xp31 xp31Var) {
        float d = xp31Var != null ? xp31Var.d() : 0.0f;
        int i = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
        int e = hm40Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < hm40Var.f(e) - d || Float.intBitsToFloat(i) > hm40Var.b(e) + d) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-d) || Float.intBitsToFloat(i2) > hm40Var.d + d) {
            return -1;
        }
        return e;
    }

    public static final long g(oay oayVar, zii0 zii0Var, int i) {
        dry0 dry0Var;
        s2u0 s2u0Var = zoy0.b;
        ery0 d = oayVar.d();
        hm40 hm40Var = (d == null || (dry0Var = d.a) == null) ? null : dry0Var.b;
        rzx c = oayVar.c();
        return (hm40Var == null || c == null) ? asy0.b : hm40Var.h(zii0Var.j(c.mo44screenToLocalMKHz9U(0L)), i, s2u0Var);
    }

    public static final boolean h(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean i(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean j(int i) {
        int type;
        return (!i(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final Long k(dnm0 dnm0Var) {
        mza1 mza1Var = dnm0Var.a;
        if (mza1Var instanceof onm0) {
            return Long.valueOf(TimeUnit.MINUTES.toMillis(((onm0) mza1Var).a));
        }
        if (!(mza1Var instanceof pnm0)) {
            w511.b();
            return null;
        }
        v5z0 v5z0Var = ((pnm0) mza1Var).a;
        long I = vng.I();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(I);
        calendar.set(11, v5z0Var.a);
        calendar.set(12, v5z0Var.b);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() - I;
        Long valueOf = Long.valueOf(timeInMillis);
        if (timeInMillis > 0) {
            return valueOf;
        }
        return null;
    }

    public static int l(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}

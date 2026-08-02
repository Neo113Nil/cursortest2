package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.a;
import com.yandex.mapkit.ScreenPoint;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class fx91 {
    public static final void a(boolean z, tls tlsVar, f530 f530Var, boolean z2, String str, fid fidVar, int i) {
        boolean z3;
        int i2;
        tls tlsVar2;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(265034672);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (btsVar.a(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 32 : 16;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(str) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar.t(false);
            oz40 c = a.c(zx40Var, btsVar);
            qnm qnmVar = qnm.a;
            long V = qnm.c(btsVar).V();
            long Z = qnm.c(btsVar).Z();
            if (((Boolean) c.getValue()).booleanValue()) {
                btsVar.e0(1498557977);
                j = qnm.b(btsVar).c;
                btsVar.t(false);
            } else {
                btsVar.e0(1498620256);
                j = qnm.b(btsVar).a;
                btsVar.t(false);
            }
            long j2 = j;
            qnm.b.getClass();
            long d = lsm.d();
            long d2 = lsm.d();
            long Z2 = qnm.c(btsVar).Z();
            btsVar.e0(1295276557);
            long W = ((Boolean) c.getValue()).booleanValue() ? qnm.c(btsVar).W() : V;
            btsVar.t(false);
            syw0 syw0Var = new syw0(Z, j2, d, d2, Z2, W, lsm.d(), lsm.d(), qnm.c(btsVar).Z(), qnm.b(btsVar).a, lsm.d(), lsm.d(), qnm.c(btsVar).Z(), V, lsm.d(), lsm.d());
            f530 b = z2 ? f530Var : tra1.b(f530Var, 0.48f);
            btsVar.e0(-1633490746);
            boolean z4 = ((i2 & HProv.ALG_CLASS_ALL) == 16384) | ((i2 & 7168) == 2048);
            Object Q2 = btsVar.Q();
            if (z4 || Q2 == o430Var) {
                Q2 = new lo1(str, z2, 7);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            f530 b2 = fnq0.b(b, false, (tls) Q2);
            v6d.a.getClass();
            jzw0.a(z3, tlsVar2, b2, v6d.b, z2, syw0Var, zx40Var, btsVar, (i2 & 14) | 1575936 | (i2 & 112) | ((i2 << 3) & HProv.ALG_CLASS_ALL));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new osm(z, tlsVar, f530Var, z2, str, i, 1);
        }
    }

    public static final boolean b(ScreenPoint screenPoint, ScreenPoint screenPoint2) {
        if (jl40.k(screenPoint != null ? Float.valueOf(screenPoint.getX()) : null, screenPoint2 != null ? Float.valueOf(screenPoint2.getX()) : null)) {
            return jl40.k(screenPoint != null ? Float.valueOf(screenPoint.getY()) : null, screenPoint2 != null ? Float.valueOf(screenPoint2.getY()) : null);
        }
        return false;
    }

    public static final boolean c(mav mavVar, Integer num) {
        lav lavVar = mavVar instanceof lav ? (lav) mavVar : null;
        return ((lavVar != null ? lavVar.b : -1) / 100 == 4 || mavVar != null) && num != null && num.intValue() == 1;
    }

    public static final f530 d(f530 f530Var, wkp0 wkp0Var, Orientation orientation, c cVar, boolean z, snr snrVar, ay40 ay40Var, g890 g890Var) {
        return lnb1.a(f530Var, orientation).k(new tjp0(g890Var, snrVar, ay40Var, wkp0Var, cVar, orientation, z, false));
    }
}

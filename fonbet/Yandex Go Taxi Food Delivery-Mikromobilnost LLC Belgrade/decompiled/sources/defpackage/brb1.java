package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class brb1 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(au2 au2Var, sls slsVar, String str, f530 f530Var, boolean z, fid fidVar, int i, int i2) {
        int i3;
        sls slsVar2;
        f530 f530Var2;
        int i4;
        boolean z2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1370927277);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(au2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
                btsVar.Y();
                z2 = z;
            } else {
                f530 f530Var3 = i5 != 0 ? c530.a : f530Var2;
                f530 d = q791.d(q6a1.c(ljs0.i(f530Var3, dsz0.b), true), true, null, new awk0(0), slsVar2, 10);
                z910 d2 = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d3 = b.d(btsVar, d);
                ohd.G1.getClass();
                sls slsVar3 = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar3);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d2);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d3);
                sya1.a(au2Var, null, str, null, btsVar, i4 & 910, 10);
                btsVar.t(true);
                z2 = true;
                f530Var2 = f530Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new egb(au2Var, slsVar, str, f530Var2, z2, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static zw40 b(String str, String str2, m5j0 m5j0Var) {
        StringBuilder t = qv10.t("form-data; name=");
        wg10 wg10Var = ax40.f;
        arb1.b(str, t);
        if (str2 != null) {
            t.append("; filename=");
            arb1.b(str2, t);
        }
        String sb = t.toString();
        keu keuVar = new keu();
        keuVar.c("Content-Disposition", sb);
        meu d = keuVar.d();
        if (d.a("Content-Type") != null) {
            ny61.g("Unexpected header: Content-Type");
            return null;
        }
        if (d.a("Content-Length") == null) {
            return new zw40(d, m5j0Var);
        }
        ny61.g("Unexpected header: Content-Length");
        return null;
    }

    public static final boolean c(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}

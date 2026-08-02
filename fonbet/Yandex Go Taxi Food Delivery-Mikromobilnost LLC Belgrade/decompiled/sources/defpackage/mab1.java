package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class mab1 {
    public static k6x a;
    public static u4x b;
    public static r1s c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, to5 to5Var3, sls slsVar, fid fidVar, int i, int i2) {
        sls slsVar2;
        int i3;
        int i4;
        f530 f530Var2;
        wls wlsVar3;
        to5 to5Var4;
        wls wlsVar4;
        to5 to5Var5;
        to5 to5Var6;
        sls slsVar3;
        aii0 v;
        to5 to5Var7;
        wls wlsVar5;
        sls slsVar4;
        wls wlsVar6;
        f530 f530Var3;
        to5 to5Var8;
        to5 to5Var9 = x4c.F;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1216729095);
        int i5 = i | 224694;
        if ((i2 & 64) == 0) {
            slsVar2 = slsVar;
            if (btsVar.e(slsVar2)) {
                i3 = 1048576;
                i4 = i5 | i3;
                if (btsVar.V(i4 & 1, (599187 & i4) == 599186)) {
                    btsVar.Y();
                    f530Var2 = f530Var;
                    wlsVar3 = wlsVar;
                    to5Var4 = to5Var;
                    wlsVar4 = wlsVar2;
                    to5Var5 = to5Var2;
                    to5Var6 = to5Var3;
                    slsVar3 = slsVar2;
                } else {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        m3d m3dVar = m3d.a;
                        m3dVar.getClass();
                        a aVar = m3d.b;
                        m3dVar.getClass();
                        a aVar2 = m3d.c;
                        int i6 = i2 & 64;
                        c530 c530Var = c530.a;
                        if (i6 != 0) {
                            slsVar2 = (sls) btsVar.m(c3z.a);
                        }
                        to5Var7 = to5Var9;
                        wlsVar5 = aVar2;
                        slsVar4 = slsVar2;
                        wlsVar6 = aVar;
                        f530Var3 = c530Var;
                        to5Var8 = to5Var7;
                    } else {
                        btsVar.Y();
                        f530Var3 = f530Var;
                        to5Var8 = to5Var;
                        wlsVar5 = wlsVar2;
                        to5Var9 = to5Var2;
                        to5Var7 = to5Var3;
                        slsVar4 = slsVar2;
                        wlsVar6 = wlsVar;
                    }
                    btsVar.u();
                    to5 to5Var10 = to5Var9;
                    rab1.b(f530Var3, wlsVar6, to5Var8, wlsVar5, to5Var10, wwg.S(1522014880, true, new us4(2, slsVar4), btsVar), to5Var7, btsVar, 1797558, 0);
                    f530Var2 = f530Var3;
                    wlsVar3 = wlsVar6;
                    to5Var4 = to5Var8;
                    wlsVar4 = wlsVar5;
                    to5Var5 = to5Var10;
                    to5Var6 = to5Var7;
                    slsVar3 = slsVar4;
                }
                v = btsVar.v();
                if (v == null) {
                    v.d = new ft0(f530Var2, wlsVar3, to5Var4, wlsVar4, to5Var5, to5Var6, slsVar3, i, i2);
                    return;
                }
                return;
            }
        } else {
            slsVar2 = slsVar;
        }
        i3 = 524288;
        i4 = i5 | i3;
        if (btsVar.V(i4 & 1, (599187 & i4) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1880168439);
        int i2 = i | 6 | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var = c530.a;
            } else {
                btsVar.Y();
            }
            f530 f530Var2 = f530Var;
            btsVar.u();
            slsVar2 = slsVar;
            nab1.a(xtb1.c(), ohb1.e(btsVar, xxh0.common_close), slsVar2, f530Var2, btsVar, ((i2 << 3) & 896) | HProv.ALG_TYPE_SECURECHANNEL, 0);
            f530Var = f530Var2;
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(f530Var, slsVar2, i, 1);
        }
    }

    public static final void c(wg6 wg6Var, f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, to5 to5Var3, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        wls wlsVar3;
        to5 to5Var4;
        wls wlsVar4;
        to5 to5Var5;
        to5 to5Var6;
        to5 to5Var7;
        to5 to5Var8;
        to5 to5Var9;
        wls wlsVar5;
        wls wlsVar6;
        f530 f530Var3;
        to5 to5Var10 = x4c.F;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(37857312);
        int i2 = i | (btsVar2.k(wg6Var) ? 4 : 2) | 1797552 | (btsVar2.e(slsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i2 & 1, (4793491 & i2) != 4793490)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                m3d m3dVar = m3d.a;
                m3dVar.getClass();
                a aVar = m3d.d;
                m3dVar.getClass();
                to5Var7 = to5Var10;
                to5Var8 = to5Var7;
                to5Var9 = to5Var8;
                wlsVar5 = m3d.e;
                wlsVar6 = aVar;
                f530Var3 = c530.a;
            } else {
                btsVar2.Y();
                f530Var3 = f530Var;
                wlsVar6 = wlsVar;
                to5Var7 = to5Var;
                wlsVar5 = wlsVar2;
                to5Var8 = to5Var2;
                to5Var9 = to5Var3;
            }
            btsVar2.u();
            btsVar = btsVar2;
            rab1.a(wg6Var, f530Var3, wlsVar6, to5Var7, wlsVar5, to5Var8, wwg.S(-610822868, true, new us4(3, slsVar), btsVar2), to5Var9, btsVar, (i2 & 14) | 14380464, 0);
            f530Var2 = f530Var3;
            wlsVar3 = wlsVar6;
            to5Var4 = to5Var7;
            wlsVar4 = wlsVar5;
            to5Var5 = to5Var8;
            to5Var6 = to5Var9;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
            wlsVar3 = wlsVar;
            to5Var4 = to5Var;
            wlsVar4 = wlsVar2;
            to5Var5 = to5Var2;
            to5Var6 = to5Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ze6(wg6Var, f530Var2, wlsVar3, to5Var4, wlsVar4, to5Var5, to5Var6, slsVar, i);
        }
    }
}

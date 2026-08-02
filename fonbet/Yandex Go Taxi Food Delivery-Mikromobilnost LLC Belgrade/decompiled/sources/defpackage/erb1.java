package defpackage;

import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class erb1 {
    public static final void a(psz0 psz0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1279625175);
        int i2 = i | (btsVar.k(psz0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            ttb1.a(psz0Var, c530Var, k.e(null, 3), k.f(null, 3), "EndButtonItem", wwg.S(-1967840242, true, new o91(10, tlsVar), btsVar), btsVar, (i2 & 14) | 224688, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) psz0Var, (Object) f530Var2, tlsVar, i, 18);
        }
    }

    public static final void b(int i, fid fidVar, f530 f530Var, String str) {
        f530 f530Var2;
        String str2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1232038682);
        int i2 = 4;
        int i3 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            w2o e = k.e(null, 3);
            zmo f = k.f(null, 3);
            med.a.getClass();
            f530Var2 = f530Var;
            str2 = str;
            ttb1.a(str2, f530Var2, e, f, "StartButtonBadge", med.b, btsVar, (i3 & 14) | 224640 | (i3 & 112), 0);
        } else {
            f530Var2 = f530Var;
            str2 = str;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kga(str2, f530Var2, i, i2);
        }
    }

    public static final void c(msz0 msz0Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(165757976);
        int i2 = 2;
        int i3 = i | (btsVar.k(msz0Var) ? 4 : 2) | 48 | (btsVar.k(yurVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            ttb1.a(msz0Var, c530Var, k.e(null, 3), k.f(null, 3), "StartButtonBadgeItem", wwg.S(1314374110, true, new n91(yurVar, tlsVar, i2), btsVar), btsVar, (i3 & 14) | 224688, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(msz0Var, f530Var2, yurVar, tlsVar, i, 25);
        }
    }

    public static final void d(psz0 psz0Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1036318312);
        int i2 = i | (btsVar.k(psz0Var) ? 4 : 2) | 48 | (btsVar.k(yurVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            etz0 etz0Var = psz0Var.c;
            c530 c530Var = c530.a;
            f530 d = hi91.d(gi91.b(c530Var, yurVar), false, null, 3);
            au2 au2Var = psz0Var.a;
            boolean z = true;
            String str = psz0Var.b;
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean e = btsVar.e(etz0Var) | z;
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new xsz0(tlsVar, etz0Var, 0);
                btsVar.o0(Q);
            }
            nab1.b(au2Var, str, (sls) Q, d, btsVar, 0, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(psz0Var, f530Var2, yurVar, tlsVar, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(jtz0 jtz0Var, wg6 wg6Var, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        wg6 wg6Var2;
        f530 f530Var2;
        int i4;
        f530 f530Var3;
        yur yurVar2;
        aii0 v;
        yur yurVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(141945544);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(jtz0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            wg6Var2 = wg6Var;
            i3 |= btsVar.k(wg6Var2) ? 32 : 16;
        } else {
            wg6Var2 = wg6Var;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.k(yurVar) ? 2048 : 1024;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i3 |= btsVar.e(tlsVar) ? 16384 : 8192;
                }
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                    if (i4 != 0) {
                        Object Q = btsVar.Q();
                        if (Q == did.a) {
                            Q = vfc.g(btsVar);
                        }
                        yurVar3 = (yur) Q;
                    } else {
                        yurVar3 = yurVar;
                    }
                    int i6 = i3 >> 3;
                    rab1.a(wg6Var2, f530Var4, wwg.S(-304666536, true, new nvs0(jtz0Var.a, yurVar3, tlsVar, 17), btsVar), null, null, null, wwg.S(-451835692, true, new hex0(14, jtz0Var.b, tlsVar), btsVar), null, btsVar, (i6 & 14) | 1573248 | (i6 & 112), 184);
                    yurVar2 = yurVar3;
                    f530Var3 = f530Var4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    yurVar2 = yurVar;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new xg0(jtz0Var, wg6Var, f530Var3, yurVar2, tlsVar, i, i2);
                    return;
                }
                return;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final lx40 f(wg6 wg6Var, boolean z, int i, fid fidVar, int i2, int i3) {
        boolean z2 = (i3 & 2) != 0;
        if ((i3 & 4) != 0) {
            i = -1;
        }
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.f(0.0f);
            btsVar.o0(Q);
        }
        tx40 tx40Var = (tx40) Q;
        int i4 = (i2 & 14) ^ 6;
        boolean z3 = (i4 > 4 && btsVar.k(wg6Var)) || (i2 & 6) == 4;
        Object Q2 = btsVar.Q();
        if (z3 || Q2 == o430Var) {
            Q2 = new mx40(tx40Var, z2, wg6Var);
            btsVar.o0(Q2);
        }
        mx40 mx40Var = (mx40) Q2;
        boolean z4 = (i4 > 4 && btsVar.k(wg6Var)) || (i2 & 6) == 4;
        Object Q3 = btsVar.Q();
        if (z4 || Q3 == o430Var) {
            Q3 = new dtr0(wg6Var.e(i, mx40Var));
            btsVar.o0(Q3);
        }
        int i5 = ((dtr0) Q3).a;
        boolean z5 = (i4 > 4 && btsVar.k(wg6Var)) || (i2 & 6) == 4;
        Object Q4 = btsVar.Q();
        if (z5 || Q4 == o430Var) {
            Q4 = new lx40(wg6Var, i5, tx40Var);
            btsVar.o0(Q4);
        }
        lx40 lx40Var = (lx40) Q4;
        if (z) {
            wg6Var.f = i5;
        }
        boolean k = btsVar.k(mx40Var) | ((i4 > 4 && btsVar.k(wg6Var)) || (i2 & 6) == 4);
        Object Q5 = btsVar.Q();
        if (k || Q5 == o430Var) {
            Q5 = new t130(26, wg6Var, mx40Var);
            btsVar.o0(Q5);
        }
        zpn.a(wg6Var, (tls) Q5, btsVar);
        return lx40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int g(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }
}

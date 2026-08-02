package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class f810 {
    public static final a7u0 a;

    static {
        sb2.I(new g110(9));
        a = new a7u0(new g110(10));
    }

    public static final void a(final agc agcVar, final ya30 ya30Var, final wir0 wir0Var, final bq11 bq11Var, final wls wlsVar, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(904511636);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(agcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ya30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(wir0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(bq11Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(wlsVar) ? 16384 : 8192;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            hsk0 a2 = esk0.a(7, 0.0f, false);
            long j = agcVar.a;
            boolean d = btsVar.d(j);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                Q = new osy0(j, ldc.b(j, 0.4f, 0.0f, 0.0f, 0.0f, 14));
                btsVar.o0(Q);
            }
            sb2.c(new vvf0[]{dgc.a.a(agcVar), a.a(ya30Var), lrv.a.a(a2), zir0.a.a(wir0Var), psy0.a.a((osy0) Q), eq11.a.a(bq11Var)}, wwg.S(-1750539308, true, new d810(bq11Var, wlsVar, i3), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: e810
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f810.a(agc.this, ya30Var, wir0Var, bq11Var, wlsVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        if ((r13 & 4) != 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(agc agcVar, wir0 wir0Var, bq11 bq11Var, wls wlsVar, fid fidVar, final int i, final int i2) {
        final wls wlsVar2;
        final bq11 bq11Var2;
        final wir0 wir0Var2;
        final agc agcVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-449719819);
        int i3 = (((i2 & 1) == 0 && btsVar.k(agcVar)) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && btsVar.k(wir0Var)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && btsVar.k(bq11Var)) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(wlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if ((i2 & 1) != 0) {
                    agcVar = (agc) btsVar.m(dgc.a);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    wir0Var = (wir0) btsVar.m(zir0.a);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    bq11Var = (bq11) btsVar.m(eq11.a);
                    i3 &= -897;
                }
                agc agcVar3 = agcVar;
                wir0 wir0Var3 = wir0Var;
                bq11 bq11Var3 = bq11Var;
                btsVar.u();
                int i4 = i3 << 3;
                a(agcVar3, (ya30) btsVar.m(a), wir0Var3, bq11Var3, wlsVar, btsVar, (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL));
                wlsVar2 = wlsVar;
                agcVar2 = agcVar3;
                wir0Var2 = wir0Var3;
                bq11Var2 = bq11Var3;
            } else {
                btsVar.Y();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
        } else {
            wlsVar2 = wlsVar;
            btsVar.Y();
            bq11Var2 = bq11Var;
            wir0Var2 = wir0Var;
            agcVar2 = agcVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: c810
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f810.b(agc.this, wir0Var2, bq11Var2, wlsVar2, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }
}

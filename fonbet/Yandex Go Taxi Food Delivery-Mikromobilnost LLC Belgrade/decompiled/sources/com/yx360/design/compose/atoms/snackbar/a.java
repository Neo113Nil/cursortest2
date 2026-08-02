package com.yx360.design.compose.atoms.snackbar;

import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.window.e;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.atm;
import defpackage.aw91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.did;
import defpackage.eae0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g8e;
import defpackage.ip1;
import defpackage.j9a;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.jsm;
import defpackage.k2z0;
import defpackage.ljs0;
import defpackage.m3u0;
import defpackage.mt1;
import defpackage.nnm;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qnm;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.sd2;
import defpackage.sls;
import defpackage.tls;
import defpackage.tra1;
import defpackage.uge;
import defpackage.urm;
import defpackage.vuz;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xg0;
import defpackage.xsm;
import defpackage.y7m;
import defpackage.ysm;
import defpackage.z910;
import defpackage.z9b;
import defpackage.zpn;
import defpackage.zsm;
import defpackage.zy11;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final float a;
    public static final qwd b;

    static {
        qnm.d.getClass();
        a = 16.0f;
        b = new qwd(new jbm(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, f530 f530Var, xsm xsmVar, Long l, ysm ysmVar, fid fidVar, int i, int i2) {
        int i3;
        Long l2;
        Long l3;
        int w0;
        boolean c;
        Object Q;
        Long l4;
        f530 f530Var2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-105513875);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        if ((i & 384) == 0) {
            i4 |= btsVar.e(xsmVar) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.k(null) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.e(null) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= ImageMetadata.EDGE_MODE;
        } else if ((196608 & i) == 0) {
            l2 = l;
            i4 |= btsVar.k(l2) ? 131072 : 65536;
            if ((1572864 & i) == 0) {
                i4 |= btsVar.k(ysmVar) ? 1048576 : 524288;
            }
            if ((599187 & i4) == 599186 || !btsVar.E()) {
                l3 = i5 == 0 ? null : l2;
                fwi fwiVar = (fwi) btsVar.m(j.h);
                WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                sd2 sd2Var = vuz.o(btsVar).f;
                y7m y7mVar = (y7m) btsVar.m(b);
                w0 = y7mVar == null ? (int) fwiVar.w0(y7mVar.a) : ((int) fwiVar.w0(a)) + sd2Var.e().b;
                btsVar.e0(5004770);
                c = btsVar.c(w0);
                Q = btsVar.Q();
                o430 o430Var = did.a;
                if (!c || Q == o430Var) {
                    Q = new mt1(w0);
                    btsVar.o0(Q);
                }
                mt1 mt1Var = (mt1) Q;
                btsVar.t(false);
                btsVar.e0(1680407604);
                if (l3 != null) {
                    Object value = ysmVar.a.getValue();
                    btsVar.e0(-1633490746);
                    boolean z = ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576);
                    Object Q2 = btsVar.Q();
                    if (z || Q2 == o430Var) {
                        Q2 = new DsSnackbarKt$DsSnackbar$2$1(ysmVar, l3, null);
                        btsVar.o0(Q2);
                    }
                    btsVar.t(false);
                    zpn.f(value, l3, (wls) Q2, btsVar);
                }
                btsVar.t(false);
                b.a(str, ysmVar, btsVar, ((i4 >> 12) & 896) | (i4 & 14));
                e.a(mt1Var, null, new eae0(false, false, 8), wwg.S(-1079110773, true, new atm(ysmVar, str, xsmVar), btsVar), btsVar, 3456, 2);
                l4 = l3;
                f530Var2 = c530.a;
            } else {
                btsVar.Y();
                f530Var2 = f530Var;
                l4 = l2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new xg0(str, f530Var2, xsmVar, l4, ysmVar, i, i2, 7);
                return;
            }
            return;
        }
        l2 = l;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i4) == 599186) {
        }
        if (i5 == 0) {
        }
        fwi fwiVar2 = (fwi) btsVar.m(j.h);
        WeakHashMap weakHashMap2 = androidx.compose.foundation.layout.a.w;
        sd2 sd2Var2 = vuz.o(btsVar).f;
        y7m y7mVar2 = (y7m) btsVar.m(b);
        if (y7mVar2 == null) {
        }
        btsVar.e0(5004770);
        c = btsVar.c(w0);
        Q = btsVar.Q();
        o430 o430Var2 = did.a;
        if (!c) {
        }
        Q = new mt1(w0);
        btsVar.o0(Q);
        mt1 mt1Var2 = (mt1) Q;
        btsVar.t(false);
        btsVar.e0(1680407604);
        if (l3 != null) {
        }
        btsVar.t(false);
        b.a(str, ysmVar, btsVar, ((i4 >> 12) & 896) | (i4 & 14));
        e.a(mt1Var2, null, new eae0(false, false, 8), wwg.S(-1079110773, true, new atm(ysmVar, str, xsmVar), btsVar), btsVar, 3456, 2);
        l4 = l3;
        f530Var2 = c530.a;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(String str, xsm xsmVar, ysm ysmVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(47744354);
        int i2 = 2;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(xsmVar) ? 256 : 128) | (btsVar.k(null) ? 2048 : 1024) | (btsVar.e(null) ? 16384 : 8192) | (btsVar.k(ysmVar) ? 131072 : 65536);
        if ((74883 & i3) == 74882 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var = c530.a;
            f530 w = ljs0.w(c530Var, 3);
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new urm(2);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 b2 = fnq0.b(w, false, (tls) Q);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.e0(5004770);
            int i4 = 1;
            boolean z = (i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new ip1(i4, ysmVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            aw91.a(exw0.a(c530Var, zy11.a, (PointerInputEventHandler) Q2), wwg.S(-1724711549, true, new z9b(i2, xsmVar, str), btsVar), btsVar, 48);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(str, xsmVar, ysmVar, i, 27);
        }
    }

    public static final void c(boolean z, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1368732348);
        int i2 = 4;
        int i3 = (btsVar.a(z) ? 4 : 2) | i;
        c530 c530Var = c530.a;
        int i4 = i3 | (btsVar.k(c530Var) ? 32 : 16);
        if ((i4 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object k = g8e.k(1849434622, btsVar, false);
            if (k == obj) {
                k = new ck11(250, 0, jsm.c);
                btsVar.o0(k);
            }
            ck11 ck11Var = (ck11) k;
            Object k2 = g8e.k(1849434622, btsVar, false);
            if (k2 == obj) {
                k2 = new ck11(250, 0, jsm.d);
                btsVar.o0(k2);
            }
            ck11 ck11Var2 = (ck11) k2;
            btsVar.t(false);
            Boolean valueOf = Boolean.valueOf(z);
            btsVar.e0(-1746271574);
            boolean z2 = (i4 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == obj) {
                Q2 = new DsSnackbarKt$FadeAnimation$1$1(z, ck11Var2, oz40Var, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q2, valueOf);
            float f = z ? 1.0f : 0.0f;
            if (z) {
                ck11Var2 = ck11Var;
            }
            m3u0 b2 = androidx.compose.animation.core.b.b(f, ck11Var2, null, null, btsVar, 0, 28);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                f530 b3 = tra1.b(c530Var, ((Number) b2.getValue()).floatValue());
                z910 d = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, b3);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d2);
                nnm.p(6, aVar, btsVar, true);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(z, aVar, i, i2);
        }
    }

    public static final void d(f530 f530Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-990764728);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(5004770);
            Object Q = btsVar.Q();
            int i3 = 14;
            if (Q == did.a) {
                Q = new k2z0(aVar, i3);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            androidx.compose.ui.layout.e.a(f530Var, (wls) Q, btsVar, i2 & 14, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zsm(f530Var, aVar, i, 1);
        }
    }

    public static final ysm e(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(403874355);
        btsVar.e0(1849434622);
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new ysm(0);
            btsVar.o0(Q);
        }
        ysm ysmVar = (ysm) Q;
        btsVar.t(false);
        btsVar.t(false);
        return ysmVar;
    }
}

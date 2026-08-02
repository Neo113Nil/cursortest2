package com.yandex.go.settings.presentation;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cma1;
import defpackage.did;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ghe;
import defpackage.iwq0;
import defpackage.k2z0;
import defpackage.k3r;
import defpackage.kfr0;
import defpackage.ljs0;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.rzx;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttm;
import defpackage.vvf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zii0;
import defpackage.zpn;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public abstract class c {
    public static final qwd a = new qwd(new iwq0(18));
    public static final qwd b = new qwd(new iwq0(19));
    public static final qwd c = new qwd(new iwq0(20));
    public static final qwd d = new qwd(new iwq0(18));

    public static final void a(oip0 oip0Var, float f, float f2, tls tlsVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        androidx.compose.runtime.internal.a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-248292969);
        int i2 = i | (btsVar.k(oip0Var) ? 4 : 2) | (btsVar.b(f) ? 32 : 16) | (btsVar.b(f2) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.g(0);
                btsVar.o0(Q2);
            }
            yx40 yx40Var = (yx40) Q2;
            oz40 n = f.n(tlsVar, btsVar);
            boolean k = ((i2 & 112) == 32) | ((i2 & 896) == 256) | btsVar.k(fwiVar);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var) {
                Q3 = new ghe(fwiVar.w0(f), fwiVar.w0(f2));
                btsVar.o0(Q3);
            }
            ghe gheVar = (ghe) Q3;
            boolean z = (i2 & 14) == 4;
            Object Q4 = btsVar.Q();
            if (z || Q4 == o430Var) {
                Q4 = new SettingsVisibilityTrackingKt$SettingsVisibilityTrackingBox$1$1(oip0Var, yx40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, oip0Var);
            k3r k3rVar = ljs0.c;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new ttm(23, oz40Var);
                btsVar.o0(Q5);
            }
            f530 y = eja1.y(k3rVar, (tls) Q5);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, y);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            vvf0 a2 = a.a((rzx) oz40Var.getValue());
            vvf0 a3 = b.a(Integer.valueOf(yx40Var.getIntValue()));
            vvf0 a4 = c.a(gheVar);
            boolean k2 = btsVar.k(n);
            Object Q6 = btsVar.Q();
            if (k2 || Q6 == o430Var) {
                Q6 = new ttm(24, n);
                btsVar.o0(Q6);
            }
            aVar2 = aVar;
            sb2.c(new vvf0[]{a2, a3, a4, d.a((tls) Q6)}, wwg.S(1251157341, true, new k2z0(aVar2, 20), btsVar), btsVar, 48);
            btsVar.t(true);
        } else {
            aVar2 = aVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kfr0(oip0Var, f, f2, tlsVar, aVar2, i);
        }
    }

    public static final void b(rzx rzxVar, ghe gheVar, float f, m3u0 m3u0Var, m3u0 m3u0Var2, rzx rzxVar2) {
        tls tlsVar;
        if (rzxVar != null && rzxVar2 != null && rzxVar.d() && rzxVar2.d()) {
            zii0 c2 = c(rzxVar2);
            zii0 c3 = c(rzxVar);
            float f2 = c3.a;
            float f3 = c3.b + gheVar.a;
            float f4 = c3.c;
            float f5 = c3.d - gheVar.b;
            float f6 = c2.c;
            float f7 = c2.b;
            float f8 = c2.d;
            float f9 = c2.a;
            float f10 = f6 - f9;
            if (f10 > 0.0f) {
                float f11 = f8 - f7;
                if (f11 > 0.0f && f4 - f2 > 0.0f && f5 - f3 > 0.0f) {
                    float min = Math.min(f6, f4) - Math.max(f9, f2);
                    if (min < 0.0f) {
                        min = 0.0f;
                    }
                    float min2 = Math.min(f8, f5) - Math.max(f7, f3);
                    r6 = (min * (min2 >= 0.0f ? min2 : 0.0f)) / (f10 * f11);
                }
            }
            if (r6 < f || (tlsVar = (tls) m3u0Var.getValue()) == null) {
                return;
            }
            tlsVar.invoke(m3u0Var2.getValue());
        }
    }

    public static final zii0 c(rzx rzxVar) {
        long m = rzxVar.m(0L);
        int i = (int) (m >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (m & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return new zii0(intBitsToFloat, Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (rzxVar.e() >> 32)), Float.intBitsToFloat(i2) + ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & rzxVar.e())));
    }
}

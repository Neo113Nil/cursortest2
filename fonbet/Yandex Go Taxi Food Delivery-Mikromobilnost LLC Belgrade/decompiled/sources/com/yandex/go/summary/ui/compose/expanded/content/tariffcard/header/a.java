package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.header;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import defpackage.a1f0;
import defpackage.a6n;
import defpackage.aau;
import defpackage.adu;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.azd;
import defpackage.b0;
import defpackage.b8m;
import defpackage.bdp;
import defpackage.bdu;
import defpackage.bli0;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.ctq;
import defpackage.d17;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dx2;
import defpackage.ebp0;
import defpackage.etm;
import defpackage.ety0;
import defpackage.eur0;
import defpackage.evu0;
import defpackage.f530;
import defpackage.ffb1;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g0;
import defpackage.gau;
import defpackage.gi91;
import defpackage.gji0;
import defpackage.gxm;
import defpackage.gz6;
import defpackage.hau;
import defpackage.hgx0;
import defpackage.hi91;
import defpackage.hqb1;
import defpackage.i9a1;
import defpackage.ize0;
import defpackage.j4b1;
import defpackage.jeb1;
import defpackage.jze0;
import defpackage.k651;
import defpackage.kze0;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.m9b1;
import defpackage.mhe;
import defpackage.ml6;
import defpackage.n8v;
import defpackage.nc0;
import defpackage.ncu;
import defpackage.nfj;
import defpackage.ngx0;
import defpackage.nvi0;
import defpackage.o430;
import defpackage.ofb1;
import defpackage.ohd;
import defpackage.os;
import defpackage.oz40;
import defpackage.p7d;
import defpackage.p91;
import defpackage.pdu;
import defpackage.pi6;
import defpackage.pzt;
import defpackage.q791;
import defpackage.qdu;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qiy;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rdu;
import defpackage.rex0;
import defpackage.s1r;
import defpackage.scc;
import defpackage.sdu;
import defpackage.sex0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sxo;
import defpackage.teb;
import defpackage.tex0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tze0;
import defpackage.u9u;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.up2;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vmb1;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x0f0;
import defpackage.x4c;
import defpackage.x91;
import defpackage.xm91;
import defpackage.xya1;
import defpackage.y0f0;
import defpackage.y7m;
import defpackage.y9u;
import defpackage.ydb1;
import defpackage.yex0;
import defpackage.yur;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zoy0;
import defpackage.zpn;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(ebp0 ebp0Var, x91 x91Var, f530 f530Var, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        f530 f530Var2;
        ety0 ety0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(501562862);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = i | (btsVar2.k(ebp0Var2) ? 4 : 2);
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(x91Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            int i4 = hau.a[x91Var.d.ordinal()];
            if (i4 == 1) {
                btsVar2.e0(965581236);
                ety0Var = xya1.e(btsVar2).h.b;
                btsVar2.t(false);
            } else {
                if (i4 != 2) {
                    throw unr0.y(965577645, btsVar2, false);
                }
                btsVar2.e0(965584244);
                ety0Var = xya1.c(btsVar2).h.b;
                btsVar2.t(false);
            }
            ety0 ety0Var2 = ety0Var;
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new teb(20);
                btsVar2.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 a = fnq0.a(c530Var, (tls) Q);
            CharSequence charSequence = x91Var.a;
            wp2 wp2Var = x91Var.c;
            btsVar = btsVar2;
            m9b1.b(ebp0Var2, charSequence, a, wp2Var, ety0Var2, 5, 1, x91Var.b, wp2Var, ety0Var2, 5, 1, BodyAlign.Center, btsVar, (i3 & 14) | 1769472, 25008, 20544);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(ebp0Var, x91Var, f530Var2, i, 18);
        }
    }

    public static final void b(pdu pduVar, f530 f530Var, m3u0 m3u0Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-309359282);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(pduVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.k(m3u0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(yurVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 >> 3;
            int i6 = i5 & HProv.PP_DELETE_SAVED_PASSWD;
            c530 c530Var = c530.a;
            f530 a = bli0.a(bli0.b(c530Var, m3u0Var, btsVar, i6), m3u0Var, btsVar, i5 & 112, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            nvi0 nvi0Var = pduVar.c;
            aau aauVar = pduVar.b;
            c(nvi0Var, pduVar.d, null, tlsVar, btsVar, i5 & 7168);
            uo5 uo5Var = x4c.c;
            cj6 cj6Var = cj6.a;
            g(aauVar.a, cj6Var.a(c530Var, uo5Var), yurVar, tlsVar, btsVar, i5 & 8064, 0);
            f530 a2 = cj6Var.a(c530Var, x4c.A);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, a2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            n(aauVar.b, null, btsVar, 0);
            j(aauVar.c, null, tlsVar, btsVar, (i4 >> 6) & 896);
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((sdu) pduVar, f530Var2, (Object) m3u0Var, (Object) yurVar, tlsVar, i, 18);
        }
    }

    public static final void c(nvi0 nvi0Var, u9u u9uVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        ml6 p;
        ml6 p2;
        Object headerItemKt$BackgroundImageItem$2$1;
        oz40 oz40Var;
        ml6 ml6Var;
        m3u0 m3u0Var;
        boolean z;
        boolean z2;
        pzt pztVar;
        pzt pztVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1288136832);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nvi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(u9uVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            int a = (int) (((k651) btsVar.m(j.u)).a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            boolean c = btsVar.c(a);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = Integer.valueOf((int) (a * 0.6d));
                btsVar.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            btsVar.e0(-948899499);
            boolean c2 = btsVar.c(intValue);
            Object Q2 = btsVar.Q();
            if (c2 || Q2 == o430Var) {
                Q2 = ly3.h(fwiVar.H(intValue), btsVar);
            }
            float f = ((y7m) Q2).a;
            btsVar.t(false);
            Float valueOf = (u9uVar == null || (pztVar2 = u9uVar.a) == null) ? null : Float.valueOf(pztVar2.c);
            Float valueOf2 = (u9uVar == null || (pztVar = u9uVar.b) == null) ? null : Float.valueOf(pztVar.c);
            boolean c3 = btsVar.c(intValue);
            Object Q3 = btsVar.Q();
            if (c3 || Q3 == o430Var) {
                Q3 = f.g(intValue);
                btsVar.o0(Q3);
            }
            yx40 yx40Var = (yx40) Q3;
            btsVar.e0(-948887441);
            boolean c4 = btsVar.c(yx40Var.getIntValue());
            Object Q4 = btsVar.Q();
            if (c4 || Q4 == o430Var) {
                Q4 = ly3.h(fwiVar.H(yx40Var.getIntValue()), btsVar);
            }
            float f2 = ((y7m) Q4).a;
            btsVar.t(false);
            boolean b = btsVar.b(f2) | btsVar.k(valueOf);
            Object Q5 = btsVar.Q();
            if (b || Q5 == o430Var) {
                Q5 = valueOf != null ? new y7m(valueOf.floatValue() * f2) : null;
                btsVar.o0(Q5);
            }
            y7m y7mVar = (y7m) Q5;
            boolean b2 = btsVar.b(f2) | btsVar.k(valueOf2);
            Object Q6 = btsVar.Q();
            if (b2 || Q6 == o430Var) {
                Q6 = valueOf2 != null ? new y7m(valueOf2.floatValue() * f2) : null;
                btsVar.o0(Q6);
            }
            y7m y7mVar2 = (y7m) Q6;
            if (u9uVar == null) {
                btsVar.e0(649708414);
                btsVar.t(false);
                p = null;
            } else {
                btsVar.e0(649708415);
                pzt pztVar3 = u9uVar.a;
                p = p(pztVar3 != null ? pztVar3.a : null, pztVar3 != null ? pztVar3.b : null, btsVar);
                btsVar.t(false);
            }
            if (u9uVar == null) {
                btsVar.e0(649959576);
                btsVar.t(false);
                p2 = null;
            } else {
                btsVar.e0(649959577);
                pzt pztVar4 = u9uVar.b;
                p2 = p(pztVar4 != null ? pztVar4.b : null, pztVar4 != null ? pztVar4.a : null, btsVar);
                btsVar.t(false);
            }
            Object Q7 = btsVar.Q();
            if (Q7 == o430Var) {
                Q7 = f.j(null);
                btsVar.o0(Q7);
            }
            oz40 oz40Var2 = (oz40) Q7;
            int i4 = i3 & 14;
            ml6 ml6Var2 = p;
            m3u0 f3 = ffb1.f(nvi0Var, btsVar, i4);
            boolean k = btsVar.k(f3) | ((i3 & 7168) == 2048) | (i4 == 4);
            Object Q8 = btsVar.Q();
            if (k || Q8 == o430Var) {
                ml6 ml6Var3 = p2;
                oz40Var = oz40Var2;
                ml6Var = ml6Var3;
                m3u0Var = f3;
                headerItemKt$BackgroundImageItem$2$1 = new HeaderItemKt$BackgroundImageItem$2$1(m3u0Var, tlsVar, nvi0Var, oz40Var, null);
                btsVar.o0(headerItemKt$BackgroundImageItem$2$1);
            } else {
                headerItemKt$BackgroundImageItem$2$1 = Q8;
                ml6Var = p2;
                oz40Var = oz40Var2;
                m3u0Var = f3;
            }
            zpn.f(m3u0Var, tlsVar, (wls) headerItemKt$BackgroundImageItem$2$1, btsVar);
            c530 c530Var = c530.a;
            f530 c5 = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c5);
            ohd.G1.getClass();
            sls slsVar = d.b;
            oz40 oz40Var3 = oz40Var;
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            n8v n8vVar = (n8v) oz40Var3.getValue();
            if (n8vVar == null) {
                btsVar.e0(1495055195);
                Object Q9 = btsVar.Q();
                if (Q9 == o430Var) {
                    Q9 = new b8m(64.0f);
                    btsVar.o0(Q9);
                }
                z2 = true;
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), f2), qke.q, false, (eur0) Q9, AppColor$Palette.EverBack, AppColor$Palette.EverFront, false, btsVar, 1772592, 148);
                btsVar.t(false);
            } else {
                btsVar.e0(1495439595);
                f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 0.0f, f, 1);
                boolean k2 = btsVar.k(yx40Var);
                Object Q10 = btsVar.Q();
                if (k2 || Q10 == o430Var) {
                    Q10 = new dx2(yx40Var, 4);
                    btsVar.o0(Q10);
                }
                ml6 ml6Var4 = ml6Var;
                j4b1.c(n8vVar, xm91.b(g, (tls) Q10), null, null, null, mhe.d, 0.0f, 0, btsVar, ImageMetadata.EDGE_MODE, 220);
                btsVar = btsVar;
                cj6 cj6Var = cj6.a;
                if (ml6Var2 == null || y7mVar == null) {
                    btsVar.e0(1495987272);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1495777774);
                    pi6.a(cj6Var.a(m4m0.a(ljs0.e(ljs0.c(c530Var, 1.0f), y7mVar.a), ml6Var2, null, 6), x4c.c), btsVar, 0);
                    btsVar.t(false);
                }
                if (ml6Var4 == null || y7mVar2 == null) {
                    z = false;
                    btsVar.e0(1496291816);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1496073669);
                    z = false;
                    pi6.a(cj6Var.a(m4m0.a(ljs0.e(ljs0.c(c530Var, 1.0f), y7mVar2.a), ml6Var4, null, 6), x4c.B), btsVar, 0);
                    btsVar.t(false);
                }
                btsVar.t(z);
                z2 = true;
            }
            btsVar.t(z2);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(nvi0Var, u9uVar, f530Var2, tlsVar, i, 28);
        }
    }

    public static final void d(qdu qduVar, f530 f530Var, yur yurVar, m3u0 m3u0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-663934112);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qduVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.k(yurVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(m3u0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = bzk0.c(c530Var, appColor$Palette, gji0Var);
            int i4 = i3 >> 6;
            int i5 = i4 & 112;
            f530 a = bli0.a(bli0.c(bli0.b(c, m3u0Var, btsVar, i5), m3u0Var, btsVar, i5 | 384), m3u0Var, btsVar, i5, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            aau aauVar = qduVar.b;
            g(aauVar.a, null, yurVar, tlsVar, btsVar, (i3 & 896) | ((i3 >> 3) & 7168), 2);
            tlsVar2 = tlsVar;
            e(qduVar.c, null, btsVar, 0);
            n(aauVar.b, null, btsVar, 0);
            j(aauVar.c, null, tlsVar2, btsVar, i4 & 896);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((sdu) qduVar, f530Var2, (Object) yurVar, (Object) m3u0Var, tlsVar2, i, 19);
        }
    }

    public static final void e(y9u y9uVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-921673225);
        int i2 = (btsVar.k(y9uVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530Var2 = c530.a;
            f530 f = ljs0.f(ljs0.c(an91.m(f530Var2, 16.0f, 0.0f, 2), 1.0f), 108.0f, 148.0f);
            v0b1.a(y9uVar.a, f, null, null, wwg.S(492294951, true, new os(y9uVar, f, 19), btsVar), null, null, null, 0.0f, 0, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 1004);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(y9uVar, f530Var2, i, 21);
        }
    }

    public static final void f(sdu sduVar, f530 f530Var, m3u0 m3u0Var, yur yurVar, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1347635982);
        int i2 = i | (btsVar.k(sduVar) ? 4 : 2) | 48 | (btsVar.k(m3u0Var) ? 256 : 128) | (btsVar.k(yurVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            if (sduVar instanceof pdu) {
                btsVar.e0(339326013);
                b((pdu) sduVar, null, m3u0Var, yurVar, tlsVar, btsVar, i2 & 65422);
                btsVar.t(false);
            } else if (sduVar instanceof qdu) {
                btsVar.e0(339639268);
                d((qdu) sduVar, null, yurVar, m3u0Var, tlsVar, btsVar, (i3 & 896) | (i2 & 14) | ((i2 << 3) & 7168) | (i2 & HProv.ALG_CLASS_ALL));
                btsVar.t(false);
            } else {
                if (!(sduVar instanceof rdu)) {
                    throw unr0.y(703680734, btsVar, false);
                }
                btsVar.e0(339943595);
                h((rdu) sduVar, null, yurVar, m3u0Var, tlsVar, btsVar, (i3 & 896) | (i2 & 14) | ((i2 << 3) & 7168) | (i2 & HProv.ALG_CLASS_ALL));
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(sduVar, f530Var2, m3u0Var, yurVar, tlsVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(ncu ncuVar, f530 f530Var, yur yurVar, tls tlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-762049727);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(ncuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.k(yurVar) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(tlsVar) ? 2048 : 1024;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                f530Var3 = i4 != 0 ? c530.a : f530Var2;
                x91 x91Var = ncuVar.a;
                yex0 yex0Var = ncuVar.b;
                f530 d = hi91.d(gi91.b(i9a1.f(f530Var3), yurVar), false, null, 3);
                awk0 awk0Var = new awk0(0);
                boolean z = (i3 & 7168) == 2048;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z || Q == o430Var) {
                    Q = new azd(29, tlsVar);
                    btsVar.o0(Q);
                }
                f530 d2 = q791.d(d, false, null, awk0Var, (sls) Q, 11);
                boolean k = btsVar.k(x91Var);
                Object Q2 = btsVar.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new s1r(29, x91Var);
                    btsVar.o0(Q2);
                }
                f530 b = fnq0.b(d2, false, (tls) Q2);
                SlotSize slotSize = SlotSize.L;
                p7d.a.getClass();
                ydb1.a(b, p7d.b, wwg.S(-1146671728, true, new ctq(3, x91Var), btsVar), null, wwg.S(2067951126, true, new nfj(9, yex0Var, tlsVar), btsVar), null, slotSize, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(ncuVar, f530Var3, yurVar, tlsVar, i, i2, 6);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void h(rdu rduVar, f530 f530Var, yur yurVar, m3u0 m3u0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-929912232);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rduVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.k(yurVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(m3u0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            gji0 gji0Var = qke.q;
            c530 c530Var = c530.a;
            f530 c = bzk0.c(c530Var, appColor$Palette, gji0Var);
            int i4 = i3 >> 6;
            int i5 = i4 & 112;
            f530 a = bli0.a(bli0.c(bli0.b(c, m3u0Var, btsVar, i5), m3u0Var, btsVar, i5 | 384), m3u0Var, btsVar, i5, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            aau aauVar = rduVar.b;
            g(aauVar.a, null, yurVar, tlsVar, btsVar, (i3 & 896) | ((i3 >> 3) & 7168), 2);
            tlsVar2 = tlsVar;
            hqb1.b(rduVar.c, an91.o(c530Var, 0.0f, 16.0f, 0.0f, 28.0f, 5), btsVar, 48);
            n(aauVar.b, null, btsVar, 0);
            j(aauVar.c, null, tlsVar2, btsVar, i4 & 896);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((sdu) rduVar, f530Var2, (Object) yurVar, (Object) m3u0Var, tlsVar2, i, 17);
        }
    }

    public static final void i(kze0 kze0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(132865181);
        int i2 = i | (btsVar.k(kze0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = kze0Var instanceof ize0;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-1772960925);
                ize0 ize0Var = (ize0) kze0Var;
                btsVar.e0(-1772844117);
                awk0 awk0Var = new awk0(0);
                boolean k = ((i2 & 896) == 256) | btsVar.k(bdu.a);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (k || Q == o430Var) {
                    Q = new azd(27, tlsVar);
                    btsVar.o0(Q);
                }
                f530 a = vmb1.a(c530Var, false, awk0Var, (sls) Q, 15);
                btsVar.t(false);
                f530 k2 = ofb1.b(ljs0.w(c530Var, 3), ize0Var.c, null, 6).k(a);
                boolean z2 = (i2 & 14) == 4;
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new gau(0, kze0Var);
                    btsVar.o0(Q2);
                }
                f530Var2 = c530Var;
                qgy.b(ize0Var.a, null, an91.o(fnq0.b(k2, false, (tls) Q2), 0.0f, 0.0f, 0.0f, 3.0f, 7), r(ize0Var.b, 0.5f, btsVar), 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 0, 0, 12274);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                f530Var2 = c530Var;
                if (kze0Var instanceof jze0) {
                    btsVar.e0(-1772068466);
                    jze0 jze0Var = (jze0) kze0Var;
                    com.yandex.go.design.compose.loading.b.a(ljs0.n(f530Var2, 64.0f, 13.0f), null, false, null, q(jze0Var.a, jze0Var.b, btsVar), null, false, btsVar, 12582912, 94);
                    btsVar.t(false);
                } else {
                    if (kze0Var != null) {
                        throw unr0.y(-1165572888, btsVar, false);
                    }
                    btsVar.e0(-1771786397);
                    btsVar.t(false);
                }
            }
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(kze0Var, f530Var2, tlsVar, i, 13);
        }
    }

    public static final void j(tze0 tze0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(744367905);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(tze0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            float f = tze0Var.c;
            c530 c530Var = c530.a;
            ydb1.a(an91.o(c530Var, 4.0f, 0.0f, 4.0f, f, 2), null, wwg.S(-439242318, true, new nfj(10, tze0Var, tlsVar), btsVar), null, null, null, SlotSize.XS, false, btsVar, 1573248, 186);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) tze0Var, f530Var2, (Object) tlsVar, i, 17);
        }
    }

    public static final void k(a1f0 a1f0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-118696443);
        int i2 = i | (btsVar.k(a1f0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = a1f0Var instanceof x0f0;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-1327416148);
                x0f0 x0f0Var = (x0f0) a1f0Var;
                adu aduVar = x0f0Var.d;
                o430 o430Var = did.a;
                if (aduVar != null) {
                    btsVar.e0(-1327308733);
                    awk0 awk0Var = new awk0(0);
                    boolean k = ((i2 & 896) == 256) | btsVar.k(aduVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new bdp(23, tlsVar, aduVar);
                        btsVar.o0(Q);
                    }
                    f530Var3 = vmb1.a(c530Var, false, awk0Var, (sls) Q, 15);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1327176797);
                    btsVar.t(false);
                    f530Var3 = c530Var;
                }
                f530 k2 = ofb1.b(ljs0.w(c530Var, 3), x0f0Var.c, null, 6).k(f530Var3);
                boolean z2 = (i2 & 14) == 4;
                Object Q2 = btsVar.Q();
                if (z2 || Q2 == o430Var) {
                    Q2 = new gau(1, a1f0Var);
                    btsVar.o0(Q2);
                }
                f530 b = fnq0.b(k2, false, (tls) Q2);
                f530Var2 = c530Var;
                qgy.b(x0f0Var.a, null, b, x0f0Var.b, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).e.c, null, btsVar, 0, 0, 12274);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                f530Var2 = c530Var;
                if (!(a1f0Var instanceof y0f0)) {
                    throw unr0.y(1896841199, btsVar, false);
                }
                btsVar.e0(-1326671342);
                y0f0 y0f0Var = (y0f0) a1f0Var;
                com.yandex.go.design.compose.loading.b.a(ljs0.n(f530Var2, 64.0f, 24.0f), null, false, null, q(y0f0Var.a, y0f0Var.b, btsVar), null, false, btsVar, 12582912, 94);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(a1f0Var, f530Var2, tlsVar, i, 14);
        }
    }

    public static final void l(tex0 tex0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        c530 c530Var;
        boolean z;
        ety0 ety0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-949559210);
        int i2 = i | (btsVar.k(tex0Var) ? 4 : 2) | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = tex0Var instanceof rex0;
            c530 c530Var2 = c530.a;
            if (z2) {
                btsVar.e0(-1663584221);
                rex0 rex0Var = (rex0) tex0Var;
                if (evu0.J(rex0Var.a)) {
                    c530Var = c530Var2;
                    z = false;
                    btsVar.e0(-1662751220);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1663521229);
                    f530 o = an91.o(ofb1.b(c530Var2, rex0Var.e, null, 6), 0.0f, 0.0f, 0.0f, rex0Var.f, 7);
                    CharSequence charSequence = rex0Var.a;
                    up2 r = r(rex0Var.b, rex0Var.d, btsVar);
                    int i3 = hau.c[rex0Var.c.ordinal()];
                    if (i3 == 1) {
                        btsVar.e0(-1993308131);
                        ety0Var = xya1.e(btsVar).h.a;
                        btsVar.t(false);
                    } else if (i3 == 2) {
                        btsVar.e0(-1993304452);
                        ety0Var = xya1.e(btsVar).h.b;
                        btsVar.t(false);
                    } else {
                        if (i3 != 3) {
                            throw unr0.y(-1993312452, btsVar, false);
                        }
                        btsVar.e0(-1993300932);
                        ety0Var = xya1.e(btsVar).h.b;
                        btsVar.t(false);
                    }
                    c530Var = c530Var2;
                    z = false;
                    qgy.b(charSequence, null, o, r, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, null, btsVar, 0, 0, 12274);
                    btsVar = btsVar;
                    btsVar.t(false);
                }
                btsVar.t(z);
            } else {
                c530Var = c530Var2;
                if (!(tex0Var instanceof sex0)) {
                    throw unr0.y(-1993328827, btsVar, false);
                }
                btsVar.e0(-1662677161);
                sex0 sex0Var = (sex0) tex0Var;
                com.yandex.go.design.compose.loading.b.a(ljs0.n(an91.o(c530Var, 0.0f, 0.0f, 0.0f, sex0Var.a, 7), 200.0f, 16.0f), null, false, null, q(sex0Var.b, sex0Var.c, btsVar), null, false, btsVar, 12582912, 94);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(tex0Var, f530Var2, i, 22);
        }
    }

    public static final void m(yex0 yex0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2067222931);
        int i2 = i | (btsVar.k(yex0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean k = btsVar.k(yex0Var.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new gz6(new up2(up2.b), yex0Var.b);
                btsVar.o0(Q);
            }
            gz6 gz6Var = (gz6) Q;
            boolean z = (i2 & 14) == 4;
            int i3 = i2 & 896;
            boolean z2 = z | (i3 == 256);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new sxo(26, yex0Var, tlsVar);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            f530 o = an91.o(fnq0.b(c530Var, false, (tls) Q2), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z3 = false;
            ButtonSize buttonSize = ButtonSize.L;
            if (i3 == 256) {
                z3 = true;
            }
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new azd(26, tlsVar);
                btsVar.o0(Q3);
            }
            d17.d(o, false, buttonSize, gz6Var, null, (sls) Q3, wwg.S(-802925344, true, new ctq(4, yex0Var), btsVar), btsVar, 1573248, 18);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(yex0Var, f530Var2, tlsVar, i, 12);
        }
    }

    public static final void n(hgx0 hgx0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-488744144);
        int i2 = (btsVar.k(hgx0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new gau(2, hgx0Var);
                btsVar.o0(Q);
            }
            f530Var2 = c530.a;
            ydb1.a(an91.o(fnq0.a(f530Var2, (tls) Q), 2.0f, 2.0f, 2.0f, 0.0f, 8), null, wwg.S(-1503000895, true, new ctq(7, hgx0Var), btsVar), null, null, null, SlotSize.S, false, btsVar, 1573248, 186);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(hgx0Var, f530Var2, i, 24);
        }
    }

    public static final void o(ngx0 ngx0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        ety0 ety0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-157743728);
        int i2 = (btsVar2.k(ngx0Var) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            float f = ngx0Var.d;
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 0.0f, 0.0f, f, 7);
            String str = ngx0Var.a;
            wp2 wp2Var = ngx0Var.b;
            int i3 = hau.b[ngx0Var.c.ordinal()];
            if (i3 == 1) {
                btsVar2.e0(-1267854602);
                ety0Var = xya1.e(btsVar2).g.b;
                btsVar2.t(false);
            } else if (i3 == 2) {
                btsVar2.e0(-1267851434);
                ety0Var = xya1.c(btsVar2).e.c;
                btsVar2.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(-1267858246, btsVar2, false);
                }
                btsVar2.e0(-1267848394);
                ety0Var = xya1.c(btsVar2).e.c;
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            jeb1.f(str, o, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, 0, 0, 16376);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(ngx0Var, f530Var2, i, 23);
        }
    }

    public static final ml6 p(wp2 wp2Var, wp2 wp2Var2, fid fidVar) {
        ldc ldcVar;
        ldc ldcVar2;
        qiy qiyVar = null;
        if (wp2Var == null) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(-945435250);
            btsVar.t(false);
            ldcVar = null;
        } else {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(-1831613229);
            long n = tje.n(wp2Var, btsVar2);
            btsVar2.t(false);
            ldcVar = new ldc(n);
        }
        if (wp2Var2 == null) {
            bts btsVar3 = (bts) fidVar;
            btsVar3.e0(-945393586);
            btsVar3.t(false);
            ldcVar2 = null;
        } else {
            bts btsVar4 = (bts) fidVar;
            btsVar4.e0(-1831611885);
            long n2 = tje.n(wp2Var2, btsVar4);
            btsVar4.t(false);
            ldcVar2 = new ldc(n2);
        }
        bts btsVar5 = (bts) fidVar;
        boolean k = btsVar5.k(ldcVar) | btsVar5.k(ldcVar2);
        Object Q = btsVar5.Q();
        if (k || Q == did.a) {
            if (ldcVar != null && ldcVar2 != null) {
                qiyVar = zoy0.G(scc.g(ldcVar, ldcVar2), 0.0f, 0.0f, 14);
            }
            btsVar5.o0(qiyVar);
            Q = qiyVar;
        }
        return (ml6) Q;
    }

    public static final wp2 q(wp2 wp2Var, Float f, fid fidVar) {
        ldc ldcVar;
        up2 up2Var;
        bts btsVar = (bts) fidVar;
        if (wp2Var == null) {
            btsVar.e0(-57219226);
            btsVar.t(false);
            ldcVar = null;
        } else {
            btsVar.e0(552343547);
            long n = tje.n(wp2Var, btsVar);
            btsVar.t(false);
            ldcVar = new ldc(n);
        }
        boolean k = ((bts) fidVar).k(wp2Var);
        bts btsVar2 = (bts) fidVar;
        boolean k2 = k | btsVar2.k(ldcVar) | btsVar2.k(f);
        Object Q = btsVar2.Q();
        if (k2 || Q == did.a) {
            if (ldcVar != null) {
                up2Var = f != null ? new up2(ldc.b(ldcVar.a, f.floatValue(), 0.0f, 0.0f, 0.0f, 14)) : null;
                btsVar2.o0(wp2Var);
                Q = wp2Var;
            }
            wp2Var = up2Var;
            btsVar2.o0(wp2Var);
            Q = wp2Var;
        }
        return (wp2) Q;
    }

    public static final up2 r(wp2 wp2Var, float f, fid fidVar) {
        long n = tje.n(wp2Var, fidVar);
        boolean d = fidVar.d(n) | fidVar.b(f);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (d || Q == did.a) {
            Q = new up2(ldc.b(n, f, 0.0f, 0.0f, 0.0f, 14));
            btsVar.o0(Q);
        }
        return new up2(((up2) Q).a);
    }
}

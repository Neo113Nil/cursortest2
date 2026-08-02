package com.yandex.go.taxi.order.details.v2.ui.compose.driver;

import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.order.details.v2.ui.compose.driver.a;
import com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation.RideCardDriverSectionOrchestrator;
import defpackage.a7u0;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.bhk0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dcc0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.egk0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fgk0;
import defpackage.fid;
import defpackage.fj91;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gxv;
import defpackage.gza1;
import defpackage.hgk0;
import defpackage.ibk0;
import defpackage.ihk0;
import defpackage.ii8;
import defpackage.iy40;
import defpackage.jeb1;
import defpackage.jhk0;
import defpackage.jj2;
import defpackage.jtn;
import defpackage.k6w;
import defpackage.kdc;
import defpackage.khl0;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.lbb0;
import defpackage.ldc;
import defpackage.ldf;
import defpackage.lhk0;
import defpackage.lhl0;
import defpackage.lik0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.lt90;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.mhe;
import defpackage.mik0;
import defpackage.n;
import defpackage.n4h0;
import defpackage.nhk0;
import defpackage.nik0;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.o8k0;
import defpackage.ogk0;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.ohk0;
import defpackage.oik0;
import defpackage.oz40;
import defpackage.pa31;
import defpackage.pfb1;
import defpackage.phk0;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qgk0;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rbn;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sic;
import defpackage.sj5;
import defpackage.sls;
import defpackage.sz40;
import defpackage.tje;
import defpackage.tls;
import defpackage.to5;
import defpackage.tra1;
import defpackage.tse;
import defpackage.ttm;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.uh6;
import defpackage.uo5;
import defpackage.up2;
import defpackage.v2o;
import defpackage.vfc;
import defpackage.vnf0;
import defpackage.w2o;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.wya1;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xo1;
import defpackage.xya1;
import defpackage.ygk0;
import defpackage.ymb1;
import defpackage.ymo;
import defpackage.yuc0;
import defpackage.z910;
import defpackage.zls;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zuc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(final RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, final tls tlsVar, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2112109013);
        if ((i & 48) == 0) {
            i2 = (btsVar.e(tlsVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!rideCardDriverSectionOrchestrator.c().a) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls() { // from class: hhk0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            tls tlsVar2 = tlsVar;
                            RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator2 = rideCardDriverSectionOrchestrator;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    a.a(rideCardDriverSectionOrchestrator2, tlsVar2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    a.a(rideCardDriverSectionOrchestrator2, tlsVar2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            egk0 egk0Var = (egk0) rideCardDriverSectionOrchestrator.c.getValue();
            f530 c = ljs0.c(ljs0.e(c530.a, 68.0f), 1.0f);
            awk0 awk0Var = new awk0(0);
            boolean k = ((i2 & 112) == 32) | btsVar.k(egk0Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new o8k0(2, tlsVar, egk0Var);
                btsVar.o0(Q);
            }
            f530 b = q791.b(c, null, null, false, null, awk0Var, (sls) Q, 12);
            boolean k2 = btsVar.k(egk0Var);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new ohk0(0, egk0Var);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(b, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
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
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls() { // from class: hhk0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    tls tlsVar2 = tlsVar;
                    RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator2 = rideCardDriverSectionOrchestrator;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            a.a(rideCardDriverSectionOrchestrator2, tlsVar2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            a.a(rideCardDriverSectionOrchestrator2, tlsVar2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(f530 f530Var, RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, fid fidVar, int i) {
        int i2;
        int i3;
        aii0 v;
        ihk0 ihk0Var;
        Object rideCardDriverSectionKt$Avatar$2$1$1;
        fgk0 fgk0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1632291144);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rideCardDriverSectionOrchestrator) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            hgk0 hgk0Var = (hgk0) rideCardDriverSectionOrchestrator.g.getValue();
            hgk0Var.getClass();
            if (hgk0Var == hgk0.c) {
                v = btsVar.v();
                if (v != null) {
                    ihk0Var = new ihk0(f530Var, rideCardDriverSectionOrchestrator, i, 0);
                    v.d = ihk0Var;
                }
                return;
            }
            fgk0 fgk0Var2 = (fgk0) rideCardDriverSectionOrchestrator.e.getValue();
            f530 k = an91.k(f530Var, 8.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 60.0f);
            uo5 uo5Var = x4c.y;
            cj6 cj6Var = cj6.a;
            pi6.a(m4m0.b(cj6Var.a(m, uo5Var), tje.n(AppColor$Palette.Background, btsVar), cyk0.c(18.0f)), btsVar, 0);
            o4b1.b(m(hgk0Var.b, btsVar, UiStateDrawableWrapper.$stable), null, ymb1.l(cj6Var.a(ljs0.m(c530Var, 52.0f), uo5Var), cyk0.c(16.0f)).k(hgk0Var.a ? pfb1.b(c530Var, true, 30) : c530Var), null, null, 0.0f, null, btsVar, 56, 120);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.f(0.0f);
                btsVar.o0(Q);
            }
            tx40 tx40Var = (tx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = f.f(0.0f);
                btsVar.o0(Q2);
            }
            tx40 tx40Var2 = (tx40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = f.j(bhk0.e);
                btsVar.o0(Q3);
            }
            oz40 oz40Var = (oz40) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == obj) {
                Q4 = f.h(fgk0Var2.b);
                btsVar.o0(Q4);
            }
            iy40 iy40Var = (iy40) Q4;
            boolean k2 = btsVar.k(fgk0Var2);
            Object Q5 = btsVar.Q();
            if (k2 || Q5 == obj) {
                rideCardDriverSectionKt$Avatar$2$1$1 = new RideCardDriverSectionKt$Avatar$2$1$1(fgk0Var2, tx40Var, tx40Var2, oz40Var, iy40Var, null);
                fgk0Var = fgk0Var2;
                btsVar.o0(rideCardDriverSectionKt$Avatar$2$1$1);
            } else {
                rideCardDriverSectionKt$Avatar$2$1$1 = Q5;
                fgk0Var = fgk0Var2;
            }
            zpn.e(btsVar, (wls) rideCardDriverSectionKt$Avatar$2$1$1, fgk0Var);
            m3u0 b = androidx.compose.animation.core.b.b(tx40Var.getFloatValue(), l(iy40Var.getLongValue(), (rbn) oz40Var.getValue()), null, null, btsVar, 0, 28);
            f530 a = cj6Var.a(c530Var, uo5Var);
            boolean k3 = btsVar.k(b);
            Object Q6 = btsVar.Q();
            if (k3 || Q6 == obj) {
                Q6 = new xo1(b, 15);
                btsVar.o0(Q6);
            }
            o4b1.b(wya1.a(n4h0.ic_avatar_overlay_ok, 0, btsVar), null, ljs0.m(androidx.compose.ui.graphics.d.a(a, (tls) Q6), 54.0f), null, null, 0.0f, null, btsVar, 56, 120);
            i3 = 1;
            btsVar.t(true);
        } else {
            i3 = 1;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            ihk0Var = new ihk0(f530Var, rideCardDriverSectionOrchestrator, i, i3);
            v.d = ihk0Var;
        }
    }

    public static final void c(f530 f530Var, RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1984226390);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rideCardDriverSectionOrchestrator) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            UiStateDrawableWrapper uiStateDrawableWrapper = ((ogk0) rideCardDriverSectionOrchestrator.f.getValue()).a;
            int intrinsicWidth = uiStateDrawableWrapper.getIntrinsicWidth();
            int intrinsicHeight = uiStateDrawableWrapper.getIntrinsicHeight();
            if (!uiStateDrawableWrapper.getHasDrawable() || intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new ihk0(f530Var, rideCardDriverSectionOrchestrator, i, 2);
                    return;
                }
                return;
            }
            fwi fwiVar = (fwi) btsVar.m(j.h);
            o4b1.b(m(uiStateDrawableWrapper, btsVar, UiStateDrawableWrapper.$stable), null, gza1.b(ljs0.l(ljs0.e(an91.o(f530Var, 0.0f, 12.0f, 36.0f, 0.0f, 9), 52.0f), fwiVar.I((fwiVar.w0(52.0f) * intrinsicWidth) / intrinsicHeight)), btsVar.m(j.n) == LayoutDirection.Rtl ? -1.0f : 1.0f, 1.0f), null, mhe.g, 0.0f, null, btsVar, 24632, 104);
        } else {
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new ihk0(f530Var, rideCardDriverSectionOrchestrator, i, 3);
        }
    }

    public static final void d(final zuc0 zuc0Var, final ibk0 ibk0Var, final zls zlsVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        long j;
        long j2;
        dmw0 dmw0Var;
        String str;
        oz40 oz40Var;
        o430 o430Var;
        Context context;
        wp2 wp2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1263540016);
        dmw0 dmw0Var2 = btsVar.a;
        int i2 = i | (btsVar.e(zuc0Var) ? 4 : 2) | (btsVar.k(ibk0Var) ? 32 : 16) | (btsVar.e(zlsVar) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else {
            if (zuc0Var.equals(zuc0.f)) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls(zuc0Var, ibk0Var, zlsVar, i, i3) { // from class: mhk0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ zuc0 b;
                        public final /* synthetic */ ibk0 c;
                        public final /* synthetic */ zls w;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            zls zlsVar2 = this.w;
                            ibk0 ibk0Var2 = this.c;
                            zuc0 zuc0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    a.d(zuc0Var2, ibk0Var2, zlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    a.d(zuc0Var2, ibk0Var2, zlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            Context context2 = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            kdc kdcVar = zuc0Var.e;
            yuc0 yuc0Var = zuc0Var.a;
            String str2 = yuc0Var.a;
            yuc0 yuc0Var2 = zuc0Var.b;
            String str3 = yuc0Var2.a;
            ldc ldcVar = kdcVar != null ? new ldc(rzo.d(s8o.m(kdcVar, context2))) : null;
            if (ldcVar == null) {
                btsVar.e0(-1213777545);
                j = tje.n(AppColor$Palette.Background, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(-1213780924);
                btsVar.t(false);
                j = ldcVar.a;
            }
            kdc kdcVar2 = zuc0Var.d;
            ldc ldcVar2 = kdcVar2 != null ? new ldc(rzo.d(s8o.m(kdcVar2, context2))) : null;
            if (ldcVar2 == null) {
                btsVar.e0(-1213773513);
                j2 = tje.n(AppColor$Palette.Text, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(-1213776582);
                btsVar.t(false);
                j2 = ldcVar2.a;
            }
            String e = ohb1.e(btsVar, kyh0.open_copy_menu);
            boolean k = btsVar.k(str2) | btsVar.k(str3);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (k || Q == o430Var2) {
                List g = scc.g(str2, str3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : g) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                Q = kotlin.collections.a.X(arrayList, " ", null, null, null, 62);
                btsVar.o0(Q);
            }
            String str4 = (String) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                dmw0Var = dmw0Var2;
                Q2 = f.j(new k6w(0L));
                btsVar.o0(Q2);
            } else {
                dmw0Var = dmw0Var2;
            }
            oz40 oz40Var2 = (oz40) Q2;
            a7u0 a7u0Var = j.h;
            dmw0 dmw0Var3 = dmw0Var;
            int f0 = ((fwi) btsVar.m(a7u0Var)).f0(4.0f);
            int f02 = ((fwi) btsVar.m(a7u0Var)).f0(12.0f);
            c530 c530Var = c530.a;
            f530 a = aab1.a(1.0f, j2, m4m0.b(an91.o(c530Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), j, cyk0.c(8.0f)), cyk0.c(8.0f));
            boolean c = ((i2 & 112) == 32) | ((i2 & 896) == 256) | btsVar.c(f02) | btsVar.c(f0);
            Object Q3 = btsVar.Q();
            if (c || Q3 == o430Var2) {
                str = str3;
                oz40Var = oz40Var2;
                o430Var = o430Var2;
                nhk0 nhk0Var = new nhk0(zlsVar, ibk0Var, f02, f0, oz40Var);
                btsVar.o0(nhk0Var);
                Q3 = nhk0Var;
            } else {
                o430Var = o430Var2;
                str = str3;
                oz40Var = oz40Var2;
            }
            f530 b = q791.b(a, null, null, false, e, null, (sls) Q3, 20);
            boolean k2 = btsVar.k(str4);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var) {
                Q4 = new dcc0(str4, 18);
                btsVar.o0(Q4);
            }
            f530 a2 = fnq0.a(b, (tls) Q4);
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new ttm(18, oz40Var);
                btsVar.o0(Q5);
            }
            f530 y = eja1.y(a2, (tls) Q5);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, y);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var3 == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar, wlsVar4, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d2);
            f530 c2 = fj91.c(an91.m(c530Var, 4.0f, 0.0f, 2), IntrinsicSize.Max);
            to5 to5Var = x4c.D;
            lhl0 a3 = khl0.a(lr20.a, to5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a3);
            qje.W(btsVar, wlsVar3, o2);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar);
            qje.W(btsVar, wlsVar5, d3);
            kdc kdcVar3 = yuc0Var.b;
            jeb1.f(yuc0Var.a, null, kdcVar3 != null ? new up2(rzo.d(s8o.m(kdcVar3, context2))) : AppColor$Palette.Text, uh6.E(28), uh6.D(-0.01d), null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar).d.c, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 48, 14290);
            btsVar = btsVar;
            if (str.length() > 0) {
                btsVar.e0(1878318029);
                kdc kdcVar4 = zuc0Var.c;
                if (kdcVar4 != null) {
                    context = context2;
                    wp2Var = new up2(rzo.d(s8o.m(kdcVar4, context)));
                } else {
                    context = context2;
                    wp2Var = AppColor$Palette.Text;
                }
                pi6.a(tra1.b(m4m0.b(ljs0.q(an91.k(c530Var, 4.0f), 0.5f).k(ljs0.b), tje.n(wp2Var, btsVar), qke.q), 0.4f), btsVar, 0);
                kdc kdcVar5 = yuc0Var2.b;
                jeb1.f(yuc0Var2.a, an91.l(c530Var, 2.0f, 4.0f).k(new pa31(to5Var)), kdcVar5 != null ? new up2(rzo.d(s8o.m(kdcVar5, context))) : AppColor$Palette.Text, uh6.E(16), uh6.D(-0.01d), null, null, 0L, 0, false, 1, 0, null, xya1.e(btsVar).g.b, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 48, 14288);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(1879205032);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            wlsVar = new wls(zuc0Var, ibk0Var, zlsVar, i, i4) { // from class: mhk0
                public final /* synthetic */ int a;
                public final /* synthetic */ zuc0 b;
                public final /* synthetic */ ibk0 c;
                public final /* synthetic */ zls w;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    zls zlsVar2 = this.w;
                    ibk0 ibk0Var2 = this.c;
                    zuc0 zuc0Var2 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            a.d(zuc0Var2, ibk0Var2, zlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            a.d(zuc0Var2, ibk0Var2, zlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void e(lik0 lik0Var, zls zlsVar, fid fidVar, int i) {
        int i2;
        w2o w2oVar;
        zmo zmoVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1044647294);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(lik0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(zlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new sz40(Boolean.FALSE);
                btsVar.o0(Q);
            }
            sz40 sz40Var = (sz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(null);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean e = ((i2 & 14) == 4) | btsVar.e(sz40Var);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new RideCardDriverSectionKt$CarPlateAnimated$1$1(lik0Var, sz40Var, oz40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, lik0Var);
            int f0 = ((fwi) btsVar.m(j.h)).f0(12.0f);
            boolean c = btsVar.c(f0);
            Object Q4 = btsVar.Q();
            if (c || Q4 == o430Var) {
                Q4 = new ii8(f0, 17);
                btsVar.o0(Q4);
            }
            tls tlsVar = (tls) Q4;
            long j = lik0Var.b;
            boolean z = j > 0;
            if (z) {
                w2o e2 = k.e(l(j, bhk0.c), 2);
                ldf ldfVar = bhk0.a;
                w2oVar = e2.a(k.p(l(j, ldfVar), tlsVar)).a(k.d(l(j, ldfVar), tlsVar, 4));
            } else {
                w2oVar = v2o.a;
            }
            if (z) {
                zmo f = k.f(l(j, bhk0.d), 2);
                ldf ldfVar2 = bhk0.b;
                zmoVar = f.a(k.u(l(j, ldfVar2), tlsVar)).a(k.l(l(j, ldfVar2), tlsVar, 4));
            } else {
                zmoVar = ymo.a;
            }
            g.c(sz40Var, null, w2oVar, zmoVar, null, wwg.S(479921238, true, new ls40(9, oz40Var, lik0Var, zlsVar), btsVar), btsVar, ImageMetadata.EDGE_MODE, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(lik0Var, zlsVar, i, 18);
        }
    }

    public static final void f(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, tls tlsVar, zls zlsVar, fid fidVar, int i) {
        RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator2;
        tls tlsVar2;
        zls zlsVar2;
        aii0 v;
        lhk0 lhk0Var;
        jj2 F;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-729802909);
        int i2 = i | (btsVar.a(false) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(zlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            qgk0 c = rideCardDriverSectionOrchestrator.c();
            boolean z = c.a;
            float f = c.c;
            long j = c.b;
            boolean z2 = j > 0;
            float f2 = z ? 1.0f : 0.0f;
            if (z2) {
                F = l(j, z ? bhk0.a : bhk0.b);
            } else {
                F = sb2.F();
            }
            m3u0 b = androidx.compose.animation.core.b.b(f2, F, null, null, btsVar, 0, 28);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n.f(z, btsVar);
            }
            oz40 oz40Var = (oz40) Q;
            Boolean valueOf = Boolean.valueOf(z);
            boolean a = btsVar.a(z) | btsVar.k(b);
            Object Q2 = btsVar.Q();
            if (a || Q2 == o430Var) {
                Q2 = new RideCardDriverSectionKt$CollapsingContent$1$1(z, oz40Var, b, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, valueOf);
            if (!((Boolean) oz40Var.getValue()).booleanValue()) {
                v = btsVar.v();
                if (v != null) {
                    lhk0Var = new lhk0(rideCardDriverSectionOrchestrator, tlsVar, zlsVar, i, 0);
                    v.d = lhk0Var;
                }
                return;
            }
            tlsVar2 = tlsVar;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = f.f(f);
                btsVar.o0(Q3);
            }
            tx40 tx40Var = (tx40) Q3;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(bhk0.b);
                btsVar.o0(Q4);
            }
            oz40 oz40Var2 = (oz40) Q4;
            Float valueOf2 = Float.valueOf(f);
            boolean k = btsVar.k(c);
            Object Q5 = btsVar.Q();
            if (k || Q5 == o430Var) {
                Q5 = new RideCardDriverSectionKt$CollapsingContent$3$1(c, tx40Var, oz40Var2, null);
                btsVar.o0(Q5);
            }
            zpn.e(btsVar, (wls) Q5, valueOf2);
            long j2 = c.d;
            btsVar = btsVar;
            zlsVar2 = zlsVar;
            m3u0 b2 = androidx.compose.animation.core.b.b(c.c, (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) > 0 ? l(j2, (ldf) oz40Var2.getValue()) : sb2.F(), null, null, btsVar, 0, 28);
            f530 m = ymb1.m(ljs0.c(c530.a, 1.0f));
            boolean k2 = btsVar.k(b2);
            Object Q6 = btsVar.Q();
            if (k2 || Q6 == o430Var) {
                Q6 = new xo1(b2, 16);
                btsVar.o0(Q6);
            }
            f530 a2 = androidx.compose.ui.graphics.d.a(m, (tls) Q6);
            boolean k3 = btsVar.k(b);
            Object Q7 = btsVar.Q();
            if (k3 || Q7 == o430Var) {
                Q7 = new jtn(b, 1);
                btsVar.o0(Q7);
            }
            f530 F2 = kp50.F(a2, (zls) Q7);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, F2);
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
            rideCardDriverSectionOrchestrator2 = rideCardDriverSectionOrchestrator;
            g(rideCardDriverSectionOrchestrator2, tlsVar2, zlsVar2, btsVar, i2 & 8190);
            btsVar.t(true);
        } else {
            rideCardDriverSectionOrchestrator2 = rideCardDriverSectionOrchestrator;
            tlsVar2 = tlsVar;
            zlsVar2 = zlsVar;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            lhk0Var = new lhk0(rideCardDriverSectionOrchestrator2, tlsVar2, zlsVar2, i, 1);
            v.d = lhk0Var;
        }
    }

    public static final void g(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, tls tlsVar, zls zlsVar, fid fidVar, int i) {
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(536256025);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.a(false) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(zlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
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
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            float f2 = 2.0f;
            if (2.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            if (2.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
                f = Float.MAX_VALUE;
            } else {
                f = Float.MAX_VALUE;
            }
            x2y x2yVar = new x2y(f2, true);
            int i3 = i2 >> 3;
            j(x2yVar, rideCardDriverSectionOrchestrator, zlsVar, btsVar, (i3 & 896) | 48);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar2 = new x2y(1.0f > f ? f : 1.0f, true);
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, x2yVar2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            uo5 uo5Var2 = x4c.w;
            cj6 cj6Var = cj6.a;
            c(cj6Var.a(c530Var, uo5Var2), rideCardDriverSectionOrchestrator, btsVar, 48);
            b(cj6Var.a(c530Var, uo5Var2), rideCardDriverSectionOrchestrator, btsVar, 48);
            btsVar.t(true);
            btsVar.t(true);
            btsVar.e0(-2073700561);
            btsVar.t(false);
            a(rideCardDriverSectionOrchestrator, tlsVar, btsVar, 6 | (i3 & 112));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lhk0(rideCardDriverSectionOrchestrator, tlsVar, zlsVar, i, 2);
        }
    }

    public static final void h(ygk0 ygk0Var, tls tlsVar, zls zlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(675153890);
        int i2 = (btsVar.k(ygk0Var) ? 4 : 2) | i | (btsVar.a(false) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(zlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            Object Q2 = btsVar.Q();
            Object obj = Q2;
            if (Q2 == o430Var) {
                RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator = new RideCardDriverSectionOrchestrator();
                rideCardDriverSectionOrchestrator.g(tseVar);
                btsVar.o0(rideCardDriverSectionOrchestrator);
                obj = rideCardDriverSectionOrchestrator;
            }
            RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator2 = (RideCardDriverSectionOrchestrator) obj;
            boolean z = (i2 & 14) == 4;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var) {
                Q3 = new RideCardDriverSectionKt$RideCardDriverSection$1$1(rideCardDriverSectionOrchestrator2, ygk0Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, ygk0Var);
            f(rideCardDriverSectionOrchestrator2, tlsVar, zlsVar, btsVar, (i2 & 7168) | (i2 & 112) | 6 | (i2 & 896));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(ygk0Var, tlsVar, zlsVar, i, 8);
        }
    }

    public static final void i(mik0 mik0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1221571024);
        int i2 = (btsVar.k(mik0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new sz40(Boolean.FALSE);
                btsVar.o0(Q);
            }
            sz40 sz40Var = (sz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(null);
                btsVar.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            CharSequence charSequence = mik0Var.a;
            boolean z = mik0Var.c;
            long j = mik0Var.b;
            boolean e = ((i2 & 14) == 4) | btsVar.e(sz40Var);
            Object Q3 = btsVar.Q();
            if (e || Q3 == o430Var) {
                Q3 = new RideCardDriverSectionKt$Subtitle$1$1(mik0Var, sz40Var, oz40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, charSequence);
            boolean z2 = j > 0;
            g.c(sz40Var, null, z2 ? j == 0 ? v2o.a : z ? k.e(l(j, bhk0.c), 2).a(k.d(l(j, ubn.d), null, 8)) : k.e(l(j, bhk0.c), 2) : v2o.a, z2 ? j == 0 ? ymo.a : z ? k.f(l(j, bhk0.d), 2).a(k.l(l(j, bhk0.b), null, 8)) : k.f(l(j, bhk0.d), 2) : ymo.a, null, wwg.S(13315752, true, new jhk0(0, oz40Var), btsVar), btsVar, ImageMetadata.EDGE_MODE, 18);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(mik0Var, i, 10);
        }
    }

    public static final void j(f530 f530Var, RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, zls zlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-294463744);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rideCardDriverSectionOrchestrator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(zlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            oik0 oik0Var = (oik0) rideCardDriverSectionOrchestrator.h.getValue();
            f530Var2 = f530Var;
            f530 o = an91.o(f530Var2, 16.0f, 12.0f, 0.0f, 12.0f, 4);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            k(oik0Var.a, btsVar, 0);
            i(oik0Var.b, btsVar, 0);
            e(oik0Var.c, zlsVar, btsVar, (i2 >> 3) & 112);
            btsVar.t(true);
        } else {
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(f530Var2, (Object) rideCardDriverSectionOrchestrator, (Object) zlsVar, i, 12);
        }
    }

    public static final void k(final nik0 nik0Var, fid fidVar, final int i) {
        bts btsVar;
        aii0 v;
        wls wlsVar;
        jj2 F;
        boolean k;
        Object Q;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1238289264);
        int i2 = (btsVar2.k(nik0Var) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            CharSequence charSequence = nik0Var.a;
            boolean z = nik0Var.c;
            if (charSequence == null) {
                v = btsVar2.v();
                if (v != null) {
                    wlsVar = new wls(nik0Var, i, r7) { // from class: khk0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ nik0 b;

                        {
                            this.a = r3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i3 = this.a;
                            zy11 zy11Var = zy11.a;
                            nik0 nik0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i3) {
                                case 0:
                                    a.k(nik0Var2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    a.k(nik0Var2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            Object Q2 = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q2 == o430Var) {
                Q2 = n.f(z, btsVar2);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean z2 = ((Boolean) oz40Var.getValue()).booleanValue() != z;
            Boolean valueOf = Boolean.valueOf(z);
            r7 = (i2 & 14) == 4 ? 1 : 0;
            Object Q3 = btsVar2.Q();
            if (r7 != 0 || Q3 == o430Var) {
                Q3 = new RideCardDriverSectionKt$Title$1$1(nik0Var, oz40Var, null);
                btsVar2.o0(Q3);
            }
            zpn.e(btsVar2, (wls) Q3, valueOf);
            float f = z ? 0.0f : 1.0f;
            if (z2) {
                long j = nik0Var.b;
                if (j > 0) {
                    F = l(j, z ? bhk0.b : bhk0.a);
                    m3u0 b = androidx.compose.animation.core.b.b(f, F, null, null, btsVar2, 0, 28);
                    float w0 = ((fwi) btsVar2.m(j.h)).w0(26.0f);
                    k = btsVar2.k(b) | btsVar2.b(w0);
                    Q = btsVar2.Q();
                    if (!k || Q == o430Var) {
                        Q = new sj5(w0, b);
                        btsVar2.o0(Q);
                    }
                    btsVar = btsVar2;
                    qgy.b(charSequence, null, kp50.F(c530.a, (zls) Q), AppColor$Palette.Text, uh6.E(16), 0L, null, 0L, 2, 1, 0, xya1.e(btsVar2).g.c, null, btsVar, 805334064, 6, 10720);
                }
            }
            F = sb2.F();
            m3u0 b2 = androidx.compose.animation.core.b.b(f, F, null, null, btsVar2, 0, 28);
            float w02 = ((fwi) btsVar2.m(j.h)).w0(26.0f);
            k = btsVar2.k(b2) | btsVar2.b(w02);
            Q = btsVar2.Q();
            if (!k) {
            }
            Q = new sj5(w02, b2);
            btsVar2.o0(Q);
            btsVar = btsVar2;
            qgy.b(charSequence, null, kp50.F(c530.a, (zls) Q), AppColor$Palette.Text, uh6.E(16), 0L, null, 0L, 2, 1, 0, xya1.e(btsVar2).g.c, null, btsVar, 805334064, 6, 10720);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i3 = 1;
            wlsVar = new wls(nik0Var, i, i3) { // from class: khk0
                public final /* synthetic */ int a;
                public final /* synthetic */ nik0 b;

                {
                    this.a = i3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i32 = this.a;
                    zy11 zy11Var = zy11.a;
                    nik0 nik0Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i32) {
                        case 0:
                            a.k(nik0Var2, fidVar2, vng.O(1));
                            break;
                        default:
                            a.k(nik0Var2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final ck11 l(long j, rbn rbnVar) {
        return sb2.K((int) j, 0, rbnVar, 2);
    }

    public static final phk0 m(UiStateDrawableWrapper uiStateDrawableWrapper, fid fidVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((bts) fidVar).k(uiStateDrawableWrapper)) || (i & 6) == 4;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            Q = new phk0(uiStateDrawableWrapper);
            btsVar.o0(Q);
        }
        return (phk0) Q;
    }
}

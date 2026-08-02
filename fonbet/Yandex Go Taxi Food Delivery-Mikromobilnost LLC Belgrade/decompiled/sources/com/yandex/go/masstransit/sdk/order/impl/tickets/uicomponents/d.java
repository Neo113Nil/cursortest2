package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cjb1;
import defpackage.cma1;
import defpackage.did;
import defpackage.epb1;
import defpackage.f530;
import defpackage.fid;
import defpackage.hp5;
import defpackage.i43;
import defpackage.id00;
import defpackage.jl40;
import defpackage.k840;
import defpackage.ldf;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.n;
import defpackage.o740;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p740;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.r5y;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sls;
import defpackage.t740;
import defpackage.tje;
import defpackage.tls;
import defpackage.u510;
import defpackage.ugh;
import defpackage.ul91;
import defpackage.vqr;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzr;
import defpackage.x1c;
import defpackage.x4c;
import defpackage.xab1;
import defpackage.y311;
import defpackage.zls;
import defpackage.zpn;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class d {
    public static final ldf a = new ldf(0.0f, 0.0f, 0.58f, 1.0f);

    public static final void a(final int i, final int i2, fid fidVar, int i3) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-761398448);
        int i4 = (btsVar.c(i) ? 4 : 2) | i3 | (btsVar.c(i2) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            vqr.c(an91.m(ljs0.c(c530.a, 1.0f), 32.0f, 0.0f, 2), lr20.e, new i43(4.0f, true, new quz(11)), x4c.E, 32, 0, wwg.S(-456614283, true, new zls() { // from class: j840
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long b;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        int i5 = 0;
                        while (i5 < i) {
                            boolean z = i5 == i2;
                            if (z) {
                                btsVar2.e0(974100599);
                                b = tje.n(AppColor$Palette.Text, btsVar2);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(974144836);
                                b = ldc.b(tje.n(AppColor$Palette.Text, btsVar2), 0.3f, 0.0f, 0.0f, 0.0f, 14);
                                btsVar2.t(false);
                            }
                            c530 c530Var = c530.a;
                            f530 m = ljs0.m(c530Var, 11.0f);
                            z910 d = pi6.d(x4c.b, false);
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d2 = b.d(btsVar2, m);
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            if (btsVar2.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(btsVar2, d.f, d);
                            qje.W(btsVar2, d.e, o);
                            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                            qje.M(btsVar2, d.h);
                            qje.W(btsVar2, d.d, d2);
                            pi6.a(m4m0.b(ymb1.l(ljs0.m(cj6.a.a(c530Var, x4c.y), z ? 8.0f : 6.0f), cyk0.a(50)), b, qke.q), btsVar2, 0);
                            btsVar2.t(true);
                            i5++;
                        }
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 1600950, 32);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hp5(i, i2, i3);
        }
    }

    public static final void b(f530 f530Var, float f, long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(257722418);
        int i2 = i | 6 | (btsVar.b(f) ? 32 : 16) | 128;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                j = tje.n(AppColor$Palette.Background, btsVar);
                f530Var = c530.a;
            } else {
                btsVar.Y();
            }
            btsVar.u();
            oeb1.c(btsVar, m4m0.b(ljs0.e(ljs0.c(f530Var, 1.0f), f), j, qke.q));
        } else {
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        long j2 = j;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k840(f530Var2, f, j2, i);
        }
    }

    public static final void c(List list, ugh ughVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-802488166);
        int i2 = i | (btsVar.k(list) ? 4 : 2) | (btsVar.k(ughVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            xab1.a(null, null, wwg.S(1857479526, true, new r5y(f530Var, (Object) ughVar, (Object) list, tlsVar, 7), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) list, (Object) ughVar, (Object) f530Var, tlsVar, i, 21);
        }
    }

    public static final void d(final u510 u510Var, final boolean z, final tls tlsVar, fid fidVar, final int i) {
        u510 u510Var2;
        aii0 v;
        wls wlsVar;
        t740 o740Var;
        oz40 oz40Var;
        float f;
        Object mtTicketsPagerKt$TicketsPagerItem$1$1;
        bts btsVar;
        androidx.compose.animation.core.a aVar;
        float f2;
        tls tlsVar2;
        int i2;
        t740 t740Var;
        int i3;
        bts btsVar2;
        boolean z2;
        boolean z3;
        t740 t740Var2 = u510Var.a;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-436826952);
        int i4 = i | (btsVar3.k(u510Var) ? 4 : 2) | (btsVar3.a(z) ? 32 : 16) | (btsVar3.e(tlsVar) ? 256 : 128);
        if (btsVar3.V(i4 & 1, (i4 & 147) != 146)) {
            boolean z4 = u510Var.k;
            String str = u510Var.b;
            if (t740Var2 == null) {
                v = btsVar3.v();
                if (v != null) {
                    final int i5 = 0;
                    wlsVar = new wls(u510Var, z, tlsVar, i, i5) { // from class: i840
                        public final /* synthetic */ int a;
                        public final /* synthetic */ u510 b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ tls w;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar3 = this.w;
                            boolean z5 = this.c;
                            u510 u510Var3 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.d(u510Var3, z5, tlsVar3, fidVar2, vng.O(1));
                                    break;
                                default:
                                    com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.d(u510Var3, z5, tlsVar3, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            boolean k = btsVar3.k(str);
            Object Q = btsVar3.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = n.f(t740Var2 instanceof o740, btsVar3);
            }
            oz40 oz40Var2 = (oz40) Q;
            boolean z5 = t740Var2 instanceof o740;
            if (z5) {
                ((Boolean) oz40Var2.getValue()).booleanValue();
                oz40Var2.setValue(Boolean.TRUE);
            }
            boolean k2 = btsVar3.k(str);
            Object Q2 = btsVar3.Q();
            if (k2 || Q2 == obj) {
                Q2 = f.j(Boolean.FALSE);
                btsVar3.o0(Q2);
            }
            oz40 oz40Var3 = (oz40) Q2;
            if (z5) {
                oz40Var3.setValue(Boolean.FALSE);
            }
            boolean k3 = btsVar3.k(str);
            Object Q3 = btsVar3.Q();
            if (k3 || Q3 == obj) {
                Q3 = f.j(Boolean.FALSE);
                btsVar3.o0(Q3);
            }
            oz40 oz40Var4 = (oz40) Q3;
            boolean booleanValue = ((Boolean) oz40Var2.getValue()).booleanValue();
            boolean z6 = t740Var2 instanceof p740;
            boolean booleanValue2 = ((Boolean) oz40Var3.getValue()).booleanValue();
            if (booleanValue && z6 && !z && z4 && !booleanValue2) {
                oz40Var4.setValue(Boolean.TRUE);
            }
            boolean z7 = z4 && z6 && !((Boolean) oz40Var3.getValue()).booleanValue();
            boolean z8 = z7 && !((Boolean) oz40Var2.getValue()).booleanValue();
            boolean z9 = z7 && ((Boolean) oz40Var4.getValue()).booleanValue();
            if (z8 || z9) {
                p740 p740Var = (p740) t740Var2;
                o740Var = new o740(p740Var.a, p740Var.b, p740Var.c, p740Var.d, 24);
            } else {
                o740Var = t740Var2;
            }
            boolean k4 = btsVar3.k(str);
            Object Q4 = btsVar3.Q();
            if (k4 || Q4 == obj) {
                Q4 = id00.a((z8 && z) ? 0.0f : 1.0f);
                btsVar3.o0(Q4);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q4;
            if (o740Var instanceof p740) {
                oz40Var = oz40Var2;
                f = 1.0f;
            } else {
                oz40Var = oz40Var2;
                f = 0.0f;
            }
            oz40 oz40Var5 = oz40Var;
            t740 t740Var3 = o740Var;
            m3u0 b = androidx.compose.animation.core.b.b(f, sb2.K(300, 0, a, 2), "expired_fraction", null, btsVar3, 3120, 20);
            Object[] objArr = {str, qoi0.a(t740Var2.getClass()), Boolean.valueOf(z4), Boolean.valueOf(z)};
            int i6 = i4 & 14;
            boolean e = btsVar3.e(t740Var2) | (i6 == 4) | ((i4 & 112) == 32) | btsVar3.k(oz40Var3) | btsVar3.k(oz40Var5) | btsVar3.k(oz40Var4) | btsVar3.e(aVar2) | ((i4 & 896) == 256);
            Object Q5 = btsVar3.Q();
            if (e || Q5 == obj) {
                btsVar = btsVar3;
                aVar = aVar2;
                f2 = 0.0f;
                tlsVar2 = tlsVar;
                i2 = i6;
                mtTicketsPagerKt$TicketsPagerItem$1$1 = new MtTicketsPagerKt$TicketsPagerItem$1$1(t740Var2, u510Var, z, aVar, oz40Var3, oz40Var5, oz40Var4, tlsVar2, null);
                t740Var = t740Var2;
                u510Var2 = u510Var;
                btsVar.o0(mtTicketsPagerKt$TicketsPagerItem$1$1);
            } else {
                u510Var2 = u510Var;
                t740Var = t740Var2;
                btsVar = btsVar3;
                i2 = i6;
                mtTicketsPagerKt$TicketsPagerItem$1$1 = Q5;
                aVar = aVar2;
                f2 = 0.0f;
                tlsVar2 = tlsVar;
            }
            zpn.h(objArr, (wls) mtTicketsPagerKt$TicketsPagerItem$1$1, btsVar);
            float floatValue = ((Number) aVar.e()).floatValue();
            f530 f530Var = c530.a;
            if (floatValue < 1.0f) {
                btsVar.e0(242536716);
                boolean e2 = btsVar.e(aVar);
                Object Q6 = btsVar.Q();
                if (e2 || Q6 == obj) {
                    Q6 = new x1c(aVar, 2);
                    btsVar.o0(Q6);
                }
                f530Var = androidx.compose.ui.graphics.d.a(f530Var, (tls) Q6);
                i3 = 0;
                btsVar.t(false);
            } else {
                i3 = 0;
                btsVar.e0(242602808);
                btsVar.t(false);
            }
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, i3);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            ul91.c(u510Var2, ((Number) b.getValue()).floatValue(), tlsVar2, btsVar, ((i4 << 3) & 7168) | i2);
            if (((Number) b.getValue()).floatValue() > f2) {
                btsVar.e0(-1163219291);
                btsVar2 = btsVar;
                b(null, cjb1.d(f2, 16.0f, ((Number) b.getValue()).floatValue()), 0L, btsVar2, 0);
                z2 = false;
                btsVar2.t(false);
            } else {
                btsVar2 = btsVar;
                z2 = false;
                btsVar2.e0(-1163131840);
                btsVar2.t(false);
            }
            boolean z10 = z2;
            String str2 = u510Var2.b;
            String str3 = z6 ? u510Var2.h : null;
            Long l = u510Var2.j;
            if (t740Var instanceof p740) {
                p740 p740Var2 = (p740) t740Var;
                if (jl40.l(p740Var2.a, y311.a) && p740Var2.b == null) {
                    z3 = true;
                    bts btsVar4 = btsVar2;
                    epb1.a(str2, t740Var3, str3, l, z3, ((Number) b.getValue()).floatValue(), tlsVar2, btsVar4, (i4 << 12) & 3670016);
                    btsVar3 = btsVar4;
                    btsVar3.t(true);
                }
            }
            z3 = z10;
            bts btsVar42 = btsVar2;
            epb1.a(str2, t740Var3, str3, l, z3, ((Number) b.getValue()).floatValue(), tlsVar2, btsVar42, (i4 << 12) & 3670016);
            btsVar3 = btsVar42;
            btsVar3.t(true);
        } else {
            u510Var2 = u510Var;
            btsVar3.Y();
        }
        v = btsVar3.v();
        if (v != null) {
            final int i7 = 1;
            final u510 u510Var3 = u510Var2;
            wlsVar = new wls(u510Var3, z, tlsVar, i, i7) { // from class: i840
                public final /* synthetic */ int a;
                public final /* synthetic */ u510 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ tls w;

                {
                    this.a = i7;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj22) {
                    int i62 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar3 = this.w;
                    boolean z52 = this.c;
                    u510 u510Var32 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj22).getClass();
                    switch (i62) {
                        case 0:
                            com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.d(u510Var32, z52, tlsVar3, fidVar2, vng.O(1));
                            break;
                        default:
                            com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.d(u510Var32, z52, tlsVar3, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}

package com.yandex.go.taxi.summary.verticalsummary.ui;

import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.a7u0;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.aq5;
import defpackage.at5;
import defpackage.ays0;
import defpackage.bb1;
import defpackage.bms;
import defpackage.bpl0;
import defpackage.bts;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cr5;
import defpackage.dh31;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dtr0;
import defpackage.erb1;
import defpackage.f530;
import defpackage.f62;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gcb1;
import defpackage.gfd;
import defpackage.h3z0;
import defpackage.hex0;
import defpackage.hh31;
import defpackage.j690;
import defpackage.jiz0;
import defpackage.jpa1;
import defpackage.ke31;
import defpackage.ki31;
import defpackage.kla1;
import defpackage.l690;
import defpackage.lej0;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.lx40;
import defpackage.m3u0;
import defpackage.oh31;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p5r;
import defpackage.pf6;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.s1a1;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sgp0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tse0;
import defpackage.ttm;
import defpackage.tx40;
import defpackage.un91;
import defpackage.uox0;
import defpackage.w5;
import defpackage.wg6;
import defpackage.whv0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.ymb1;
import defpackage.yx40;
import defpackage.yz40;
import defpackage.z91;
import defpackage.z910;
import defpackage.zf91;
import defpackage.zgq0;
import defpackage.zpn;
import defpackage.zr01;
import defpackage.zwa1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes14.dex */
public abstract class i {
    public static final float a = SlotSize.L.getSize();

    public static final void a(wg6 wg6Var, int i, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(155943352);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(wg6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new VerticalSummaryBottomSheetKt$TrackTargetBottomSheetHeightEffect$1$1(i, wg6Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, wg6Var);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new whv0(wg6Var, i, tlsVar, i2, 1);
        }
    }

    public static final void b(lx40 lx40Var, qor qorVar, qor qorVar2, qor qorVar3, float f, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1289835866);
        int i2 = i | (btsVar.k(lx40Var) ? 4 : 2) | (btsVar.b(f) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            Float valueOf = Float.valueOf(f);
            boolean z = ((i2 & 14) == 4) | ((i2 & HProv.ALG_CLASS_ALL) == 16384);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1 verticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1 = new VerticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1(lx40Var, qorVar, qorVar2, qorVar3, f, null);
                btsVar.o0(verticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1);
                Q = verticalSummaryBottomSheetKt$UpdateAnchorHeightEffect$1$1;
            }
            zpn.f(lx40Var, valueOf, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new h3z0(lx40Var, qorVar, qorVar2, qorVar3, f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x055a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final ki31 ki31Var, wg6 wg6Var, final tls tlsVar, tpr tprVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        wg6 wg6Var2;
        boolean z;
        yx40 yx40Var;
        tse tseVar;
        Object obj;
        oh31 oh31Var;
        lx40 lx40Var;
        lx40 f;
        bts btsVar;
        fwi fwiVar;
        yx40 yx40Var2;
        dtr0 dtr0Var;
        int i3;
        int i4;
        tse tseVar2;
        final wg6 wg6Var3;
        int i5;
        qor qorVar;
        final Integer num;
        boolean z2;
        boolean k;
        Object Q;
        boolean k2;
        Object Q2;
        yz40 yz40Var;
        int i6;
        Object Q3;
        boolean k3;
        Object Q4;
        int i7;
        tpr tprVar2 = tprVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1282414073);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(ki31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(wg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar2.k(tprVar2) : btsVar2.e(tprVar2) ? 2048 : 1024;
        }
        int i8 = i2;
        if (btsVar2.V(i8 & 1, (i8 & 1171) != 1170)) {
            final androidx.compose.foundation.lazy.b a2 = a7y.a(0, 3, btsVar2);
            Object Q5 = btsVar2.Q();
            Object obj2 = did.a;
            if (Q5 == obj2) {
                Q5 = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q5);
            }
            tse tseVar3 = (tse) Q5;
            a7u0 a7u0Var = j.h;
            fwi fwiVar2 = (fwi) btsVar2.m(a7u0Var);
            Object Q6 = btsVar2.Q();
            if (Q6 == obj2) {
                Q6 = androidx.compose.runtime.f.g((int) fwiVar2.w0(a));
                btsVar2.o0(Q6);
            }
            yx40 yx40Var3 = (yx40) Q6;
            Object Q7 = btsVar2.Q();
            if (Q7 == obj2) {
                Q7 = androidx.compose.runtime.f.g((int) fwiVar2.w0(72.0f));
                btsVar2.o0(Q7);
            }
            yx40 yx40Var4 = (yx40) Q7;
            float f2 = ki31Var.h;
            int i9 = ki31Var.g;
            fwi fwiVar3 = (fwi) btsVar2.m(a7u0Var);
            boolean c = btsVar2.c(((Number) yx40Var4.getValue()).intValue()) | btsVar2.b(f2) | btsVar2.c(((Number) yx40Var3.getValue()).intValue()) | btsVar2.c(i9) | btsVar2.k(fwiVar3);
            Object Q8 = btsVar2.Q();
            if (c || Q8 == obj2) {
                float intValue = ((Number) yx40Var3.getValue()).intValue();
                float intValue2 = ((Number) yx40Var4.getValue()).intValue();
                float w0 = fwiVar3.w0(16.0f);
                float f3 = i9;
                float f4 = f3 < f2 + 1.0f ? -1.0f : (intValue2 * f3) + w0;
                boolean z3 = f4 == -1.0f;
                if (!z3) {
                    intValue2 = intValue;
                }
                float min = ((z3 ? f3 : Math.min(f3, f2)) * intValue2) + w0;
                float f5 = ((f2 - 1.0f) * intValue2) / 2.0f;
                Q8 = new oh31((int) ((0.0f * intValue2) / 2.0f), (int) f5, (int) (fwiVar3.w0(39.0f) + f5), f3 <= 1.0f ? -1.0f : (intValue2 * 1.0f) + w0, min, f4);
                btsVar2.o0(Q8);
            }
            oh31 oh31Var2 = (oh31) Q8;
            int i10 = i8 & 112;
            lx40 lx40Var2 = null;
            if (oh31Var2.d == -1.0f) {
                btsVar2.e0(-803639485);
                btsVar2.t(false);
                z = false;
                obj = obj2;
                yx40Var = yx40Var4;
                tseVar = tseVar3;
            } else {
                btsVar2.e0(389719287);
                z = false;
                yx40Var = yx40Var4;
                tseVar = tseVar3;
                obj = obj2;
                lx40Var2 = erb1.f(wg6Var, false, 0, btsVar2, ((i10 >> 3) & 14) | 3120, 2);
                btsVar2.t(false);
            }
            int i11 = ((i10 >> 3) & 14) | 3120;
            lx40 lx40Var3 = lx40Var2;
            lx40 f6 = erb1.f(wg6Var, true, 1, btsVar2, i11, 2);
            if (oh31Var2.f == -1.0f) {
                btsVar2.e0(-803307165);
                btsVar2.t(z);
                oh31Var = oh31Var2;
                f = null;
                lx40Var = f6;
                btsVar = btsVar2;
            } else {
                btsVar2.e0(389730007);
                oh31Var = oh31Var2;
                lx40Var = f6;
                f = erb1.f(wg6Var, false, 2, btsVar2, i11, 2);
                btsVar = btsVar2;
                btsVar.t(z);
            }
            boolean k4 = btsVar.k(lx40Var3) | btsVar.k(lx40Var) | btsVar.k(f);
            Object Q9 = btsVar.Q();
            if (k4 || Q9 == obj) {
                dtr0 dtr0Var2 = lx40Var3 != null ? new dtr0(lx40Var3.b) : null;
                int i12 = dtr0Var2 != null ? dtr0Var2.a : -1;
                int i13 = lx40Var.b;
                fwiVar = fwiVar2;
                if (f != null) {
                    yx40Var2 = yx40Var3;
                    dtr0Var = new dtr0(f.b);
                } else {
                    yx40Var2 = yx40Var3;
                    dtr0Var = null;
                }
                int i14 = dtr0Var != null ? dtr0Var.a : -2;
                i3 = i8;
                i4 = i10;
                tseVar2 = tseVar;
                dh31 dh31Var = new dh31(new yz40(lx40Var3, dtr0Var2, i12), new yz40(lx40Var, new dtr0(i13), i13), new yz40(f, dtr0Var, i14), kotlin.collections.a.I(scc.g(new dtr0(-1), new dtr0(i12), new dtr0(i13), new dtr0(i14), new dtr0(-2))));
                btsVar.o0(dh31Var);
                Q9 = dh31Var;
            } else {
                tseVar2 = tseVar;
                fwiVar = fwiVar2;
                yx40Var2 = yx40Var3;
                i3 = i8;
                i4 = i10;
            }
            final dh31 dh31Var2 = (dh31) Q9;
            Object Q10 = btsVar.Q();
            if (Q10 == obj) {
                Q10 = androidx.compose.runtime.f.f(0.0f);
                btsVar.o0(Q10);
            }
            final tx40 tx40Var = (tx40) Q10;
            Object Q11 = btsVar.Q();
            if (Q11 == obj) {
                Q11 = androidx.compose.runtime.f.f(0.0f);
                btsVar.o0(Q11);
            }
            final tx40 tx40Var2 = (tx40) Q11;
            Object Q12 = btsVar.Q();
            if (Q12 == obj) {
                Q12 = androidx.compose.runtime.f.f(0.0f);
                btsVar.o0(Q12);
            }
            final tx40 tx40Var3 = (tx40) Q12;
            yz40 yz40Var2 = dh31Var2.b;
            yz40 yz40Var3 = dh31Var2.a;
            int i15 = yz40Var2.c;
            List list = dh31Var2.d;
            yz40 yz40Var4 = dh31Var2.c;
            dtr0 dtr0Var3 = yz40Var4.b;
            int i16 = yz40Var4.c;
            boolean k5 = btsVar.k(yz40Var2);
            Object Q13 = btsVar.Q();
            if (k5 || Q13 == obj) {
                wg6Var3 = wg6Var;
                final tse tseVar4 = tseVar2;
                Q13 = new sls() { // from class: com.yandex.go.taxi.summary.verticalsummary.ui.e
                    @Override // defpackage.sls
                    public final Object invoke() {
                        tje.N(tse.this, null, null, new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$scrimClickCallback$1$1$1(wg6Var3, dh31Var2, null), 3);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q13);
            } else {
                wg6Var3 = wg6Var;
            }
            sls slsVar = (sls) Q13;
            int i17 = i3 >> 3;
            int i18 = i17 & 14;
            AppColor$Palette appColor$Palette = AppColor$Palette.Fog;
            qor b = gcb1.b(wg6Var3, i16, list, btsVar, i18);
            boolean z4 = ((i18 ^ 6) > 4 && btsVar.k(wg6Var3)) || (i17 & 6) == 4;
            Object Q14 = btsVar.Q();
            if (z4 || Q14 == obj) {
                Q14 = androidx.compose.runtime.f.d(new sgp0(wg6Var3, i16, 0));
                btsVar.o0(Q14);
            }
            m3u0 m3u0Var = (m3u0) Q14;
            boolean a3 = btsVar.a(((Boolean) m3u0Var.getValue()).booleanValue()) | btsVar.k(slsVar);
            Object Q15 = btsVar.Q();
            if (a3 || Q15 == obj) {
                sls slsVar2 = ((Boolean) m3u0Var.getValue()).booleanValue() ? slsVar : null;
                btsVar.o0(slsVar2);
                Q15 = slsVar2;
            }
            sls slsVar3 = (sls) Q15;
            boolean k6 = btsVar.k(appColor$Palette) | btsVar.k(b) | btsVar.k(slsVar3);
            Object Q16 = btsVar.Q();
            if (k6 || Q16 == obj) {
                Q16 = new lg6(appColor$Palette, b, slsVar3);
                btsVar.o0(Q16);
            }
            lg6 lg6Var = (lg6) Q16;
            final qor b2 = gcb1.b(wg6Var3, i16, list, btsVar, i18);
            final qor b3 = gcb1.b(wg6Var3, i15, list, btsVar, i18);
            if (dtr0Var3 != null) {
                btsVar.e0(-661348116);
                qorVar = gcb1.b(wg6Var3, dtr0Var3.a, list, btsVar, i18);
                i5 = 0;
                btsVar.t(false);
            } else {
                i5 = 0;
                btsVar.e0(-661172563);
                Object Q17 = btsVar.Q();
                if (Q17 == obj) {
                    Q17 = androidx.compose.runtime.f.f(1.0f);
                    btsVar.o0(Q17);
                }
                qorVar = (tx40) Q17;
                btsVar.t(false);
            }
            final qor qorVar2 = qorVar;
            List list2 = ki31Var.f.a;
            if (list2 != null) {
                Iterator it = list2.iterator();
                int i19 = i5;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    } else {
                        if (((uox0) it.next()).a) {
                            i7 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                Integer valueOf = Integer.valueOf(i7);
                if (i7 == -1) {
                    valueOf = null;
                }
                num = valueOf;
            } else {
                num = null;
            }
            gfd.a.getClass();
            final wg6 wg6Var4 = wg6Var3;
            Object obj3 = obj;
            yx40 yx40Var5 = yx40Var;
            oh31 oh31Var3 = oh31Var;
            final fwi fwiVar4 = fwiVar;
            yx40 yx40Var6 = yx40Var2;
            int i20 = i3;
            int i21 = i4;
            bts btsVar3 = btsVar;
            Integer num2 = num;
            boolean z5 = true;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, wg6Var, lg6Var, false, false, null, null, gfd.b, wwg.S(1297921210, true, new ls40(ki31Var, wg6Var3, tlsVar, 29), btsVar), wwg.S(-707569669, true, new cr5(wg6Var3, 2), btsVar), wwg.S(32985211, true, new ays0(24, ki31Var, tlsVar), btsVar), wwg.S(-577161561, true, new bms() { // from class: com.yandex.go.taxi.summary.verticalsummary.ui.f
                @Override // defpackage.bms
                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                    Object obj8;
                    Object obj9;
                    androidx.compose.foundation.lazy.b bVar;
                    oz40 oz40Var;
                    oz40 oz40Var2;
                    final tx40 tx40Var4;
                    j690 j690Var = (j690) obj5;
                    fid fidVar2 = (fid) obj6;
                    int intValue3 = ((Integer) obj7).intValue();
                    if ((intValue3 & 48) == 0) {
                        intValue3 |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar4 = (bts) fidVar2;
                    boolean V = btsVar4.V(intValue3 & 1, (intValue3 & 145) != 144);
                    dmw0 dmw0Var = btsVar4.a;
                    if (V) {
                        c530 c530Var = c530.a;
                        f530 c2 = ljs0.c(c530Var, 1.0f);
                        int i22 = intValue3 >> 3;
                        boolean z6 = (((i22 & 14) ^ 6) > 4 && btsVar4.k(j690Var)) || (i22 & 6) == 4;
                        Object Q18 = btsVar4.Q();
                        Object obj10 = did.a;
                        if (z6 || Q18 == obj10) {
                            Q18 = new p5r(j690Var);
                            btsVar4.o0(Q18);
                        }
                        f530 j = an91.j(c2, (p5r) Q18);
                        sic a4 = qic.a(lr20.c, x4c.H, btsVar4, 48);
                        int hashCode = Long.hashCode(btsVar4.T);
                        r1b0 o = btsVar4.o();
                        f530 d = androidx.compose.ui.b.d(btsVar4, j);
                        ohd.G1.getClass();
                        sls slsVar4 = androidx.compose.ui.node.d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar4.i0();
                        if (btsVar4.S) {
                            btsVar4.n(slsVar4);
                        } else {
                            btsVar4.r0();
                        }
                        qje.W(btsVar4, androidx.compose.ui.node.d.f, a4);
                        qje.W(btsVar4, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar4, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar4, androidx.compose.ui.node.d.h);
                        qje.W(btsVar4, androidx.compose.ui.node.d.d, d);
                        Object Q19 = btsVar4.Q();
                        if (Q19 == obj10) {
                            Q19 = new aq5(tx40Var, 7);
                            btsVar4.o0(Q19);
                        }
                        f530 b4 = xm91.b(c530Var, (tls) Q19);
                        ki31 ki31Var2 = ki31.this;
                        z91 z91Var = ki31Var2.a;
                        bpl0 bpl0Var = ki31Var2.f;
                        Object Q20 = btsVar4.Q();
                        if (Q20 == obj10) {
                            Q20 = new ke31(6);
                            btsVar4.o0(Q20);
                        }
                        tls tlsVar3 = tlsVar;
                        jpa1.b(z91Var, b4, un91.b(tlsVar3, (tls) Q20, btsVar4), btsVar4, 48, 0);
                        f530 g = s1a1.g(c530Var, 1.0f);
                        Object Q21 = btsVar4.Q();
                        if (Q21 == obj10) {
                            Q21 = new aq5(tx40Var2, 8);
                            btsVar4.o0(Q21);
                        }
                        f530 b5 = xm91.b(g, (tls) Q21);
                        gfd.a.getClass();
                        zwa1.a(b5, b2, b3, null, gfd.c, wwg.S(2110671073, true, new hex0(27, ki31Var2, tlsVar3), btsVar4), gfd.d, btsVar4, 1794054);
                        Object Q22 = btsVar4.Q();
                        if (Q22 == obj10) {
                            Q22 = new aq5(tx40Var3, 6);
                            btsVar4.o0(Q22);
                        }
                        f530 b6 = xm91.b(c530Var, (tls) Q22);
                        lej0 lej0Var = ki31Var2.e;
                        l690 l690Var = new l690(16.0f, 8.0f, 16.0f, 8.0f);
                        Object Q23 = btsVar4.Q();
                        if (Q23 == obj10) {
                            Q23 = new ke31(2);
                            btsVar4.o0(Q23);
                        }
                        kla1.a(lej0Var, b6, l690Var, un91.b(tlsVar3, (tls) Q23, btsVar4), btsVar4, 48, 0);
                        btsVar4.e0(-1900580447);
                        dh31 dh31Var3 = dh31Var2;
                        yz40 yz40Var5 = dh31Var3.c;
                        yz40 yz40Var6 = dh31Var3.a;
                        int i23 = yz40Var5.c;
                        float w02 = ((fwi) btsVar4.m(j.h)).w0(4.0f);
                        wg6 wg6Var5 = wg6Var4;
                        boolean k7 = btsVar4.k(wg6Var5) | btsVar4.c(i23);
                        Object Q24 = btsVar4.Q();
                        if (k7 || Q24 == obj10) {
                            Q24 = androidx.compose.runtime.f.d(new pf6(wg6Var5, i23, w02, 2));
                            btsVar4.o0(Q24);
                        }
                        m3u0 m3u0Var2 = (m3u0) Q24;
                        boolean k8 = btsVar4.k(yz40Var6);
                        Object Q25 = btsVar4.Q();
                        if (k8 || Q25 == obj10) {
                            Q25 = androidx.compose.runtime.f.d(new zr01(29, wg6Var5, dh31Var3));
                            btsVar4.o0(Q25);
                        }
                        Object obj11 = (m3u0) Q25;
                        List list3 = bpl0Var.a;
                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((uox0) it2.next()).c);
                        }
                        oz40 n = androidx.compose.runtime.f.n(arrayList, btsVar4);
                        oz40 n2 = androidx.compose.runtime.f.n(num, btsVar4);
                        z910 d2 = pi6.d(x4c.b, false);
                        int hashCode2 = Long.hashCode(btsVar4.T);
                        r1b0 o2 = btsVar4.o();
                        f530 d3 = androidx.compose.ui.b.d(btsVar4, c530Var);
                        ohd.G1.getClass();
                        sls slsVar5 = androidx.compose.ui.node.d.b;
                        btsVar4.i0();
                        if (btsVar4.S) {
                            btsVar4.n(slsVar5);
                        } else {
                            btsVar4.r0();
                        }
                        qje.W(btsVar4, androidx.compose.ui.node.d.f, d2);
                        qje.W(btsVar4, androidx.compose.ui.node.d.e, o2);
                        qje.W(btsVar4, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode2));
                        qje.M(btsVar4, androidx.compose.ui.node.d.h);
                        qje.W(btsVar4, androidx.compose.ui.node.d.d, d3);
                        f530 m = ymb1.m(ljs0.c);
                        final long n3 = tje.n(AppColor$Palette.Line, btsVar4);
                        androidx.compose.runtime.h hVar = j.h;
                        fwi fwiVar5 = (fwi) btsVar4.m(hVar);
                        final float w03 = fwiVar5.w0(1.0f);
                        final float w04 = fwiVar5.w0(16.0f);
                        final float f7 = w03 / 2.0f;
                        final float w05 = fwiVar5.w0(8.0f) + f7;
                        boolean k9 = btsVar4.k(n);
                        Object Q26 = btsVar4.Q();
                        if (k9 || Q26 == obj10) {
                            obj8 = obj11;
                            Q26 = new w5(6, n);
                            btsVar4.o0(Q26);
                        } else {
                            obj8 = obj11;
                        }
                        final androidx.compose.foundation.lazy.b bVar2 = a2;
                        final m3u0 c3 = com.yandex.go.taxi.summary.verticalsummary.utils.c.c(bVar2, n, (tls) Q26, btsVar4, 0);
                        boolean k10 = btsVar4.k(n);
                        Object Q27 = btsVar4.Q();
                        if (k10 || Q27 == obj10) {
                            obj9 = ki31Var2;
                            Q27 = new w5(7, n);
                            btsVar4.o0(Q27);
                        } else {
                            obj9 = ki31Var2;
                        }
                        final m3u0 c4 = com.yandex.go.taxi.summary.verticalsummary.utils.c.c(bVar2, n, (tls) Q27, btsVar4, 0);
                        boolean k11 = btsVar4.k(c3) | btsVar4.k(bVar2) | btsVar4.k(c4) | btsVar4.b(w04) | btsVar4.d(n3) | btsVar4.b(w05) | btsVar4.b(f7) | btsVar4.b(w03);
                        Object Q28 = btsVar4.Q();
                        if (k11 || Q28 == obj10) {
                            Q28 = new tls() { // from class: ny1
                                @Override // defpackage.tls
                                public final Object invoke(Object obj12) {
                                    qam qamVar = (qam) obj12;
                                    Integer num3 = (Integer) m3u0.this.getValue();
                                    b bVar3 = bVar2;
                                    n6y n6yVar = num3 != null ? (n6y) bVar3.j().k.get(num3.intValue()) : null;
                                    Integer num4 = (Integer) c4.getValue();
                                    n6y n6yVar2 = num4 != null ? (n6y) bVar3.j().k.get(num4.intValue()) : null;
                                    zy11 zy11Var = zy11.a;
                                    if (n6yVar == null && n6yVar2 == null) {
                                        return zy11Var;
                                    }
                                    float f8 = w04;
                                    float f9 = n6yVar != null ? ((t6y) n6yVar).p : f8;
                                    float f10 = (n6yVar2 != null ? ((t6y) n6yVar2).p : f8) + f9;
                                    float f11 = n6yVar != null ? ((t6y) n6yVar).o : n6yVar2 != null ? ((t6y) n6yVar2).o - f9 : 0.0f;
                                    float f12 = f11 + f7 + (-bVar3.j().l);
                                    float f13 = w05;
                                    qam.g0(qamVar, n3, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f12) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32)) - (f13 * 2.0f)) << 32) | (Float.floatToRawIntBits(f10 - (r4 * 2.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(0, 0, 30, w03, 0.0f), 224);
                                    return zy11Var;
                                }
                            };
                            bVar = bVar2;
                            btsVar4.o0(Q28);
                        } else {
                            bVar = bVar2;
                        }
                        f530 g2 = bb1.g(m, (tls) Q28);
                        AppColor$Palette appColor$Palette2 = AppColor$Palette.BgMinor;
                        ck11 K = sb2.K(0, 0, null, 7);
                        fwi fwiVar6 = (fwi) btsVar4.m(hVar);
                        final long n4 = tje.n(appColor$Palette2, btsVar4);
                        final float w06 = fwiVar6.w0(8.0f);
                        final float w07 = fwiVar6.w0(16.0f);
                        Object Q29 = btsVar4.Q();
                        if (Q29 == obj10) {
                            Q29 = androidx.compose.runtime.f.j(new zgq0(null, null));
                            btsVar4.o0(Q29);
                        }
                        oz40 oz40Var3 = (oz40) Q29;
                        Object Q30 = btsVar4.Q();
                        if (Q30 == obj10) {
                            Q30 = androidx.compose.runtime.f.f(0.0f);
                            btsVar4.o0(Q30);
                        }
                        tx40 tx40Var5 = (tx40) Q30;
                        boolean k12 = btsVar4.k(n2) | btsVar4.e(K);
                        Object Q31 = btsVar4.Q();
                        if (k12 || Q31 == obj10) {
                            Q31 = new LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1(n2, oz40Var3, K, tx40Var5, null);
                            oz40Var = n2;
                            oz40Var2 = oz40Var3;
                            tx40Var4 = tx40Var5;
                            btsVar4.o0(Q31);
                        } else {
                            oz40Var = n2;
                            oz40Var2 = oz40Var3;
                            tx40Var4 = tx40Var5;
                        }
                        zpn.e(btsVar4, (wls) Q31, oz40Var);
                        Object Q32 = btsVar4.Q();
                        if (Q32 == obj10) {
                            Q32 = new ttm(2, oz40Var2);
                            btsVar4.o0(Q32);
                        }
                        final m3u0 c5 = com.yandex.go.taxi.summary.verticalsummary.utils.c.c(bVar, oz40Var2, (tls) Q32, btsVar4, 432);
                        Object Q33 = btsVar4.Q();
                        if (Q33 == obj10) {
                            Q33 = new ttm(3, oz40Var2);
                            btsVar4.o0(Q33);
                        }
                        final m3u0 c6 = com.yandex.go.taxi.summary.verticalsummary.utils.c.c(bVar, oz40Var2, (tls) Q33, btsVar4, 432);
                        boolean k13 = btsVar4.k(c5) | btsVar4.k(bVar) | btsVar4.k(c6) | btsVar4.b(w06) | btsVar4.b(w07) | btsVar4.d(n4);
                        Object Q34 = btsVar4.Q();
                        if (k13 || Q34 == obj10) {
                            final androidx.compose.foundation.lazy.b bVar3 = bVar;
                            Q34 = new tls() { // from class: n3y
                                @Override // defpackage.tls
                                public final Object invoke(Object obj12) {
                                    n6y n6yVar;
                                    float f8;
                                    qam qamVar = (qam) obj12;
                                    Integer num3 = (Integer) m3u0.this.getValue();
                                    b bVar4 = bVar3;
                                    if (num3 != null) {
                                        n6yVar = (n6y) bVar4.j().k.get(num3.intValue());
                                    } else {
                                        n6yVar = null;
                                    }
                                    zy11 zy11Var = zy11.a;
                                    if (n6yVar == null) {
                                        return zy11Var;
                                    }
                                    float floatValue = tx40Var4.getFloatValue();
                                    Integer num4 = (Integer) c6.getValue();
                                    float f9 = 0.0f;
                                    if (floatValue == 0.0f || num4 == null) {
                                        f8 = 0.0f;
                                    } else {
                                        n6y n6yVar2 = (n6y) bVar4.j().k.get(num4.intValue());
                                        t6y t6yVar = (t6y) n6yVar;
                                        f9 = (((t6y) n6yVar2).o - t6yVar.o) * floatValue;
                                        f8 = floatValue * (((t6y) n6yVar2).p - t6yVar.p);
                                    }
                                    t6y t6yVar2 = (t6y) n6yVar;
                                    float f10 = (-bVar4.j().l) + t6yVar2.o + f9;
                                    float f11 = t6yVar2.p + f8;
                                    float f12 = w06;
                                    qam.g0(qamVar, n4, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f10) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32)) - (f12 * 2.0f)) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f11)), (Float.floatToRawIntBits(r5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w07) << 32), null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                                    return zy11Var;
                                }
                            };
                            btsVar4.o0(Q34);
                        }
                        f530 g3 = bb1.g(g2, (tls) Q34);
                        l690 d4 = an91.d(0.0f, 8.0f, 0.0f, j690Var.a() + 8.0f, 5);
                        boolean booleanValue = ((Boolean) m3u0Var2.getValue()).booleanValue();
                        Object obj12 = obj9;
                        Object obj13 = obj8;
                        boolean k14 = btsVar4.k(obj12) | btsVar4.k(obj13);
                        Object obj14 = qorVar2;
                        boolean k15 = k14 | btsVar4.k(obj14) | btsVar4.k(tlsVar3) | btsVar4.k(m3u0Var2);
                        Object obj15 = fwiVar4;
                        boolean k16 = k15 | btsVar4.k(obj15);
                        Object Q35 = btsVar4.Q();
                        if (k16 || Q35 == obj10) {
                            Q35 = new at5(obj12, obj13, obj14, tlsVar3, m3u0Var2, obj15, 14);
                            btsVar4.o0(Q35);
                        }
                        adb1.a(g3, bVar, d4, null, null, null, booleanValue, null, (tls) Q35, btsVar4, 100663296, 120);
                        int i24 = yz40Var6.c;
                        Object obj16 = (fwi) btsVar4.m(hVar);
                        boolean k17 = btsVar4.k(bVar) | btsVar4.k(obj16);
                        Object Q36 = btsVar4.Q();
                        if (k17 || Q36 == obj10) {
                            Q36 = androidx.compose.runtime.f.d(new hh31(1, obj16, bVar));
                            btsVar4.o0(Q36);
                        }
                        zf91.a(null, androidx.compose.animation.core.b.b(((dtr0) wg6Var5.g.getValue()).a != i24 ? ((Number) ((m3u0) Q36).getValue()).floatValue() : 0.0f, null, "verticalSummaryFadeAlpha", null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 22), btsVar4, 0);
                        tse0.t(btsVar4, true, false, true);
                    } else {
                        btsVar4.Y();
                    }
                    return zy11.a;
                }
            }, btsVar3), btsVar3, i21 | 918552576, 54, Constants.VPN_TRAFFIC);
            if ((i20 & 7168) != 2048) {
                tprVar2 = tprVar;
                if ((i20 & 4096) == 0 || !btsVar3.e(tprVar2)) {
                    z2 = false;
                    if (i21 != 32) {
                        z5 = false;
                    }
                    k = z2 | z5 | btsVar3.k(dh31Var2);
                    Q = btsVar3.Q();
                    if (!k || Q == obj3) {
                        Q = new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1(tprVar2, wg6Var, dh31Var2, null);
                        btsVar3.o0(Q);
                    }
                    zpn.e(btsVar3, (wls) Q, tprVar2);
                    k2 = btsVar3.k(dh31Var2) | btsVar3.k(oh31Var3);
                    Q2 = btsVar3.Q();
                    if (!k2 || Q2 == obj3) {
                        yz40Var = yz40Var3;
                        int i22 = yz40Var.c;
                        i6 = i15;
                        Q2 = scc.g(new f62(i22, oh31Var3.a, i22), new f62(i6, oh31Var3.b, i6), new f62(i16, oh31Var3.c, i16));
                        btsVar3.o0(Q2);
                    } else {
                        yz40Var = yz40Var3;
                        i6 = i15;
                    }
                    d.a(a2, wg6Var, num2, (List) Q2, yz40Var4.c, com.yandex.go.design.compose.modal.bottomsheet.b.a, btsVar3, i21);
                    wg6Var2 = wg6Var;
                    tlsVar2 = tlsVar;
                    a(wg6Var2, i6, tlsVar2, btsVar3, i18 | (i20 & 896));
                    b(yz40Var.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.d, btsVar3, 3504);
                    b(yz40Var2.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.e, btsVar3, 3504);
                    b(yz40Var4.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.f, btsVar3, 3504);
                    Q3 = btsVar3.Q();
                    if (Q3 == obj3) {
                        Q3 = new jiz0(29);
                        btsVar3.o0(Q3);
                    }
                    wls wlsVar = (wls) Q3;
                    k3 = btsVar3.k(qorVar2);
                    Q4 = btsVar3.Q();
                    if (!k3 || Q4 == obj3) {
                        Q4 = new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1(qorVar2, yx40Var5, yx40Var6, null);
                        btsVar3.o0(Q4);
                    }
                    com.yandex.go.taxi.summary.verticalsummary.utils.c.a(a2, wlsVar, dh31Var2, (wls) Q4, btsVar3, 48);
                    btsVar2 = btsVar3;
                }
            } else {
                tprVar2 = tprVar;
            }
            z2 = true;
            if (i21 != 32) {
            }
            k = z2 | z5 | btsVar3.k(dh31Var2);
            Q = btsVar3.Q();
            if (!k) {
            }
            Q = new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$5$1(tprVar2, wg6Var, dh31Var2, null);
            btsVar3.o0(Q);
            zpn.e(btsVar3, (wls) Q, tprVar2);
            k2 = btsVar3.k(dh31Var2) | btsVar3.k(oh31Var3);
            Q2 = btsVar3.Q();
            if (k2) {
            }
            yz40Var = yz40Var3;
            int i222 = yz40Var.c;
            i6 = i15;
            Q2 = scc.g(new f62(i222, oh31Var3.a, i222), new f62(i6, oh31Var3.b, i6), new f62(i16, oh31Var3.c, i16));
            btsVar3.o0(Q2);
            d.a(a2, wg6Var, num2, (List) Q2, yz40Var4.c, com.yandex.go.design.compose.modal.bottomsheet.b.a, btsVar3, i21);
            wg6Var2 = wg6Var;
            tlsVar2 = tlsVar;
            a(wg6Var2, i6, tlsVar2, btsVar3, i18 | (i20 & 896));
            b(yz40Var.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.d, btsVar3, 3504);
            b(yz40Var2.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.e, btsVar3, 3504);
            b(yz40Var4.a, tx40Var, tx40Var2, tx40Var3, oh31Var3.f, btsVar3, 3504);
            Q3 = btsVar3.Q();
            if (Q3 == obj3) {
            }
            wls wlsVar2 = (wls) Q3;
            k3 = btsVar3.k(qorVar2);
            Q4 = btsVar3.Q();
            if (!k3) {
            }
            Q4 = new VerticalSummaryBottomSheetKt$VerticalSummaryBottomSheet$7$1(qorVar2, yx40Var5, yx40Var6, null);
            btsVar3.o0(Q4);
            com.yandex.go.taxi.summary.verticalsummary.utils.c.a(a2, wlsVar2, dh31Var2, (wls) Q4, btsVar3, 48);
            btsVar2 = btsVar3;
        } else {
            tlsVar2 = tlsVar;
            wg6Var2 = wg6Var;
            btsVar2.Y();
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new c8i0(ki31Var, wg6Var2, tlsVar2, tprVar2, i, 24);
        }
    }
}

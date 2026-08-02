package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.f;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkCounter.kt */
/* loaded from: classes17.dex */
public final class nou0 {
    public static final void a(final int i, final CounterSize counterSize, final CounterAppearance counterAppearance, q630 q630Var, final CounterMode counterMode, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(811313088);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.o(counterSize.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? M.J(counterAppearance) : M.y(counterAppearance) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.o(counterMode == null ? -1 : counterMode.ordinal()) ? 16384 : 8192;
        }
        int i6 = i4 | 196608;
        if (M.t(i6 & 1, (74899 & i6) != 74898)) {
            q630 q630Var3 = i5 != 0 ? q630.a.a : q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(811313088, i6, -1, "com.vk.core.compose.component.VkCounter (VkCounter.kt:187)");
            }
            int i7 = i6 >> 3;
            b(i, counterSize, q630Var3, counterMode, com.vk.core.compose.component.defaults.f.a(counterMode, counterAppearance, M, ((i6 >> 12) & 14) | (i7 & 112)), true, M, (i7 & 7168) | (i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i7 & 896) | (i6 & 458752), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
            aVar2 = M;
            z2 = true;
        } else {
            M.h();
            q630Var2 = q630Var;
            aVar2 = M;
            z2 = z;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gou0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nou0.a(i, counterSize, counterAppearance, q630Var2, counterMode, z2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final CounterSize counterSize, q630 q630Var, CounterMode counterMode, final gxj gxjVar, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        int i5;
        boolean z2;
        final CounterMode counterMode2;
        final q630 q630Var3;
        final boolean z3;
        androidx.compose.runtime.f s;
        CounterMode counterMode3;
        q630 q630Var4;
        final boolean z4;
        Object x;
        Object obj;
        Object x2;
        Object x3;
        Object x4;
        q630 q630Var5;
        boolean z5;
        Object x5;
        dtp0 dtp0Var;
        int i6;
        final dtp0 dtp0Var2;
        final CounterSize counterSize2 = counterSize;
        androidx.compose.runtime.a M = aVar.M(-1128123572);
        int i7 = (i2 & 6) == 0 ? (M.o(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= M.o(counterSize2.ordinal()) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 256 : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i7 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i7 |= M.o(counterMode == null ? -1 : counterMode.ordinal()) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i7 |= M.J(gxjVar) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i7 |= 196608;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 196608) == 0) {
                    i7 |= M.l(z2) ? 131072 : 65536;
                }
            }
            if (M.t(i7 & 1, (i7 & 74899) == 74898)) {
                M.h();
                counterMode2 = counterMode;
                q630Var3 = q630Var2;
                z3 = z2;
            } else {
                M.V();
                int i9 = i2 & 1;
                q630.a aVar2 = q630.a.a;
                if (i9 == 0 || M.i()) {
                    if (i8 != 0) {
                        q630Var2 = aVar2;
                    }
                    counterMode3 = i4 != 0 ? CounterMode.Primary : counterMode;
                    if (i5 != 0) {
                        q630Var4 = q630Var2;
                        z4 = true;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1128123572, i7, -1, "com.vk.core.compose.component.VkCounter (VkCounter.kt:74)");
                        }
                        x = M.x();
                        obj = a.C0011a.a;
                        if (x == obj) {
                            x = androidx.compose.runtime.i.a(i);
                            M.R(x);
                        }
                        rg50 rg50Var = (rg50) x;
                        int i10 = i7 & 14;
                        wh50 c = androidx.compose.runtime.k.c(Integer.valueOf(i), M, i10);
                        x2 = M.x();
                        if (x2 == obj) {
                            x2 = bbk0.b(new ss3(24, c, rg50Var));
                            M.R(x2);
                        }
                        final mtk0 mtk0Var = (mtk0) x2;
                        x3 = M.x();
                        if (x3 == obj) {
                            x3 = bbk0.b(new q26(3, c));
                            M.R(x3);
                        }
                        mtk0 mtk0Var2 = (mtk0) x3;
                        x4 = M.x();
                        if (x4 == obj) {
                            x4 = bbk0.b(new grs0(1, c, rg50Var));
                            M.R(x4);
                        }
                        final mtk0 mtk0Var3 = (mtk0) x4;
                        M.K(-1794964256);
                        if (counterMode3 == CounterMode.Tertiary) {
                            int i11 = (i7 >> 3) & 14;
                            q630Var5 = q630Var4.g(txj0.b(com.vk.core.compose.component.defaults.f.c(counterSize2, M, i11), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(aVar2, com.vk.core.compose.component.defaults.f.c(counterSize2, M, i11))));
                        } else {
                            q630Var5 = q630Var4;
                        }
                        M.j();
                        z5 = (i7 & 7168) != 2048;
                        x5 = M.x();
                        if (!z5 || x5 == obj) {
                            x5 = new mvl0(counterMode3, 16);
                            M.R(x5);
                        }
                        CounterMode counterMode4 = counterMode3;
                        q630 m = hr80.m(rdu.a(q630Var5, (izs) x5), ((l5g) gxjVar.a((i7 >> 12) & 14, M).getValue()).a, androidx.compose.ui.graphics.e.a);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (M.N() != null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(M, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(M, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(M, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(M, c2678a);
                        int i12 = i7;
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(M, c2, dVar);
                        M.K(-461542772);
                        int i13 = (i12 >> 9) & 14;
                        q630 q630Var6 = q630Var4;
                        CounterMode counterMode5 = counterMode4;
                        int i14 = i10;
                        final int r0 = ((azl) M.r(uvi.h)).r0(com.vk.core.compose.component.defaults.f.e(counterMode5, i13, 0)) * 2;
                        M.j();
                        Object x6 = M.x();
                        if (x6 == obj) {
                            x6 = jq2.d(200, 0, luo.d, 2);
                            M.R(x6);
                        }
                        dtp0 dtp0Var3 = (dtp0) x6;
                        Object x7 = M.x();
                        if (x7 == obj) {
                            dtp0Var = dtp0Var3;
                            x7 = jq2.d(200, 0, luo.d, 2);
                            M.R(x7);
                        } else {
                            dtp0Var = dtp0Var3;
                        }
                        dtp0 dtp0Var4 = (dtp0) x7;
                        Object x8 = M.x();
                        if (x8 == obj) {
                            i6 = 2;
                            x8 = jq2.d(200, 0, luo.d, 2);
                            M.R(x8);
                        } else {
                            i6 = 2;
                        }
                        final dtp0 dtp0Var5 = (dtp0) x8;
                        boolean z6 = true;
                        q630 a = xp2.a(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.vk.core.compose.component.defaults.f.e(counterMode5, i13, 0), 1, aVar2), dtp0Var4, i6);
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c3 = qri.c(M, a);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a2, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c3, dVar);
                        int i15 = i12 & 458752;
                        boolean z7 = i15 == 131072;
                        Object x9 = M.x();
                        if (z7 || x9 == obj) {
                            dtp0Var2 = dtp0Var;
                            x9 = bbk0.b(new gzs() { // from class: xsna.jou0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    if (!z4 || ((Boolean) mtk0Var3.getValue()).booleanValue()) {
                                        return qpp.a;
                                    }
                                    rpp e = anp.e(dtp0Var2, 2);
                                    boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                                    int i16 = r0;
                                    return e.b(anp.l(dtp0Var5, booleanValue ? new c9(i16, 2) : new ybn0(i16, 1)));
                                }
                            });
                            M.R(x9);
                        } else {
                            dtp0Var2 = dtp0Var;
                        }
                        final mtk0 mtk0Var4 = (mtk0) x9;
                        boolean z8 = i15 == 131072;
                        Object x10 = M.x();
                        if (z8 || x10 == obj) {
                            x10 = bbk0.b(new gzs() { // from class: xsna.kou0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    if (!z4 || ((Boolean) mtk0Var3.getValue()).booleanValue()) {
                                        return d5q.a;
                                    }
                                    e5q f = anp.f(dtp0Var2, 2);
                                    boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                                    final int i16 = r0;
                                    return f.b(anp.o(dtp0Var5, booleanValue ? new izs() { // from class: xsna.iou0
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj2) {
                                            return Integer.valueOf(((-((Integer) obj2).intValue()) / 2) + i16);
                                        }
                                    } : new wom(i16, 2)));
                                }
                            });
                            M.R(x10);
                        }
                        final mtk0 mtk0Var5 = (mtk0) x10;
                        int i16 = ((i12 >> 3) & 14) | ((i12 >> 6) & 112);
                        counterSize2 = counterSize;
                        f9t.e(txj0.v(aVar2, com.vk.core.compose.component.defaults.f.d(counterSize2, counterMode5, M, i16, 0)), M, 0);
                        M.K(-351726024);
                        int i17 = 0;
                        for (int length = ((String) mtk0Var2.getValue()).length(); i17 < length; length = length) {
                            Character valueOf2 = Character.valueOf(((String) mtk0Var2.getValue()).charAt(i17));
                            boolean J = M.J(mtk0Var4) | M.J(mtk0Var5);
                            Object x11 = M.x();
                            if (J || x11 == obj) {
                                x11 = new v53(27, mtk0Var4, mtk0Var5);
                                M.R(x11);
                            }
                            final CounterMode counterMode6 = counterMode5;
                            counterSize2 = counterSize;
                            xh2.a(valueOf2, null, (izs) x11, null, "VkCounterCharSlide", null, kai.c(-1744796985, new zzs() { // from class: xsna.lou0
                                @Override // xsna.zzs
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    final char charValue = ((Character) obj3).charValue();
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1744796985, intValue, -1, "com.vk.core.compose.component.VkCounter.<anonymous>.<anonymous>.<anonymous> (VkCounter.kt:143)");
                                    }
                                    Object x12 = aVar4.x();
                                    if (x12 == a.C0011a.a) {
                                        x12 = new bi50(Boolean.FALSE);
                                        aVar4.R(x12);
                                    }
                                    bi50 bi50Var = (bi50) x12;
                                    bi50Var.w0(Boolean.TRUE);
                                    qpp qppVar = (qpp) mtk0.this.getValue();
                                    d5q d5qVar = (d5q) mtk0Var5.getValue();
                                    final CounterMode counterMode7 = counterMode6;
                                    final CounterSize counterSize3 = counterSize;
                                    final gxj gxjVar2 = gxjVar;
                                    mm2.d(tpg0.a, bi50Var, q630.a.a, qppVar, d5qVar, null, kai.c(-1340467297, new yzs() { // from class: xsna.hou0
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            frv0 frv0Var;
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj7;
                                            int intValue2 = ((Integer) obj8).intValue();
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-1340467297, intValue2, -1, "com.vk.core.compose.component.VkCounter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkCounter.kt:149)");
                                            }
                                            String valueOf3 = String.valueOf(charValue);
                                            float f = com.vk.core.compose.component.defaults.f.a;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1455551385, 0, -1, "com.vk.core.compose.component.defaults.VkCounterDefaults.textStyle (VkCounterDefaults.kt:44)");
                                            }
                                            aVar5.K(341918820);
                                            int i18 = f.a.$EnumSwitchMapping$1[counterMode7.ordinal()];
                                            CounterSize counterSize4 = counterSize3;
                                            if (i18 == 1 || i18 == 2) {
                                                aVar5.K(341998645);
                                                int i19 = f.a.$EnumSwitchMapping$0[counterSize4.ordinal()];
                                                if (i19 == 1) {
                                                    aVar5.K(-1374439097);
                                                    frv0Var = wlb0.l(aVar5).w0;
                                                    aVar5.j();
                                                } else if (i19 == 2) {
                                                    aVar5.K(-1374436792);
                                                    frv0Var = wlb0.l(aVar5).P;
                                                    aVar5.j();
                                                } else {
                                                    if (i19 != 3) {
                                                        throw alb0.c(-1374441107, aVar5);
                                                    }
                                                    aVar5.K(-1374434456);
                                                    frv0Var = wlb0.l(aVar5).P;
                                                    aVar5.j();
                                                }
                                                aVar5.j();
                                            } else {
                                                if (i18 != 3) {
                                                    throw alb0.c(-1374443389, aVar5);
                                                }
                                                aVar5.K(342278358);
                                                int i20 = f.a.$EnumSwitchMapping$0[counterSize4.ordinal()];
                                                if (i20 == 1) {
                                                    aVar5.K(-1374430073);
                                                    frv0Var = wlb0.l(aVar5).m0;
                                                    aVar5.j();
                                                } else if (i20 == 2) {
                                                    aVar5.K(-1374427768);
                                                    frv0Var = wlb0.l(aVar5).c0;
                                                    aVar5.j();
                                                } else {
                                                    if (i20 != 3) {
                                                        throw alb0.c(-1374432084, aVar5);
                                                    }
                                                    aVar5.K(-1374425464);
                                                    frv0Var = wlb0.l(aVar5).c0;
                                                    aVar5.j();
                                                }
                                                aVar5.j();
                                            }
                                            frv0 b = frv0Var.b(aVar5);
                                            aVar5.j();
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            yqv0.c(valueOf3, null, ((l5g) gxjVar2.b(aVar5).getValue()).a, null, null, 0, 3, null, 0, false, 0, 0, null, b, aVar5, 0, 0, 8122);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4), aVar4, 1573248, 16);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    return s3q0.a;
                                }
                            }, M), M, 1597440, 42);
                            i17++;
                            counterMode5 = counterMode6;
                            obj = obj;
                            mtk0Var4 = mtk0Var4;
                            mtk0Var5 = mtk0Var5;
                            z6 = z6;
                            i14 = i14;
                        }
                        CounterMode counterMode7 = counterMode5;
                        boolean z9 = z6;
                        int i18 = i14;
                        Object obj2 = obj;
                        M.j();
                        f9t.e(txj0.v(aVar2, com.vk.core.compose.component.defaults.f.d(counterSize2, counterMode7, M, i16, 0)), M, 0);
                        M.G();
                        M.G();
                        boolean z10 = i18 == 4 ? z9 : false;
                        Object x12 = M.x();
                        if (z10 || x12 == obj2) {
                            x12 = new uc70(i, rg50Var);
                            M.R(x12);
                        }
                        bap.i((gzs) x12, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        counterMode2 = counterMode7;
                        z3 = z4;
                        q630Var3 = q630Var6;
                    }
                } else {
                    M.h();
                    counterMode3 = counterMode;
                }
                z4 = z2;
                q630Var4 = q630Var2;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                }
                x = M.x();
                obj = a.C0011a.a;
                if (x == obj) {
                }
                rg50 rg50Var2 = (rg50) x;
                int i102 = i7 & 14;
                wh50 c4 = androidx.compose.runtime.k.c(Integer.valueOf(i), M, i102);
                x2 = M.x();
                if (x2 == obj) {
                }
                final mtk0 mtk0Var6 = (mtk0) x2;
                x3 = M.x();
                if (x3 == obj) {
                }
                mtk0 mtk0Var22 = (mtk0) x3;
                x4 = M.x();
                if (x4 == obj) {
                }
                final mtk0 mtk0Var32 = (mtk0) x4;
                M.K(-1794964256);
                if (counterMode3 == CounterMode.Tertiary) {
                }
                M.j();
                if ((i7 & 7168) != 2048) {
                }
                x5 = M.x();
                if (!z5) {
                }
                x5 = new mvl0(counterMode3, 16);
                M.R(x5);
                CounterMode counterMode42 = counterMode3;
                q630 m2 = hr80.m(rdu.a(q630Var5, (izs) x5), ((l5g) gxjVar.a((i7 >> 12) & 14, M).getValue()).a, androidx.compose.ui.graphics.e.a);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c22 = qri.c(M, m2);
                cri.h7.getClass();
                LayoutNode.a aVar32 = cri.a.b;
                if (M.N() != null) {
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.mou0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        nou0.b(i, counterSize2, q630Var3, counterMode2, gxjVar, z3, (androidx.compose.runtime.a) obj3, ne7.I(i2 | 1), i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if (M.t(i7 & 1, (i7 & 74899) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}

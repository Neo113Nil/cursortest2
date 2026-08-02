package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tra0;

/* compiled from: VkAccentTabRow.kt */
/* loaded from: classes17.dex */
public final class u6u0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-209575170);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-209575170, i, -1, "com.vk.core.compose.component.FixedTabIndicator (VkAccentTabRow.kt:517)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            bpn0 bpn0Var = npv0.a;
            TabMode tabMode = TabMode.Accent;
            q630 E = s200.E(txj0.h(f, npv0.b(tabMode)), npv0.c(tabMode), npv0.d(tabMode));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 a = r18.a((float) 0.5d, wlb0.h(M).p().a, txj0.d(aVar2, 1.0f), npv0.h(tabMode));
            r5j0 h = npv0.h(tabMode);
            wlb0.i(M).getClass();
            uov0.a(a, h, wlb0.h(M).getBackground().n, wlb0.h(M).getBackground().n, null, tqu0.c, nni.d, M, 1572864, 16);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e55(i);
        }
    }

    public static final void b(final yjl yjlVar, final jai jaiVar, final q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final long j2;
        final boolean z2;
        final zzs zzsVar2;
        int i3;
        zzs c;
        boolean z3;
        long j3;
        androidx.compose.runtime.a M = aVar.M(-1467355515);
        if ((i & 6) == 0) {
            i2 = (M.J(yjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i2 | 115041280;
        if (M.t(i4 & 1, (38347923 & i4) != 38347922)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j4 = ylu0Var.getBackground().g;
                i3 = i4 & (-7169);
                c = kai.c(-605713554, new o6u0(yjlVar), M);
                z3 = true;
                j3 = j4;
            } else {
                M.h();
                i3 = i4 & (-7169);
                j3 = j;
                z3 = z;
                c = zzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1467355515, i3, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow (VkAccentTabRow.kt:176)");
            }
            aVar2 = M;
            c(yjlVar.k(), jaiVar, q630Var, j3, z3, c, null, null, false, aVar2, i3 & 268435440, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
            z2 = z3;
            zzsVar2 = c;
        } else {
            aVar2 = M;
            aVar2.h();
            j2 = j;
            z2 = z;
            zzsVar2 = zzsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n6u0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u6u0.b(yjl.this, jaiVar, q630Var, j2, z2, zzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i, final jai jaiVar, q630 q630Var, long j, boolean z, zzs zzsVar, yzs yzsVar, qpv0 qpv0Var, boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        final long j2;
        int i5;
        boolean z3;
        int i6;
        zzs zzsVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final boolean z4;
        final q630 q630Var3;
        final long j3;
        final boolean z5;
        final zzs zzsVar3;
        final yzs yzsVar2;
        final qpv0 qpv0Var2;
        androidx.compose.runtime.f s;
        final boolean z6;
        int i12;
        q630 q630Var4;
        zzs zzsVar4;
        final qpv0 qpv0Var3;
        final yzs yzsVar3;
        final boolean z7;
        float f;
        jai c;
        jai jaiVar2;
        int i13;
        androidx.compose.runtime.a M = aVar.M(2037301687);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(jaiVar) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    if (M.p(j2)) {
                        i13 = 2048;
                        i4 |= i13;
                    }
                } else {
                    j2 = j;
                }
                i13 = 1024;
                i4 |= i13;
            } else {
                j2 = j;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= M.l(z3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    zzsVar2 = zzsVar;
                    i4 |= M.y(zzsVar2) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i9 = i8;
                        i4 |= M.J(qpv0Var) ? 8388608 : 4194304;
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i4 |= M.l(z2) ? 67108864 : 33554432;
                            if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
                                M.h();
                                z4 = z2;
                                q630Var3 = q630Var2;
                                j3 = j2;
                                z5 = z3;
                                zzsVar3 = zzsVar2;
                                yzsVar2 = yzsVar;
                                qpv0Var2 = qpv0Var;
                            } else {
                                M.V();
                                jai jaiVar3 = null;
                                if ((i2 & 1) == 0 || M.i()) {
                                    if (i14 != 0) {
                                        q630Var2 = q630.a.a;
                                    }
                                    if ((i3 & 8) != 0) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j2 = ylu0Var.getBackground().g;
                                        i4 &= -7169;
                                    }
                                    boolean z8 = i5 == 0 ? z3 : true;
                                    if (i6 != 0) {
                                        zzsVar2 = kai.c(489179822, new p6u0(i), M);
                                    }
                                    yzs yzsVar4 = i7 != 0 ? null : yzsVar;
                                    qpv0 qpv0Var4 = i9 != 0 ? null : qpv0Var;
                                    z6 = i11 != 0 ? false : z2;
                                    i12 = i4;
                                    q630Var4 = q630Var2;
                                    zzsVar4 = zzsVar2;
                                    qpv0Var3 = qpv0Var4;
                                    yzsVar3 = yzsVar4;
                                    z7 = z8;
                                } else {
                                    M.h();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    yzsVar3 = yzsVar;
                                    z6 = z2;
                                    z7 = z3;
                                    zzsVar4 = zzsVar2;
                                    i12 = i4;
                                    q630Var4 = q630Var2;
                                    qpv0Var3 = qpv0Var;
                                }
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(2037301687, i12, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow (VkAccentTabRow.kt:210)");
                                }
                                bpn0 bpn0Var = npv0.a;
                                TabMode tabMode = TabMode.Accent;
                                float i15 = npv0.i(tabMode);
                                float f2 = npv0.f(tabMode);
                                float g = npv0.g(tabMode);
                                if (yzsVar3 == null) {
                                    M.K(1073215092);
                                    M.j();
                                    f = f2;
                                    c = null;
                                } else {
                                    M.K(1073215093);
                                    f = f2;
                                    c = kai.c(-1413431671, new yzs() { // from class: xsna.e6u0
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            final anx anxVar = (anx) obj;
                                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar2.J(anxVar) ? 4 : 2;
                                            }
                                            if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1413431671, intValue, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous>.<anonymous> (VkAccentTabRow.kt:229)");
                                                }
                                                boolean z9 = (intValue & 14) == 4;
                                                final yzs yzsVar5 = yzsVar3;
                                                boolean J = z9 | aVar2.J(yzsVar5);
                                                final boolean z10 = z6;
                                                boolean l = J | aVar2.l(z10);
                                                final int i16 = i;
                                                boolean o = l | aVar2.o(i16);
                                                Object x = aVar2.x();
                                                if (o || x == a.C0011a.a) {
                                                    x = new wzs() { // from class: xsna.i6u0
                                                        @Override // xsna.wzs
                                                        public final Object invoke(Object obj4, Object obj5) {
                                                            final ztm0 ztm0Var = (ztm0) obj4;
                                                            final o6j o6jVar = (o6j) obj5;
                                                            final tra0 N = ((zo10) j5g.Y(ztm0Var.t1("tab", new jai(1315356744, new bta(10, anx.this, yzsVar5), true)))).N(o6jVar.a);
                                                            int i17 = N.b;
                                                            int i18 = N.c;
                                                            final boolean z11 = z10;
                                                            final int i19 = i16;
                                                            return ztm0Var.Q(i17, i18, jgp.b, new izs() { // from class: xsna.j6u0
                                                                @Override // xsna.izs
                                                                public final Object invoke(Object obj6) {
                                                                    tra0.a aVar3 = (tra0.a) obj6;
                                                                    final boolean z12 = z11;
                                                                    final int i20 = i19;
                                                                    zo10 zo10Var = (zo10) j5g.a0(ztm0.this.t1("indicator", new jai(-937980457, new wzs() { // from class: xsna.k6u0
                                                                        @Override // xsna.wzs
                                                                        public final Object invoke(Object obj7, Object obj8) {
                                                                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                                                                            int intValue2 = ((Integer) obj8).intValue();
                                                                            if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                                if (androidx.compose.runtime.b.d()) {
                                                                                    androidx.compose.runtime.b.f(-937980457, intValue2, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkAccentTabRow.kt:239)");
                                                                                }
                                                                                if (z12 && i20 == 0) {
                                                                                    aVar4.K(-318463944);
                                                                                    u6u0.a(0, aVar4);
                                                                                } else {
                                                                                    aVar4.K(-327702037);
                                                                                }
                                                                                aVar4.j();
                                                                                if (androidx.compose.runtime.b.d()) {
                                                                                    androidx.compose.runtime.b.e();
                                                                                }
                                                                            } else {
                                                                                aVar4.h();
                                                                            }
                                                                            return s3q0.a;
                                                                        }
                                                                    }, true)));
                                                                    tra0 tra0Var = N;
                                                                    if (zo10Var != null) {
                                                                        long j4 = o6jVar.a;
                                                                        int i21 = tra0Var.b;
                                                                        int i22 = tra0Var.c;
                                                                        aVar3.q(zo10Var.N(o6j.a(i21, i21, i22, i22)), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                    }
                                                                    aVar3.q(tra0Var, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                                                    return s3q0.a;
                                                                }
                                                            });
                                                        }
                                                    };
                                                    aVar2.R(x);
                                                }
                                                xtm0.a(null, (wzs) x, aVar2, 0, 1);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar2.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M);
                                    M.j();
                                }
                                if (qpv0Var3 == null) {
                                    M.K(1074446071);
                                    M.j();
                                    jaiVar2 = c;
                                } else {
                                    M.K(1074446072);
                                    jaiVar2 = c;
                                    jaiVar3 = kai.c(-843711865, new wzs() { // from class: xsna.f6u0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-843711865, intValue, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous>.<anonymous> (VkAccentTabRow.kt:258)");
                                                }
                                                qpv0.this.a(0, aVar2, null, z7);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar2.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M);
                                    M.j();
                                }
                                yzs yzsVar5 = yzsVar3;
                                boolean z9 = z7;
                                long j4 = j2;
                                zzs zzsVar5 = zzsVar4;
                                jai jaiVar4 = jaiVar3;
                                qpv0 qpv0Var5 = qpv0Var3;
                                boolean z10 = z6;
                                lnx.b(i, j4, f, g, q630Var4, false, i15, 0L, kai.c(-1826170117, new q6u0(z6, i, zzsVar4), M), nni.b, jaiVar2, jaiVar4, kai.c(855719708, new yzs() { // from class: xsna.g6u0
                                    @Override // xsna.yzs
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        anx anxVar = (anx) obj;
                                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        if ((intValue & 6) == 0) {
                                            intValue |= aVar2.J(anxVar) ? 4 : 2;
                                        }
                                        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(855719708, intValue, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous> (VkAccentTabRow.kt:261)");
                                            }
                                            rvi.b(new c9e0[]{opv0.a.b(Boolean.valueOf(z7)), vcl0.b(j2, opv0.b)}, kai.c(-539257892, new cg4(9, anxVar, jaiVar), aVar2), aVar2, 56);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar2.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, M), M, (i12 & 14) | 905969664 | ((i12 >> 6) & 112) | ((i12 << 6) & 57344), 160);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                yzsVar2 = yzsVar5;
                                z4 = z10;
                                qpv0Var2 = qpv0Var5;
                                z5 = z9;
                                zzsVar3 = zzsVar5;
                                j3 = j4;
                            }
                            s = M.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.h6u0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        u6u0.c(i, jaiVar, q630Var3, j3, z5, zzsVar3, yzsVar2, qpv0Var2, z4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
                        }
                        s = M.s();
                        if (s == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
                    }
                    s = M.s();
                    if (s == null) {
                    }
                }
                zzsVar2 = zzsVar;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            z3 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            zzsVar2 = zzsVar;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        zzsVar2 = zzsVar;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if (M.t(i4 & 1, (i4 & 38347923) == 38347922)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void d(final yjl yjlVar, final jai jaiVar, final q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i) {
        final long j2;
        final boolean z2;
        final zzs zzsVar2;
        int i2;
        boolean z3;
        long j3;
        zzs c;
        androidx.compose.runtime.a M = aVar.M(-943743756);
        int i3 = i | (M.J(yjlVar) ? 4 : 2) | 222208;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i2 = i3 & (-7169);
                z3 = true;
                j3 = ylu0Var.getBackground().g;
                c = kai.c(-1506757987, new r6u0(yjlVar), M);
            } else {
                M.h();
                i2 = i3 & (-7169);
                j3 = j;
                z3 = z;
                c = zzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-943743756, i2, -1, "com.vk.core.compose.component.VkAccentTabRow (VkAccentTabRow.kt:91)");
            }
            e(yjlVar.k(), jaiVar, q630Var, j3, z3, c, M, 221616, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
            z2 = z3;
            zzsVar2 = c;
        } else {
            M.h();
            j2 = j;
            z2 = z;
            zzsVar2 = zzsVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jaiVar, q630Var, j2, z2, zzsVar2, i) { // from class: xsna.d6u0
                public final /* synthetic */ jai c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ zzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(433);
                    u6u0.d(yjl.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final int i, final jai jaiVar, q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        jai jaiVar2;
        q630 q630Var2;
        long j2;
        int i5;
        boolean z2;
        int i6;
        zzs zzsVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1966462484);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jaiVar2 = jaiVar;
            i4 |= M.y(jaiVar2) ? 32 : 16;
        } else {
            jaiVar2 = jaiVar;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                j2 = j;
                i4 |= ((i3 & 8) == 0 && M.p(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    zzsVar2 = zzsVar;
                    i4 |= M.y(zzsVar2) ? 131072 : 65536;
                    if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                        M.h();
                    } else {
                        M.V();
                        if ((i2 & 1) == 0 || M.i()) {
                            if (i7 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            if ((i3 & 8) != 0) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j2 = ylu0Var.getBackground().g;
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if (i6 != 0) {
                                zzsVar2 = kai.c(1055592011, new s6u0(i), M);
                            }
                        } else {
                            M.h();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1966462484, i4, -1, "com.vk.core.compose.component.VkAccentTabRow (VkAccentTabRow.kt:125)");
                        }
                        final jai jaiVar3 = jaiVar2;
                        final q630 q630Var3 = q630Var2;
                        final long j3 = j2;
                        final zzs zzsVar3 = zzsVar2;
                        rvi.b(new c9e0[]{opv0.a.b(Boolean.valueOf(z2)), vcl0.b(j2, opv0.b)}, kai.c(-1221961004, new wzs() { // from class: xsna.l6u0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                                int intValue = ((Integer) obj2).intValue();
                                int i8 = 2;
                                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1221961004, intValue, -1, "com.vk.core.compose.component.VkAccentTabRow.<anonymous> (VkAccentTabRow.kt:131)");
                                    }
                                    bpn0 bpn0Var = npv0.a;
                                    TabMode tabMode = TabMode.Accent;
                                    lnx.c(j3, q630Var3, false, npv0.f(tabMode), npv0.g(tabMode), npv0.i(tabMode), 0L, kai.c(-1674447152, new t6u0(zzsVar3), aVar2), nni.a, kai.c(-748027338, new cjd(jaiVar3, i8), aVar2), aVar2, 918552576, 68);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, M), M, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                    final q630 q630Var4 = q630Var2;
                    final long j4 = j2;
                    final boolean z3 = z2;
                    final zzs zzsVar4 = zzsVar2;
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.m6u0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                u6u0.e(i, jaiVar, q630Var4, j4, z3, zzsVar4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                zzsVar2 = zzsVar;
                if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                }
                final q630 q630Var42 = q630Var2;
                final long j42 = j2;
                final boolean z32 = z2;
                final zzs zzsVar42 = zzsVar2;
                s = M.s();
                if (s == null) {
                }
            }
            z2 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            zzsVar2 = zzsVar;
            if (M.t(i4 & 1, (74899 & i4) == 74898)) {
            }
            final q630 q630Var422 = q630Var2;
            final long j422 = j2;
            final boolean z322 = z2;
            final zzs zzsVar422 = zzsVar2;
            s = M.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        zzsVar2 = zzsVar;
        if (M.t(i4 & 1, (74899 & i4) == 74898)) {
        }
        final q630 q630Var4222 = q630Var2;
        final long j4222 = j2;
        final boolean z3222 = z2;
        final zzs zzsVar4222 = zzsVar2;
        s = M.s();
        if (s == null) {
        }
    }

    public static final ej f(khx khxVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(174236505, i, -1, "com.vk.core.compose.component.rememberAccentTabIndicatorScope (VkAccentTabRow.kt:512)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new ej(khxVar);
            aVar.R(x);
        }
        ej ejVar = (ej) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ejVar;
    }

    public static final mj g(anx anxVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1248489887, i, -1, "com.vk.core.compose.component.rememberAccentTabScope (VkAccentTabRow.kt:431)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new mj(anxVar);
            aVar.R(x);
        }
        mj mjVar = (mj) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mjVar;
    }
}

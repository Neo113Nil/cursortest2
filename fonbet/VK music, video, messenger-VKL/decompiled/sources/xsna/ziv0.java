package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSecondaryTabRow.kt */
/* loaded from: classes17.dex */
public final class ziv0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        float f;
        androidx.compose.runtime.a M = aVar.M(-34972568);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-34972568, i, -1, "com.vk.core.compose.component.FixedTabIndicator (VkSecondaryTabRow.kt:511)");
            }
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(751104239);
                f = ((Number) M.r(hfj.a)).floatValue();
                M.j();
            } else {
                M.K(-1426238086);
                M.j();
                f = 0.64f;
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            bpn0 bpn0Var = npv0.a;
            TabMode tabMode = TabMode.Secondary;
            q630 E = s200.E(txj0.h(f2, npv0.b(tabMode)), npv0.c(tabMode), npv0.d(tabMode));
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
            q630 d2 = rte0.d(o19.a(txj0.d(aVar2, 1.0f), f), npv0.h(tabMode));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(hr80.m(d2, ylu0Var.getBackground().z, npv0.h(tabMode)), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rei(i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final jai jaiVar, q630 q630Var, long j, boolean z, zzs zzsVar, yzs yzsVar, qpv0 qpv0Var, boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        final boolean z3;
        int i6;
        int i7;
        int i8;
        qpv0 qpv0Var2;
        int i9;
        final zzs zzsVar2;
        final yzs yzsVar2;
        final boolean z4;
        final q630 q630Var3;
        final qpv0 qpv0Var3;
        final long j2;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        int i10;
        final zzs zzsVar3;
        final boolean z5;
        final q630 q630Var5;
        final boolean z6;
        final qpv0 qpv0Var4;
        yzs yzsVar3;
        yzs yzsVar4;
        androidx.compose.runtime.a M = aVar.M(-993670829);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(jaiVar) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= M.l(z3) ? 16384 : 8192;
                i6 = 196608 | i4;
                i7 = i3 & 64;
                if (i7 != 0) {
                    i6 = 1769472 | i4;
                } else if ((1572864 & i2) == 0) {
                    i6 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i6 |= 12582912;
                    } else if ((12582912 & i2) == 0) {
                        qpv0Var2 = qpv0Var;
                        i6 |= M.J(qpv0Var2) ? 8388608 : 4194304;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i6 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i6 |= M.l(z2) ? 67108864 : 33554432;
                        }
                        if (M.t(i6 & 1, (i6 & 38347923) != 38347922)) {
                            M.V();
                            if ((i2 & 1) == 0 || M.i()) {
                                if (i11 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    q630Var4 = q630Var2;
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                } else {
                                    q630Var4 = q630Var2;
                                }
                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j3 = ylu0Var.getBackground().g;
                                i10 = i6 & (-7169);
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                jai c = kai.c(-553177448, new uiv0(i), M);
                                yzs yzsVar5 = i7 != 0 ? null : yzsVar;
                                qpv0 qpv0Var5 = i8 == 0 ? qpv0Var2 : null;
                                zzsVar3 = c;
                                z5 = z3;
                                q630Var5 = q630Var4;
                                if (i9 != 0) {
                                    qpv0Var4 = qpv0Var5;
                                    j2 = j3;
                                    yzsVar3 = yzsVar5;
                                    z6 = false;
                                } else {
                                    yzs yzsVar6 = yzsVar5;
                                    z6 = z2;
                                    qpv0Var4 = qpv0Var5;
                                    j2 = j3;
                                    yzsVar3 = yzsVar6;
                                }
                            } else {
                                M.h();
                                i10 = i6 & (-7169);
                                zzsVar3 = zzsVar;
                                yzsVar3 = yzsVar;
                                z6 = z2;
                                z5 = z3;
                                qpv0Var4 = qpv0Var2;
                                q630Var5 = q630Var2;
                                j2 = j;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                yzsVar4 = yzsVar3;
                                androidx.compose.runtime.b.f(-993670829, i10, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow (VkSecondaryTabRow.kt:207)");
                            } else {
                                yzsVar4 = yzsVar3;
                            }
                            final yzs yzsVar7 = yzsVar4;
                            rvi.b(new c9e0[]{opv0.a.b(Boolean.valueOf(z5)), vcl0.b(j2, opv0.b)}, kai.c(-4936173, new wzs() { // from class: xsna.miv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    jai jaiVar2;
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-4936173, intValue, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous> (VkSecondaryTabRow.kt:212)");
                                        }
                                        bpn0 bpn0Var = npv0.a;
                                        TabMode tabMode = TabMode.Secondary;
                                        float i12 = npv0.i(tabMode);
                                        float f = npv0.f(tabMode);
                                        float g = npv0.g(tabMode);
                                        final yzs yzsVar8 = yzs.this;
                                        final int i13 = i;
                                        final boolean z7 = z6;
                                        jai jaiVar3 = null;
                                        if (yzsVar8 == null) {
                                            aVar2.K(-1023823223);
                                            aVar2.j();
                                            jaiVar2 = null;
                                        } else {
                                            aVar2.K(-1023823222);
                                            jai c2 = kai.c(1798773477, new yzs() { // from class: xsna.qiv0
                                                @Override // xsna.yzs
                                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    anx anxVar = (anx) obj3;
                                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                                    int intValue2 = ((Integer) obj5).intValue();
                                                    if ((intValue2 & 6) == 0) {
                                                        intValue2 |= aVar3.J(anxVar) ? 4 : 2;
                                                    }
                                                    if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1798773477, intValue2, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:229)");
                                                        }
                                                        boolean z8 = (intValue2 & 14) == 4;
                                                        yzs yzsVar9 = yzsVar8;
                                                        boolean J = z8 | aVar3.J(yzsVar9);
                                                        boolean z9 = z7;
                                                        boolean l = J | aVar3.l(z9);
                                                        int i14 = i13;
                                                        boolean o = l | aVar3.o(i14);
                                                        Object x = aVar3.x();
                                                        if (o || x == a.C0011a.a) {
                                                            yue yueVar = new yue(i14, 2, anxVar, yzsVar9, z9);
                                                            aVar3.R(yueVar);
                                                            x = yueVar;
                                                        }
                                                        xtm0.a(null, (wzs) x, aVar3, 0, 1);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    } else {
                                                        aVar3.h();
                                                    }
                                                    return s3q0.a;
                                                }
                                            }, aVar2);
                                            aVar2.j();
                                            jaiVar2 = c2;
                                        }
                                        final qpv0 qpv0Var6 = qpv0Var4;
                                        if (qpv0Var6 == null) {
                                            aVar2.K(-1022481357);
                                        } else {
                                            aVar2.K(-1022481356);
                                            final boolean z8 = z5;
                                            jaiVar3 = kai.c(-1446156573, new wzs() { // from class: xsna.riv0
                                                @Override // xsna.wzs
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                                    int intValue2 = ((Integer) obj4).intValue();
                                                    if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-1446156573, intValue2, -1, "com.vk.core.compose.component.VkSecondaryScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:258)");
                                                        }
                                                        qpv0.this.a(0, aVar3, null, z8);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                    } else {
                                                        aVar3.h();
                                                    }
                                                    return s3q0.a;
                                                }
                                            }, aVar2);
                                        }
                                        aVar2.j();
                                        lnx.b(i13, j2, f, g, q630Var5, false, i12, 0L, kai.c(-1291802793, new viv0(z7, i13, zzsVar3), aVar2), joi.b, jaiVar2, jaiVar3, kai.c(1399423864, new he30(jaiVar, 4), aVar2), aVar2, 905969664, 160);
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
                            q630Var3 = q630Var5;
                            z4 = z6;
                            z3 = z5;
                            zzsVar2 = zzsVar3;
                            yzsVar2 = yzsVar7;
                            qpv0Var3 = qpv0Var4;
                        } else {
                            M.h();
                            zzsVar2 = zzsVar;
                            yzsVar2 = yzsVar;
                            z4 = z2;
                            q630Var3 = q630Var2;
                            qpv0Var3 = qpv0Var2;
                            j2 = j;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.piv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ziv0.b(i, jaiVar, q630Var3, j2, z3, zzsVar2, yzsVar2, qpv0Var3, z4, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    qpv0Var2 = qpv0Var;
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    if (M.t(i6 & 1, (i6 & 38347923) != 38347922)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                qpv0Var2 = qpv0Var;
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                if (M.t(i6 & 1, (i6 & 38347923) != 38347922)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            z3 = z;
            i6 = 196608 | i4;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            qpv0Var2 = qpv0Var;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            if (M.t(i6 & 1, (i6 & 38347923) != 38347922)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i2 & 3072) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = 196608 | i4;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        qpv0Var2 = qpv0Var;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        if (M.t(i6 & 1, (i6 & 38347923) != 38347922)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void c(final mc90 mc90Var, final jai jaiVar, final q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i) {
        final long j2;
        final boolean z2;
        final zzs zzsVar2;
        long j3;
        int i2;
        zzs c;
        androidx.compose.runtime.a M = aVar.M(662762990);
        int i3 = i | (M.J(mc90Var) ? 4 : 2) | (M.J(q630Var) ? 256 : 128) | 222208;
        boolean z3 = true;
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
                j3 = ylu0Var.getBackground().g;
                i2 = i3 & (-7169);
                c = kai.c(1521782921, new wiv0(mc90Var), M);
            } else {
                M.h();
                i2 = i3 & (-7169);
                j3 = j;
                z3 = z;
                c = zzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(662762990, i2, -1, "com.vk.core.compose.component.VkSecondaryTabRow (VkSecondaryTabRow.kt:90)");
            }
            long j4 = j3;
            d(mc90Var.k(), jaiVar, q630Var, j4, z3, c, M, i2 & 524272, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j4;
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
            s.d = new wzs(jaiVar, q630Var, j2, z2, zzsVar2, i) { // from class: xsna.siv0
                public final /* synthetic */ jai c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ zzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    ziv0.c(mc90.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
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
    public static final void d(final int i, final jai jaiVar, q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        jai jaiVar2;
        q630 q630Var2;
        long j2;
        int i5;
        boolean z2;
        int i6;
        zzs zzsVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(2146801366);
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
                                zzsVar2 = kai.c(1102811611, new xiv0(i), M);
                            }
                        } else {
                            M.h();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2146801366, i4, -1, "com.vk.core.compose.component.VkSecondaryTabRow (VkSecondaryTabRow.kt:123)");
                        }
                        rvi.b(new c9e0[]{opv0.a.b(Boolean.valueOf(z2)), vcl0.b(j2, opv0.b)}, kai.c(-568095850, new hxo0(j2, q630Var2, zzsVar2, jaiVar2), M), M, 56);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                    final q630 q630Var3 = q630Var2;
                    final long j3 = j2;
                    final boolean z3 = z2;
                    final zzs zzsVar3 = zzsVar2;
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.oiv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ziv0.d(i, jaiVar, q630Var3, j3, z3, zzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
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
                final q630 q630Var32 = q630Var2;
                final long j32 = j2;
                final boolean z32 = z2;
                final zzs zzsVar32 = zzsVar2;
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
            final q630 q630Var322 = q630Var2;
            final long j322 = j2;
            final boolean z322 = z2;
            final zzs zzsVar322 = zzsVar2;
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
        final q630 q630Var3222 = q630Var2;
        final long j3222 = j2;
        final boolean z3222 = z2;
        final zzs zzsVar3222 = zzsVar2;
        s = M.s();
        if (s == null) {
        }
    }

    public static final g1i0 e(khx khxVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(40683608, i, -1, "com.vk.core.compose.component.rememberSecondaryIndicatorScope (VkSecondaryTabRow.kt:506)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new g1i0(khxVar);
            aVar.R(x);
        }
        g1i0 g1i0Var = (g1i0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g1i0Var;
    }

    public static final m1i0 f(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1815364397, i, -1, "com.vk.core.compose.component.rememberSecondaryTabScope (VkSecondaryTabRow.kt:426)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new m1i0();
            aVar.R(x);
        }
        m1i0 m1i0Var = (m1i0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return m1i0Var;
    }
}

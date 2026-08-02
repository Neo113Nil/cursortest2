package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.TabMode;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public final class vpu0 {
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        float f;
        androidx.compose.runtime.a M = aVar.M(98298043);
        int i2 = 14;
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(98298043, i, -1, "com.vk.core.compose.component.FixedTabIndicator (VkDefaultTabRow.kt:546)");
            }
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(-24857470);
                f = ((Number) M.r(hfj.a)).floatValue();
                M.j();
            } else {
                M.K(288752711);
                M.j();
                f = 0.64f;
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            bpn0 bpn0Var = npv0.a;
            TabMode tabMode = TabMode.Default;
            q630 E = s200.E(txj0.h(f2, npv0.b(tabMode)), npv0.c(tabMode), npv0.d(tabMode));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.i, false);
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
            float f3 = 2;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), f3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long c2 = l5g.c(14, ylu0Var.m().a, f);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = vog0.b(f3);
                M.R(x);
            }
            f9t.e(hr80.m(h, c2, (uog0) x), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new log(i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final jai jaiVar, final q630 q630Var, long j, boolean z, zzs zzsVar, yzs yzsVar, qpv0 qpv0Var, boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        final qpv0 qpv0Var2;
        int i8;
        boolean z4;
        final long j2;
        final boolean z5;
        final zzs zzsVar2;
        final yzs yzsVar2;
        final boolean z6;
        androidx.compose.runtime.f s;
        int i9;
        final zzs zzsVar3;
        final boolean z7;
        final qpv0 qpv0Var3;
        yzs yzsVar3;
        final boolean z8;
        yzs yzsVar4;
        androidx.compose.runtime.a M = aVar.M(1946243799);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z3 = z;
            i4 |= M.l(z3) ? 16384 : 8192;
            i5 = 1769472 | i4;
            i6 = i3 & 128;
            if (i6 == 0) {
                i5 = 14352384 | i4;
            } else if ((12582912 & i2) == 0) {
                i5 |= M.y(yzsVar) ? 8388608 : 4194304;
                i7 = i3 & 256;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((100663296 & i2) == 0) {
                    qpv0Var2 = qpv0Var;
                    i5 |= M.J(qpv0Var2) ? 67108864 : 33554432;
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i5 |= 805306368;
                    } else if ((805306368 & i2) == 0) {
                        z4 = z2;
                        i5 |= M.l(z4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
                            M.V();
                            if ((i2 & 1) == 0 || M.i()) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j3 = ylu0Var.getBackground().g;
                                i9 = i5 & (-7169);
                                boolean z9 = i10 == 0 ? z : true;
                                jai c = kai.c(-595081623, new rpu0(i), M);
                                yzs yzsVar5 = i6 != 0 ? null : yzsVar;
                                qpv0 qpv0Var4 = i7 == 0 ? qpv0Var2 : null;
                                zzsVar3 = c;
                                z7 = z9;
                                qpv0Var3 = qpv0Var4;
                                j2 = j3;
                                yzsVar3 = yzsVar5;
                                z8 = i8 != 0 ? false : z4;
                            } else {
                                M.h();
                                i9 = i5 & (-7169);
                                yzsVar3 = yzsVar;
                                z7 = z3;
                                qpv0Var3 = qpv0Var2;
                                z8 = z4;
                                j2 = j;
                                zzsVar3 = zzsVar;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                yzsVar4 = yzsVar3;
                                androidx.compose.runtime.b.f(1946243799, i9, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow (VkDefaultTabRow.kt:224)");
                            } else {
                                yzsVar4 = yzsVar3;
                            }
                            final yzs yzsVar6 = yzsVar4;
                            rvi.a(opv0.a.b(Boolean.valueOf(z7)), kai.c(527423383, new wzs() { // from class: xsna.jpu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    jai jaiVar2;
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(527423383, intValue, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous> (VkDefaultTabRow.kt:228)");
                                        }
                                        bpn0 bpn0Var = npv0.a;
                                        TabMode tabMode = TabMode.Default;
                                        float i11 = npv0.i(tabMode);
                                        float f = npv0.f(tabMode);
                                        float g = npv0.g(tabMode);
                                        final yzs yzsVar7 = yzs.this;
                                        final int i12 = i;
                                        final boolean z10 = z8;
                                        jai jaiVar3 = null;
                                        if (yzsVar7 == null) {
                                            aVar2.K(1480660007);
                                            aVar2.j();
                                            jaiVar2 = null;
                                        } else {
                                            aVar2.K(1480660008);
                                            jai c2 = kai.c(-143946903, new yzs() { // from class: xsna.ppu0
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
                                                            androidx.compose.runtime.b.f(-143946903, intValue2, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (VkDefaultTabRow.kt:252)");
                                                        }
                                                        boolean z11 = (intValue2 & 14) == 4;
                                                        yzs yzsVar8 = yzsVar7;
                                                        boolean J = z11 | aVar3.J(yzsVar8);
                                                        boolean z12 = z10;
                                                        boolean l = J | aVar3.l(z12);
                                                        int i13 = i12;
                                                        boolean o = l | aVar3.o(i13);
                                                        Object x = aVar3.x();
                                                        if (o || x == a.C0011a.a) {
                                                            z6h z6hVar = new z6h(i13, 1, anxVar, yzsVar8, z12);
                                                            aVar3.R(z6hVar);
                                                            x = z6hVar;
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
                                        final qpv0 qpv0Var5 = qpv0Var3;
                                        if (qpv0Var5 == null) {
                                            aVar2.K(1481999951);
                                        } else {
                                            aVar2.K(1481999952);
                                            final boolean z11 = z7;
                                            jaiVar3 = kai.c(702523495, new wzs() { // from class: xsna.qpu0
                                                @Override // xsna.wzs
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                                    int intValue2 = ((Integer) obj4).intValue();
                                                    if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(702523495, intValue2, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (VkDefaultTabRow.kt:281)");
                                                        }
                                                        qpv0.this.a(0, aVar3, null, z11);
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
                                        lnx.b(i12, j2, f, g, q630Var, false, i11, 0L, kai.c(-304771365, new spu0(z10, i12, zzsVar3), aVar2), kai.c(427137686, new jue(5), aVar2), jaiVar2, jaiVar3, kai.c(943813244, new lvy(1, jaiVar), aVar2), aVar2, 906166272, 128);
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
                            z6 = z8;
                            z5 = z7;
                            zzsVar2 = zzsVar3;
                            yzsVar2 = yzsVar6;
                            qpv0Var2 = qpv0Var3;
                        } else {
                            M.h();
                            j2 = j;
                            z5 = z;
                            zzsVar2 = zzsVar;
                            yzsVar2 = yzsVar;
                            z6 = z4;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.opu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    vpu0.b(i, jaiVar, q630Var, j2, z5, zzsVar2, yzsVar2, qpv0Var2, z6, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                qpv0Var2 = qpv0Var;
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                z4 = z2;
                if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            qpv0Var2 = qpv0Var;
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            z4 = z2;
            if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        z3 = z;
        i5 = 1769472 | i4;
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        qpv0Var2 = qpv0Var;
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        z4 = z2;
        if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i, final jai jaiVar, q630 q630Var, long j, boolean z, zzs zzsVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        long j2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        zzs zzsVar2;
        long j3;
        final zzs zzsVar3;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        int i9;
        androidx.compose.runtime.a M = aVar.M(-998969894);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j2 = j;
                    if (M.p(j2)) {
                        i9 = 2048;
                        i4 |= i9;
                    }
                } else {
                    j2 = j;
                }
                i9 = 1024;
                i4 |= i9;
            } else {
                j2 = j;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i6 = i4 | 24576;
                z2 = z;
            } else {
                z2 = z;
                i6 = i4 | (M.l(z2) ? 16384 : 8192);
            }
            i7 = 196608 | i6;
            i8 = i3 & 64;
            if (i8 == 0) {
                i7 = 1769472 | i6;
            } else if ((1572864 & i2) == 0) {
                zzsVar2 = zzsVar;
                i7 |= M.y(zzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                if (M.t(i7 & 1, (599187 & i7) != 599186)) {
                    M.V();
                    if ((i2 & 1) == 0 || M.i()) {
                        q630Var4 = i10 != 0 ? q630.a.a : q630Var2;
                        if ((i3 & 8) != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            i7 &= -7169;
                            j2 = ylu0Var.getBackground().g;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            zzsVar2 = kai.c(-655940884, new tpu0(i), M);
                        }
                    } else {
                        M.h();
                        if ((i3 & 8) != 0) {
                            i7 &= -7169;
                        }
                        q630Var4 = q630Var2;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-998969894, i7, -1, "com.vk.core.compose.component.VkDefaultTabRow (VkDefaultTabRow.kt:130)");
                    }
                    final zzs zzsVar4 = zzsVar2;
                    final q630 q630Var5 = q630Var4;
                    final long j4 = j2;
                    rvi.a(opv0.a.b(Boolean.valueOf(z2)), kai.c(-1122336102, new wzs() { // from class: xsna.mpu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1122336102, intValue, -1, "com.vk.core.compose.component.VkDefaultTabRow.<anonymous> (VkDefaultTabRow.kt:135)");
                                }
                                bpn0 bpn0Var = npv0.a;
                                TabMode tabMode = TabMode.Default;
                                lnx.c(j4, q630Var5, false, npv0.f(tabMode), npv0.g(tabMode), npv0.i(tabMode), 0L, kai.c(1320965014, new upu0(zzsVar4), aVar2), kai.c(-65554607, new xdi(4), aVar2), kai.c(113366908, new wwq(jaiVar, 2), aVar2), aVar2, 918552960, 64);
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
                    j3 = j2;
                    zzsVar3 = zzsVar2;
                    q630Var3 = q630Var4;
                } else {
                    M.h();
                    j3 = j2;
                    zzsVar3 = zzsVar2;
                    q630Var3 = q630Var2;
                }
                final long j5 = j3;
                final boolean z3 = z2;
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.npu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vpu0.c(i, jaiVar, q630Var3, j5, z3, zzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            zzsVar2 = zzsVar;
            if (M.t(i7 & 1, (599187 & i7) != 599186)) {
            }
            final long j52 = j3;
            final boolean z32 = z2;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i7 = 196608 | i6;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        zzsVar2 = zzsVar;
        if (M.t(i7 & 1, (599187 & i7) != 599186)) {
        }
        final long j522 = j3;
        final boolean z322 = z2;
        s = M.s();
        if (s != null) {
        }
    }

    public static final znl d(khx khxVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-720886709, i, -1, "com.vk.core.compose.component.rememberDefaultIndicatorScope (VkDefaultTabRow.kt:541)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new znl(khxVar);
            aVar.R(x);
        }
        znl znlVar = (znl) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return znlVar;
    }

    public static final gol e(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2117973766, i, -1, "com.vk.core.compose.component.rememberDefaultTabScope (VkDefaultTabRow.kt:459)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new gol();
            aVar.R(x);
        }
        gol golVar = (gol) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return golVar;
    }
}

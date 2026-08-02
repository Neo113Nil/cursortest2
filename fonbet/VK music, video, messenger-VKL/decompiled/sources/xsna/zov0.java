package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSwitch.kt */
/* loaded from: classes17.dex */
public final class zov0 {
    /* JADX WARN: Removed duplicated region for block: B:121:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final izs<? super Boolean, s3q0> izsVar, q630 q630Var, boolean z2, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        boolean z3;
        int i5;
        final sg50 sg50Var2;
        final q630 q630Var3;
        final boolean z4;
        androidx.compose.runtime.f s;
        char c;
        androidx.compose.runtime.a M = aVar.M(1161764521);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= M.l(z3) ? 2048 : 1024;
                i5 = i3 | 24576;
                if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
                    q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                    boolean z5 = i4 != 0 ? true : z3;
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var3 = (sg50) x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1161764521, i5, -1, "com.vk.core.compose.component.VkSwitch (VkSwitch.kt:45)");
                    }
                    M.K(1281158028);
                    float f = vov0.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getBackground().b;
                    long j3 = l5g.j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j4 = ylu0Var3.getIcon().f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j5 = ylu0Var4.getBackground().x;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j6 = ylu0Var5.r().b;
                    q630 q630Var5 = q630Var4;
                    boolean z6 = z5;
                    long c2 = l5g.c(14, j, 0.64f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var6 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i7 = f870.i(c2, ylu0Var6.getBackground().g);
                    long c3 = l5g.c(14, j2, 0.64f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var7 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i8 = f870.i(c3, ylu0Var7.getBackground().g);
                    long c4 = l5g.c(14, j4, 0.64f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var8 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i9 = f870.i(c4, ylu0Var8.getBackground().g);
                    long c5 = l5g.c(14, j5, 0.64f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var9 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i10 = f870.i(c5, ylu0Var9.getBackground().g);
                    long c6 = l5g.c(14, j6, l5g.e(j6) * 0.64f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1974909008, 0, 384, "com.vk.core.compose.component.defaults.VkSwitchDefaults.colors (VkSwitchDefaults.kt:34)");
                    }
                    long c7 = u7g.c(vnn0.h, M);
                    long c8 = u7g.c(vnn0.o, M);
                    long c9 = l5g.c(14, u7g.c(vnn0.a, M), vnn0.b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                    }
                    iyk0 iyk0Var2 = u7g.a;
                    t7g t7gVar = (t7g) M.r(iyk0Var2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i11 = f870.i(c9, t7gVar.p);
                    long c10 = l5g.c(14, u7g.c(vnn0.c, M), vnn0.d);
                    if (androidx.compose.runtime.b.d()) {
                        c = 6;
                        androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                    } else {
                        c = 6;
                    }
                    t7g t7gVar2 = (t7g) M.r(iyk0Var2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long i12 = f870.i(c10, t7gVar2.p);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1937926421, 0, 0, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:369)");
                    }
                    cnn0 cnn0Var = new cnn0(j, j2, j3, c7, j4, j5, j6, c8, i7, i8, j3, i11, i9, i10, c6, i12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M = M;
                    hnn0.a(z, izsVar, q630Var5, z6, cnn0Var, sg50Var3, M, (i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i5 << 3) & 57344) | ((i5 << 6) & 3670016));
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var5;
                    z4 = z6;
                    sg50Var2 = sg50Var3;
                } else {
                    M.h();
                    sg50Var2 = sg50Var;
                    q630Var3 = q630Var2;
                    z4 = z3;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.xov0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zov0.a(z, izsVar, q630Var3, z4, sg50Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z2;
            i5 = i3 | 24576;
            if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i3 | 24576;
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final boolean z, final String str, final izs<? super Boolean, s3q0> izsVar, q630 q630Var, String str2, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        int i4;
        String str3;
        int i5;
        boolean z4;
        int i6;
        final boolean z5;
        final String str4;
        final boolean z6;
        androidx.compose.runtime.f s;
        int i7;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-1322715389);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i3 |= M.J(str3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= M.l(z4) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                            if (i8 != 0) {
                                q630Var3 = q630.a.a;
                                i7 = i6;
                            } else {
                                i7 = i6;
                                q630Var3 = q630Var2;
                            }
                            if (i4 != 0) {
                                str3 = null;
                            }
                            boolean z7 = i5 != 0 ? true : z4;
                            boolean z8 = i7 != 0 ? true : z3;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1322715389, i3, -1, "com.vk.core.compose.component.VkSwitchItem (VkSwitch.kt:141)");
                            }
                            int i9 = i3 & 8078;
                            int i10 = i3 >> 3;
                            c(z, qci0.d(60, str, str3), izsVar, q630Var3, z7, z8, M, i9 | (57344 & i10) | (i10 & 458752));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str4 = str3;
                            q630Var2 = q630Var3;
                            z6 = z7;
                            z5 = z8;
                        } else {
                            M.h();
                            z5 = z3;
                            str4 = str3;
                            z6 = z4;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.wov0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    zov0.b(z, str, izsVar, q630Var2, str4, z6, z5, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            str3 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void c(final boolean z, final rci0 rci0Var, final izs izsVar, final q630 q630Var, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i) {
        boolean z4;
        int i2;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        String str;
        int i3;
        q630.a aVar3;
        int i4;
        int i5;
        boolean z5;
        androidx.compose.runtime.a M = aVar.M(956329610);
        if ((i & 6) == 0) {
            z4 = z;
            i2 = (M.l(z4) ? 4 : 2) | i;
        } else {
            z4 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(rci0Var) : M.y(rci0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 256 : 128;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z3) ? 131072 : 65536;
        }
        int i6 = i2;
        if (M.t(i6 & 1, (74899 & i6) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(956329610, i6, -1, "com.vk.core.compose.component.VkSwitchItem (VkSwitch.kt:85)");
            }
            q630 a = d1p0.a(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vov0.a(6), 1, txj0.f(q630Var, 1.0f)), z4, z2, new plg0(2), izsVar2, 8);
            float f = vov0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(940408781, 6, -1, "com.vk.core.compose.component.defaults.VkSwitchDefaults.verticalPadding (VkSwitchDefaults.kt:59)");
            }
            float f2 = kqu0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = s200.E(a, f, kqu0.q);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new h3e0(17);
                M.R(x);
            }
            q630 b = egi0.b(E, true, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar5 = q630.a.a;
            if (z3) {
                str = "com.vk.core.compose.component.defaults.VkSwitchDefaults.switchMiddleGap (VkSwitchDefaults.kt:67)";
                i3 = 1864311067;
                aVar3 = aVar5;
                i4 = -861747532;
                aVar2 = M;
                i5 = -1;
                z5 = z2;
                aVar2.K(-861747532);
                aVar2.j();
            } else {
                M.K(-858220166);
                int i7 = i6 >> 3;
                int i8 = (i6 & 14) | (i7 & 112) | (i7 & 7168);
                aVar2 = M;
                z5 = z2;
                str = "com.vk.core.compose.component.defaults.VkSwitchDefaults.switchMiddleGap (VkSwitchDefaults.kt:67)";
                i3 = 1864311067;
                i5 = -1;
                a(z, izsVar, null, z5, null, aVar2, i8, 20);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1864311067, 6, -1, str);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3 = aVar5;
                mq.d(aVar3, kqu0.v, aVar2, 0);
                i4 = -861747532;
            }
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1162559934, 6, i5, "com.vk.core.compose.component.defaults.VkSwitchDefaults.middleVerticalPadding (VkSwitchDefaults.kt:75)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rci0Var.a(((i6 >> 12) & 14) | ((i6 << 3) & 896), aVar2, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, xpyVar), z5);
            if (z3) {
                aVar2.K(-857740038);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(i3, 6, i5, str);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f9t.e(txj0.v(aVar3, kqu0.v), aVar2, 0);
                int i9 = i6 >> 3;
                a(z, izsVar, null, z5, null, aVar2, (i6 & 14) | (i9 & 112) | (i9 & 7168), 20);
            } else {
                aVar2.K(i4);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.yov0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zov0.c(z, rci0Var, izsVar, q630Var, z2, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

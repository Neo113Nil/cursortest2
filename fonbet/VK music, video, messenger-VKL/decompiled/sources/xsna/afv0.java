package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkRadioButton.kt */
/* loaded from: classes17.dex */
public final class afv0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final gzs<s3q0> gzsVar, q630 q630Var, boolean z2, sg50 sg50Var, ill illVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        q630 q630Var2;
        int i4;
        boolean z3;
        int i5;
        final ill illVar2;
        final q630 q630Var3;
        final boolean z4;
        final sg50 sg50Var2;
        androidx.compose.runtime.f s;
        long j;
        int i6;
        int i7;
        ill illVar3;
        q630 q630Var4;
        boolean z5;
        sg50 sg50Var3;
        androidx.compose.runtime.a M = aVar.M(1783023553);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
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
                int i9 = i3 | 24576;
                if ((196608 & i) == 0) {
                    i9 = 90112 | i3;
                }
                i5 = i9;
                if (M.t(i5 & 1, (74899 & i5) != 74898)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630 q630Var5 = i8 != 0 ? q630.a.a : q630Var2;
                        boolean z6 = i4 != 0 ? true : z3;
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var4 = (sg50) x;
                        float f = wev0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var.getIcon().a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = ylu0Var2.getIcon().n;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long c = l5g.c(14, ylu0Var3.getIcon().n, 0.64f);
                        if (androidx.compose.runtime.b.d()) {
                            j = j2;
                            i6 = -1;
                            androidx.compose.runtime.b.f(1916445632, 3072, -1, "com.vk.core.compose.component.defaults.VkRadioButtonDefaults.colors (VkRadioButtonDefaults.kt:26)");
                        } else {
                            j = j2;
                            i6 = -1;
                        }
                        ill j4 = xa4.j(j, j3, c, M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i7 = i5 & (-458753);
                        illVar3 = j4;
                        q630Var4 = q630Var5;
                        z5 = z6;
                        sg50Var3 = sg50Var4;
                    } else {
                        M.h();
                        i7 = i5 & (-458753);
                        sg50Var3 = sg50Var;
                        illVar3 = illVar;
                        z5 = z3;
                        i6 = -1;
                        q630Var4 = q630Var2;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1783023553, i7, i6, "com.vk.core.compose.component.VkRadioButton (VkRadioButton.kt:63)");
                    }
                    M.K(-2099881590);
                    el2.a(z, gzsVar2, q630Var4, z5, sg50Var3, illVar3, 24, M, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344));
                    M = M;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var4;
                    z4 = z5;
                    sg50Var2 = sg50Var3;
                    illVar2 = illVar3;
                } else {
                    M.h();
                    illVar2 = illVar;
                    q630Var3 = q630Var2;
                    z4 = z3;
                    sg50Var2 = sg50Var;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.yev0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            afv0.a(z, gzsVar, q630Var3, z4, sg50Var2, illVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z2;
            int i92 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            i5 = i92;
            if (M.t(i5 & 1, (74899 & i5) != 74898)) {
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
        int i922 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        i5 = i922;
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final boolean z, final String str, final gzs gzsVar, q630 q630Var, String str2, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        int i4;
        String str3;
        int i5;
        int i6;
        final String str4;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-927983284);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
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
                    i3 |= M.l(z2) ? 131072 : 65536;
                    i6 = i3 | 1572864;
                    if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                        M.h();
                        str4 = str3;
                        z3 = z2;
                    } else {
                        q630 q630Var3 = i7 != 0 ? q630.a.a : q630Var2;
                        String str5 = i4 != 0 ? null : str3;
                        boolean z4 = i5 != 0 ? true : z2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-927983284, i6, -1, "com.vk.core.compose.component.VkRadioItem (VkRadioButton.kt:163)");
                        }
                        int i8 = i6 & 8078;
                        int i9 = i6 >> 3;
                        c(z, qci0.d(60, str, str5), gzsVar, q630Var3, z4, M, i8 | (57344 & i9) | (i9 & 458752), 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str4 = str5;
                        q630Var2 = q630Var3;
                        z3 = z4;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.zev0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                afv0.b(z, str, gzsVar, q630Var2, str4, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 = i3 | 1572864;
                if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            str3 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i3 | 1572864;
            if (M.t(i6 & 1, (599187 & i6) == 599186)) {
            }
            s = M.s();
            if (s == null) {
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
        i6 = i3 | 1572864;
        if (M.t(i6 & 1, (599187 & i6) == 599186)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final boolean z, final rci0 rci0Var, final gzs gzsVar, q630 q630Var, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        boolean z3;
        int i5;
        final q630 q630Var3;
        final boolean z4;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1030785859);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(rci0Var) : M.y(rci0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= M.l(z3) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= M.l(false) ? 131072 : 65536;
                }
                i5 = i3;
                if (M.t(i5 & 1, (74899 & i5) != 74898)) {
                    q630.a aVar2 = q630.a.a;
                    q630 q630Var4 = i6 != 0 ? aVar2 : q630Var2;
                    boolean z5 = i4 != 0 ? true : z3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1030785859, i5, -1, "com.vk.core.compose.component.VkRadioItem (VkRadioButton.kt:104)");
                    }
                    q630 E = s200.E(lai0.b(txj0.f(q630Var4, 1.0f), z, z5, new plg0(3), gzsVar), wev0.a, kqu0.u);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new dl70(29);
                        M.R(x);
                    }
                    q630 b = egi0.b(E, true, (izs) x);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b);
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
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    M.K(-1021658394);
                    int i7 = i5 >> 3;
                    a(z, gzsVar, null, z5, null, null, M, (i5 & 14) | (i7 & 112) | (i7 & 7168), 52);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1644525114, 6, -1, "com.vk.core.compose.component.defaults.VkRadioButtonDefaults.radioMiddleGap (VkRadioButtonDefaults.kt:34)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    mq.d(aVar2, kqu0.v, M, 0);
                    if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f, true);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(947319926, 6, -1, "com.vk.core.compose.component.defaults.VkRadioButtonDefaults.middleVerticalPadding (VkRadioButtonDefaults.kt:42)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rci0Var.a(((i5 >> 12) & 14) | ((i5 << 3) & 896), M, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, 1, xpyVar), z5);
                    M.K(-1026032773);
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z4 = z5;
                    q630Var3 = q630Var4;
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    z4 = z3;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.xev0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            afv0.c(z, rci0Var, gzsVar, q630Var3, z4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}

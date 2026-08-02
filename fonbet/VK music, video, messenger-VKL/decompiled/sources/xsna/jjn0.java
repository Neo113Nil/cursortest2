package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.design.demo.presentation.components.ThemeType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SupportedThemesTopBar.kt */
/* loaded from: classes18.dex */
public final class jjn0 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, q630 q630Var, d.b bVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        d.b bVar2;
        final q630 q630Var2;
        final d.b bVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1667015611);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar3) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            bVar2 = bVar;
            i4 |= M.J(bVar2) ? 131072 : 65536;
            if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                M.h();
                q630Var2 = q630Var;
                bVar3 = bVar2;
            } else {
                if (i5 != 0) {
                    bVar2 = null;
                }
                d.b bVar4 = bVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1667015611, i4, -1, "com.vk.design.demo.presentation.components.SupportedThemesTopBar (SupportedThemesTopBar.kt:33)");
                }
                boolean l = M.l(false) | ((i4 & 896) == 256);
                Object x = M.x();
                if (l || x == a.C0011a.a) {
                    x = new ayb(1, gzsVar2);
                    M.R(x);
                }
                q630.a aVar2 = q630.a.a;
                b(str, gzsVar, (izs) x, gzsVar3, aVar2, bVar4, M, i4 & 523390, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
                bVar3 = bVar4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ijn0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jjn0.a(str, gzsVar, gzsVar2, gzsVar3, q630Var2, bVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        bVar2 = bVar;
        if (M.t(i4 & 1, (74899 & i4) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final gzs<s3q0> gzsVar, final izs<? super ThemeType, s3q0> izsVar, final gzs<s3q0> gzsVar2, q630 q630Var, d.b bVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar3;
        q630 q630Var2;
        int i4;
        d.b bVar2;
        final q630 q630Var3;
        final d.b bVar3;
        androidx.compose.runtime.f s;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(680432922);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            gzsVar3 = gzsVar2;
            i3 |= M.y(gzsVar3) ? 2048 : 1024;
        } else {
            gzsVar3 = gzsVar2;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                bVar2 = bVar;
                i3 |= M.J(bVar2) ? 131072 : 65536;
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    q630Var3 = i5 != 0 ? q630.a.a : q630Var2;
                    bVar3 = i4 != 0 ? null : bVar2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(680432922, i3, -1, "com.vk.design.demo.presentation.components.SupportedThemesTopBar (SupportedThemesTopBar.kt:58)");
                    }
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.FALSE);
                        M.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    int i6 = i3;
                    TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, 196608 | (i3 & 14), 30), null, null, null, M, 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                    }
                    lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i6 << 3) & 896), 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-875351268, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Settings28> (VkSdkIcons.kt:3312)");
                    }
                    lg90 b2 = or.b(M, 1451966795, R.drawable.vk_icon_settings_28, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new kni(1, wh50Var);
                        M.R(x2);
                    }
                    d.c.C0760d a3 = d.c.C0760d.a.a(b2, null, (gzs) x2, null, null, null, M, 1573256, 58);
                    if (((Boolean) M.r(vsx.b)).booleanValue()) {
                        M.K(1061038694);
                        c = jh.c(qzu0.a, M);
                    } else {
                        M.K(1061039527);
                        c = j8.c(qzu0.a, M);
                    }
                    gzs<s3q0> gzsVar4 = gzsVar3;
                    int i7 = i6 >> 9;
                    muv0.h(a, q630Var3, null, null, null, a2, d.a.a(a3, d.b.a.C0757a.a(c, null, gzsVar4, null, null, null, M, 12582920 | ((i6 >> 3) & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), bVar3, null, M, (i7 & 896) | 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i7 & 112, 0, 8092);
                    M = M;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        M.K(-1467345319);
                        Object x3 = M.x();
                        if (x3 == c0012a) {
                            x3 = new ckb0(1, wh50Var);
                            M.R(x3);
                        }
                        p7u0.g((izs) x3, kai.c(-1469666288, new mog(8, izsVar, wh50Var), M), null, null, null, M, 54, 28);
                        M = M;
                    } else {
                        M.K(-1470171000);
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    bVar3 = bVar2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.hjn0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            jjn0.b(str, gzsVar, izsVar, gzsVar2, q630Var3, bVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVar2 = bVar;
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        bVar2 = bVar;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void c(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1202475033);
        int i2 = i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1202475033, i2, -1, "com.vk.design.demo.presentation.components.ThemeTypeButton (SupportedThemesTopBar.kt:118)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Neutral, txj0.f(q630.a.a, 1.0f), androidx.compose.ui.graphics.e.a, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 224688, 384, 0, 4190144);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new gd1(str, gzsVar, i, 8);
        }
    }

    public static final void d(izs<? super ThemeType, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-904445708);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-904445708, i2, -1, "com.vk.design.demo.presentation.components.ThemeTypesSelect (SupportedThemesTopBar.kt:97)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new tq0(izsVar, 9);
                M.R(x);
            }
            c("Milkshake demo", (gzs) x, M, 6);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a97(izsVar, 11);
                M.R(x2);
            }
            c("Lego demo", (gzs) x2, M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new shf(izsVar, i);
        }
    }
}

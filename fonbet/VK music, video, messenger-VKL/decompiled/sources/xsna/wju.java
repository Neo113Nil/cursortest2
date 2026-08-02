package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GroupFooter.kt */
/* loaded from: classes5.dex */
public final class wju {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        String str2;
        int i3;
        boolean z2;
        int i4;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        String str3;
        boolean z3;
        androidx.compose.runtime.f s;
        int i5;
        String str4;
        androidx.compose.runtime.a M = aVar.M(-1744424585);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 54;
            str2 = str;
        } else {
            str2 = str;
            i3 = i6 | (M.J(str2) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i4 = i3 | 3072;
            } else {
                i4 = i3 | (M.l(false) ? 2048 : 1024);
            }
            if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
                M.h();
                q630Var2 = q630Var;
                aVar2 = M;
                str3 = str2;
                z3 = z2;
            } else {
                if (i7 != 0) {
                    str2 = null;
                }
                boolean z4 = i8 != 0 ? true : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1744424585, i4, -1, "com.vk.settings.impl.presentation.base.view.GroupFooter (GroupFooter.kt:24)");
                }
                q630.a aVar3 = q630.a.a;
                q630 f = txj0.f(aVar3, 1.0f);
                a.c cVar = androidx.compose.foundation.layout.a.e;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
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
                k9q0.w(M, a, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (str2 != null) {
                    M.K(-353718821);
                    float f2 = 16;
                    q630 G = s200.G(txj0.f(aVar3, 1.0f), f2, 4, f2, f2);
                    M.K(-427042289);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.m0;
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int i9 = (i4 >> 3) & 14;
                    String str5 = str2;
                    i5 = 16;
                    yqv0.c(str5, G, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i9, 0, 8184);
                    str4 = str5;
                    M = M;
                } else {
                    i5 = 16;
                    str4 = str2;
                    M.K(-354873695);
                }
                M.j();
                f9t.e(txj0.h(aVar3, (float) 7.5d), M, 6);
                if (z4) {
                    M.K(-353230788);
                    ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, txj0.f(s200.F(i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), M, 438, 0);
                    M.j();
                } else {
                    M.K(-353002721);
                    ck70.b(aVar3, (float) 0.5d, M, 6);
                }
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar3;
                aVar2 = M;
                str3 = str4;
                z3 = z4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new so0(i, i2, str3, q630Var2, z3);
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 1171) == 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}

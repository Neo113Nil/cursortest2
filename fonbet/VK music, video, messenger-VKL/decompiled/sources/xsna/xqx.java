package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InviteFriendsBottomBar.kt */
/* loaded from: classes14.dex */
public final class xqx {
    public static final void a(xrx xrxVar, arx arxVar, gzs gzsVar, q630 q630Var, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        xrx xrxVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2004832680);
        int i2 = i | (M.J(xrxVar) ? 4 : 2) | (M.J(arxVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072 | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2004832680, i2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsBottomBar (InviteFriendsBottomBar.kt:42)");
            }
            float f = arxVar.c ? 1.0f : 0.6f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(hr80.m(aVar3, j, aVar2), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630Var2 = aVar3;
            float f3 = f;
            dsn.a(ra8.a.b(txj0.f(aVar3, 1.0f), dt1.a.c), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            float f4 = 8;
            float f5 = 16;
            q630 G = s200.G(txj0.f(q630Var2, 1.0f), f5, f4, f5, 24);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, G);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            xrxVar2 = xrxVar;
            b((57344 & (i2 << 6)) | 3072, M, kq01.g(xrxVar2.a, M), gzsVar, txj0.f(txj0.j(40, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(q630Var2, "SELECTION_BUTTON")), 1.0f), xrxVar2.b, xrxVar2.c);
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(o19.a(s200.H(ahn.E(q630Var2, "INVITE_BUTTON"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), f3), 1.0f), null, false, false, null, null, null, kq01.d(arxVar.a, M), arxVar.b, null, null, null, false, null, null, null, M, ((i2 >> 12) & 14) | X2.b.f, 0, 0, 4181984);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            xrxVar2 = xrxVar;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx7(xrxVar2, arxVar, gzsVar, q630Var2, gzsVar2, i, 1);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final q630 q630Var, final boolean z, final boolean z2) {
        int i2;
        int i3;
        int i4;
        long j;
        lg90 lg90Var;
        long j2;
        int i5;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-759976687);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-759976687, i2, -1, "com.vk.friends.groupinvite.impl.ui.SelectionButton (InviteFriendsBottomBar.kt:104)");
            }
            if (z) {
                i3 = -1692659421;
                i4 = R.drawable.vk_icon_check_circle_on_24;
            } else {
                i3 = -1692576093;
                i4 = R.drawable.vk_icon_check_circle_off_24;
            }
            lg90 b = or.b(M, i3, i4, M, 0);
            if (z) {
                M.K(-1692463005);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
                M.j();
            } else {
                M.K(-1692411359);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().n;
                M.j();
            }
            float f = z2 ? 1.0f : 0.6f;
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(o19.a(aVar2, f), 1.0f);
            if (z2) {
                lg90Var = b;
                j2 = j;
                f2 = ojc.c(f2, false, null, null, gzsVar, 15);
            } else {
                lg90Var = b;
                j2 = j;
            }
            q630 g = q630Var.g(f2);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f3 = txj0.f(aVar2, 0.8f);
            ty6 ty6Var2 = dt1.a.e;
            ra8 ra8Var = ra8.a;
            q630 b2 = ra8Var.b(f3, ty6Var2);
            if (androidx.compose.runtime.b.d()) {
                i5 = i2;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i5 = i2;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, b2, ylu0Var3.getText().a, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i5 & 14, 0, 8184);
            M = M;
            q630 f4 = txj0.f(txj0.q(aVar2, 40), 0.2f);
            ty6 ty6Var3 = dt1.a.g;
            q630 b3 = ra8Var.b(f4, ty6Var3);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b3);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b4 = ra8Var.b(txj0.q(aVar2, 24), ty6Var3);
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
            }
            vjw.a(lg90Var, null, b4, ty6Var3, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), M, 3128, 48);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wqx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xqx.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var, z, z2);
                    return s3q0.a;
                }
            };
        }
    }
}

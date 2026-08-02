package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ListingBottomSheetContent.kt */
/* loaded from: classes6.dex */
public final class phz {
    public static final void a(pos0 pos0Var, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        float f;
        q630.a aVar2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        androidx.compose.runtime.a M = aVar.M(754066614);
        if ((i & 6) == 0) {
            i2 = (M.J(pos0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(754066614, i2, -1, "com.vk.video.growth.impl.listing.Content (ListingBottomSheetContent.kt:54)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            lg90 lg90Var = null;
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
            k9q0.w(M, c3, dVar);
            float f2 = 16;
            q630.a aVar4 = q630.a.a;
            q630 f3 = txj0.f(s200.D(aVar4, f2), 1.0f);
            int i7 = i2;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, f3);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            f9t.e(txj0.h(aVar4, 8), M, 6);
            boolean z = pos0Var.a;
            Integer num = pos0Var.e;
            if (z) {
                M.K(818779284);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(-563312836, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DownloadOutline56> (VkIcons.kt:2286)");
                } else {
                    i6 = 0;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_download_outline_56, i6, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    c2 = 65535;
                    androidx.compose.runtime.b.f(1040687336, i6, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    c2 = 65535;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f = f2;
                aVar2 = aVar4;
                c = c2;
                pzu0.b(a2, null, null, ylu0Var.getIcon().a, M, 56, 4);
                M.j();
                i4 = 0;
            } else {
                f = f2;
                aVar2 = aVar4;
                c = 65535;
                M.K(819003104);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(857305506, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoVkVideoColor48> (VkIcons.kt:7096)");
                } else {
                    i3 = 0;
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_logo_vk_video_color_48, i3, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i4 = i3;
                pzu0.b(a3, null, null, l5g.k, M, 3128, 4);
                M.j();
            }
            f9t.e(txj0.h(aVar2, f), M, 6);
            q630.a aVar5 = aVar2;
            yqv0.c(pos0Var.b, ahn.E(aVar2, "video_listing_title_view"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).g, M, 48, 0, 8120);
            f9t.e(txj0.h(aVar5, 24), M, 6);
            q630 f4 = txj0.f(ahn.E(aVar5, "video_listing_action_button"), 1.0f);
            String str = pos0Var.c;
            if (num != null) {
                M.K(-943380707);
                i5 = 0;
                lg90Var = pg90.a(num.intValue(), 0, M);
            } else {
                i5 = 0;
                M.K(820016555);
            }
            M.j();
            int i8 = i5;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, f4, null, false, false, lg90Var, null, null, str, null, null, null, null, false, null, null, null, M, ((i7 >> 6) & 14) | 1073769904, 0, 0, 4189664);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, i8, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, i8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b, null, s200.D(ra8.a.b(ahn.E(aVar5, "video_listing_close_button"), dt1.a.d), 12), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlb0.h(M).getIcon().b, false, null, false, null, null, M, ((i7 >> 3) & 14) | 448, 2000);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new f4c(pos0Var, gzsVar, gzsVar2, q630Var, i, 1);
        }
    }

    public static final void b(pos0 pos0Var, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(173514054);
        int i2 = i | (M.J(pos0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(173514054, i2, -1, "com.vk.video.growth.impl.listing.ListingBottomSheetContent (ListingBottomSheetContent.kt:38)");
            }
            if (pos0Var.d) {
                M.K(-1983216639);
                rrv0.e(true, null, null, null, null, null, kai.c(-1510934588, new ohz(pos0Var, gzsVar, gzsVar2, q630Var, 0), M), M, 1572870, 62);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                aVar2.K(-1983090500);
                a(pos0Var, gzsVar, gzsVar2, q630Var, aVar2, i2 & 8190);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e4c(i, 1, pos0Var, gzsVar2, gzsVar, q630Var);
        }
    }
}

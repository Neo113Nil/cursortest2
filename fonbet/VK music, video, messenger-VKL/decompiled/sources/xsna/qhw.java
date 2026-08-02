package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ImageContent.kt */
/* loaded from: classes18.dex */
public final class qhw {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public qhw(List list, boolean z, boolean z2, boolean z3) {
        this.a = androidx.compose.runtime.k.b(list != null ? new wow(list) : null);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
    }

    public final void a(q630 q630Var, pco pcoVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-350780156);
        if ((i & 48) == 0) {
            i2 = (M.J(pcoVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-350780156, i3, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.Content (ImageContent.kt:48)");
            }
            wow wowVar = (wow) ((zak0) this.a).getValue();
            List list = wowVar != null ? wowVar.b : null;
            if (((Boolean) ((zak0) this.d).getValue()).booleanValue()) {
                M.K(-436044171);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2112659512, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoNotDisturbOutline56> (VkSdkIcons.kt:676)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_do_not_disturb_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c((i3 & 896) | 56, M, q630Var, a);
                M.j();
            } else {
                wow wowVar2 = list != null ? new wow(list) : null;
                if (wowVar2 == null || wowVar2.b.isEmpty()) {
                    M.K(-435836998);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1547637212, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GalleryOutline56> (VkSdkIcons.kt:932)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_gallery_outline_56, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    c((i3 & 896) | 56, M, q630Var, a2);
                    M.j();
                } else if (list.size() == 1) {
                    M.K(-435639311);
                    d(j5g.Y(new wow(list)), pcoVar, q630Var, M, (i3 & 112) | 384 | ((i3 << 3) & 7168));
                    M.j();
                } else {
                    M.K(-435416142);
                    b(list, pcoVar, null, M, (i3 & 112) | ((i3 << 3) & 7168));
                    pcoVar = pcoVar;
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pt6(this, q630Var, pcoVar, i);
        }
    }

    public final void b(List list, pco pcoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1420699313);
        int i2 = (M.J(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(pcoVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1420699313, i3, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.ManyImagesContent (ImageContent.kt:126)");
            }
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mhw(list, 0);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 10;
            q630 d2 = rte0.d(aVar3, vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nb90.a(b, r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f)), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(829319562, new tna(list, this, pcoVar, 1), M), aVar2, 0, 24576, 16380);
            s910.a(list.size(), b.k(), ra8.a.b(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7), dt1.a.i), MarketPaginationDotsSize.Small, aVar2, 3072, 0);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ohw(i, 0, this, list, pcoVar, q630Var2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar, q630 q630Var, lg90 lg90Var) {
        androidx.compose.runtime.a M = aVar.M(771510270);
        int i2 = (M.y(lg90Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(771510270, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.PlaceholderImage (ImageContent.kt:86)");
            }
            q630 d = sua.d(0.8317f, q630Var, false);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, null, null, ylu0Var.getIcon().n, M, 56 | (i2 & 14), 4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qbo(i, 1, this, lg90Var, q630Var);
        }
    }

    public final void d(Object obj, pco pcoVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-219713405);
        int i2 = (M.J(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(pcoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-219713405, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.SingleImageContent (ImageContent.kt:105)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            float f = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            epd0.b(obj, r18.a(f, ylu0Var2.getImage().a, m, vog0.b(kqu0.e)), ((Boolean) ((zak0) this.c).getValue()).booleanValue(), ((Boolean) ((zak0) this.b).getValue()).booleanValue(), pcoVar, M, (i2 & 14) | ((i2 << 9) & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gw9(i, 1, this, obj, pcoVar, q630Var);
        }
    }
}

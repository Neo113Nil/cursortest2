package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.duc;
import xsna.hsk;
import xsna.phw;
import xsna.q630;
import xsna.wkj;

/* compiled from: ClipEditVideoAttachContent.kt */
/* loaded from: classes17.dex */
public final class juc {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(duc ducVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1738242103);
        int i2 = i | (M.J(ducVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1738242103, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.video.ClipEditVideoAttachContent (ClipEditVideoAttachContent.kt:42)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            Boolean bool = null;
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
            duc.a aVar4 = duc.a.a;
            if (ducVar.equals(aVar4)) {
                M.K(-492842447);
                M.j();
            } else if (ducVar instanceof duc.b) {
                M.K(-492840522);
                duc.b bVar = (duc.b) ducVar;
                b(bVar.a, gzsVar, bVar.b, M, i2 & 112);
                M.j();
            } else {
                if (!(ducVar instanceof duc.c)) {
                    throw alb0.c(-492843893, M);
                }
                M.K(-492832340);
                duc.c cVar = (duc.c) ducVar;
                c(cVar, gzsVar, gzsVar2, cVar.c, M, i2 & 1008);
                M.j();
            }
            if (!(ducVar instanceof duc.a)) {
                if (!ducVar.equals(aVar4)) {
                    if (ducVar instanceof duc.b) {
                        bool = Boolean.valueOf(((duc.b) ducVar).b);
                    } else {
                        if (!(ducVar instanceof duc.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bool = Boolean.valueOf(((duc.c) ducVar).c);
                    }
                }
                if (epx.f(bool, Boolean.FALSE)) {
                    M.K(1902396951);
                    jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
                    M = M;
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            M.K(1899716629);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new guc(i, 0, ducVar, gzsVar, gzsVar2);
        }
    }

    public static final void b(final boolean z, final gzs<s3q0> gzsVar, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        lg90 b;
        androidx.compose.runtime.a aVar3;
        com.vk.core.compose.component.cell.content.h1 a;
        androidx.compose.runtime.a M = aVar.M(1668663431);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16) | (M.l(z2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1668663431, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.video.ClipEditVideoAttachEmptyContent (ClipEditVideoAttachContent.kt:74)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z2) {
                M.K(-1119747426);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(284187004, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ClipsAttachOutline28> (VkSdkIcons.kt:544)");
                }
                b = pg90.a(R.drawable.vk_icon_clips_attach_outline_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1119669957);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(851324796, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VideoSquareOutline28> (VkSdkIcons.kt:3712)");
                }
                b = or.b(M, 35297503, R.drawable.vk_icon_video_square_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a3 = com.vk.core.compose.component.cell.content.f.a(lg90Var, Cell$Left.Main.Size.Medium, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            if (z2) {
                M.K(-1119349510);
                aVar3 = M;
                a = Cell$Middle.d.b.a(d370.N(R.string.clips_edit_video_attachment_button_add_v2, 0, M), null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar3.j();
            } else {
                M.K(-1119174019);
                aVar3 = M;
                a = Cell$Middle.d.b.a(d370.N(R.string.clips_edit_video_attachment_button_add, 0, M), null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar3.j();
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a, null, null, null, aVar6, 196608, 30);
            com.vk.core.compose.component.cell.content.u0 a5 = o.b.a.a(null, null, 0L, false, aVar6, 196608, 31);
            aVar6.K(795193995);
            q630 a6 = z ? o19.a(aVar4, 0.64f) : aVar4;
            if (!z) {
                Object x = aVar6.x();
                if (x == a.C0011a.a) {
                    x = ir.h(aVar6);
                }
                a6 = a6.g(ojc.b(aVar4, (sg50) x, null, false, null, gzsVar, 28));
            }
            aVar6.j();
            wiu0.b(a6, false, a3, a4, a5, null, null, aVar6, 0, 98);
            aVar2 = aVar6;
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
            s.d = new wzs(i, gzsVar, z, z2) { // from class: xsna.iuc
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;

                {
                    this.b = z;
                    this.c = gzsVar;
                    this.d = z2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    juc.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final duc.c cVar, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        lg90 j;
        z190 a;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1086378324);
        int i3 = i | (M.J(cVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.l(z) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1086378324, i3, -1, "com.vk.clips.viewer.edit.presentation.compose.video.ClipEditVideoAttachSelectedItem (ClipEditVideoAttachContent.kt:119)");
            }
            if (((Boolean) M.r(c5x.a)).booleanValue()) {
                M.K(-1717736030);
                M.j();
                j = ugp.g;
            } else {
                M.K(-1717676386);
                j = ((ClipsComposeImageLoader) M.r(dkw.b)).a(cVar.b, M, 0).j();
                M.j();
            }
            phw a2 = phw.a.a(j, null, wkj.a.a, null, null, M, 197000, 26);
            float f = 28;
            if (z) {
                M.K(-1717415862);
                M.j();
                a = tgp.a;
            } else {
                M.K(-1717362480);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2073634940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VideoSquareOutline20> (VkSdkIcons.kt:3708)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_video_square_outline_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a = hsk.a.a(a3, l5g.d, M, 3128, 4);
                M = M;
                M.j();
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.z b = com.vk.core.compose.component.cell.content.g.b(a2, f, a, PictureRadius.Large, null, null, aVar2, 100);
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.a(cVar.a, null, null, 1, null, null, aVar2, 12610560, 102), Cell$Middle.c.b.b(d370.N(R.string.clips_edit_video_attachment_description, 0, aVar2), 0, null, null, null, aVar2, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar2, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            } else {
                i2 = -1;
            }
            lg90 b2 = or.b(aVar2, 1833859693, R.drawable.vk_icon_cancel_24, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 24;
            com.vk.core.compose.component.cell.content.y0 a5 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b2, ylu0Var.getIcon().l, byc0.b(f2, f2), d370.N(R.string.clips_edit_remove_attachment_a11y, 0, aVar2), gzsVar2, null, aVar2, ((i3 << 6) & 57344) | 1573256, 32), null, null, null, aVar2, 61);
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = ir.h(aVar2);
            }
            wiu0.b(ojc.b(q630.a.a, (sg50) x, null, false, null, gzsVar, 28), false, b, a4, a5, null, null, aVar2, 0, 98);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gzsVar, gzsVar2, z, i) { // from class: xsna.huc
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    juc.c(duc.c.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}

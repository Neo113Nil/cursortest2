package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VideoProfileMoreMenu.kt */
/* loaded from: classes6.dex */
public final class o8t0 {
    public static final void a(final boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1898464263);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1898464263, i, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreMenu (VideoProfileMoreMenu.kt:19)");
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
        if (z) {
            M.K(-1484015689);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.video_profile_talkback_share_button, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
            }
            lg90 b = or.b(M, 1878014662, R.drawable.vk_icon_share_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wiu0.b(null, false, Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(b, Cell$Left.Main.Size.Small, b(M), null, null, M, 196664, 24), null, M, 2), a2, null, gzsVar, null, M, 0, 83);
            M = M;
        } else {
            M.K(-1484756589);
        }
        M.j();
        androidx.compose.runtime.a aVar3 = M;
        com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.vk_video_profile_report, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar3, 196608, 30);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(845022344, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ReportOutline28> (VkSdkIcons.kt:2962)");
        }
        lg90 b2 = or.b(aVar3, 1257504857, R.drawable.vk_icon_report_outline_28, aVar3, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        wiu0.b(null, false, Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(b2, Cell$Left.Main.Size.Small, b(aVar3), null, null, aVar3, 196664, 24), null, aVar3, 2), a3, null, gzsVar2, null, aVar3, 0, 83);
        aVar3.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar, gzsVar2, z) { // from class: xsna.n8t0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;

                {
                    this.b = z;
                    this.c = gzsVar;
                    this.d = gzsVar2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    o8t0.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final long b(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(841034100, 0, -1, "com.vk.video.profile.presentation.menu.iconTint (VideoProfileMoreMenu.kt:53)");
        }
        aVar.K(-1592209560);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().a;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}

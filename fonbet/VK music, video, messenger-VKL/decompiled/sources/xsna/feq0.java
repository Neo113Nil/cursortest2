package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: UploadingVideoBottomSheetView.kt */
/* loaded from: classes16.dex */
public final class feq0 {
    public static final void a(UploadingVideoBottomSheetState uploadingVideoBottomSheetState, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        boolean z = uploadingVideoBottomSheetState.b;
        androidx.compose.runtime.a M = aVar.M(-743695242);
        int i2 = (M.J(uploadingVideoBottomSheetState) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-743695242, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetView (UploadingVideoBottomSheetView.kt:30)");
            }
            if (z) {
                M.K(-1983470718);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1369856538, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline28> (VkSdkIcons.kt:630)");
                }
                b = or.b(M, -1382946425, R.drawable.vk_icon_delete_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1983423102);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = b;
            int i3 = z ? R.string.video_upload_delete : R.string.video_upload_cancel;
            String str = z ? "upload_video_item_menu_item_delete_tag" : "upload_video_item_menu_item_cancel_tag";
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(ojc.c(txj0.f(aVar2, 1.0f), false, null, null, gzsVar, 15), str);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 18;
            pzu0.b(lg90Var, null, txj0.q(s200.G(aVar2, f, f, 16, f), 28), wlb0.h(M).getIcon().h, M, 440, 0);
            yqv0.c(d370.N(i3, 0, M), s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22, 1, aVar2), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 48, 0, 8184);
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
            s.d = new d6(uploadingVideoBottomSheetState, gzsVar, i, 12);
        }
    }
}

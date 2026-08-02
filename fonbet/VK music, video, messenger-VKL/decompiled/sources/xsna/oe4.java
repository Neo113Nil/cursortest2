package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.te4;

/* compiled from: AudioBookChapterMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class oe4 {
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    public static final void a(te4.a aVar, izs<? super je4, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        ?? r13;
        String str;
        com.vk.core.compose.component.cell.content.x a;
        androidx.compose.runtime.a M = aVar2.M(1771686132);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1771686132, i2, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.AudioBookChapterRemoveDownloadScreen (AudioBookChapterMviComposeComponent.kt:88)");
            }
            String N = d370.N(aVar.f, 0, M);
            Integer num = aVar.d;
            if (num == null) {
                M.K(-551252188);
                M.j();
                a = null;
                r13 = 0;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
            } else {
                M.K(-551252187);
                lg90 a2 = pg90.a(num.intValue(), 0, M);
                Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                r13 = 0;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                a = com.vk.core.compose.component.cell.content.f.a(a2, size, ylu0Var.getIcon().h, null, null, M, 196664, 24);
                M.j();
            }
            com.vk.core.compose.component.cell.content.x xVar = a;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(aVar.e, r13, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, r13, -1, str);
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a);
            boolean J = M.J(N);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new l74(N, 1);
                M.R(x);
            }
            q630 b = egi0.b(m, r13, (izs) x);
            boolean z = ((i2 & 112) == 32 ? true : r13) | ((i2 & 14) != 4 ? r13 : true);
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new com.vk.catalog2.common.ui.holders.a(3, izsVar, aVar);
                M.R(x2);
            }
            wiu0.b(ojc.c(b, false, null, null, (gzs) x2, 15), false, xVar, a3, null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ne4(aVar, izsVar, i, 0);
        }
    }

    public static final void b(te4 te4Var, izs<? super je4, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(144210546);
        int i2 = (M.J(te4Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(144210546, i2, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.AudioBookChapterScreen (AudioBookChapterMviComposeComponent.kt:69)");
            }
            uog0 b = vog0.b(12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phu0.a(null, b, ylu0Var.getBackground().r, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1574219898, new cx(1, te4Var, izsVar), M), M, 1572864, 57);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new me4(te4Var, izsVar, i, 0);
        }
    }
}

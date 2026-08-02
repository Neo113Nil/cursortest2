package xsna;

import android.graphics.drawable.GradientDrawable;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: PreviewImage.kt */
/* loaded from: classes17.dex */
public final class i4d0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(95876436);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(95876436, i, -1, "com.vk.clips.viewer.edit.presentation.compose.description.Placeholder (PreviewImage.kt:88)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var;
            vjw.a(new y6g(ylu0Var.getImage().b), null, q630Var2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bfp(q630Var2, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List, xsna.r5j0] */
    /* JADX WARN: Type inference failed for: r3v33 */
    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        float f;
        ?? r3;
        int i3;
        androidx.compose.runtime.a M = aVar.M(2145697445);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2145697445, i2, -1, "com.vk.clips.viewer.edit.presentation.compose.description.PreviewImage (PreviewImage.kt:33)");
            }
            q630 E = ahn.E(q630Var, "clip_edit_pick_cover");
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
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
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            q630.a aVar4 = q630.a.a;
            if (booleanValue) {
                M.K(366643111);
                ja8.a(txj0.d(hr80.l(aVar4, new y7z(e43.l(new l5g(l5g.e), new l5g(l5g.f)), null, 0L, 9187343241974906880L, 0), null, 6), 1.0f), M, 6);
                M.j();
                r3 = 0;
                i3 = -1;
            } else {
                M.K(366846471);
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, aVar4);
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
                Pair<ClipsComposeImageLoader.LoadingState, lg90> a = ((ClipsComposeImageLoader) M.r(dkw.b)).a(str, M, i2 & 14);
                if (a.i() != ClipsComposeImageLoader.LoadingState.Loaded) {
                    M.K(205376226);
                    f = 1.0f;
                    a(txj0.d(aVar4, 1.0f), M, 6);
                } else {
                    f = 1.0f;
                    M.K(203361133);
                }
                M.j();
                r3 = 0;
                i3 = -1;
                vjw.a(a.j(), null, txj0.d(aVar4, f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 25016, 104);
                M.G();
                M.j();
            }
            ty6 ty6Var2 = dt1.a.i;
            ra8 ra8Var = ra8.a;
            ja8.a(hr80.l(txj0.c(txj0.f(ra8Var.b(aVar4, ty6Var2), 1.0f), 0.5f), ve2.a(GradientDrawable.Orientation.BOTTOM_TOP, e43.l(new l5g(l5g.c(14, l5g.b, 0.32f)), new l5g(l5g.j)), r3, 12), r3, 6), M, 0);
            String N = d370.N(R.string.clips_edit_sdk_edit_cover, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, ra8Var.b(aVar4, ty6Var2)), l5g.d, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.D0, aVar2, 384, 0, 8184);
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
            s.d = new sy9(str, q630Var, i, 4);
        }
    }
}

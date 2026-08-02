package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: PreviewImage.kt */
/* loaded from: classes17.dex */
public final class j4d0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1353384758);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1353384758, i, -1, "com.vk.clips.upload.ui.impl.compose.image.Placeholder (PreviewImage.kt:44)");
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
            s.d = new p2h(q630Var2, i, 3);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1338406885);
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
                androidx.compose.runtime.b.f(-1338406885, i2, -1, "com.vk.clips.upload.ui.impl.compose.image.PreviewImage (PreviewImage.kt:21)");
            }
            if (((Boolean) M.r(c5x.a)).booleanValue()) {
                M.K(1997034601);
                ja8.a(hr80.l(q630Var, new y7z(e43.l(new l5g(l5g.e), new l5g(l5g.f)), null, 0L, 9187343241974906880L, 0), null, 6), M, 0);
                M.j();
            } else {
                M.K(1997146635);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                Pair<ClipsComposeImageLoader.LoadingState, lg90> a = ((ClipsComposeImageLoader) M.r(ckw.b)).a(str, M, i2 & 14);
                ClipsComposeImageLoader.LoadingState i3 = a.i();
                ClipsComposeImageLoader.LoadingState loadingState = ClipsComposeImageLoader.LoadingState.Loaded;
                q630.a aVar3 = q630.a.a;
                if (i3 != loadingState) {
                    M.K(-1363299378);
                    a(txj0.d(aVar3, 1.0f), M, 6);
                } else {
                    M.K(-1364517647);
                }
                M.j();
                vjw.a(a.j(), null, txj0.d(aVar3, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 25016, 104);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new js8(str, q630Var, i, 1);
        }
    }
}

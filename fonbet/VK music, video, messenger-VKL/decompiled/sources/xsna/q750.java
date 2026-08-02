package xsna;

import android.annotation.SuppressLint;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yk8;

/* compiled from: MusicStandaloneInformerContainer.kt */
/* loaded from: classes3.dex */
public final class q750 {
    @SuppressLint({"UnusedContentLambdaTargetStateParameter"})
    public static final void a(izs izsVar, MusicPlayerInformerViewState.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        MusicPlayerInformerViewState.a aVar3 = aVar;
        androidx.compose.runtime.a M = aVar2.M(146453683);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(aVar3) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar4 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar4) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(146453683, i2, -1, "com.vk.music.informer.MusicStandaloneInformerContainer (MusicStandaloneInformerContainer.kt:44)");
            }
            float f = 16;
            q630 d = rte0.d(txj0.f(aVar4, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1884427038, 0, -1, "com.vk.music.informer.getGradientColor (MusicStandaloneInformerContainer.kt:140)");
            }
            long d2 = f870.d(dhr0.M() ? 4282992457L : 4293980400L);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            l5g l5gVar = new l5g(d2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 l = hr80.l(d, yk8.a.g(e43.l(l5gVar, new l5g(ylu0Var.getBackground().g)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, l);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 H = s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bw40.d, 7);
            cp10 d4 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, d4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new q8w(6);
                M.R(x);
            }
            aVar3 = aVar;
            xh2.a(aVar3, null, (izs) x, null, null, null, kai.c(2033765026, new o750(izsVar, 0), M), M, ((i2 >> 3) & 14) | 1573248, 58);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g7c(izsVar, aVar3, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-55732696);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(lg90Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-55732696, i2, -1, "com.vk.music.informer.MusicStandaloneInformerContent (MusicStandaloneInformerContainer.kt:122)");
            }
            q630 F = s200.F(kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            float f = 16;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, F, null, false, false, lg90Var, null, new pco(f), str, null, a, null, new pco(12), false, null, null, null, aVar2, (i2 & 14) | 1073745328 | ((i2 << 18) & 1879048192), ((i2 << 3) & 896) | 1605680, 0, 4105696);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new p750(gzsVar, str, q630Var, lg90Var, i);
        }
    }
}

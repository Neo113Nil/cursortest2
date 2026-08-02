package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VideoAdsSuspendBottomSheetContent.kt */
/* loaded from: classes6.dex */
public final class d0s0 {
    public static final void a(e0s0 e0s0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        e0s0 e0s0Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1263958589);
        int i3 = i | (M.J(e0s0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1263958589, i3, -1, "com.vk.video.growth.impl.adssuspend.Content (VideoAdsSuspendBottomSheetContent.kt:58)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 16;
            q630 m = hr80.m(rte0.d(txj0.f(aVar2, 1.0f), vog0.b(f)), wlb0.h(M).getBackground().r, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            ty6 ty6Var = dt1.a.d;
            ra8 ra8Var = ra8.a;
            q630 E = ahn.E(ra8Var.b(aVar2, ty6Var), "videoAdsSuspendBottomSheetClose");
            float f2 = 48;
            if (androidx.compose.runtime.b.d()) {
                i2 = i3;
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            } else {
                i2 = i3;
            }
            lg90 a = pg90.a(R.drawable.vk_icon_dismiss_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = (i2 >> 6) & 14;
            nzu0.c(gzsVar2, a, null, E, f2, wlb0.h(M).getIcon().f, false, IconButtonRippleType.Bounded, false, null, null, M, i4 | 12607936, 1856);
            float f3 = 12;
            q630 E2 = s200.E(txj0.z(txj0.f(ra8Var.b(aVar2, dt1.a.i), 1.0f), null, 3), f3, f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            f9t.e(txj0.h(aVar2, f), M, 6);
            pzu0.b(pg90.a(R.drawable.vk_icon_illustration_vkvideo_movie_set_172h, 0, M), null, ahn.E(aVar2, "videoAdsSuspendBottomSheetPicture"), l5g.k, M, 3512, 0);
            f9t.e(txj0.h(aVar2, f), M, 6);
            e0s0Var2 = e0s0Var;
            yqv0.c(e0s0Var2.a, ahn.E(aVar2, "videoAdsSuspendBottomSheetTitle"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 48, 0, 8120);
            f9t.e(txj0.h(aVar2, 32), M, 6);
            q630 E3 = ahn.E(txj0.f(aVar2, 1.0f), "videoAdsSuspendBottomSheetProceedButton");
            String str = e0s0Var2.b;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, ((i2 >> 3) & 14) | 28080, 0, 0, 4190176);
            M = M;
            if (e0s0Var2.c != null) {
                M.K(-1827954501);
                f9t.e(txj0.h(aVar2, f3), M, 6);
                bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Tertiary, buttonAppearance, ahn.E(txj0.f(aVar2, 1.0f), "videoAdsSuspendBottomSheetCancelButton"), null, false, false, null, null, null, e0s0Var2.c, null, null, null, null, false, null, null, null, M, i4 | 28080, 0, 0, 4190176);
                M = M;
            } else {
                M.K(-1832775063);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            e0s0Var2 = e0s0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ip6(i, 7, e0s0Var2, gzsVar, gzsVar2);
        }
    }

    public static final void b(e0s0 e0s0Var, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2013798192);
        int i2 = (M.J(e0s0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2013798192, i2, -1, "com.vk.video.growth.impl.adssuspend.VideoAdsSuspendBottomSheetContent (VideoAdsSuspendBottomSheetContent.kt:43)");
            }
            e0s0Var.getClass();
            M.K(-958436195);
            a(e0s0Var, gzsVar, gzsVar2, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t6n(i, 3, e0s0Var, gzsVar, gzsVar2);
        }
    }
}

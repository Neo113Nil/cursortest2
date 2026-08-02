package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PictureContentImpl.kt */
/* loaded from: classes17.dex */
public final class pja0 extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public pja0(efj efjVar, iy5 iy5Var, boolean z) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(iy5Var);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(710773675);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(710773675, i2, -1, "com.vk.core.compose.component.horizontal.PictureContentImpl.Draw (PictureContentImpl.kt:35)");
            }
            float c = uco.c(j);
            float b = uco.b(j);
            q630.a aVar2 = q630.a.a;
            q630 u = txj0.u(aVar2, c, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, u);
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
            k9q0.w(M, c2, dVar);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, c3, dVar);
            efj efjVar = (efj) ((zak0) this.a).getValue();
            float min = Math.min(uco.c(j), uco.b(j));
            List singletonList = Collections.singletonList((iy5) ((zak0) this.b).getValue());
            fdi.w();
            gdv0.b(efjVar, min, singletonList, null, PictureRadius.Large, null, null, M, 0, 104);
            if (((Boolean) ((zak0) this.c).getValue()).booleanValue()) {
                M.K(-545423721);
                q630 l = kci.l(ra8.a.b(aVar2, dt1.a.j), 8, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(l, ylu0Var.getBackground().j, vog0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                }
                lg90 a = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a, null, m, ylu0Var2.getIcon().a, M, 56, 0);
                M = M;
            } else {
                M.K(-547348821);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.oja0
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    pja0.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}

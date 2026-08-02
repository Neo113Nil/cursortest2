package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AvatarContentImpl.kt */
/* loaded from: classes17.dex */
public final class yq5 extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final rg50 d;
    public final wh50 e;

    public yq5(efj efjVar, iy5 iy5Var, k18 k18Var, int i, boolean z) {
        this.a = androidx.compose.runtime.k.b(efjVar);
        this.b = androidx.compose.runtime.k.b(iy5Var);
        this.c = androidx.compose.runtime.k.b(k18Var);
        this.d = androidx.compose.runtime.i.a(i);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1936375767);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1936375767, i2, -1, "com.vk.core.compose.component.horizontal.AvatarContentImpl.Draw (AvatarContentImpl.kt:45)");
            }
            float b = j == 9205357640488583168L ? 0 : Float.isNaN(uco.c(j)) ? uco.b(j) : Float.isNaN(uco.b(j)) ? uco.c(j) : Math.min(uco.c(j), uco.b(j));
            float c = uco.c(j);
            float b2 = uco.b(j);
            q630.a aVar3 = q630.a.a;
            q630 u = txj0.u(aVar3, c, b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, u);
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
            ty6 ty6Var2 = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var2, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            float f = b;
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            ldu0.b((efj) ((zak0) this.a).getValue(), f, null, (iy5) ((zak0) this.b).getValue(), (k18) ((zak0) this.c).getValue(), false, null, null, null, M, 196608, 452);
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            ra8 ra8Var = ra8.a;
            if (booleanValue) {
                M.K(1851666089);
                fdi.w();
                M.K(-1835570350);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1835570350, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.avatarSelectedCheckOffset (MilkshakeHorizontalListItemDefaults.kt:61)");
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(0) & 4294967295L) | (Float.floatToRawIntBits(6) << 32);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                q630 l = kci.l(ra8Var.b(aVar3, dt1.a.j), rco.a(floatToRawIntBits), rco.b(floatToRawIntBits));
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
                long j2 = ylu0Var2.getIcon().a;
                aVar2 = aVar3;
                pzu0.b(a, null, m, j2, M, 56, 0);
            } else {
                aVar2 = aVar3;
                M.K(1849099103);
            }
            M.j();
            wak0 wak0Var = (wak0) this.d;
            if (wak0Var.getIntValue() > 0) {
                M.K(1852298861);
                q630 E = s200.E(hr80.m(kci.m(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ra8Var.b(aVar2, dt1.a.j)), wlb0.h(M).getIcon().l, vog0.a), kqu0.s, kqu0.q);
                cp10 d3 = ja8.d(ty6Var2, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c4 = qri.c(M, E);
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
                k9q0.w(M, d3, cVar);
                k9q0.w(M, D3, eVar);
                ur.d(hashCode3, M, bVar, M, c2678a);
                k9q0.w(M, c4, dVar);
                q630 b3 = ra8Var.b(aVar2, ty6Var);
                frv0 frv0Var = wlb0.l(M).O;
                yqv0.c("+" + wak0Var.getIntValue(), b3, wlb0.h(M).getText().d, null, null, 0, 3, null, 0, false, 0, 1, null, frv0Var, M, 0, 48, 6072);
                M = M;
                M.G();
            } else {
                M.K(1849099103);
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
            s.d = new wzs(j, i) { // from class: xsna.xq5
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    yq5.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}

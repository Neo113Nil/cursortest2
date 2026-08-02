package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FilterButton.kt */
/* loaded from: classes18.dex */
public final class icr {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final gzs gzsVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a aVar2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1532872396);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1532872396, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.FilterButton (FilterButton.kt:34)");
            }
            String N = d370.N(R.string.ecomm_delivery_points_filter_button, 0, M);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1794058044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Filter24> (VkSdkIcons.kt:890)");
            }
            lg90 b = or.b(M, 210325805, R.drawable.vk_icon_filter_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = wlb0.h(M).getIcon().a;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            oe7 oe7Var = new oe7(j, 5, porterDuffColorFilter);
            wlb0.i(M).getClass();
            float f = tqu0.c;
            long j2 = udu.a;
            uog0 uog0Var = vog0.a;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(a5j0.b(aVar4, f, uog0Var, false, j2, j2, 4), wlb0.h(M).getBackground().g, uog0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b2 = ojc.b(m, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false), false, null, gzsVar, 28);
            boolean J = M.J(N);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new zl1(N, 2);
                M.R(x2);
            }
            q630 D2 = s200.D(egi0.b(b2, true, (izs) x2), 10);
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            vjw.a(b, null, ra8Var.b(D2, ty6Var), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, M, 56, 56);
            aVar2 = M;
            if (z) {
                aVar2.K(-1976873114);
                rdu0.a(ra8Var.b(s200.D(ahn.E(aVar4, "delivery_points_filters_applied_badge"), 3), dt1.a.d), null, aVar2, 0, 2);
            } else {
                aVar2.K(-1979473828);
            }
            aVar2.j();
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
            s.d = new wzs(i, gzsVar, q630Var, z) { // from class: xsna.hcr
                public final /* synthetic */ gzs b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                {
                    this.b = gzsVar;
                    this.c = z;
                    this.d = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    icr.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.b, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}

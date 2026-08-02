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
import xsna.yk8;

/* compiled from: LocationPin.kt */
/* loaded from: classes18.dex */
public final class ayz {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-1642408370);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1642408370, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.LocationPin (LocationPin.kt:74)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-767214904, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LocationPin56> (VkIcons.kt:6720)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_location_pin_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.ecomm_checkout_selected_location, 0, M);
            q630 q = txj0.q(q630Var, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(a, N, q, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 8, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gjj(q630Var, i, 1);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1932448662);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1932448662, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.LocationPinShadow (LocationPin.kt:87)");
            }
            M.K(-1657286865);
            float I0 = ((azl) M.r(uvi.h)).I0(z ? 10 : (float) 4.5d);
            M.j();
            mtk0 b = hg2.b(I0, null, "PinShadowRadiusAnimation", null, M, 3072, 22);
            mtk0 b2 = hg2.b(z ? 0.3f : 0.4f, null, "PinShadowColorAlphaAnimation", null, M, 3072, 22);
            float f = 35;
            float f2 = 18;
            q630 h = txj0.h(txj0.v(q630Var, f), f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            if (dt.c(hr80.l(l2l0.o(ra8.a.b(txj0.h(txj0.v(q630.a.a, f), f2), dt1.a.f), 1.75f, 1.0f), yk8.a.e(e43.l(new l5g(l5g.c(14, l5g.b, ((Number) b2.getValue()).floatValue())), new l5g(l5g.j)), 0L, ((Number) b.getValue()).floatValue(), 10), r190.a, 4), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zxz
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ayz.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(1488081824);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1488081824, i2, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.RaiseableLocationPin (LocationPin.kt:40)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            boolean J = M.J(azlVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = Float.valueOf(azlVar.I0((float) (-28.5d)));
                M.R(x);
            }
            float floatValue = ((Number) x).floatValue();
            if (!z) {
                floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            mtk0 b = hg2.b(floatValue, null, "PinOffsetAnimation", null, M, 3072, 22);
            q630 h = txj0.h(txj0.v(q630Var, 56), 90);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            ty6 ty6Var = dt1.a.i;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            b(i2 & 14, M, ra8Var.b(aVar3, ty6Var), z);
            q630 H = s200.H(ra8Var.b(aVar3, ty6Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 7);
            boolean J2 = M.J(b);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new lh2(b, 1);
                M.R(x2);
            }
            a(kci.k(H, (izs) x2), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xzg(i, q630Var, z);
        }
    }
}

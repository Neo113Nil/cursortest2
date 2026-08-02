package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uxe0;

/* compiled from: RatingImpl.kt */
/* loaded from: classes18.dex */
public final class cye0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public cye0() {
        throw null;
    }

    public cye0(float f, String str) {
        this.a = androidx.compose.runtime.k.b(new yxe0(f));
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(null);
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        cye0 cye0Var;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(179264019);
        int i5 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i5 == 0) {
            i2 = i | (M.J(aVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(179264019, i2, -1, "com.vk.ecomm.design.compose.ratingblock.RatingImpl.Content (RatingImpl.kt:45)");
            }
            Locale locale = Locale.getDefault();
            wh50 wh50Var = this.a;
            String y = brm0.y(String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((yxe0) ((zak0) wh50Var).getValue()).a)}, 1)), ".", StringUtils.COMMA);
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.d).getValue());
            wh50 wh50Var2 = this.c;
            boolean z = ((gzs) ((zak0) wh50Var2).getValue()) != null;
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new b410(this, 22);
                M.R(x);
            }
            q630 c = ojc.c(b, z, null, null, (gzs) x, 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(12), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            yqv0.a(y, null, wlb0.h(M).getText().m, l2l0.l(40), b6s.h, u4s.b, 0L, 0, 0L, null, 0, false, 0, 0, null, null, M, 199680, 0, 1048466);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar2, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, xpyVar);
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
            k9q0.w(M, c3, dVar);
            float f = ((yxe0) ((zak0) wh50Var).getValue()).a;
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                i4 = 0;
                androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
            } else {
                i3 = -1;
                i4 = 0;
            }
            lg90 b2 = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rxe0.c(f, b2, null, false, uxe0.a.b(M), null, M, 64, 44);
            f9t.e(txj0.h(aVar2, 4), M, 6);
            cye0Var = this;
            int i6 = i4;
            yqv0.c((String) ((zak0) cye0Var.b).getValue(), null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8186);
            M = M;
            M.G();
            if (((gzs) ((zak0) wh50Var2).getValue()) != null) {
                M.K(1950467783);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1231053620, i6, i3, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, i6, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a3, null, null, wlb0.h(M).getIcon().n, M, 56, 4);
            } else {
                M.K(1947072043);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            cye0Var = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p72(cye0Var, i);
        }
    }
}

package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DelayedShortVideoCardView.kt */
/* loaded from: classes16.dex */
public final class dtl {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ShortVideoListView.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        int i4;
        androidx.compose.runtime.a M = aVar.M(234836909);
        if ((i & 6) == 0) {
            i3 = i | (M.J(eVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                q630 q630Var3 = i5 != 0 ? aVar2 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(234836909, i3, -1, "com.vk.catalog.mvi.block.video.impl.short.ui.DelayedShortVideoCardView (DelayedShortVideoCardView.kt:35)");
                }
                long j = wlb0.h(M).getImage().b;
                e.a aVar3 = androidx.compose.ui.graphics.e.a;
                q630 m = hr80.m(q630Var3, j, aVar3);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.b;
                cp10 d = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, m);
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
                q630 q630Var4 = q630Var3;
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d, cVar);
                cri.a.e eVar2 = cri.a.e;
                k9q0.w(M, D, eVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                int i6 = i3;
                fwu0.c(txj0.d(aVar2, 1.0f), null, eVar.d, null, null, null, null, yei.a, M, 100663302, 250);
                M = M;
                ja8.a(hr80.m(txj0.d(aVar2, 1.0f), wlb0.h(M).j().a, aVar3), M, 0);
                String str = eVar.i;
                ra8 ra8Var = ra8.a;
                if (str == null) {
                    M.K(1932640084);
                    M.j();
                    i4 = 0;
                } else {
                    M.K(1932640085);
                    q630 b = ra8Var.b(aVar2, dt1.a.f);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, b);
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
                    k9q0.w(M, a, cVar);
                    k9q0.w(M, D2, eVar2);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    qzu0.a.getClass();
                    pzu0.b(qzu0.y(M), null, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), wlb0.h(M).getText().d, M, 440, 0);
                    i4 = 0;
                    yqv0.c(str, null, wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).s0, M, 0, 0, 8186);
                    M = M;
                    M.G();
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(864001564, i4, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_more_vertical_24, i4, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = wlb0.h(M).getText().d;
                float f = 8;
                q630 D3 = s200.D(ra8Var.b(aVar2, dt1.a.d), f);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                mlg0 a3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                boolean z = (i6 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new dnh(eVar, 11);
                    M.R(x2);
                }
                pzu0.b(a2, null, ahn.E(ojc.b(D3, sg50Var, a3, false, null, (gzs) x2, 28), "mvi_catalog_short_video_card_menu_test_tag"), j2, M, 56, 0);
                if (eVar.h) {
                    M.K(1933988647);
                    qzu0.a.getClass();
                    pzu0.b(qzu0.a1(M), null, ahn.E(s200.D(ra8Var.b(aVar2, ty6Var), f), "mvi_catalog_short_video_pin_icon_test_tag"), wlb0.h(M).getIcon().c, M, 56, 0);
                } else {
                    M.K(1930391035);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ctl
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        dtl.a(ShortVideoListView.e.this, q630Var2, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}

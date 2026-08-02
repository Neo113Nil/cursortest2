package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AlbumsItem.kt */
/* loaded from: classes18.dex */
public final class co1 {
    public static final void a(final List list, final int i, final boolean z, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        q630 m;
        androidx.compose.runtime.a M = aVar.M(-1696751323);
        int i3 = i2 | (M.J(list) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1696751323, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.AlbumRow (AlbumsItem.kt:92)");
            }
            M.K(1509559535);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            if (z) {
                M.K(-345915101);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getBackground().g;
                float f2 = 20;
                m = hr80.m(f, j, vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 3));
                M.j();
            } else {
                M.K(-1396624116);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                m = hr80.m(f, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a);
                M.j();
            }
            q630 q630Var = m;
            M.j();
            float f3 = 10;
            q630 u = m200.u(s200.H(q630Var, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 12, 2), IntrinsicSize.Max);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, u);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, -1579598993, list);
            while (a2.hasNext()) {
                foi0 foi0Var = (foi0) a2.next();
                String str = foi0Var.c;
                String str2 = foi0Var.b;
                q630 c2 = txj0.c(aVar2, 1.0f);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 H = s200.H(s200.F(kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, c2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7);
                boolean J = ((i3 & 7168) == 2048) | M.J(foi0Var);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new kg(3, izsVar, foi0Var);
                    M.R(x);
                }
                xi1.d(0, M, str, str2, ojc.c(H, false, null, null, (gzs) x, 15));
                i4 = 0;
            }
            M.j();
            M.K(-1579582522);
            int max = Math.max(i4, i);
            for (int i5 = 0; i5 < max; i5++) {
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, i, z, izsVar, i2) { // from class: xsna.un1
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    co1.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, boolean z, izs<? super wml0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        com.vk.core.compose.component.group.header.d dVar;
        ikg0 ikg0Var;
        androidx.compose.runtime.a M = aVar.M(1226987880);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1226987880, i3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.Title (AlbumsItem.kt:133)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 H = s200.H(hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7);
            b.C0749b c0749b = b.C0749b.a;
            String N = d370.N(R.string.community_market_albums_count, 0, M);
            if (i > 0) {
                M.K(-1270209380);
                dVar = d.a.a(i, CounterAppearance.Design.Neutral, CounterMode.Tertiary, CounterSize.Medium, null, M, 200112 | (i3 & 14), 16);
                M = M;
                M.j();
            } else {
                M.K(-1269927466);
                M.j();
                dVar = null;
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new e60(2);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.f a = f.a.a(N, null, dVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, M, 805306368, 442);
            if (z) {
                M.K(-1269694284);
                String N2 = d370.N(R.string.community_market_show_all, 0, M);
                boolean z2 = (i3 & 896) == 256;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new lq0(izsVar, 1);
                    M.R(x2);
                }
                GroupHeader$Right.b.a a2 = GroupHeader$Right.b.a.C0746a.a(3072, 4, M, null, N2, (gzs) x2);
                androidx.compose.runtime.a aVar2 = M;
                ikg0 a3 = GroupHeader$Right.c.a(null, null, a2, null, aVar2, 11);
                M = aVar2;
                M.j();
                ikg0Var = a3;
            } else {
                M.K(-1269374923);
                M.j();
                ikg0Var = null;
            }
            com.vk.core.compose.component.group.header.g.b(a, H, c0749b, null, null, ikg0Var, false, M, 384, 88);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xn1(i, i2, izsVar, z);
        }
    }

    public static final void c(nvy nvyVar, ir1 ir1Var, final izs<? super wml0, s3q0> izsVar, boolean z) {
        nvy.g(nvyVar, null, null, new jai(-1875070052, new on1(0, ir1Var, izsVar), true), 3);
        final int i = z ? 3 : 2;
        final List list = ir1Var.a;
        final int ceil = (int) Math.ceil(list.size() / i);
        nvy.c(nvyVar, ceil, null, new jai(1563804261, new zzs() { // from class: xsna.sn1
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1563804261, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.albums.<anonymous> (AlbumsItem.kt:67)");
                    }
                    int i2 = i;
                    int i3 = intValue * i2;
                    List list2 = list;
                    List subList = list2.subList(i3, Math.min(i3 + i2, list2.size()));
                    if (subList.isEmpty()) {
                        aVar.K(-220309763);
                    } else {
                        aVar.K(-217286395);
                        co1.a(subList, i2 - subList.size(), intValue == ceil - 1, izsVar, aVar, 0);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true), 6);
        nvy.g(nvyVar, null, null, sai.a, 3);
    }
}

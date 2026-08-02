package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CheckCircleScreenContent.kt */
/* loaded from: classes18.dex */
public final class j0c implements yah0 {
    public final List b;

    public j0c() {
        Boolean bool = Boolean.TRUE;
        Pair pair = new Pair(bool, bool);
        Boolean bool2 = Boolean.FALSE;
        this.b = e43.l(pair, new Pair(bool, bool2), new Pair(bool2, bool), new Pair(bool2, bool2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(8672551);
        int i2 = (i & 6) == 0 ? (M.y(gzsVar) ? 4 : 2) | i : i;
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(8672551, i2, -1, "com.vk.design.demo.presentation.screens.CheckCircleScreenContent.Content (CheckCircleScreenContent.kt:39)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Check Circle", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, ((i2 << 6) & 896) | 1572872, 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(true, true, M, 438, 0);
            float f2 = 4;
            float f3 = 8;
            rzo0.a(54, 0, M, "States", s200.H(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar2), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            q630 H = s200.H(aVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            int i4 = 48;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            w0n0.a(6, 2, M, "View: ", null);
            M.K(-837154540);
            List<Pair> list = this.b;
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c0012a = a.C0011a.a;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.g()).booleanValue();
                q630 D3 = s200.D(aVar2, f2);
                Object x = M.x();
                if (x == c0012a) {
                    x = i0c.b;
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean l = M.l(booleanValue2) | M.l(booleanValue);
                Object x2 = M.x();
                if (l || x2 == c0012a) {
                    x2 = new g0c(booleanValue2, booleanValue, 0);
                    M.R(x2);
                }
                ae2.a(54, 0, M, izsVar2, (izs) x2, D3);
                i4 = i4;
            }
            M.j();
            M.G();
            q630 H2 = s200.H(aVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            q630.a aVar4 = aVar2;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, i4);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, H2);
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
            k9q0.w(M, a4, cri.a.f);
            k9q0.w(M, D4, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            w0n0.a(6, 2, M, "Compose: ", null);
            M.K(-76109760);
            for (Pair pair2 : list) {
                boolean booleanValue3 = ((Boolean) pair2.d()).booleanValue();
                boolean booleanValue4 = ((Boolean) pair2.g()).booleanValue();
                q630 D5 = s200.D(aVar4, f2);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new uw3(8);
                    M.R(x3);
                }
                androidx.compose.runtime.a aVar6 = M;
                uju0.a((gzs) x3, D5, booleanValue4, booleanValue3, null, null, aVar6, 54, 48);
                f2 = f2;
                M = aVar6;
                aVar4 = aVar4;
            }
            M.j();
            M.G();
            rzo0.a(6, 0, M, "Items", s200.H(aVar4, f3, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4));
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x4);
            }
            wh50 wh50Var = (wh50) x4;
            boolean booleanValue5 = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new ng1(wh50Var, 15);
                M.R(x5);
            }
            uju0.b("Checkable and Enabled", (gzs) x5, null, booleanValue5, "Click to check/uncheck", false, false, M, 24630, 100);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new l35(5);
                M.R(x6);
            }
            uju0.b("Unchecked and Disabled", (gzs) x6, null, false, null, false, false, M, 199734, 84);
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new x5(7);
                M.R(x7);
            }
            uju0.b("Checked and Disabled", (gzs) x7, null, true, null, false, false, M, 199734, 84);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0c(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}

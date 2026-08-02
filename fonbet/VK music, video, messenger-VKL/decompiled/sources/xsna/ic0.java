package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ActualPoll.kt */
/* loaded from: classes16.dex */
public final class ic0 {
    public static final void a(y0u0 y0u0Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1314593086);
        int i2 = i | (M.J(y0u0Var) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1314593086, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.poll.ActualPoll (ActualPoll.kt:43)");
            }
            float f = 12;
            float f2 = 8;
            q630 E = ahn.E(s200.H(q630Var, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 2), "actual_dynamic_poll_content");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 s = txj0.s(q630.a.a, 20, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().x;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ec0(0);
                M.R(x);
            }
            ja8.a(hr80.m(s, j, new ujt((yzs) x)).g(new gcv(dt1.a.o)), M, 0);
            b((i2 << 3) & 7168, M, y0u0Var.a, y0u0Var.b, izsVar, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new fc0(y0u0Var, q630Var, izsVar, i, 0);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final ArrayList arrayList, final izs izsVar, q630 q630Var) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-540458286);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(arrayList) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-540458286, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.poll.ActualPollContent (ActualPoll.kt:88)");
            }
            long j = wlb0.h(M).getBackground().x;
            uog0 b = vog0.b(12);
            q630.a aVar3 = q630.a.a;
            q630 m = hr80.m(aVar3, j, b);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            frv0 frv0Var = wlb0.l(M).h0;
            q630 f = txj0.f(s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f);
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            String str3 = str2;
            int i4 = i3;
            yqv0.c(str3, ra8Var.b(f, ty6Var), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, i3 & 14, 0, 8124);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
            }
            lg90 b2 = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = wlb0.h(M).getIcon().l;
            String N = d370.N(R.string.cancel, 0, M);
            q630 E = ahn.E(ra8Var.b(s200.D(txj0.q(aVar3, 49), (float) 14.5d), dt1.a.d), "actual_dynamic_poll_close_button");
            int i5 = i4 & 7168;
            boolean z = i5 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new gc0(izsVar, 0);
                M.R(x);
            }
            q630Var2 = aVar3;
            nzu0.c((gzs) x, b2, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, M, 64, 2000);
            aVar2 = M;
            aVar2.G();
            if (arrayList.isEmpty()) {
                aVar2.K(1272869338);
            } else {
                aVar2.K(1276987471);
                a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
                float f2 = 1.0f;
                float f3 = 8;
                q630 E2 = ahn.E(s200.H(txj0.f(q630Var2, 1.0f), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 2), "actual_dynamic_poll_buttons");
                boolean z2 = false;
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, aVar2, 0);
                int hashCode3 = Long.hashCode(n34.n(aVar2));
                sy90 D3 = aVar2.D();
                q630 c3 = qri.c(aVar2, E2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar4);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, a2, cVar);
                k9q0.w(aVar2, D3, eVar);
                ur.d(hashCode3, aVar2, bVar, aVar2, c2678a);
                k9q0.w(aVar2, c3, dVar);
                aVar2.K(-1650566496);
                Iterator it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        e43.t();
                        throw null;
                    }
                    ikr0 ikr0Var = (ikr0) next;
                    String str4 = ikr0Var.d;
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                    if (f2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 E3 = ahn.E(new xpy(f2, true), "actual_dynamic_poll_button_" + i6);
                    boolean J = (i5 == 2048 ? true : z2) | aVar2.J(ikr0Var);
                    Object x2 = aVar2.x();
                    if (J || x2 == c0012a) {
                        x2 = new g4(2, izsVar, ikr0Var);
                        aVar2.R(x2);
                    }
                    androidx.compose.runtime.a aVar5 = aVar2;
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, str4, null, null, null, null, false, null, null, null, aVar5, X2.b.f, 0, 0, 4190176);
                    aVar2 = aVar5;
                    i6 = i7;
                    z2 = z2;
                    f2 = 1.0f;
                }
                aVar2.j();
                aVar2.G();
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.hc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ic0.b(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, arrayList, izsVar, q630Var3);
                    return s3q0.a;
                }
            };
        }
    }
}

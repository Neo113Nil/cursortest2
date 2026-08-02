package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityHeaderContentWithDonutComposeView.kt */
/* loaded from: classes5.dex */
public final class j3h {

    /* compiled from: CommunityHeaderContentWithDonutComposeView.kt */
    public static final class a implements kwn<Pair<? extends String, ? extends Boolean>> {
        public static final a b = new a();

        @Override // xsna.kwn
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(Pair<String, Boolean> pair, zzs<? super lg90, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1646524900);
            if ((i & 6) == 0) {
                i2 = (M.J(pair) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(zzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1646524900, i2, -1, "com.vk.profile.community.impl.ui.view.DonutAvatars.<anonymous>.<anonymous>.<no name provided>.Content (CommunityHeaderContentWithDonutComposeView.kt:175)");
                }
                zzsVar.invoke(fwu0.l(null, pair.i(), null, null, M, 0, 61), pair.j(), M, Integer.valueOf(((i2 << 3) & 896) | 8));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new i3h(i, 0, this, pair, zzsVar);
            }
        }
    }

    public static final void a(List list, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1397375619);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1397375619, i3, -1, "com.vk.profile.community.impl.ui.view.DonutAvatars (CommunityHeaderContentWithDonutComposeView.kt:168)");
            }
            q630 c = ojc.c(s200.H(q630.a.a, kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), false, null, null, gzsVar, 15);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zt4(list, 21);
                M.R(x);
            }
            r4o.b(c, null, null, null, (izs) x, M, 0, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i7c(list, gzsVar, i, 1);
        }
    }

    public static final void b(us2 us2Var, List list, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-50513704);
        int i2 = i | (M.J(us2Var) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 3072 | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-50513704, i2, -1, "com.vk.profile.community.impl.ui.view.DonutSubscribersFriendAndAvatars (CommunityHeaderContentWithDonutComposeView.kt:135)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1769232636);
            M.j();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(new xpy(1.0f, true), "HeaderMembersCellText");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.Y;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(us2Var, E, ylu0Var.getText().m, 0, null, 2, false, 1, null, null, frv0Var, M, (i2 & 14) | 100663296, 6, 6904);
            aVar2 = M;
            if (list.isEmpty()) {
                aVar2.K(-1774928730);
            } else {
                aVar2.K(-1768589943);
                a(list, gzsVar, aVar2, ((i2 >> 3) & 14) | ((i2 >> 9) & 112));
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
            s.d = new h3h(i, 0, us2Var, list, q630Var, gzsVar);
        }
    }
}

package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FeedAvatarAnimatedStackScreenContent.kt */
/* loaded from: classes18.dex */
public final class axq implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        axq axqVar;
        androidx.compose.runtime.a M = aVar.M(1113627757);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1113627757, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.Content (FeedAvatarAnimatedStackScreenContent.kt:42)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            int i4 = i2;
            jjn0.a("Avatar Animated Stack", gzsVar, x5Var, gzsVar2, null, null, M, (i2 & 896) | ((i2 << 3) & 112) | 6 | ((i2 << 6) & 7168), 48);
            djn0.a(false, true, M, 438, 0);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            axqVar = this;
            axqVar.b(q9g.a(aVar2, 1.0f), M, (i4 >> 12) & 112);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            axqVar = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vwq(axqVar, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1928767885);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1928767885, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList (FeedAvatarAnimatedStackScreenContent.kt:62)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nhe(this, 20);
                M.R(x);
            }
            lqy.a(f, null, null, g, null, null, false, null, (izs) x, M, 24576, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h7c(this, q630Var, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1673279370);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1673279370, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackNoTextWithAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:181)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new qt0(26);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ht7(this, i, 4);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1144865691);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1144865691, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackSingleAvatarAndPlaceholderWithAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:222)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wh6(24);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u05(this, i, 4);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-382528919);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-382528919, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackSingleAvatarWithAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:202)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ht(25);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vp4(this, i, 4);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-465255603);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-465255603, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackSingleAvatarWithoutAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:243)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new leq(2);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new phg(this, i, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack] */
    public final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(734682814);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(734682814, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackWithPlayButtonSample (FeedAvatarAnimatedStackScreenContent.kt:263)");
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object x = M.x();
            if (x == a.C0011a.a) {
                M.R(null);
                x = null;
            }
            ref$ObjectRef.element = (AvatarAnimatedStack) x;
            List l = e43.l("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0", "https://sun9-11.userapi.com/s/v1/ig2/8ASAJV_87mlTav5DoI-KU1OkK-2oZxOtJ062kVx7F3JElLG8Jj6M1TxCp5W9wlQngPZ9eU2Qfsc2rpxECzJU4jMD.jpg?quality=95&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080&from=bu&u=piXpizO0HgNnhrf-R793MglftMbsHbMgi3HSaAXZ7j0&cs=1080x0");
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, c, cri.a.d);
            ae2.a(48, 4, M, new ij8(14, l, ref$ObjectRef), null, txj0.f(aVar2, 1.0f));
            f9t.e(txj0.q(aVar2, 8), M, 6);
            bhu0.e(new xk(12, ref$ObjectRef, l), ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar2, 1.0f), null, false, false, null, null, null, "Запустить анимацию", null, null, null, null, false, null, null, null, M, 28080, 384, 0, 4190176);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hue(this, i, 3);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1548908682);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1548908682, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackWithTextAndAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:139)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new j5n(4);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.j(this, i, 5);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-166415306);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-166415306, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackWithTextNoAnimationSample (FeedAvatarAnimatedStackScreenContent.kt:160)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new sm0(18);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uxb(this, i, 4);
        }
    }

    public final void j(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1780145793);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1780145793, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.SectionHeader (FeedAvatarAnimatedStackScreenContent.kt:127)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, s200.E(txj0.f(hr80.m(q630.a.a, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), 1.0f), 16, 8), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 6, 0, 8188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nz1(this, str, i, 5);
        }
    }
}

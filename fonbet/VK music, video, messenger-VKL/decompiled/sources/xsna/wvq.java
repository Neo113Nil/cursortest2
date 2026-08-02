package xsna;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FeedActionButtonsScreenContent.kt */
/* loaded from: classes18.dex */
public final class wvq implements yah0 {
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        wvq wvqVar;
        androidx.compose.runtime.a M = aVar.M(1326759181);
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
                androidx.compose.runtime.b.f(1326759181, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.Content (FeedActionButtonsScreenContent.kt:49)");
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
            jjn0.a("Action Button", gzsVar, x5Var, gzsVar2, null, null, M, (i2 & 896) | ((i2 << 3) & 112) | 6 | ((i2 << 6) & 7168), 48);
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
            wvqVar = this;
            wvqVar.b(q9g.a(aVar2, 1.0f), M, (i4 >> 12) & 112);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wvqVar = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final wvq wvqVar2 = wvqVar;
            s.d = new wzs() { // from class: xsna.svq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wvq.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1554822925);
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
                androidx.compose.runtime.b.f(1554822925, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ActionButtonsContent (FeedActionButtonsScreenContent.kt:68)");
            }
            c(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fo7(this, q630Var, i, 2);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(263453912);
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
                androidx.compose.runtime.b.f(263453912, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList (FeedActionButtonsScreenContent.kt:73)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new b5h(this, 15);
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
            s.d = new j7c(this, q630Var, i, 1);
        }
    }

    public final void d(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-704983777);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-704983777, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.SectionHeader (FeedActionButtonsScreenContent.kt:111)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, s200.E(q630.a.a, 16, 8), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.d0, aVar2, 6, 0, 8188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new r21(this, str, i, 3);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2013902664);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2013902664, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkActionButtonViewSample (FeedActionButtonsScreenContent.kt:120)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new d37(16);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(aVar2, 1.0f));
            float f = 16;
            f9t.e(txj0.q(aVar2, f), M, 6);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new oc0(21);
                M.R(x2);
            }
            ae2.a(54, 4, M, (izs) x2, null, txj0.f(aVar2, 1.0f));
            f9t.e(txj0.q(aVar2, f), M, 6);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new rvq(0);
                M.R(x3);
            }
            ae2.a(54, 4, M, (izs) x3, null, txj0.f(aVar2, 1.0f));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.r(this, i, 5);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-966791721);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-966791721, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkCompositeActionButtonViewSample (FeedActionButtonsScreenContent.kt:157)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qm(21);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(aVar2, 1.0f));
            f9t.e(txj0.q(aVar2, 16), M, 6);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ot(23);
                M.R(x2);
            }
            ae2.a(54, 4, M, (izs) x2, null, txj0.f(aVar2, 1.0f));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.j(this, i, 4);
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-839978077);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-839978077, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkCompositeActionButtonViewWithDateSample (FeedActionButtonsScreenContent.kt:210)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ol(25);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new om9(this, i, 5);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1465417571);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1465417571, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkFeedActionCellButtonSample (FeedActionButtonsScreenContent.kt:251)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            int i3 = i2 & 14;
            j(i3, M);
            float f = 16;
            f9t.e(txj0.q(aVar2, f), M, 6);
            k(i3, M);
            f9t.e(txj0.q(aVar2, f), M, 6);
            i(i3, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.l(this, i, 8);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void i(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-631755239);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-631755239, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkFeedActionCellButtonSortTitleSample (FeedActionButtonsScreenContent.kt:382)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new gzn(4);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hq5(this, i, 6);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void j(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2083780606);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2083780606, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkFeedActionCellButtonWithIconSample (FeedActionButtonsScreenContent.kt:325)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new ob(25);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cd4(this, i, 7);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1724925646);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1724925646, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.VkFeedActionCellButtonWithoutIconSample (FeedActionButtonsScreenContent.kt:264)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new vsq(1);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(this, i, 6);
        }
    }
}

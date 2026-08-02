package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FeedEnhancedLinkCardScreenContent.kt */
/* loaded from: classes18.dex */
public final class tyq implements yah0 {
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        tyq tyqVar;
        androidx.compose.runtime.a M = aVar.M(-443387977);
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
                androidx.compose.runtime.b.f(-443387977, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.Content (FeedEnhancedLinkCardScreenContent.kt:36)");
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
            jjn0.a("Enhanced Link Card", gzsVar, x5Var, gzsVar2, null, null, M, (i2 & 896) | ((i2 << 3) & 112) | 6 | ((i2 << 6) & 7168), 48);
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
            tyqVar = this;
            tyqVar.b(q9g.a(aVar2, 1.0f), M, (i4 >> 12) & 112);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            tyqVar = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final tyq tyqVar2 = tyqVar;
            s.d = new wzs() { // from class: xsna.oyq
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tyq.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1914542904);
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
                androidx.compose.runtime.b.f(-1914542904, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.Content (FeedEnhancedLinkCardScreenContent.kt:55)");
            }
            i(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pyq(this, q630Var, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(404916533);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(404916533, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardFullSample (FeedEnhancedLinkCardScreenContent.kt:238)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new x90(17);
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
            s.d = new cv4(this, i);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-932806507);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-932806507, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardImageWithActionButtonContrastSample (FeedEnhancedLinkCardScreenContent.kt:149)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new tuq(1);
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
            s.d = new oa5(this, i, 4);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1585836245);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1585836245, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardImageWithActionButtonPrimarySample (FeedEnhancedLinkCardScreenContent.kt:126)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new nyq(0);
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
            s.d = new k87(this, i, 5);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2085302658);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2085302658, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardImageWithBadgeSample (FeedEnhancedLinkCardScreenContent.kt:215)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new rl2(21);
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
            s.d = new f9h(this, i, 5);
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(276333001);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(276333001, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardImageWithDescriptionSample (FeedEnhancedLinkCardScreenContent.kt:172)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new d0k(8);
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
            s.d = new com.vk.movika.sdk.base.ui.q0(this, i, 4);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-314715297);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-314715297, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.EnhancedLinkCardPlaceholderWithActionButtonSample (FeedEnhancedLinkCardScreenContent.kt:194)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new x8m(7);
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
            s.d = new jkg(this, i, 3);
        }
    }

    public final void i(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1212187220);
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
                androidx.compose.runtime.b.f(1212187220, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList (FeedEnhancedLinkCardScreenContent.kt:60)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new j9k(this, 11);
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
            s.d = new sag(this, q630Var, i, 1);
        }
    }

    public final void j(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1138534985);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1138534985, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.SectionHeader (FeedEnhancedLinkCardScreenContent.kt:117)");
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
            s.d = new ne4(this, str, i, 2);
        }
    }
}

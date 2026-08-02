package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CommunityReviewsEmptyStateView.kt */
/* loaded from: classes18.dex */
public final class tyh {
    public static final void a(final q630 q630Var, final String str, final String str2, final boolean z, final boolean z2, final gzs gzsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        lg90 s0;
        int i2;
        int i3;
        y48 y48Var;
        androidx.compose.runtime.a M = aVar.M(-591661929);
        int i4 = i | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.y(gzsVar) ? 131072 : 65536) | (M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-591661929, i4, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.empty.CommunityReviewsEmptyStateView (CommunityReviewsEmptyStateView.kt:37)");
            }
            q630 E = ahn.E(txj0.d(q630Var, 1.0f), "test_tag_view");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (dhr0.M()) {
                M.K(-1450392288);
                qzu0.a.getClass();
                s0 = qzu0.r0(M);
                M.j();
            } else {
                M.K(-1450390079);
                qzu0.a.getClass();
                s0 = qzu0.s0(M);
                M.j();
            }
            q630.a aVar3 = q630.a.a;
            lg90 lg90Var = s0;
            q630 z3 = txj0.z(txj0.f(aVar3, 1.0f), null, 3);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, z3);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 z4 = txj0.z(txj0.f(aVar3, 1.0f), null, 3);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sd4(18);
                M.R(x);
            }
            u8p0 s = ad0.s(lg90Var, 0L, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 62);
            androidx.compose.runtime.a aVar4 = M;
            Object x2 = aVar4.x();
            if (x2 == c0012a) {
                x2 = new z13(10);
                aVar4.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            Object x3 = aVar4.x();
            if (x3 == c0012a) {
                x3 = new od3(20);
                aVar4.R(x3);
            }
            vl20 a3 = zra0.a.a(str, a2, str2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar4, ((i4 >> 3) & 14) | 196608 | (i4 & 896), 8);
            if (z) {
                aVar4.K(936582733);
                String N = d370.N(R.string.community_reviews_add_review, 0, aVar4);
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Object x4 = aVar4.x();
                if (x4 == c0012a) {
                    x4 = new io3(11);
                    aVar4.R(x4);
                }
                i2 = 14;
                i3 = 0;
                r48 a4 = wra0.a.C3954a.a(N, gzsVar, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar4, ((i4 >> 12) & 112) | 28032, 12582912, 65504);
                aVar4 = aVar4;
                y48 a5 = wra0.b.a(a4, null, null, aVar4, 14);
                aVar4.j();
                y48Var = a5;
            } else {
                i2 = 14;
                i3 = 0;
                aVar4.K(-1030152502);
                aVar4.j();
                y48Var = null;
            }
            androidx.compose.runtime.a aVar5 = aVar4;
            ldv0.d(z4, s, a3, y48Var, null, null, false, aVar5, 6, 112);
            M = aVar5;
            if (z2) {
                M.K(-1030089943);
                q630 E2 = ahn.E(aVar3, "test_tag_faq_btn");
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2006929454, i3, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoOutline16> (VkSdkIcons.kt:1288)");
                }
                lg90 a6 = pg90.a(R.drawable.vk_icon_info_outline_16, i3, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, E2, null, false, false, a6, null, null, d370.N(R.string.community_reviews_empty_list_faq, i3, M), null, null, null, null, false, null, null, null, M, ((i4 >> 18) & i2) | 1073769904, 0, 0, 4189664);
                M = M;
            } else {
                M.K(-1033788305);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(str, str2, z, z2, gzsVar, gzsVar2, i) { // from class: xsna.syh
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    tyh.a(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}

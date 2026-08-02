package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.poa;
import xsna.q630;
import xsna.voa;

/* compiled from: PostingWithAuthorView.kt */
/* loaded from: classes4.dex */
public final class xqc0 {
    public static final void a(PostingContentType postingContentType, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-557601471);
        int i2 = (M.J(postingContentType) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-557601471, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.ContentTypeCell (PostingWithAuthorView.kt:303)");
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            lg90 a = pg90.a(postingContentType.a, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar2 = gzsVar;
            wiu0.b(null, false, com.vk.core.compose.component.cell.content.f.a(a, size, ylu0Var.getIcon().a, null, null, M, 196664, 24), Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(postingContentType.b, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), null, gzsVar2, null, M, (i2 << 12) & 458752, 83);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq1(postingContentType, gzsVar2, i, 8);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1588114630);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1588114630, i, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.PostingHeaderSimple (PostingWithAuthorView.kt:285)");
            }
            aVar2 = M;
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.newsfeed_newpost_create_redesigned, 0, M), null, null, null, null, aVar2, 196608, 30), null, null, null, aVar2, 14), ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 7), "posting_with_author_simple_header"), null, null, null, null, null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 100663296, 0, 7932);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a9b(i, 7);
        }
    }

    public static final void c(final PostingAuthorUiModel postingAuthorUiModel, final boolean z, gzs gzsVar, final boolean z2, final String str, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        RichCell$Middle.h.a aVar3;
        int i6;
        final gzs gzsVar3 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(1587904192);
        if ((i & 48) == 0) {
            i2 = (M.J(postingAuthorUiModel) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar2) ? 1048576 : 524288;
        }
        if (M.t(i2 & 1, (599185 & i2) != 599184)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1587904192, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.PostingHeaderWithAuthorSelection (PostingWithAuthorView.kt:226)");
            }
            lg90 l = fwu0.l(null, postingAuthorUiModel.g(), null, null, M, 0, 61);
            boolean z4 = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                if (postingAuthorUiModel instanceof PostingAuthorUiModel.Community) {
                    i3 = R.string.posting_author_source_type_community;
                } else {
                    if (!(postingAuthorUiModel instanceof PostingAuthorUiModel.User)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R.string.posting_author_source_type_profile;
                }
                x = Integer.valueOf(i3);
                M.R(x);
            }
            String N = d370.N(((Number) x).intValue(), 0, M);
            if (!z2 || str == null || drm0.N(str)) {
                i4 = i2;
                z3 = false;
                M.K(485118563);
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    androidx.compose.runtime.b.f(-1518111524, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown20> (VkSdkIcons.kt:748)");
                } else {
                    i5 = -1;
                }
                lg90 b = or.b(M, -54614133, R.drawable.vk_icon_dropdown_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                RichCell$Middle.h.a a = com.vk.core.compose.component.cell.content.o0.a(b, ylu0Var.getIcon().l, M, 12);
                M.j();
                aVar3 = a;
            } else {
                M.K(484770371);
                if (androidx.compose.runtime.b.d()) {
                    i6 = -1;
                    androidx.compose.runtime.b.f(-1518111524, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown20> (VkSdkIcons.kt:748)");
                } else {
                    i6 = -1;
                }
                lg90 b2 = or.b(M, -54614133, R.drawable.vk_icon_dropdown_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z3 = false;
                RichCell$Middle.h.a m6p0Var = new m6p0(b2, ylu0Var2.getIcon().l, str, z, gzsVar2, gzsVar3);
                M.j();
                aVar3 = m6p0Var;
                i4 = i2;
            }
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "posting_with_author_avatar_header");
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(l, null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            gzsVar3 = gzsVar;
            com.vk.core.compose.component.cell.content.b1 a3 = RichCell$Middle.b.a(RichCell$Middle.e.a.a(N, M, 3072), RichCell$Middle.h.b.a(postingAuthorUiModel.f(), null, aVar3, null, M, 196608, 22), null, null, null, null, null, null, null, M, 0, 2041);
            boolean z5 = ((57344 & i4) == 16384 ? true : z3) | ((3670016 & i4) == 1048576 ? true : z3) | ((i4 & 7168) != 2048 ? z3 : true);
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new gzs() { // from class: xsna.vqc0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        if (z2) {
                            gzsVar2.invoke();
                        }
                        gzsVar3.invoke();
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            aVar2 = M;
            ygv0.a(E, a2, a3, null, (gzs) x2, aVar2, 6, 40);
            ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Secondary, txj0.f(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), 1.0f), aVar2, 54, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gzs gzsVar4 = gzsVar3;
            s.d = new wzs() { // from class: xsna.wqc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xqc0.c(PostingAuthorUiModel.this, z, gzsVar4, z2, str, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(794736808);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(794736808, i, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.PostingLoadingContent (PostingWithAuthorView.kt:127)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1, aVar2);
            uzy a2 = poa.a.a(roa.a(Cell$Left.Main.Size.Medium, M), null, M, 2);
            float f = VersionConstants.PRODUCT_MAJOR_VERSION;
            yiu0.a(F, a2, voa.a.a(xoa.a(f, M, 390, 2), xoa.a(80, M, 390, 2), null, null, M, 196608, 28), null, M, 0, 8);
            ijv0.a(SeparatorDpi.At2x, SeparatorAppearance.Secondary, true, txj0.f(aVar2, 1.0f), null, M, 3510, 16);
            M = M;
            f9t.e(txj0.h(aVar2, kqu0.r), M, 0);
            M.K(-1270891780);
            for (int i2 = 0; i2 < 4; i2++) {
                yiu0.a(null, poa.a.a(toa.a(Cell$Left.Main.Size.Medium, M), null, M, 2), voa.a.a(xoa.a(f, M, 390, 2), null, null, Cell$Middle.Size.Large, M, 199680, 22), null, M, 0, 9);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fhi(i);
        }
    }

    public static final void e(vcc0 vcc0Var, boolean z, izs izsVar, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-14673492);
        int i2 = i | (M.J(vcc0Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-14673492, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.PostingWithAuthorContent (PostingWithAuthorView.kt:184)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(rte0.d(s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7), wpu0.b), "posting_with_author_bottom_sheet");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            if (vcc0Var.b()) {
                M.K(1221603094);
                c(vcc0Var.a, z, gzsVar, vcc0Var.d, vcc0Var.e, gzsVar2, M, ((i2 << 3) & 896) | 6 | (i2 & 7168) | ((i2 << 6) & 3670016));
                M.j();
            } else {
                M.K(1222000607);
                b(6, M);
                M.j();
            }
            f9t.e(txj0.h(aVar2, kqu0.r), M, 0);
            M.K(732160821);
            for (PostingContentType postingContentType : vcc0Var.c) {
                postingContentType.getClass();
                M.K(-378241239);
                boolean J = ((i2 & 896) == 256) | M.J(postingContentType);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new ew3(19, izsVar, postingContentType);
                    M.R(x);
                }
                a(postingContentType, (gzs) x, M, 0);
                M.j();
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uqc0(vcc0Var, z, izsVar, gzsVar, gzsVar2, i);
        }
    }
}

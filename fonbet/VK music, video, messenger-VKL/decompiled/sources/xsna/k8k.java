package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.g9k;
import xsna.q630;
import xsna.ty6;

/* compiled from: CreateMarketItemReviewContentView.kt */
/* loaded from: classes18.dex */
public final class k8k {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        androidx.compose.runtime.a M = aVar.M(1439972534);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1439972534, i3, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.Avatar (CreateMarketItemReviewContentView.kt:286)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 6;
            q630 d = rte0.d(txj0.q(aVar2, 72), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            str2 = str;
            fwu0.c(r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f)), str2, null, null, null, null, null, nei.a, M, ((i3 << 3) & 112) | 100663296, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(str2, q630Var, i, 3);
        }
    }

    public static final void b(izs izsVar, x9k x9kVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(5184528);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(x9kVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(5184528, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateAdvantagesInputField (CreateMarketItemReviewContentView.kt:178)");
            }
            int i4 = (i2 >> 3) & 14;
            boolean h = h(x9kVar, i4);
            Object obj = (vvr) M.r(uvi.i);
            String N = d370.N(R.string.product_review_advantages_hint, 0, M);
            String N2 = d370.N(R.string.product_review_advantages_title, 0, M);
            rgy rgyVar = new rgy(0, 6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            boolean y = M.y(obj);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (y || x == obj2) {
                x = new ha(obj, 27);
                M.R(x);
            }
            uey ueyVar = new uey(null, (izs) x, null, 59);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == obj2) {
                x2 = new b8k(izsVar, 0);
                M.R(x2);
            }
            aig0.a(x9kVar, N2, "prosInputField", aVar2, N, 2, 0, (izs) x2, ueyVar, rgyVar, h, M, 1576320 | i4 | ((i2 << 6) & 57344), 128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c8k(izsVar, x9kVar, i);
        }
    }

    public static final void c(izs izsVar, x9k x9kVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(406779251);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(x9kVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(406779251, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateCommentInputField (CreateMarketItemReviewContentView.kt:228)");
            }
            Object obj = (nek0) M.r(uvi.q);
            Object obj2 = (vvr) M.r(uvi.i);
            int i4 = (i2 >> 3) & 14;
            boolean h = h(x9kVar, i4);
            String N = d370.N(R.string.product_review_comment_hint, 0, M);
            String N2 = d370.N(R.string.product_review_comment_title, 0, M);
            boolean J = M.J(obj) | M.y(obj2);
            Object x = M.x();
            Object obj3 = a.C0011a.a;
            if (J || x == obj3) {
                x = new z5a(6, obj, obj2);
                M.R(x);
            }
            uey ueyVar = new uey((izs) x, null, null, 62);
            rgy rgyVar = new rgy(0, 7, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == obj3) {
                x2 = new d8k(izsVar, 0);
                M.R(x2);
            }
            aig0.a(x9kVar, N2, "commentInputField", aVar2, N, 2, 0, (izs) x2, ueyVar, rgyVar, h, M, ((i2 << 6) & 57344) | 1576320 | i4, 128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uq8(izsVar, x9kVar, i);
        }
    }

    public static final void d(izs izsVar, x9k x9kVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2079352138);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(x9kVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2079352138, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateDisadvantagesInputField (CreateMarketItemReviewContentView.kt:201)");
            }
            Object obj = (vvr) M.r(uvi.i);
            int i4 = (i2 >> 3) & 14;
            boolean h = h(x9kVar, i4);
            String N = d370.N(R.string.product_review_disadvantages_hint, 0, M);
            String N2 = d370.N(R.string.product_review_disadvantages_title, 0, M);
            rgy rgyVar = new rgy(0, 6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            boolean y = M.y(obj);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (y || x == obj2) {
                x = new x2e(obj, 5);
                M.R(x);
            }
            uey ueyVar = new uey(null, (izs) x, null, 59);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == obj2) {
                x2 = new d74(izsVar, 4);
                M.R(x2);
            }
            aig0.a(x9kVar, N2, "consInputField", aVar2, N, 2, 0, (izs) x2, ueyVar, rgyVar, h, M, ((i2 << 6) & 57344) | 1576320 | i4, 128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e8k(izsVar, x9kVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, androidx.compose.runtime.a aVar, g9k.a aVar2, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(-1568634347);
        int i2 = i | (M.J(aVar2) ? 4 : 2) | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1568634347, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewContentView (CreateMarketItemReviewContentView.kt:60)");
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            vvr vvrVar = (vvr) M.r(uvi.i);
            wh50 d = jk50.d(aVar2.a, "", M, 48);
            wh50 d2 = jk50.d(aVar2.c, "", M, 48);
            wh50 d3 = jk50.d(aVar2.b, "", M, 48);
            wh50 d4 = jk50.d(aVar2.l, 0, M, 48);
            wh50 d5 = jk50.d(aVar2.j, new wow(EmptyList.b), M, 0);
            wh50 d6 = jk50.d(aVar2.k, 0, M, 48);
            yzt0<Boolean> yzt0Var = aVar2.i;
            Boolean bool = Boolean.FALSE;
            wh50 d7 = jk50.d(yzt0Var, bool, M, 48);
            wh50 d8 = jk50.d(aVar2.h, bool, M, 48);
            wh50 d9 = jk50.d(aVar2.g, bool, M, 48);
            q630.a aVar3 = q630.a.a;
            q630 d10 = txj0.d(aVar3, 1.0f);
            boolean J = M.J(nek0Var) | M.y(vvrVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                wh50Var = d;
                x = new com.vk.movika.sdk.base.flow.binding.l(7, nek0Var, vvrVar);
                M.R(x);
            } else {
                wh50Var = d;
            }
            q630 J2 = xa4.J(d10, false, (gzs) x);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, J2);
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
            float f = 12;
            q630 a2 = q9g.a(s200.H(p490.D(aVar3, p490.x(M), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5), 1.0f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, a2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f2 = 16;
            g((String) wh50Var.getValue(), (String) d2.getValue(), (String) d3.getValue(), s200.H(aVar3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), M, 3072);
            f9t.e(txj0.h(aVar3, 14), M, 6);
            String N = d370.N(R.string.create_product_review_rating_title, 0, M);
            int intValue = ((Number) d4.getValue()).intValue();
            q630 H = s200.H(aVar3, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new v77(izsVar, 2);
                M.R(x2);
            }
            bak.a(N, intValue, H, (izs) x2, M, 3456);
            f9t.e(txj0.h(aVar3, f), M, 6);
            f(((i2 >> 3) & 112) | (i2 & 14), M, aVar2, izsVar, null);
            f9t.e(txj0.h(aVar3, f), M, 6);
            int intValue2 = ((Number) d6.getValue()).intValue();
            List<T> list = ((wow) d5.getValue()).b;
            String N2 = d370.N(R.string.market_item_create_review_image_picker_add_image_title, 0, M);
            r9g r9gVar = r9g.a;
            q630 H2 = s200.H(r9gVar.b(aVar3, aVar4), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String N3 = d370.N(R.string.community_review_image_picker_add_image_description, 0, M);
            boolean z2 = i3 == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new g74(izsVar, 2);
                M.R(x3);
            }
            ijw.b(intValue2, H2, list, N2, N3, (izs) x3, M, Tensorflow.FRAME_WIDTH);
            M.G();
            boolean booleanValue = ((Boolean) d7.getValue()).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b = r9gVar.b(hr80.m(aVar3, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), dt1.a.o);
            ty6 ty6Var = dt1.a.i;
            mm2.b(r9gVar, booleanValue, b, anp.c(ty6Var, 13).b(anp.e(null, 3)), anp.j(ty6Var, 13).b(anp.f(null, 3)), null, kai.c(-1303066653, new f8k(izsVar, d9, d8), M), M, 1600518, 16);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g8k(i, 0, aVar2, q630Var2, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(int i, androidx.compose.runtime.a aVar, g9k.a aVar2, izs izsVar, q630 q630Var) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1929593882);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1929593882, i3, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.InputFieldsBlock (CreateMarketItemReviewContentView.kt:149)");
            }
            wh50 c = jk50.c(aVar2.e, M);
            wh50 c2 = jk50.c(aVar2.f, M);
            wh50 c3 = jk50.c(aVar2.d, M);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c4 = qri.c(M, aVar3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c4, cri.a.d);
            int i4 = ((i3 >> 3) & 14) | 384;
            b(izsVar, (x9k) c.getValue(), M, i4);
            d(izsVar, (x9k) c2.getValue(), M, i4);
            c(izsVar, (x9k) c3.getValue(), M, i4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j8k(aVar2, izsVar, q630Var2, i, 0);
        }
    }

    public static final void g(String str, String str2, String str3, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(524242510);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(524242510, i2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.ProductInfo (CreateMarketItemReviewContentView.kt:257)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            a(str, null, M, i2 & 14);
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, 12), M, 6);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(str2, ahn.E(aVar3, "productName"), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).p1, M, ((i2 >> 3) & 14) | 48, 0, 8184);
            f9t.e(txj0.h(aVar3, 3), M, 6);
            yqv0.c(str3, ahn.E(aVar3, "producerName"), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).w0, M, ((i2 >> 6) & 14) | 48, 0, 8184);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i8k(str, str2, str3, q630Var, i);
        }
    }

    public static final boolean h(x9k x9kVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-705744636, i, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.isCounterVisible (CreateMarketItemReviewContentView.kt:221)");
        }
        boolean z = drm0.p0(x9kVar.a).toString().length() > 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z;
    }
}

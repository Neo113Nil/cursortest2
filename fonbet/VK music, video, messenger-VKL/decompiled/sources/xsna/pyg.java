package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.hzg;
import xsna.q630;
import xsna.ty6;

/* compiled from: CommunityCreateReviewContentView.kt */
/* loaded from: classes18.dex */
public final class pyg {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar, hzg.a aVar2, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2004860884);
        int i2 = (M.J(aVar2) ? 4 : 2) | i | 48 | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2004860884, i2, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewContentView (CommunityCreateReviewContentView.kt:46)");
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            vvr vvrVar = (vvr) M.r(uvi.i);
            wh50 d = jk50.d(aVar2.f, new wow(EmptyList.b), M, 0);
            wh50 d2 = jk50.d(aVar2.e, 0, M, 48);
            wh50 d3 = jk50.d(aVar2.g, 0, M, 48);
            yzt0<Boolean> yzt0Var = aVar2.c;
            Boolean bool = Boolean.FALSE;
            wh50 d4 = jk50.d(yzt0Var, bool, M, 48);
            wh50 d5 = jk50.d(aVar2.b, bool, M, 48);
            boolean J = M.J(nek0Var) | M.y(vvrVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new mk(4, nek0Var, vvrVar);
                M.R(x);
            }
            q630.a aVar4 = q630.a.a;
            q630 D = p490.D(xa4.J(aVar4, false, (gzs) x), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            f9t.e(txj0.h(aVar4, 18), M, 6);
            float f = 16;
            q630 H = s200.H(aVar4, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String N = d370.N(R.string.community_reviews_rating_view_title, 0, M);
            int intValue = ((Number) d3.getValue()).intValue();
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new lyg(izsVar, 0);
                M.R(x2);
            }
            bak.a(N, intValue, H, (izs) x2, M, 3456);
            f9t.e(txj0.h(aVar4, 10), M, 6);
            b((i2 & 14) | ((i2 >> 3) & 112), M, aVar2, izsVar, null);
            f9t.e(txj0.h(aVar4, 4), M, 6);
            int intValue2 = ((Number) d2.getValue()).intValue();
            List<T> list = ((wow) d.getValue()).b;
            String N2 = d370.N(R.string.community_review_image_picker_add_image_title, 0, M);
            r9g r9gVar = r9g.a;
            q630 H2 = s200.H(r9gVar.b(aVar4, aVar5), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String N3 = d370.N(R.string.community_review_image_picker_add_image_description, 0, M);
            boolean z2 = i3 == 256;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new vs(izsVar, 25);
                M.R(x3);
            }
            ijw.b(intValue2, H2, list, N2, N3, (izs) x3, M, Tensorflow.FRAME_WIDTH);
            if (a690.d(aVar4, 24, M, 6)) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 b = r9gVar.b(hr80.m(aVar4, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), dt1.a.o);
            ty6 ty6Var = dt1.a.i;
            mm2.b(r9gVar, true, b, anp.c(ty6Var, 13).b(anp.e(null, 3)), anp.j(ty6Var, 13).b(anp.f(null, 3)), null, kai.c(-1172221626, new myg(izsVar, d5, d4), M), M, 1600566, 16);
            aVar3 = M;
            aVar3.G();
            q630Var2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar4;
            }
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new l8c(aVar2, q630Var2, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, androidx.compose.runtime.a aVar, hzg.a aVar2, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(578450518);
        if ((i & 6) == 0) {
            i2 = i | (M.J(aVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(578450518, i3, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.InputFieldBlock (CommunityCreateReviewContentView.kt:119)");
            }
            vvr vvrVar = (vvr) M.r(uvi.i);
            wh50 c = jk50.c(aVar2.a, M);
            boolean z = drm0.p0(((x9k) c.getValue()).a).toString().length() > 0;
            x9k x9kVar = (x9k) c.getValue();
            String N = d370.N(R.string.community_review_hint, 0, M);
            String N2 = d370.N(R.string.community_reviews_input_title, 0, M);
            rgy rgyVar = rgy.e;
            boolean y = M.y(vvrVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new nvg(vvrVar, 1);
                M.R(x);
            }
            uey ueyVar = new uey(null, (izs) x, null, 59);
            boolean z2 = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new oyg(izsVar, 0);
                M.R(x2);
            }
            q630.a aVar4 = q630.a.a;
            aVar3 = M;
            aig0.a(x9kVar, N2, "commentInputField", aVar4, N, 4, 4, (izs) x2, ueyVar, rgyVar, z, aVar3, 14183808, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new zx9(i, 2, (Object) aVar2, izsVar, q630Var2);
        }
    }
}

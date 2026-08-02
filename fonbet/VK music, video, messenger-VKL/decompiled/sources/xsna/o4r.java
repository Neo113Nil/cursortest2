package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FeedSearchFiltersBottomSheet.kt */
/* loaded from: classes5.dex */
public final class o4r extends ath0 {
    public final wh50<VkFeedSearchParams> j1;
    public final cd10 k1;

    /* compiled from: FeedSearchFiltersBottomSheet.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((o4r) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public o4r(wh50 wh50Var, cd10 cd10Var, tas tasVar) {
        super(tasVar);
        this.j1 = wh50Var;
        this.k1 = cd10Var;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(2102176603);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2102176603, 8, -1, "com.vk.search.params.impl.presentation.modal.FeedSearchFiltersBottomSheet.ThemedContent (FeedSearchFiltersBottomSheet.kt:30)");
        }
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, ath0.i1);
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a2, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        String N = d370.N(R.string.vk_discover_search_params_title, 0, aVar);
        boolean z = !((VkFeedSearchParams) ((zak0) this.j1).getValue()).I();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            a aVar3 = new a(0, this, o4r.class, "dismiss", "dismiss()V", 0);
            aVar.R(aVar3);
            x = aVar3;
        }
        gzs gzsVar = (gzs) ((fcy) x);
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new r5i(this, 14);
            aVar.R(x2);
        }
        wsh0.c(0, aVar, N, gzsVar, (gzs) x2, null, z);
        fo(8, aVar);
        eo(8, aVar);
        String N2 = d370.N(R.string.vk_discover_search_show_result, 0, aVar);
        boolean y3 = aVar.y(this);
        Object x3 = aVar.x();
        if (y3 || x3 == c0012a) {
            x3 = new ocg(this, 18);
            aVar.R(x3);
        }
        wsh0.a(N2, (gzs) x3, aVar, 0);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void eo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1104060686);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1104060686, i2, -1, "com.vk.search.params.impl.presentation.modal.FeedSearchFiltersBottomSheet.RemoveDuplicatesCheckbox (FeedSearchFiltersBottomSheet.kt:76)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(aVar3, 18, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 4);
            String N = d370.N(R.string.feed_catalog_filters_other, 0, M);
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
            yqv0.c(N, H, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 1, aVar3);
            String N2 = d370.N(R.string.feed_catalog_filters_remove_duplicates, 0, M);
            boolean z = ((VkFeedSearchParams) ((zak0) this.j1).getValue()).c;
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new y3i(this, 8);
                M.R(x);
            }
            eku0.d(N2, (gzs) x, F, z, null, false, false, M, 384, 112);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hq5(this, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fo(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-928060859);
        int i3 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-928060859, i3, -1, "com.vk.search.params.impl.presentation.modal.FeedSearchFiltersBottomSheet.SortType (FeedSearchFiltersBottomSheet.kt:52)");
            }
            q630 H = s200.H(q630.a.a, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 6);
            String N = d370.N(R.string.discover_search_sort, 0, M);
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
            yqv0.c(N, H, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
            M = M;
            rci0 d = qci0.d(62, d370.N(R.string.feed_catalog_filters_sort_relevance, 0, M), null);
            zak0 zak0Var = (zak0) this.j1;
            boolean z = ((VkFeedSearchParams) zak0Var.getValue()).b == VkFeedSearchParams.SortType.RELEVANT;
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                i2 = 0;
                i2f i2fVar = new i2f(0, this, o4r.class, "toggleSortType", "toggleSortType()V", 0, 3);
                M.R(i2fVar);
                x = i2fVar;
            } else {
                i2 = 0;
            }
            int i4 = i2;
            afv0.c(z, d, (gzs) ((fcy) x), null, false, M, 0, 56);
            rci0 d2 = qci0.d(62, d370.N(R.string.feed_catalog_filters_sort_date, i4, M), null);
            boolean z2 = ((VkFeedSearchParams) zak0Var.getValue()).b == VkFeedSearchParams.SortType.DATE ? 1 : i4;
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                q83 q83Var = new q83(0, this, o4r.class, "toggleSortType", "toggleSortType()V", 0, 3);
                M.R(q83Var);
                x2 = q83Var;
            }
            afv0.c(z2, d2, (gzs) ((fcy) x2), null, false, M, 0, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(this, i, 7);
        }
    }
}

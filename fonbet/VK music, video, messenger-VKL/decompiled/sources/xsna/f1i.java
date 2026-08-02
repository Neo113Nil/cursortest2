package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: CommunitySearchFiltersBottomSheet.kt */
/* loaded from: classes5.dex */
public final class f1i extends ath0 {
    public final wh50<VkGroupsSearchParams> j1;
    public final dam k1;
    public final kld0 l1;
    public final zrp m1;
    public final zrp n1;
    public final dwh0 o1;

    /* compiled from: CommunitySearchFiltersBottomSheet.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((f1i) this.receiver).dismiss();
            return s3q0.a;
        }
    }

    public f1i(wh50 wh50Var, dam damVar, tas tasVar, kld0 kld0Var) {
        super(tasVar);
        this.j1 = wh50Var;
        this.k1 = damVar;
        this.l1 = kld0Var;
        this.m1 = VkGroupsSearchParams.SortType.h();
        this.n1 = VkGroupsSearchParams.CommunityType.h();
        this.o1 = new dwh0();
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(945294685);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(945294685, 8, -1, "com.vk.search.params.impl.presentation.modal.CommunitySearchFiltersBottomSheet.ThemedContent (CommunitySearchFiltersBottomSheet.kt:44)");
        }
        q630 E = ahn.E(ath0.i1, "search_filters_container");
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, E);
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
        zak0 zak0Var = (zak0) this.j1;
        boolean z = !((VkGroupsSearchParams) zak0Var.getValue()).I();
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            a aVar3 = new a(0, this, f1i.class, "dismiss", "dismiss()V", 0);
            aVar.R(aVar3);
            x = aVar3;
        }
        gzs gzsVar = (gzs) ((fcy) x);
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new defpackage.j(this, 29);
            aVar.R(x2);
        }
        wsh0.c(0, aVar, N, gzsVar, (gzs) x2, null, z);
        ho(8, aVar);
        fo(8, aVar);
        eo(8, aVar);
        if (((VkGroupsSearchParams) zak0Var.getValue()).c == VkGroupsSearchParams.CommunityType.EVENT) {
            aVar.K(-795583793);
            go(8, aVar);
        } else {
            aVar.K(-798446085);
        }
        aVar.j();
        String N2 = d370.N(R.string.vk_discover_search_show_result, 0, aVar);
        boolean y3 = aVar.y(this);
        Object x3 = aVar.x();
        if (y3 || x3 == c0012a) {
            x3 = new ac(this, 25);
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
        String str;
        androidx.compose.runtime.a M = aVar.M(-1526475412);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1526475412, i2, -1, "com.vk.search.params.impl.presentation.modal.CommunitySearchFiltersBottomSheet.CityField (CommunitySearchFiltersBottomSheet.kt:101)");
            }
            zak0 zak0Var = (zak0) this.j1;
            SearchLocation searchLocation = ((VkGroupsSearchParams) zak0Var.getValue()).f;
            if (searchLocation == null) {
                City city = ((VkGroupsSearchParams) zak0Var.getValue()).b;
                if (city == null || (str = city.c) == null) {
                    str = "";
                }
            } else if (searchLocation instanceof SearchLocation.City) {
                str = ((SearchLocation.City) searchLocation).b.c;
            } else {
                if (!(searchLocation instanceof SearchLocation.CurrentLocation)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((SearchLocation.CurrentLocation) searchLocation).b;
            }
            hly a2 = h8s.a.a(d370.N(R.string.vk_discover_search_city, 0, M), false, null, null, null, M, 196608, 30);
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new defpackage.k(this, 24);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            String N = d370.N(R.string.vk_discover_search_choose_a_city, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u2x a3 = g8s.b.a.a(s2x.b.a.a(str, gzsVar, N, ylu0Var.getText().m, null, null, M, 805306368, 496), null, false, null, M, 24576, 14);
            M = M;
            nvu0.a(a3, ahn.E(q630.a.a, "community_search_filters_location_select"), a2, null, null, M, 48, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gd4(this, i, 3);
        }
    }

    public final void fo(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1021592456);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1021592456, i2, -1, "com.vk.search.params.impl.presentation.modal.CommunitySearchFiltersBottomSheet.CommunityType (CommunitySearchFiltersBottomSheet.kt:87)");
            }
            String N = d370.N(R.string.discover_search_community_type, 0, M);
            String string = getResources().getString(((VkGroupsSearchParams) ((zak0) this.j1).getValue()).c.j());
            q630 E = ahn.E(q630.a.a, "community_search_filters_type_select");
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new wcg(this, 4);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new o85(this, 4);
                M.R(x2);
            }
            wsh0.d(N, this.n1, izsVar, (wzs) x2, E, string, "", false, null, M, 1597440, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ah7(this, i, 1);
        }
    }

    public final void go(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1526492816);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1526492816, i2, -1, "com.vk.search.params.impl.presentation.modal.CommunitySearchFiltersBottomSheet.OnlyFuture (CommunitySearchFiltersBottomSheet.kt:127)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 1, q630.a.a);
            String N = d370.N(R.string.discover_search_only_future, 0, M);
            boolean z = ((VkGroupsSearchParams) ((zak0) this.j1).getValue()).e;
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new p3h(this, 4);
                M.R(x);
            }
            eku0.d(N, (gzs) x, F, z, null, false, false, M, 384, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new id4(this, i, 3);
        }
    }

    public final void ho(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1383059513);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1383059513, i2, -1, "com.vk.search.params.impl.presentation.modal.CommunitySearchFiltersBottomSheet.SortType (CommunitySearchFiltersBottomSheet.kt:73)");
            }
            String N = d370.N(R.string.discover_search_sort, 0, M);
            String string = getResources().getString(((VkGroupsSearchParams) ((zak0) this.j1).getValue()).d.j());
            q630 E = ahn.E(q630.a.a, "community_search_filters_sort_by_select");
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new yad(this, 14);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new yg7(this, 5);
                M.R(x2);
            }
            wsh0.d(N, this.m1, izsVar, (wzs) x2, E, string, "", false, null, M, 1597440, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg7(this, i, 3);
        }
    }
}

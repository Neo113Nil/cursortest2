package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.view.GestureDetector;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.search.integration.followers.api.FollowersSearchQueryViewType;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.search.ui.api.SearchQuery;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b9q0;
import xsna.gm50;
import xsna.gth0;
import xsna.rth0;
import xsna.vrh0;
import xsna.vvh0;

/* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class jth0 implements eth0, w8i, gm50 {
    public final UserId b;
    public final FollowersSearchQueryViewType c;
    public final FragmentImpl d;
    public final kss e;
    public final Object f;
    public final nth0 g;
    public final Object h;
    public final vvh0<SearchFollowersCatalogRootVh> i;
    public View j;
    public VkSearchView k;
    public boolean l;

    /* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
    public final class a implements vrh0 {
        public final emg b;

        public a(emg emgVar) {
            this.b = emgVar;
        }

        @Override // xsna.vrh0
        public final void P1(String str) {
            this.b.P1(null);
        }

        @Override // xsna.vrh0
        public final void a(vrh0.a aVar) {
            this.b.a(aVar);
        }

        @Override // xsna.vrh0
        public final boolean b() {
            return this.b.b();
        }

        @Override // xsna.vrh0
        public final void d(boolean z) {
            this.b.d(z);
        }

        @Override // xsna.vrh0
        public final void d0() {
            this.b.d0();
        }

        @Override // xsna.vrh0
        public final void e(boolean z) {
            this.b.e(z);
        }

        @Override // xsna.vrh0
        public final void f(boolean z) {
            this.b.f(z);
        }

        @Override // xsna.vrh0
        public final void g(SearchQuery searchQuery) {
            this.b.g(searchQuery);
            jth0.this.g.C(new gth0.c(searchQuery.b));
        }

        @Override // xsna.vrh0
        public final SearchQuery i() {
            return this.b.i();
        }

        @Override // xsna.vrh0
        public final void k() {
            this.b.k();
        }
    }

    /* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
    public static final class b {
        public final boolean a;
        public final VkSearchView b;
        public boolean c;

        public b(boolean z, VkSearchView vkSearchView) {
            this.a = z;
            this.b = vkSearchView;
        }
    }

    /* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<rth0, s3q0> {
        /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(rth0 rth0Var) {
            rth0 rth0Var2 = rth0Var;
            jth0 jth0Var = (jth0) this.receiver;
            jth0Var.getClass();
            if (epx.f(rth0Var2, rth0.a.a)) {
                ((zqh0) jth0Var.f.getValue()).e(new SearchQuery("", null, null, null, 14, null), b9q0.a.a);
            } else {
                if (!epx.f(rth0Var2, rth0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                jth0Var.l = true;
                FragmentActivity activity = jth0Var.d.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                jth0Var.l = false;
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<f5z> {
        @Override // xsna.gzs
        public final f5z invoke() {
            return ((FragmentImpl) this.receiver).getViewLifecycleOwner();
        }
    }

    public jth0(UserId userId, FollowersSearchQueryViewType followersSearchQueryViewType, FragmentImpl fragmentImpl, kss kssVar) {
        this.b = userId;
        this.c = followersSearchQueryViewType;
        this.d = fragmentImpl;
        this.e = kssVar;
        jz70 jz70Var = new jz70(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, jz70Var);
        this.g = new nth0(new qth0(new sth0(0)));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new nm60(this, 18));
        this.h = a2;
        this.i = new vvh0<>((SearchFollowersCatalogRootVh) a2.getValue(), new t98(fragmentImpl));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eth0
    public final void a(UserId userId) {
        UIBlockProfile uIBlockProfile = ((SearchFollowersCatalogRootVh) this.h.getValue()).z.d.get(userId);
        if (uIBlockProfile == null) {
            return;
        }
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.SendMessage), false, null, 28);
    }

    @Override // xsna.eth0
    public final boolean a0() {
        if (this.l || !this.d.getViewLifecycleOwner().getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
            return false;
        }
        this.g.C(gth0.a.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eth0
    public final void b(fth0 fth0Var) {
        SearchFollowersCatalogRootVh searchFollowersCatalogRootVh = (SearchFollowersCatalogRootVh) this.h.getValue();
        FragmentImpl fragmentImpl = this.d;
        View k5 = searchFollowersCatalogRootVh.k5(fragmentImpl.getLayoutInflater(), null, null);
        new lth0(this, jth0.class, "searchResultView", "getSearchResultView()Landroid/view/View;", 0).set(k5);
        dhr0.a.e0(R.attr.vk_ui_background_content, k5);
        Context requireContext = fragmentImpl.requireContext();
        VkSearchView vkSearchView = new VkSearchView(requireContext, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(requireContext, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        new kth0(this, jth0.class, "searchQueryView", "getSearchQueryView()Lcom/vk/core/view/components/search/VkSearchView;", 0).set(vkSearchView);
        vkSearchView.X4(false);
        vkSearchView.getEditView().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.hth0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                jth0.this.g.C(new gth0.b(z));
            }
        });
        vkSearchView.getEditView().setOnEditorActionListener(new ith0());
        vkSearchView.setOnBackClickListener(new uq50(this, 26));
        vkSearchView.getEditView().setOnTouchListener(new bin(new GestureDetector(fragmentImpl.requireContext(), new mth0(vkSearchView, this)), 1));
        ((zqh0) this.f.getValue()).f(new a(new emg(vkSearchView)), fragmentImpl.getViewLifecycleOwner());
        b bVar = new b(this.c == FollowersSearchQueryViewType.IN_TOOLBAR, vkSearchView);
        fth0Var.b(k5, vkSearchView);
        nth0 nth0Var = this.g;
        gm50.a.b(this, ((tth0) nth0Var.c.g()).a, new yd6(this, fth0Var, bVar, 5));
        nth0Var.f.a(new c(1, this, jth0.class, "handleFeatureSideEffect", "handleFeatureSideEffect(Lcom/vk/search/integration/followers/impl/domain/feature/SearchFollowersIntegrationSideEffect;)V", 0), fragmentImpl.getViewLifecycleOwner());
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d.getViewLifecycleOwner();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eth0
    public final void onConfigurationChanged(Configuration configuration) {
        ((SearchFollowersCatalogRootVh) this.h.getValue()).onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eth0
    public final void onDestroyView() {
        this.j = null;
        this.k = null;
        ((zqh0) this.f.getValue()).e(new SearchQuery("", null, null, null, 14, null), b9q0.a.a);
        ((SearchFollowersCatalogRootVh) this.h.getValue()).L();
    }

    @Override // xsna.eth0
    public final void onPause() {
        vvh0<SearchFollowersCatalogRootVh> vvh0Var = this.i;
        vvh0Var.a(vvh0.a.a(vvh0Var.d, false, false, 2));
    }

    @Override // xsna.eth0
    public final void onResume() {
        vvh0<SearchFollowersCatalogRootVh> vvh0Var = this.i;
        vvh0Var.a(vvh0.a.a(vvh0Var.d, true, false, 2));
    }

    @Override // xsna.eth0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.i.e;
        if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }
}

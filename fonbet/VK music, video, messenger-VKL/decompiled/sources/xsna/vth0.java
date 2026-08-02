package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFriendFriendsCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.search.integration.friends.api.SearchFriendsDelegate$ViewCallback$SearchState;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SearchFriendsDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class vth0 implements uth0, w8i {
    public final UserId b;
    public final FragmentImpl c;
    public SearchFriendFriendsCatalogRootVh d;
    public View e;
    public VkSearchView f;
    public bts g;
    public final a h = new a();
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new b1z(this, 24));

    /* compiled from: SearchFriendsDelegateImpl.kt */
    public final class a {
        public boolean a = true;
        public SearchFriendsDelegate$ViewCallback$SearchState b = SearchFriendsDelegate$ViewCallback$SearchState.EXPANDED;

        public a() {
        }

        public final void a() {
            vth0 vth0Var = vth0.this;
            bts btsVar = vth0Var.g;
            if (btsVar != null) {
                SearchFriendsDelegate$ViewCallback$SearchState searchFriendsDelegate$ViewCallback$SearchState = this.b;
                FrameLayout frameLayout = btsVar.a;
                boolean z = searchFriendsDelegate$ViewCallback$SearchState == SearchFriendsDelegate$ViewCallback$SearchState.ACTIVE;
                frameLayout.setVisibility(z ? 0 : 8);
                if (z && frameLayout.getChildCount() == 0) {
                    frameLayout.addView(btsVar.c);
                } else if (!z) {
                    frameLayout.removeView(btsVar.c);
                }
            }
            View view = vth0Var.e;
            if (view != null) {
                bwt0.p0(view, this.b == SearchFriendsDelegate$ViewCallback$SearchState.ACTIVE);
            }
        }
    }

    public vth0(UserId userId, FragmentImpl fragmentImpl) {
        this.b = userId;
        this.c = fragmentImpl;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uth0
    public final void a(bts btsVar) {
        this.g = btsVar;
        FragmentImpl fragmentImpl = this.c;
        Bundle arguments = fragmentImpl.getArguments();
        FragmentActivity kn = fragmentImpl.kn();
        o5a o5aVar = new o5a(fragmentImpl);
        ?? r6 = this.i;
        SearchFriendFriendsCatalogRootVh searchFriendFriendsCatalogRootVh = new SearchFriendFriendsCatalogRootVh(this.b, arguments, kn, o5aVar, (zqh0) r6.getValue(), new wxt(fragmentImpl, 3));
        new nnc0(this, vth0.class, "searchResultViewHolder", "getSearchResultViewHolder()Lcom/vk/catalog2/common/ui/mvp/holder/search/SearchFriendFriendsCatalogRootVh;", 0).set(searchFriendFriendsCatalogRootVh);
        View X = searchFriendFriendsCatalogRootVh.X(fragmentImpl.getLayoutInflater(), null, null);
        new xth0(this, vth0.class, "searchResultView", "getSearchResultView()Landroid/view/View;", 0).set(X);
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.e0(R.attr.vk_ui_background_content, X);
        Context requireContext = fragmentImpl.requireContext();
        VkSearchView vkSearchView = new VkSearchView(requireContext, null, 6, 0);
        vkSearchView.setVoiceActionDelegate(new nrl(requireContext, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
        new p620(0, this, vth0.class, "searchQueryView", "getSearchQueryView()Lcom/vk/core/view/components/search/VkSearchView;", 1).set(vkSearchView);
        vkSearchView.X4(false);
        emg emgVar = new emg(vkSearchView);
        emgVar.e(false);
        ((zqh0) r6.getValue()).f(new wth0(emgVar, this), fragmentImpl.getViewLifecycleOwner());
        a aVar = this.h;
        aVar.b = aVar.a ? SearchFriendsDelegate$ViewCallback$SearchState.EXPANDED : SearchFriendsDelegate$ViewCallback$SearchState.ACTIVE;
        aVar.a();
        ats atsVar = btsVar.f;
        zss zssVar = btsVar.e;
        ViewGroup viewGroup = btsVar.b;
        btsVar.c = X;
        VkSearchView vkSearchView2 = btsVar.d;
        if (vkSearchView2 != null) {
            vkSearchView2.removeOnLayoutChangeListener(zssVar);
            vkSearchView2.removeOnAttachStateChangeListener(atsVar);
            if (btsVar.d == vkSearchView2) {
                btsVar.d = null;
            }
        }
        btsVar.d = vkSearchView;
        dhr0Var.e0(R.attr.vk_ui_header_background, vkSearchView);
        int a2 = e3m.a(R.dimen.post_side_padding, vkSearchView.getContext()) - vkSearchView.getSelfMargin();
        BaseVkSearchView.d5(vkSearchView, a2, a2, 10);
        viewGroup.setVisibility(0);
        viewGroup.addView(vkSearchView);
        vkSearchView.addOnLayoutChangeListener(zssVar);
        vkSearchView.addOnAttachStateChangeListener(atsVar);
        aVar.a();
    }

    @Override // xsna.uth0
    public final void onDestroyView() {
        SearchFriendFriendsCatalogRootVh searchFriendFriendsCatalogRootVh = this.d;
        if (searchFriendFriendsCatalogRootVh != null) {
            searchFriendFriendsCatalogRootVh.L();
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        a aVar = this.h;
        aVar.a = true;
        aVar.b = SearchFriendsDelegate$ViewCallback$SearchState.EXPANDED;
        aVar.a();
    }

    @Override // xsna.uth0
    public final void onPause() {
        SearchFriendFriendsCatalogRootVh searchFriendFriendsCatalogRootVh = this.d;
        if (searchFriendFriendsCatalogRootVh != null) {
            searchFriendFriendsCatalogRootVh.K();
        }
    }

    @Override // xsna.uth0
    public final void onResume() {
        SearchFriendFriendsCatalogRootVh searchFriendFriendsCatalogRootVh = this.d;
        if (searchFriendFriendsCatalogRootVh != null) {
            searchFriendFriendsCatalogRootVh.M();
        }
    }
}

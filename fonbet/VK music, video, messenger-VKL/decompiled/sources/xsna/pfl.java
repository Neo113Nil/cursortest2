package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.integration.followers.api.FollowersSearchState;
import com.vkontakte.android.R;

/* compiled from: HistoryWorker.kt */
/* loaded from: classes13.dex */
public final class pfl implements fth0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public pfl(View view) {
        this.a = view;
        this.b = (FrameLayout) view.findViewById(R.id.search_feature_overlay_container);
        this.c = (ViewGroup) view.findViewById(R.id.search_query_view_container);
    }

    @Override // xsna.fth0
    public void a(FollowersSearchState followersSearchState) {
        FrameLayout frameLayout = (FrameLayout) this.b;
        boolean z = followersSearchState == FollowersSearchState.ACTIVE_QUERY;
        if (z && frameLayout.getChildCount() == 0) {
            frameLayout.addView((View) this.d);
        } else {
            if (z) {
                return;
            }
            frameLayout.removeView((View) this.d);
        }
    }

    @Override // xsna.fth0
    public void b(View view, VkSearchView vkSearchView) {
        this.d = view;
        dhr0.a.e0(R.attr.vk_ui_header_background, vkSearchView);
        int a = e3m.a(R.dimen.post_side_padding, vkSearchView.getContext()) - vkSearchView.getSelfMargin();
        BaseVkSearchView.d5(vkSearchView, a, a, 10);
        ((ViewGroup) this.c).addView(vkSearchView);
    }

    public io.reactivex.rxjava3.internal.operators.single.n c(io.reactivex.rxjava3.core.w wVar, gzs gzsVar) {
        return new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.v(new km9(gzsVar, 2)).q(wVar).m((io.reactivex.rxjava3.core.w) this.a), new pf1(new fm0(this, 28), 13));
    }

    public pfl(io.reactivex.rxjava3.core.w wVar) {
        this.a = wVar;
        asu0 asu0Var = asu0.a;
        this.b = asu0Var.A(1, "msg-history-loader-load");
        this.c = asu0Var.A(1, "msg-history-loader-update");
        this.d = new io.reactivex.rxjava3.disposables.b();
    }
}

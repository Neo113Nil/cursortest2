package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.AppBarShadowView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vkontakte.android.R;

/* compiled from: FriendsAndFollowersTabViewBinding.kt */
/* loaded from: classes15.dex */
public final class pls {
    public final CustomSwipeRefreshLayout a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final AppBarShadowView g;
    public final TextView h;
    public final View i;
    public final RecyclerView j;

    public pls(View view) {
        this.a = (CustomSwipeRefreshLayout) view.findViewById(R.id.content_state_container);
        this.b = (ViewGroup) view.findViewById(R.id.loading_state_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.error_state_container);
        this.c = viewGroup;
        this.d = (ViewGroup) view.findViewById(R.id.unavailable_state_container);
        this.e = (ViewGroup) view.findViewById(R.id.empty_state_container);
        this.f = (ViewGroup) view.findViewById(R.id.search_query_view_container);
        this.g = (AppBarShadowView) view.findViewById(R.id.shadow);
        this.h = (TextView) viewGroup.findViewById(R.id.error_text);
        this.i = viewGroup.findViewById(R.id.error_retry);
        this.j = (RecyclerView) view.findViewById(R.id.friends_and_followers_list_recycler);
    }
}

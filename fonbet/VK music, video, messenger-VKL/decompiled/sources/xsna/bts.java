package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;

/* compiled from: FriendsSearchDelegateCallbackImpl.kt */
/* loaded from: classes15.dex */
public final class bts {
    public final FrameLayout a;
    public final ViewGroup b;
    public View c;
    public VkSearchView d;
    public final zss e = new zss();
    public final ats f = new ats(this);

    public bts(View view, int i) {
        this.a = (FrameLayout) view.findViewById(R.id.search_feature_overlay_container);
        this.b = (ViewGroup) view.findViewById(R.id.search_query_view_container);
    }
}

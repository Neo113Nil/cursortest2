package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vkontakte.android.R;

/* compiled from: FriendsCleanupViewBinding.kt */
/* loaded from: classes15.dex */
public final class xns {
    public final CustomSwipeRefreshLayout a;
    public final ViewGroup b;
    public final VkPlaceholder c;
    public final VkPlaceholder d;
    public final RecyclerView e;
    public final VkTopBar f;

    public xns(View view) {
        this.a = (CustomSwipeRefreshLayout) view.findViewById(R.id.content_state_container);
        this.b = (ViewGroup) view.findViewById(R.id.loading_state_container);
        this.c = (VkPlaceholder) view.findViewById(R.id.error_state_placeholder);
        this.d = (VkPlaceholder) view.findViewById(R.id.empty_state_placeholder);
        this.e = (RecyclerView) view.findViewById(R.id.friends_cleanup_recycler);
        this.f = (VkTopBar) view.findViewById(R.id.toolbar);
    }
}

package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;

/* compiled from: SkeletonDiscoverGridAdapterV2.kt */
/* loaded from: classes4.dex */
public final class iyj0 extends zoj0<jyj0, RecyclerView.e0> {
    public final ThemableShimmer e;

    public iyj0(ThemableShimmer themableShimmer) {
        this.e = themableShimmer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        kyj0 kyj0Var = new kyj0(viewGroup, R.layout.skeleton_discover_grid_item_v2, 0);
        VkSkeleton vkSkeleton = (VkSkeleton) kyj0Var.itemView;
        vkSkeleton.setShimmer(this.e);
        vkSkeleton.setArea(new a.C0863a(viewGroup));
        vkSkeleton.setShimmerManagedExternally(true);
        kyj0Var.itemView.getContext();
        return kyj0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }
}

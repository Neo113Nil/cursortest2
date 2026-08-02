package xsna;

import android.view.View;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;

/* compiled from: UserProfileContentTabsLoadViewHolder.kt */
/* loaded from: classes5.dex */
public final class znq0 extends aq6<UserProfileAdapterItem.k> {
    public final ShimmerFrameLayout n;

    public znq0(View view) {
        super(view);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.content_tabs_skeleton_shimmer);
        this.n = shimmerFrameLayout;
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.itemView.post(new xw1(this, 18));
    }
}

package xsna;

import android.widget.FrameLayout;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import com.vk.video.ui.discovery.minimizable.playlist.collapsed.views.VideoTabletRelatedVideosCollapsedContainerView;
import com.vkontakte.android.R;

/* compiled from: TabletContentContainerViewBinding.kt */
/* loaded from: classes7.dex */
public final class txn0 {
    public final RecyclerPaginatedView a;
    public final VkSubnavigationBar b;
    public final D2DOnboardingView c;
    public final VideoTabletRelatedVideosCollapsedContainerView d;

    public txn0(FrameLayout frameLayout) {
        this.a = (RecyclerPaginatedView) frameLayout.findViewById(R.id.tabletRecommendationsRecyclerView);
        this.b = (VkSubnavigationBar) frameLayout.findViewById(R.id.catalogTabletTabs);
        this.c = (D2DOnboardingView) frameLayout.findViewById(R.id.catalogTabletTabsOnboarding);
        this.d = (VideoTabletRelatedVideosCollapsedContainerView) frameLayout.findViewById(R.id.tabletCollapsedPlaylistContainer);
    }
}

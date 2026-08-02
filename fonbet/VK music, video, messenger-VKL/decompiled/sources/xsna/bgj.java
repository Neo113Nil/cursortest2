package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import com.vk.video.ui.discovery.minimizable.playlist.collapsed.views.VideoRelatedVideosCollapsedContainerView;
import com.vkontakte.android.R;

/* compiled from: ContentContainerViewBinging.kt */
/* loaded from: classes7.dex */
public final class bgj {
    public final FrameLayout a;
    public final VideoRelatedVideosCollapsedContainerView b;
    public final ViewGroup c;
    public final VkSubnavigationBar d;
    public final D2DOnboardingView e;
    public final RecyclerPaginatedView f;

    public bgj(FrameLayout frameLayout) {
        this.a = frameLayout;
        this.b = (VideoRelatedVideosCollapsedContainerView) frameLayout.findViewById(R.id.collapsedPlaylistContainer);
        this.c = (ViewGroup) frameLayout.findViewById(R.id.videoLiveContent);
        this.d = (VkSubnavigationBar) frameLayout.findViewById(R.id.catalogTabs);
        this.e = (D2DOnboardingView) frameLayout.findViewById(R.id.catalogTabsOnboarding);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) frameLayout.findViewById(R.id.relatedVideoItemsRecyclerView);
        this.f = recyclerPaginatedView;
        recyclerPaginatedView.getRecyclerView().setTag("ABOUT_VIDEO_RECYCLER_TAG");
    }
}
